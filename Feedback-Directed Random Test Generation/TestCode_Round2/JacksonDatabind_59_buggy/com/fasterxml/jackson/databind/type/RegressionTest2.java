package com.fasterxml.jackson.databind.type;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.getKeyType();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList3 = simpleType0.getInterfaces();
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType0.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = simpleType0.withStaticTyping();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(javaTypeList3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean19 = mapLikeType13.equals((java.lang.Object) simpleType18);
        com.fasterxml.jackson.databind.JavaType javaType20 = mapLikeType13.getSuperClass();
        java.lang.String str21 = mapLikeType13.toString();
        java.lang.String str23 = mapLikeType13.containedTypeName((int) (byte) 100);
        java.lang.Object obj24 = mapLikeType13.getContentTypeHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Enum" + "'", str15, "java.lang.Enum");
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str21, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        boolean boolean18 = javaType17.isContainerType();
        boolean boolean19 = javaType17.isReferenceType();
        boolean boolean20 = javaType17.isFinal();
        java.lang.Class<?> wildcardClass21 = javaType17.getParameterSource();
        boolean boolean22 = javaType17.isAbstract();
        boolean boolean23 = javaType17.isContainerType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ljava/lang/Enum;" + "'", str4, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collectionLikeType8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        boolean boolean32 = collectionLikeType29.isCollectionLikeType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]" + "'", str30, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ljava/lang/Enum;" + "'", str9, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collectionLikeType13);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.Enum" + "'", str16, "java.lang.Enum");
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(collectionLikeType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Ljava/lang/Enum;" + "'", str24, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collectionLikeType28);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNotNull(javaTypeList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNotNull(collectionLikeType34);
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertNotNull(javaType37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Ljava/lang/Enum;" + "'", str38, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(collectionLikeType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(javaType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]" + "'", str48, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]" + "'", str49, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]");
        org.junit.Assert.assertNotNull(collectionLikeType50);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        com.fasterxml.jackson.databind.JavaType javaType28 = mapLikeType19._keyType;
        boolean boolean29 = mapLikeType19.isTrueMapType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ljava/lang/Enum;" + "'", str14, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collectionLikeType18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(simpleType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        boolean boolean19 = mapLikeType13.hasHandlers();
        com.fasterxml.jackson.databind.JavaType javaType20 = mapLikeType13.getKeyType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = javaType20.getGenericSignature();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(javaType20);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        com.fasterxml.jackson.databind.JavaType javaType36 = collectionLikeType34.getSuperClass();
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ljava/lang/Enum;" + "'", str14, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collectionLikeType18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Ljava/lang/Enum;" + "'", str30, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collectionLikeType34);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertNull(javaType36);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType13.getContentType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = mapLikeType13.getBindings();
        boolean boolean20 = mapLikeType13.isConcrete();
        java.lang.Object obj21 = mapLikeType13.getContentValueHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = simpleType4.isJavaLangObject();
        java.lang.String str9 = simpleType4.toCanonical();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
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
        java.lang.Object obj25 = mapLikeType24.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType26 = mapLikeType24._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory10.constructType((java.lang.reflect.Type) mapLikeType24, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) simpleType4, (com.fasterxml.jackson.databind.JavaType) mapLikeType24);
        com.fasterxml.jackson.databind.JavaType javaType30 = mapLikeType24.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType31 = mapLikeType24._keyType;
        java.lang.String str32 = mapLikeType24.buildCanonicalName();
        java.lang.Object obj33 = mapLikeType24.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType34 = mapLikeType24.getKeyType();
        java.lang.Object obj35 = mapLikeType24.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType37 = mapLikeType24.containedType((int) (short) 100);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Comparable" + "'", str9, "java.lang.Comparable");
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/lang/Enum;" + "'", str19, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '#' + "'", obj25, '#');
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNull(javaType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.Enum" + "'", str32, "java.lang.Enum");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(javaType34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(javaType37);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = mapLikeType13.getBindings();
        boolean boolean19 = mapLikeType13.hasHandlers();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList20 = mapLikeType13.getInterfaces();
        java.lang.String str21 = mapLikeType13.buildCanonicalName();
        java.lang.StringBuilder stringBuilder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder23 = mapLikeType13.getErasedSignature(stringBuilder22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(javaTypeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.Enum" + "'", str21, "java.lang.Enum");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        boolean boolean15 = mapLikeType13.isTrueMapType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = mapLikeType13.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13._valueType;
        com.fasterxml.jackson.databind.JavaType javaType19 = mapLikeType13.containedType((int) (byte) 1);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNull(javaType19);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType15.withValueHandler((java.lang.Object) '#');
        java.lang.String str18 = javaType17.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean20 = simpleType19.isAbstract();
        boolean boolean21 = simpleType19.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType17, (com.fasterxml.jackson.databind.JavaType) simpleType19);
        boolean boolean23 = collectionLikeType22.hasHandlers();
        boolean boolean24 = collectionLikeType22.hasHandlers();
        boolean boolean25 = collectionLikeType22.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType29 = simpleType27.withValueHandler((java.lang.Object) '#');
        java.lang.String str30 = javaType29.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean32 = simpleType31.isAbstract();
        boolean boolean33 = simpleType31.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType29, (com.fasterxml.jackson.databind.JavaType) simpleType31);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings35 = null;
        com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory26.constructType((java.lang.reflect.Type) simpleType31, typeBindings35);
        com.fasterxml.jackson.databind.type.ClassStack classStack37 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean39 = simpleType38.isCollectionLikeType();
        boolean boolean40 = simpleType38.isAbstract();
        boolean boolean41 = simpleType38.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings42 = null;
        com.fasterxml.jackson.databind.JavaType javaType43 = typeFactory26._fromAny(classStack37, (java.lang.reflect.Type) simpleType38, typeBindings42);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType44 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType22, javaType43);
        boolean boolean45 = mapLikeType13.equals((java.lang.Object) collectionLikeType44);
        boolean boolean46 = collectionLikeType44.isTrueCollectionType();
        boolean boolean47 = collectionLikeType44.hasHandlers();
        com.fasterxml.jackson.databind.JavaType javaType48 = collectionLikeType44.getReferencedType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Ljava/lang/Enum;" + "'", str30, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collectionLikeType34);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(collectionLikeType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(javaType48);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean30 = simpleType29.isCollectionLikeType();
        boolean boolean31 = simpleType29.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType32 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType33 = simpleType32.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType36 = simpleType34.withValueHandler((java.lang.Object) '#');
        java.lang.String str37 = javaType36.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean39 = simpleType38.isAbstract();
        boolean boolean40 = simpleType38.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType41 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType36, (com.fasterxml.jackson.databind.JavaType) simpleType38);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType42 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType29, javaType33, javaType36);
        java.lang.Object obj43 = mapLikeType42.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType44 = null;
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType45 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) simpleType22, (com.fasterxml.jackson.databind.JavaType) mapLikeType42, javaType44);
        com.fasterxml.jackson.databind.JavaType javaType46 = mapLikeType42._valueType;
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str14, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ljava/lang/Enum;" + "'", str21, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collectionLikeType25);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(simpleType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(simpleType32);
        org.junit.Assert.assertNull(javaType33);
        org.junit.Assert.assertNotNull(simpleType34);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Ljava/lang/Enum;" + "'", str37, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(collectionLikeType41);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + '#' + "'", obj43, '#');
        org.junit.Assert.assertNotNull(mapLikeType45);
        org.junit.Assert.assertNotNull(javaType46);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        java.lang.Object obj15 = mapLikeType13.getContentTypeHandler();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType18 = simpleType16.withValueHandler((java.lang.Object) '#');
        java.lang.String str19 = javaType18.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean21 = simpleType20.isAbstract();
        boolean boolean22 = simpleType20.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType18, (com.fasterxml.jackson.databind.JavaType) simpleType20);
        boolean boolean24 = collectionLikeType23.hasHandlers();
        boolean boolean25 = collectionLikeType23.isEnumType();
        boolean boolean26 = collectionLikeType23.hasHandlers();
        boolean boolean27 = mapLikeType13.equals((java.lang.Object) boolean26);
        java.lang.String str28 = mapLikeType13.buildCanonicalName();
        java.lang.Object obj29 = mapLikeType13.getContentTypeHandler();
        java.lang.String str31 = mapLikeType13.containedTypeName((int) (short) 100);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/lang/Enum;" + "'", str19, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.Enum" + "'", str28, "java.lang.Enum");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isAbstract();
        java.lang.String str2 = simpleType0.getTypeName();
        java.lang.String str4 = simpleType0.containedTypeName(1);
        java.lang.Class<?> wildcardClass5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str2, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = simpleType4.isJavaLangObject();
        java.lang.String str9 = simpleType4.toCanonical();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
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
        java.lang.Object obj25 = mapLikeType24.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType26 = mapLikeType24._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory10.constructType((java.lang.reflect.Type) mapLikeType24, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) simpleType4, (com.fasterxml.jackson.databind.JavaType) mapLikeType24);
        com.fasterxml.jackson.databind.JavaType javaType30 = mapLikeType24.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType31 = mapLikeType24._keyType;
        java.lang.String str32 = mapLikeType24.buildCanonicalName();
        java.lang.Object obj33 = mapLikeType24.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType34 = mapLikeType24.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType35 = null;
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType36 = mapLikeType24.withKeyType(javaType35);
        java.lang.String str37 = mapLikeType24.toString();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Comparable" + "'", str9, "java.lang.Comparable");
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/lang/Enum;" + "'", str19, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '#' + "'", obj25, '#');
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNull(javaType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.Enum" + "'", str32, "java.lang.Enum");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(javaType34);
        org.junit.Assert.assertNotNull(mapLikeType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str37, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        boolean boolean40 = collectionLikeType25.hasHandlers();
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType42 = collectionLikeType25.withContentType(javaType41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ljava/lang/Enum;" + "'", str12, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collectionLikeType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str23, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Ljava/lang/Enum;" + "'", str30, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collectionLikeType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(javaType38);
        org.junit.Assert.assertNotNull(collectionLikeType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = simpleType4.isJavaLangObject();
        java.lang.String str9 = simpleType4.toCanonical();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
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
        java.lang.Object obj25 = mapLikeType24.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType26 = mapLikeType24._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory10.constructType((java.lang.reflect.Type) mapLikeType24, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) simpleType4, (com.fasterxml.jackson.databind.JavaType) mapLikeType24);
        com.fasterxml.jackson.databind.JavaType javaType30 = mapLikeType24.getContentType();
        boolean boolean31 = mapLikeType24.isThrowable();
        com.fasterxml.jackson.databind.type.SimpleType simpleType32 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean33 = simpleType32.isCollectionLikeType();
        boolean boolean34 = simpleType32.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType36 = simpleType35.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType37 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType39 = simpleType37.withValueHandler((java.lang.Object) '#');
        java.lang.String str40 = javaType39.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType41 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean42 = simpleType41.isAbstract();
        boolean boolean43 = simpleType41.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType44 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType39, (com.fasterxml.jackson.databind.JavaType) simpleType41);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType45 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType32, javaType36, javaType39);
        com.fasterxml.jackson.databind.JavaType javaType46 = mapLikeType45._keyType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings47 = mapLikeType45.getBindings();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType48 = mapLikeType24.withContentType((com.fasterxml.jackson.databind.JavaType) mapLikeType45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Comparable" + "'", str9, "java.lang.Comparable");
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/lang/Enum;" + "'", str19, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '#' + "'", obj25, '#');
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(simpleType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNotNull(simpleType37);
        org.junit.Assert.assertNotNull(javaType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Ljava/lang/Enum;" + "'", str40, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(collectionLikeType44);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertNotNull(typeBindings47);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        boolean boolean32 = collectionLikeType7.isContainerType();
        java.lang.Object obj33 = collectionLikeType7.getContentValueHandler();
        boolean boolean34 = collectionLikeType7.isContainerType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings35 = collectionLikeType7.getBindings();
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType38 = simpleType36.withValueHandler((java.lang.Object) '#');
        java.lang.String str39 = javaType38.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean41 = simpleType40.isAbstract();
        boolean boolean42 = simpleType40.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType43 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType38, (com.fasterxml.jackson.databind.JavaType) simpleType40);
        boolean boolean44 = collectionLikeType43.hasHandlers();
        java.lang.Object obj45 = collectionLikeType43.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType46 = collectionLikeType43.getSuperClass();
        boolean boolean47 = collectionLikeType43.isContainerType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType48 = collectionLikeType7.withTypeHandler((java.lang.Object) collectionLikeType43);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]" + "'", str13, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]");
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(mapLikeType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(typeBindings35);
        org.junit.Assert.assertNotNull(simpleType36);
        org.junit.Assert.assertNotNull(javaType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Ljava/lang/Enum;" + "'", str39, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(collectionLikeType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(collectionLikeType48);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        boolean boolean1 = simpleType0.useStaticType();
        java.lang.String str2 = simpleType0.getGenericSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType5 = simpleType3.withValueHandler((java.lang.Object) '#');
        java.lang.String str6 = javaType5.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean8 = simpleType7.isAbstract();
        boolean boolean9 = simpleType7.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType10 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType5, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        boolean boolean11 = collectionLikeType10.hasHandlers();
        boolean boolean12 = collectionLikeType10.hasHandlers();
        boolean boolean13 = collectionLikeType10.isTrueCollectionType();
        boolean boolean14 = collectionLikeType10.hasHandlers();
        boolean boolean15 = collectionLikeType10.isTrueCollectionType();
        boolean boolean16 = collectionLikeType10.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType19 = simpleType17.withValueHandler((java.lang.Object) '#');
        java.lang.String str20 = javaType19.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean22 = simpleType21.isAbstract();
        boolean boolean23 = simpleType21.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType19, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        boolean boolean25 = collectionLikeType24.isReferenceType();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType26 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, (com.fasterxml.jackson.databind.JavaType) collectionLikeType10, (com.fasterxml.jackson.databind.JavaType) collectionLikeType24);
        com.fasterxml.jackson.databind.JavaType javaType27 = mapLikeType26.getReferencedType();
        java.lang.String str28 = mapLikeType26.buildCanonicalName();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ljava/lang/Class;" + "'", str2, "Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ljava/lang/Enum;" + "'", str6, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collectionLikeType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ljava/lang/Enum;" + "'", str20, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(javaType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.Class<java.lang.Enum<java.lang.Comparable>,java.lang.Enum<java.lang.Comparable>>" + "'", str28, "java.lang.Class<java.lang.Enum<java.lang.Comparable>,java.lang.Enum<java.lang.Comparable>>");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = mapLikeType13.getBindings();
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean21 = simpleType20.isCollectionLikeType();
        boolean boolean22 = simpleType20.isAbstract();
        boolean boolean23 = simpleType20.isInterface();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType20);
        java.lang.String str25 = mapLikeType13.toCanonical();
        boolean boolean26 = mapLikeType13.isContainerType();
        boolean boolean27 = mapLikeType13.isAbstract();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.Enum" + "'", str25, "java.lang.Enum");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean3 = simpleType2.isCollectionLikeType();
        boolean boolean4 = simpleType2.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType6 = simpleType5.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType9 = simpleType7.withValueHandler((java.lang.Object) '#');
        java.lang.String str10 = javaType9.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean12 = simpleType11.isAbstract();
        boolean boolean13 = simpleType11.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType14 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType9, (com.fasterxml.jackson.databind.JavaType) simpleType11);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType15 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType2, javaType6, javaType9);
        com.fasterxml.jackson.databind.JavaType javaType16 = mapLikeType15._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType15, (com.fasterxml.jackson.databind.JavaType) simpleType17);
        com.fasterxml.jackson.databind.JavaType javaType19 = mapLikeType15.getKeyType();
        boolean boolean20 = mapLikeType15.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType22 = mapLikeType15.containedType((int) (byte) 10);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, (com.fasterxml.jackson.databind.JavaType) mapLikeType15);
        com.fasterxml.jackson.databind.JavaType javaType24 = collectionLikeType23._elementType;
        com.fasterxml.jackson.databind.JavaType javaType25 = collectionLikeType23._elementType;
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ljava/lang/Enum;" + "'", str10, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collectionLikeType14);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType25);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        boolean boolean15 = mapLikeType13.isTrueMapType();
        com.fasterxml.jackson.databind.JavaType javaType16 = mapLikeType13.getKeyType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(javaType16);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        java.lang.String str14 = collectionLikeType7.toCanonical();
        java.lang.String str15 = collectionLikeType7.getGenericSignature();
        boolean boolean16 = collectionLikeType7.isCollectionLikeType();
        boolean boolean17 = collectionLikeType7.hasHandlers();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]" + "'", str13, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str14, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum<Ljava/lang/Comparable;>;" + "'", str15, "Ljava/lang/Enum<Ljava/lang/Comparable;>;");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        com.fasterxml.jackson.databind.JavaType javaType15 = mapLikeType13.getContentType();
        boolean boolean16 = mapLikeType13.hasGenericTypes();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        boolean boolean12 = collectionLikeType7.isArrayType();
        int int13 = collectionLikeType7.containedTypeCount();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType16 = simpleType14.withValueHandler((java.lang.Object) '#');
        java.lang.String str17 = javaType16.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean19 = simpleType18.isAbstract();
        boolean boolean20 = simpleType18.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType21 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType16, (com.fasterxml.jackson.databind.JavaType) simpleType18);
        boolean boolean22 = collectionLikeType21.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType25 = simpleType23.withValueHandler((java.lang.Object) '#');
        java.lang.String str26 = javaType25.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean28 = simpleType27.isAbstract();
        boolean boolean29 = simpleType27.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType30 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType25, (com.fasterxml.jackson.databind.JavaType) simpleType27);
        boolean boolean31 = collectionLikeType30.hasHandlers();
        boolean boolean32 = collectionLikeType30.hasHandlers();
        boolean boolean33 = collectionLikeType30.isTrueCollectionType();
        boolean boolean34 = collectionLikeType30.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean36 = simpleType35.isAbstract();
        java.lang.String str37 = simpleType35.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType38 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType30, (com.fasterxml.jackson.databind.JavaType) simpleType35);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType39 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType21, (com.fasterxml.jackson.databind.JavaType) simpleType35);
        java.lang.Object obj40 = collectionLikeType39.getContentValueHandler();
        java.lang.Object obj41 = collectionLikeType39.getContentValueHandler();
        java.lang.String str42 = collectionLikeType39.toCanonical();
        com.fasterxml.jackson.databind.JavaType javaType43 = collectionLikeType7.withValueHandler((java.lang.Object) collectionLikeType39);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ljava/lang/Enum;" + "'", str17, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collectionLikeType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Ljava/lang/Enum;" + "'", str26, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collectionLikeType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str37, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str42, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertNotNull(javaType43);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        java.lang.Object obj27 = collectionLikeType25.getContentValueHandler();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType29 = simpleType28.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean31 = simpleType30.isCollectionLikeType();
        boolean boolean32 = simpleType30.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType33 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType34 = simpleType33.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType37 = simpleType35.withValueHandler((java.lang.Object) '#');
        java.lang.String str38 = javaType37.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType39 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean40 = simpleType39.isAbstract();
        boolean boolean41 = simpleType39.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType42 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType37, (com.fasterxml.jackson.databind.JavaType) simpleType39);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType43 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType30, javaType34, javaType37);
        com.fasterxml.jackson.databind.JavaType javaType44 = mapLikeType43._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType45 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType46 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType43, (com.fasterxml.jackson.databind.JavaType) simpleType45);
        com.fasterxml.jackson.databind.JavaType javaType47 = mapLikeType43.getKeyType();
        boolean boolean48 = mapLikeType43.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType50 = mapLikeType43.containedType((int) (byte) 10);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType51 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType28, (com.fasterxml.jackson.databind.JavaType) mapLikeType43);
        com.fasterxml.jackson.databind.JavaType javaType52 = collectionLikeType51._elementType;
        com.fasterxml.jackson.databind.JavaType javaType53 = collectionLikeType25.withContentType((com.fasterxml.jackson.databind.JavaType) collectionLikeType51);
        java.lang.String str54 = javaType53.toCanonical();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ljava/lang/Enum;" + "'", str12, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collectionLikeType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str23, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(simpleType28);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertNotNull(simpleType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(simpleType33);
        org.junit.Assert.assertNull(javaType34);
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertNotNull(javaType37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Ljava/lang/Enum;" + "'", str38, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(collectionLikeType42);
        org.junit.Assert.assertNull(javaType44);
        org.junit.Assert.assertNotNull(simpleType45);
        org.junit.Assert.assertNull(javaType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(javaType50);
        org.junit.Assert.assertNotNull(javaType52);
        org.junit.Assert.assertNotNull(javaType53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "java.lang.Enum<java.lang.Class<java.lang.Enum>>" + "'", str54, "java.lang.Enum<java.lang.Class<java.lang.Enum>>");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = mapLikeType13.getBindings();
        java.lang.StringBuilder stringBuilder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder21 = mapLikeType13.getErasedSignature(stringBuilder20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(typeBindings19);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean3 = simpleType2.isCollectionLikeType();
        boolean boolean4 = simpleType2.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType6 = simpleType5.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType9 = simpleType7.withValueHandler((java.lang.Object) '#');
        java.lang.String str10 = javaType9.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean12 = simpleType11.isAbstract();
        boolean boolean13 = simpleType11.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType14 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType9, (com.fasterxml.jackson.databind.JavaType) simpleType11);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType15 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType2, javaType6, javaType9);
        com.fasterxml.jackson.databind.JavaType javaType16 = mapLikeType15._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType15, (com.fasterxml.jackson.databind.JavaType) simpleType17);
        com.fasterxml.jackson.databind.JavaType javaType19 = mapLikeType15.getKeyType();
        boolean boolean20 = mapLikeType15.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType22 = mapLikeType15.containedType((int) (byte) 10);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, (com.fasterxml.jackson.databind.JavaType) mapLikeType15);
        java.lang.StringBuilder stringBuilder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder25 = simpleType0.getErasedSignature(stringBuilder24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ljava/lang/Enum;" + "'", str10, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collectionLikeType14);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(javaType22);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        com.fasterxml.jackson.databind.JavaType javaType28 = mapLikeType27._valueType;
        java.lang.String str29 = mapLikeType27.getTypeName();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ljava/lang/Enum;" + "'", str14, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collectionLikeType18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(simpleType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[map-like type; class java.lang.Object, [map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]] -> [simple type, class java.lang.Comparable]]" + "'", str29, "[map-like type; class java.lang.Object, [map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]] -> [simple type, class java.lang.Comparable]]");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType0.containedType((int) (short) 0);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = mapLikeType13.getBindings();
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean21 = simpleType20.isCollectionLikeType();
        boolean boolean22 = simpleType20.isAbstract();
        boolean boolean23 = simpleType20.isInterface();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType20);
        com.fasterxml.jackson.databind.JavaType javaType26 = collectionLikeType24.containedTypeOrUnknown((int) (byte) 10);
        boolean boolean27 = collectionLikeType24.isFinal();
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
        boolean boolean39 = collectionLikeType35.hasHandlers();
        java.lang.Object obj40 = collectionLikeType35.getContentValueHandler();
        java.lang.String str41 = collectionLikeType35.getTypeName();
        java.lang.String str43 = collectionLikeType35.containedTypeName((int) (byte) 10);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType44 = collectionLikeType24.withContentValueHandler((java.lang.Object) collectionLikeType35);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(simpleType28);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Ljava/lang/Enum;" + "'", str31, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collectionLikeType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]" + "'", str41, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(collectionLikeType44);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.isAbstract();
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7.containedTypeOrUnknown(0);
        com.fasterxml.jackson.databind.JavaType javaType12 = collectionLikeType7.getSuperClass();
        java.lang.Object obj13 = collectionLikeType7.getContentTypeHandler();
        boolean boolean14 = collectionLikeType7.isConcrete();
        java.lang.Class<?> wildcardClass15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) collectionLikeType7);
        boolean boolean16 = collectionLikeType7.isArrayType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        boolean boolean30 = collectionLikeType29.hasHandlers();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean19 = mapLikeType13.equals((java.lang.Object) simpleType18);
        java.lang.String str20 = mapLikeType13.toCanonical();
        java.lang.StringBuilder stringBuilder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder22 = mapLikeType13.getGenericSignature(stringBuilder21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Enum" + "'", str15, "java.lang.Enum");
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.Enum" + "'", str20, "java.lang.Enum");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        java.lang.String str18 = mapLikeType13.getTypeName();
        boolean boolean19 = mapLikeType13.isMapLikeType();
        com.fasterxml.jackson.databind.JavaType javaType20 = mapLikeType13._valueType;
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList21 = mapLikeType13.getInterfaces();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str18, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(javaTypeList21);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.Class<?> wildcardClass3 = typeFactory1._findPrimitive("");
        typeFactory1.clearCache();
        java.lang.Class<?> wildcardClass6 = typeFactory1._findPrimitive("Ljava/lang/Enum;");
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory1._parser;
        typeFactory1.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory1._typeCache;
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(objLRUMap9);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        boolean boolean11 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.JavaType javaType12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        boolean boolean13 = javaType12.isInterface();
        int int14 = javaType12.containedTypeCount();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType7, javaType12);
        boolean boolean16 = collectionLikeType7.isContainerType();
        boolean boolean17 = collectionLikeType7.hasHandlers();
        java.lang.Object obj18 = collectionLikeType7.getContentValueHandler();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType21 = simpleType19.withValueHandler((java.lang.Object) '#');
        java.lang.String str22 = javaType21.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean24 = simpleType23.isAbstract();
        boolean boolean25 = simpleType23.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType26 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType21, (com.fasterxml.jackson.databind.JavaType) simpleType23);
        boolean boolean27 = collectionLikeType26.hasHandlers();
        boolean boolean28 = collectionLikeType26.hasHandlers();
        boolean boolean29 = collectionLikeType26.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType33 = simpleType31.withValueHandler((java.lang.Object) '#');
        java.lang.String str34 = javaType33.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean36 = simpleType35.isAbstract();
        boolean boolean37 = simpleType35.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType38 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType33, (com.fasterxml.jackson.databind.JavaType) simpleType35);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings39 = null;
        com.fasterxml.jackson.databind.JavaType javaType40 = typeFactory30.constructType((java.lang.reflect.Type) simpleType35, typeBindings39);
        com.fasterxml.jackson.databind.type.ClassStack classStack41 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType42 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean43 = simpleType42.isCollectionLikeType();
        boolean boolean44 = simpleType42.isAbstract();
        boolean boolean45 = simpleType42.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings46 = null;
        com.fasterxml.jackson.databind.JavaType javaType47 = typeFactory30._fromAny(classStack41, (java.lang.reflect.Type) simpleType42, typeBindings46);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType48 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType26, javaType47);
        java.lang.String str49 = collectionLikeType48.toString();
        boolean boolean50 = collectionLikeType48.hasHandlers();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType51 = collectionLikeType7.withContentTypeHandler((java.lang.Object) collectionLikeType48);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Ljava/lang/Enum;" + "'", str22, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(collectionLikeType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertNotNull(javaType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Ljava/lang/Enum;" + "'", str34, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collectionLikeType38);
        org.junit.Assert.assertNotNull(javaType40);
        org.junit.Assert.assertNotNull(simpleType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(javaType47);
        org.junit.Assert.assertNotNull(collectionLikeType48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]" + "'", str49, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(collectionLikeType51);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = collectionLikeType15.containedType((int) (short) 100);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList18 = collectionLikeType15.getInterfaces();
        java.lang.Class<?> wildcardClass19 = collectionLikeType15.getRawClass();
        java.lang.String str20 = collectionLikeType15.toCanonical();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str14, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(javaTypeList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str20, "java.lang.Enum<java.lang.Comparable>");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        boolean boolean15 = mapLikeType13.isTrueMapType();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList16 = mapLikeType13.getInterfaces();
        java.lang.String str17 = mapLikeType13.toString();
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean19 = simpleType18.isCollectionLikeType();
        boolean boolean20 = simpleType18.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType22 = simpleType21.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType25 = simpleType23.withValueHandler((java.lang.Object) '#');
        java.lang.String str26 = javaType25.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean28 = simpleType27.isAbstract();
        boolean boolean29 = simpleType27.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType30 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType25, (com.fasterxml.jackson.databind.JavaType) simpleType27);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType31 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType18, javaType22, javaType25);
        com.fasterxml.jackson.databind.JavaType javaType32 = mapLikeType31._keyType;
        boolean boolean33 = mapLikeType31.isTrueMapType();
        com.fasterxml.jackson.databind.JavaType javaType35 = mapLikeType31.containedType((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.MapLikeType mapLikeType36 = mapLikeType13.withKeyValueHandler((java.lang.Object) javaType35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(javaTypeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str17, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Ljava/lang/Enum;" + "'", str26, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collectionLikeType30);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(javaType35);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionLikeType7.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType32 = collectionLikeType7.getContentType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertNotNull(javaType32);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getSuperClass();
        java.lang.String str3 = simpleType0.containedTypeName((int) 'a');
        boolean boolean4 = simpleType0.hasValueHandler();
        boolean boolean5 = simpleType0.isJavaLangObject();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType13.getContentType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = mapLikeType13.getBindings();
        boolean boolean20 = mapLikeType13.isConcrete();
        com.fasterxml.jackson.databind.JavaType javaType21 = mapLikeType13.getContentType();
        java.lang.StringBuilder stringBuilder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder23 = javaType21.getErasedSignature(stringBuilder22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(javaType21);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.fasterxml.jackson.databind.JavaType javaType0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        boolean boolean1 = javaType0.isPrimitive();
        java.lang.String str2 = javaType0.getTypeName();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = javaType0.getValueHandler();
        java.lang.String str4 = javaType0.getGenericSignature();
        org.junit.Assert.assertNotNull(javaType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[simple type, class java.lang.Object]" + "'", str2, "[simple type, class java.lang.Object]");
        org.junit.Assert.assertNull(typeBindings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ljava/lang/Object;" + "'", str4, "Ljava/lang/Object;");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        java.lang.Class<?> wildcardClass18 = mapLikeType13.getRawClass();
        java.lang.String str19 = mapLikeType13.toString();
        java.lang.String str20 = mapLikeType13.toString();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str19, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str20, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.ArrayType arrayType22 = typeFactory20.constructArrayType(javaType21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ljava/lang/Enum;" + "'", str4, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collectionLikeType8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory20);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap1 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(objLRUMap1);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertNotNull(javaType3);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.Class<?> wildcardClass3 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory1._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory1.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory1.withModifier(typeModifier7);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        boolean boolean19 = mapLikeType13.hasHandlers();
        java.lang.Object obj20 = mapLikeType13.getContentTypeHandler();
        java.lang.StringBuilder stringBuilder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder22 = mapLikeType13.getErasedSignature(stringBuilder21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isArrayType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        boolean boolean3 = simpleType0.isThrowable();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        int int9 = collectionLikeType7.containedTypeCount();
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7.containedType((int) (short) 0);
        java.lang.Object obj12 = collectionLikeType7.getContentValueHandler();
        java.lang.String str13 = collectionLikeType7.toCanonical();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str13, "java.lang.Enum<java.lang.Comparable>");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        com.fasterxml.jackson.databind.JavaType javaType28 = mapLikeType19._keyType;
        java.lang.StringBuilder stringBuilder29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder30 = mapLikeType19.getGenericSignature(stringBuilder29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ljava/lang/Enum;" + "'", str14, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collectionLikeType18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(simpleType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(javaType28);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        boolean boolean17 = simpleType16.isReferenceType();
        boolean boolean18 = simpleType16.hasHandlers();
        java.lang.String str20 = simpleType16.containedTypeName((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType21 = simpleType16.getContentType();
        boolean boolean22 = simpleType16.isMapLikeType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        java.lang.reflect.GenericDeclaration genericDeclaration24 = mapLikeType13.getTypeHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertNull(genericDeclaration24);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap1 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeFactory0._unknownType();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList3 = javaType2.getInterfaces();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(objLRUMap1);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertNotNull(javaTypeList3);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        boolean boolean3 = javaType2.useStaticType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser2 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(javaType1);
        org.junit.Assert.assertNotNull(typeParser2);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        java.lang.String str18 = mapLikeType13.toCanonical();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.Enum" + "'", str18, "java.lang.Enum");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = simpleType4.useStaticType();
        boolean boolean9 = simpleType4.isConcrete();
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType4);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        boolean boolean18 = mapLikeType13.isContainerType();
        boolean boolean19 = mapLikeType13.hasContentType();
        java.lang.String str20 = mapLikeType13.toString();
        java.lang.StringBuilder stringBuilder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder22 = mapLikeType13.getErasedSignature(stringBuilder21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str20, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        boolean boolean17 = simpleType16.isReferenceType();
        boolean boolean18 = simpleType16.hasHandlers();
        java.lang.String str20 = simpleType16.containedTypeName((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType21 = simpleType16.getContentType();
        boolean boolean22 = simpleType16.isMapLikeType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings24 = collectionLikeType23.getBindings();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertNotNull(typeBindings24);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        java.lang.String str31 = collectionLikeType29.buildCanonicalName();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.Enum<java.lang.Enum>" + "'", str31, "java.lang.Enum<java.lang.Enum>");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        boolean boolean31 = javaType30.hasValueHandler();
        java.lang.String str32 = javaType30.toCanonical();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.Comparable" + "'", str32, "java.lang.Comparable");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = mapLikeType13.getBindings();
        boolean boolean19 = mapLikeType13.isInterface();
        boolean boolean20 = mapLikeType13.isConcrete();
        java.lang.Object obj21 = mapLikeType13.getContentTypeHandler();
        boolean boolean22 = mapLikeType13.isFinal();
        int int23 = mapLikeType13.containedTypeCount();
        boolean boolean24 = mapLikeType13.isInterface();
        com.fasterxml.jackson.databind.JavaType javaType25 = mapLikeType13.getKeyType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(javaType25);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = mapLikeType13.getBindings();
        boolean boolean19 = mapLikeType13.hasHandlers();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList20 = mapLikeType13.getInterfaces();
        java.lang.String str21 = mapLikeType13.toString();
        java.lang.String str23 = mapLikeType13.containedTypeName((int) '4');
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType25 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType27 = simpleType25.withValueHandler((java.lang.Object) '#');
        java.lang.String str28 = javaType27.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean30 = simpleType29.isAbstract();
        boolean boolean31 = simpleType29.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType32 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType27, (com.fasterxml.jackson.databind.JavaType) simpleType29);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings33 = null;
        com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory24.constructType((java.lang.reflect.Type) simpleType29, typeBindings33);
        com.fasterxml.jackson.databind.type.ClassStack classStack35 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean37 = simpleType36.isCollectionLikeType();
        boolean boolean38 = simpleType36.isAbstract();
        boolean boolean39 = simpleType36.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings40 = null;
        com.fasterxml.jackson.databind.JavaType javaType41 = typeFactory24._fromAny(classStack35, (java.lang.reflect.Type) simpleType36, typeBindings40);
        boolean boolean42 = simpleType36.hasHandlers();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList43 = simpleType36.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.MapLikeType mapLikeType44 = mapLikeType13.withValueHandler((java.lang.Object) javaTypeList43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(javaTypeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str21, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(typeFactory24);
        org.junit.Assert.assertNotNull(simpleType25);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Ljava/lang/Enum;" + "'", str28, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(collectionLikeType32);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(simpleType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(javaTypeList43);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        java.lang.String str9 = collectionLikeType7.buildCanonicalName();
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
        boolean boolean26 = javaType25.isContainerType();
        java.lang.Class<?> wildcardClass27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType25);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType28 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType7, javaType25);
        boolean boolean29 = collectionLikeType7.isArrayType();
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType7._elementType;
        boolean boolean31 = javaType30.isContainerType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str9, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '#' + "'", obj24, '#');
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        com.fasterxml.jackson.databind.JavaType javaType21 = collectionLikeType7.getSuperClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str14, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(javaType21);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = mapLikeType13.getBindings();
        boolean boolean19 = mapLikeType13.hasHandlers();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList20 = mapLikeType13.getInterfaces();
        boolean boolean21 = mapLikeType13.hasContentType();
        java.lang.String str23 = mapLikeType13.containedTypeName((int) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType24 = mapLikeType13.getSuperClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = mapLikeType13.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType26 = mapLikeType13.getReferencedType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(javaTypeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNotNull(typeBindings25);
        org.junit.Assert.assertNull(javaType26);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        java.lang.String str17 = mapLikeType13.toString();
        boolean boolean18 = mapLikeType13.isMapLikeType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = mapLikeType13.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType20 = mapLikeType13._valueType;
        java.lang.String str21 = mapLikeType13.buildCanonicalName();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Enum" + "'", str15, "java.lang.Enum");
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str17, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.Enum" + "'", str21, "java.lang.Enum");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        boolean boolean17 = simpleType16.isReferenceType();
        boolean boolean18 = simpleType16.hasHandlers();
        java.lang.String str20 = simpleType16.containedTypeName((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType21 = simpleType16.getContentType();
        boolean boolean22 = simpleType16.isMapLikeType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        boolean boolean24 = mapLikeType13.isMapLikeType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
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
        java.lang.Object obj15 = mapLikeType14.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType16 = mapLikeType14._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory0.constructType((java.lang.reflect.Type) mapLikeType14, typeBindings17);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory0._unknownType();
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
        boolean boolean31 = simpleType25.isThrowable();
        com.fasterxml.jackson.databind.type.ArrayType arrayType32 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType25);
        com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory0.constructFromCanonical("java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ljava/lang/Enum;" + "'", str9, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collectionLikeType13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Ljava/lang/Enum;" + "'", str24, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collectionLikeType28);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(arrayType32);
        org.junit.Assert.assertNotNull(javaType34);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean2 = simpleType1.isAbstract();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap6 = typeFactory0._typeCache;
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withClassLoader(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(objLRUMap6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        boolean boolean27 = mapLikeType23.isJavaLangObject();
        boolean boolean28 = mapLikeType23.isTrueMapType();
        com.fasterxml.jackson.databind.JavaType javaType29 = mapLikeType23.getContentType();
        java.lang.Object obj30 = mapLikeType23.getContentValueHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '#' + "'", obj24, '#');
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getSuperClass();
        java.lang.String str3 = simpleType0.containedTypeName((int) 'a');
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType0.getSuperClass();
        boolean boolean5 = simpleType0.isThrowable();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        boolean boolean19 = mapLikeType13.hasHandlers();
        com.fasterxml.jackson.databind.JavaType javaType20 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType21 = mapLikeType13._valueType;
        com.fasterxml.jackson.databind.JavaType javaType22 = mapLikeType13.getContentType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings15 = mapLikeType13.getBindings();
        boolean boolean16 = mapLikeType13.isThrowable();
        boolean boolean17 = mapLikeType13.isMapLikeType();
        boolean boolean18 = mapLikeType13.hasHandlers();
        com.fasterxml.jackson.databind.JavaType javaType19 = mapLikeType13.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType20 = mapLikeType13.getContentType();
        boolean boolean21 = javaType20.isJavaLangObject();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(typeBindings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        boolean boolean1 = simpleType0.useStaticType();
        java.lang.String str2 = simpleType0.getGenericSignature();
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = simpleType0.getValueHandler();
        java.lang.Class<?> wildcardClass4 = simpleType0.getRawClass();
        boolean boolean5 = simpleType0.isMapLikeType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ljava/lang/Class;" + "'", str2, "Ljava/lang/Class;");
        org.junit.Assert.assertNull(typeParser3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean19 = mapLikeType13.equals((java.lang.Object) simpleType18);
        boolean boolean20 = mapLikeType13.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType21 = mapLikeType13.getContentType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Enum" + "'", str15, "java.lang.Enum");
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(javaType21);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType1.withValueHandler((java.lang.Object) '#');
        java.lang.String str4 = javaType3.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean6 = simpleType5.isAbstract();
        boolean boolean7 = simpleType5.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType8 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType3, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        boolean boolean9 = collectionLikeType8.isReferenceType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleType10.withValueHandler((java.lang.Object) '#');
        java.lang.String str13 = javaType12.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean15 = simpleType14.isAbstract();
        boolean boolean16 = simpleType14.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType12, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        boolean boolean18 = collectionLikeType17.hasHandlers();
        boolean boolean19 = collectionLikeType17.hasHandlers();
        boolean boolean20 = collectionLikeType17.isTrueCollectionType();
        boolean boolean21 = collectionLikeType17.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean23 = simpleType22.isAbstract();
        java.lang.String str24 = simpleType22.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType25 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType17, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType26 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType8, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        boolean boolean27 = collectionLikeType26.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean29 = simpleType28.isCollectionLikeType();
        boolean boolean30 = simpleType28.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType32 = simpleType31.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType33 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType35 = simpleType33.withValueHandler((java.lang.Object) '#');
        java.lang.String str36 = javaType35.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType37 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean38 = simpleType37.isAbstract();
        boolean boolean39 = simpleType37.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType40 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType35, (com.fasterxml.jackson.databind.JavaType) simpleType37);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType41 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType28, javaType32, javaType35);
        java.lang.Object obj42 = mapLikeType41.getContentValueHandler();
        boolean boolean43 = mapLikeType41.isTrueMapType();
        com.fasterxml.jackson.databind.JavaType javaType44 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) collectionLikeType26, (com.fasterxml.jackson.databind.JavaType) mapLikeType41);
        java.lang.Object obj45 = collectionLikeType26.getContentTypeHandler();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ljava/lang/Enum;" + "'", str4, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collectionLikeType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ljava/lang/Enum;" + "'", str13, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collectionLikeType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str24, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(simpleType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNotNull(simpleType33);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Ljava/lang/Enum;" + "'", str36, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(collectionLikeType40);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + '#' + "'", obj42, '#');
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(javaType44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = typeFactory0._unknownType();
        java.lang.Class<?> wildcardClass3 = typeFactory0._findPrimitive("java.lang.Object<java.lang.Enum<java.lang.Comparable>>");
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(javaType1);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(javaType4);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean2 = simpleType1.isAbstract();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings3);
        boolean boolean5 = simpleType1.isMapLikeType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        java.lang.Object obj15 = mapLikeType13.getContentTypeHandler();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType18 = simpleType16.withValueHandler((java.lang.Object) '#');
        java.lang.String str19 = javaType18.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean21 = simpleType20.isAbstract();
        boolean boolean22 = simpleType20.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType18, (com.fasterxml.jackson.databind.JavaType) simpleType20);
        boolean boolean24 = collectionLikeType23.hasHandlers();
        boolean boolean25 = collectionLikeType23.isEnumType();
        boolean boolean26 = collectionLikeType23.hasHandlers();
        boolean boolean27 = mapLikeType13.equals((java.lang.Object) boolean26);
        java.lang.String str28 = mapLikeType13.toString();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/lang/Enum;" + "'", str19, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str28, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.JavaType javaType12 = collectionLikeType7.getSuperClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str10, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isAbstract();
        boolean boolean2 = simpleType0.isReferenceType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = simpleType0.getTypeHandler();
        boolean boolean4 = simpleType0.isJavaLangObject();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(typeBindings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        boolean boolean12 = collectionLikeType7.isJavaLangObject();
        java.lang.String str13 = collectionLikeType7.buildCanonicalName();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str13, "java.lang.Enum<java.lang.Comparable>");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        boolean boolean1 = simpleType0.useStaticType();
        java.lang.String str2 = simpleType0.getGenericSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType5 = simpleType3.withValueHandler((java.lang.Object) '#');
        java.lang.String str6 = javaType5.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean8 = simpleType7.isAbstract();
        boolean boolean9 = simpleType7.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType10 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType5, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        boolean boolean11 = collectionLikeType10.hasHandlers();
        boolean boolean12 = collectionLikeType10.hasHandlers();
        boolean boolean13 = collectionLikeType10.isTrueCollectionType();
        boolean boolean14 = collectionLikeType10.hasHandlers();
        boolean boolean15 = collectionLikeType10.isTrueCollectionType();
        boolean boolean16 = collectionLikeType10.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType19 = simpleType17.withValueHandler((java.lang.Object) '#');
        java.lang.String str20 = javaType19.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean22 = simpleType21.isAbstract();
        boolean boolean23 = simpleType21.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType19, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        boolean boolean25 = collectionLikeType24.isReferenceType();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType26 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, (com.fasterxml.jackson.databind.JavaType) collectionLikeType10, (com.fasterxml.jackson.databind.JavaType) collectionLikeType24);
        com.fasterxml.jackson.databind.JavaType javaType27 = mapLikeType26.getReferencedType();
        boolean boolean28 = mapLikeType26.hasHandlers();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ljava/lang/Class;" + "'", str2, "Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ljava/lang/Enum;" + "'", str6, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collectionLikeType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ljava/lang/Enum;" + "'", str20, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(javaType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
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
        java.lang.Object obj15 = mapLikeType14.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType16 = mapLikeType14._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory0.constructType((java.lang.reflect.Type) mapLikeType14, typeBindings17);
        boolean boolean19 = javaType18.isAbstract();
        boolean boolean20 = javaType18.isEnumType();
        boolean boolean21 = javaType18.isAbstract();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ljava/lang/Enum;" + "'", str9, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collectionLikeType13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType13.getKeyType();
        java.lang.String str20 = mapLikeType13.containedTypeName((int) '4');
        java.lang.String str21 = mapLikeType13.toCanonical();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType24 = simpleType22.withValueHandler((java.lang.Object) '#');
        java.lang.String str25 = javaType24.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType26 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean27 = simpleType26.isAbstract();
        boolean boolean28 = simpleType26.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType24, (com.fasterxml.jackson.databind.JavaType) simpleType26);
        boolean boolean30 = collectionLikeType29.isReferenceType();
        java.lang.String str31 = collectionLikeType29.buildCanonicalName();
        boolean boolean32 = collectionLikeType29.isFinal();
        boolean boolean33 = mapLikeType13.equals((java.lang.Object) boolean32);
        java.lang.String str35 = mapLikeType13.containedTypeName((int) 'a');
        java.lang.StringBuilder stringBuilder36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder37 = mapLikeType13.getGenericSignature(stringBuilder36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.Enum" + "'", str21, "java.lang.Enum");
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Ljava/lang/Enum;" + "'", str25, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str31, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        java.lang.String str32 = collectionLikeType29.toCanonical();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]" + "'", str30, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.Enum<java.lang.Enum>" + "'", str32, "java.lang.Enum<java.lang.Enum>");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        boolean boolean15 = mapLikeType13.isTrueMapType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = mapLikeType13.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13._valueType;
        int int18 = mapLikeType13.containedTypeCount();
        com.fasterxml.jackson.databind.JavaType javaType19 = mapLikeType13.getSuperClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(javaType19);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.Class<?> wildcardClass3 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory1.withModifier(typeModifier4);
        typeFactory1.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7);
        java.lang.Class<?> wildcardClass10 = typeFactory8._findPrimitive("");
        java.lang.ClassLoader classLoader11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory8.withClassLoader(classLoader11);
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean15 = simpleType14.isCollectionLikeType();
        boolean boolean16 = simpleType14.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType18 = simpleType17.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType21 = simpleType19.withValueHandler((java.lang.Object) '#');
        java.lang.String str22 = javaType21.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean24 = simpleType23.isAbstract();
        boolean boolean25 = simpleType23.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType26 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType21, (com.fasterxml.jackson.databind.JavaType) simpleType23);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType27 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType14, javaType18, javaType21);
        com.fasterxml.jackson.databind.JavaType javaType28 = mapLikeType27.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory12.constructType((java.lang.reflect.Type) simpleType13, javaType28);
        java.lang.String str30 = simpleType13.toCanonical();
        com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory1.constructType((java.lang.reflect.Type) simpleType13);
        com.fasterxml.jackson.databind.JavaType javaType32 = typeFactory1._unknownType();
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Ljava/lang/Enum;" + "'", str22, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(collectionLikeType26);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "long" + "'", str30, "long");
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertNotNull(javaType32);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        boolean boolean2 = simpleType0.isContainerType();
        boolean boolean3 = simpleType0.isPrimitive();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        boolean boolean35 = collectionLikeType29.hasHandlers();
        com.fasterxml.jackson.databind.JavaType javaType37 = collectionLikeType29.containedTypeOrUnknown((int) (short) 100);
        boolean boolean38 = collectionLikeType29.isContainerType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType39 = collectionLikeType29.withStaticTyping();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]" + "'", str30, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(javaType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(collectionLikeType39);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isArrayType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = simpleType0.getBindings();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean5 = simpleType4.isCollectionLikeType();
        boolean boolean6 = simpleType4.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = simpleType7.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType11 = simpleType9.withValueHandler((java.lang.Object) '#');
        java.lang.String str12 = javaType11.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean14 = simpleType13.isAbstract();
        boolean boolean15 = simpleType13.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType11, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType17 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType4, javaType8, javaType11);
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType17.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType19 = mapLikeType17.getContentType();
        java.lang.String str20 = mapLikeType17.buildCanonicalName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType21 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, (com.fasterxml.jackson.databind.JavaType) mapLikeType17);
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType24 = simpleType22.withValueHandler((java.lang.Object) '#');
        java.lang.String str25 = javaType24.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType26 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean27 = simpleType26.isAbstract();
        boolean boolean28 = simpleType26.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType24, (com.fasterxml.jackson.databind.JavaType) simpleType26);
        boolean boolean30 = collectionLikeType29.hasHandlers();
        boolean boolean31 = collectionLikeType29.hasHandlers();
        boolean boolean32 = collectionLikeType29.isTrueCollectionType();
        boolean boolean33 = collectionLikeType29.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean35 = simpleType34.isAbstract();
        java.lang.String str36 = simpleType34.getTypeName();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType37 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType29, (com.fasterxml.jackson.databind.JavaType) simpleType34);
        com.fasterxml.jackson.databind.JavaType javaType39 = collectionLikeType37.containedType((int) (short) 100);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList40 = collectionLikeType37.getInterfaces();
        com.fasterxml.jackson.databind.JavaType javaType41 = collectionLikeType37.getContentType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType42 = collectionLikeType21.withTypeHandler((java.lang.Object) javaType41);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ljava/lang/Enum;" + "'", str12, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collectionLikeType16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.Enum" + "'", str20, "java.lang.Enum");
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Ljava/lang/Enum;" + "'", str25, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(simpleType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str36, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType37);
        org.junit.Assert.assertNull(javaType39);
        org.junit.Assert.assertNotNull(javaTypeList40);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(collectionLikeType42);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = mapLikeType13.getBindings();
        boolean boolean19 = mapLikeType13.hasHandlers();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList20 = mapLikeType13.getInterfaces();
        boolean boolean21 = mapLikeType13.hasContentType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        boolean boolean23 = simpleType22.isContainerType();
        boolean boolean24 = simpleType22.isFinal();
        java.lang.Comparable<java.lang.String> strComparable25 = simpleType22.getValueHandler();
        java.lang.String str26 = simpleType22.getTypeName();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.MapLikeType mapLikeType27 = mapLikeType13.withKeyValueHandler((java.lang.Object) simpleType22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(javaTypeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(strComparable25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[simple type, class java.lang.Object]" + "'", str26, "[simple type, class java.lang.Object]");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        java.lang.String str18 = mapLikeType13.toString();
        com.fasterxml.jackson.databind.JavaType javaType19 = mapLikeType13.getContentType();
        java.lang.Object obj20 = mapLikeType13.getContentTypeHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Enum" + "'", str15, "java.lang.Enum");
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str18, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.fasterxml.jackson.databind.JavaType javaType0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        boolean boolean1 = javaType0.isThrowable();
        java.lang.String str2 = javaType0.getTypeName();
        org.junit.Assert.assertNotNull(javaType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[simple type, class java.lang.Object]" + "'", str2, "[simple type, class java.lang.Object]");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        boolean boolean11 = simpleType5.isConcrete();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ljava/lang/Enum;" + "'", str4, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collectionLikeType8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        boolean boolean16 = mapLikeType13.isArrayType();
        java.lang.Class<?> wildcardClass17 = mapLikeType13.getParameterSource();
        java.lang.String str18 = mapLikeType13.toString();
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
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType26.getContentType();
        java.lang.String str31 = collectionLikeType26.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.MapLikeType mapLikeType32 = mapLikeType13.withKeyTypeHandler((java.lang.Object) str31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str18, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Ljava/lang/Enum;" + "'", str22, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(collectionLikeType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str29, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]" + "'", str31, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType13.getContentType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = javaType18.getBindings();
        java.lang.String str20 = javaType18.getGenericSignature();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings21 = javaType18.getBindings();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ljava/lang/Enum;" + "'", str20, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(typeBindings21);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType15.withValueHandler((java.lang.Object) '#');
        java.lang.String str18 = javaType17.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean20 = simpleType19.isAbstract();
        boolean boolean21 = simpleType19.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType17, (com.fasterxml.jackson.databind.JavaType) simpleType19);
        boolean boolean23 = collectionLikeType22.hasHandlers();
        boolean boolean24 = collectionLikeType22.hasHandlers();
        boolean boolean25 = collectionLikeType22.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType29 = simpleType27.withValueHandler((java.lang.Object) '#');
        java.lang.String str30 = javaType29.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean32 = simpleType31.isAbstract();
        boolean boolean33 = simpleType31.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType29, (com.fasterxml.jackson.databind.JavaType) simpleType31);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings35 = null;
        com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory26.constructType((java.lang.reflect.Type) simpleType31, typeBindings35);
        com.fasterxml.jackson.databind.type.ClassStack classStack37 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean39 = simpleType38.isCollectionLikeType();
        boolean boolean40 = simpleType38.isAbstract();
        boolean boolean41 = simpleType38.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings42 = null;
        com.fasterxml.jackson.databind.JavaType javaType43 = typeFactory26._fromAny(classStack37, (java.lang.reflect.Type) simpleType38, typeBindings42);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType44 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType22, javaType43);
        boolean boolean45 = mapLikeType13.equals((java.lang.Object) collectionLikeType44);
        java.lang.Object obj46 = mapLikeType13.getContentTypeHandler();
        java.lang.String str48 = mapLikeType13.containedTypeName((int) (byte) 1);
        java.lang.StringBuilder stringBuilder49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder50 = mapLikeType13.getGenericSignature(stringBuilder49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Ljava/lang/Enum;" + "'", str30, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collectionLikeType34);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(collectionLikeType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        com.fasterxml.jackson.databind.JavaType javaType32 = collectionLikeType7.getKeyType();
        java.lang.String str33 = collectionLikeType7.buildCanonicalName();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]" + "'", str13, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]");
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(mapLikeType31);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str33, "java.lang.Enum<java.lang.Comparable>");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        boolean boolean35 = collectionLikeType29.hasHandlers();
        com.fasterxml.jackson.databind.JavaType javaType37 = collectionLikeType29.containedTypeOrUnknown((int) (short) 100);
        boolean boolean38 = collectionLikeType29.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType39 = collectionLikeType29.getContentType();
        java.lang.String str40 = collectionLikeType29.getTypeName();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]" + "'", str30, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(javaType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(javaType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]" + "'", str40, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        boolean boolean14 = mapLikeType13.isContainerType();
        java.lang.String str15 = mapLikeType13.buildCanonicalName();
        com.fasterxml.jackson.databind.JavaType javaType16 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13._valueType;
        java.lang.StringBuilder stringBuilder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder19 = mapLikeType13.getErasedSignature(stringBuilder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Enum" + "'", str15, "java.lang.Enum");
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNotNull(javaType17);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = collectionLikeType16.getBindings();
        boolean boolean20 = collectionLikeType16.hasContentType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        boolean boolean27 = mapLikeType23.isJavaLangObject();
        com.fasterxml.jackson.databind.JavaType javaType28 = mapLikeType23.getContentType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.MapLikeType mapLikeType29 = mapLikeType23.withStaticTyping();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '#' + "'", obj24, '#');
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(javaType28);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        boolean boolean16 = collectionLikeType7.isCollectionLikeType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        boolean boolean15 = mapLikeType13.isTrueMapType();
        java.lang.String str16 = mapLikeType13.toString();
        int int17 = mapLikeType13.containedTypeCount();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = mapLikeType13.withContentTypeHandler((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str16, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        boolean boolean32 = collectionLikeType7.isContainerType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean35 = simpleType34.isAbstract();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings36 = null;
        com.fasterxml.jackson.databind.JavaType javaType37 = typeFactory33.constructType((java.lang.reflect.Type) simpleType34, typeBindings36);
        boolean boolean38 = simpleType34.hasHandlers();
        com.fasterxml.jackson.databind.JavaType javaType39 = simpleType34.withStaticTyping();
        com.fasterxml.jackson.databind.JavaType javaType41 = javaType39.withTypeHandler((java.lang.Object) (byte) 0);
        boolean boolean42 = collectionLikeType7.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]" + "'", str13, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]");
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(mapLikeType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(simpleType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(javaType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(javaType39);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        boolean boolean17 = simpleType16.isContainerType();
        boolean boolean18 = collectionLikeType15.equals((java.lang.Object) boolean17);
        com.fasterxml.jackson.databind.JavaType javaType19 = collectionLikeType15.getKeyType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str14, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(javaType19);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        boolean boolean32 = collectionLikeType29.isContainerType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType33 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType35 = simpleType33.withValueHandler((java.lang.Object) '#');
        java.lang.String str36 = javaType35.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType37 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean38 = simpleType37.isAbstract();
        boolean boolean39 = simpleType37.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType40 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType35, (com.fasterxml.jackson.databind.JavaType) simpleType37);
        boolean boolean41 = collectionLikeType40.isReferenceType();
        java.lang.String str42 = collectionLikeType40.buildCanonicalName();
        java.lang.Object obj43 = collectionLikeType40.getContentValueHandler();
        boolean boolean44 = collectionLikeType29.equals((java.lang.Object) collectionLikeType40);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]" + "'", str30, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(simpleType33);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Ljava/lang/Enum;" + "'", str36, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(collectionLikeType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str42, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        boolean boolean15 = mapLikeType13.isContainerType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = mapLikeType13.getTypeHandler();
        boolean boolean17 = mapLikeType13.hasHandlers();
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean19 = simpleType18.isCollectionLikeType();
        boolean boolean20 = simpleType18.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType22 = simpleType21.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType25 = simpleType23.withValueHandler((java.lang.Object) '#');
        java.lang.String str26 = javaType25.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean28 = simpleType27.isAbstract();
        boolean boolean29 = simpleType27.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType30 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType25, (com.fasterxml.jackson.databind.JavaType) simpleType27);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType31 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType18, javaType22, javaType25);
        com.fasterxml.jackson.databind.JavaType javaType32 = mapLikeType31._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType33 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType31, (com.fasterxml.jackson.databind.JavaType) simpleType33);
        com.fasterxml.jackson.databind.JavaType javaType35 = mapLikeType31.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType36 = mapLikeType31.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings37 = mapLikeType31.getBindings();
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean39 = simpleType38.isCollectionLikeType();
        boolean boolean40 = simpleType38.isAbstract();
        boolean boolean41 = simpleType38.isInterface();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType42 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) mapLikeType31, (com.fasterxml.jackson.databind.JavaType) simpleType38);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType43 = mapLikeType13.withContentType((com.fasterxml.jackson.databind.JavaType) collectionLikeType42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(typeFactory16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Ljava/lang/Enum;" + "'", str26, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collectionLikeType30);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNotNull(simpleType33);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNotNull(typeBindings37);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(collectionLikeType42);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        java.lang.Class<?> wildcardClass18 = mapLikeType13.getRawClass();
        boolean boolean19 = mapLikeType13.isContainerType();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList20 = mapLikeType13.getInterfaces();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(javaTypeList20);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        boolean boolean32 = collectionLikeType7.isCollectionLikeType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]" + "'", str13, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]");
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(mapLikeType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean2 = simpleType1.isAbstract();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings3);
        boolean boolean5 = simpleType1.hasHandlers();
        com.fasterxml.jackson.databind.JavaType javaType6 = simpleType1.withStaticTyping();
        boolean boolean7 = simpleType1.isArrayType();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList8 = simpleType1.getInterfaces();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(javaTypeList8);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        boolean boolean19 = mapLikeType13.hasHandlers();
        com.fasterxml.jackson.databind.JavaType javaType20 = mapLikeType13.getKeyType();
        java.lang.Object obj21 = mapLikeType13.getContentValueHandler();
        boolean boolean22 = mapLikeType13.isContainerType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        java.lang.StringBuilder stringBuilder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder22 = collectionLikeType16.getErasedSignature(stringBuilder21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(typeFactory20);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        boolean boolean18 = mapLikeType13.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType20 = mapLikeType13.containedType((int) (byte) 10);
        java.lang.Object obj21 = mapLikeType13.getContentValueHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        boolean boolean12 = collectionLikeType7.isArrayType();
        int int13 = collectionLikeType7.containedTypeCount();
        boolean boolean14 = collectionLikeType7.hasHandlers();
        boolean boolean15 = collectionLikeType7.isTrueCollectionType();
        java.lang.Object obj16 = collectionLikeType7.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType17 = collectionLikeType7.getReferencedType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(javaType17);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        boolean boolean17 = mapLikeType13.isJavaLangObject();
        java.lang.StringBuilder stringBuilder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder19 = mapLikeType13.getErasedSignature(stringBuilder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        com.fasterxml.jackson.databind.JavaType javaType32 = collectionLikeType7.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings33 = collectionLikeType7.getBindings();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]" + "'", str13, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]");
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(mapLikeType31);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNotNull(typeBindings33);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        java.lang.String str18 = mapLikeType13.getTypeName();
        boolean boolean19 = mapLikeType13.isMapLikeType();
        boolean boolean20 = mapLikeType13.isTrueMapType();
        boolean boolean21 = mapLikeType13.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType23 = mapLikeType13.containedType((int) (short) 100);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str18, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(javaType23);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.isAbstract();
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7.containedTypeOrUnknown(0);
        boolean boolean12 = collectionLikeType7.hasHandlers();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType0.withValueHandler((java.lang.Object) (short) 10);
        java.lang.Object obj5 = simpleType0.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType7 = simpleType0.containedType((int) (byte) 100);
        com.fasterxml.jackson.databind.JavaType javaType9 = simpleType0.containedType((int) (byte) -1);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        java.lang.String str18 = mapLikeType13.toString();
        com.fasterxml.jackson.databind.JavaType javaType19 = mapLikeType13.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType20 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType21 = mapLikeType13.getSuperClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Enum" + "'", str15, "java.lang.Enum");
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str18, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNull(javaType21);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        com.fasterxml.jackson.databind.JavaType javaType27 = collectionLikeType7.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType29 = collectionLikeType7.containedType((int) (byte) 0);
        boolean boolean30 = collectionLikeType7.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionLikeType7.getKeyType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '#' + "'", obj24, '#');
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(javaType31);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        boolean boolean28 = collectionLikeType7.isConcrete();
        com.fasterxml.jackson.databind.JavaType javaType29 = collectionLikeType7.getContentType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '#' + "'", obj24, '#');
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]" + "'", str27, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(javaType29);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        java.lang.Class<?> wildcardClass18 = collectionLikeType15.getParameterSource();
        boolean boolean19 = collectionLikeType15.isCollectionLikeType();
        java.lang.Object obj20 = collectionLikeType15.getContentValueHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str14, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        boolean boolean18 = collectionLikeType16.isAbstract();
        java.lang.Object obj19 = null;
        boolean boolean20 = collectionLikeType16.equals(obj19);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType13.getContentType();
        boolean boolean19 = mapLikeType13.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType20 = mapLikeType13.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType21 = mapLikeType13._valueType;
        boolean boolean22 = javaType21.isAbstract();
        com.fasterxml.jackson.databind.JavaType javaType23 = javaType21.withStaticTyping();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(javaType23);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean2 = simpleType1.isAbstract();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings3);
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(javaType4);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        boolean boolean29 = javaType28.isMapLikeType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '#' + "'", obj24, '#');
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = typeFactory1.withClassLoader(classLoader36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass39 = typeFactory1.classForName("[map-like type; class java.lang.Object, [map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]] -> [collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [map-like type; class java/lang/Object, [map-like type; class java/lang/Enum, null -> [simple type, class java/lang/Enum]] -> [collection-like type; class java/lang/Enum, contains [simple type, class java/lang/Enum]]]");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ljava/lang/Enum;" + "'", str14, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collectionLikeType18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Ljava/lang/Enum;" + "'", str30, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collectionLikeType34);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertNotNull(typeFactory37);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        java.lang.Class<?> wildcardClass18 = collectionLikeType15.getParameterSource();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            collectionLikeType15.serializeWithType(jsonGenerator19, serializerProvider20, typeSerializer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str14, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(wildcardClass18);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType13.getContentType();
        boolean boolean19 = mapLikeType13.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType20 = mapLikeType13.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType21 = mapLikeType13._valueType;
        boolean boolean22 = mapLikeType13.isContainerType();
        boolean boolean23 = mapLikeType13.isCollectionLikeType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = mapLikeType13.getBindings();
        boolean boolean19 = mapLikeType13.hasHandlers();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList20 = mapLikeType13.getInterfaces();
        com.fasterxml.jackson.databind.JavaType javaType21 = mapLikeType13.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType22 = mapLikeType13.getContentType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings23 = mapLikeType13.getBindings();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(javaTypeList20);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(typeBindings23);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        java.lang.String str29 = mapLikeType27.toString();
        java.lang.String str30 = mapLikeType27.buildCanonicalName();
        com.fasterxml.jackson.databind.JavaType javaType31 = mapLikeType27._valueType;
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ljava/lang/Enum;" + "'", str14, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collectionLikeType18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(simpleType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[map-like type; class java.lang.Object, [map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]] -> [simple type, class java.lang.Comparable]]" + "'", str29, "[map-like type; class java.lang.Object, [map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]] -> [simple type, class java.lang.Comparable]]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.Object<java.lang.Enum,java.lang.Comparable>" + "'", str30, "java.lang.Object<java.lang.Enum,java.lang.Comparable>");
        org.junit.Assert.assertNotNull(javaType31);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        boolean boolean15 = mapLikeType13.isTrueMapType();
        java.lang.String str16 = mapLikeType13.toString();
        java.lang.Object obj17 = mapLikeType13.getContentValueHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str16, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + '#' + "'", obj17, '#');
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        com.fasterxml.jackson.databind.JavaType javaType14 = javaType7.getContentType();
        boolean boolean15 = javaType7.isAbstract();
        boolean boolean16 = javaType7.hasHandlers();
        java.lang.Object obj17 = javaType7.getContentValueHandler();
        java.lang.StringBuilder stringBuilder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder19 = javaType7.getErasedSignature(stringBuilder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.hasHandlers();
        boolean boolean9 = collectionLikeType7.isAbstract();
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7.containedTypeOrUnknown(0);
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
        com.fasterxml.jackson.databind.JavaType javaType28 = mapLikeType25._valueType;
        java.lang.Class<?> wildcardClass29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) mapLikeType25);
        com.fasterxml.jackson.databind.JavaType javaType30 = mapLikeType25.getContentType();
        java.lang.String str31 = mapLikeType25.toString();
        java.lang.Object obj32 = mapLikeType25.getContentTypeHandler();
        boolean boolean33 = javaType11.equals((java.lang.Object) mapLikeType25);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ljava/lang/Enum;" + "'", str20, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '#' + "'", obj26, '#');
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str31, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        com.fasterxml.jackson.databind.JavaType javaType18 = simpleType12.getContentType();
        boolean boolean19 = simpleType12.hasHandlers();
        boolean boolean20 = simpleType12.isArrayType();
        com.fasterxml.jackson.databind.JavaType javaType21 = simpleType12.withStaticTyping();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ljava/lang/Enum;" + "'", str4, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collectionLikeType8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(javaType21);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        java.lang.StringBuilder stringBuilder43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder44 = collectionLikeType42.getGenericSignature(stringBuilder43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ljava/lang/Enum;" + "'", str12, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collectionLikeType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str23, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Ljava/lang/Enum;" + "'", str30, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collectionLikeType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(javaType38);
        org.junit.Assert.assertNotNull(collectionLikeType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collectionLikeType42);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        boolean boolean17 = simpleType16.isReferenceType();
        boolean boolean18 = simpleType16.hasHandlers();
        java.lang.String str20 = simpleType16.containedTypeName((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType21 = simpleType16.getContentType();
        boolean boolean22 = simpleType16.isMapLikeType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        java.lang.String str24 = mapLikeType13.buildCanonicalName();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.Enum" + "'", str24, "java.lang.Enum");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean2 = simpleType1.isAbstract();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0._unknownType();
        java.lang.ClassLoader classLoader6 = typeFactory0.getClassLoader();
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeParser8);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionLikeType7.getSuperClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertNull(javaType30);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = mapLikeType13.getBindings();
        java.lang.String str20 = mapLikeType13.buildCanonicalName();
        boolean boolean21 = mapLikeType13.isConcrete();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.Enum" + "'", str20, "java.lang.Enum");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        com.fasterxml.jackson.databind.JavaType javaType15 = mapLikeType13.getContentType();
        boolean boolean16 = mapLikeType13.isMapLikeType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7.getContentType();
        java.lang.String str13 = javaType11.containedTypeName((-1));
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str10, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.isReferenceType();
        java.lang.Object obj9 = collectionLikeType7.getContentValueHandler();
        boolean boolean10 = collectionLikeType7.isMapLikeType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        com.fasterxml.jackson.databind.JavaType javaType23 = collectionLikeType18.getContentType();
        boolean boolean24 = javaType23.isAbstract();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ljava/lang/Enum;" + "'", str14, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collectionLikeType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str20, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        boolean boolean3 = simpleType0.hasValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType5 = simpleType0.containedTypeOrUnknown((int) '4');
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = mapLikeType13.getBindings();
        boolean boolean19 = mapLikeType13.isInterface();
        boolean boolean20 = mapLikeType13.hasHandlers();
        java.lang.String str21 = mapLikeType13.buildCanonicalName();
        com.fasterxml.jackson.databind.JavaType javaType22 = mapLikeType13.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType24 = javaType22.containedTypeOrUnknown((int) '#');
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.Enum" + "'", str21, "java.lang.Enum");
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(javaType24);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        java.lang.String str31 = collectionLikeType7.toString();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '#' + "'", obj24, '#');
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]" + "'", str31, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        java.lang.String str48 = collectionLikeType29.containedTypeName((int) (byte) 100);
        java.lang.String str49 = collectionLikeType29.buildCanonicalName();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]" + "'", str30, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(simpleType34);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertNotNull(simpleType36);
        org.junit.Assert.assertNotNull(javaType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Ljava/lang/Enum;" + "'", str39, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(collectionLikeType43);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.lang.Enum<java.lang.Enum>" + "'", str49, "java.lang.Enum<java.lang.Enum>");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        com.fasterxml.jackson.databind.JavaType javaType15 = mapLikeType13.getContentType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = mapLikeType13.getBindings();
        java.lang.Object obj17 = mapLikeType13.getContentValueHandler();
        java.lang.Object obj18 = mapLikeType13.getContentValueHandler();
        boolean boolean19 = mapLikeType13.hasHandlers();
        boolean boolean20 = mapLikeType13.isFinal();
        java.lang.String str21 = mapLikeType13.buildCanonicalName();
        boolean boolean22 = mapLikeType13.hasHandlers();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + '#' + "'", obj17, '#');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '#' + "'", obj18, '#');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.Enum" + "'", str21, "java.lang.Enum");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        java.lang.String str18 = collectionLikeType15.toString();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str14, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str17, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]" + "'", str18, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = simpleType4.isJavaLangObject();
        java.lang.String str9 = simpleType4.toCanonical();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
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
        java.lang.Object obj25 = mapLikeType24.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType26 = mapLikeType24._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory10.constructType((java.lang.reflect.Type) mapLikeType24, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) simpleType4, (com.fasterxml.jackson.databind.JavaType) mapLikeType24);
        com.fasterxml.jackson.databind.JavaType javaType30 = mapLikeType24.getContentType();
        java.lang.String str31 = mapLikeType24.buildCanonicalName();
        boolean boolean32 = mapLikeType24.hasHandlers();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Comparable" + "'", str9, "java.lang.Comparable");
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/lang/Enum;" + "'", str19, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '#' + "'", obj25, '#');
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.Enum" + "'", str31, "java.lang.Enum");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionLikeType7.getContentType();
        boolean boolean12 = collectionLikeType7.isAbstract();
        java.lang.Object obj13 = collectionLikeType7.getContentValueHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str10, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.Class<?> wildcardClass3 = typeFactory1._findPrimitive("");
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory1.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean8 = simpleType7.isCollectionLikeType();
        boolean boolean9 = simpleType7.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType11 = simpleType10.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType20 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType7, javaType11, javaType14);
        com.fasterxml.jackson.databind.JavaType javaType21 = mapLikeType20.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory5.constructType((java.lang.reflect.Type) simpleType6, javaType21);
        java.lang.Class<?> wildcardClass23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType6);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        java.lang.Object obj17 = collectionLikeType7.getContentValueHandler();
        boolean boolean18 = collectionLikeType7.hasContentType();
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
        com.fasterxml.jackson.databind.type.ClassStack classStack30 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean32 = simpleType31.isCollectionLikeType();
        boolean boolean33 = simpleType31.isAbstract();
        boolean boolean34 = simpleType31.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings35 = null;
        com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory19._fromAny(classStack30, (java.lang.reflect.Type) simpleType31, typeBindings35);
        com.fasterxml.jackson.databind.JavaType javaType37 = simpleType31.getContentType();
        boolean boolean38 = simpleType31.hasGenericTypes();
        com.fasterxml.jackson.databind.JavaType javaType39 = simpleType31.withStaticTyping();
        java.lang.String str40 = simpleType31.getTypeName();
        java.lang.Class<?> wildcardClass41 = simpleType31.getClass();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType42 = collectionLikeType7.withValueHandler((java.lang.Object) wildcardClass41);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str14, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Ljava/lang/Enum;" + "'", str23, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(collectionLikeType27);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNull(javaType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(javaType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[simple type, class java.lang.Enum]" + "'", str40, "[simple type, class java.lang.Enum]");
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(collectionLikeType42);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = mapLikeType13.getBindings();
        boolean boolean19 = mapLikeType13.isInterface();
        boolean boolean20 = mapLikeType13.isConcrete();
        java.lang.Object obj21 = mapLikeType13.getContentTypeHandler();
        boolean boolean22 = mapLikeType13.isCollectionLikeType();
        boolean boolean23 = mapLikeType13.isEnumType();
        boolean boolean24 = mapLikeType13.hasHandlers();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
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
        java.lang.Object obj15 = mapLikeType14.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType16 = mapLikeType14._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory0.constructType((java.lang.reflect.Type) mapLikeType14, typeBindings17);
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType21 = simpleType19.withValueHandler((java.lang.Object) '#');
        java.lang.String str22 = javaType21.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean24 = simpleType23.isAbstract();
        boolean boolean25 = simpleType23.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType26 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType21, (com.fasterxml.jackson.databind.JavaType) simpleType23);
        boolean boolean27 = collectionLikeType26.hasHandlers();
        boolean boolean28 = collectionLikeType26.hasHandlers();
        boolean boolean29 = collectionLikeType26.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType33 = simpleType31.withValueHandler((java.lang.Object) '#');
        java.lang.String str34 = javaType33.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean36 = simpleType35.isAbstract();
        boolean boolean37 = simpleType35.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType38 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType33, (com.fasterxml.jackson.databind.JavaType) simpleType35);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings39 = null;
        com.fasterxml.jackson.databind.JavaType javaType40 = typeFactory30.constructType((java.lang.reflect.Type) simpleType35, typeBindings39);
        com.fasterxml.jackson.databind.type.ClassStack classStack41 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType42 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean43 = simpleType42.isCollectionLikeType();
        boolean boolean44 = simpleType42.isAbstract();
        boolean boolean45 = simpleType42.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings46 = null;
        com.fasterxml.jackson.databind.JavaType javaType47 = typeFactory30._fromAny(classStack41, (java.lang.reflect.Type) simpleType42, typeBindings46);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType48 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType26, javaType47);
        java.lang.String str49 = collectionLikeType48.toString();
        com.fasterxml.jackson.databind.JavaType javaType50 = collectionLikeType48.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType51 = javaType50.getReferencedType();
        boolean boolean52 = javaType50.isMapLikeType();
        com.fasterxml.jackson.databind.JavaType javaType53 = typeFactory0.constructType((java.lang.reflect.Type) javaType50);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ljava/lang/Enum;" + "'", str9, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collectionLikeType13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Ljava/lang/Enum;" + "'", str22, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(collectionLikeType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertNotNull(javaType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Ljava/lang/Enum;" + "'", str34, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collectionLikeType38);
        org.junit.Assert.assertNotNull(javaType40);
        org.junit.Assert.assertNotNull(simpleType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(javaType47);
        org.junit.Assert.assertNotNull(collectionLikeType48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]" + "'", str49, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertNotNull(javaType50);
        org.junit.Assert.assertNull(javaType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(javaType53);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        java.lang.String str28 = collectionLikeType7.toString();
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType31 = simpleType29.withValueHandler((java.lang.Object) '#');
        java.lang.String str32 = javaType31.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType33 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean34 = simpleType33.isAbstract();
        boolean boolean35 = simpleType33.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType36 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType31, (com.fasterxml.jackson.databind.JavaType) simpleType33);
        boolean boolean37 = simpleType33.isJavaLangObject();
        boolean boolean38 = simpleType33.isArrayType();
        com.fasterxml.jackson.databind.JavaType javaType39 = collectionLikeType7.withTypeHandler((java.lang.Object) boolean38);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '#' + "'", obj24, '#');
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]" + "'", str28, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Comparable]]");
        org.junit.Assert.assertNotNull(simpleType29);
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Ljava/lang/Enum;" + "'", str32, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collectionLikeType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(javaType39);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType13.getContentType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = mapLikeType13.getBindings();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = mapLikeType13.getBindings();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertNotNull(typeBindings20);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType31 = simpleType29.withValueHandler((java.lang.Object) '#');
        java.lang.String str32 = javaType31.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType33 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean34 = simpleType33.isAbstract();
        boolean boolean35 = simpleType33.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType36 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType31, (com.fasterxml.jackson.databind.JavaType) simpleType33);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings37 = null;
        com.fasterxml.jackson.databind.JavaType javaType38 = typeFactory28.constructType((java.lang.reflect.Type) simpleType33, typeBindings37);
        com.fasterxml.jackson.databind.type.ClassStack classStack39 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType40 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean41 = simpleType40.isCollectionLikeType();
        boolean boolean42 = simpleType40.isAbstract();
        boolean boolean43 = simpleType40.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings44 = null;
        com.fasterxml.jackson.databind.JavaType javaType45 = typeFactory28._fromAny(classStack39, (java.lang.reflect.Type) simpleType40, typeBindings44);
        com.fasterxml.jackson.databind.JavaType javaType46 = simpleType40.getContentType();
        boolean boolean47 = simpleType40.hasGenericTypes();
        com.fasterxml.jackson.databind.JavaType javaType48 = simpleType0.withValueHandler((java.lang.Object) boolean47);
        boolean boolean49 = simpleType0.isPrimitive();
        boolean boolean50 = simpleType0.hasHandlers();
        com.fasterxml.jackson.databind.type.SimpleType simpleType51 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType53 = simpleType51.withValueHandler((java.lang.Object) '#');
        boolean boolean54 = simpleType0.equals((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ljava/lang/Enum;" + "'", str14, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collectionLikeType18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(simpleType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(simpleType29);
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Ljava/lang/Enum;" + "'", str32, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collectionLikeType36);
        org.junit.Assert.assertNotNull(javaType38);
        org.junit.Assert.assertNotNull(simpleType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(simpleType51);
        org.junit.Assert.assertNotNull(javaType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList11 = collectionLikeType7.getInterfaces();
        java.lang.String str13 = collectionLikeType7.containedTypeName((int) ' ');
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str10, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertNotNull(javaTypeList11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.Class<?> wildcardClass3 = typeFactory1._findPrimitive("");
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory1.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean8 = simpleType7.isCollectionLikeType();
        boolean boolean9 = simpleType7.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType11 = simpleType10.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType20 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType7, javaType11, javaType14);
        com.fasterxml.jackson.databind.JavaType javaType21 = mapLikeType20.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory5.constructType((java.lang.reflect.Type) simpleType6, javaType21);
        com.fasterxml.jackson.databind.type.ClassStack classStack23 = null;
        java.lang.reflect.WildcardType wildcardType24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType26 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean27 = simpleType26.isAbstract();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory25.constructType((java.lang.reflect.Type) simpleType26, typeBindings28);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray30 = typeFactory25._modifiers;
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
        com.fasterxml.jackson.databind.type.ClassStack classStack53 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType54 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean55 = simpleType54.isCollectionLikeType();
        boolean boolean56 = simpleType54.isAbstract();
        boolean boolean57 = simpleType54.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings58 = null;
        com.fasterxml.jackson.databind.JavaType javaType59 = typeFactory42._fromAny(classStack53, (java.lang.reflect.Type) simpleType54, typeBindings58);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType60 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType38, javaType59);
        com.fasterxml.jackson.databind.type.SimpleType simpleType61 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean62 = simpleType61.isCollectionLikeType();
        boolean boolean63 = simpleType61.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType64 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType65 = simpleType64.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType66 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType68 = simpleType66.withValueHandler((java.lang.Object) '#');
        java.lang.String str69 = javaType68.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType70 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean71 = simpleType70.isAbstract();
        boolean boolean72 = simpleType70.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType73 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType68, (com.fasterxml.jackson.databind.JavaType) simpleType70);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType74 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType61, javaType65, javaType68);
        com.fasterxml.jackson.databind.JavaType javaType75 = mapLikeType74.getContentType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings76 = javaType75.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType77 = typeFactory25.constructType((java.lang.reflect.Type) collectionLikeType60, typeBindings76);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType78 = typeFactory5._fromWildcard(classStack23, wildcardType24, typeBindings76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(simpleType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNull(typeModifierArray30);
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertNotNull(javaType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Ljava/lang/Enum;" + "'", str34, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collectionLikeType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(simpleType43);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Ljava/lang/Enum;" + "'", str46, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(collectionLikeType50);
        org.junit.Assert.assertNotNull(javaType52);
        org.junit.Assert.assertNotNull(simpleType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(javaType59);
        org.junit.Assert.assertNotNull(collectionLikeType60);
        org.junit.Assert.assertNotNull(simpleType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(simpleType64);
        org.junit.Assert.assertNull(javaType65);
        org.junit.Assert.assertNotNull(simpleType66);
        org.junit.Assert.assertNotNull(javaType68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Ljava/lang/Enum;" + "'", str69, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(collectionLikeType73);
        org.junit.Assert.assertNotNull(javaType75);
        org.junit.Assert.assertNotNull(typeBindings76);
        org.junit.Assert.assertNotNull(javaType77);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        java.lang.String str17 = mapLikeType13.toString();
        boolean boolean18 = mapLikeType13.isMapLikeType();
        boolean boolean19 = mapLikeType13.isTrueMapType();
        java.lang.Class<?> wildcardClass20 = mapLikeType13.getRawClass();
        boolean boolean21 = mapLikeType13.hasContentType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Enum" + "'", str15, "java.lang.Enum");
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str17, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.isReferenceType();
        java.lang.String str9 = collectionLikeType7.buildCanonicalName();
        boolean boolean10 = collectionLikeType7.isFinal();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = simpleType12.withValueHandler((java.lang.Object) '#');
        java.lang.String str15 = javaType14.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean17 = simpleType16.isAbstract();
        boolean boolean18 = simpleType16.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType19 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.JavaType javaType20 = collectionLikeType7.withContentType(javaType14);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str9, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNotNull(javaType20);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = mapLikeType13.getBindings();
        boolean boolean19 = mapLikeType13.hasHandlers();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList20 = mapLikeType13.getInterfaces();
        com.fasterxml.jackson.databind.JavaType javaType21 = mapLikeType13.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType22 = mapLikeType13.getContentType();
        boolean boolean24 = mapLikeType13.equals((java.lang.Object) 1.0d);
        java.lang.String str25 = mapLikeType13.getErasedSignature();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(javaTypeList20);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Ljava/lang/Enum;" + "'", str25, "Ljava/lang/Enum;");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        java.lang.Object obj15 = mapLikeType13.getContentTypeHandler();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType18 = simpleType16.withValueHandler((java.lang.Object) '#');
        java.lang.String str19 = javaType18.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean21 = simpleType20.isAbstract();
        boolean boolean22 = simpleType20.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType18, (com.fasterxml.jackson.databind.JavaType) simpleType20);
        boolean boolean24 = collectionLikeType23.hasHandlers();
        boolean boolean25 = collectionLikeType23.isEnumType();
        boolean boolean26 = collectionLikeType23.hasHandlers();
        boolean boolean27 = mapLikeType13.equals((java.lang.Object) boolean26);
        java.lang.String str28 = mapLikeType13.buildCanonicalName();
        java.lang.Object obj29 = mapLikeType13.getContentTypeHandler();
        java.lang.Class<?> wildcardClass30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) mapLikeType13);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/lang/Enum;" + "'", str19, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.Enum" + "'", str28, "java.lang.Enum");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        boolean boolean11 = collectionLikeType7.isReferenceType();
        com.fasterxml.jackson.databind.JavaType javaType12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        boolean boolean13 = javaType12.isInterface();
        int int14 = javaType12.containedTypeCount();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType15 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) collectionLikeType7, javaType12);
        boolean boolean16 = collectionLikeType7.isContainerType();
        boolean boolean17 = collectionLikeType7.hasHandlers();
        java.lang.Object obj18 = collectionLikeType7.getContentTypeHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = simpleType4.isJavaLangObject();
        java.lang.String str9 = simpleType4.toCanonical();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
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
        java.lang.Object obj25 = mapLikeType24.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType26 = mapLikeType24._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory10.constructType((java.lang.reflect.Type) mapLikeType24, typeBindings27);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) simpleType4, (com.fasterxml.jackson.databind.JavaType) mapLikeType24);
        com.fasterxml.jackson.databind.JavaType javaType30 = mapLikeType24.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType31 = mapLikeType24._keyType;
        java.lang.String str32 = mapLikeType24.buildCanonicalName();
        java.lang.Object obj33 = mapLikeType24.getContentTypeHandler();
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType36 = simpleType34.withValueHandler((java.lang.Object) '#');
        java.lang.String str37 = javaType36.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean39 = simpleType38.isAbstract();
        boolean boolean40 = simpleType38.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType41 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType36, (com.fasterxml.jackson.databind.JavaType) simpleType38);
        boolean boolean42 = collectionLikeType41.hasHandlers();
        boolean boolean43 = collectionLikeType41.isEnumType();
        boolean boolean44 = collectionLikeType41.isConcrete();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType45 = collectionLikeType41.withStaticTyping();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType46 = mapLikeType24.withContentType((com.fasterxml.jackson.databind.JavaType) collectionLikeType45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Comparable" + "'", str9, "java.lang.Comparable");
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/lang/Enum;" + "'", str19, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collectionLikeType23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '#' + "'", obj25, '#');
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNull(javaType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.Enum" + "'", str32, "java.lang.Enum");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(simpleType34);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Ljava/lang/Enum;" + "'", str37, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(collectionLikeType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collectionLikeType45);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) '#');
        java.lang.String str3 = javaType2.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean5 = simpleType4.isAbstract();
        boolean boolean6 = simpleType4.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType2, (com.fasterxml.jackson.databind.JavaType) simpleType4);
        boolean boolean8 = collectionLikeType7.isReferenceType();
        java.lang.String str9 = collectionLikeType7.buildCanonicalName();
        boolean boolean10 = collectionLikeType7.isFinal();
        boolean boolean11 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings12 = collectionLikeType7.getBindings();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str9, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(typeBindings12);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
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
        java.lang.Object obj15 = mapLikeType14.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType16 = mapLikeType14._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory0.constructType((java.lang.reflect.Type) mapLikeType14, typeBindings17);
        java.lang.Object obj19 = mapLikeType14.getContentTypeHandler();
        boolean boolean20 = mapLikeType14.isThrowable();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ljava/lang/Enum;" + "'", str9, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collectionLikeType13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = mapLikeType13.getBindings();
        boolean boolean19 = mapLikeType13.hasHandlers();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList20 = mapLikeType13.getInterfaces();
        java.lang.String str21 = mapLikeType13.buildCanonicalName();
        java.lang.String str23 = mapLikeType13.containedTypeName(0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            mapLikeType13.serialize(jsonGenerator24, serializerProvider25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(javaTypeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.Enum" + "'", str21, "java.lang.Enum");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        com.fasterxml.jackson.databind.JavaType javaType32 = javaType31.getReferencedType();
        java.lang.String str34 = javaType31.containedTypeName((int) (short) 0);
        java.lang.String str35 = javaType31.toString();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]" + "'", str30, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[simple type, class java.lang.Enum]" + "'", str35, "[simple type, class java.lang.Enum]");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType15.withValueHandler((java.lang.Object) '#');
        java.lang.String str18 = javaType17.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean20 = simpleType19.isAbstract();
        boolean boolean21 = simpleType19.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType17, (com.fasterxml.jackson.databind.JavaType) simpleType19);
        boolean boolean23 = collectionLikeType22.hasHandlers();
        boolean boolean24 = collectionLikeType22.hasHandlers();
        boolean boolean25 = collectionLikeType22.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType29 = simpleType27.withValueHandler((java.lang.Object) '#');
        java.lang.String str30 = javaType29.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean32 = simpleType31.isAbstract();
        boolean boolean33 = simpleType31.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType29, (com.fasterxml.jackson.databind.JavaType) simpleType31);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings35 = null;
        com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory26.constructType((java.lang.reflect.Type) simpleType31, typeBindings35);
        com.fasterxml.jackson.databind.type.ClassStack classStack37 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean39 = simpleType38.isCollectionLikeType();
        boolean boolean40 = simpleType38.isAbstract();
        boolean boolean41 = simpleType38.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings42 = null;
        com.fasterxml.jackson.databind.JavaType javaType43 = typeFactory26._fromAny(classStack37, (java.lang.reflect.Type) simpleType38, typeBindings42);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType44 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType22, javaType43);
        boolean boolean45 = mapLikeType13.equals((java.lang.Object) collectionLikeType44);
        boolean boolean46 = mapLikeType13.isContainerType();
        java.lang.Object obj47 = mapLikeType13.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType48 = mapLikeType13._keyType;
        com.fasterxml.jackson.databind.JavaType javaType50 = mapLikeType13.containedType(0);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Ljava/lang/Enum;" + "'", str30, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collectionLikeType34);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(collectionLikeType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(javaType48);
        org.junit.Assert.assertNull(javaType50);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean3 = simpleType2.isCollectionLikeType();
        boolean boolean4 = simpleType2.isAbstract();
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType6 = simpleType5.getSuperClass();
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType9 = simpleType7.withValueHandler((java.lang.Object) '#');
        java.lang.String str10 = javaType9.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean12 = simpleType11.isAbstract();
        boolean boolean13 = simpleType11.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType14 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType9, (com.fasterxml.jackson.databind.JavaType) simpleType11);
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType15 = new com.fasterxml.jackson.databind.type.MapLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType2, javaType6, javaType9);
        com.fasterxml.jackson.databind.JavaType javaType16 = mapLikeType15._keyType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType18 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType15, (com.fasterxml.jackson.databind.JavaType) simpleType17);
        com.fasterxml.jackson.databind.JavaType javaType19 = mapLikeType15.getKeyType();
        boolean boolean20 = mapLikeType15.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType22 = mapLikeType15.containedType((int) (byte) 10);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType23 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, (com.fasterxml.jackson.databind.JavaType) mapLikeType15);
        com.fasterxml.jackson.databind.JavaType javaType24 = mapLikeType15.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType25 = mapLikeType15.getKeyType();
        java.lang.String str26 = mapLikeType15.toString();
        com.fasterxml.jackson.databind.JavaType javaType27 = mapLikeType15.getReferencedType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ljava/lang/Enum;" + "'", str10, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collectionLikeType14);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNull(javaType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str26, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertNull(javaType27);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        boolean boolean27 = mapLikeType23.isJavaLangObject();
        com.fasterxml.jackson.databind.JavaType javaType28 = mapLikeType23.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType29 = mapLikeType23.getSuperClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '#' + "'", obj24, '#');
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNull(javaType29);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        boolean boolean15 = mapLikeType13.isTrueMapType();
        java.lang.String str16 = mapLikeType13.toString();
        boolean boolean17 = mapLikeType13.isTrueMapType();
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType13.getKeyType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]" + "'", str16, "[map-like type; class java.lang.Enum, null -> [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(javaType18);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getSuperClass();
        java.lang.String str3 = simpleType0.containedTypeName((int) 'a');
        boolean boolean4 = simpleType0.hasValueHandler();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleType0.serializeWithType(jsonGenerator5, serializerProvider6, typeSerializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        boolean boolean16 = mapLikeType13.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Enum" + "'", str15, "java.lang.Enum");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(javaType17);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        boolean boolean13 = collectionLikeType7.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = collectionLikeType7.getBindings();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(typeBindings14);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        java.lang.String str12 = collectionLikeType7.buildCanonicalName();
        boolean boolean13 = collectionLikeType7.isTrueCollectionType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.Enum<java.lang.Comparable>" + "'", str12, "java.lang.Enum<java.lang.Comparable>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        boolean boolean3 = simpleType0.hasValueHandler();
        boolean boolean4 = simpleType0.hasGenericTypes();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        boolean boolean31 = collectionLikeType29.hasHandlers();
        java.lang.Object obj32 = collectionLikeType29.getContentValueHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ljava/lang/Enum;" + "'", str15, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collectionLikeType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(collectionLikeType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]" + "'", str30, "[collection-like type; class java.lang.Enum, contains [simple type, class java.lang.Enum]]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType17 = simpleType15.withValueHandler((java.lang.Object) '#');
        java.lang.String str18 = javaType17.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean20 = simpleType19.isAbstract();
        boolean boolean21 = simpleType19.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType17, (com.fasterxml.jackson.databind.JavaType) simpleType19);
        boolean boolean23 = collectionLikeType22.hasHandlers();
        boolean boolean24 = collectionLikeType22.hasHandlers();
        boolean boolean25 = collectionLikeType22.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType29 = simpleType27.withValueHandler((java.lang.Object) '#');
        java.lang.String str30 = javaType29.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean32 = simpleType31.isAbstract();
        boolean boolean33 = simpleType31.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType34 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType29, (com.fasterxml.jackson.databind.JavaType) simpleType31);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings35 = null;
        com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory26.constructType((java.lang.reflect.Type) simpleType31, typeBindings35);
        com.fasterxml.jackson.databind.type.ClassStack classStack37 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean39 = simpleType38.isCollectionLikeType();
        boolean boolean40 = simpleType38.isAbstract();
        boolean boolean41 = simpleType38.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings42 = null;
        com.fasterxml.jackson.databind.JavaType javaType43 = typeFactory26._fromAny(classStack37, (java.lang.reflect.Type) simpleType38, typeBindings42);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType44 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType22, javaType43);
        boolean boolean45 = mapLikeType13.equals((java.lang.Object) collectionLikeType44);
        boolean boolean46 = mapLikeType13.isContainerType();
        java.lang.Object obj47 = mapLikeType13.getContentTypeHandler();
        com.fasterxml.jackson.databind.type.SimpleType simpleType48 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean49 = simpleType48.isCollectionLikeType();
        java.lang.Class<?> wildcardClass50 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType48);
        com.fasterxml.jackson.databind.JavaType javaType52 = simpleType48.withValueHandler((java.lang.Object) (short) 10);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType53 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType48);
        java.lang.String str54 = mapLikeType13.toCanonical();
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
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList66 = javaType65.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.MapLikeType mapLikeType67 = mapLikeType13.withTypeHandler((java.lang.Object) javaType65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Enum;" + "'", str18, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collectionLikeType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Ljava/lang/Enum;" + "'", str30, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collectionLikeType34);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(collectionLikeType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(simpleType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(javaType52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "java.lang.Enum" + "'", str54, "java.lang.Enum");
        org.junit.Assert.assertNotNull(typeFactory55);
        org.junit.Assert.assertNotNull(simpleType56);
        org.junit.Assert.assertNotNull(javaType58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Ljava/lang/Enum;" + "'", str59, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(collectionLikeType63);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(javaTypeList66);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        java.lang.ClassLoader classLoader53 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = typeFactory0.withClassLoader(classLoader53);
        typeFactory0.clearCache();
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ljava/lang/Enum;" + "'", str9, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collectionLikeType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ljava/lang/Enum;" + "'", str21, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collectionLikeType25);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(simpleType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(collectionLikeType35);
        org.junit.Assert.assertNotNull(simpleType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(simpleType39);
        org.junit.Assert.assertNull(javaType40);
        org.junit.Assert.assertNotNull(simpleType41);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Ljava/lang/Enum;" + "'", str44, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(collectionLikeType48);
        org.junit.Assert.assertNotNull(javaType50);
        org.junit.Assert.assertNotNull(typeBindings51);
        org.junit.Assert.assertNotNull(javaType52);
        org.junit.Assert.assertNotNull(typeFactory54);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        com.fasterxml.jackson.databind.JavaType javaType15 = mapLikeType13.getContentType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = mapLikeType13.getBindings();
        java.lang.Object obj17 = mapLikeType13.getContentValueHandler();
        java.lang.Object obj18 = mapLikeType13.getContentValueHandler();
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType36 = simpleType34.withValueHandler((java.lang.Object) '#');
        java.lang.String str37 = javaType36.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean39 = simpleType38.isAbstract();
        boolean boolean40 = simpleType38.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType41 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType36, (com.fasterxml.jackson.databind.JavaType) simpleType38);
        boolean boolean42 = collectionLikeType41.hasHandlers();
        boolean boolean43 = collectionLikeType41.hasHandlers();
        boolean boolean44 = collectionLikeType41.isTrueCollectionType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType46 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType48 = simpleType46.withValueHandler((java.lang.Object) '#');
        java.lang.String str49 = javaType48.getErasedSignature();
        com.fasterxml.jackson.databind.type.SimpleType simpleType50 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean51 = simpleType50.isAbstract();
        boolean boolean52 = simpleType50.isReferenceType();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType53 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType48, (com.fasterxml.jackson.databind.JavaType) simpleType50);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings54 = null;
        com.fasterxml.jackson.databind.JavaType javaType55 = typeFactory45.constructType((java.lang.reflect.Type) simpleType50, typeBindings54);
        com.fasterxml.jackson.databind.type.ClassStack classStack56 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType57 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean58 = simpleType57.isCollectionLikeType();
        boolean boolean59 = simpleType57.isAbstract();
        boolean boolean60 = simpleType57.isInterface();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings61 = null;
        com.fasterxml.jackson.databind.JavaType javaType62 = typeFactory45._fromAny(classStack56, (java.lang.reflect.Type) simpleType57, typeBindings61);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType63 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) collectionLikeType41, javaType62);
        boolean boolean64 = mapLikeType32.equals((java.lang.Object) collectionLikeType63);
        boolean boolean65 = mapLikeType32.isContainerType();
        java.lang.Object obj66 = mapLikeType32.getContentTypeHandler();
        com.fasterxml.jackson.databind.type.SimpleType simpleType67 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean68 = simpleType67.isCollectionLikeType();
        java.lang.Class<?> wildcardClass69 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType67);
        com.fasterxml.jackson.databind.JavaType javaType71 = simpleType67.withValueHandler((java.lang.Object) (short) 10);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType72 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) mapLikeType32, (com.fasterxml.jackson.databind.JavaType) simpleType67);
        boolean boolean73 = simpleType67.isInterface();
        com.fasterxml.jackson.databind.JavaType javaType74 = simpleType67.getReferencedType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType75 = mapLikeType13.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + '#' + "'", obj17, '#');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '#' + "'", obj18, '#');
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNotNull(simpleType24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Ljava/lang/Enum;" + "'", str27, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collectionLikeType31);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertNotNull(simpleType34);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Ljava/lang/Enum;" + "'", str37, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(collectionLikeType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(simpleType46);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Ljava/lang/Enum;" + "'", str49, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(collectionLikeType53);
        org.junit.Assert.assertNotNull(javaType55);
        org.junit.Assert.assertNotNull(simpleType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(javaType62);
        org.junit.Assert.assertNotNull(collectionLikeType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(simpleType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(javaType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(javaType74);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = collectionLikeType15.containedType((int) (short) 100);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList18 = collectionLikeType15.getInterfaces();
        java.lang.Class<?> wildcardClass19 = collectionLikeType15.getRawClass();
        java.lang.Class<?> wildcardClass20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) collectionLikeType15);
        java.lang.String str21 = collectionLikeType15.getErasedSignature();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/lang/Enum;" + "'", str3, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collectionLikeType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str14, "[simple type, class java.lang.Comparable]");
        org.junit.Assert.assertNotNull(collectionLikeType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(javaTypeList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ljava/lang/Enum;" + "'", str21, "Ljava/lang/Enum;");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean19 = mapLikeType13.equals((java.lang.Object) simpleType18);
        java.lang.String str20 = mapLikeType13.toCanonical();
        boolean boolean21 = mapLikeType13.isTrueMapType();
        boolean boolean22 = mapLikeType13.isJavaLangObject();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Enum" + "'", str15, "java.lang.Enum");
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.Enum" + "'", str20, "java.lang.Enum");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
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
        java.lang.Object obj15 = mapLikeType14.getContentValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType16 = mapLikeType14._valueType;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory0.constructType((java.lang.reflect.Type) mapLikeType14, typeBindings17);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory0._unknownType();
        java.lang.ClassLoader classLoader20 = typeFactory0.getClassLoader();
        java.lang.Class<?> wildcardClass22 = typeFactory0._findPrimitive("[simple type, class java.lang.String]");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ljava/lang/Enum;" + "'", str9, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collectionLikeType13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNull(classLoader20);
        org.junit.Assert.assertNull(wildcardClass22);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        com.fasterxml.jackson.databind.JavaType javaType17 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType18 = mapLikeType13.getKeyType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = mapLikeType13.getBindings();
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean21 = simpleType20.isCollectionLikeType();
        boolean boolean22 = simpleType20.isAbstract();
        boolean boolean23 = simpleType20.isInterface();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom((com.fasterxml.jackson.databind.JavaType) mapLikeType13, (com.fasterxml.jackson.databind.JavaType) simpleType20);
        boolean boolean25 = mapLikeType13.isMapLikeType();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList26 = mapLikeType13.getInterfaces();
        boolean boolean27 = mapLikeType13.hasHandlers();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ljava/lang/Enum;" + "'", str8, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collectionLikeType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collectionLikeType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(javaTypeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }
}

