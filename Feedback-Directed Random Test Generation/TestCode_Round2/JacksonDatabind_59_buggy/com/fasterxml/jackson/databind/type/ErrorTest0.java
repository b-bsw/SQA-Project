package com.fasterxml.jackson.databind.type;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean29 = simpleType28.isCollectionLikeType();
        java.lang.Class<?> wildcardClass30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType28);
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionLikeType27.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        boolean boolean28 = collectionLikeType7.isCollectionLikeType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        boolean boolean29 = simpleType28.isContainerType();
        boolean boolean30 = simpleType28.isFinal();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings31 = null;
        com.fasterxml.jackson.databind.JavaType javaType32 = typeFactory9.constructType((java.lang.reflect.Type) simpleType28, typeBindings31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        java.lang.Object obj28 = collectionLikeType7.getContentTypeHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        int int28 = collectionLikeType7.containedTypeCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        java.lang.Object obj28 = collectionLikeType27.getContentValueHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.JavaType javaType9 = collectionLikeType7.withContentTypeHandler((java.lang.Object) (-1.0f));
        com.fasterxml.jackson.databind.JavaType javaType10 = javaType9.getKeyType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType9", collectionLikeType7.equals(javaType9) ? collectionLikeType7.hashCode() == javaType9.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray28 = typeFactory9._modifiers;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.JavaType javaType9 = collectionLikeType7.withContentTypeHandler((java.lang.Object) (-1.0f));
        boolean boolean10 = collectionLikeType7.isEnumType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType9", collectionLikeType7.equals(javaType9) ? collectionLikeType7.hashCode() == javaType9.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        boolean boolean28 = collectionLikeType27.isThrowable();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        boolean boolean28 = collectionLikeType27.useStaticType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.JavaType javaType9 = collectionLikeType7.withContentTypeHandler((java.lang.Object) (-1.0f));
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7.containedType((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType9", collectionLikeType7.equals(javaType9) ? collectionLikeType7.hashCode() == javaType9.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        java.lang.Class<?> wildcardClass28 = collectionLikeType7.getRawClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = collectionLikeType7.withStaticTyping();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = collectionLikeType17.withTypeHandler((java.lang.Object) "java.lang.Enum");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType17", collectionLikeType7.equals(collectionLikeType17) ? collectionLikeType7.hashCode() == collectionLikeType17.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType12.getSuperClass();
        java.lang.String str15 = simpleType12.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType12.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType12.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType12);
        java.lang.Object obj19 = collectionLikeType18.getContentTypeHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType18", collectionLikeType7.equals(collectionLikeType18) ? collectionLikeType7.hashCode() == collectionLikeType18.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.JavaType javaType12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        boolean boolean13 = javaType12.isPrimitive();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType14 = collectionLikeType7.withContentTypeHandler((java.lang.Object) boolean13);
        com.fasterxml.jackson.databind.JavaType javaType15 = collectionLikeType7._elementType;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType14", collectionLikeType7.equals(collectionLikeType14) ? collectionLikeType7.hashCode() == collectionLikeType14.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType12.getSuperClass();
        java.lang.String str15 = simpleType12.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType12.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType12.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType12);
        java.lang.Object obj19 = collectionLikeType18.getContentValueHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType18", collectionLikeType7.equals(collectionLikeType18) ? collectionLikeType7.hashCode() == collectionLikeType18.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = collectionLikeType7.withStaticTyping();
        com.fasterxml.jackson.databind.JavaType javaType18 = collectionLikeType17.getContentType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType17", collectionLikeType7.equals(collectionLikeType17) ? collectionLikeType7.hashCode() == collectionLikeType17.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.JavaType javaType9 = collectionLikeType7.withContentTypeHandler((java.lang.Object) (-1.0f));
        int int10 = collectionLikeType7.containedTypeCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType9", collectionLikeType7.equals(javaType9) ? collectionLikeType7.hashCode() == javaType9.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.JavaType javaType12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        boolean boolean13 = javaType12.isPrimitive();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType14 = collectionLikeType7.withContentTypeHandler((java.lang.Object) boolean13);
        com.fasterxml.jackson.databind.JavaType javaType15 = collectionLikeType7.withStaticTyping();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType14", collectionLikeType7.equals(collectionLikeType14) ? collectionLikeType7.hashCode() == collectionLikeType14.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory9.withModifier(typeModifier28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        boolean boolean28 = collectionLikeType7.isPrimitive();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType12.getSuperClass();
        java.lang.String str15 = simpleType12.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType12.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType12.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType12);
        com.fasterxml.jackson.databind.JavaType javaType19 = collectionLikeType18.getSuperClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType18", collectionLikeType7.equals(collectionLikeType18) ? collectionLikeType7.hashCode() == collectionLikeType18.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType12.getSuperClass();
        java.lang.String str15 = simpleType12.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType12.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType12.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType12);
        java.lang.String str19 = collectionLikeType7.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType18", collectionLikeType7.equals(collectionLikeType18) ? collectionLikeType7.hashCode() == collectionLikeType18.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType12.getSuperClass();
        java.lang.String str15 = simpleType12.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType12.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType12.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType12);
        java.lang.String str19 = collectionLikeType7.buildCanonicalName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType18", collectionLikeType7.equals(collectionLikeType18) ? collectionLikeType7.hashCode() == collectionLikeType18.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        typeFactory9.clearCache();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory17.constructType((java.lang.reflect.Type) simpleType22, typeBindings26);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType30 = simpleType29.getSuperClass();
        java.lang.String str32 = simpleType29.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType33 = simpleType29.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType34 = simpleType29.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType35 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType29);
        boolean boolean36 = collectionLikeType35.isCollectionLikeType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType35", collectionLikeType7.equals(collectionLikeType35) ? collectionLikeType7.hashCode() == collectionLikeType35.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType11 = simpleType9.withValueHandler((java.lang.Object) '#');
        java.lang.String str12 = javaType11.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean14 = simpleType13.isAbstract();
        boolean boolean15 = simpleType13.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType11, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        boolean boolean17 = collectionLikeType16.hasHandlers();
        boolean boolean18 = collectionLikeType16.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean20 = simpleType19.isCollectionLikeType();
        boolean boolean21 = simpleType19.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType23 = simpleType22.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType26 = simpleType24.withValueHandler((java.lang.Object) '#');
        java.lang.String str27 = javaType26.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean29 = simpleType28.isAbstract();
        boolean boolean30 = simpleType28.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType31 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType26, (com.fasterxml.jackson.databind.JavaType) simpleType28);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType32 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType19, javaType23, javaType26);
        java.lang.Object obj33 = mapLikeType32.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType34 = mapLikeType32._valueType;
        com.fasterxml.jackson.databind.JavaType javaType35 = collectionLikeType16.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType32);
        boolean boolean36 = collectionLikeType16.isFinal();
        java.lang.String str37 = collectionLikeType16.toString();
        com.fasterxml.jackson.databind.JavaType javaType38 = collectionLikeType7.withTypeHandler((java.lang.Object) collectionLikeType16);
        java.lang.String str39 = collectionLikeType7.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType38", collectionLikeType7.equals(javaType38) ? collectionLikeType7.hashCode() == javaType38.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType11 = simpleType9.withValueHandler((java.lang.Object) '#');
        java.lang.String str12 = javaType11.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean14 = simpleType13.isAbstract();
        boolean boolean15 = simpleType13.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType11, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        boolean boolean17 = collectionLikeType16.hasHandlers();
        boolean boolean18 = collectionLikeType16.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean20 = simpleType19.isCollectionLikeType();
        boolean boolean21 = simpleType19.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType23 = simpleType22.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType26 = simpleType24.withValueHandler((java.lang.Object) '#');
        java.lang.String str27 = javaType26.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean29 = simpleType28.isAbstract();
        boolean boolean30 = simpleType28.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType31 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType26, (com.fasterxml.jackson.databind.JavaType) simpleType28);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType32 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType19, javaType23, javaType26);
        java.lang.Object obj33 = mapLikeType32.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType34 = mapLikeType32._valueType;
        com.fasterxml.jackson.databind.JavaType javaType35 = collectionLikeType16.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType32);
        boolean boolean36 = collectionLikeType16.isFinal();
        java.lang.String str37 = collectionLikeType16.toString();
        com.fasterxml.jackson.databind.JavaType javaType38 = collectionLikeType7.withTypeHandler((java.lang.Object) collectionLikeType16);
        boolean boolean39 = collectionLikeType16.hasContentType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType38", collectionLikeType7.equals(javaType38) ? collectionLikeType7.hashCode() == javaType38.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType11 = simpleType9.withValueHandler((java.lang.Object) '#');
        java.lang.String str12 = javaType11.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean14 = simpleType13.isAbstract();
        boolean boolean15 = simpleType13.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType11, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        boolean boolean17 = collectionLikeType16.hasHandlers();
        boolean boolean18 = collectionLikeType16.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean20 = simpleType19.isCollectionLikeType();
        boolean boolean21 = simpleType19.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType23 = simpleType22.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType26 = simpleType24.withValueHandler((java.lang.Object) '#');
        java.lang.String str27 = javaType26.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean29 = simpleType28.isAbstract();
        boolean boolean30 = simpleType28.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType31 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType26, (com.fasterxml.jackson.databind.JavaType) simpleType28);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType32 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType19, javaType23, javaType26);
        java.lang.Object obj33 = mapLikeType32.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType34 = mapLikeType32._valueType;
        com.fasterxml.jackson.databind.JavaType javaType35 = collectionLikeType16.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType32);
        boolean boolean36 = collectionLikeType16.isFinal();
        java.lang.String str37 = collectionLikeType16.toString();
        com.fasterxml.jackson.databind.JavaType javaType38 = collectionLikeType7.withTypeHandler((java.lang.Object) collectionLikeType16);
        boolean boolean39 = collectionLikeType7.isTrueCollectionType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType38", collectionLikeType7.equals(javaType38) ? collectionLikeType7.hashCode() == javaType38.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType11 = simpleType9.withValueHandler((java.lang.Object) '#');
        java.lang.String str12 = javaType11.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean14 = simpleType13.isAbstract();
        boolean boolean15 = simpleType13.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType11, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        boolean boolean17 = collectionLikeType16.hasHandlers();
        boolean boolean18 = collectionLikeType16.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean20 = simpleType19.isCollectionLikeType();
        boolean boolean21 = simpleType19.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType23 = simpleType22.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType26 = simpleType24.withValueHandler((java.lang.Object) '#');
        java.lang.String str27 = javaType26.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean29 = simpleType28.isAbstract();
        boolean boolean30 = simpleType28.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType31 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType26, (com.fasterxml.jackson.databind.JavaType) simpleType28);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType32 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType19, javaType23, javaType26);
        java.lang.Object obj33 = mapLikeType32.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType34 = mapLikeType32._valueType;
        com.fasterxml.jackson.databind.JavaType javaType35 = collectionLikeType16.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType32);
        boolean boolean36 = collectionLikeType16.isFinal();
        java.lang.String str37 = collectionLikeType16.toString();
        com.fasterxml.jackson.databind.JavaType javaType38 = collectionLikeType7.withTypeHandler((java.lang.Object) collectionLikeType16);
        boolean boolean39 = collectionLikeType16.hasHandlers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType38", collectionLikeType7.equals(javaType38) ? collectionLikeType7.hashCode() == javaType38.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType29.getContentType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType32 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType34 = simpleType32.withValueHandler((java.lang.Object) '#');
        java.lang.String str35 = javaType34.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean37 = simpleType36.isAbstract();
        boolean boolean38 = simpleType36.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType39 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType34, (com.fasterxml.jackson.databind.JavaType) simpleType36);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings40 = null;
        com.fasterxml.jackson.databind.JavaType javaType41 = typeFactory31.constructType((java.lang.reflect.Type) simpleType36, typeBindings40);
        com.fasterxml.jackson.databind.type.ClassStack classStack42 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType43 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean44 = simpleType43.isCollectionLikeType();
        boolean boolean45 = simpleType43.isAbstract();
        boolean boolean46 = simpleType43.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings47 = null;
        com.fasterxml.jackson.databind.JavaType javaType48 = typeFactory31._fromAny(classStack42, (java.lang.reflect.Type) simpleType43, typeBindings47);
        com.fasterxml.jackson.databind.type.TypeParser typeParser49 = typeFactory31._parser;
        com.fasterxml.jackson.databind.JavaType javaType50 = collectionLikeType29.withValueHandler((java.lang.Object) typeParser49);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType51 = collectionLikeType29.withStaticTyping();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and javaType50", collectionLikeType29.equals(javaType50) ? collectionLikeType29.hashCode() == javaType50.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = collectionLikeType7.withStaticTyping();
        boolean boolean18 = collectionLikeType17.isFinal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType17", collectionLikeType7.equals(collectionLikeType17) ? collectionLikeType7.hashCode() == collectionLikeType17.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory17.constructType((java.lang.reflect.Type) simpleType22, typeBindings26);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType22);
        boolean boolean29 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType7.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType32 = collectionLikeType7.withValueHandler((java.lang.Object) simpleType31);
        com.fasterxml.jackson.databind.type.SimpleType simpleType33 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean34 = simpleType33.isCollectionLikeType();
        boolean boolean35 = simpleType33.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType37 = simpleType36.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType40 = simpleType38.withValueHandler((java.lang.Object) '#');
        java.lang.String str41 = javaType40.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType42 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean43 = simpleType42.isAbstract();
        boolean boolean44 = simpleType42.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType45 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType40, (com.fasterxml.jackson.databind.JavaType) simpleType42);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType46 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType33, javaType37, javaType40);
        com.fasterxml.jackson.databind.JavaType javaType47 = javaType40.getContentType();
        boolean boolean48 = javaType40.isAbstract();
        com.fasterxml.jackson.databind.JavaType javaType49 = collectionLikeType32.withContentType(javaType40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType32", collectionLikeType7.equals(collectionLikeType32) ? collectionLikeType7.hashCode() == collectionLikeType32.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory17.constructType((java.lang.reflect.Type) simpleType22, typeBindings26);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType22);
        boolean boolean29 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType7.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType32 = collectionLikeType7.withValueHandler((java.lang.Object) simpleType31);
        java.lang.Comparable<java.lang.String> strComparable33 = collectionLikeType7.getValueHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType32", collectionLikeType7.equals(collectionLikeType32) ? collectionLikeType7.hashCode() == collectionLikeType32.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.JavaType javaType9 = collectionLikeType7.withContentTypeHandler((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass10 = collectionLikeType7.getParameterSource();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType9", collectionLikeType7.equals(javaType9) ? collectionLikeType7.hashCode() == javaType9.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        java.lang.String str10 = collectionLikeType7.toCanonical();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = collectionLikeType7.getBindings();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean13 = simpleType12.isCollectionLikeType();
        boolean boolean14 = simpleType12.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType15.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType19 = simpleType17.withValueHandler((java.lang.Object) '#');
        java.lang.String str20 = javaType19.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean22 = simpleType21.isAbstract();
        boolean boolean23 = simpleType21.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType19, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType25 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType12, javaType16, javaType19);
        com.fasterxml.jackson.databind.JavaType javaType26 = mapLikeType25.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType27 = mapLikeType25.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType28 = collectionLikeType7.withValueHandler((java.lang.Object) javaType27);
        boolean boolean29 = collectionLikeType28.isArrayType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType28", collectionLikeType7.equals(collectionLikeType28) ? collectionLikeType7.hashCode() == collectionLikeType28.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory17.constructType((java.lang.reflect.Type) simpleType22, typeBindings26);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType22);
        boolean boolean29 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType32 = simpleType30.withValueHandler((java.lang.Object) '#');
        java.lang.String str33 = javaType32.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean35 = simpleType34.isAbstract();
        boolean boolean36 = simpleType34.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType37 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType32, (com.fasterxml.jackson.databind.JavaType) simpleType34);
        boolean boolean38 = collectionLikeType37.hasHandlers();
        boolean boolean39 = collectionLikeType37.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean41 = simpleType40.isCollectionLikeType();
        boolean boolean42 = simpleType40.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType43 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType44 = simpleType43.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType45 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType47 = simpleType45.withValueHandler((java.lang.Object) '#');
        java.lang.String str48 = javaType47.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType49 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean50 = simpleType49.isAbstract();
        boolean boolean51 = simpleType49.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType52 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType47, (com.fasterxml.jackson.databind.JavaType) simpleType49);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType53 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType40, javaType44, javaType47);
        java.lang.Object obj54 = mapLikeType53.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType55 = mapLikeType53._valueType;
        com.fasterxml.jackson.databind.JavaType javaType56 = collectionLikeType37.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType53);
        boolean boolean57 = collectionLikeType37.isFinal();
        com.fasterxml.jackson.databind.JavaType javaType58 = collectionLikeType37.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType59 = collectionLikeType7.withValueHandler((java.lang.Object) javaType58);
        java.lang.String str60 = collectionLikeType59.buildCanonicalName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType59", collectionLikeType7.equals(collectionLikeType59) ? collectionLikeType7.hashCode() == collectionLikeType59.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.hasHandlers();
        boolean boolean12 = collectionLikeType7.isContainerType();
        java.lang.Object obj13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = collectionLikeType7.withTypeHandler(obj13);
        boolean boolean15 = collectionLikeType7.isThrowable();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType14", collectionLikeType7.equals(javaType14) ? collectionLikeType7.hashCode() == javaType14.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7.withStaticTyping();
        java.lang.Object obj12 = collectionLikeType7.getContentValueHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType11", collectionLikeType7.equals(javaType11) ? collectionLikeType7.hashCode() == javaType11.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.hasHandlers();
        boolean boolean12 = collectionLikeType7.isTrueCollectionType();
        java.lang.String str13 = collectionLikeType7.toString();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType15.withValueHandler((java.lang.Object) '#');
        java.lang.String str18 = javaType17.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean20 = simpleType19.isAbstract();
        boolean boolean21 = simpleType19.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType17, (com.fasterxml.jackson.databind.JavaType) simpleType19);
        boolean boolean23 = collectionLikeType22.hasHandlers();
        int int24 = collectionLikeType22.containedTypeCount();
        boolean boolean25 = collectionLikeType22.isTrueCollectionType();
        boolean boolean26 = collectionLikeType22.isReferenceType();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        boolean boolean28 = javaType27.isInterface();
        int int29 = javaType27.containedTypeCount();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType30 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType22, javaType27);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType31 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType14, (com.fasterxml.jackson.databind.JavaType) collectionLikeType22);
        java.lang.Object obj32 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType33 = collectionLikeType22.withTypeHandler(obj32);
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        boolean boolean35 = simpleType34.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType36 = collectionLikeType33.withContentTypeHandler((java.lang.Object) simpleType34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType33", collectionLikeType7.equals(collectionLikeType33) ? collectionLikeType7.hashCode() == collectionLikeType33.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.JavaType javaType12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        boolean boolean13 = javaType12.isPrimitive();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType14 = collectionLikeType7.withContentTypeHandler((java.lang.Object) boolean13);
        java.lang.String str15 = collectionLikeType14.getErasedSignature();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType14", collectionLikeType7.equals(collectionLikeType14) ? collectionLikeType7.hashCode() == collectionLikeType14.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        java.lang.String str30 = collectionLikeType29.toString();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean32 = simpleType31.isCollectionLikeType();
        boolean boolean33 = simpleType31.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType35 = simpleType34.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType38 = simpleType36.withValueHandler((java.lang.Object) '#');
        java.lang.String str39 = javaType38.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean41 = simpleType40.isAbstract();
        boolean boolean42 = simpleType40.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType43 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType38, (com.fasterxml.jackson.databind.JavaType) simpleType40);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType44 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType31, javaType35, javaType38);
        com.fasterxml.jackson.databind.JavaType javaType45 = mapLikeType44.getContentType();
        boolean boolean46 = collectionLikeType29.equals((java.lang.Object) mapLikeType44);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap47);
        java.lang.Class<?> wildcardClass50 = typeFactory48._findPrimitive("");
        typeFactory48.clearCache();
        java.lang.Class<?> wildcardClass53 = typeFactory48._findPrimitive("Ljava/lang/Enum;");
        com.fasterxml.jackson.databind.type.TypeParser typeParser54 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser55 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType56 = collectionLikeType29.withValueHandler((java.lang.Object) typeFactory48);
        com.fasterxml.jackson.databind.type.SimpleType simpleType57 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        boolean boolean58 = collectionLikeType29.equals((java.lang.Object) simpleType57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType56", collectionLikeType29.equals(collectionLikeType56) ? collectionLikeType29.hashCode() == collectionLikeType56.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType9 = collectionLikeType7.withStaticTyping();
        com.fasterxml.jackson.databind.JavaType javaType10 = collectionLikeType9._elementType;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType9", collectionLikeType7.equals(collectionLikeType9) ? collectionLikeType7.hashCode() == collectionLikeType9.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType11 = simpleType9.withValueHandler((java.lang.Object) '#');
        java.lang.String str12 = javaType11.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean14 = simpleType13.isAbstract();
        boolean boolean15 = simpleType13.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType11, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        boolean boolean17 = collectionLikeType16.hasHandlers();
        boolean boolean18 = collectionLikeType16.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean20 = simpleType19.isCollectionLikeType();
        boolean boolean21 = simpleType19.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType23 = simpleType22.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType26 = simpleType24.withValueHandler((java.lang.Object) '#');
        java.lang.String str27 = javaType26.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean29 = simpleType28.isAbstract();
        boolean boolean30 = simpleType28.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType31 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType26, (com.fasterxml.jackson.databind.JavaType) simpleType28);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType32 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType19, javaType23, javaType26);
        java.lang.Object obj33 = mapLikeType32.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType34 = mapLikeType32._valueType;
        com.fasterxml.jackson.databind.JavaType javaType35 = collectionLikeType16.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType32);
        boolean boolean36 = collectionLikeType16.isFinal();
        java.lang.String str37 = collectionLikeType16.toString();
        com.fasterxml.jackson.databind.JavaType javaType38 = collectionLikeType7.withTypeHandler((java.lang.Object) collectionLikeType16);
        java.lang.Class<?> wildcardClass39 = javaType38.getRawClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType38", collectionLikeType7.equals(javaType38) ? collectionLikeType7.hashCode() == javaType38.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.hasHandlers();
        boolean boolean12 = collectionLikeType7.isContainerType();
        java.lang.Object obj13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = collectionLikeType7.withTypeHandler(obj13);
        boolean boolean15 = collectionLikeType7.isContainerType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType14", collectionLikeType7.equals(javaType14) ? collectionLikeType7.hashCode() == javaType14.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType15.hasHandlers();
        boolean boolean17 = collectionLikeType15.hasHandlers();
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean19 = simpleType18.isArrayType();
        java.lang.Class<?> wildcardClass20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType18);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType21 = collectionLikeType15.withValueHandler((java.lang.Object) wildcardClass20);
        boolean boolean22 = collectionLikeType15.isConcrete();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType21", collectionLikeType7.equals(collectionLikeType21) ? collectionLikeType7.hashCode() == collectionLikeType21.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.JavaType javaType9 = collectionLikeType7.withContentTypeHandler((java.lang.Object) (-1.0f));
        com.fasterxml.jackson.databind.JavaType javaType10 = collectionLikeType7.getSuperClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType9", collectionLikeType7.equals(javaType9) ? collectionLikeType7.hashCode() == javaType9.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        java.lang.String str30 = collectionLikeType29.toString();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean32 = simpleType31.isCollectionLikeType();
        boolean boolean33 = simpleType31.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType35 = simpleType34.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType38 = simpleType36.withValueHandler((java.lang.Object) '#');
        java.lang.String str39 = javaType38.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean41 = simpleType40.isAbstract();
        boolean boolean42 = simpleType40.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType43 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType38, (com.fasterxml.jackson.databind.JavaType) simpleType40);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType44 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType31, javaType35, javaType38);
        com.fasterxml.jackson.databind.JavaType javaType45 = mapLikeType44.getContentType();
        boolean boolean46 = collectionLikeType29.equals((java.lang.Object) mapLikeType44);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap47);
        java.lang.Class<?> wildcardClass50 = typeFactory48._findPrimitive("");
        typeFactory48.clearCache();
        java.lang.Class<?> wildcardClass53 = typeFactory48._findPrimitive("Ljava/lang/Enum;");
        com.fasterxml.jackson.databind.type.TypeParser typeParser54 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser55 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType56 = collectionLikeType29.withValueHandler((java.lang.Object) typeFactory48);
        java.lang.String str58 = collectionLikeType56.containedTypeName((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType56", collectionLikeType29.equals(collectionLikeType56) ? collectionLikeType29.hashCode() == collectionLikeType56.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory17.constructType((java.lang.reflect.Type) simpleType22, typeBindings26);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType30 = simpleType29.getSuperClass();
        java.lang.String str32 = simpleType29.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType33 = simpleType29.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType34 = simpleType29.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType35 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType29);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType36 = collectionLikeType35.withStaticTyping();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType35", collectionLikeType7.equals(collectionLikeType35) ? collectionLikeType7.hashCode() == collectionLikeType35.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType9 = collectionLikeType7.withStaticTyping();
        boolean boolean10 = collectionLikeType9.hasHandlers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType9", collectionLikeType7.equals(collectionLikeType9) ? collectionLikeType7.hashCode() == collectionLikeType9.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType7.withStaticTyping();
        java.lang.Class<?> wildcardClass31 = collectionLikeType7.getRawClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType30", collectionLikeType7.equals(javaType30) ? collectionLikeType7.hashCode() == javaType30.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.JavaType javaType9 = collectionLikeType7.withContentTypeHandler((java.lang.Object) (-1.0f));
        boolean boolean10 = collectionLikeType7.isThrowable();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType9", collectionLikeType7.equals(javaType9) ? collectionLikeType7.hashCode() == javaType9.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        java.lang.String str30 = collectionLikeType29.toString();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean32 = simpleType31.isCollectionLikeType();
        boolean boolean33 = simpleType31.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType35 = simpleType34.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType38 = simpleType36.withValueHandler((java.lang.Object) '#');
        java.lang.String str39 = javaType38.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean41 = simpleType40.isAbstract();
        boolean boolean42 = simpleType40.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType43 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType38, (com.fasterxml.jackson.databind.JavaType) simpleType40);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType44 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType31, javaType35, javaType38);
        com.fasterxml.jackson.databind.JavaType javaType45 = mapLikeType44.getContentType();
        boolean boolean46 = collectionLikeType29.equals((java.lang.Object) mapLikeType44);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap47);
        java.lang.Class<?> wildcardClass50 = typeFactory48._findPrimitive("");
        typeFactory48.clearCache();
        java.lang.Class<?> wildcardClass53 = typeFactory48._findPrimitive("Ljava/lang/Enum;");
        com.fasterxml.jackson.databind.type.TypeParser typeParser54 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser55 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType56 = collectionLikeType29.withValueHandler((java.lang.Object) typeFactory48);
        java.lang.Object obj57 = collectionLikeType56.getContentValueHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType56", collectionLikeType29.equals(collectionLikeType56) ? collectionLikeType29.hashCode() == collectionLikeType56.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType7._elementType;
        boolean boolean31 = collectionLikeType7.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType32 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        boolean boolean33 = simpleType32.isContainerType();
        boolean boolean34 = simpleType32.isFinal();
        java.lang.Object obj35 = simpleType32.getContentValueHandler();
        boolean boolean36 = simpleType32.isArrayType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean39 = simpleType38.isCollectionLikeType();
        boolean boolean40 = simpleType38.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType41 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType42 = simpleType41.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType43 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType45 = simpleType43.withValueHandler((java.lang.Object) '#');
        java.lang.String str46 = javaType45.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean48 = simpleType47.isAbstract();
        boolean boolean49 = simpleType47.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType50 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType45, (com.fasterxml.jackson.databind.JavaType) simpleType47);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType51 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType38, javaType42, javaType45);
        java.lang.Object obj52 = mapLikeType51.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType53 = mapLikeType51._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings54 = null;
        com.fasterxml.jackson.databind.JavaType javaType55 = typeFactory37.constructType((java.lang.reflect.Type) mapLikeType51, typeBindings54);
        com.fasterxml.jackson.databind.type.SimpleType simpleType56 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean57 = simpleType56.isAbstract();
        boolean boolean58 = simpleType56.isReferenceType();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType59 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType32, (com.fasterxml.jackson.databind.JavaType) mapLikeType51, (com.fasterxml.jackson.databind.JavaType) simpleType56);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType61 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType63 = simpleType61.withValueHandler((java.lang.Object) '#');
        java.lang.String str64 = javaType63.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType65 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean66 = simpleType65.isAbstract();
        boolean boolean67 = simpleType65.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType68 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType63, (com.fasterxml.jackson.databind.JavaType) simpleType65);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings69 = null;
        com.fasterxml.jackson.databind.JavaType javaType70 = typeFactory60.constructType((java.lang.reflect.Type) simpleType65, typeBindings69);
        com.fasterxml.jackson.databind.type.ClassStack classStack71 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType72 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean73 = simpleType72.isCollectionLikeType();
        boolean boolean74 = simpleType72.isAbstract();
        boolean boolean75 = simpleType72.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings76 = null;
        com.fasterxml.jackson.databind.JavaType javaType77 = typeFactory60._fromAny(classStack71, (java.lang.reflect.Type) simpleType72, typeBindings76);
        com.fasterxml.jackson.databind.JavaType javaType78 = simpleType72.getContentType();
        boolean boolean79 = simpleType72.hasGenericTypes();
        com.fasterxml.jackson.databind.JavaType javaType80 = simpleType32.withValueHandler((java.lang.Object) boolean79);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType81 = collectionLikeType7.withValueHandler((java.lang.Object) javaType80);
        java.lang.String str82 = collectionLikeType81.buildCanonicalName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType81", collectionLikeType7.equals(collectionLikeType81) ? collectionLikeType7.hashCode() == collectionLikeType81.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory17.constructType((java.lang.reflect.Type) simpleType22, typeBindings26);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType30 = simpleType29.getSuperClass();
        java.lang.String str32 = simpleType29.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType33 = simpleType29.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType34 = simpleType29.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType35 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType29);
        java.lang.String str36 = collectionLikeType7.buildCanonicalName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType35", collectionLikeType7.equals(collectionLikeType35) ? collectionLikeType7.hashCode() == collectionLikeType35.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        java.lang.String str30 = collectionLikeType29.toString();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean32 = simpleType31.isCollectionLikeType();
        boolean boolean33 = simpleType31.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType35 = simpleType34.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType38 = simpleType36.withValueHandler((java.lang.Object) '#');
        java.lang.String str39 = javaType38.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean41 = simpleType40.isAbstract();
        boolean boolean42 = simpleType40.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType43 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType38, (com.fasterxml.jackson.databind.JavaType) simpleType40);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType44 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType31, javaType35, javaType38);
        com.fasterxml.jackson.databind.JavaType javaType45 = mapLikeType44.getContentType();
        boolean boolean46 = collectionLikeType29.equals((java.lang.Object) mapLikeType44);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap47);
        java.lang.Class<?> wildcardClass50 = typeFactory48._findPrimitive("");
        typeFactory48.clearCache();
        java.lang.Class<?> wildcardClass53 = typeFactory48._findPrimitive("Ljava/lang/Enum;");
        com.fasterxml.jackson.databind.type.TypeParser typeParser54 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser55 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType56 = collectionLikeType29.withValueHandler((java.lang.Object) typeFactory48);
        boolean boolean57 = collectionLikeType29.isContainerType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType56", collectionLikeType29.equals(collectionLikeType56) ? collectionLikeType29.hashCode() == collectionLikeType56.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean17 = collectionLikeType16.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType18 = collectionLikeType16._elementType;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = simpleType20.withValueHandler((java.lang.Object) '#');
        java.lang.String str23 = javaType22.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean25 = simpleType24.isAbstract();
        boolean boolean26 = simpleType24.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType22, (com.fasterxml.jackson.databind.JavaType) simpleType24);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory19.constructType((java.lang.reflect.Type) simpleType24, typeBindings28);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType16.withContentType(javaType29);
        boolean boolean31 = collectionLikeType16.isInterface();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType12 and javaType30", collectionLikeType12.equals(javaType30) ? collectionLikeType12.hashCode() == javaType30.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean17 = collectionLikeType16.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType18 = collectionLikeType16._elementType;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = simpleType20.withValueHandler((java.lang.Object) '#');
        java.lang.String str23 = javaType22.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean25 = simpleType24.isAbstract();
        boolean boolean26 = simpleType24.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType22, (com.fasterxml.jackson.databind.JavaType) simpleType24);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory19.constructType((java.lang.reflect.Type) simpleType24, typeBindings28);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType16.withContentType(javaType29);
        java.lang.String str31 = collectionLikeType16.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType12 and javaType30", collectionLikeType12.equals(javaType30) ? collectionLikeType12.hashCode() == javaType30.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType12.getSuperClass();
        java.lang.String str15 = simpleType12.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType12.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType12.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType12);
        com.fasterxml.jackson.databind.JavaType javaType19 = collectionLikeType7.getContentType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType18", collectionLikeType7.equals(collectionLikeType18) ? collectionLikeType7.hashCode() == collectionLikeType18.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        java.lang.String str10 = collectionLikeType7.toCanonical();
        boolean boolean11 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = collectionLikeType7.withStaticTyping();
        boolean boolean13 = collectionLikeType12.isTrueCollectionType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType12", collectionLikeType7.equals(collectionLikeType12) ? collectionLikeType7.hashCode() == collectionLikeType12.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7.withStaticTyping();
        java.lang.String str12 = collectionLikeType7.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType11", collectionLikeType7.equals(javaType11) ? collectionLikeType7.hashCode() == javaType11.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.hasHandlers();
        boolean boolean12 = collectionLikeType7.isTrueCollectionType();
        java.lang.String str13 = collectionLikeType7.toString();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType15.withValueHandler((java.lang.Object) '#');
        java.lang.String str18 = javaType17.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean20 = simpleType19.isAbstract();
        boolean boolean21 = simpleType19.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType17, (com.fasterxml.jackson.databind.JavaType) simpleType19);
        boolean boolean23 = collectionLikeType22.hasHandlers();
        int int24 = collectionLikeType22.containedTypeCount();
        boolean boolean25 = collectionLikeType22.isTrueCollectionType();
        boolean boolean26 = collectionLikeType22.isReferenceType();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        boolean boolean28 = javaType27.isInterface();
        int int29 = javaType27.containedTypeCount();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType30 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType22, javaType27);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType31 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType14, (com.fasterxml.jackson.databind.JavaType) collectionLikeType22);
        java.lang.Object obj32 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType33 = collectionLikeType22.withTypeHandler(obj32);
        com.fasterxml.jackson.databind.JavaType javaType34 = collectionLikeType22._elementType;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType33", collectionLikeType7.equals(collectionLikeType33) ? collectionLikeType7.hashCode() == collectionLikeType33.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean17 = collectionLikeType16.isContainerType();
        boolean boolean18 = collectionLikeType16.isContainerType();
        java.lang.Object obj19 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType20 = collectionLikeType16.withValueHandler(obj19);
        java.lang.Object obj21 = collectionLikeType20.getContentTypeHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType16 and collectionLikeType20", collectionLikeType16.equals(collectionLikeType20) ? collectionLikeType16.hashCode() == collectionLikeType20.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean17 = collectionLikeType16.isContainerType();
        boolean boolean18 = collectionLikeType16.isContainerType();
        java.lang.Object obj19 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType20 = collectionLikeType16.withValueHandler(obj19);
        boolean boolean21 = collectionLikeType16.isFinal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType16 and collectionLikeType20", collectionLikeType16.equals(collectionLikeType20) ? collectionLikeType16.hashCode() == collectionLikeType20.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        java.lang.String str30 = collectionLikeType29.toString();
        boolean boolean31 = collectionLikeType29.isCollectionLikeType();
        java.lang.String str33 = collectionLikeType29.containedTypeName((int) (short) 10);
        boolean boolean34 = collectionLikeType29.hasHandlers();
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType37 = simpleType35.withValueHandler((java.lang.Object) '#');
        java.lang.String str38 = javaType37.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType39 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean40 = simpleType39.isAbstract();
        boolean boolean41 = simpleType39.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType42 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType37, (com.fasterxml.jackson.databind.JavaType) simpleType39);
        boolean boolean43 = collectionLikeType42.hasHandlers();
        boolean boolean44 = collectionLikeType42.hasHandlers();
        boolean boolean45 = collectionLikeType42.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType49 = simpleType47.withValueHandler((java.lang.Object) '#');
        java.lang.String str50 = javaType49.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType51 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean52 = simpleType51.isAbstract();
        boolean boolean53 = simpleType51.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType54 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType49, (com.fasterxml.jackson.databind.JavaType) simpleType51);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings55 = null;
        com.fasterxml.jackson.databind.JavaType javaType56 = typeFactory46.constructType((java.lang.reflect.Type) simpleType51, typeBindings55);
        com.fasterxml.jackson.databind.type.ClassStack classStack57 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType58 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean59 = simpleType58.isCollectionLikeType();
        boolean boolean60 = simpleType58.isAbstract();
        boolean boolean61 = simpleType58.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings62 = null;
        com.fasterxml.jackson.databind.JavaType javaType63 = typeFactory46._fromAny(classStack57, (java.lang.reflect.Type) simpleType58, typeBindings62);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType64 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType42, javaType63);
        com.fasterxml.jackson.databind.JavaType javaType65 = collectionLikeType64.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType66 = collectionLikeType29.withContentTypeHandler((java.lang.Object) collectionLikeType64);
        boolean boolean67 = collectionLikeType29.isCollectionLikeType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType66", collectionLikeType29.equals(collectionLikeType66) ? collectionLikeType29.hashCode() == collectionLikeType66.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7.withStaticTyping();
        java.lang.Object obj12 = collectionLikeType7.getContentValueHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType11", collectionLikeType7.equals(javaType11) ? collectionLikeType7.hashCode() == javaType11.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean17 = collectionLikeType16.isContainerType();
        boolean boolean18 = collectionLikeType16.isContainerType();
        java.lang.Object obj19 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType20 = collectionLikeType16.withValueHandler(obj19);
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType23 = simpleType21.withValueHandler((java.lang.Object) '#');
        java.lang.String str24 = javaType23.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType25 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean26 = simpleType25.isAbstract();
        boolean boolean27 = simpleType25.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType28 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType23, (com.fasterxml.jackson.databind.JavaType) simpleType25);
        boolean boolean29 = collectionLikeType28.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType32 = simpleType30.withValueHandler((java.lang.Object) '#');
        java.lang.String str33 = javaType32.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean35 = simpleType34.isAbstract();
        boolean boolean36 = simpleType34.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType37 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType32, (com.fasterxml.jackson.databind.JavaType) simpleType34);
        boolean boolean38 = collectionLikeType37.hasHandlers();
        boolean boolean39 = collectionLikeType37.hasHandlers();
        boolean boolean40 = collectionLikeType37.isTrueCollectionType();
        boolean boolean41 = collectionLikeType37.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType42 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean43 = simpleType42.isAbstract();
        java.lang.String str44 = simpleType42.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType45 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType37, (com.fasterxml.jackson.databind.JavaType) simpleType42);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType46 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType28, (com.fasterxml.jackson.databind.JavaType) simpleType42);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType47 = collectionLikeType16.withContentValueHandler((java.lang.Object) collectionLikeType46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType16 and collectionLikeType20", collectionLikeType16.equals(collectionLikeType20) ? collectionLikeType16.hashCode() == collectionLikeType20.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.hasHandlers();
        boolean boolean12 = collectionLikeType7.isTrueCollectionType();
        java.lang.String str13 = collectionLikeType7.toString();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType15.withValueHandler((java.lang.Object) '#');
        java.lang.String str18 = javaType17.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean20 = simpleType19.isAbstract();
        boolean boolean21 = simpleType19.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType17, (com.fasterxml.jackson.databind.JavaType) simpleType19);
        boolean boolean23 = collectionLikeType22.hasHandlers();
        int int24 = collectionLikeType22.containedTypeCount();
        boolean boolean25 = collectionLikeType22.isTrueCollectionType();
        boolean boolean26 = collectionLikeType22.isReferenceType();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        boolean boolean28 = javaType27.isInterface();
        int int29 = javaType27.containedTypeCount();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType30 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType22, javaType27);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType31 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType14, (com.fasterxml.jackson.databind.JavaType) collectionLikeType22);
        java.lang.Object obj32 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType33 = collectionLikeType22.withTypeHandler(obj32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = collectionLikeType22.getTypeHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType33", collectionLikeType7.equals(collectionLikeType33) ? collectionLikeType7.hashCode() == collectionLikeType33.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7.withStaticTyping();
        java.lang.Object obj12 = collectionLikeType7.getContentTypeHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType11", collectionLikeType7.equals(javaType11) ? collectionLikeType7.hashCode() == javaType11.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.isReferenceType();
        java.lang.String str9 = collectionLikeType7.buildCanonicalName();
        boolean boolean10 = collectionLikeType7.isThrowable();
        java.lang.Object obj11 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = collectionLikeType7.withTypeHandler(obj11);
        java.lang.String str14 = collectionLikeType12.containedTypeName((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType12", collectionLikeType7.equals(collectionLikeType12) ? collectionLikeType7.hashCode() == collectionLikeType12.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean31 = simpleType30.isCollectionLikeType();
        boolean boolean32 = simpleType30.isAbstract();
        int int33 = simpleType30.containedTypeCount();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = collectionLikeType29.withContentValueHandler((java.lang.Object) int33);
        boolean boolean35 = collectionLikeType34.isMapLikeType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType34", collectionLikeType29.equals(collectionLikeType34) ? collectionLikeType29.hashCode() == collectionLikeType34.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        java.lang.String str30 = collectionLikeType29.toString();
        boolean boolean31 = collectionLikeType29.isCollectionLikeType();
        java.lang.String str33 = collectionLikeType29.containedTypeName((int) (short) 10);
        boolean boolean34 = collectionLikeType29.hasHandlers();
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType37 = simpleType35.withValueHandler((java.lang.Object) '#');
        java.lang.String str38 = javaType37.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType39 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean40 = simpleType39.isAbstract();
        boolean boolean41 = simpleType39.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType42 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType37, (com.fasterxml.jackson.databind.JavaType) simpleType39);
        boolean boolean43 = collectionLikeType42.hasHandlers();
        boolean boolean44 = collectionLikeType42.hasHandlers();
        boolean boolean45 = collectionLikeType42.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType49 = simpleType47.withValueHandler((java.lang.Object) '#');
        java.lang.String str50 = javaType49.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType51 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean52 = simpleType51.isAbstract();
        boolean boolean53 = simpleType51.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType54 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType49, (com.fasterxml.jackson.databind.JavaType) simpleType51);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings55 = null;
        com.fasterxml.jackson.databind.JavaType javaType56 = typeFactory46.constructType((java.lang.reflect.Type) simpleType51, typeBindings55);
        com.fasterxml.jackson.databind.type.ClassStack classStack57 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType58 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean59 = simpleType58.isCollectionLikeType();
        boolean boolean60 = simpleType58.isAbstract();
        boolean boolean61 = simpleType58.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings62 = null;
        com.fasterxml.jackson.databind.JavaType javaType63 = typeFactory46._fromAny(classStack57, (java.lang.reflect.Type) simpleType58, typeBindings62);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType64 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType42, javaType63);
        com.fasterxml.jackson.databind.JavaType javaType65 = collectionLikeType64.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType66 = collectionLikeType29.withContentTypeHandler((java.lang.Object) collectionLikeType64);
        java.lang.Object obj67 = collectionLikeType66.getContentTypeHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType66", collectionLikeType29.equals(collectionLikeType66) ? collectionLikeType29.hashCode() == collectionLikeType66.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType7.withStaticTyping();
        boolean boolean31 = collectionLikeType7.isArrayType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType30", collectionLikeType7.equals(javaType30) ? collectionLikeType7.hashCode() == javaType30.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean31 = simpleType30.isCollectionLikeType();
        boolean boolean32 = simpleType30.isAbstract();
        int int33 = simpleType30.containedTypeCount();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = collectionLikeType29.withContentValueHandler((java.lang.Object) int33);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings35 = collectionLikeType29.getBindings();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType34", collectionLikeType29.equals(collectionLikeType34) ? collectionLikeType29.hashCode() == collectionLikeType34.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean17 = collectionLikeType16.isContainerType();
        boolean boolean18 = collectionLikeType16.isContainerType();
        java.lang.Object obj19 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType20 = collectionLikeType16.withValueHandler(obj19);
        com.fasterxml.jackson.databind.JavaType javaType21 = collectionLikeType16._elementType;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType16 and collectionLikeType20", collectionLikeType16.equals(collectionLikeType20) ? collectionLikeType16.hashCode() == collectionLikeType20.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean11 = simpleType10.isCollectionLikeType();
        boolean boolean12 = simpleType10.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType13.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType15.withValueHandler((java.lang.Object) '#');
        java.lang.String str18 = javaType17.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean20 = simpleType19.isAbstract();
        boolean boolean21 = simpleType19.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType17, (com.fasterxml.jackson.databind.JavaType) simpleType19);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType23 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType10, javaType14, javaType17);
        java.lang.Object obj24 = mapLikeType23.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType25 = mapLikeType23._valueType;
        com.fasterxml.jackson.databind.JavaType javaType26 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType23);
        java.lang.String str27 = collectionLikeType7.toString();
        boolean boolean28 = collectionLikeType7.hasContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = collectionLikeType7.withStaticTyping();
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionLikeType7.containedTypeOrUnknown((int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType29", collectionLikeType7.equals(collectionLikeType29) ? collectionLikeType7.hashCode() == collectionLikeType29.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory17.constructType((java.lang.reflect.Type) simpleType22, typeBindings26);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType22);
        boolean boolean29 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType7.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType32 = collectionLikeType7.withValueHandler((java.lang.Object) simpleType31);
        com.fasterxml.jackson.databind.JavaType javaType33 = collectionLikeType32.getReferencedType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType32", collectionLikeType7.equals(collectionLikeType32) ? collectionLikeType7.hashCode() == collectionLikeType32.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.JavaType javaType9 = collectionLikeType7.withContentTypeHandler((java.lang.Object) (-1.0f));
        boolean boolean10 = collectionLikeType7.hasHandlers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType9", collectionLikeType7.equals(javaType9) ? collectionLikeType7.hashCode() == javaType9.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        java.lang.String str10 = collectionLikeType7.toCanonical();
        boolean boolean11 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = collectionLikeType7.withStaticTyping();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = collectionLikeType7.getBindings();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType12", collectionLikeType7.equals(collectionLikeType12) ? collectionLikeType7.hashCode() == collectionLikeType12.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType29.getContentType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType32 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType34 = simpleType32.withValueHandler((java.lang.Object) '#');
        java.lang.String str35 = javaType34.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean37 = simpleType36.isAbstract();
        boolean boolean38 = simpleType36.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType39 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType34, (com.fasterxml.jackson.databind.JavaType) simpleType36);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings40 = null;
        com.fasterxml.jackson.databind.JavaType javaType41 = typeFactory31.constructType((java.lang.reflect.Type) simpleType36, typeBindings40);
        com.fasterxml.jackson.databind.type.ClassStack classStack42 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType43 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean44 = simpleType43.isCollectionLikeType();
        boolean boolean45 = simpleType43.isAbstract();
        boolean boolean46 = simpleType43.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings47 = null;
        com.fasterxml.jackson.databind.JavaType javaType48 = typeFactory31._fromAny(classStack42, (java.lang.reflect.Type) simpleType43, typeBindings47);
        com.fasterxml.jackson.databind.type.TypeParser typeParser49 = typeFactory31._parser;
        com.fasterxml.jackson.databind.JavaType javaType50 = collectionLikeType29.withValueHandler((java.lang.Object) typeParser49);
        boolean boolean51 = collectionLikeType29.isArrayType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and javaType50", collectionLikeType29.equals(javaType50) ? collectionLikeType29.hashCode() == javaType50.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean31 = simpleType30.isCollectionLikeType();
        boolean boolean32 = simpleType30.isAbstract();
        int int33 = simpleType30.containedTypeCount();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = collectionLikeType29.withContentValueHandler((java.lang.Object) int33);
        java.lang.String str36 = collectionLikeType34.containedTypeName((int) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType34", collectionLikeType29.equals(collectionLikeType34) ? collectionLikeType29.hashCode() == collectionLikeType34.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean11 = simpleType10.isCollectionLikeType();
        boolean boolean12 = simpleType10.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType13.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType15.withValueHandler((java.lang.Object) '#');
        java.lang.String str18 = javaType17.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean20 = simpleType19.isAbstract();
        boolean boolean21 = simpleType19.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType17, (com.fasterxml.jackson.databind.JavaType) simpleType19);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType23 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType10, javaType14, javaType17);
        java.lang.Object obj24 = mapLikeType23.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType25 = mapLikeType23._valueType;
        com.fasterxml.jackson.databind.JavaType javaType26 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType23);
        java.lang.String str27 = collectionLikeType7.toString();
        boolean boolean28 = collectionLikeType7.hasContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = collectionLikeType7.withStaticTyping();
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        boolean boolean31 = simpleType30.isContainerType();
        boolean boolean32 = simpleType30.isFinal();
        java.lang.Object obj33 = simpleType30.getContentValueHandler();
        boolean boolean34 = simpleType30.isArrayType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean37 = simpleType36.isCollectionLikeType();
        boolean boolean38 = simpleType36.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType39 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType40 = simpleType39.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType41 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType43 = simpleType41.withValueHandler((java.lang.Object) '#');
        java.lang.String str44 = javaType43.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType45 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean46 = simpleType45.isAbstract();
        boolean boolean47 = simpleType45.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType48 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType43, (com.fasterxml.jackson.databind.JavaType) simpleType45);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType49 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType36, javaType40, javaType43);
        java.lang.Object obj50 = mapLikeType49.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType51 = mapLikeType49._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings52 = null;
        com.fasterxml.jackson.databind.JavaType javaType53 = typeFactory35.constructType((java.lang.reflect.Type) mapLikeType49, typeBindings52);
        com.fasterxml.jackson.databind.type.SimpleType simpleType54 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean55 = simpleType54.isAbstract();
        boolean boolean56 = simpleType54.isReferenceType();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType57 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType30, (com.fasterxml.jackson.databind.JavaType) mapLikeType49, (com.fasterxml.jackson.databind.JavaType) simpleType54);
        com.fasterxml.jackson.databind.JavaType javaType58 = mapLikeType57.getContentType();
        boolean boolean59 = mapLikeType57.isTrueMapType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType60 = collectionLikeType29.withContentValueHandler((java.lang.Object) mapLikeType57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType29", collectionLikeType7.equals(collectionLikeType29) ? collectionLikeType7.hashCode() == collectionLikeType29.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        java.lang.String str30 = collectionLikeType29.toString();
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionLikeType29.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType32 = collectionLikeType29.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType33 = collectionLikeType29.withStaticTyping();
        boolean boolean34 = collectionLikeType29.isMapLikeType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType33", collectionLikeType29.equals(collectionLikeType33) ? collectionLikeType29.hashCode() == collectionLikeType33.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        java.lang.String str30 = collectionLikeType29.toString();
        boolean boolean31 = collectionLikeType29.isCollectionLikeType();
        java.lang.String str33 = collectionLikeType29.containedTypeName((int) (short) 10);
        boolean boolean34 = collectionLikeType29.hasHandlers();
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType37 = simpleType35.withValueHandler((java.lang.Object) '#');
        java.lang.String str38 = javaType37.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType39 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean40 = simpleType39.isAbstract();
        boolean boolean41 = simpleType39.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType42 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType37, (com.fasterxml.jackson.databind.JavaType) simpleType39);
        boolean boolean43 = collectionLikeType42.hasHandlers();
        boolean boolean44 = collectionLikeType42.hasHandlers();
        boolean boolean45 = collectionLikeType42.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType49 = simpleType47.withValueHandler((java.lang.Object) '#');
        java.lang.String str50 = javaType49.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType51 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean52 = simpleType51.isAbstract();
        boolean boolean53 = simpleType51.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType54 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType49, (com.fasterxml.jackson.databind.JavaType) simpleType51);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings55 = null;
        com.fasterxml.jackson.databind.JavaType javaType56 = typeFactory46.constructType((java.lang.reflect.Type) simpleType51, typeBindings55);
        com.fasterxml.jackson.databind.type.ClassStack classStack57 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType58 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean59 = simpleType58.isCollectionLikeType();
        boolean boolean60 = simpleType58.isAbstract();
        boolean boolean61 = simpleType58.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings62 = null;
        com.fasterxml.jackson.databind.JavaType javaType63 = typeFactory46._fromAny(classStack57, (java.lang.reflect.Type) simpleType58, typeBindings62);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType64 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType42, javaType63);
        com.fasterxml.jackson.databind.JavaType javaType65 = collectionLikeType64.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType66 = collectionLikeType29.withContentTypeHandler((java.lang.Object) collectionLikeType64);
        com.fasterxml.jackson.databind.type.SimpleType simpleType67 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType69 = simpleType67.withValueHandler((java.lang.Object) '#');
        java.lang.String str70 = javaType69.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType71 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean72 = simpleType71.isAbstract();
        boolean boolean73 = simpleType71.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType74 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType69, (com.fasterxml.jackson.databind.JavaType) simpleType71);
        boolean boolean75 = collectionLikeType74.hasHandlers();
        boolean boolean76 = collectionLikeType74.hasHandlers();
        boolean boolean77 = collectionLikeType74.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType78 = collectionLikeType74.withStaticTyping();
        com.fasterxml.jackson.databind.JavaType javaType79 = collectionLikeType29.withContentType((com.fasterxml.jackson.databind.JavaType) collectionLikeType74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType78", collectionLikeType7.equals(javaType78) ? collectionLikeType7.hashCode() == javaType78.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType7.withStaticTyping();
        boolean boolean31 = collectionLikeType7.hasHandlers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType30", collectionLikeType7.equals(javaType30) ? collectionLikeType7.hashCode() == javaType30.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13.getKeyType();
        java.lang.String str15 = mapLikeType13.buildCanonicalName();
        com.fasterxml.jackson.databind.JavaType javaType16 = mapLikeType13.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13._valueType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        boolean boolean26 = collectionLikeType25.hasHandlers();
        boolean boolean27 = collectionLikeType25.hasHandlers();
        boolean boolean28 = collectionLikeType25.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType32 = simpleType30.withValueHandler((java.lang.Object) '#');
        java.lang.String str33 = javaType32.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean35 = simpleType34.isAbstract();
        boolean boolean36 = simpleType34.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType37 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType32, (com.fasterxml.jackson.databind.JavaType) simpleType34);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings38 = null;
        com.fasterxml.jackson.databind.JavaType javaType39 = typeFactory29.constructType((java.lang.reflect.Type) simpleType34, typeBindings38);
        com.fasterxml.jackson.databind.type.ClassStack classStack40 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType41 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean42 = simpleType41.isCollectionLikeType();
        boolean boolean43 = simpleType41.isAbstract();
        boolean boolean44 = simpleType41.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings45 = null;
        com.fasterxml.jackson.databind.JavaType javaType46 = typeFactory29._fromAny(classStack40, (java.lang.reflect.Type) simpleType41, typeBindings45);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType47 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType25, javaType46);
        com.fasterxml.jackson.databind.type.SimpleType simpleType48 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean49 = simpleType48.isCollectionLikeType();
        boolean boolean50 = simpleType48.isAbstract();
        int int51 = simpleType48.containedTypeCount();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType52 = collectionLikeType47.withContentValueHandler((java.lang.Object) int51);
        boolean boolean53 = mapLikeType13.equals((java.lang.Object) collectionLikeType47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType47 and collectionLikeType52", collectionLikeType47.equals(collectionLikeType52) ? collectionLikeType47.hashCode() == collectionLikeType52.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType9 = collectionLikeType7.withStaticTyping();
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) collectionLikeType9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType9", collectionLikeType7.equals(collectionLikeType9) ? collectionLikeType7.hashCode() == collectionLikeType9.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory17.constructType((java.lang.reflect.Type) simpleType22, typeBindings26);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType30 = simpleType29.getSuperClass();
        java.lang.String str32 = simpleType29.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType33 = simpleType29.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType34 = simpleType29.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType35 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType29);
        boolean boolean36 = collectionLikeType7.isCollectionLikeType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType35", collectionLikeType7.equals(collectionLikeType35) ? collectionLikeType7.hashCode() == collectionLikeType35.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType15.hasHandlers();
        boolean boolean17 = collectionLikeType15.hasHandlers();
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean19 = simpleType18.isArrayType();
        java.lang.Class<?> wildcardClass20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType18);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType21 = collectionLikeType15.withValueHandler((java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass22 = collectionLikeType15.getRawClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType21", collectionLikeType7.equals(collectionLikeType21) ? collectionLikeType7.hashCode() == collectionLikeType21.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean17 = collectionLikeType16.isContainerType();
        boolean boolean18 = collectionLikeType16.isContainerType();
        java.lang.Object obj19 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType20 = collectionLikeType16.withValueHandler(obj19);
        java.lang.String str22 = collectionLikeType16.containedTypeName((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType16 and collectionLikeType20", collectionLikeType16.equals(collectionLikeType20) ? collectionLikeType16.hashCode() == collectionLikeType20.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        boolean boolean1 = simpleType0.isContainerType();
        boolean boolean2 = simpleType0.isFinal();
        java.lang.Object obj3 = simpleType0.getContentValueHandler();
        boolean boolean4 = simpleType0.isArrayType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean7 = simpleType6.isCollectionLikeType();
        boolean boolean8 = simpleType6.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType10 = simpleType9.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType11.withValueHandler((java.lang.Object) '#');
        java.lang.String str14 = javaType13.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean16 = simpleType15.isAbstract();
        boolean boolean17 = simpleType15.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType19 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType6, javaType10, javaType13);
        java.lang.Object obj20 = mapLikeType19.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType21 = mapLikeType19._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory5.constructType((java.lang.reflect.Type) mapLikeType19, typeBindings22);
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean25 = simpleType24.isAbstract();
        boolean boolean26 = simpleType24.isReferenceType();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType27 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, (com.fasterxml.jackson.databind.JavaType) mapLikeType19, (com.fasterxml.jackson.databind.JavaType) simpleType24);
        com.fasterxml.jackson.databind.JavaType javaType28 = mapLikeType27.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType29 = mapLikeType27.getKeyType();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType30 = mapLikeType27.withStaticTyping();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType33 = simpleType31.withValueHandler((java.lang.Object) '#');
        java.lang.String str34 = javaType33.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean36 = simpleType35.isAbstract();
        boolean boolean37 = simpleType35.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType38 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType33, (com.fasterxml.jackson.databind.JavaType) simpleType35);
        boolean boolean39 = collectionLikeType38.hasHandlers();
        boolean boolean40 = collectionLikeType38.hasHandlers();
        boolean boolean41 = collectionLikeType38.isTrueCollectionType();
        boolean boolean42 = collectionLikeType38.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType43 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean44 = simpleType43.isAbstract();
        java.lang.String str45 = simpleType43.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType46 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType38, (com.fasterxml.jackson.databind.JavaType) simpleType43);
        boolean boolean47 = collectionLikeType38.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType49 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType51 = simpleType49.withValueHandler((java.lang.Object) '#');
        java.lang.String str52 = javaType51.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType53 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean54 = simpleType53.isAbstract();
        boolean boolean55 = simpleType53.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType56 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType51, (com.fasterxml.jackson.databind.JavaType) simpleType53);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings57 = null;
        com.fasterxml.jackson.databind.JavaType javaType58 = typeFactory48.constructType((java.lang.reflect.Type) simpleType53, typeBindings57);
        com.fasterxml.jackson.databind.JavaType javaType59 = collectionLikeType38.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType53);
        java.lang.Class<?> wildcardClass60 = javaType59.getParameterSource();
        java.lang.Class<?> wildcardClass61 = javaType59.getParameterSource();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType62 = mapLikeType30.withValueHandler((java.lang.Object) wildcardClass61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mapLikeType27 and mapLikeType30", mapLikeType27.equals(mapLikeType30) ? mapLikeType27.hashCode() == mapLikeType30.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory17.constructType((java.lang.reflect.Type) simpleType22, typeBindings26);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType30 = simpleType29.getSuperClass();
        java.lang.String str32 = simpleType29.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType33 = simpleType29.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType34 = simpleType29.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType35 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType29);
        boolean boolean36 = collectionLikeType7.isArrayType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType35", collectionLikeType7.equals(collectionLikeType35) ? collectionLikeType7.hashCode() == collectionLikeType35.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        java.lang.Object obj14 = mapLikeType13.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType15 = mapLikeType13._valueType;
        com.fasterxml.jackson.databind.JavaType javaType16 = mapLikeType13._valueType;
        java.lang.Class<?> wildcardClass17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) mapLikeType13);
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType13.getSuperClass();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap20 = typeFactory19._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory19._unknownType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType24 = simpleType22.withValueHandler((java.lang.Object) '#');
        java.lang.String str25 = javaType24.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType26 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean27 = simpleType26.isAbstract();
        boolean boolean28 = simpleType26.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType24, (com.fasterxml.jackson.databind.JavaType) simpleType26);
        boolean boolean30 = collectionLikeType29.hasHandlers();
        boolean boolean31 = collectionLikeType29.hasHandlers();
        java.lang.String str32 = collectionLikeType29.toCanonical();
        boolean boolean33 = collectionLikeType29.hasHandlers();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = collectionLikeType29.withStaticTyping();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType35 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, javaType21, (com.fasterxml.jackson.databind.JavaType) collectionLikeType29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType12 and collectionLikeType34", collectionLikeType12.equals(collectionLikeType34) ? collectionLikeType12.hashCode() == collectionLikeType34.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType11 = simpleType9.withValueHandler((java.lang.Object) '#');
        java.lang.String str12 = javaType11.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean14 = simpleType13.isAbstract();
        boolean boolean15 = simpleType13.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType11, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        boolean boolean17 = collectionLikeType16.hasHandlers();
        boolean boolean18 = collectionLikeType16.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean20 = simpleType19.isCollectionLikeType();
        boolean boolean21 = simpleType19.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType23 = simpleType22.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType26 = simpleType24.withValueHandler((java.lang.Object) '#');
        java.lang.String str27 = javaType26.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean29 = simpleType28.isAbstract();
        boolean boolean30 = simpleType28.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType31 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType26, (com.fasterxml.jackson.databind.JavaType) simpleType28);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType32 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType19, javaType23, javaType26);
        java.lang.Object obj33 = mapLikeType32.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType34 = mapLikeType32._valueType;
        com.fasterxml.jackson.databind.JavaType javaType35 = collectionLikeType16.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType32);
        boolean boolean36 = collectionLikeType16.isFinal();
        java.lang.String str37 = collectionLikeType16.toString();
        com.fasterxml.jackson.databind.JavaType javaType38 = collectionLikeType7.withTypeHandler((java.lang.Object) collectionLikeType16);
        com.fasterxml.jackson.databind.JavaType javaType39 = javaType38.getReferencedType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType38", collectionLikeType7.equals(javaType38) ? collectionLikeType7.hashCode() == javaType38.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        java.lang.ClassLoader classLoader28 = typeFactory9._classLoader;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        java.lang.String str30 = collectionLikeType29.toString();
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionLikeType29.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType32 = collectionLikeType29.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType33 = collectionLikeType29.withStaticTyping();
        boolean boolean34 = collectionLikeType33.hasGenericTypes();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType33", collectionLikeType29.equals(collectionLikeType33) ? collectionLikeType29.hashCode() == collectionLikeType33.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean17 = collectionLikeType16.isContainerType();
        java.lang.Object obj18 = collectionLikeType16.getContentTypeHandler();
        boolean boolean19 = collectionLikeType16.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = collectionLikeType16.getValueHandler();
        java.lang.Object obj21 = collectionLikeType16.getContentTypeHandler();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = collectionLikeType16.withContentTypeHandler((java.lang.Object) "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        int int24 = collectionLikeType23.containedTypeCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType16 and collectionLikeType23", collectionLikeType16.equals(collectionLikeType23) ? collectionLikeType16.hashCode() == collectionLikeType23.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType12.getSuperClass();
        java.lang.String str15 = simpleType12.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType12.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType12.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType12);
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean20 = simpleType19.isCollectionLikeType();
        boolean boolean21 = simpleType19.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType23 = simpleType22.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType26 = simpleType24.withValueHandler((java.lang.Object) '#');
        java.lang.String str27 = javaType26.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean29 = simpleType28.isAbstract();
        boolean boolean30 = simpleType28.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType31 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType26, (com.fasterxml.jackson.databind.JavaType) simpleType28);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType32 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType19, javaType23, javaType26);
        boolean boolean33 = mapLikeType32.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType34 = mapLikeType32.getContentType();
        java.lang.String str36 = mapLikeType32.containedTypeName((int) (short) 0);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType37 = collectionLikeType7.withContentTypeHandler((java.lang.Object) mapLikeType32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType18", collectionLikeType7.equals(collectionLikeType18) ? collectionLikeType7.hashCode() == collectionLikeType18.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        java.lang.String str10 = collectionLikeType7.toCanonical();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = collectionLikeType7.getBindings();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean13 = simpleType12.isCollectionLikeType();
        boolean boolean14 = simpleType12.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType15.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType19 = simpleType17.withValueHandler((java.lang.Object) '#');
        java.lang.String str20 = javaType19.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean22 = simpleType21.isAbstract();
        boolean boolean23 = simpleType21.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType19, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType25 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType12, javaType16, javaType19);
        com.fasterxml.jackson.databind.JavaType javaType26 = mapLikeType25.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType27 = mapLikeType25.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType28 = collectionLikeType7.withValueHandler((java.lang.Object) javaType27);
        com.fasterxml.jackson.databind.JavaType javaType29 = javaType27.getSuperClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType28", collectionLikeType7.equals(collectionLikeType28) ? collectionLikeType7.hashCode() == collectionLikeType28.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean31 = simpleType30.isCollectionLikeType();
        boolean boolean32 = simpleType30.isAbstract();
        int int33 = simpleType30.containedTypeCount();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = collectionLikeType29.withContentValueHandler((java.lang.Object) int33);
        boolean boolean35 = collectionLikeType34.isCollectionLikeType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType34", collectionLikeType29.equals(collectionLikeType34) ? collectionLikeType29.hashCode() == collectionLikeType34.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.JavaType javaType9 = collectionLikeType7.withContentTypeHandler((java.lang.Object) (-1.0f));
        boolean boolean10 = javaType9.isEnumType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType9", collectionLikeType7.equals(javaType9) ? collectionLikeType7.hashCode() == javaType9.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        boolean boolean1 = simpleType0.isContainerType();
        boolean boolean2 = simpleType0.isFinal();
        java.lang.Object obj3 = simpleType0.getContentValueHandler();
        boolean boolean4 = simpleType0.isPrimitive();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList5 = simpleType0.getInterfaces();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = simpleType6.withValueHandler((java.lang.Object) '#');
        java.lang.String str9 = javaType8.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean11 = simpleType10.isAbstract();
        boolean boolean12 = simpleType10.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType13 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        boolean boolean14 = collectionLikeType13.hasHandlers();
        boolean boolean15 = collectionLikeType13.hasHandlers();
        boolean boolean16 = collectionLikeType13.isTrueCollectionType();
        boolean boolean17 = collectionLikeType13.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean19 = simpleType18.isAbstract();
        java.lang.String str20 = simpleType18.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType21 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType18);
        boolean boolean22 = collectionLikeType13.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType26 = simpleType24.withValueHandler((java.lang.Object) '#');
        java.lang.String str27 = javaType26.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean29 = simpleType28.isAbstract();
        boolean boolean30 = simpleType28.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType31 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType26, (com.fasterxml.jackson.databind.JavaType) simpleType28);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings32 = null;
        com.fasterxml.jackson.databind.JavaType javaType33 = typeFactory23.constructType((java.lang.reflect.Type) simpleType28, typeBindings32);
        com.fasterxml.jackson.databind.JavaType javaType34 = collectionLikeType13.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType28);
        boolean boolean35 = collectionLikeType13.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType38 = simpleType36.withValueHandler((java.lang.Object) '#');
        java.lang.String str39 = javaType38.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean41 = simpleType40.isAbstract();
        boolean boolean42 = simpleType40.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType43 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType38, (com.fasterxml.jackson.databind.JavaType) simpleType40);
        boolean boolean44 = collectionLikeType43.hasHandlers();
        boolean boolean45 = collectionLikeType43.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType46 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean47 = simpleType46.isCollectionLikeType();
        boolean boolean48 = simpleType46.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType49 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType50 = simpleType49.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType51 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType53 = simpleType51.withValueHandler((java.lang.Object) '#');
        java.lang.String str54 = javaType53.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType55 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean56 = simpleType55.isAbstract();
        boolean boolean57 = simpleType55.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType58 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType53, (com.fasterxml.jackson.databind.JavaType) simpleType55);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType59 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType46, javaType50, javaType53);
        java.lang.Object obj60 = mapLikeType59.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType61 = mapLikeType59._valueType;
        com.fasterxml.jackson.databind.JavaType javaType62 = collectionLikeType43.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType59);
        boolean boolean63 = collectionLikeType43.isFinal();
        com.fasterxml.jackson.databind.JavaType javaType64 = collectionLikeType43.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType65 = collectionLikeType13.withValueHandler((java.lang.Object) javaType64);
        com.fasterxml.jackson.databind.type.SimpleType simpleType66 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType68 = simpleType66.withValueHandler((java.lang.Object) '#');
        java.lang.String str69 = javaType68.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType70 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean71 = simpleType70.isAbstract();
        boolean boolean72 = simpleType70.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType73 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType68, (com.fasterxml.jackson.databind.JavaType) simpleType70);
        boolean boolean74 = collectionLikeType73.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType75 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType77 = simpleType75.withValueHandler((java.lang.Object) '#');
        java.lang.String str78 = javaType77.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType79 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean80 = simpleType79.isAbstract();
        boolean boolean81 = simpleType79.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType82 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType77, (com.fasterxml.jackson.databind.JavaType) simpleType79);
        boolean boolean83 = collectionLikeType82.hasHandlers();
        boolean boolean84 = collectionLikeType82.hasHandlers();
        boolean boolean85 = collectionLikeType82.isTrueCollectionType();
        boolean boolean86 = collectionLikeType82.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType87 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean88 = simpleType87.isAbstract();
        java.lang.String str89 = simpleType87.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType90 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType82, (com.fasterxml.jackson.databind.JavaType) simpleType87);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType91 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType73, (com.fasterxml.jackson.databind.JavaType) simpleType87);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType92 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, (com.fasterxml.jackson.databind.JavaType) collectionLikeType65, (com.fasterxml.jackson.databind.JavaType) collectionLikeType73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType13 and collectionLikeType65", collectionLikeType13.equals(collectionLikeType65) ? collectionLikeType13.hashCode() == collectionLikeType65.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        java.lang.Object obj28 = collectionLikeType7.getContentTypeHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean2 = simpleType1.isCollectionLikeType();
        boolean boolean3 = simpleType1.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType5 = simpleType4.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = simpleType6.withValueHandler((java.lang.Object) '#');
        java.lang.String str9 = javaType8.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean11 = simpleType10.isAbstract();
        boolean boolean12 = simpleType10.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType13 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType14 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType1, javaType5, javaType8);
        com.fasterxml.jackson.databind.JavaType javaType15 = mapLikeType14.getKeyType();
        java.lang.String str16 = mapLikeType14.buildCanonicalName();
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType14.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) simpleType0, javaType17);
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType21 = simpleType19.withValueHandler((java.lang.Object) '#');
        java.lang.String str22 = javaType21.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean24 = simpleType23.isAbstract();
        boolean boolean25 = simpleType23.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType26 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType21, (com.fasterxml.jackson.databind.JavaType) simpleType23);
        boolean boolean27 = collectionLikeType26.hasHandlers();
        boolean boolean28 = collectionLikeType26.hasHandlers();
        java.lang.String str29 = collectionLikeType26.toCanonical();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings30 = collectionLikeType26.getBindings();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean32 = simpleType31.isCollectionLikeType();
        boolean boolean33 = simpleType31.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType35 = simpleType34.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType38 = simpleType36.withValueHandler((java.lang.Object) '#');
        java.lang.String str39 = javaType38.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean41 = simpleType40.isAbstract();
        boolean boolean42 = simpleType40.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType43 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType38, (com.fasterxml.jackson.databind.JavaType) simpleType40);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType44 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType31, javaType35, javaType38);
        com.fasterxml.jackson.databind.JavaType javaType45 = mapLikeType44.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType46 = mapLikeType44.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType47 = collectionLikeType26.withValueHandler((java.lang.Object) javaType46);
        com.fasterxml.jackson.databind.JavaType javaType48 = collectionLikeType18.withContentType((com.fasterxml.jackson.databind.JavaType) collectionLikeType26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType13 and collectionLikeType47", collectionLikeType13.equals(collectionLikeType47) ? collectionLikeType13.hashCode() == collectionLikeType47.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean17 = collectionLikeType16.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType18 = collectionLikeType16._elementType;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = simpleType20.withValueHandler((java.lang.Object) '#');
        java.lang.String str23 = javaType22.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean25 = simpleType24.isAbstract();
        boolean boolean26 = simpleType24.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType22, (com.fasterxml.jackson.databind.JavaType) simpleType24);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory19.constructType((java.lang.reflect.Type) simpleType24, typeBindings28);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType16.withContentType(javaType29);
        com.fasterxml.jackson.databind.JavaType javaType31 = javaType30.getReferencedType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType12 and javaType30", collectionLikeType12.equals(javaType30) ? collectionLikeType12.hashCode() == javaType30.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType15.hasHandlers();
        boolean boolean17 = collectionLikeType15.hasHandlers();
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean19 = simpleType18.isArrayType();
        java.lang.Class<?> wildcardClass20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType18);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType21 = collectionLikeType15.withValueHandler((java.lang.Object) wildcardClass20);
        com.fasterxml.jackson.databind.JavaType javaType22 = collectionLikeType15.getSuperClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType21", collectionLikeType7.equals(collectionLikeType21) ? collectionLikeType7.hashCode() == collectionLikeType21.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = collectionLikeType7.withStaticTyping();
        java.lang.String str18 = collectionLikeType7.toCanonical();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType17", collectionLikeType7.equals(collectionLikeType17) ? collectionLikeType7.hashCode() == collectionLikeType17.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        java.lang.String str30 = collectionLikeType29.toString();
        boolean boolean31 = collectionLikeType29.isCollectionLikeType();
        java.lang.String str33 = collectionLikeType29.containedTypeName((int) (short) 10);
        boolean boolean34 = collectionLikeType29.hasHandlers();
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType37 = simpleType35.withValueHandler((java.lang.Object) '#');
        java.lang.String str38 = javaType37.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType39 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean40 = simpleType39.isAbstract();
        boolean boolean41 = simpleType39.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType42 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType37, (com.fasterxml.jackson.databind.JavaType) simpleType39);
        boolean boolean43 = collectionLikeType42.hasHandlers();
        boolean boolean44 = collectionLikeType42.hasHandlers();
        boolean boolean45 = collectionLikeType42.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType49 = simpleType47.withValueHandler((java.lang.Object) '#');
        java.lang.String str50 = javaType49.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType51 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean52 = simpleType51.isAbstract();
        boolean boolean53 = simpleType51.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType54 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType49, (com.fasterxml.jackson.databind.JavaType) simpleType51);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings55 = null;
        com.fasterxml.jackson.databind.JavaType javaType56 = typeFactory46.constructType((java.lang.reflect.Type) simpleType51, typeBindings55);
        com.fasterxml.jackson.databind.type.ClassStack classStack57 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType58 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean59 = simpleType58.isCollectionLikeType();
        boolean boolean60 = simpleType58.isAbstract();
        boolean boolean61 = simpleType58.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings62 = null;
        com.fasterxml.jackson.databind.JavaType javaType63 = typeFactory46._fromAny(classStack57, (java.lang.reflect.Type) simpleType58, typeBindings62);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType64 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType42, javaType63);
        com.fasterxml.jackson.databind.JavaType javaType65 = collectionLikeType64.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType66 = collectionLikeType29.withContentTypeHandler((java.lang.Object) collectionLikeType64);
        boolean boolean67 = collectionLikeType66.isCollectionLikeType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType66", collectionLikeType29.equals(collectionLikeType66) ? collectionLikeType29.hashCode() == collectionLikeType66.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean17 = collectionLikeType16.isContainerType();
        boolean boolean18 = collectionLikeType16.isContainerType();
        java.lang.Object obj19 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType20 = collectionLikeType16.withValueHandler(obj19);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType22 = collectionLikeType20.withContentTypeHandler((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType16 and collectionLikeType20", collectionLikeType16.equals(collectionLikeType20) ? collectionLikeType16.hashCode() == collectionLikeType20.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory17.constructType((java.lang.reflect.Type) simpleType22, typeBindings26);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType30 = simpleType29.getSuperClass();
        java.lang.String str32 = simpleType29.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType33 = simpleType29.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType34 = simpleType29.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType35 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType29);
        com.fasterxml.jackson.databind.JavaType javaType36 = collectionLikeType35.getContentType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType35", collectionLikeType7.equals(collectionLikeType35) ? collectionLikeType7.hashCode() == collectionLikeType35.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        java.lang.Class<?> wildcardClass29 = typeFactory9._findPrimitive("[map-like type; class java.lang.Object, [map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]] -> [collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType12.getSuperClass();
        java.lang.String str15 = simpleType12.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType12.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType12.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType12);
        com.fasterxml.jackson.databind.JavaType javaType19 = collectionLikeType18.withStaticTyping();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType18", collectionLikeType7.equals(collectionLikeType18) ? collectionLikeType7.hashCode() == collectionLikeType18.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        java.lang.Object obj9 = collectionLikeType7.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType10 = collectionLikeType7.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType11.withValueHandler((java.lang.Object) '#');
        java.lang.String str14 = javaType13.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean16 = simpleType15.isAbstract();
        boolean boolean17 = simpleType15.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean19 = collectionLikeType18.isReferenceType();
        java.lang.String str20 = collectionLikeType18.buildCanonicalName();
        boolean boolean21 = collectionLikeType18.isThrowable();
        boolean boolean22 = collectionLikeType7.equals((java.lang.Object) collectionLikeType18);
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType25 = simpleType23.withValueHandler((java.lang.Object) '#');
        java.lang.String str26 = javaType25.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean28 = simpleType27.isAbstract();
        boolean boolean29 = simpleType27.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType30 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType25, (com.fasterxml.jackson.databind.JavaType) simpleType27);
        boolean boolean31 = collectionLikeType30.hasHandlers();
        boolean boolean32 = collectionLikeType30.isEnumType();
        boolean boolean33 = collectionLikeType30.isConcrete();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList34 = collectionLikeType30.getInterfaces();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType35 = collectionLikeType18.withContentValueHandler((java.lang.Object) javaTypeList34);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings36 = collectionLikeType35.getTypeHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType35", collectionLikeType7.equals(collectionLikeType35) ? collectionLikeType7.hashCode() == collectionLikeType35.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        boolean boolean1 = simpleType0.isContainerType();
        boolean boolean2 = simpleType0.isFinal();
        java.lang.Object obj3 = simpleType0.getContentValueHandler();
        boolean boolean4 = simpleType0.isArrayType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean7 = simpleType6.isCollectionLikeType();
        boolean boolean8 = simpleType6.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType10 = simpleType9.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType11.withValueHandler((java.lang.Object) '#');
        java.lang.String str14 = javaType13.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean16 = simpleType15.isAbstract();
        boolean boolean17 = simpleType15.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType19 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType6, javaType10, javaType13);
        java.lang.Object obj20 = mapLikeType19.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType21 = mapLikeType19._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory5.constructType((java.lang.reflect.Type) mapLikeType19, typeBindings22);
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean25 = simpleType24.isAbstract();
        boolean boolean26 = simpleType24.isReferenceType();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType27 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, (com.fasterxml.jackson.databind.JavaType) mapLikeType19, (com.fasterxml.jackson.databind.JavaType) simpleType24);
        com.fasterxml.jackson.databind.JavaType javaType28 = mapLikeType27.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType29 = mapLikeType27.getKeyType();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType30 = mapLikeType27.withStaticTyping();
        java.lang.Object obj31 = mapLikeType30.getContentTypeHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mapLikeType27 and mapLikeType30", mapLikeType27.equals(mapLikeType30) ? mapLikeType27.hashCode() == mapLikeType30.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType15.hasHandlers();
        java.lang.String str17 = collectionLikeType15.toCanonical();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType15.withStaticTyping();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType21 = simpleType19.withValueHandler((java.lang.Object) '#');
        java.lang.String str22 = javaType21.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean24 = simpleType23.isAbstract();
        boolean boolean25 = simpleType23.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType26 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType21, (com.fasterxml.jackson.databind.JavaType) simpleType23);
        boolean boolean27 = collectionLikeType26.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType30 = simpleType28.withValueHandler((java.lang.Object) '#');
        java.lang.String str31 = javaType30.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType32 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean33 = simpleType32.isAbstract();
        boolean boolean34 = simpleType32.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType35 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType30, (com.fasterxml.jackson.databind.JavaType) simpleType32);
        boolean boolean36 = collectionLikeType35.hasHandlers();
        boolean boolean37 = collectionLikeType35.hasHandlers();
        boolean boolean38 = collectionLikeType35.isTrueCollectionType();
        boolean boolean39 = collectionLikeType35.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean41 = simpleType40.isAbstract();
        java.lang.String str42 = simpleType40.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType43 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType35, (com.fasterxml.jackson.databind.JavaType) simpleType40);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType44 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType26, (com.fasterxml.jackson.databind.JavaType) simpleType40);
        boolean boolean45 = collectionLikeType26.isInterface();
        com.fasterxml.jackson.databind.JavaType javaType47 = collectionLikeType26.containedType((-1));
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType48 = collectionLikeType18.withContentValueHandler((java.lang.Object) javaType47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType18", collectionLikeType7.equals(collectionLikeType18) ? collectionLikeType7.hashCode() == collectionLikeType18.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.isEnumType();
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7.containedType((int) (byte) 10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean13 = simpleType12.isCollectionLikeType();
        boolean boolean14 = simpleType12.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType15.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType19 = simpleType17.withValueHandler((java.lang.Object) '#');
        java.lang.String str20 = javaType19.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean22 = simpleType21.isAbstract();
        boolean boolean23 = simpleType21.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType19, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType25 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType12, javaType16, javaType19);
        java.lang.Object obj26 = mapLikeType25.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType27 = mapLikeType25._valueType;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType28 = collectionLikeType7.withContentValueHandler((java.lang.Object) javaType27);
        boolean boolean29 = collectionLikeType7.hasGenericTypes();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType28", collectionLikeType7.equals(collectionLikeType28) ? collectionLikeType7.hashCode() == collectionLikeType28.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean17 = collectionLikeType16.isContainerType();
        java.lang.Object obj18 = collectionLikeType16.getContentTypeHandler();
        boolean boolean19 = collectionLikeType16.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = collectionLikeType16.getValueHandler();
        java.lang.Object obj21 = collectionLikeType16.getContentTypeHandler();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = collectionLikeType16.withContentTypeHandler((java.lang.Object) "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        java.lang.String str24 = collectionLikeType16.toCanonical();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType16 and collectionLikeType23", collectionLikeType16.equals(collectionLikeType23) ? collectionLikeType16.hashCode() == collectionLikeType23.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.isEnumType();
        boolean boolean10 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType11 = collectionLikeType7.withStaticTyping();
        java.lang.String str12 = collectionLikeType7.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType11", collectionLikeType7.equals(collectionLikeType11) ? collectionLikeType7.hashCode() == collectionLikeType11.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.isEnumType();
        boolean boolean10 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType11 = collectionLikeType7.withStaticTyping();
        com.fasterxml.jackson.databind.JavaType javaType12 = collectionLikeType7.getSuperClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType11", collectionLikeType7.equals(collectionLikeType11) ? collectionLikeType7.hashCode() == collectionLikeType11.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.hasHandlers();
        boolean boolean12 = collectionLikeType7.isTrueCollectionType();
        java.lang.String str13 = collectionLikeType7.toString();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType15.withValueHandler((java.lang.Object) '#');
        java.lang.String str18 = javaType17.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean20 = simpleType19.isAbstract();
        boolean boolean21 = simpleType19.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType17, (com.fasterxml.jackson.databind.JavaType) simpleType19);
        boolean boolean23 = collectionLikeType22.hasHandlers();
        int int24 = collectionLikeType22.containedTypeCount();
        boolean boolean25 = collectionLikeType22.isTrueCollectionType();
        boolean boolean26 = collectionLikeType22.isReferenceType();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        boolean boolean28 = javaType27.isInterface();
        int int29 = javaType27.containedTypeCount();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType30 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType22, javaType27);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType31 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType14, (com.fasterxml.jackson.databind.JavaType) collectionLikeType22);
        java.lang.Object obj32 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType33 = collectionLikeType22.withTypeHandler(obj32);
        int int34 = collectionLikeType22.containedTypeCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType33", collectionLikeType7.equals(collectionLikeType33) ? collectionLikeType7.hashCode() == collectionLikeType33.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean17 = collectionLikeType16.isContainerType();
        java.lang.Object obj18 = collectionLikeType16.getContentTypeHandler();
        boolean boolean19 = collectionLikeType16.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = collectionLikeType16.getValueHandler();
        java.lang.Object obj21 = collectionLikeType16.getContentTypeHandler();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = collectionLikeType16.withContentTypeHandler((java.lang.Object) "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType26 = simpleType24.withValueHandler((java.lang.Object) '#');
        java.lang.String str27 = javaType26.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean29 = simpleType28.isAbstract();
        boolean boolean30 = simpleType28.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType31 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType26, (com.fasterxml.jackson.databind.JavaType) simpleType28);
        boolean boolean32 = collectionLikeType31.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType33 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType35 = simpleType33.withValueHandler((java.lang.Object) '#');
        java.lang.String str36 = javaType35.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType37 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean38 = simpleType37.isAbstract();
        boolean boolean39 = simpleType37.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType40 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType35, (com.fasterxml.jackson.databind.JavaType) simpleType37);
        boolean boolean41 = collectionLikeType40.hasHandlers();
        boolean boolean42 = collectionLikeType40.hasHandlers();
        boolean boolean43 = collectionLikeType40.isTrueCollectionType();
        boolean boolean44 = collectionLikeType40.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType45 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean46 = simpleType45.isAbstract();
        java.lang.String str47 = simpleType45.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType48 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType40, (com.fasterxml.jackson.databind.JavaType) simpleType45);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType49 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType31, (com.fasterxml.jackson.databind.JavaType) simpleType45);
        java.lang.Object obj50 = collectionLikeType49.getContentValueHandler();
        com.fasterxml.jackson.databind.type.SimpleType simpleType51 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType53 = simpleType51.withValueHandler((java.lang.Object) '#');
        java.lang.String str54 = javaType53.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType55 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean56 = simpleType55.isAbstract();
        boolean boolean57 = simpleType55.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType58 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType53, (com.fasterxml.jackson.databind.JavaType) simpleType55);
        boolean boolean59 = collectionLikeType58.hasHandlers();
        boolean boolean60 = collectionLikeType58.hasHandlers();
        boolean boolean61 = collectionLikeType58.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType62 = collectionLikeType58._elementType;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType63 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType49, (com.fasterxml.jackson.databind.JavaType) collectionLikeType58);
        java.lang.Object obj64 = collectionLikeType63.getContentTypeHandler();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType65 = collectionLikeType23.withContentValueHandler(obj64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType16 and collectionLikeType23", collectionLikeType16.equals(collectionLikeType23) ? collectionLikeType16.hashCode() == collectionLikeType23.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean11 = simpleType10.isCollectionLikeType();
        boolean boolean12 = simpleType10.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType13.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType15.withValueHandler((java.lang.Object) '#');
        java.lang.String str18 = javaType17.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean20 = simpleType19.isAbstract();
        boolean boolean21 = simpleType19.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType17, (com.fasterxml.jackson.databind.JavaType) simpleType19);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType23 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType10, javaType14, javaType17);
        java.lang.Object obj24 = mapLikeType23.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType25 = mapLikeType23._valueType;
        com.fasterxml.jackson.databind.JavaType javaType26 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType23);
        java.lang.String str27 = collectionLikeType7.toString();
        boolean boolean28 = collectionLikeType7.hasContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = collectionLikeType7.withStaticTyping();
        boolean boolean30 = collectionLikeType29.isReferenceType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType29", collectionLikeType7.equals(collectionLikeType29) ? collectionLikeType7.hashCode() == collectionLikeType29.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.isEnumType();
        boolean boolean10 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType11 = collectionLikeType7.withStaticTyping();
        java.lang.String str13 = collectionLikeType7.containedTypeName((int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType11", collectionLikeType7.equals(collectionLikeType11) ? collectionLikeType7.hashCode() == collectionLikeType11.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.Class<?> wildcardClass3 = typeFactory1._findPrimitive("");
        typeFactory1.clearCache();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean7 = simpleType6.isCollectionLikeType();
        boolean boolean8 = simpleType6.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType10 = simpleType9.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType11.withValueHandler((java.lang.Object) '#');
        java.lang.String str14 = javaType13.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean16 = simpleType15.isAbstract();
        boolean boolean17 = simpleType15.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType19 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType6, javaType10, javaType13);
        java.lang.Object obj20 = mapLikeType19.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType21 = mapLikeType19._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory5.constructType((java.lang.reflect.Type) mapLikeType19, typeBindings22);
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory5._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType26 = javaType24.containedTypeOrUnknown((int) (short) 10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType29 = simpleType27.withValueHandler((java.lang.Object) '#');
        java.lang.String str30 = javaType29.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean32 = simpleType31.isAbstract();
        boolean boolean33 = simpleType31.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType29, (com.fasterxml.jackson.databind.JavaType) simpleType31);
        com.fasterxml.jackson.databind.JavaType javaType35 = typeFactory1.constructType((java.lang.reflect.Type) javaType24, (com.fasterxml.jackson.databind.JavaType) collectionLikeType34);
        int int36 = collectionLikeType34.containedTypeCount();
        boolean boolean37 = collectionLikeType34.isEnumType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType40 = simpleType38.withValueHandler((java.lang.Object) '#');
        java.lang.String str41 = javaType40.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType42 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean43 = simpleType42.isAbstract();
        boolean boolean44 = simpleType42.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType45 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType40, (com.fasterxml.jackson.databind.JavaType) simpleType42);
        boolean boolean46 = collectionLikeType45.hasHandlers();
        boolean boolean47 = collectionLikeType45.hasHandlers();
        boolean boolean48 = collectionLikeType45.isTrueCollectionType();
        boolean boolean49 = collectionLikeType45.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType50 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean51 = simpleType50.isAbstract();
        java.lang.String str52 = simpleType50.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType53 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType45, (com.fasterxml.jackson.databind.JavaType) simpleType50);
        boolean boolean54 = collectionLikeType45.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType56 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType58 = simpleType56.withValueHandler((java.lang.Object) '#');
        java.lang.String str59 = javaType58.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType60 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean61 = simpleType60.isAbstract();
        boolean boolean62 = simpleType60.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType63 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType58, (com.fasterxml.jackson.databind.JavaType) simpleType60);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings64 = null;
        com.fasterxml.jackson.databind.JavaType javaType65 = typeFactory55.constructType((java.lang.reflect.Type) simpleType60, typeBindings64);
        com.fasterxml.jackson.databind.JavaType javaType66 = collectionLikeType45.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType60);
        java.lang.Class<?> wildcardClass67 = javaType66.getParameterSource();
        com.fasterxml.jackson.databind.JavaType javaType68 = collectionLikeType34.withContentTypeHandler((java.lang.Object) javaType66);
        boolean boolean69 = collectionLikeType34.hasHandlers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType18 and javaType68", collectionLikeType18.equals(javaType68) ? collectionLikeType18.hashCode() == javaType68.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = collectionLikeType7.withStaticTyping();
        boolean boolean18 = collectionLikeType17.isEnumType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType17", collectionLikeType7.equals(collectionLikeType17) ? collectionLikeType7.hashCode() == collectionLikeType17.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory17.constructType((java.lang.reflect.Type) simpleType22, typeBindings26);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType30 = simpleType29.getSuperClass();
        java.lang.String str32 = simpleType29.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType33 = simpleType29.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType34 = simpleType29.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType35 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType29);
        java.lang.String str36 = collectionLikeType35.buildCanonicalName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType35", collectionLikeType7.equals(collectionLikeType35) ? collectionLikeType7.hashCode() == collectionLikeType35.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7._elementType;
        boolean boolean12 = collectionLikeType7.isFinal();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = simpleType13.getBindings();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType18 = simpleType16.withValueHandler((java.lang.Object) '#');
        java.lang.String str19 = javaType18.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean21 = simpleType20.isAbstract();
        boolean boolean22 = simpleType20.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType18, (com.fasterxml.jackson.databind.JavaType) simpleType20);
        boolean boolean24 = collectionLikeType23.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType25 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType27 = simpleType25.withValueHandler((java.lang.Object) '#');
        java.lang.String str28 = javaType27.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean30 = simpleType29.isAbstract();
        boolean boolean31 = simpleType29.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType32 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType27, (com.fasterxml.jackson.databind.JavaType) simpleType29);
        boolean boolean33 = collectionLikeType32.hasHandlers();
        boolean boolean34 = collectionLikeType32.hasHandlers();
        boolean boolean35 = collectionLikeType32.isTrueCollectionType();
        boolean boolean36 = collectionLikeType32.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType37 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean38 = simpleType37.isAbstract();
        java.lang.String str39 = simpleType37.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType40 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType32, (com.fasterxml.jackson.databind.JavaType) simpleType37);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType41 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType23, (com.fasterxml.jackson.databind.JavaType) simpleType37);
        java.lang.Object obj42 = collectionLikeType41.getContentValueHandler();
        boolean boolean43 = collectionLikeType41.isPrimitive();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType44 = collectionLikeType7.withContentTypeHandler((java.lang.Object) collectionLikeType41);
        java.lang.String str45 = collectionLikeType44.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType44", collectionLikeType7.equals(collectionLikeType44) ? collectionLikeType7.hashCode() == collectionLikeType44.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13.getKeyType();
        java.lang.String str15 = mapLikeType13.buildCanonicalName();
        com.fasterxml.jackson.databind.JavaType javaType16 = mapLikeType13.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getContentType();
        boolean boolean18 = mapLikeType13.useStaticType();
        com.fasterxml.jackson.databind.JavaType javaType19 = mapLikeType13._valueType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = simpleType20.withValueHandler((java.lang.Object) '#');
        java.lang.String str23 = javaType22.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean25 = simpleType24.isAbstract();
        boolean boolean26 = simpleType24.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType22, (com.fasterxml.jackson.databind.JavaType) simpleType24);
        boolean boolean28 = collectionLikeType27.hasHandlers();
        boolean boolean29 = collectionLikeType27.hasHandlers();
        boolean boolean30 = collectionLikeType27.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionLikeType27._elementType;
        boolean boolean32 = collectionLikeType27.isFinal();
        com.fasterxml.jackson.databind.type.SimpleType simpleType33 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings34 = simpleType33.getBindings();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType35 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType27, (com.fasterxml.jackson.databind.JavaType) simpleType33);
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType38 = simpleType36.withValueHandler((java.lang.Object) '#');
        java.lang.String str39 = javaType38.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean41 = simpleType40.isAbstract();
        boolean boolean42 = simpleType40.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType43 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType38, (com.fasterxml.jackson.databind.JavaType) simpleType40);
        boolean boolean44 = collectionLikeType43.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType45 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType47 = simpleType45.withValueHandler((java.lang.Object) '#');
        java.lang.String str48 = javaType47.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType49 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean50 = simpleType49.isAbstract();
        boolean boolean51 = simpleType49.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType52 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType47, (com.fasterxml.jackson.databind.JavaType) simpleType49);
        boolean boolean53 = collectionLikeType52.hasHandlers();
        boolean boolean54 = collectionLikeType52.hasHandlers();
        boolean boolean55 = collectionLikeType52.isTrueCollectionType();
        boolean boolean56 = collectionLikeType52.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType57 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean58 = simpleType57.isAbstract();
        java.lang.String str59 = simpleType57.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType60 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType52, (com.fasterxml.jackson.databind.JavaType) simpleType57);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType61 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType43, (com.fasterxml.jackson.databind.JavaType) simpleType57);
        java.lang.Object obj62 = collectionLikeType61.getContentValueHandler();
        boolean boolean63 = collectionLikeType61.isPrimitive();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType64 = collectionLikeType27.withContentTypeHandler((java.lang.Object) collectionLikeType61);
        boolean boolean65 = mapLikeType13.equals((java.lang.Object) collectionLikeType61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType12 and collectionLikeType64", collectionLikeType12.equals(collectionLikeType64) ? collectionLikeType12.hashCode() == collectionLikeType64.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        java.lang.Object obj9 = collectionLikeType7.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType10 = collectionLikeType7.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean12 = simpleType11.isCollectionLikeType();
        boolean boolean13 = simpleType11.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType15 = simpleType14.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType18 = simpleType16.withValueHandler((java.lang.Object) '#');
        java.lang.String str19 = javaType18.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean21 = simpleType20.isAbstract();
        boolean boolean22 = simpleType20.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType18, (com.fasterxml.jackson.databind.JavaType) simpleType20);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType24 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType11, javaType15, javaType18);
        com.fasterxml.jackson.databind.JavaType javaType25 = mapLikeType24.getKeyType();
        java.lang.String str26 = mapLikeType24.buildCanonicalName();
        com.fasterxml.jackson.databind.JavaType javaType27 = mapLikeType24.getContentType();
        java.lang.String str28 = mapLikeType24.toString();
        boolean boolean29 = mapLikeType24.isMapLikeType();
        boolean boolean30 = mapLikeType24.isTrueMapType();
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionLikeType7.withContentTypeHandler((java.lang.Object) boolean30);
        java.lang.reflect.Type type32 = javaType31.getTypeHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType31", collectionLikeType7.equals(javaType31) ? collectionLikeType7.hashCode() == javaType31.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7._elementType;
        boolean boolean12 = collectionLikeType7.isFinal();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = simpleType13.getBindings();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType18 = simpleType16.withValueHandler((java.lang.Object) '#');
        java.lang.String str19 = javaType18.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean21 = simpleType20.isAbstract();
        boolean boolean22 = simpleType20.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType18, (com.fasterxml.jackson.databind.JavaType) simpleType20);
        boolean boolean24 = collectionLikeType23.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType25 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType27 = simpleType25.withValueHandler((java.lang.Object) '#');
        java.lang.String str28 = javaType27.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean30 = simpleType29.isAbstract();
        boolean boolean31 = simpleType29.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType32 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType27, (com.fasterxml.jackson.databind.JavaType) simpleType29);
        boolean boolean33 = collectionLikeType32.hasHandlers();
        boolean boolean34 = collectionLikeType32.hasHandlers();
        boolean boolean35 = collectionLikeType32.isTrueCollectionType();
        boolean boolean36 = collectionLikeType32.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType37 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean38 = simpleType37.isAbstract();
        java.lang.String str39 = simpleType37.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType40 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType32, (com.fasterxml.jackson.databind.JavaType) simpleType37);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType41 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType23, (com.fasterxml.jackson.databind.JavaType) simpleType37);
        java.lang.Object obj42 = collectionLikeType41.getContentValueHandler();
        boolean boolean43 = collectionLikeType41.isPrimitive();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType44 = collectionLikeType7.withContentTypeHandler((java.lang.Object) collectionLikeType41);
        com.fasterxml.jackson.databind.type.SimpleType simpleType45 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType47 = simpleType45.withValueHandler((java.lang.Object) '#');
        java.lang.String str48 = javaType47.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType49 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean50 = simpleType49.isAbstract();
        boolean boolean51 = simpleType49.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType52 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType47, (com.fasterxml.jackson.databind.JavaType) simpleType49);
        boolean boolean53 = collectionLikeType52.isReferenceType();
        java.lang.String str54 = collectionLikeType52.buildCanonicalName();
        boolean boolean55 = collectionLikeType52.isFinal();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType56 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType44, (com.fasterxml.jackson.databind.JavaType) collectionLikeType52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType44", collectionLikeType7.equals(collectionLikeType44) ? collectionLikeType7.hashCode() == collectionLikeType44.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean2 = simpleType1.isAbstract();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = simpleType6.withValueHandler((java.lang.Object) '#');
        java.lang.String str9 = javaType8.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean11 = simpleType10.isAbstract();
        boolean boolean12 = simpleType10.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType13 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        boolean boolean14 = collectionLikeType13.hasHandlers();
        boolean boolean15 = collectionLikeType13.hasHandlers();
        boolean boolean16 = collectionLikeType13.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory17.constructType((java.lang.reflect.Type) simpleType22, typeBindings26);
        com.fasterxml.jackson.databind.type.ClassStack classStack28 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean30 = simpleType29.isCollectionLikeType();
        boolean boolean31 = simpleType29.isAbstract();
        boolean boolean32 = simpleType29.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings33 = null;
        com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory17._fromAny(classStack28, (java.lang.reflect.Type) simpleType29, typeBindings33);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType35 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType13, javaType34);
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean37 = simpleType36.isCollectionLikeType();
        boolean boolean38 = simpleType36.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType39 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType40 = simpleType39.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType41 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType43 = simpleType41.withValueHandler((java.lang.Object) '#');
        java.lang.String str44 = javaType43.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType45 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean46 = simpleType45.isAbstract();
        boolean boolean47 = simpleType45.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType48 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType43, (com.fasterxml.jackson.databind.JavaType) simpleType45);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType49 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType36, javaType40, javaType43);
        com.fasterxml.jackson.databind.JavaType javaType50 = mapLikeType49.getContentType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings51 = javaType50.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType52 = typeFactory0.constructType((java.lang.reflect.Type) collectionLikeType35, typeBindings51);
        com.fasterxml.jackson.databind.JavaType javaType53 = javaType52.withStaticTyping();
        boolean boolean54 = javaType52.isConcrete();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on javaType52 and javaType53", javaType52.equals(javaType53) ? javaType52.hashCode() == javaType53.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType3.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType5.withValueHandler((java.lang.Object) '#');
        java.lang.String str8 = javaType7.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean10 = simpleType9.isAbstract();
        boolean boolean11 = simpleType9.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType7, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType13 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType4, javaType7);
        com.fasterxml.jackson.databind.JavaType javaType14 = mapLikeType13._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean17 = collectionLikeType16.isContainerType();
        java.lang.Object obj18 = collectionLikeType16.getContentTypeHandler();
        boolean boolean19 = collectionLikeType16.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = collectionLikeType16.getValueHandler();
        java.lang.Object obj21 = collectionLikeType16.getContentTypeHandler();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = collectionLikeType16.withContentTypeHandler((java.lang.Object) "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        boolean boolean24 = collectionLikeType16.isTrueCollectionType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType16 and collectionLikeType23", collectionLikeType16.equals(collectionLikeType23) ? collectionLikeType16.hashCode() == collectionLikeType23.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.isEnumType();
        boolean boolean10 = collectionLikeType7.isConcrete();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType11 = collectionLikeType7.withStaticTyping();
        java.lang.String str12 = collectionLikeType7.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType11", collectionLikeType7.equals(collectionLikeType11) ? collectionLikeType7.hashCode() == collectionLikeType11.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType7._elementType;
        boolean boolean31 = collectionLikeType7.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType32 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        boolean boolean33 = simpleType32.isContainerType();
        boolean boolean34 = simpleType32.isFinal();
        java.lang.Object obj35 = simpleType32.getContentValueHandler();
        boolean boolean36 = simpleType32.isArrayType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean39 = simpleType38.isCollectionLikeType();
        boolean boolean40 = simpleType38.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType41 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType42 = simpleType41.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType43 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType45 = simpleType43.withValueHandler((java.lang.Object) '#');
        java.lang.String str46 = javaType45.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean48 = simpleType47.isAbstract();
        boolean boolean49 = simpleType47.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType50 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType45, (com.fasterxml.jackson.databind.JavaType) simpleType47);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType51 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType38, javaType42, javaType45);
        java.lang.Object obj52 = mapLikeType51.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType53 = mapLikeType51._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings54 = null;
        com.fasterxml.jackson.databind.JavaType javaType55 = typeFactory37.constructType((java.lang.reflect.Type) mapLikeType51, typeBindings54);
        com.fasterxml.jackson.databind.type.SimpleType simpleType56 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean57 = simpleType56.isAbstract();
        boolean boolean58 = simpleType56.isReferenceType();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType59 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType32, (com.fasterxml.jackson.databind.JavaType) mapLikeType51, (com.fasterxml.jackson.databind.JavaType) simpleType56);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType61 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType63 = simpleType61.withValueHandler((java.lang.Object) '#');
        java.lang.String str64 = javaType63.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType65 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean66 = simpleType65.isAbstract();
        boolean boolean67 = simpleType65.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType68 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType63, (com.fasterxml.jackson.databind.JavaType) simpleType65);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings69 = null;
        com.fasterxml.jackson.databind.JavaType javaType70 = typeFactory60.constructType((java.lang.reflect.Type) simpleType65, typeBindings69);
        com.fasterxml.jackson.databind.type.ClassStack classStack71 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType72 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean73 = simpleType72.isCollectionLikeType();
        boolean boolean74 = simpleType72.isAbstract();
        boolean boolean75 = simpleType72.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings76 = null;
        com.fasterxml.jackson.databind.JavaType javaType77 = typeFactory60._fromAny(classStack71, (java.lang.reflect.Type) simpleType72, typeBindings76);
        com.fasterxml.jackson.databind.JavaType javaType78 = simpleType72.getContentType();
        boolean boolean79 = simpleType72.hasGenericTypes();
        com.fasterxml.jackson.databind.JavaType javaType80 = simpleType32.withValueHandler((java.lang.Object) boolean79);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType81 = collectionLikeType7.withValueHandler((java.lang.Object) javaType80);
        boolean boolean82 = javaType80.isThrowable();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType81", collectionLikeType7.equals(collectionLikeType81) ? collectionLikeType7.hashCode() == collectionLikeType81.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType7.withStaticTyping();
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionLikeType7.getContentType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType30", collectionLikeType7.equals(javaType30) ? collectionLikeType7.hashCode() == javaType30.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.isEnumType();
        java.lang.String str10 = collectionLikeType7.toString();
        java.lang.Object obj11 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType12 = collectionLikeType7.withContentValueHandler(obj11);
        java.util.Collection<com.fasterxml.jackson.databind.JavaType> javaTypeCollection13 = collectionLikeType7.getTypeHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType12", collectionLikeType7.equals(collectionLikeType12) ? collectionLikeType7.hashCode() == collectionLikeType12.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType11 = simpleType9.withValueHandler((java.lang.Object) '#');
        java.lang.String str12 = javaType11.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean14 = simpleType13.isAbstract();
        boolean boolean15 = simpleType13.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType11, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        boolean boolean17 = collectionLikeType16.hasHandlers();
        boolean boolean18 = collectionLikeType16.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean20 = simpleType19.isCollectionLikeType();
        boolean boolean21 = simpleType19.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType23 = simpleType22.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType26 = simpleType24.withValueHandler((java.lang.Object) '#');
        java.lang.String str27 = javaType26.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean29 = simpleType28.isAbstract();
        boolean boolean30 = simpleType28.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType31 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType26, (com.fasterxml.jackson.databind.JavaType) simpleType28);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType32 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType19, javaType23, javaType26);
        java.lang.Object obj33 = mapLikeType32.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType34 = mapLikeType32._valueType;
        com.fasterxml.jackson.databind.JavaType javaType35 = collectionLikeType16.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType32);
        boolean boolean36 = collectionLikeType16.isFinal();
        java.lang.String str37 = collectionLikeType16.toString();
        com.fasterxml.jackson.databind.JavaType javaType38 = collectionLikeType7.withTypeHandler((java.lang.Object) collectionLikeType16);
        java.lang.String str39 = collectionLikeType7.toCanonical();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType38", collectionLikeType7.equals(javaType38) ? collectionLikeType7.hashCode() == javaType38.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9.constructType((java.lang.reflect.Type) simpleType14, typeBindings18);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        boolean boolean24 = simpleType21.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory9._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withValueHandler((java.lang.Object) typeFactory9);
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType30 = simpleType28.withValueHandler((java.lang.Object) '#');
        java.lang.String str31 = javaType30.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType32 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean33 = simpleType32.isAbstract();
        boolean boolean34 = simpleType32.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType35 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType30, (com.fasterxml.jackson.databind.JavaType) simpleType32);
        boolean boolean36 = collectionLikeType35.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType37 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType39 = simpleType37.withValueHandler((java.lang.Object) '#');
        java.lang.String str40 = javaType39.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType41 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean42 = simpleType41.isAbstract();
        boolean boolean43 = simpleType41.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType44 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType39, (com.fasterxml.jackson.databind.JavaType) simpleType41);
        boolean boolean45 = collectionLikeType44.hasHandlers();
        boolean boolean46 = collectionLikeType44.hasHandlers();
        boolean boolean47 = collectionLikeType44.isTrueCollectionType();
        boolean boolean48 = collectionLikeType44.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType49 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean50 = simpleType49.isAbstract();
        java.lang.String str51 = simpleType49.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType52 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType44, (com.fasterxml.jackson.databind.JavaType) simpleType49);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType53 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType35, (com.fasterxml.jackson.databind.JavaType) simpleType49);
        boolean boolean54 = collectionLikeType35.isInterface();
        java.lang.Object obj55 = collectionLikeType35.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType56 = collectionLikeType27.withTypeHandler(obj55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.Class<?> wildcardClass3 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory1.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = simpleType6.withValueHandler((java.lang.Object) '#');
        java.lang.String str9 = javaType8.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean11 = simpleType10.isAbstract();
        boolean boolean12 = simpleType10.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType13 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        boolean boolean14 = collectionLikeType13.hasHandlers();
        boolean boolean15 = collectionLikeType13.hasHandlers();
        boolean boolean16 = collectionLikeType13.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType17 = collectionLikeType13._elementType;
        boolean boolean18 = collectionLikeType13.isArrayType();
        int int19 = collectionLikeType13.containedTypeCount();
        boolean boolean20 = collectionLikeType13.hasHandlers();
        boolean boolean21 = collectionLikeType13.isTrueCollectionType();
        java.lang.Object obj22 = collectionLikeType13.getContentValueHandler();
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType26 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType27 = simpleType26.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType30 = simpleType28.withValueHandler((java.lang.Object) '#');
        java.lang.String str31 = javaType30.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType32 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean33 = simpleType32.isAbstract();
        boolean boolean34 = simpleType32.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType35 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType30, (com.fasterxml.jackson.databind.JavaType) simpleType32);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType36 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType23, javaType27, javaType30);
        com.fasterxml.jackson.databind.JavaType javaType37 = mapLikeType36._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType39 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType36, (com.fasterxml.jackson.databind.JavaType) simpleType38);
        boolean boolean40 = collectionLikeType39.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType41 = collectionLikeType39._elementType;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType43 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType45 = simpleType43.withValueHandler((java.lang.Object) '#');
        java.lang.String str46 = javaType45.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean48 = simpleType47.isAbstract();
        boolean boolean49 = simpleType47.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType50 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType45, (com.fasterxml.jackson.databind.JavaType) simpleType47);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings51 = null;
        com.fasterxml.jackson.databind.JavaType javaType52 = typeFactory42.constructType((java.lang.reflect.Type) simpleType47, typeBindings51);
        com.fasterxml.jackson.databind.JavaType javaType53 = collectionLikeType39.withContentType(javaType52);
        com.fasterxml.jackson.databind.JavaType javaType54 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) collectionLikeType13, javaType52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on javaType54 and javaType53", javaType54.equals(javaType53) ? javaType54.hashCode() == javaType53.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType12.getSuperClass();
        java.lang.String str15 = simpleType12.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType12.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType12.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType12);
        java.lang.Object obj19 = collectionLikeType18.getContentTypeHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType18", collectionLikeType7.equals(collectionLikeType18) ? collectionLikeType7.hashCode() == collectionLikeType18.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7.withStaticTyping();
        boolean boolean13 = collectionLikeType7.equals((java.lang.Object) "java.lang.Enum<java.lang.Enum>");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType11", collectionLikeType7.equals(javaType11) ? collectionLikeType7.hashCode() == javaType11.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        java.lang.String str10 = collectionLikeType7.toCanonical();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = collectionLikeType7.getBindings();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean13 = simpleType12.isCollectionLikeType();
        boolean boolean14 = simpleType12.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType15.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType19 = simpleType17.withValueHandler((java.lang.Object) '#');
        java.lang.String str20 = javaType19.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean22 = simpleType21.isAbstract();
        boolean boolean23 = simpleType21.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType19, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType25 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType12, javaType16, javaType19);
        com.fasterxml.jackson.databind.JavaType javaType26 = mapLikeType25.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType27 = mapLikeType25.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType28 = collectionLikeType7.withValueHandler((java.lang.Object) javaType27);
        java.lang.String str29 = collectionLikeType7.getTypeName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType28", collectionLikeType7.equals(collectionLikeType28) ? collectionLikeType7.hashCode() == collectionLikeType28.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        java.lang.String str30 = collectionLikeType29.toString();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean32 = simpleType31.isCollectionLikeType();
        boolean boolean33 = simpleType31.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType35 = simpleType34.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType38 = simpleType36.withValueHandler((java.lang.Object) '#');
        java.lang.String str39 = javaType38.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean41 = simpleType40.isAbstract();
        boolean boolean42 = simpleType40.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType43 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType38, (com.fasterxml.jackson.databind.JavaType) simpleType40);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType44 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType31, javaType35, javaType38);
        com.fasterxml.jackson.databind.JavaType javaType45 = mapLikeType44.getContentType();
        boolean boolean46 = collectionLikeType29.equals((java.lang.Object) mapLikeType44);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap47);
        java.lang.Class<?> wildcardClass50 = typeFactory48._findPrimitive("");
        typeFactory48.clearCache();
        java.lang.Class<?> wildcardClass53 = typeFactory48._findPrimitive("Ljava/lang/Enum;");
        com.fasterxml.jackson.databind.type.TypeParser typeParser54 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser55 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType56 = collectionLikeType29.withValueHandler((java.lang.Object) typeFactory48);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap57);
        java.lang.Class<?> wildcardClass60 = typeFactory58._findPrimitive("");
        typeFactory58.clearCache();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType63 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean64 = simpleType63.isCollectionLikeType();
        boolean boolean65 = simpleType63.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType66 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType67 = simpleType66.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType68 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType70 = simpleType68.withValueHandler((java.lang.Object) '#');
        java.lang.String str71 = javaType70.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType72 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean73 = simpleType72.isAbstract();
        boolean boolean74 = simpleType72.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType75 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType70, (com.fasterxml.jackson.databind.JavaType) simpleType72);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType76 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType63, javaType67, javaType70);
        java.lang.Object obj77 = mapLikeType76.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType78 = mapLikeType76._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings79 = null;
        com.fasterxml.jackson.databind.JavaType javaType80 = typeFactory62.constructType((java.lang.reflect.Type) mapLikeType76, typeBindings79);
        com.fasterxml.jackson.databind.JavaType javaType81 = typeFactory62._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType83 = javaType81.containedTypeOrUnknown((int) (short) 10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType84 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType86 = simpleType84.withValueHandler((java.lang.Object) '#');
        java.lang.String str87 = javaType86.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType88 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean89 = simpleType88.isAbstract();
        boolean boolean90 = simpleType88.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType91 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType86, (com.fasterxml.jackson.databind.JavaType) simpleType88);
        com.fasterxml.jackson.databind.JavaType javaType92 = typeFactory58.constructType((java.lang.reflect.Type) javaType81, (com.fasterxml.jackson.databind.JavaType) collectionLikeType91);
        int int93 = collectionLikeType91.containedTypeCount();
        boolean boolean94 = collectionLikeType91.isEnumType();
        int int95 = collectionLikeType91.containedTypeCount();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType96 = collectionLikeType56.withContentValueHandler((java.lang.Object) int95);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType56", collectionLikeType29.equals(collectionLikeType56) ? collectionLikeType29.hashCode() == collectionLikeType56.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        java.lang.String str10 = collectionLikeType7.toCanonical();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = collectionLikeType7.getBindings();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean13 = simpleType12.isCollectionLikeType();
        boolean boolean14 = simpleType12.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType15.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType19 = simpleType17.withValueHandler((java.lang.Object) '#');
        java.lang.String str20 = javaType19.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean22 = simpleType21.isAbstract();
        boolean boolean23 = simpleType21.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType19, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType25 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType12, javaType16, javaType19);
        com.fasterxml.jackson.databind.JavaType javaType26 = mapLikeType25.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType27 = mapLikeType25.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType28 = collectionLikeType7.withValueHandler((java.lang.Object) javaType27);
        boolean boolean29 = collectionLikeType28.isInterface();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType28", collectionLikeType7.equals(collectionLikeType28) ? collectionLikeType7.hashCode() == collectionLikeType28.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType9 = collectionLikeType7.withStaticTyping();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType9", collectionLikeType7.equals(collectionLikeType9) ? collectionLikeType7.hashCode() == collectionLikeType9.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        boolean boolean1 = simpleType0.isContainerType();
        boolean boolean2 = simpleType0.isFinal();
        java.lang.Object obj3 = simpleType0.getContentValueHandler();
        boolean boolean4 = simpleType0.isArrayType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean7 = simpleType6.isCollectionLikeType();
        boolean boolean8 = simpleType6.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType10 = simpleType9.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType11.withValueHandler((java.lang.Object) '#');
        java.lang.String str14 = javaType13.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean16 = simpleType15.isAbstract();
        boolean boolean17 = simpleType15.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType19 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType6, javaType10, javaType13);
        java.lang.Object obj20 = mapLikeType19.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType21 = mapLikeType19._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory5.constructType((java.lang.reflect.Type) mapLikeType19, typeBindings22);
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean25 = simpleType24.isAbstract();
        boolean boolean26 = simpleType24.isReferenceType();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType27 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, (com.fasterxml.jackson.databind.JavaType) mapLikeType19, (com.fasterxml.jackson.databind.JavaType) simpleType24);
        com.fasterxml.jackson.databind.JavaType javaType28 = mapLikeType27.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType29 = mapLikeType27.getKeyType();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType30 = mapLikeType27.withStaticTyping();
        java.lang.String str31 = mapLikeType27.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mapLikeType27 and mapLikeType30", mapLikeType27.equals(mapLikeType30) ? mapLikeType27.hashCode() == mapLikeType30.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = collectionLikeType7.withStaticTyping();
        java.lang.String str18 = collectionLikeType17.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType17", collectionLikeType7.equals(collectionLikeType17) ? collectionLikeType7.hashCode() == collectionLikeType17.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        java.lang.String str30 = collectionLikeType29.toString();
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionLikeType29.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType32 = collectionLikeType29.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType33 = collectionLikeType29.withStaticTyping();
        boolean boolean34 = collectionLikeType29.isEnumType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType33", collectionLikeType29.equals(collectionLikeType33) ? collectionLikeType29.hashCode() == collectionLikeType33.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        java.lang.String str30 = collectionLikeType29.toString();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean32 = simpleType31.isCollectionLikeType();
        boolean boolean33 = simpleType31.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType35 = simpleType34.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType38 = simpleType36.withValueHandler((java.lang.Object) '#');
        java.lang.String str39 = javaType38.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean41 = simpleType40.isAbstract();
        boolean boolean42 = simpleType40.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType43 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType38, (com.fasterxml.jackson.databind.JavaType) simpleType40);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType44 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType31, javaType35, javaType38);
        com.fasterxml.jackson.databind.JavaType javaType45 = mapLikeType44.getContentType();
        boolean boolean46 = collectionLikeType29.equals((java.lang.Object) mapLikeType44);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap47);
        java.lang.Class<?> wildcardClass50 = typeFactory48._findPrimitive("");
        typeFactory48.clearCache();
        java.lang.Class<?> wildcardClass53 = typeFactory48._findPrimitive("Ljava/lang/Enum;");
        com.fasterxml.jackson.databind.type.TypeParser typeParser54 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser55 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType56 = collectionLikeType29.withValueHandler((java.lang.Object) typeFactory48);
        com.fasterxml.jackson.databind.JavaType javaType57 = collectionLikeType56.getReferencedType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType56", collectionLikeType29.equals(collectionLikeType56) ? collectionLikeType29.hashCode() == collectionLikeType56.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType1.withValueHandler((java.lang.Object) '#');
        java.lang.String str4 = javaType3.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean6 = simpleType5.isAbstract();
        boolean boolean7 = simpleType5.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType8 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType3, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0.constructType((java.lang.reflect.Type) simpleType5, typeBindings9);
        com.fasterxml.jackson.databind.type.ClassStack classStack11 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean13 = simpleType12.isCollectionLikeType();
        boolean boolean14 = simpleType12.isAbstract();
        boolean boolean15 = simpleType12.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack11, (java.lang.reflect.Type) simpleType12, typeBindings16);
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory0._parser;
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory0.withClassLoader(classLoader19);
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType23 = simpleType21.withValueHandler((java.lang.Object) '#');
        java.lang.String str24 = javaType23.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType25 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean26 = simpleType25.isAbstract();
        boolean boolean27 = simpleType25.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType28 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType23, (com.fasterxml.jackson.databind.JavaType) simpleType25);
        boolean boolean29 = collectionLikeType28.hasHandlers();
        boolean boolean30 = collectionLikeType28.hasHandlers();
        java.lang.String str31 = collectionLikeType28.toCanonical();
        boolean boolean32 = collectionLikeType28.hasHandlers();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType33 = collectionLikeType28.withStaticTyping();
        com.fasterxml.jackson.databind.type.ArrayType arrayType34 = typeFactory20.constructArrayType((com.fasterxml.jackson.databind.JavaType) collectionLikeType28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType8 and collectionLikeType33", collectionLikeType8.equals(collectionLikeType33) ? collectionLikeType8.hashCode() == collectionLikeType33.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.Class<?> wildcardClass3 = typeFactory1._findPrimitive("");
        typeFactory1.clearCache();
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = simpleType6.withValueHandler((java.lang.Object) '#');
        java.lang.String str9 = javaType8.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean11 = simpleType10.isAbstract();
        boolean boolean12 = simpleType10.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType13 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        boolean boolean14 = collectionLikeType13.hasHandlers();
        boolean boolean15 = collectionLikeType13.hasHandlers();
        java.lang.String str16 = collectionLikeType13.toCanonical();
        boolean boolean17 = collectionLikeType13.hasHandlers();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType13.withStaticTyping();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean20 = simpleType19.isArrayType();
        java.lang.Class<?> wildcardClass21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType19);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = simpleType19.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory1._fromAny(classStack5, (java.lang.reflect.Type) collectionLikeType18, typeBindings22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType13 and javaType23", collectionLikeType13.equals(javaType23) ? collectionLikeType13.hashCode() == javaType23.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        java.lang.Object obj9 = collectionLikeType7.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType10 = collectionLikeType7.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean12 = simpleType11.isCollectionLikeType();
        boolean boolean13 = simpleType11.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType15 = simpleType14.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType18 = simpleType16.withValueHandler((java.lang.Object) '#');
        java.lang.String str19 = javaType18.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean21 = simpleType20.isAbstract();
        boolean boolean22 = simpleType20.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType18, (com.fasterxml.jackson.databind.JavaType) simpleType20);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType24 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType11, javaType15, javaType18);
        com.fasterxml.jackson.databind.JavaType javaType25 = mapLikeType24.getKeyType();
        java.lang.String str26 = mapLikeType24.buildCanonicalName();
        com.fasterxml.jackson.databind.JavaType javaType27 = mapLikeType24.getContentType();
        java.lang.String str28 = mapLikeType24.toString();
        boolean boolean29 = mapLikeType24.isMapLikeType();
        boolean boolean30 = mapLikeType24.isTrueMapType();
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionLikeType7.withContentTypeHandler((java.lang.Object) boolean30);
        java.lang.String str32 = collectionLikeType7.buildCanonicalName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType31", collectionLikeType7.equals(javaType31) ? collectionLikeType7.hashCode() == javaType31.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType12.getSuperClass();
        java.lang.String str15 = simpleType12.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType12.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType12.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType12);
        boolean boolean19 = collectionLikeType7.isPrimitive();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType18", collectionLikeType7.equals(collectionLikeType18) ? collectionLikeType7.hashCode() == collectionLikeType18.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.isEnumType();
        boolean boolean10 = collectionLikeType7.isConcrete();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType11 = collectionLikeType7.withStaticTyping();
        java.lang.String str12 = collectionLikeType11.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType11", collectionLikeType7.equals(collectionLikeType11) ? collectionLikeType7.hashCode() == collectionLikeType11.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        java.lang.Object obj9 = collectionLikeType7.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType10 = collectionLikeType7.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType11.withValueHandler((java.lang.Object) '#');
        java.lang.String str14 = javaType13.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean16 = simpleType15.isAbstract();
        boolean boolean17 = simpleType15.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean19 = collectionLikeType18.isReferenceType();
        java.lang.String str20 = collectionLikeType18.buildCanonicalName();
        boolean boolean21 = collectionLikeType18.isThrowable();
        boolean boolean22 = collectionLikeType7.equals((java.lang.Object) collectionLikeType18);
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType25 = simpleType23.withValueHandler((java.lang.Object) '#');
        java.lang.String str26 = javaType25.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean28 = simpleType27.isAbstract();
        boolean boolean29 = simpleType27.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType30 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType25, (com.fasterxml.jackson.databind.JavaType) simpleType27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType31 = collectionLikeType7.withTypeHandler((java.lang.Object) collectionLikeType30);
        java.lang.Object obj32 = collectionLikeType7.getContentValueHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType31", collectionLikeType7.equals(collectionLikeType31) ? collectionLikeType7.hashCode() == collectionLikeType31.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        java.lang.String str10 = collectionLikeType7.toCanonical();
        boolean boolean11 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        boolean boolean20 = collectionLikeType19.hasHandlers();
        boolean boolean21 = collectionLikeType19.hasHandlers();
        boolean boolean22 = collectionLikeType19.isTrueCollectionType();
        boolean boolean23 = collectionLikeType19.hasHandlers();
        boolean boolean24 = collectionLikeType19.isTrueCollectionType();
        java.lang.String str25 = collectionLikeType19.toString();
        java.lang.String str26 = collectionLikeType19.toCanonical();
        java.lang.String str27 = collectionLikeType19.getGenericSignature();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType28 = collectionLikeType7.withContentTypeHandler((java.lang.Object) collectionLikeType19);
        boolean boolean29 = collectionLikeType28.hasHandlers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType28", collectionLikeType7.equals(collectionLikeType28) ? collectionLikeType7.hashCode() == collectionLikeType28.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        java.lang.Object obj9 = collectionLikeType7.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType10 = collectionLikeType7.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean12 = simpleType11.isCollectionLikeType();
        boolean boolean13 = simpleType11.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType15 = simpleType14.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType18 = simpleType16.withValueHandler((java.lang.Object) '#');
        java.lang.String str19 = javaType18.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean21 = simpleType20.isAbstract();
        boolean boolean22 = simpleType20.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType18, (com.fasterxml.jackson.databind.JavaType) simpleType20);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType24 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType11, javaType15, javaType18);
        com.fasterxml.jackson.databind.JavaType javaType25 = mapLikeType24.getKeyType();
        java.lang.String str26 = mapLikeType24.buildCanonicalName();
        com.fasterxml.jackson.databind.JavaType javaType27 = mapLikeType24.getContentType();
        java.lang.String str28 = mapLikeType24.toString();
        boolean boolean29 = mapLikeType24.isMapLikeType();
        boolean boolean30 = mapLikeType24.isTrueMapType();
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionLikeType7.withContentTypeHandler((java.lang.Object) boolean30);
        boolean boolean32 = javaType31.useStaticType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType31", collectionLikeType7.equals(javaType31) ? collectionLikeType7.hashCode() == javaType31.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType11 = simpleType9.withValueHandler((java.lang.Object) '#');
        java.lang.String str12 = javaType11.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean14 = simpleType13.isAbstract();
        boolean boolean15 = simpleType13.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType11, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        boolean boolean17 = collectionLikeType16.hasHandlers();
        boolean boolean18 = collectionLikeType16.hasHandlers();
        java.lang.String str19 = collectionLikeType16.toCanonical();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = collectionLikeType16.getBindings();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType25 = simpleType24.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType26 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType28 = simpleType26.withValueHandler((java.lang.Object) '#');
        java.lang.String str29 = javaType28.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean31 = simpleType30.isAbstract();
        boolean boolean32 = simpleType30.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType33 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType28, (com.fasterxml.jackson.databind.JavaType) simpleType30);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType34 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType21, javaType25, javaType28);
        com.fasterxml.jackson.databind.JavaType javaType35 = mapLikeType34.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType36 = mapLikeType34.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType37 = collectionLikeType16.withValueHandler((java.lang.Object) javaType36);
        com.fasterxml.jackson.databind.JavaType javaType38 = collectionLikeType7.withContentValueHandler((java.lang.Object) javaType36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType37", collectionLikeType7.equals(collectionLikeType37) ? collectionLikeType7.hashCode() == collectionLikeType37.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType12.getSuperClass();
        java.lang.String str15 = simpleType12.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType12.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType12.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType12);
        com.fasterxml.jackson.databind.JavaType javaType20 = collectionLikeType7.containedType((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType18", collectionLikeType7.equals(collectionLikeType18) ? collectionLikeType7.hashCode() == collectionLikeType18.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory17.constructType((java.lang.reflect.Type) simpleType22, typeBindings26);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType22);
        boolean boolean29 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType7.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType32 = collectionLikeType7.withValueHandler((java.lang.Object) simpleType31);
        java.lang.Class<?> wildcardClass33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) collectionLikeType7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType32", collectionLikeType7.equals(collectionLikeType32) ? collectionLikeType7.hashCode() == collectionLikeType32.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean11 = simpleType10.isCollectionLikeType();
        boolean boolean12 = simpleType10.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType13.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType15.withValueHandler((java.lang.Object) '#');
        java.lang.String str18 = javaType17.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean20 = simpleType19.isAbstract();
        boolean boolean21 = simpleType19.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType17, (com.fasterxml.jackson.databind.JavaType) simpleType19);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType23 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType10, javaType14, javaType17);
        java.lang.Object obj24 = mapLikeType23.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType25 = mapLikeType23._valueType;
        com.fasterxml.jackson.databind.JavaType javaType26 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType23);
        boolean boolean27 = collectionLikeType7.isFinal();
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionLikeType7.getContentType();
        java.lang.Object obj29 = collectionLikeType7.getContentValueHandler();
        boolean boolean30 = collectionLikeType7.isConcrete();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean32 = simpleType31.isCollectionLikeType();
        boolean boolean33 = simpleType31.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType35 = simpleType34.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType38 = simpleType36.withValueHandler((java.lang.Object) '#');
        java.lang.String str39 = javaType38.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean41 = simpleType40.isAbstract();
        boolean boolean42 = simpleType40.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType43 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType38, (com.fasterxml.jackson.databind.JavaType) simpleType40);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType44 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType31, javaType35, javaType38);
        com.fasterxml.jackson.databind.JavaType javaType45 = mapLikeType44._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType46 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType47 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType44, (com.fasterxml.jackson.databind.JavaType) simpleType46);
        com.fasterxml.jackson.databind.JavaType javaType48 = mapLikeType44.getKeyType();
        java.lang.String str49 = mapLikeType44.toCanonical();
        com.fasterxml.jackson.databind.type.SimpleType simpleType50 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType52 = simpleType50.withValueHandler((java.lang.Object) '#');
        java.lang.String str53 = javaType52.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType54 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean55 = simpleType54.isAbstract();
        boolean boolean56 = simpleType54.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType57 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType52, (com.fasterxml.jackson.databind.JavaType) simpleType54);
        boolean boolean58 = collectionLikeType57.hasHandlers();
        java.lang.Object obj59 = collectionLikeType57.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType60 = collectionLikeType57.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType61 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType63 = simpleType61.withValueHandler((java.lang.Object) '#');
        java.lang.String str64 = javaType63.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType65 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean66 = simpleType65.isAbstract();
        boolean boolean67 = simpleType65.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType68 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType63, (com.fasterxml.jackson.databind.JavaType) simpleType65);
        boolean boolean69 = collectionLikeType68.isReferenceType();
        java.lang.String str70 = collectionLikeType68.buildCanonicalName();
        boolean boolean71 = collectionLikeType68.isThrowable();
        boolean boolean72 = collectionLikeType57.equals((java.lang.Object) collectionLikeType68);
        com.fasterxml.jackson.databind.type.SimpleType simpleType73 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType75 = simpleType73.withValueHandler((java.lang.Object) '#');
        java.lang.String str76 = javaType75.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType77 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean78 = simpleType77.isAbstract();
        boolean boolean79 = simpleType77.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType80 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType75, (com.fasterxml.jackson.databind.JavaType) simpleType77);
        boolean boolean81 = collectionLikeType80.hasHandlers();
        boolean boolean82 = collectionLikeType80.isEnumType();
        boolean boolean83 = collectionLikeType80.isConcrete();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList84 = collectionLikeType80.getInterfaces();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType85 = collectionLikeType68.withContentValueHandler((java.lang.Object) javaTypeList84);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType86 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) mapLikeType44, (com.fasterxml.jackson.databind.JavaType) collectionLikeType68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType85", collectionLikeType7.equals(collectionLikeType85) ? collectionLikeType7.hashCode() == collectionLikeType85.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType11 = simpleType9.withValueHandler((java.lang.Object) '#');
        java.lang.String str12 = javaType11.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean14 = simpleType13.isAbstract();
        boolean boolean15 = simpleType13.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType11, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        boolean boolean17 = collectionLikeType16.hasHandlers();
        boolean boolean18 = collectionLikeType16.hasHandlers();
        boolean boolean19 = collectionLikeType16.isTrueCollectionType();
        boolean boolean20 = collectionLikeType16.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean22 = simpleType21.isAbstract();
        java.lang.String str23 = simpleType21.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType16, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        java.lang.Object obj26 = collectionLikeType25.getContentValueHandler();
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType29 = simpleType27.withValueHandler((java.lang.Object) '#');
        java.lang.String str30 = javaType29.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean32 = simpleType31.isAbstract();
        boolean boolean33 = simpleType31.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType29, (com.fasterxml.jackson.databind.JavaType) simpleType31);
        boolean boolean35 = collectionLikeType34.hasHandlers();
        boolean boolean36 = collectionLikeType34.hasHandlers();
        boolean boolean37 = collectionLikeType34.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType38 = collectionLikeType34._elementType;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType39 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType25, (com.fasterxml.jackson.databind.JavaType) collectionLikeType34);
        boolean boolean40 = collectionLikeType25.isTrueCollectionType();
        boolean boolean41 = collectionLikeType25.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType42 = collectionLikeType25.withStaticTyping();
        java.lang.Object obj43 = collectionLikeType25.getContentValueHandler();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType42", collectionLikeType7.equals(collectionLikeType42) ? collectionLikeType7.hashCode() == collectionLikeType42.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        java.lang.Object obj9 = collectionLikeType7.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType10 = collectionLikeType7.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType11.withValueHandler((java.lang.Object) '#');
        java.lang.String str14 = javaType13.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean16 = simpleType15.isAbstract();
        boolean boolean17 = simpleType15.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType13, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        boolean boolean19 = collectionLikeType18.isReferenceType();
        java.lang.String str20 = collectionLikeType18.buildCanonicalName();
        boolean boolean21 = collectionLikeType18.isThrowable();
        boolean boolean22 = collectionLikeType7.equals((java.lang.Object) collectionLikeType18);
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType25 = simpleType23.withValueHandler((java.lang.Object) '#');
        java.lang.String str26 = javaType25.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean28 = simpleType27.isAbstract();
        boolean boolean29 = simpleType27.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType30 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType25, (com.fasterxml.jackson.databind.JavaType) simpleType27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType31 = collectionLikeType7.withTypeHandler((java.lang.Object) collectionLikeType30);
        java.lang.Class<?> wildcardClass32 = collectionLikeType31.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType31", collectionLikeType7.equals(collectionLikeType31) ? collectionLikeType7.hashCode() == collectionLikeType31.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isEnumType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean13 = simpleType12.isCollectionLikeType();
        boolean boolean14 = simpleType12.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType15.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType19 = simpleType17.withValueHandler((java.lang.Object) '#');
        java.lang.String str20 = javaType19.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean22 = simpleType21.isAbstract();
        boolean boolean23 = simpleType21.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType19, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType25 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType12, javaType16, javaType19);
        java.lang.String str26 = simpleType12.getGenericSignature();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType27 = collectionLikeType7.withContentValueHandler((java.lang.Object) simpleType12);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList28 = simpleType12.getInterfaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType27", collectionLikeType7.equals(collectionLikeType27) ? collectionLikeType7.hashCode() == collectionLikeType27.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory11.constructType((java.lang.reflect.Type) simpleType16, typeBindings20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean24 = simpleType23.isCollectionLikeType();
        boolean boolean25 = simpleType23.isAbstract();
        boolean boolean26 = simpleType23.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory11._fromAny(classStack22, (java.lang.reflect.Type) simpleType23, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, javaType28);
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean31 = simpleType30.isCollectionLikeType();
        boolean boolean32 = simpleType30.isAbstract();
        int int33 = simpleType30.containedTypeCount();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = collectionLikeType29.withContentValueHandler((java.lang.Object) int33);
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean36 = simpleType35.isCollectionLikeType();
        boolean boolean37 = simpleType35.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType39 = simpleType38.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType42 = simpleType40.withValueHandler((java.lang.Object) '#');
        java.lang.String str43 = javaType42.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType44 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean45 = simpleType44.isAbstract();
        boolean boolean46 = simpleType44.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType47 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType42, (com.fasterxml.jackson.databind.JavaType) simpleType44);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType48 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType35, javaType39, javaType42);
        com.fasterxml.jackson.databind.JavaType javaType49 = mapLikeType48._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType50 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType51 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType48, (com.fasterxml.jackson.databind.JavaType) simpleType50);
        com.fasterxml.jackson.databind.JavaType javaType52 = mapLikeType48.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType53 = mapLikeType48.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings54 = mapLikeType48.getBindings();
        com.fasterxml.jackson.databind.type.SimpleType simpleType55 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean56 = simpleType55.isCollectionLikeType();
        boolean boolean57 = simpleType55.isAbstract();
        boolean boolean58 = simpleType55.isInterface();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType59 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) mapLikeType48, (com.fasterxml.jackson.databind.JavaType) simpleType55);
        boolean boolean60 = mapLikeType48.isMapLikeType();
        boolean boolean61 = mapLikeType48.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType62 = collectionLikeType34.withTypeHandler((java.lang.Object) boolean61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType29 and collectionLikeType34", collectionLikeType29.equals(collectionLikeType34) ? collectionLikeType29.hashCode() == collectionLikeType34.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.hasHandlers();
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean18 = simpleType17.isAbstract();
        com.fasterxml.jackson.databind.JavaType javaType19 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType17);
        boolean boolean20 = collectionLikeType7.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean22 = simpleType21.isCollectionLikeType();
        boolean boolean23 = simpleType21.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType25 = simpleType24.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType26 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType28 = simpleType26.withValueHandler((java.lang.Object) '#');
        java.lang.String str29 = javaType28.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean31 = simpleType30.isAbstract();
        boolean boolean32 = simpleType30.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType33 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType28, (com.fasterxml.jackson.databind.JavaType) simpleType30);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType34 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType21, javaType25, javaType28);
        java.lang.Object obj35 = mapLikeType34.getContentValueHandler();
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType38 = simpleType36.withValueHandler((java.lang.Object) '#');
        java.lang.String str39 = javaType38.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean41 = simpleType40.isAbstract();
        boolean boolean42 = simpleType40.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType43 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType38, (com.fasterxml.jackson.databind.JavaType) simpleType40);
        boolean boolean44 = collectionLikeType43.hasHandlers();
        boolean boolean45 = collectionLikeType43.hasHandlers();
        boolean boolean46 = collectionLikeType43.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType48 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType50 = simpleType48.withValueHandler((java.lang.Object) '#');
        java.lang.String str51 = javaType50.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType52 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean53 = simpleType52.isAbstract();
        boolean boolean54 = simpleType52.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType55 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType50, (com.fasterxml.jackson.databind.JavaType) simpleType52);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings56 = null;
        com.fasterxml.jackson.databind.JavaType javaType57 = typeFactory47.constructType((java.lang.reflect.Type) simpleType52, typeBindings56);
        com.fasterxml.jackson.databind.type.ClassStack classStack58 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType59 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean60 = simpleType59.isCollectionLikeType();
        boolean boolean61 = simpleType59.isAbstract();
        boolean boolean62 = simpleType59.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings63 = null;
        com.fasterxml.jackson.databind.JavaType javaType64 = typeFactory47._fromAny(classStack58, (java.lang.reflect.Type) simpleType59, typeBindings63);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType65 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType43, javaType64);
        boolean boolean66 = mapLikeType34.equals((java.lang.Object) collectionLikeType65);
        boolean boolean67 = mapLikeType34.isContainerType();
        java.lang.Object obj68 = mapLikeType34.getContentTypeHandler();
        com.fasterxml.jackson.databind.type.SimpleType simpleType69 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean70 = simpleType69.isCollectionLikeType();
        java.lang.Class<?> wildcardClass71 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType69);
        com.fasterxml.jackson.databind.JavaType javaType73 = simpleType69.withValueHandler((java.lang.Object) (short) 10);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType74 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType34, (com.fasterxml.jackson.databind.JavaType) simpleType69);
        java.lang.String str75 = mapLikeType34.toCanonical();
        boolean boolean76 = mapLikeType34.isPrimitive();
        com.fasterxml.jackson.databind.JavaType javaType77 = collectionLikeType7.withValueHandler((java.lang.Object) mapLikeType34);
        boolean boolean78 = javaType77.hasHandlers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType77", collectionLikeType7.equals(javaType77) ? collectionLikeType7.hashCode() == javaType77.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean2 = simpleType1.isCollectionLikeType();
        boolean boolean3 = simpleType1.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType5 = simpleType4.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = simpleType6.withValueHandler((java.lang.Object) '#');
        java.lang.String str9 = javaType8.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean11 = simpleType10.isAbstract();
        boolean boolean12 = simpleType10.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType13 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType14 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType1, javaType5, javaType8);
        com.fasterxml.jackson.databind.JavaType javaType15 = mapLikeType14.getKeyType();
        java.lang.String str16 = mapLikeType14.buildCanonicalName();
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType14.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) simpleType0, javaType17);
        com.fasterxml.jackson.databind.JavaType javaType19 = collectionLikeType18.getContentType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType23 = simpleType21.withValueHandler((java.lang.Object) '#');
        java.lang.String str24 = javaType23.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType25 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean26 = simpleType25.isAbstract();
        boolean boolean27 = simpleType25.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType28 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType23, (com.fasterxml.jackson.databind.JavaType) simpleType25);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings29 = null;
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory20.constructType((java.lang.reflect.Type) simpleType25, typeBindings29);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList31 = javaType30.getInterfaces();
        int int32 = javaType30.containedTypeCount();
        java.lang.Class<?> wildcardClass33 = javaType30.getParameterSource();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType18, javaType30);
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType37 = simpleType35.withValueHandler((java.lang.Object) '#');
        java.lang.String str38 = javaType37.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType39 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean40 = simpleType39.isAbstract();
        boolean boolean41 = simpleType39.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType42 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType37, (com.fasterxml.jackson.databind.JavaType) simpleType39);
        boolean boolean43 = collectionLikeType42.hasHandlers();
        boolean boolean44 = collectionLikeType42.hasHandlers();
        boolean boolean45 = collectionLikeType42.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType46 = collectionLikeType42._elementType;
        boolean boolean47 = collectionLikeType42.isArrayType();
        java.lang.String str48 = collectionLikeType42.getTypeName();
        java.lang.String str49 = collectionLikeType42.toString();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType50 = collectionLikeType34.withContentValueHandler((java.lang.Object) collectionLikeType42);
        com.fasterxml.jackson.databind.JavaType javaType52 = collectionLikeType50.containedType((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType13 and collectionLikeType50", collectionLikeType13.equals(collectionLikeType50) ? collectionLikeType13.hashCode() == collectionLikeType50.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        int int9 = collectionLikeType7.containedTypeCount();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7.getContentType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        boolean boolean20 = collectionLikeType19.hasHandlers();
        boolean boolean21 = collectionLikeType19.hasHandlers();
        boolean boolean22 = collectionLikeType19.isTrueCollectionType();
        boolean boolean23 = collectionLikeType19.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType25 = simpleType24.getSuperClass();
        java.lang.String str27 = simpleType24.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType28 = simpleType24.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType29 = simpleType24.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType30 = collectionLikeType19.withContentTypeHandler((java.lang.Object) simpleType24);
        com.fasterxml.jackson.databind.JavaType javaType31 = javaType11.withTypeHandler((java.lang.Object) collectionLikeType19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType30", collectionLikeType7.equals(collectionLikeType30) ? collectionLikeType7.hashCode() == collectionLikeType30.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType13 = simpleType12.getSuperClass();
        java.lang.String str15 = simpleType12.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType12.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType12.getReferencedType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = collectionLikeType7.withContentTypeHandler((java.lang.Object) simpleType12);
        boolean boolean19 = simpleType12.isContainerType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType18", collectionLikeType7.equals(collectionLikeType18) ? collectionLikeType7.hashCode() == collectionLikeType18.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        java.lang.Object obj9 = collectionLikeType7.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType10 = collectionLikeType7.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean12 = simpleType11.isCollectionLikeType();
        boolean boolean13 = simpleType11.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType15 = simpleType14.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType18 = simpleType16.withValueHandler((java.lang.Object) '#');
        java.lang.String str19 = javaType18.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean21 = simpleType20.isAbstract();
        boolean boolean22 = simpleType20.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType18, (com.fasterxml.jackson.databind.JavaType) simpleType20);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType24 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType11, javaType15, javaType18);
        com.fasterxml.jackson.databind.JavaType javaType25 = mapLikeType24.getKeyType();
        java.lang.String str26 = mapLikeType24.buildCanonicalName();
        com.fasterxml.jackson.databind.JavaType javaType27 = mapLikeType24.getContentType();
        java.lang.String str28 = mapLikeType24.toString();
        boolean boolean29 = mapLikeType24.isMapLikeType();
        boolean boolean30 = mapLikeType24.isTrueMapType();
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionLikeType7.withContentTypeHandler((java.lang.Object) boolean30);
        int int32 = collectionLikeType7.containedTypeCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType31", collectionLikeType7.equals(javaType31) ? collectionLikeType7.hashCode() == javaType31.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType11 = simpleType9.withValueHandler((java.lang.Object) '#');
        java.lang.String str12 = javaType11.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean14 = simpleType13.isAbstract();
        boolean boolean15 = simpleType13.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType11, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        boolean boolean17 = collectionLikeType16.hasHandlers();
        boolean boolean18 = collectionLikeType16.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean20 = simpleType19.isCollectionLikeType();
        boolean boolean21 = simpleType19.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType23 = simpleType22.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType26 = simpleType24.withValueHandler((java.lang.Object) '#');
        java.lang.String str27 = javaType26.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean29 = simpleType28.isAbstract();
        boolean boolean30 = simpleType28.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType31 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType26, (com.fasterxml.jackson.databind.JavaType) simpleType28);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType32 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType19, javaType23, javaType26);
        java.lang.Object obj33 = mapLikeType32.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType34 = mapLikeType32._valueType;
        com.fasterxml.jackson.databind.JavaType javaType35 = collectionLikeType16.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType32);
        boolean boolean36 = collectionLikeType16.isFinal();
        java.lang.String str37 = collectionLikeType16.toString();
        com.fasterxml.jackson.databind.JavaType javaType38 = collectionLikeType7.withTypeHandler((java.lang.Object) collectionLikeType16);
        boolean boolean39 = collectionLikeType7.isEnumType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and javaType38", collectionLikeType7.equals(javaType38) ? collectionLikeType7.hashCode() == javaType38.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType15.hasHandlers();
        boolean boolean17 = collectionLikeType15.hasHandlers();
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean19 = simpleType18.isArrayType();
        java.lang.Class<?> wildcardClass20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType18);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType21 = collectionLikeType15.withValueHandler((java.lang.Object) wildcardClass20);
        boolean boolean22 = collectionLikeType21.isTrueCollectionType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType21", collectionLikeType7.equals(collectionLikeType21) ? collectionLikeType7.hashCode() == collectionLikeType21.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.hasHandlers();
        boolean boolean10 = collectionLikeType7.isTrueCollectionType();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean13 = simpleType12.isAbstract();
        java.lang.String str14 = simpleType12.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType7, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        boolean boolean16 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = simpleType18.withValueHandler((java.lang.Object) '#');
        java.lang.String str21 = javaType20.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        boolean boolean24 = simpleType22.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType20, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory17.constructType((java.lang.reflect.Type) simpleType22, typeBindings26);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionLikeType7.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType22);
        boolean boolean29 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType7.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType32 = collectionLikeType7.withValueHandler((java.lang.Object) simpleType31);
        com.fasterxml.jackson.databind.type.SimpleType simpleType33 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType35 = simpleType33.withValueHandler((java.lang.Object) '#');
        java.lang.String str36 = javaType35.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType37 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean38 = simpleType37.isAbstract();
        boolean boolean39 = simpleType37.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType40 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType35, (com.fasterxml.jackson.databind.JavaType) simpleType37);
        boolean boolean41 = collectionLikeType40.hasHandlers();
        boolean boolean42 = collectionLikeType40.hasHandlers();
        boolean boolean43 = collectionLikeType40.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType45 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType47 = simpleType45.withValueHandler((java.lang.Object) '#');
        java.lang.String str48 = javaType47.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType49 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean50 = simpleType49.isAbstract();
        boolean boolean51 = simpleType49.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType52 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType47, (com.fasterxml.jackson.databind.JavaType) simpleType49);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings53 = null;
        com.fasterxml.jackson.databind.JavaType javaType54 = typeFactory44.constructType((java.lang.reflect.Type) simpleType49, typeBindings53);
        com.fasterxml.jackson.databind.type.ClassStack classStack55 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType56 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean57 = simpleType56.isCollectionLikeType();
        boolean boolean58 = simpleType56.isAbstract();
        boolean boolean59 = simpleType56.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings60 = null;
        com.fasterxml.jackson.databind.JavaType javaType61 = typeFactory44._fromAny(classStack55, (java.lang.reflect.Type) simpleType56, typeBindings60);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType62 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType40, javaType61);
        com.fasterxml.jackson.databind.JavaType javaType63 = collectionLikeType62.getContentType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType65 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType67 = simpleType65.withValueHandler((java.lang.Object) '#');
        java.lang.String str68 = javaType67.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType69 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean70 = simpleType69.isAbstract();
        boolean boolean71 = simpleType69.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType72 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType67, (com.fasterxml.jackson.databind.JavaType) simpleType69);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings73 = null;
        com.fasterxml.jackson.databind.JavaType javaType74 = typeFactory64.constructType((java.lang.reflect.Type) simpleType69, typeBindings73);
        com.fasterxml.jackson.databind.type.ClassStack classStack75 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType76 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean77 = simpleType76.isCollectionLikeType();
        boolean boolean78 = simpleType76.isAbstract();
        boolean boolean79 = simpleType76.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings80 = null;
        com.fasterxml.jackson.databind.JavaType javaType81 = typeFactory64._fromAny(classStack75, (java.lang.reflect.Type) simpleType76, typeBindings80);
        com.fasterxml.jackson.databind.type.TypeParser typeParser82 = typeFactory64._parser;
        com.fasterxml.jackson.databind.JavaType javaType83 = collectionLikeType62.withValueHandler((java.lang.Object) typeParser82);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType84 = collectionLikeType32.withValueHandler((java.lang.Object) javaType83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on collectionLikeType7 and collectionLikeType32", collectionLikeType7.equals(collectionLikeType32) ? collectionLikeType7.hashCode() == collectionLikeType32.hashCode() : true);
    }
}

