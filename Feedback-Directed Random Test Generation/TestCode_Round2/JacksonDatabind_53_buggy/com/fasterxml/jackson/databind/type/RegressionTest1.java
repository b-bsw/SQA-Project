package com.fasterxml.jackson.databind.type;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        java.lang.String str18 = typeBindings14.toString();
        boolean boolean20 = typeBindings14.hasUnbound("<>");
        boolean boolean22 = typeBindings14.hasUnbound("");
        com.fasterxml.jackson.databind.JavaType javaType24 = typeBindings14.getBoundType(0);
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray25 = typeBindings14.typeParameterArray();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<>" + "'", str18, "<>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNotNull(javaTypeArray25);
        org.junit.Assert.assertArrayEquals(javaTypeArray25, new com.fasterxml.jackson.databind.JavaType[] {});
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory4.constructType((java.lang.reflect.Type) simpleType5, typeBindings6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType5, (com.fasterxml.jackson.databind.JavaType) simpleType8);
        com.fasterxml.jackson.databind.type.ArrayType arrayType10 = typeFactory2.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray12, classLoader13);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory17.withModifier(typeModifier18);
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory19._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory19._unknownType();
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory19.withClassLoader(classLoader22);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory19._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withModifier(typeModifier26);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings31 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType32 = typeFactory29.constructType((java.lang.reflect.Type) simpleType30, typeBindings31);
        com.fasterxml.jackson.databind.type.SimpleType simpleType33 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory28.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType30, (com.fasterxml.jackson.databind.JavaType) simpleType33);
        com.fasterxml.jackson.databind.type.ArrayType arrayType35 = typeFactory27.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType30);
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray37, classLoader38);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray37);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray37);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeFactory42.withModifier(typeModifier43);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings48 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType49 = typeFactory46.constructType((java.lang.reflect.Type) simpleType47, typeBindings48);
        com.fasterxml.jackson.databind.type.SimpleType simpleType50 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType51 = typeFactory45.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType47, (com.fasterxml.jackson.databind.JavaType) simpleType50);
        com.fasterxml.jackson.databind.type.ArrayType arrayType52 = typeFactory44.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType47);
        com.fasterxml.jackson.databind.type.TypeParser typeParser53 = typeFactory44._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray54 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader55 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser53, typeModifierArray54, classLoader55);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader58 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory59 = typeFactory57.withClassLoader(classLoader58);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier60 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory61 = typeFactory59.withModifier(typeModifier60);
        com.fasterxml.jackson.databind.JavaType javaType62 = typeFactory61._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType63 = typeFactory61._unknownType();
        java.lang.ClassLoader classLoader64 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = typeFactory61.withClassLoader(classLoader64);
        com.fasterxml.jackson.databind.type.TypeParser typeParser66 = typeFactory61._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier68 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory69 = typeFactory67.withModifier(typeModifier68);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory70 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory71 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType72 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings73 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType74 = typeFactory71.constructType((java.lang.reflect.Type) simpleType72, typeBindings73);
        com.fasterxml.jackson.databind.type.SimpleType simpleType75 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType76 = typeFactory70.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType72, (com.fasterxml.jackson.databind.JavaType) simpleType75);
        com.fasterxml.jackson.databind.type.ArrayType arrayType77 = typeFactory69.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType72);
        com.fasterxml.jackson.databind.type.TypeParser typeParser78 = typeFactory69._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray79 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader80 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory81 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser78, typeModifierArray79, classLoader80);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory82 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser66, typeModifierArray79);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory83 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser53, typeModifierArray79);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory84 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray79);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(arrayType10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(simpleType30);
        org.junit.Assert.assertNotNull(typeBindings31);
        org.junit.Assert.assertNotNull(javaType32);
        org.junit.Assert.assertNotNull(simpleType33);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(arrayType35);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray37);
        org.junit.Assert.assertArrayEquals(typeModifierArray37, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(simpleType47);
        org.junit.Assert.assertNotNull(typeBindings48);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNotNull(simpleType50);
        org.junit.Assert.assertNotNull(javaType51);
        org.junit.Assert.assertNotNull(arrayType52);
        org.junit.Assert.assertNotNull(typeParser53);
        org.junit.Assert.assertNotNull(typeModifierArray54);
        org.junit.Assert.assertArrayEquals(typeModifierArray54, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory57);
        org.junit.Assert.assertNotNull(typeFactory59);
        org.junit.Assert.assertNotNull(typeFactory61);
        org.junit.Assert.assertNotNull(javaType62);
        org.junit.Assert.assertNotNull(javaType63);
        org.junit.Assert.assertNotNull(typeFactory65);
        org.junit.Assert.assertNotNull(typeParser66);
        org.junit.Assert.assertNotNull(typeFactory67);
        org.junit.Assert.assertNotNull(typeFactory69);
        org.junit.Assert.assertNotNull(typeFactory70);
        org.junit.Assert.assertNotNull(typeFactory71);
        org.junit.Assert.assertNotNull(simpleType72);
        org.junit.Assert.assertNotNull(typeBindings73);
        org.junit.Assert.assertNotNull(javaType74);
        org.junit.Assert.assertNotNull(simpleType75);
        org.junit.Assert.assertNotNull(javaType76);
        org.junit.Assert.assertNotNull(arrayType77);
        org.junit.Assert.assertNotNull(typeParser78);
        org.junit.Assert.assertNotNull(typeModifierArray79);
        org.junit.Assert.assertArrayEquals(typeModifierArray79, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        typeFactory0.clearCache();
        java.lang.ClassLoader classLoader19 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory0.withModifier(typeModifier20);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNull(classLoader19);
        org.junit.Assert.assertNotNull(typeFactory21);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        typeFactory0.clearCache();
        java.lang.ClassLoader classLoader19 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNull(classLoader19);
        org.junit.Assert.assertNotNull(javaType20);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory2.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        java.lang.ClassLoader classLoader9 = typeFactory2._classLoader;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory2.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory13._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(arrayType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNull(classLoader9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNull(typeModifierArray11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser14);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory3._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory3.withClassLoader(classLoader5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory6._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeParser10);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.Class<?> wildcardClass2 = typeFactory0._findPrimitive("<>");
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeBindings2.findBoundType("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = typeBindings2.withUnboundVariable("<>");
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList8 = typeBindings2.getTypeParameters();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = typeBindings2.withUnboundVariable("<>");
        java.lang.String str12 = typeBindings2.getBoundName(10);
        boolean boolean13 = typeBindings2.isEmpty();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(typeBindings7);
        org.junit.Assert.assertNotNull(javaTypeList8);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) (byte) 10);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList3 = typeBindings0.getTypeParameters();
        java.lang.String str4 = typeBindings0.toString();
        boolean boolean6 = typeBindings0.hasUnbound("");
        com.fasterxml.jackson.databind.JavaType javaType8 = typeBindings0.getBoundType((int) (short) 100);
        int int9 = typeBindings0.size();
        java.lang.Object obj10 = typeBindings0.readResolve();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(javaTypeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<>" + "'", str4, "<>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "<>");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory3._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory3.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory6._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap8 = typeFactory6._typeCache;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory6.withClassLoader(classLoader9);
        typeFactory6.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.type.ClassStack classStack4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        java.lang.Class<?> wildcardClass9 = typeBindings7.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeBindings10.getBoundType((int) (byte) 10);
        java.lang.Object obj13 = typeBindings10.readResolve();
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory0._fromAny(classStack4, (java.lang.reflect.Type) wildcardClass9, typeBindings10);
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray15 = typeBindings10.typeParameterArray();
        java.lang.Object obj16 = typeBindings10.readResolve();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(typeBindings7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "<>");
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(javaTypeArray15);
        org.junit.Assert.assertArrayEquals(javaTypeArray15, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "<>");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withClassLoader(classLoader6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory0.withModifier(typeModifier11);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory12);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap6 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory8._unknownType();
        java.lang.ClassLoader classLoader10 = typeFactory8.getClassLoader();
        typeFactory8.clearCache();
        java.lang.Class<?> wildcardClass12 = typeFactory8.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        typeFactory0.clearCache();
        java.lang.Class<?> wildcardClass20 = typeFactory0._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNull(wildcardClass20);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) (byte) 10);
        boolean boolean3 = typeBindings0.isEmpty();
        java.lang.String str4 = typeBindings0.toString();
        java.lang.Object obj5 = typeBindings0.readResolve();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = typeBindings0.withUnboundVariable("<Ljava/lang/Object;>");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<>" + "'", str4, "<>");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "<>");
        org.junit.Assert.assertNotNull(typeBindings7);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        java.lang.String str20 = typeBindings16.toString();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray21 = typeBindings16.typeParameterArray();
        java.lang.Class<?> wildcardClass22 = typeBindings16.getClass();
        java.lang.Class<?> wildcardClass23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass22);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<>" + "'", str20, "<>");
        org.junit.Assert.assertNotNull(javaTypeArray21);
        org.junit.Assert.assertArrayEquals(javaTypeArray21, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader2 = typeFactory1._classLoader;
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory1.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory6._parser;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory6._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory10.withClassLoader(classLoader11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withModifier(typeModifier13);
        java.lang.ClassLoader classLoader15 = typeFactory14.getClassLoader();
        typeFactory14.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser17 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader19 = typeFactory18._classLoader;
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory18.withClassLoader(classLoader20);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withModifier(typeModifier22);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory23._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory27.withModifier(typeModifier28);
        java.lang.ClassLoader classLoader30 = typeFactory29.getClassLoader();
        typeFactory29.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser32 = typeFactory29._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray33 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser32, typeModifierArray33, classLoader34);
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray33, classLoader36);
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser17, typeModifierArray33, classLoader38);
        java.lang.ClassLoader classLoader40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray33, classLoader40);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNull(classLoader2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNull(classLoader15);
        org.junit.Assert.assertNotNull(typeParser17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNull(classLoader19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNull(classLoader30);
        org.junit.Assert.assertNotNull(typeParser32);
        org.junit.Assert.assertNotNull(typeModifierArray33);
        org.junit.Assert.assertArrayEquals(typeModifierArray33, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withModifier(typeModifier4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        boolean boolean18 = typeBindings14.isEmpty();
        java.lang.String str20 = typeBindings14.getBoundName((int) (short) 1);
        java.lang.String str21 = typeBindings14.toString();
        boolean boolean23 = typeBindings14.hasUnbound("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<>" + "'", str21, "<>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap3 = typeFactory2._typeCache;
        java.lang.Class<?> wildcardClass5 = typeFactory2._findPrimitive("");
        java.lang.ClassLoader classLoader6 = typeFactory2.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory2.getClassLoader();
        java.lang.ClassLoader classLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeFactory2.classForName("<Ljava/lang/Object;>", false, classLoader10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <Ljava/lang/Object;>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        java.lang.String str20 = typeBindings16.toString();
        boolean boolean21 = typeBindings16.isEmpty();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray22 = typeBindings16.typeParameterArray();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<>" + "'", str20, "<>");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(javaTypeArray22);
        org.junit.Assert.assertArrayEquals(javaTypeArray22, new com.fasterxml.jackson.databind.JavaType[] {});
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType1, (com.fasterxml.jackson.databind.JavaType) simpleType2);
        java.lang.ClassLoader classLoader4 = typeFactory0._classLoader;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader7 = typeFactory6._classLoader;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory9.withModifier(typeModifier10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = typeFactory11._parser;
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory11._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader15 = typeFactory14._classLoader;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory14.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory19.constructType((java.lang.reflect.Type) simpleType20, typeBindings21);
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory18.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType23);
        com.fasterxml.jackson.databind.type.SimpleType simpleType25 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory14.constructType((java.lang.reflect.Type) simpleType23, (com.fasterxml.jackson.databind.JavaType) simpleType25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader28 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory27.withClassLoader(classLoader28);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray30 = typeFactory29._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory29._unknownType();
        com.fasterxml.jackson.databind.type.ArrayType arrayType32 = typeFactory14.constructArrayType(javaType31);
        com.fasterxml.jackson.databind.JavaType javaType33 = typeFactory0.moreSpecificType(javaType13, javaType31);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNull(classLoader15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(typeBindings21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(simpleType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNull(typeModifierArray30);
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertNotNull(arrayType32);
        org.junit.Assert.assertNotNull(javaType33);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        java.lang.Object obj1 = typeBindings0.readResolve();
        int int2 = typeBindings0.size();
        boolean boolean4 = typeBindings0.hasUnbound("hi!");
        boolean boolean5 = typeBindings0.isEmpty();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray6 = typeBindings0.typeParameterArray();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "<>");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(javaTypeArray6);
        org.junit.Assert.assertArrayEquals(javaTypeArray6, new com.fasterxml.jackson.databind.JavaType[] {});
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory2.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory2._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(arrayType6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNotNull(javaType8);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        typeFactory0.clearCache();
        java.lang.ClassLoader classLoader19 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray20 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.ClassStack classStack21 = null;
        java.lang.reflect.ParameterizedType parameterizedType22 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings23 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean25 = typeBindings23.equals((java.lang.Object) simpleType24);
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray26 = typeBindings23.typeParameterArray();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray27 = typeBindings23.typeParameterArray();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings29 = typeBindings23.withUnboundVariable("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory0._fromParamType(classStack21, parameterizedType22, typeBindings29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNull(classLoader19);
        org.junit.Assert.assertNull(typeModifierArray20);
        org.junit.Assert.assertNotNull(typeBindings23);
        org.junit.Assert.assertNotNull(simpleType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(javaTypeArray26);
        org.junit.Assert.assertArrayEquals(javaTypeArray26, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNotNull(javaTypeArray27);
        org.junit.Assert.assertArrayEquals(javaTypeArray27, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNotNull(typeBindings29);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType21 = typeBindings19.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory0.constructType((java.lang.reflect.Type) simpleType18, typeBindings19);
        java.lang.Object obj23 = typeBindings19.readResolve();
        int int24 = typeBindings19.size();
        boolean boolean26 = typeBindings19.hasUnbound("hi!");
        java.lang.Object obj27 = typeBindings19.readResolve();
        int int28 = typeBindings19.size();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "<>");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "<>");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory2._modifiers;
        java.lang.Class<?> wildcardClass7 = typeFactory2._findPrimitive("<Ljava/lang/Object;>");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory3._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory3.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory6._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap8 = typeFactory6._typeCache;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory6.withClassLoader(classLoader9);
        java.lang.ClassLoader classLoader11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory6.withClassLoader(classLoader11);
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withClassLoader(classLoader13);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType21 = typeBindings19.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory0.constructType((java.lang.reflect.Type) simpleType18, typeBindings19);
        java.lang.ClassLoader classLoader23 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap24 = typeFactory0._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNull(classLoader23);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap24);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory2.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        java.lang.ClassLoader classLoader9 = typeFactory2._classLoader;
        java.lang.Class<?> wildcardClass11 = typeFactory2._findPrimitive("<>");
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = typeFactory2._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(arrayType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNull(classLoader9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeParser12);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass6 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory2._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap8 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.ClassStack classStack10 = null;
        java.lang.reflect.ParameterizedType parameterizedType11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory13.constructType((java.lang.reflect.Type) simpleType14, typeBindings15);
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory12.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType14, (com.fasterxml.jackson.databind.JavaType) simpleType17);
        com.fasterxml.jackson.databind.type.ClassStack classStack19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory20.constructType((java.lang.reflect.Type) simpleType21, typeBindings22);
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType25 = typeFactory20.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType24);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj27 = null;
        boolean boolean28 = typeBindings26.equals(obj27);
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory12._fromAny(classStack19, (java.lang.reflect.Type) arrayType25, typeBindings26);
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings31 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType33 = typeBindings31.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory12.constructType((java.lang.reflect.Type) simpleType30, typeBindings31);
        java.lang.Object obj35 = typeBindings31.readResolve();
        int int36 = typeBindings31.size();
        boolean boolean37 = typeBindings31.isEmpty();
        com.fasterxml.jackson.databind.JavaType javaType39 = typeBindings31.getBoundType((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType40 = typeFactory2._fromParamType(classStack10, parameterizedType11, typeBindings31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap8);
        org.junit.Assert.assertNull(typeModifierArray9);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertNotNull(typeBindings15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(typeBindings22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(simpleType24);
        org.junit.Assert.assertNotNull(arrayType25);
        org.junit.Assert.assertNotNull(typeBindings26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(simpleType30);
        org.junit.Assert.assertNotNull(typeBindings31);
        org.junit.Assert.assertNull(javaType33);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "<>");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(javaType39);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType21 = typeBindings19.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory0.constructType((java.lang.reflect.Type) simpleType18, typeBindings19);
        java.lang.Object obj23 = typeBindings19.readResolve();
        int int24 = typeBindings19.size();
        boolean boolean26 = typeBindings19.hasUnbound("hi!");
        java.lang.Object obj27 = typeBindings19.readResolve();
        java.lang.Object obj28 = typeBindings19.readResolve();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray29 = typeBindings19.typeParameterArray();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "<>");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "<>");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "<>");
        org.junit.Assert.assertNotNull(javaTypeArray29);
        org.junit.Assert.assertArrayEquals(javaTypeArray29, new com.fasterxml.jackson.databind.JavaType[] {});
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._unknownType();
        typeFactory0.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0.constructFromCanonical("<Ljava/lang/Object;>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '<Ljava/lang/Object;>' (remaining: 'Ljava/lang/Object;>'): Can not locate class '<', problem: <");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(javaType4);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray1 = typeBindings0.typeParameterArray();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList2 = typeBindings0.getTypeParameters();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings4 = typeBindings0.withUnboundVariable("<>");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNotNull(javaTypeArray1);
        org.junit.Assert.assertArrayEquals(javaTypeArray1, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNotNull(javaTypeList2);
        org.junit.Assert.assertNotNull(typeBindings4);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory4.constructType((java.lang.reflect.Type) simpleType5, typeBindings6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType5, (com.fasterxml.jackson.databind.JavaType) simpleType8);
        com.fasterxml.jackson.databind.type.ArrayType arrayType10 = typeFactory2.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray12, classLoader13);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory17.withModifier(typeModifier18);
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory19._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory19._unknownType();
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory19.withClassLoader(classLoader22);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory19._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withModifier(typeModifier26);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType30 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings31 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType32 = typeFactory29.constructType((java.lang.reflect.Type) simpleType30, typeBindings31);
        com.fasterxml.jackson.databind.type.SimpleType simpleType33 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory28.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType30, (com.fasterxml.jackson.databind.JavaType) simpleType33);
        com.fasterxml.jackson.databind.type.ArrayType arrayType35 = typeFactory27.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType30);
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray37, classLoader38);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray37);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray37);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeFactory42.withClassLoader(classLoader43);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeFactory44.withModifier(typeModifier45);
        com.fasterxml.jackson.databind.type.TypeParser typeParser47 = typeFactory46._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType49 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings50 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType51 = typeFactory48.constructType((java.lang.reflect.Type) simpleType49, typeBindings50);
        com.fasterxml.jackson.databind.type.SimpleType simpleType52 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType53 = typeFactory48.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType52);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap54 = typeFactory48._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser55 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = typeFactory56.withClassLoader(classLoader57);
        java.lang.Class<?> wildcardClass60 = typeFactory58._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass62 = typeFactory58._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser63 = typeFactory58._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader65 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory66 = typeFactory64.withClassLoader(classLoader65);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier67 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory68 = typeFactory66.withModifier(typeModifier67);
        java.lang.ClassLoader classLoader69 = typeFactory68.getClassLoader();
        typeFactory68.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser71 = typeFactory68._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray72 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader73 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory74 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser71, typeModifierArray72, classLoader73);
        java.lang.ClassLoader classLoader75 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory76 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser63, typeModifierArray72, classLoader75);
        java.lang.ClassLoader classLoader77 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory78 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser55, typeModifierArray72, classLoader77);
        java.lang.ClassLoader classLoader79 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory80 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser47, typeModifierArray72, classLoader79);
        java.lang.ClassLoader classLoader81 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory82 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray72, classLoader81);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(arrayType10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(simpleType30);
        org.junit.Assert.assertNotNull(typeBindings31);
        org.junit.Assert.assertNotNull(javaType32);
        org.junit.Assert.assertNotNull(simpleType33);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(arrayType35);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray37);
        org.junit.Assert.assertArrayEquals(typeModifierArray37, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(typeParser47);
        org.junit.Assert.assertNotNull(typeFactory48);
        org.junit.Assert.assertNotNull(simpleType49);
        org.junit.Assert.assertNotNull(typeBindings50);
        org.junit.Assert.assertNotNull(javaType51);
        org.junit.Assert.assertNotNull(simpleType52);
        org.junit.Assert.assertNotNull(arrayType53);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap54);
        org.junit.Assert.assertNotNull(typeParser55);
        org.junit.Assert.assertNotNull(typeFactory56);
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNull(wildcardClass60);
        org.junit.Assert.assertNull(wildcardClass62);
        org.junit.Assert.assertNotNull(typeParser63);
        org.junit.Assert.assertNotNull(typeFactory64);
        org.junit.Assert.assertNotNull(typeFactory66);
        org.junit.Assert.assertNotNull(typeFactory68);
        org.junit.Assert.assertNull(classLoader69);
        org.junit.Assert.assertNotNull(typeParser71);
        org.junit.Assert.assertNotNull(typeModifierArray72);
        org.junit.Assert.assertArrayEquals(typeModifierArray72, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType21 = typeBindings19.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory0.constructType((java.lang.reflect.Type) simpleType18, typeBindings19);
        java.lang.ClassLoader classLoader23 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap24 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack25 = null;
        java.lang.reflect.GenericArrayType genericArrayType26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType28 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings29 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory27.constructType((java.lang.reflect.Type) simpleType28, typeBindings29);
        com.fasterxml.jackson.databind.JavaType javaType32 = typeBindings29.findBoundType("");
        java.lang.Object obj33 = typeBindings29.readResolve();
        java.lang.Object obj34 = typeBindings29.readResolve();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType35 = typeFactory0._fromArrayType(classStack25, genericArrayType26, typeBindings29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNull(classLoader23);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap24);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(simpleType28);
        org.junit.Assert.assertNotNull(typeBindings29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "<>");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "<>");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap6 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        java.lang.Class<?> wildcardClass10 = typeFactory8._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory8.withModifier(typeModifier11);
        com.fasterxml.jackson.databind.type.ClassStack classStack13 = null;
        java.lang.reflect.WildcardType wildcardType14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15.constructType((java.lang.reflect.Type) simpleType16, typeBindings17);
        com.fasterxml.jackson.databind.type.ClassStack classStack19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory20.constructType((java.lang.reflect.Type) simpleType21, typeBindings22);
        java.lang.Class<?> wildcardClass24 = typeBindings22.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType27 = typeBindings25.getBoundType((int) (byte) 10);
        java.lang.Object obj28 = typeBindings25.readResolve();
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory15._fromAny(classStack19, (java.lang.reflect.Type) wildcardClass24, typeBindings25);
        int int30 = typeBindings25.size();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray31 = typeBindings25.typeParameterArray();
        com.fasterxml.jackson.databind.JavaType javaType33 = typeBindings25.findBoundType("<>");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory12._fromWildcard(classStack13, wildcardType14, typeBindings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(typeBindings17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(typeBindings22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(typeBindings25);
        org.junit.Assert.assertNull(javaType27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "<>");
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(javaTypeArray31);
        org.junit.Assert.assertArrayEquals(javaTypeArray31, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNull(javaType33);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2._unknownType();
        java.lang.ClassLoader classLoader6 = typeFactory2.getClassLoader();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        java.lang.ClassLoader classLoader9 = typeFactory2._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNull(classLoader9);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory2.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        java.lang.ClassLoader classLoader9 = typeFactory2._classLoader;
        java.lang.Class<?> wildcardClass11 = typeFactory2._findPrimitive("<>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = typeFactory2.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(arrayType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNull(classLoader9);
        org.junit.Assert.assertNull(wildcardClass11);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap3 = typeFactory2._typeCache;
        java.lang.Class<?> wildcardClass5 = typeFactory2._findPrimitive("");
        java.lang.ClassLoader classLoader6 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withModifier(typeModifier7);
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory2.withClassLoader(classLoader9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeFactory2.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory4.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory11.constructType((java.lang.reflect.Type) simpleType12, typeBindings13);
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory2.constructType((java.lang.reflect.Type) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.type.ArrayType arrayType17 = typeFactory2.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType16);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(typeBindings7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(typeBindings13);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(arrayType17);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray1 = typeBindings0.typeParameterArray();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = typeBindings0.withUnboundVariable("<>");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNotNull(javaTypeArray1);
        org.junit.Assert.assertArrayEquals(javaTypeArray1, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNotNull(typeBindings3);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory4.constructType((java.lang.reflect.Type) simpleType5, typeBindings6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType5, (com.fasterxml.jackson.databind.JavaType) simpleType8);
        com.fasterxml.jackson.databind.type.ArrayType arrayType10 = typeFactory2.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = null;
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray12, classLoader13);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory17.withModifier(typeModifier18);
        java.lang.ClassLoader classLoader20 = typeFactory19.getClassLoader();
        typeFactory19.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser22 = typeFactory19._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withClassLoader(classLoader24);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withModifier(typeModifier26);
        java.lang.ClassLoader classLoader28 = typeFactory27.getClassLoader();
        typeFactory27.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader32 = typeFactory31._classLoader;
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory31.withClassLoader(classLoader33);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory34.withModifier(typeModifier35);
        com.fasterxml.jackson.databind.type.TypeParser typeParser37 = typeFactory36._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = typeFactory38.withClassLoader(classLoader39);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = typeFactory40.withModifier(typeModifier41);
        java.lang.ClassLoader classLoader43 = typeFactory42.getClassLoader();
        typeFactory42.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser45 = typeFactory42._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray46 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser45, typeModifierArray46, classLoader47);
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser37, typeModifierArray46, classLoader49);
        java.lang.ClassLoader classLoader51 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray46, classLoader51);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser22, typeModifierArray46);
        java.lang.Class<?> wildcardClass55 = typeFactory53._findPrimitive("<>");
        java.lang.ClassLoader classLoader56 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = typeFactory53.withClassLoader(classLoader56);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap58 = typeFactory53._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray59 = typeFactory53._modifiers;
        java.lang.ClassLoader classLoader60 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory61 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray59, classLoader60);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(arrayType10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNull(classLoader20);
        org.junit.Assert.assertNotNull(typeParser22);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNull(classLoader28);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeFactory31);
        org.junit.Assert.assertNull(classLoader32);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeParser37);
        org.junit.Assert.assertNotNull(typeFactory38);
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNull(classLoader43);
        org.junit.Assert.assertNotNull(typeParser45);
        org.junit.Assert.assertNotNull(typeModifierArray46);
        org.junit.Assert.assertArrayEquals(typeModifierArray46, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNull(wildcardClass55);
        org.junit.Assert.assertNotNull(typeFactory57);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap58);
        org.junit.Assert.assertNotNull(typeModifierArray59);
        org.junit.Assert.assertArrayEquals(typeModifierArray59, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory4.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory11.constructType((java.lang.reflect.Type) simpleType12, typeBindings13);
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory2.constructType((java.lang.reflect.Type) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap16 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray17 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory2.withModifier(typeModifier19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = typeFactory2.findClass("<Ljava/lang/Object;>");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <Ljava/lang/Object;>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(typeBindings7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(typeBindings13);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap16);
        org.junit.Assert.assertNull(typeModifierArray17);
        org.junit.Assert.assertNull(typeModifierArray18);
        org.junit.Assert.assertNotNull(typeFactory20);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray2 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader5 = typeFactory4._classLoader;
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory4.withClassLoader(classLoader6);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withModifier(typeModifier8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory9._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withClassLoader(classLoader12);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory13.withModifier(typeModifier14);
        java.lang.ClassLoader classLoader16 = typeFactory15.getClassLoader();
        typeFactory15.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withClassLoader(classLoader20);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withModifier(typeModifier22);
        java.lang.ClassLoader classLoader24 = typeFactory23.getClassLoader();
        typeFactory23.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = typeFactory23._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader28 = typeFactory27._classLoader;
        java.lang.ClassLoader classLoader29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = typeFactory27.withClassLoader(classLoader29);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withModifier(typeModifier31);
        com.fasterxml.jackson.databind.type.TypeParser typeParser33 = typeFactory32._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory34.withClassLoader(classLoader35);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier37 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = typeFactory36.withModifier(typeModifier37);
        java.lang.ClassLoader classLoader39 = typeFactory38.getClassLoader();
        typeFactory38.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser41 = typeFactory38._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray42 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser41, typeModifierArray42, classLoader43);
        java.lang.ClassLoader classLoader45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser33, typeModifierArray42, classLoader45);
        java.lang.ClassLoader classLoader47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray42, classLoader47);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray42);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray42);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray42);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray52);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNull(typeModifierArray2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNull(classLoader16);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNull(classLoader24);
        org.junit.Assert.assertNotNull(typeParser26);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNull(classLoader28);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(typeParser33);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeFactory38);
        org.junit.Assert.assertNull(classLoader39);
        org.junit.Assert.assertNotNull(typeParser41);
        org.junit.Assert.assertNotNull(typeModifierArray42);
        org.junit.Assert.assertArrayEquals(typeModifierArray42, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap6 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory2._unknownType();
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType9);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) (byte) 10);
        java.lang.Object obj3 = typeBindings0.readResolve();
        boolean boolean5 = typeBindings0.hasUnbound("<>");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory6.constructType((java.lang.reflect.Type) simpleType7, typeBindings8);
        com.fasterxml.jackson.databind.JavaType javaType11 = typeBindings8.findBoundType("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = typeBindings8.withUnboundVariable("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings15 = typeBindings8.withUnboundVariable("<>");
        boolean boolean16 = typeBindings0.equals((java.lang.Object) "<>");
        boolean boolean17 = typeBindings0.isEmpty();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList18 = typeBindings0.getTypeParameters();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray19 = typeBindings0.typeParameterArray();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "<>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(typeBindings8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(typeBindings13);
        org.junit.Assert.assertNotNull(typeBindings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(javaTypeList18);
        org.junit.Assert.assertNotNull(javaTypeArray19);
        org.junit.Assert.assertArrayEquals(javaTypeArray19, new com.fasterxml.jackson.databind.JavaType[] {});
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory3._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory3.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader8 = typeFactory7._classLoader;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory7.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = typeFactory10._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory10.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory13._modifiers;
        typeFactory13.clearCache();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader17 = typeFactory16._classLoader;
        java.lang.ClassLoader classLoader18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory16.withClassLoader(classLoader18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory21.constructType((java.lang.reflect.Type) simpleType22, typeBindings23);
        com.fasterxml.jackson.databind.type.SimpleType simpleType25 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory20.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType22, (com.fasterxml.jackson.databind.JavaType) simpleType25);
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory16.constructType((java.lang.reflect.Type) simpleType25, (com.fasterxml.jackson.databind.JavaType) simpleType27);
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory13.constructType((java.lang.reflect.Type) simpleType25);
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory6.constructType((java.lang.reflect.Type) simpleType25);
        java.lang.ClassLoader classLoader33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass34 = typeFactory6.classForName("<Ljava/lang/Object;>", false, classLoader33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <Ljava/lang/Object;>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(typeModifierArray11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNull(classLoader17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertNotNull(typeBindings23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(simpleType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(javaType30);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory4.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory11.constructType((java.lang.reflect.Type) simpleType12, typeBindings13);
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory2.constructType((java.lang.reflect.Type) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap16 = typeFactory2._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory2.constructFromCanonical("<Ljava/lang/Object;>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '<Ljava/lang/Object;>' (remaining: 'Ljava/lang/Object;>'): Can not locate class '<', problem: <");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(typeBindings7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(typeBindings13);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap16);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj1 = null;
        boolean boolean2 = typeBindings0.equals(obj1);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList3 = typeBindings0.getTypeParameters();
        java.lang.String str4 = typeBindings0.toString();
        com.fasterxml.jackson.databind.JavaType javaType6 = typeBindings0.findBoundType("");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(javaTypeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<>" + "'", str4, "<>");
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.type.ClassStack classStack4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        java.lang.Class<?> wildcardClass9 = typeBindings7.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeBindings10.getBoundType((int) (byte) 10);
        java.lang.Object obj13 = typeBindings10.readResolve();
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory0._fromAny(classStack4, (java.lang.reflect.Type) wildcardClass9, typeBindings10);
        int int15 = typeBindings10.size();
        java.lang.Object obj16 = typeBindings10.readResolve();
        java.lang.String str17 = typeBindings10.toString();
        java.lang.String str19 = typeBindings10.getBoundName((int) (byte) 1);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList20 = typeBindings10.getTypeParameters();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList21 = typeBindings10.getTypeParameters();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(typeBindings7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "<>");
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "<>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<>" + "'", str17, "<>");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(javaTypeList20);
        org.junit.Assert.assertNotNull(javaTypeList21);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        com.fasterxml.jackson.databind.JavaType javaType21 = typeBindings16.findBoundType("<>");
        boolean boolean22 = typeBindings16.isEmpty();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeBindings16.findBoundType("hi!");
        java.lang.Object obj25 = typeBindings16.readResolve();
        int int26 = typeBindings16.size();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "<>");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        java.lang.Object obj1 = typeBindings0.readResolve();
        int int2 = typeBindings0.size();
        boolean boolean4 = typeBindings0.hasUnbound("hi!");
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList5 = typeBindings0.getTypeParameters();
        com.fasterxml.jackson.databind.JavaType javaType7 = typeBindings0.findBoundType("<>");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "<>");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(javaTypeList5);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        java.lang.ClassLoader classLoader5 = typeFactory4.getClassLoader();
        typeFactory4.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory10.withModifier(typeModifier11);
        java.lang.ClassLoader classLoader13 = typeFactory12.getClassLoader();
        typeFactory12.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory12._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader17 = typeFactory16._classLoader;
        java.lang.ClassLoader classLoader18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory16.withClassLoader(classLoader18);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withModifier(typeModifier20);
        com.fasterxml.jackson.databind.type.TypeParser typeParser22 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withClassLoader(classLoader24);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withModifier(typeModifier26);
        java.lang.ClassLoader classLoader28 = typeFactory27.getClassLoader();
        typeFactory27.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray31 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray31, classLoader32);
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser22, typeModifierArray31, classLoader34);
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray31, classLoader36);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray31);
        java.lang.Class<?> wildcardClass40 = typeFactory38._findPrimitive("<>");
        java.lang.ClassLoader classLoader41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = typeFactory38.withClassLoader(classLoader41);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap43 = typeFactory38._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray44 = typeFactory38._modifiers;
        java.lang.ClassLoader classLoader45 = typeFactory38.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNull(classLoader13);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNull(classLoader17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser22);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNull(classLoader28);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeModifierArray31);
        org.junit.Assert.assertArrayEquals(typeModifierArray31, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNull(wildcardClass40);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap43);
        org.junit.Assert.assertNotNull(typeModifierArray44);
        org.junit.Assert.assertArrayEquals(typeModifierArray44, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNull(classLoader45);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._unknownType();
        java.lang.Class<?> wildcardClass9 = typeFactory0._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory2.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withModifier(typeModifier7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory8.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(arrayType6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        boolean boolean2 = typeBindings0.hasUnbound("hi!");
        com.fasterxml.jackson.databind.JavaType javaType4 = typeBindings0.findBoundType("hi!");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = typeBindings0.withUnboundVariable("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = typeBindings6.withUnboundVariable("<>");
        java.lang.Object obj9 = typeBindings6.readResolve();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList10 = typeBindings6.getTypeParameters();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList11 = typeBindings6.getTypeParameters();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(typeBindings8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "<>");
        org.junit.Assert.assertNotNull(javaTypeList10);
        org.junit.Assert.assertNotNull(javaTypeList11);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        java.lang.ClassLoader classLoader20 = typeFactory2._classLoader;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = typeFactory2._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNull(classLoader20);
        org.junit.Assert.assertNull(typeModifierArray21);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) (byte) 10);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList3 = typeBindings0.getTypeParameters();
        com.fasterxml.jackson.databind.JavaType javaType5 = typeBindings0.getBoundType(0);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList6 = typeBindings0.getTypeParameters();
        java.lang.Class<?> wildcardClass7 = typeBindings0.getClass();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(javaTypeList3);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(javaTypeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean2 = typeBindings0.equals((java.lang.Object) simpleType1);
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray3 = typeBindings0.typeParameterArray();
        int int4 = typeBindings0.size();
        com.fasterxml.jackson.databind.JavaType javaType6 = typeBindings0.findBoundType("<Ljava/lang/Object;>");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(javaTypeArray3);
        org.junit.Assert.assertArrayEquals(javaTypeArray3, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory3._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory3.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader8 = typeFactory7._classLoader;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory7.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = typeFactory10._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory10.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory13._modifiers;
        typeFactory13.clearCache();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader17 = typeFactory16._classLoader;
        java.lang.ClassLoader classLoader18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory16.withClassLoader(classLoader18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory21.constructType((java.lang.reflect.Type) simpleType22, typeBindings23);
        com.fasterxml.jackson.databind.type.SimpleType simpleType25 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory20.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType22, (com.fasterxml.jackson.databind.JavaType) simpleType25);
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory16.constructType((java.lang.reflect.Type) simpleType25, (com.fasterxml.jackson.databind.JavaType) simpleType27);
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory13.constructType((java.lang.reflect.Type) simpleType25);
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory6.constructType((java.lang.reflect.Type) simpleType25);
        java.lang.ClassLoader classLoader31 = typeFactory6.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass33 = typeFactory6.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(typeModifierArray11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNull(classLoader17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertNotNull(typeBindings23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(simpleType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNull(classLoader31);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) (byte) 10);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList3 = typeBindings0.getTypeParameters();
        com.fasterxml.jackson.databind.JavaType javaType5 = typeBindings0.getBoundType(0);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList6 = typeBindings0.getTypeParameters();
        com.fasterxml.jackson.databind.JavaType javaType8 = typeBindings0.getBoundType((int) (byte) 0);
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(javaTypeList3);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(javaTypeList6);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        java.lang.Object obj20 = typeBindings16.readResolve();
        java.lang.String str21 = typeBindings16.toString();
        boolean boolean22 = typeBindings16.isEmpty();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeBindings16.getBoundType((int) (byte) 100);
        int int25 = typeBindings16.size();
        com.fasterxml.jackson.databind.JavaType javaType27 = typeBindings16.findBoundType("<>");
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList28 = typeBindings16.getTypeParameters();
        com.fasterxml.jackson.databind.JavaType javaType30 = typeBindings16.getBoundType((int) ' ');
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "<>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<>" + "'", str21, "<>");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(javaType27);
        org.junit.Assert.assertNotNull(javaTypeList28);
        org.junit.Assert.assertNull(javaType30);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory9.withModifier(typeModifier10);
        java.lang.ClassLoader classLoader12 = typeFactory11.getClassLoader();
        typeFactory11.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray15, classLoader16);
        java.lang.ClassLoader classLoader18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray15, classLoader18);
        java.lang.ClassLoader classLoader20 = typeFactory19._classLoader;
        java.lang.ClassLoader classLoader21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory19.withClassLoader(classLoader21);
        java.lang.ClassLoader classLoader23 = typeFactory19._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNull(classLoader12);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray15);
        org.junit.Assert.assertArrayEquals(typeModifierArray15, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNull(classLoader20);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNull(classLoader23);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = typeFactory0._unknownType();
        java.lang.Class<?> wildcardClass3 = typeFactory0._findPrimitive("");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(javaType1);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        int int18 = typeBindings14.size();
        boolean boolean19 = typeBindings14.isEmpty();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        java.lang.String str18 = typeBindings14.toString();
        boolean boolean20 = typeBindings14.hasUnbound("<>");
        boolean boolean22 = typeBindings14.hasUnbound("");
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList23 = typeBindings14.getTypeParameters();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray24 = typeBindings14.typeParameterArray();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<>" + "'", str18, "<>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(javaTypeList23);
        org.junit.Assert.assertNotNull(javaTypeArray24);
        org.junit.Assert.assertArrayEquals(javaTypeArray24, new com.fasterxml.jackson.databind.JavaType[] {});
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        boolean boolean18 = typeBindings14.isEmpty();
        java.lang.Object obj19 = typeBindings14.readResolve();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList20 = typeBindings14.getTypeParameters();
        java.lang.Object obj21 = typeBindings14.readResolve();
        com.fasterxml.jackson.databind.JavaType javaType23 = typeBindings14.findBoundType("");
        boolean boolean24 = typeBindings14.isEmpty();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "<>");
        org.junit.Assert.assertNotNull(javaTypeList20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "<>");
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        java.lang.String str20 = typeBindings16.toString();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray21 = typeBindings16.typeParameterArray();
        boolean boolean22 = typeBindings16.isEmpty();
        int int23 = typeBindings16.size();
        java.lang.String str25 = typeBindings16.getBoundName((int) (byte) 100);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<>" + "'", str20, "<>");
        org.junit.Assert.assertNotNull(javaTypeArray21);
        org.junit.Assert.assertArrayEquals(javaTypeArray21, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        java.lang.String str18 = typeBindings14.toString();
        boolean boolean20 = typeBindings14.hasUnbound("<>");
        boolean boolean22 = typeBindings14.hasUnbound("");
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList23 = typeBindings14.getTypeParameters();
        com.fasterxml.jackson.databind.JavaType javaType25 = typeBindings14.findBoundType("<>");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<>" + "'", str18, "<>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(javaTypeList23);
        org.junit.Assert.assertNull(javaType25);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        typeFactory0.clearCache();
        java.lang.ClassLoader classLoader19 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray20 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader21 = typeFactory0.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNull(classLoader19);
        org.junit.Assert.assertNull(typeModifierArray20);
        org.junit.Assert.assertNull(classLoader21);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap3 = typeFactory2._typeCache;
        java.lang.Class<?> wildcardClass5 = typeFactory2._findPrimitive("");
        java.lang.ClassLoader classLoader6 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withModifier(typeModifier7);
        java.lang.Class<?> wildcardClass10 = typeFactory2._findPrimitive("<>");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNull(wildcardClass10);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj1 = null;
        boolean boolean2 = typeBindings0.equals(obj1);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList3 = typeBindings0.getTypeParameters();
        java.lang.String str4 = typeBindings0.toString();
        int int5 = typeBindings0.size();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray6 = typeBindings0.typeParameterArray();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory7.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType9, (com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15.constructType((java.lang.reflect.Type) simpleType16, typeBindings17);
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType20 = typeFactory15.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType19);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings21 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj22 = null;
        boolean boolean23 = typeBindings21.equals(obj22);
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory7._fromAny(classStack14, (java.lang.reflect.Type) arrayType20, typeBindings21);
        boolean boolean25 = typeBindings21.isEmpty();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = typeBindings21.withUnboundVariable("");
        boolean boolean29 = typeBindings27.hasUnbound("<>");
        boolean boolean30 = typeBindings0.equals((java.lang.Object) "<>");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(javaTypeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<>" + "'", str4, "<>");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeArray6);
        org.junit.Assert.assertArrayEquals(javaTypeArray6, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(typeBindings17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertNotNull(arrayType20);
        org.junit.Assert.assertNotNull(typeBindings21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(typeBindings27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2._unknownType();
        java.lang.ClassLoader classLoader6 = typeFactory2.getClassLoader();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory2.withModifier(typeModifier9);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory3._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory3.withClassLoader(classLoader5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withClassLoader(classLoader7);
        java.lang.ClassLoader classLoader9 = typeFactory8._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNull(classLoader9);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        com.fasterxml.jackson.databind.JavaType javaType21 = typeBindings16.findBoundType("<>");
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean23 = typeBindings16.equals((java.lang.Object) simpleType22);
        com.fasterxml.jackson.databind.JavaType javaType25 = typeBindings16.findBoundType("<>");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(javaType25);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory0._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeParser8);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        java.lang.Object obj20 = typeBindings16.readResolve();
        java.lang.String str21 = typeBindings16.toString();
        boolean boolean22 = typeBindings16.isEmpty();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeBindings16.getBoundType((int) (byte) 100);
        java.lang.String str26 = typeBindings16.getBoundName((int) (byte) 0);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "<>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<>" + "'", str21, "<>");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap3 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory2.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withClassLoader(classLoader7);
        java.lang.Class<?> wildcardClass10 = typeFactory8._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory11.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType12, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15.constructType((java.lang.reflect.Type) simpleType16, typeBindings17);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory8.constructType((java.lang.reflect.Type) javaType14, (com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeBindings22.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType25 = typeFactory8._fromAny(classStack20, (java.lang.reflect.Type) simpleType21, typeBindings22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        boolean boolean28 = typeBindings26.hasUnbound("hi!");
        boolean boolean29 = typeBindings26.isEmpty();
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory5.constructType((java.lang.reflect.Type) javaType25, typeBindings26);
        java.lang.Class<?> wildcardClass32 = typeFactory5._findPrimitive("hi!");
        java.lang.ClassLoader classLoader35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass36 = typeFactory5.classForName("<>", true, classLoader35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(typeBindings17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(typeBindings22);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(typeBindings26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNull(wildcardClass32);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        boolean boolean18 = typeBindings14.isEmpty();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList19 = typeBindings14.getTypeParameters();
        int int20 = typeBindings14.size();
        int int21 = typeBindings14.size();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(javaTypeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        java.lang.ClassLoader classLoader5 = typeFactory4.getClassLoader();
        typeFactory4.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory10.withModifier(typeModifier11);
        java.lang.ClassLoader classLoader13 = typeFactory12.getClassLoader();
        typeFactory12.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory12._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader17 = typeFactory16._classLoader;
        java.lang.ClassLoader classLoader18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory16.withClassLoader(classLoader18);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withModifier(typeModifier20);
        com.fasterxml.jackson.databind.type.TypeParser typeParser22 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withClassLoader(classLoader24);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withModifier(typeModifier26);
        java.lang.ClassLoader classLoader28 = typeFactory27.getClassLoader();
        typeFactory27.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray31 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray31, classLoader32);
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser22, typeModifierArray31, classLoader34);
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray31, classLoader36);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray31);
        java.lang.Class<?> wildcardClass40 = typeFactory38._findPrimitive("<>");
        java.lang.ClassLoader classLoader41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = typeFactory38.withClassLoader(classLoader41);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap43 = typeFactory38._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray44 = typeFactory38._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType46 = typeFactory38.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNull(classLoader13);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNull(classLoader17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser22);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNull(classLoader28);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeModifierArray31);
        org.junit.Assert.assertArrayEquals(typeModifierArray31, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNull(wildcardClass40);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap43);
        org.junit.Assert.assertNotNull(typeModifierArray44);
        org.junit.Assert.assertArrayEquals(typeModifierArray44, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        java.lang.String str20 = typeBindings16.toString();
        boolean boolean21 = typeBindings16.isEmpty();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings23 = typeBindings16.withUnboundVariable("hi!");
        boolean boolean24 = typeBindings16.isEmpty();
        int int25 = typeBindings16.size();
        boolean boolean27 = typeBindings16.hasUnbound("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<>" + "'", str20, "<>");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(typeBindings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap3 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader4 = typeFactory2.getClassLoader();
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory2.classForName("<>", false, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap3);
        org.junit.Assert.assertNull(classLoader4);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap6 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass12 = typeFactory10._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass14 = typeFactory10._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withClassLoader(classLoader17);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        java.lang.ClassLoader classLoader21 = typeFactory20.getClassLoader();
        typeFactory20.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser23 = typeFactory20._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray24 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader25 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser23, typeModifierArray24, classLoader25);
        java.lang.ClassLoader classLoader27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray24, classLoader27);
        java.lang.ClassLoader classLoader29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray24, classLoader29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = typeFactory31.withClassLoader(classLoader32);
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory31.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory35._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeFactory37.withClassLoader(classLoader38);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = typeFactory39.withModifier(typeModifier40);
        java.lang.ClassLoader classLoader42 = typeFactory41.getClassLoader();
        typeFactory41.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser44 = typeFactory41._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray45 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader46 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser44, typeModifierArray45, classLoader46);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier51 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = typeFactory50.withModifier(typeModifier51);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType55 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings56 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType57 = typeFactory54.constructType((java.lang.reflect.Type) simpleType55, typeBindings56);
        com.fasterxml.jackson.databind.type.SimpleType simpleType58 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType59 = typeFactory53.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType55, (com.fasterxml.jackson.databind.JavaType) simpleType58);
        com.fasterxml.jackson.databind.type.ArrayType arrayType60 = typeFactory52.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType55);
        com.fasterxml.jackson.databind.type.TypeParser typeParser61 = typeFactory52._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray62 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader63 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser61, typeModifierArray62, classLoader63);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray62);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNull(classLoader21);
        org.junit.Assert.assertNotNull(typeParser23);
        org.junit.Assert.assertNotNull(typeModifierArray24);
        org.junit.Assert.assertArrayEquals(typeModifierArray24, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory31);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(typeFactory41);
        org.junit.Assert.assertNull(classLoader42);
        org.junit.Assert.assertNotNull(typeParser44);
        org.junit.Assert.assertNotNull(typeModifierArray45);
        org.junit.Assert.assertArrayEquals(typeModifierArray45, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory50);
        org.junit.Assert.assertNotNull(typeFactory52);
        org.junit.Assert.assertNotNull(typeFactory53);
        org.junit.Assert.assertNotNull(typeFactory54);
        org.junit.Assert.assertNotNull(simpleType55);
        org.junit.Assert.assertNotNull(typeBindings56);
        org.junit.Assert.assertNotNull(javaType57);
        org.junit.Assert.assertNotNull(simpleType58);
        org.junit.Assert.assertNotNull(javaType59);
        org.junit.Assert.assertNotNull(arrayType60);
        org.junit.Assert.assertNotNull(typeParser61);
        org.junit.Assert.assertNotNull(typeModifierArray62);
        org.junit.Assert.assertArrayEquals(typeModifierArray62, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory4.constructType((java.lang.reflect.Type) simpleType5, typeBindings6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType5, (com.fasterxml.jackson.databind.JavaType) simpleType8);
        com.fasterxml.jackson.databind.type.ArrayType arrayType10 = typeFactory2.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader12 = typeFactory11._classLoader;
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory11.withClassLoader(classLoader13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = typeFactory14._modifiers;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory14.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader19 = typeFactory18._classLoader;
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory18.withClassLoader(classLoader20);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray22 = typeFactory21._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier23 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = typeFactory21.withModifier(typeModifier23);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = typeFactory24._modifiers;
        typeFactory24.clearCache();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader28 = typeFactory27._classLoader;
        java.lang.ClassLoader classLoader29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = typeFactory27.withClassLoader(classLoader29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType33 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings34 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType35 = typeFactory32.constructType((java.lang.reflect.Type) simpleType33, typeBindings34);
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType37 = typeFactory31.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType33, (com.fasterxml.jackson.databind.JavaType) simpleType36);
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        com.fasterxml.jackson.databind.JavaType javaType39 = typeFactory27.constructType((java.lang.reflect.Type) simpleType36, (com.fasterxml.jackson.databind.JavaType) simpleType38);
        com.fasterxml.jackson.databind.JavaType javaType40 = typeFactory24.constructType((java.lang.reflect.Type) simpleType36);
        com.fasterxml.jackson.databind.JavaType javaType41 = typeFactory17.constructType((java.lang.reflect.Type) simpleType36);
        com.fasterxml.jackson.databind.type.ArrayType arrayType42 = typeFactory2.constructArrayType(javaType41);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(arrayType10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNull(classLoader12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNull(typeModifierArray15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNull(classLoader19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNull(typeModifierArray22);
        org.junit.Assert.assertNotNull(typeFactory24);
        org.junit.Assert.assertNull(typeModifierArray25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNull(classLoader28);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeFactory31);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(simpleType33);
        org.junit.Assert.assertNotNull(typeBindings34);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertNotNull(simpleType36);
        org.junit.Assert.assertNotNull(javaType37);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertNotNull(javaType39);
        org.junit.Assert.assertNotNull(javaType40);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(arrayType42);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        java.lang.String str20 = typeBindings16.toString();
        boolean boolean21 = typeBindings16.isEmpty();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings23 = typeBindings16.withUnboundVariable("hi!");
        boolean boolean24 = typeBindings16.isEmpty();
        int int25 = typeBindings16.size();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = typeBindings16.withUnboundVariable("<>");
        com.fasterxml.jackson.databind.JavaType javaType29 = typeBindings27.getBoundType((int) (short) 10);
        com.fasterxml.jackson.databind.JavaType javaType31 = typeBindings27.findBoundType("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<>" + "'", str20, "<>");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(typeBindings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(typeBindings27);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertNull(javaType31);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap1 = typeFactory0._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructFromCanonical("<Ljava/lang/Object;>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '<Ljava/lang/Object;>' (remaining: 'Ljava/lang/Object;>'): Can not locate class '<', problem: <");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap1);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap6 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory0.withModifier(typeModifier9);
        java.lang.ClassLoader classLoader11 = typeFactory0._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(classLoader11);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory2._unknownType();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withClassLoader(classLoader5);
        java.lang.ClassLoader classLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory2.classForName("<Ljava/lang/Object;>", false, classLoader9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <Ljava/lang/Object;>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        com.fasterxml.jackson.databind.JavaType javaType21 = typeBindings16.findBoundType("<>");
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean23 = typeBindings16.equals((java.lang.Object) simpleType22);
        java.lang.Class<?> wildcardClass24 = simpleType22.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory7.withClassLoader(classLoader10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory13.withModifier(typeModifier14);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory17.constructType((java.lang.reflect.Type) simpleType18, typeBindings19);
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory16.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType18, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory15.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType18);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = null;
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray25, classLoader26);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = typeFactory28.withClassLoader(classLoader29);
        java.lang.Class<?> wildcardClass32 = typeFactory30._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass34 = typeFactory30._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser35 = typeFactory30._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader37 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = typeFactory36.withClassLoader(classLoader37);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = typeFactory38.withModifier(typeModifier39);
        java.lang.ClassLoader classLoader41 = typeFactory40.getClassLoader();
        typeFactory40.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser43 = typeFactory40._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray44 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser43, typeModifierArray44, classLoader45);
        java.lang.ClassLoader classLoader47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser35, typeModifierArray44, classLoader47);
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray44, classLoader49);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = typeFactory51.withClassLoader(classLoader52);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier54 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = typeFactory53.withModifier(typeModifier54);
        java.lang.ClassLoader classLoader56 = typeFactory55.getClassLoader();
        typeFactory55.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser58 = typeFactory55._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory59 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader60 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory61 = typeFactory59.withClassLoader(classLoader60);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier62 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory63 = typeFactory61.withModifier(typeModifier62);
        java.lang.ClassLoader classLoader64 = typeFactory63.getClassLoader();
        typeFactory63.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser66 = typeFactory63._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader68 = typeFactory67._classLoader;
        java.lang.ClassLoader classLoader69 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory70 = typeFactory67.withClassLoader(classLoader69);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier71 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory72 = typeFactory70.withModifier(typeModifier71);
        com.fasterxml.jackson.databind.type.TypeParser typeParser73 = typeFactory72._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory74 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader75 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory76 = typeFactory74.withClassLoader(classLoader75);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier77 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory78 = typeFactory76.withModifier(typeModifier77);
        java.lang.ClassLoader classLoader79 = typeFactory78.getClassLoader();
        typeFactory78.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser81 = typeFactory78._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray82 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader83 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory84 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser81, typeModifierArray82, classLoader83);
        java.lang.ClassLoader classLoader85 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory86 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser73, typeModifierArray82, classLoader85);
        java.lang.ClassLoader classLoader87 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory88 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser66, typeModifierArray82, classLoader87);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory89 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser58, typeModifierArray82);
        java.lang.ClassLoader classLoader90 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory91 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray82, classLoader90);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory92 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray82);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory93 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray82);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser12);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertNotNull(typeParser35);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeFactory38);
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNull(classLoader41);
        org.junit.Assert.assertNotNull(typeParser43);
        org.junit.Assert.assertNotNull(typeModifierArray44);
        org.junit.Assert.assertArrayEquals(typeModifierArray44, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory51);
        org.junit.Assert.assertNotNull(typeFactory53);
        org.junit.Assert.assertNotNull(typeFactory55);
        org.junit.Assert.assertNull(classLoader56);
        org.junit.Assert.assertNotNull(typeParser58);
        org.junit.Assert.assertNotNull(typeFactory59);
        org.junit.Assert.assertNotNull(typeFactory61);
        org.junit.Assert.assertNotNull(typeFactory63);
        org.junit.Assert.assertNull(classLoader64);
        org.junit.Assert.assertNotNull(typeParser66);
        org.junit.Assert.assertNotNull(typeFactory67);
        org.junit.Assert.assertNull(classLoader68);
        org.junit.Assert.assertNotNull(typeFactory70);
        org.junit.Assert.assertNotNull(typeFactory72);
        org.junit.Assert.assertNotNull(typeParser73);
        org.junit.Assert.assertNotNull(typeFactory74);
        org.junit.Assert.assertNotNull(typeFactory76);
        org.junit.Assert.assertNotNull(typeFactory78);
        org.junit.Assert.assertNull(classLoader79);
        org.junit.Assert.assertNotNull(typeParser81);
        org.junit.Assert.assertNotNull(typeModifierArray82);
        org.junit.Assert.assertArrayEquals(typeModifierArray82, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        java.lang.ClassLoader classLoader5 = typeFactory4.getClassLoader();
        typeFactory4.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory10.withModifier(typeModifier11);
        java.lang.ClassLoader classLoader13 = typeFactory12.getClassLoader();
        typeFactory12.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory12._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader17 = typeFactory16._classLoader;
        java.lang.ClassLoader classLoader18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory16.withClassLoader(classLoader18);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withModifier(typeModifier20);
        com.fasterxml.jackson.databind.type.TypeParser typeParser22 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withClassLoader(classLoader24);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withModifier(typeModifier26);
        java.lang.ClassLoader classLoader28 = typeFactory27.getClassLoader();
        typeFactory27.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray31 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray31, classLoader32);
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser22, typeModifierArray31, classLoader34);
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray31, classLoader36);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass40 = typeFactory38.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNull(classLoader13);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNull(classLoader17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser22);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNull(classLoader28);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeModifierArray31);
        org.junit.Assert.assertArrayEquals(typeModifierArray31, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap6 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass12 = typeFactory10._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass14 = typeFactory10._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withClassLoader(classLoader17);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        java.lang.ClassLoader classLoader21 = typeFactory20.getClassLoader();
        typeFactory20.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser23 = typeFactory20._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray24 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader25 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser23, typeModifierArray24, classLoader25);
        java.lang.ClassLoader classLoader27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray24, classLoader27);
        java.lang.ClassLoader classLoader29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray24, classLoader29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = typeFactory31.withClassLoader(classLoader32);
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory31.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory35._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeFactory37.withClassLoader(classLoader38);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = typeFactory39.withModifier(typeModifier40);
        java.lang.ClassLoader classLoader42 = typeFactory41.getClassLoader();
        typeFactory41.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser44 = typeFactory41._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray45 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader46 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser44, typeModifierArray45, classLoader46);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier50 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = typeFactory49.withModifier(typeModifier50);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNull(classLoader21);
        org.junit.Assert.assertNotNull(typeParser23);
        org.junit.Assert.assertNotNull(typeModifierArray24);
        org.junit.Assert.assertArrayEquals(typeModifierArray24, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory31);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(typeFactory41);
        org.junit.Assert.assertNull(classLoader42);
        org.junit.Assert.assertNotNull(typeParser44);
        org.junit.Assert.assertNotNull(typeModifierArray45);
        org.junit.Assert.assertArrayEquals(typeModifierArray45, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory51);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) (byte) 10);
        boolean boolean3 = typeBindings0.isEmpty();
        java.lang.String str4 = typeBindings0.toString();
        java.lang.Object obj5 = typeBindings0.readResolve();
        boolean boolean7 = typeBindings0.hasUnbound("hi!");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<>" + "'", str4, "<>");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "<>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory4._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4._unknownType();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory4._parser;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory4._unknownType();
        java.lang.ClassLoader classLoader11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory4.withClassLoader(classLoader11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withModifier(typeModifier13);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory3._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(javaType4);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        java.lang.Object obj20 = typeBindings16.readResolve();
        java.lang.String str22 = typeBindings16.getBoundName((int) (byte) 100);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList23 = typeBindings16.getTypeParameters();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList24 = typeBindings16.getTypeParameters();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "<>");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(javaTypeList23);
        org.junit.Assert.assertNotNull(javaTypeList24);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap6 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory0._parser;
        java.lang.ClassLoader classLoader9 = typeFactory0._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNull(classLoader9);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory4.constructType((java.lang.reflect.Type) simpleType5, typeBindings6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType5, (com.fasterxml.jackson.databind.JavaType) simpleType8);
        com.fasterxml.jackson.databind.type.ArrayType arrayType10 = typeFactory2.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withClassLoader(classLoader13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = typeFactory14._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory14._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap17 = typeFactory14._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory19.constructType((java.lang.reflect.Type) simpleType20, typeBindings21);
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType24 = typeFactory19.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType23);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap25 = typeFactory19._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = typeFactory19._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader28 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory27.withClassLoader(classLoader28);
        java.lang.Class<?> wildcardClass31 = typeFactory29._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass33 = typeFactory29._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser34 = typeFactory29._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = typeFactory35.withClassLoader(classLoader36);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeFactory37.withModifier(typeModifier38);
        java.lang.ClassLoader classLoader40 = typeFactory39.getClassLoader();
        typeFactory39.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser42 = typeFactory39._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray43 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader44 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser42, typeModifierArray43, classLoader44);
        java.lang.ClassLoader classLoader46 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser34, typeModifierArray43, classLoader46);
        java.lang.ClassLoader classLoader48 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray43, classLoader48);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray43);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = typeFactory51.withClassLoader(classLoader52);
        java.lang.ClassLoader classLoader54 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = typeFactory51.withClassLoader(classLoader54);
        com.fasterxml.jackson.databind.type.TypeParser typeParser56 = typeFactory55._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader58 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory59 = typeFactory57.withClassLoader(classLoader58);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier60 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory61 = typeFactory59.withModifier(typeModifier60);
        java.lang.ClassLoader classLoader62 = typeFactory61.getClassLoader();
        typeFactory61.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser64 = typeFactory61._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray65 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader66 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser64, typeModifierArray65, classLoader66);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory68 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser56, typeModifierArray65);
        java.lang.ClassLoader classLoader69 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory70 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray65, classLoader69);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory71 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray65);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(arrayType10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNull(typeModifierArray15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(typeBindings21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertNotNull(arrayType24);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap25);
        org.junit.Assert.assertNotNull(typeParser26);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNotNull(typeParser34);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNull(classLoader40);
        org.junit.Assert.assertNotNull(typeParser42);
        org.junit.Assert.assertNotNull(typeModifierArray43);
        org.junit.Assert.assertArrayEquals(typeModifierArray43, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory51);
        org.junit.Assert.assertNotNull(typeFactory53);
        org.junit.Assert.assertNotNull(typeFactory55);
        org.junit.Assert.assertNotNull(typeParser56);
        org.junit.Assert.assertNotNull(typeFactory57);
        org.junit.Assert.assertNotNull(typeFactory59);
        org.junit.Assert.assertNotNull(typeFactory61);
        org.junit.Assert.assertNull(classLoader62);
        org.junit.Assert.assertNotNull(typeParser64);
        org.junit.Assert.assertNotNull(typeModifierArray65);
        org.junit.Assert.assertArrayEquals(typeModifierArray65, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        java.lang.String str20 = typeBindings16.toString();
        boolean boolean21 = typeBindings16.isEmpty();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings23 = typeBindings16.withUnboundVariable("hi!");
        boolean boolean24 = typeBindings16.isEmpty();
        java.lang.String str26 = typeBindings16.getBoundName((int) (short) 10);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<>" + "'", str20, "<>");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(typeBindings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap6 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass12 = typeFactory10._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass14 = typeFactory10._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withClassLoader(classLoader17);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        java.lang.ClassLoader classLoader21 = typeFactory20.getClassLoader();
        typeFactory20.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser23 = typeFactory20._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray24 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader25 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser23, typeModifierArray24, classLoader25);
        java.lang.ClassLoader classLoader27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray24, classLoader27);
        java.lang.ClassLoader classLoader29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray24, classLoader29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = typeFactory31.withClassLoader(classLoader32);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withModifier(typeModifier34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory35._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings39 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType40 = typeFactory37.constructType((java.lang.reflect.Type) simpleType38, typeBindings39);
        com.fasterxml.jackson.databind.type.SimpleType simpleType41 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType42 = typeFactory37.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType41);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap43 = typeFactory37._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser44 = typeFactory37._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader46 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = typeFactory45.withClassLoader(classLoader46);
        java.lang.Class<?> wildcardClass49 = typeFactory47._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass51 = typeFactory47._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser52 = typeFactory47._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader54 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = typeFactory53.withClassLoader(classLoader54);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier56 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = typeFactory55.withModifier(typeModifier56);
        java.lang.ClassLoader classLoader58 = typeFactory57.getClassLoader();
        typeFactory57.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser60 = typeFactory57._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray61 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader62 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory63 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser60, typeModifierArray61, classLoader62);
        java.lang.ClassLoader classLoader64 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser52, typeModifierArray61, classLoader64);
        java.lang.ClassLoader classLoader66 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser44, typeModifierArray61, classLoader66);
        java.lang.ClassLoader classLoader68 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory69 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray61, classLoader68);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory70 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray61);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNull(classLoader21);
        org.junit.Assert.assertNotNull(typeParser23);
        org.junit.Assert.assertNotNull(typeModifierArray24);
        org.junit.Assert.assertArrayEquals(typeModifierArray24, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory31);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertNotNull(typeBindings39);
        org.junit.Assert.assertNotNull(javaType40);
        org.junit.Assert.assertNotNull(simpleType41);
        org.junit.Assert.assertNotNull(arrayType42);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap43);
        org.junit.Assert.assertNotNull(typeParser44);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(typeFactory47);
        org.junit.Assert.assertNull(wildcardClass49);
        org.junit.Assert.assertNull(wildcardClass51);
        org.junit.Assert.assertNotNull(typeParser52);
        org.junit.Assert.assertNotNull(typeFactory53);
        org.junit.Assert.assertNotNull(typeFactory55);
        org.junit.Assert.assertNotNull(typeFactory57);
        org.junit.Assert.assertNull(classLoader58);
        org.junit.Assert.assertNotNull(typeParser60);
        org.junit.Assert.assertNotNull(typeModifierArray61);
        org.junit.Assert.assertArrayEquals(typeModifierArray61, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        java.lang.Class<?> wildcardClass7 = typeFactory0._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray8 = typeFactory0._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory0.findClass("<Ljava/lang/Object;>");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <Ljava/lang/Object;>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(typeModifierArray8);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean2 = typeBindings0.equals((java.lang.Object) simpleType1);
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray3 = typeBindings0.typeParameterArray();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray4 = typeBindings0.typeParameterArray();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = typeBindings0.withUnboundVariable("hi!");
        boolean boolean7 = typeBindings0.isEmpty();
        boolean boolean9 = typeBindings0.hasUnbound("");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(javaTypeArray3);
        org.junit.Assert.assertArrayEquals(javaTypeArray3, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNotNull(javaTypeArray4);
        org.junit.Assert.assertArrayEquals(javaTypeArray4, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        com.fasterxml.jackson.databind.JavaType javaType21 = typeBindings16.findBoundType("<>");
        boolean boolean22 = typeBindings16.isEmpty();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList23 = typeBindings16.getTypeParameters();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(javaTypeList23);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap6 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass12 = typeFactory10._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass14 = typeFactory10._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withClassLoader(classLoader17);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        java.lang.ClassLoader classLoader21 = typeFactory20.getClassLoader();
        typeFactory20.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser23 = typeFactory20._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray24 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader25 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser23, typeModifierArray24, classLoader25);
        java.lang.ClassLoader classLoader27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray24, classLoader27);
        java.lang.ClassLoader classLoader29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray24, classLoader29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType32 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings33 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory31.constructType((java.lang.reflect.Type) simpleType32, typeBindings33);
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType36 = typeFactory31.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType35);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap37 = typeFactory31._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser38 = typeFactory31._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = typeFactory39.withClassLoader(classLoader40);
        java.lang.Class<?> wildcardClass43 = typeFactory41._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass45 = typeFactory41._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser46 = typeFactory41._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader48 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = typeFactory47.withClassLoader(classLoader48);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier50 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = typeFactory49.withModifier(typeModifier50);
        java.lang.ClassLoader classLoader52 = typeFactory51.getClassLoader();
        typeFactory51.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser54 = typeFactory51._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray55 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader56 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser54, typeModifierArray55, classLoader56);
        java.lang.ClassLoader classLoader58 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory59 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser46, typeModifierArray55, classLoader58);
        java.lang.ClassLoader classLoader60 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory61 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser38, typeModifierArray55, classLoader60);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader63 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = typeFactory62.withClassLoader(classLoader63);
        java.lang.ClassLoader classLoader65 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory66 = typeFactory62.withClassLoader(classLoader65);
        com.fasterxml.jackson.databind.type.TypeParser typeParser67 = typeFactory66._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory68 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader69 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory70 = typeFactory68.withClassLoader(classLoader69);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier71 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory72 = typeFactory70.withModifier(typeModifier71);
        java.lang.ClassLoader classLoader73 = typeFactory72.getClassLoader();
        typeFactory72.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser75 = typeFactory72._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray76 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader77 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory78 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser75, typeModifierArray76, classLoader77);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory79 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser67, typeModifierArray76);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory80 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser38, typeModifierArray76);
        java.lang.ClassLoader classLoader81 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory82 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray76, classLoader81);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNull(classLoader21);
        org.junit.Assert.assertNotNull(typeParser23);
        org.junit.Assert.assertNotNull(typeModifierArray24);
        org.junit.Assert.assertArrayEquals(typeModifierArray24, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory31);
        org.junit.Assert.assertNotNull(simpleType32);
        org.junit.Assert.assertNotNull(typeBindings33);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertNotNull(arrayType36);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap37);
        org.junit.Assert.assertNotNull(typeParser38);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(typeFactory41);
        org.junit.Assert.assertNull(wildcardClass43);
        org.junit.Assert.assertNull(wildcardClass45);
        org.junit.Assert.assertNotNull(typeParser46);
        org.junit.Assert.assertNotNull(typeFactory47);
        org.junit.Assert.assertNotNull(typeFactory49);
        org.junit.Assert.assertNotNull(typeFactory51);
        org.junit.Assert.assertNull(classLoader52);
        org.junit.Assert.assertNotNull(typeParser54);
        org.junit.Assert.assertNotNull(typeModifierArray55);
        org.junit.Assert.assertArrayEquals(typeModifierArray55, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory62);
        org.junit.Assert.assertNotNull(typeFactory64);
        org.junit.Assert.assertNotNull(typeFactory66);
        org.junit.Assert.assertNotNull(typeParser67);
        org.junit.Assert.assertNotNull(typeFactory68);
        org.junit.Assert.assertNotNull(typeFactory70);
        org.junit.Assert.assertNotNull(typeFactory72);
        org.junit.Assert.assertNull(classLoader73);
        org.junit.Assert.assertNotNull(typeParser75);
        org.junit.Assert.assertNotNull(typeModifierArray76);
        org.junit.Assert.assertArrayEquals(typeModifierArray76, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory18.constructType((java.lang.reflect.Type) simpleType19, typeBindings20);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList22 = typeBindings20.getTypeParameters();
        boolean boolean23 = typeBindings14.equals((java.lang.Object) typeBindings20);
        java.lang.Object obj24 = typeBindings20.readResolve();
        com.fasterxml.jackson.databind.JavaType javaType26 = typeBindings20.findBoundType("<>");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertNotNull(typeBindings20);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaTypeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "<>");
        org.junit.Assert.assertNull(javaType26);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass6 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray8 = null;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray8, classLoader9);
        java.lang.ClassLoader classLoader11 = typeFactory10.getClassLoader();
        java.lang.ClassLoader classLoader12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory10.withClassLoader(classLoader12);
        java.lang.Class<?> wildcardClass15 = typeFactory13._findPrimitive("<>");
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.ClassStack classStack17 = null;
        java.lang.reflect.GenericArrayType genericArrayType18 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        boolean boolean21 = typeBindings19.hasUnbound("hi!");
        com.fasterxml.jackson.databind.JavaType javaType23 = typeBindings19.findBoundType("hi!");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = typeBindings19.withUnboundVariable("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory13._fromArrayType(classStack17, genericArrayType18, typeBindings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNull(classLoader11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNotNull(typeBindings25);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        java.lang.ClassLoader classLoader5 = typeFactory4.getClassLoader();
        typeFactory4.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory10.withModifier(typeModifier11);
        java.lang.ClassLoader classLoader13 = typeFactory12.getClassLoader();
        typeFactory12.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory12._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader17 = typeFactory16._classLoader;
        java.lang.ClassLoader classLoader18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory16.withClassLoader(classLoader18);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withModifier(typeModifier20);
        com.fasterxml.jackson.databind.type.TypeParser typeParser22 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withClassLoader(classLoader24);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withModifier(typeModifier26);
        java.lang.ClassLoader classLoader28 = typeFactory27.getClassLoader();
        typeFactory27.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray31 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray31, classLoader32);
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser22, typeModifierArray31, classLoader34);
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray31, classLoader36);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray31);
        com.fasterxml.jackson.databind.JavaType javaType39 = typeFactory38._unknownType();
        java.lang.ClassLoader classLoader40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = typeFactory38.withClassLoader(classLoader40);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNull(classLoader13);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNull(classLoader17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser22);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNull(classLoader28);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeModifierArray31);
        org.junit.Assert.assertArrayEquals(typeModifierArray31, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(javaType39);
        org.junit.Assert.assertNotNull(typeFactory41);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        java.lang.ClassLoader classLoader5 = typeFactory4.getClassLoader();
        typeFactory4.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory10.withModifier(typeModifier11);
        java.lang.ClassLoader classLoader13 = typeFactory12.getClassLoader();
        typeFactory12.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory12._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader17 = typeFactory16._classLoader;
        java.lang.ClassLoader classLoader18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory16.withClassLoader(classLoader18);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withModifier(typeModifier20);
        com.fasterxml.jackson.databind.type.TypeParser typeParser22 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withClassLoader(classLoader24);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withModifier(typeModifier26);
        java.lang.ClassLoader classLoader28 = typeFactory27.getClassLoader();
        typeFactory27.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray31 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray31, classLoader32);
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser22, typeModifierArray31, classLoader34);
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray31, classLoader36);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray31);
        java.lang.Class<?> wildcardClass40 = typeFactory38._findPrimitive("<>");
        java.lang.ClassLoader classLoader41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = typeFactory38.withClassLoader(classLoader41);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap43 = typeFactory38._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray44 = typeFactory38._modifiers;
        java.lang.ClassLoader classLoader47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass48 = typeFactory38.classForName("", true, classLoader47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNull(classLoader13);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNull(classLoader17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser22);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNull(classLoader28);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeModifierArray31);
        org.junit.Assert.assertArrayEquals(typeModifierArray31, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNull(wildcardClass40);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap43);
        org.junit.Assert.assertNotNull(typeModifierArray44);
        org.junit.Assert.assertArrayEquals(typeModifierArray44, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory3._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory3.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory6._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap8 = typeFactory6._typeCache;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory6.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = typeFactory6._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withClassLoader(classLoader13);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withModifier(typeModifier15);
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.type.ArrayType arrayType18 = typeFactory14.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType17);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray20 = typeBindings19.typeParameterArray();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList21 = typeBindings19.getTypeParameters();
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory6.constructType((java.lang.reflect.Type) simpleType17, typeBindings19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser23 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader25 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = typeFactory24.withClassLoader(classLoader25);
        java.lang.ClassLoader classLoader27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeFactory24.withClassLoader(classLoader27);
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = typeFactory28._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withClassLoader(classLoader31);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withModifier(typeModifier33);
        java.lang.ClassLoader classLoader35 = typeFactory34.getClassLoader();
        typeFactory34.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser37 = typeFactory34._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray38 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser37, typeModifierArray38, classLoader39);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray38);
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser23, typeModifierArray38, classLoader42);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(typeModifierArray11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertNotNull(arrayType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertNotNull(javaTypeArray20);
        org.junit.Assert.assertArrayEquals(javaTypeArray20, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNotNull(javaTypeList21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(typeParser23);
        org.junit.Assert.assertNotNull(typeFactory24);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeParser29);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNull(classLoader35);
        org.junit.Assert.assertNotNull(typeParser37);
        org.junit.Assert.assertNotNull(typeModifierArray38);
        org.junit.Assert.assertArrayEquals(typeModifierArray38, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) (byte) 10);
        java.lang.Object obj3 = typeBindings0.readResolve();
        boolean boolean5 = typeBindings0.hasUnbound("<>");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory6.constructType((java.lang.reflect.Type) simpleType7, typeBindings8);
        com.fasterxml.jackson.databind.JavaType javaType11 = typeBindings8.findBoundType("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = typeBindings8.withUnboundVariable("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings15 = typeBindings8.withUnboundVariable("<>");
        boolean boolean16 = typeBindings0.equals((java.lang.Object) "<>");
        boolean boolean17 = typeBindings0.isEmpty();
        java.lang.Object obj18 = typeBindings0.readResolve();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "<>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(typeBindings8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(typeBindings13);
        org.junit.Assert.assertNotNull(typeBindings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "<>");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType4 = typeBindings0.getBoundType((int) (short) -1);
        java.lang.String str6 = typeBindings0.getBoundName((int) (short) -1);
        java.lang.String str8 = typeBindings0.getBoundName(10);
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray2 = typeFactory0._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNull(typeModifierArray2);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj1 = null;
        boolean boolean2 = typeBindings0.equals(obj1);
        boolean boolean3 = typeBindings0.isEmpty();
        com.fasterxml.jackson.databind.JavaType javaType5 = typeBindings0.getBoundType((int) (short) 0);
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        java.lang.ClassLoader classLoader4 = typeFactory3._classLoader;
        typeFactory3.clearCache();
        java.lang.ClassLoader classLoader6 = typeFactory3.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory3.withModifier(typeModifier7);
        java.lang.Class<?> wildcardClass10 = typeFactory8._findPrimitive("hi!");
        java.lang.ClassLoader classLoader11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory8.withClassLoader(classLoader11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = typeFactory8.findClass("<Ljava/lang/Object;>");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <Ljava/lang/Object;>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(typeFactory12);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory3.withModifier(typeModifier6);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory7);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        java.lang.ClassLoader classLoader5 = typeFactory4.getClassLoader();
        typeFactory4.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory10.withModifier(typeModifier11);
        java.lang.ClassLoader classLoader13 = typeFactory12.getClassLoader();
        typeFactory12.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory12._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray16, classLoader17);
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray16, classLoader19);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = typeFactory20._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNull(classLoader13);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory3._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory3.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory6._modifiers;
        java.lang.ClassLoader classLoader8 = typeFactory6.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        typeFactory6.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(typeParser9);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType21 = typeBindings19.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory0.constructType((java.lang.reflect.Type) simpleType18, typeBindings19);
        java.lang.ClassLoader classLoader23 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory0.withModifier(typeModifier26);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNull(classLoader23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeFactory27);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.type.ClassStack classStack4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        java.lang.Class<?> wildcardClass9 = typeBindings7.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeBindings10.getBoundType((int) (byte) 10);
        java.lang.Object obj13 = typeBindings10.readResolve();
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory0._fromAny(classStack4, (java.lang.reflect.Type) wildcardClass9, typeBindings10);
        com.fasterxml.jackson.databind.JavaType javaType16 = typeBindings10.findBoundType("");
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray17 = typeBindings10.typeParameterArray();
        java.lang.Class<?> wildcardClass18 = typeBindings10.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(typeBindings7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "<>");
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNotNull(javaTypeArray17);
        org.junit.Assert.assertArrayEquals(javaTypeArray17, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        boolean boolean2 = typeBindings0.hasUnbound("hi!");
        boolean boolean3 = typeBindings0.isEmpty();
        int int4 = typeBindings0.size();
        java.lang.Object obj5 = typeBindings0.readResolve();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "<>");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) (byte) 10);
        java.lang.Object obj3 = typeBindings0.readResolve();
        boolean boolean5 = typeBindings0.hasUnbound("<>");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory6.constructType((java.lang.reflect.Type) simpleType7, typeBindings8);
        com.fasterxml.jackson.databind.JavaType javaType11 = typeBindings8.findBoundType("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = typeBindings8.withUnboundVariable("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings15 = typeBindings8.withUnboundVariable("<>");
        boolean boolean16 = typeBindings0.equals((java.lang.Object) "<>");
        boolean boolean17 = typeBindings0.isEmpty();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList18 = typeBindings0.getTypeParameters();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = typeBindings0.withUnboundVariable("<Ljava/lang/Object;>");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "<>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(typeBindings8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(typeBindings13);
        org.junit.Assert.assertNotNull(typeBindings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(javaTypeList18);
        org.junit.Assert.assertNotNull(typeBindings20);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        com.fasterxml.jackson.databind.JavaType javaType21 = typeBindings16.findBoundType("<>");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings23 = typeBindings16.withUnboundVariable("<>");
        boolean boolean25 = typeBindings16.hasUnbound("");
        java.lang.Object obj26 = typeBindings16.readResolve();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(typeBindings23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "<>");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap6 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory0.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(javaType8);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap6 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = typeFactory2._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeFactory2.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNull(typeModifierArray9);
        org.junit.Assert.assertNull(typeModifierArray10);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory3._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory3.withClassLoader(classLoader5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory6.withModifier(typeModifier9);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray1 = typeBindings0.typeParameterArray();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeBindings0.getBoundType((int) (short) 10);
        java.lang.String str4 = typeBindings0.toString();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNotNull(javaTypeArray1);
        org.junit.Assert.assertArrayEquals(javaTypeArray1, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<>" + "'", str4, "<>");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        java.lang.ClassLoader classLoader4 = typeFactory3._classLoader;
        typeFactory3.clearCache();
        java.lang.ClassLoader classLoader6 = typeFactory3._classLoader;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory3._unknownType();
        java.lang.Class<?> wildcardClass9 = typeFactory3._findPrimitive("");
        java.lang.ClassLoader classLoader10 = typeFactory3.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(classLoader10);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings1 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean3 = typeBindings1.equals((java.lang.Object) simpleType2);
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray4 = typeBindings1.typeParameterArray();
        boolean boolean5 = typeBindings0.equals((java.lang.Object) javaTypeArray4);
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNotNull(typeBindings1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(javaTypeArray4);
        org.junit.Assert.assertArrayEquals(javaTypeArray4, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray20 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap24 = typeFactory2._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNull(typeModifierArray20);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap24);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        boolean boolean18 = typeBindings14.isEmpty();
        boolean boolean19 = typeBindings14.isEmpty();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings21 = typeBindings14.withUnboundVariable("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(typeBindings21);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        java.lang.ClassLoader classLoader4 = typeFactory3._classLoader;
        typeFactory3.clearCache();
        java.lang.ClassLoader classLoader6 = typeFactory3.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory3.withModifier(typeModifier7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = null;
        java.lang.ClassLoader classLoader11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10, classLoader11);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeParser9);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap6 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._unknownType();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory0.withClassLoader(classLoader9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0.constructFromCanonical("<Ljava/lang/Object;>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '<Ljava/lang/Object;>' (remaining: 'Ljava/lang/Object;>'): Can not locate class '<', problem: <");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeBindings2.findBoundType("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = typeBindings2.withUnboundVariable("<>");
        boolean boolean8 = typeBindings7.isEmpty();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(typeBindings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        boolean boolean18 = typeBindings14.isEmpty();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = typeBindings14.withUnboundVariable("");
        int int21 = typeBindings14.size();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings23 = typeBindings14.withUnboundVariable("hi!");
        int int24 = typeBindings23.size();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList25 = typeBindings23.getTypeParameters();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(typeBindings20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(typeBindings23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(javaTypeList25);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory18.constructType((java.lang.reflect.Type) simpleType19, typeBindings20);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList22 = typeBindings20.getTypeParameters();
        boolean boolean23 = typeBindings14.equals((java.lang.Object) typeBindings20);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = typeBindings20.withUnboundVariable("<>");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = typeBindings25.withUnboundVariable("");
        boolean boolean29 = typeBindings27.hasUnbound("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertNotNull(typeBindings20);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaTypeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(typeBindings25);
        org.junit.Assert.assertNotNull(typeBindings27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        java.lang.String str20 = typeBindings16.toString();
        java.lang.String str22 = typeBindings16.getBoundName((int) 'a');
        int int23 = typeBindings16.size();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<>" + "'", str20, "<>");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList4 = typeBindings2.getTypeParameters();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = typeBindings2.withUnboundVariable("");
        com.fasterxml.jackson.databind.JavaType javaType8 = typeBindings6.getBoundType((-1));
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = typeBindings6.withUnboundVariable("<Ljava/lang/Object;>");
        com.fasterxml.jackson.databind.JavaType javaType12 = typeBindings6.getBoundType((int) (short) 1);
        int int13 = typeBindings6.size();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(javaTypeList4);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory3._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory3.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory6._modifiers;
        typeFactory6.clearCache();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory6.withClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass12 = typeFactory6._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(wildcardClass12);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        int int18 = typeBindings14.size();
        int int19 = typeBindings14.size();
        com.fasterxml.jackson.databind.JavaType javaType21 = typeBindings14.findBoundType("<>");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings23 = typeBindings14.withUnboundVariable("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(typeBindings23);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser2 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser2);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        boolean boolean18 = typeBindings14.isEmpty();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = typeBindings14.withUnboundVariable("");
        com.fasterxml.jackson.databind.JavaType javaType22 = typeBindings20.getBoundType((int) (short) 10);
        com.fasterxml.jackson.databind.JavaType javaType24 = typeBindings20.findBoundType("<>");
        int int25 = typeBindings20.size();
        boolean boolean26 = typeBindings20.isEmpty();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(typeBindings20);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        java.lang.String str18 = typeBindings14.toString();
        boolean boolean20 = typeBindings14.hasUnbound("<>");
        boolean boolean22 = typeBindings14.hasUnbound("");
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList23 = typeBindings14.getTypeParameters();
        boolean boolean24 = typeBindings14.isEmpty();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<>" + "'", str18, "<>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(javaTypeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory3._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory3.withClassLoader(classLoader5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory6.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        java.lang.String str20 = typeBindings16.toString();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray21 = typeBindings16.typeParameterArray();
        com.fasterxml.jackson.databind.JavaType javaType23 = typeBindings16.getBoundType((int) 'a');
        boolean boolean24 = typeBindings16.isEmpty();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = typeBindings16.withUnboundVariable("<>");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<>" + "'", str20, "<>");
        org.junit.Assert.assertNotNull(javaTypeArray21);
        org.junit.Assert.assertArrayEquals(javaTypeArray21, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(typeBindings26);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory5.withClassLoader(classLoader6);
        java.lang.Class<?> wildcardClass9 = typeFactory7._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        java.lang.ClassLoader classLoader5 = typeFactory4.getClassLoader();
        java.lang.Class<?> wildcardClass6 = typeFactory4.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory5.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.ClassStack classStack12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory13.constructType((java.lang.reflect.Type) simpleType14, typeBindings15);
        java.lang.Class<?> wildcardClass17 = typeBindings15.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType20 = typeBindings18.getBoundType((int) (byte) 10);
        java.lang.Object obj21 = typeBindings18.readResolve();
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory8._fromAny(classStack12, (java.lang.reflect.Type) wildcardClass17, typeBindings18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withClassLoader(classLoader24);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withModifier(typeModifier26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap29 = typeFactory25._typeCache;
        java.lang.ClassLoader classLoader30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = typeFactory25.withClassLoader(classLoader30);
        com.fasterxml.jackson.databind.JavaType javaType32 = typeFactory25._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType33 = typeFactory5.moreSpecificType(javaType22, javaType32);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertNotNull(typeBindings15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "<>");
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap28);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap29);
        org.junit.Assert.assertNotNull(typeFactory31);
        org.junit.Assert.assertNotNull(javaType32);
        org.junit.Assert.assertNotNull(javaType33);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType21 = typeBindings19.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory0.constructType((java.lang.reflect.Type) simpleType18, typeBindings19);
        java.lang.Object obj23 = typeBindings19.readResolve();
        com.fasterxml.jackson.databind.JavaType javaType25 = typeBindings19.findBoundType("");
        java.lang.String str27 = typeBindings19.getBoundName((int) 'a');
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "<>");
        org.junit.Assert.assertNull(javaType25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass6 = typeFactory2._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass8 = typeFactory2._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9.constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory2.constructType((java.lang.reflect.Type) javaType8, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeBindings16.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._fromAny(classStack14, (java.lang.reflect.Type) simpleType15, typeBindings16);
        java.lang.String str20 = typeBindings16.toString();
        java.lang.String str22 = typeBindings16.getBoundName((int) 'a');
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList23 = typeBindings16.getTypeParameters();
        java.lang.Class<?> wildcardClass24 = javaTypeList23.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(typeBindings11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(typeBindings16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<>" + "'", str20, "<>");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(javaTypeList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType21 = typeBindings19.getBoundType((int) (byte) 10);
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory0.constructType((java.lang.reflect.Type) simpleType18, typeBindings19);
        boolean boolean23 = typeBindings19.isEmpty();
        java.lang.String str25 = typeBindings19.getBoundName((int) '#');
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertNotNull(typeBindings19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.type.SimpleType simpleType5 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType2, (com.fasterxml.jackson.databind.JavaType) simpleType5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) simpleType9, typeBindings10);
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory8.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.lang.Object obj15 = null;
        boolean boolean16 = typeBindings14.equals(obj15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromAny(classStack7, (java.lang.reflect.Type) arrayType13, typeBindings14);
        typeFactory0.clearCache();
        java.lang.ClassLoader classLoader19 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser20 = typeFactory0._parser;
        java.lang.Class<?> wildcardClass21 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(simpleType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNull(classLoader19);
        org.junit.Assert.assertNotNull(typeParser20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }
}

