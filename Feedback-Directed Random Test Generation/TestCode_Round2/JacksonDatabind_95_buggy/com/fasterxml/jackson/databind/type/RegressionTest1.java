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
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory0.withModifier(typeModifier10);
        java.lang.ClassLoader classLoader12 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory0.withModifier(typeModifier13);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNull(classLoader12);
        org.junit.Assert.assertNotNull(typeFactory14);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("hi!");
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory2._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(javaType4);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("");
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        java.lang.String str8 = myTokenizer1.nextToken("hi!");
        java.lang.String str9 = myTokenizer1._input;
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        java.lang.String str11 = myTokenizer1._pushbackToken;
        boolean boolean12 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = (-1);
        java.lang.Object obj15 = myTokenizer1.nextElement();
        myTokenizer1._index = (short) -1;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        int int7 = myTokenizer1.countTokens();
        myTokenizer1._index = (byte) 100;
        java.lang.String str10 = myTokenizer1._input;
        java.lang.String str11 = myTokenizer1._input;
        boolean boolean12 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) 1;
        int int8 = myTokenizer1._index;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory1.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) arrayType5);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer10 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer10.asIterator();
        java.lang.String str12 = myTokenizer10._input;
        java.lang.String str13 = myTokenizer10.getRemainingInput();
        myTokenizer10._pushbackToken = "";
        java.lang.Object obj16 = myTokenizer10.nextElement();
        boolean boolean17 = myTokenizer10.hasMoreTokens();
        myTokenizer10._index = (byte) -1;
        java.lang.String str20 = myTokenizer10.getAllInput();
        myTokenizer10.pushBack("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList23 = typeParser8.parseTypes(myTokenizer10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(arrayType6);
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        int int6 = myTokenizer1._index;
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        java.lang.String str8 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        int int6 = myTokenizer1._index;
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 52;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.Class<?> wildcardClass8 = objItor7.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        myTokenizer1._index = 'a';
        java.lang.String str9 = myTokenizer1._pushbackToken;
        boolean boolean10 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.Class<?> wildcardClass4 = typeFactory0._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeParser3._factory;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        java.lang.String str7 = myTokenizer1.nextToken();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeParser3._factory;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = typeParser3.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.lang.String str7 = myTokenizer1.nextToken();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory0.withModifier(typeModifier10);
        java.lang.Class<?> wildcardClass13 = typeFactory0._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNull(wildcardClass13);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        myTokenizer1._index = '4';
        myTokenizer1.pushBack("");
        myTokenizer1.pushBack("");
        java.lang.String str13 = myTokenizer1.nextToken("hi!");
        int int14 = myTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        int int3 = myTokenizer1._index;
        myTokenizer1._index = (byte) -1;
        boolean boolean6 = myTokenizer1.hasMoreElements();
        boolean boolean7 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("hi!");
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer3.pushBack("");
        java.lang.String str6 = myTokenizer3.nextToken();
        java.lang.String str7 = myTokenizer3._pushbackToken;
        java.lang.String str8 = myTokenizer3.getRemainingInput();
        java.lang.IllegalArgumentException illegalArgumentException10 = typeParser1._problem(myTokenizer3, "");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser1._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer13 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor14 = myTokenizer13.asIterator();
        java.lang.String str15 = myTokenizer13.getRemainingInput();
        boolean boolean16 = myTokenizer13.hasMoreElements();
        java.lang.String str17 = myTokenizer13.getAllInput();
        java.lang.String str18 = myTokenizer13._input;
        java.lang.String str19 = myTokenizer13._input;
        java.lang.IllegalArgumentException illegalArgumentException21 = typeParser1._problem(myTokenizer13, "hi!");
        java.lang.String str22 = myTokenizer13.getRemainingInput();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(illegalArgumentException10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(illegalArgumentException21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        java.lang.Class<?> wildcardClass5 = typeFactory2._findPrimitive("hi!");
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withClassLoader(classLoader6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = typeFactory2.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeFactory7);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory5.withClassLoader(classLoader6);
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeParser4.withFactory(typeFactory5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory5.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser8);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.Class<?> wildcardClass9 = typeFactory0._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeParser10.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        java.lang.String str9 = myTokenizer1._pushbackToken;
        int int10 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        myTokenizer1._index = '4';
        java.lang.String str8 = myTokenizer1.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("");
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.Class<?> wildcardClass9 = typeFactory0._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeParser10);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        int int14 = myTokenizer12._index;
        java.lang.String str15 = myTokenizer12._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException17 = typeParser10._problem(myTokenizer12, "");
        myTokenizer12._pushbackToken = "hi!";
        myTokenizer12._pushbackToken = "hi!";
        boolean boolean22 = myTokenizer12.hasMoreTokens();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        int int7 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory0._typeCache;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        java.lang.Class<?> wildcardClass6 = typeFactory0._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNull(wildcardClass6);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) 1;
        myTokenizer1._index = (-1);
        java.lang.String str11 = myTokenizer1.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        myTokenizer1._index = (short) 1;
        myTokenizer1._index = (short) 0;
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        boolean boolean9 = myTokenizer1.hasMoreElements();
        java.lang.String str10 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("hi!");
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        java.lang.String str9 = myTokenizer1.getRemainingInput();
        java.lang.String str10 = myTokenizer1.nextToken();
        java.lang.String str11 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap11 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objLRUMap11);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        int int7 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1._input;
        int int9 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1.nextToken("hi!");
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str11 = myTokenizer1._input;
        myTokenizer1._index = '#';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1.getRemainingInput();
        myTokenizer1.pushBack("");
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1.nextToken("hi!");
        myTokenizer1._pushbackToken = "hi!";
        boolean boolean11 = myTokenizer1.hasMoreTokens();
        java.lang.String str12 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = typeParser4.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        boolean boolean10 = myTokenizer1.hasMoreElements();
        int int11 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor12 = myTokenizer1.asIterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objItor12);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        java.lang.ClassLoader classLoader4 = typeFactory0._classLoader;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = typeFactory0.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNull(classLoader4);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        int int7 = myTokenizer1.countTokens();
        java.lang.String str9 = myTokenizer1.nextToken("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        boolean boolean6 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.Class<?> wildcardClass9 = typeFactory0._findPrimitive("hi!");
        java.lang.ClassLoader classLoader10 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap11 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNotNull(objLRUMap11);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        int int6 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.Object obj8 = myTokenizer1.nextElement();
        java.lang.String str9 = myTokenizer1._input;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        java.lang.Class<?> wildcardClass4 = myTokenizer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.lang.String str5 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer3.pushBack("");
        java.lang.String str6 = myTokenizer3.nextToken();
        java.lang.String str7 = myTokenizer3._pushbackToken;
        java.lang.String str8 = myTokenizer3.getRemainingInput();
        java.lang.IllegalArgumentException illegalArgumentException10 = typeParser1._problem(myTokenizer3, "");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser1._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer13 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor14 = myTokenizer13.asIterator();
        java.lang.String str15 = myTokenizer13.getRemainingInput();
        boolean boolean16 = myTokenizer13.hasMoreElements();
        java.lang.String str17 = myTokenizer13.getAllInput();
        java.lang.String str18 = myTokenizer13._input;
        java.lang.String str19 = myTokenizer13._input;
        java.lang.IllegalArgumentException illegalArgumentException21 = typeParser1._problem(myTokenizer13, "hi!");
        int int22 = myTokenizer13.countTokens();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(illegalArgumentException10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(illegalArgumentException21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        int int14 = myTokenizer12._index;
        java.lang.String str15 = myTokenizer12._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException17 = typeParser10._problem(myTokenizer12, "");
        myTokenizer12._pushbackToken = "hi!";
        int int20 = myTokenizer12._index;
        java.lang.String str21 = myTokenizer12._input;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        myTokenizer1._index = 0;
        myTokenizer1._index = (short) 100;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer3.pushBack("");
        java.lang.String str6 = myTokenizer3.nextToken();
        java.lang.String str7 = myTokenizer3._pushbackToken;
        java.lang.String str8 = myTokenizer3.getRemainingInput();
        java.lang.IllegalArgumentException illegalArgumentException10 = typeParser1._problem(myTokenizer3, "");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser1._factory;
        java.lang.ClassLoader classLoader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = typeFactory11.classForName("", false, classLoader14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(illegalArgumentException10);
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        myTokenizer1._pushbackToken = "";
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        java.lang.String str9 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(objItor10);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj6 = myTokenizer1.nextElement();
        myTokenizer1._index = 'a';
        myTokenizer1._index = (byte) 10;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        myTokenizer1._pushbackToken = "";
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._pushbackToken;
        myTokenizer1.pushBack("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withCache(objLRUMap7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory10);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7, typeParser11, typeModifierArray12, classLoader13);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer20 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor21 = myTokenizer20.asIterator();
        java.lang.String str22 = myTokenizer20._input;
        myTokenizer20.pushBack("hi!");
        boolean boolean25 = myTokenizer20.hasMoreTokens();
        java.lang.IllegalArgumentException illegalArgumentException27 = typeParser18._problem(myTokenizer20, "");
        java.lang.String str28 = myTokenizer20.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList29 = typeParser11.parseTypes(myTokenizer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(objItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(illegalArgumentException27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getAllInput();
        int int7 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str10 = myTokenizer1.getRemainingInput();
        int int11 = myTokenizer1.countTokens();
        int int12 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1._index;
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        typeFactory0.clearCache();
        java.lang.Class<?> wildcardClass5 = typeFactory0._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass5);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        java.lang.String str7 = myTokenizer1.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        java.lang.String str9 = myTokenizer1._input;
        int int10 = myTokenizer1._index;
        java.lang.String str11 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        java.lang.Class<?> wildcardClass5 = typeFactory2._findPrimitive("hi!");
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withClassLoader(classLoader6);
        java.lang.Class<?> wildcardClass9 = typeFactory2._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withCache(objLRUMap7);
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.moreSpecificType(javaType9, javaType11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory8.withModifier(typeModifier13);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory14._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeParser15);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withCache(objLRUMap7);
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.moreSpecificType(javaType9, javaType11);
        java.lang.Class<?> wildcardClass14 = typeFactory8._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass16 = typeFactory8._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(wildcardClass16);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        int int6 = myTokenizer1.countTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._input;
        boolean boolean8 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer3.pushBack("");
        java.lang.String str6 = myTokenizer3.nextToken();
        java.lang.String str7 = myTokenizer3._pushbackToken;
        java.lang.String str8 = myTokenizer3.getRemainingInput();
        java.lang.IllegalArgumentException illegalArgumentException10 = typeParser1._problem(myTokenizer3, "");
        myTokenizer3._index = '#';
        boolean boolean13 = myTokenizer3.hasMoreElements();
        java.lang.String str14 = myTokenizer3._input;
        myTokenizer3._pushbackToken = "";
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(illegalArgumentException10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        java.lang.String str6 = myTokenizer1._input;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        boolean boolean4 = myTokenizer1.hasMoreTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        myTokenizer1._index = (short) 0;
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str11 = myTokenizer1.nextToken("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        myTokenizer1._index = (byte) 1;
        myTokenizer1._index = 'a';
        boolean boolean11 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory2._typeCache;
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap6 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader7 = typeFactory2._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNotNull(objLRUMap6);
        org.junit.Assert.assertNull(classLoader7);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory9.withClassLoader(classLoader10);
        com.fasterxml.jackson.databind.type.ClassStack classStack12 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass14 = simpleType13.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings15 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory9._fromAny(classStack12, (java.lang.reflect.Type) wildcardClass14, typeBindings15);
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory9.constructType((java.lang.reflect.Type) simpleType17);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory9._unknownType();
        com.fasterxml.jackson.databind.type.ArrayType arrayType20 = typeFactory0.constructArrayType(javaType19);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(typeBindings15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(arrayType20);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeParser1._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer5 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer5.pushBack("");
        java.lang.String str8 = myTokenizer5.nextToken();
        java.lang.String str9 = myTokenizer5._pushbackToken;
        myTokenizer5._index = '4';
        myTokenizer5.pushBack("");
        myTokenizer5.pushBack("");
        java.lang.String str17 = myTokenizer5.nextToken("hi!");
        boolean boolean18 = myTokenizer5.hasMoreElements();
        int int19 = myTokenizer5._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = typeParser1.findClass("", myTokenizer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(typeFactory2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.Class<?> wildcardClass6 = objItor5.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.nextToken();
        int int7 = myTokenizer1._index;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        boolean boolean3 = myTokenizer1.hasMoreElements();
        int int4 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._pushbackToken = "hi!";
        int int10 = myTokenizer1._index;
        boolean boolean11 = myTokenizer1.hasMoreElements();
        java.lang.String str12 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (byte) 100;
        java.lang.String str8 = myTokenizer1.getAllInput();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        int int6 = myTokenizer1._index;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) 0;
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        int int9 = myTokenizer1.countTokens();
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        boolean boolean11 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        int int6 = myTokenizer1._index;
        java.lang.Object obj7 = myTokenizer1.nextElement();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory0.withModifier(typeModifier11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory12);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer16 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer16.pushBack("");
        java.lang.String str19 = myTokenizer16.nextToken();
        java.lang.String str20 = myTokenizer16._pushbackToken;
        java.lang.String str21 = myTokenizer16.getRemainingInput();
        java.lang.String str22 = myTokenizer16.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = typeParser13.findClass("", myTokenizer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class '', problem: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("hi!");
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        int int10 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1.getAllInput();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str6 = myTokenizer1.nextToken();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        int int7 = myTokenizer1.countTokens();
        myTokenizer1._index = (byte) 100;
        java.lang.String str10 = myTokenizer1.getAllInput();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        myTokenizer1._index = (short) 100;
        java.lang.String str9 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._input;
        java.lang.String str8 = myTokenizer1._pushbackToken;
        boolean boolean9 = myTokenizer1.hasMoreElements();
        myTokenizer1.pushBack("");
        java.lang.String str12 = myTokenizer1.nextToken();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = '#';
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1.nextToken();
        myTokenizer1.pushBack("hi!");
        java.lang.String str13 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        int int14 = myTokenizer12._index;
        java.lang.String str15 = myTokenizer12._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException17 = typeParser10._problem(myTokenizer12, "");
        myTokenizer12._index = (byte) 0;
        int int20 = myTokenizer12._index;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        myTokenizer1.pushBack("hi!");
        java.lang.Object obj8 = myTokenizer1.nextElement();
        myTokenizer1._index = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        java.lang.Class<?> wildcardClass5 = typeFactory2._findPrimitive("hi!");
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withClassLoader(classLoader6);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap8 = typeFactory2._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(objLRUMap8);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory6.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1._input;
        myTokenizer1._index = (short) 1;
        boolean boolean12 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        int int14 = myTokenizer12._index;
        java.lang.String str15 = myTokenizer12._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException17 = typeParser10._problem(myTokenizer12, "");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeParser10._factory;
        java.lang.ClassLoader classLoader19 = typeFactory18.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNull(classLoader19);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str6 = myTokenizer1.nextToken("hi!");
        java.lang.String str7 = myTokenizer1._input;
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1.nextToken();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        java.lang.Class<?> wildcardClass7 = myTokenizer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (byte) 0;
        myTokenizer1._pushbackToken = "";
        java.lang.String str11 = myTokenizer1.nextToken("hi!");
        boolean boolean12 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1.getRemainingInput();
        myTokenizer1.pushBack("");
        java.lang.String str9 = myTokenizer1.nextToken("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        int int9 = myTokenizer1._index;
        java.lang.String str10 = myTokenizer1._pushbackToken;
        java.lang.String str11 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor12 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(objItor12);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withCache(objLRUMap7);
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.moreSpecificType(javaType9, javaType11);
        java.lang.Class<?> wildcardClass14 = typeFactory8._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeParser15._factory;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeParser15.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeFactory16);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        int int3 = myTokenizer1._index;
        myTokenizer1._index = (byte) -1;
        boolean boolean6 = myTokenizer1.hasMoreElements();
        java.lang.String str7 = myTokenizer1._pushbackToken;
        int int8 = myTokenizer1.countTokens();
        java.lang.String str9 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) 1;
        myTokenizer1._pushbackToken = "";
        java.lang.String str10 = myTokenizer1.nextToken();
        boolean boolean11 = myTokenizer1.hasMoreTokens();
        java.lang.String str12 = myTokenizer1.getAllInput();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withCache(objLRUMap7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory10);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7, typeParser11, typeModifierArray12, classLoader13);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        java.lang.String str8 = myTokenizer1.nextToken();
        myTokenizer1._pushbackToken = "hi!";
        boolean boolean11 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("");
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1.countTokens();
        int int7 = myTokenizer1._index;
        int int8 = myTokenizer1.countTokens();
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer3.pushBack("");
        java.lang.String str6 = myTokenizer3.nextToken();
        java.lang.String str7 = myTokenizer3._pushbackToken;
        java.lang.String str8 = myTokenizer3.getRemainingInput();
        java.lang.IllegalArgumentException illegalArgumentException10 = typeParser1._problem(myTokenizer3, "");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser1._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer13 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor14 = myTokenizer13.asIterator();
        java.lang.String str15 = myTokenizer13.getRemainingInput();
        boolean boolean16 = myTokenizer13.hasMoreElements();
        java.lang.String str17 = myTokenizer13.getAllInput();
        java.lang.String str18 = myTokenizer13._input;
        java.lang.String str19 = myTokenizer13._input;
        java.lang.IllegalArgumentException illegalArgumentException21 = typeParser1._problem(myTokenizer13, "hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeParser1._factory;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(illegalArgumentException10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(illegalArgumentException21);
        org.junit.Assert.assertNotNull(typeFactory22);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = '#';
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1.getAllInput();
        java.lang.String str11 = myTokenizer1.getAllInput();
        java.lang.String str12 = myTokenizer1._input;
        java.lang.String str14 = myTokenizer1.nextToken("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        int int7 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "hi!";
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        int int6 = myTokenizer1.countTokens();
        boolean boolean7 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeParser1._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList4 = typeParser1.parseTypes(myTokenizer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withCache(objLRUMap7);
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.moreSpecificType(javaType9, javaType11);
        java.lang.Class<?> wildcardClass14 = typeFactory8._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory8._parser;
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory8._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(javaType16);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory0.withModifier(typeModifier11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory12);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory12.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory12);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        int int14 = myTokenizer12._index;
        java.lang.String str15 = myTokenizer12._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException17 = typeParser10._problem(myTokenizer12, "");
        myTokenizer12._pushbackToken = "hi!";
        java.lang.String str21 = myTokenizer12.nextToken("hi!");
        java.lang.String str22 = myTokenizer12._input;
        java.util.Iterator<java.lang.Object> objItor23 = myTokenizer12.asIterator();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(objItor23);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1.getAllInput();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.lang.String str7 = myTokenizer1._input;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer3._pushbackToken = "";
        myTokenizer3.pushBack("");
        java.lang.String str8 = myTokenizer3.getRemainingInput();
        java.lang.String str9 = myTokenizer3._input;
        myTokenizer3.pushBack("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeParser1.parseType(myTokenizer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1.getAllInput();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        boolean boolean7 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        java.lang.String str9 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (byte) 10;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withCache(objLRUMap7);
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.moreSpecificType(javaType9, javaType11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory8.withModifier(typeModifier13);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withModifier(typeModifier15);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withModifier(typeModifier17);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory16.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        int int2 = myTokenizer1.countTokens();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory4._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) 0;
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        java.lang.String str7 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        java.lang.Class<?> wildcardClass9 = myTokenizer1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        int int6 = myTokenizer1._index;
        myTokenizer1._index = 0;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("hi!");
        int int12 = myTokenizer1.countTokens();
        boolean boolean13 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        java.lang.String str3 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(javaType4);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        int int7 = myTokenizer1._index;
        boolean boolean8 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass6 = typeFactory4._findPrimitive("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory4.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(wildcardClass6);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1.nextToken();
        int int11 = myTokenizer1.countTokens();
        java.lang.String str12 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory1.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) arrayType5);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray8 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory0._parser;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = typeParser9.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(arrayType6);
        org.junit.Assert.assertNull(typeModifierArray8);
        org.junit.Assert.assertNotNull(typeParser9);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        int int14 = myTokenizer12._index;
        java.lang.String str15 = myTokenizer12._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException17 = typeParser10._problem(myTokenizer12, "");
        int int18 = myTokenizer12.countTokens();
        java.util.Iterator<java.lang.Object> objItor19 = myTokenizer12.asIterator();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objItor19);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("");
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        java.lang.String str8 = myTokenizer1.nextToken("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        int int10 = myTokenizer1._index;
        java.lang.String str12 = myTokenizer1.nextToken("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        int int4 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1._index;
        myTokenizer1._index = (short) 0;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 'a';
        int int7 = myTokenizer1.countTokens();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getAllInput();
        int int7 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        int int10 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        int int6 = myTokenizer1._index;
        int int7 = myTokenizer1.countTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        myTokenizer1._pushbackToken = "hi!";
        boolean boolean8 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str10 = myTokenizer1.getRemainingInput();
        boolean boolean11 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str10 = myTokenizer1.getRemainingInput();
        int int11 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str8 = myTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objItor9);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        myTokenizer1.pushBack("");
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap4);
        typeFactory5.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(objLRUMap4);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        java.lang.String str6 = myTokenizer1.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        myTokenizer1._index = 0;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objItor9);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        boolean boolean4 = myTokenizer1.hasMoreTokens();
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1.nextToken();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory0.withModifier(typeModifier11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeParser13._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer16 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor17 = myTokenizer16.asIterator();
        java.lang.String str18 = myTokenizer16.getRemainingInput();
        java.lang.String str19 = myTokenizer16._input;
        int int20 = myTokenizer16._index;
        myTokenizer16.pushBack("");
        int int23 = myTokenizer16.countTokens();
        java.lang.String str25 = myTokenizer16.nextToken("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList26 = typeParser13.parseTypes(myTokenizer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(objItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withCache(objLRUMap7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.moreSpecificType(javaType9, (com.fasterxml.jackson.databind.JavaType) simpleType10);
        java.lang.Class<?> wildcardClass12 = simpleType10.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1.nextToken("hi!");
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str12 = myTokenizer1.nextToken("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str10 = myTokenizer1.getRemainingInput();
        int int11 = myTokenizer1._index;
        int int12 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = (short) 100;
        java.lang.String str9 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        int int6 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        int int11 = myTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        int int14 = myTokenizer12._index;
        java.lang.String str15 = myTokenizer12._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException17 = typeParser10._problem(myTokenizer12, "");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer19 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor20 = myTokenizer19.asIterator();
        java.lang.String str21 = myTokenizer19.getRemainingInput();
        java.lang.String str22 = myTokenizer19._input;
        int int23 = myTokenizer19._index;
        int int24 = myTokenizer19._index;
        java.lang.String str25 = myTokenizer19.getRemainingInput();
        myTokenizer19._pushbackToken = "hi!";
        boolean boolean28 = myTokenizer19.hasMoreTokens();
        boolean boolean29 = myTokenizer19.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList30 = typeParser10.parseTypes(myTokenizer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(objItor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1._index = 0;
        myTokenizer1.pushBack("hi!");
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._pushbackToken = "hi!";
        int int10 = myTokenizer1._index;
        myTokenizer1._index = (byte) -1;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        java.lang.String str9 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory2._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withCache(objLRUMap7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory10);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7, typeParser11, typeModifierArray12, classLoader13);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer16 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor17 = myTokenizer16.asIterator();
        java.lang.String str18 = myTokenizer16._input;
        java.lang.String str19 = myTokenizer16.getRemainingInput();
        myTokenizer16._pushbackToken = "";
        java.lang.Object obj22 = myTokenizer16.nextElement();
        java.util.Iterator<java.lang.Object> objItor23 = myTokenizer16.asIterator();
        java.lang.String str24 = myTokenizer16._input;
        int int25 = myTokenizer16._index;
        java.lang.IllegalArgumentException illegalArgumentException27 = typeParser11._problem(myTokenizer16, "");
        myTokenizer16._pushbackToken = "";
        java.lang.String str30 = myTokenizer16._pushbackToken;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(objItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
        org.junit.Assert.assertNotNull(objItor23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(illegalArgumentException27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory10.withClassLoader(classLoader11);
        java.lang.ClassLoader classLoader13 = typeFactory12.getClassLoader();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = typeFactory12._typeCache;
        typeFactory12.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap16 = typeFactory12._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory0.withCache(objLRUMap16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap16);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNull(classLoader13);
        org.junit.Assert.assertNotNull(objLRUMap14);
        org.junit.Assert.assertNotNull(objLRUMap16);
        org.junit.Assert.assertNotNull(typeFactory18);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory1.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) arrayType5);
        java.lang.Class<?> wildcardClass8 = typeFactory0._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(arrayType6);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        myTokenizer1._index = '4';
        myTokenizer1.pushBack("");
        myTokenizer1.pushBack("");
        java.lang.String str13 = myTokenizer1.nextToken("hi!");
        boolean boolean14 = myTokenizer1.hasMoreElements();
        int int15 = myTokenizer1._index;
        boolean boolean16 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory11);
        java.lang.Class<?> wildcardClass15 = typeFactory11._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory11._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(typeModifierArray16);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        int int7 = myTokenizer1._index;
        java.lang.String str8 = myTokenizer1._pushbackToken;
        int int9 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._input;
        java.lang.String str8 = myTokenizer1._pushbackToken;
        int int9 = myTokenizer1._index;
        int int10 = myTokenizer1.countTokens();
        myTokenizer1._index = 1;
        java.lang.String str13 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        int int6 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str9 = myTokenizer1.getRemainingInput();
        myTokenizer1.pushBack("");
        java.util.Iterator<java.lang.Object> objItor12 = myTokenizer1.asIterator();
        java.lang.String str14 = myTokenizer1.nextToken("");
        java.lang.String str15 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap3);
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withClassLoader(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        myTokenizer1._index = '4';
        myTokenizer1.pushBack("");
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        int int10 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objItor13);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        java.lang.String str9 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        java.lang.ClassLoader classLoader11 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader12 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        java.lang.ClassLoader classLoader14 = typeFactory0.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNull(classLoader11);
        org.junit.Assert.assertNull(classLoader12);
        org.junit.Assert.assertNull(classLoader14);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        int int9 = myTokenizer1._index;
        java.lang.String str10 = myTokenizer1._pushbackToken;
        java.lang.String str11 = myTokenizer1._input;
        boolean boolean12 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 10;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = '#';
        java.lang.String str10 = myTokenizer1.nextToken("");
        boolean boolean11 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.Object obj8 = myTokenizer1.nextElement();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = '#';
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1.getAllInput();
        java.lang.String str11 = myTokenizer1.getAllInput();
        java.lang.String str12 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        java.lang.String str5 = myTokenizer1._input;
        myTokenizer1.pushBack("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        java.lang.String str11 = myTokenizer1._pushbackToken;
        boolean boolean12 = myTokenizer1.hasMoreTokens();
        int int13 = myTokenizer1._index;
        boolean boolean14 = myTokenizer1.hasMoreElements();
        boolean boolean15 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = (short) 0;
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        java.lang.ClassLoader classLoader10 = typeFactory0.getClassLoader();
        java.lang.Class<?> wildcardClass12 = typeFactory0._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNull(wildcardClass12);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.lang.String str7 = myTokenizer1.getAllInput();
        boolean boolean8 = myTokenizer1.hasMoreElements();
        java.lang.String str9 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        java.lang.String str9 = myTokenizer1.nextToken("");
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        boolean boolean4 = myTokenizer1.hasMoreTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        myTokenizer1._index = 0;
        java.lang.String str13 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.lang.String str6 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        int int5 = myTokenizer1._index;
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 'a';
        java.lang.String str7 = myTokenizer1._pushbackToken;
        java.lang.String str8 = myTokenizer1._pushbackToken;
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        java.lang.String str3 = myTokenizer1._input;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap3);
        java.lang.Class<?> wildcardClass5 = typeFactory4.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.Class<?> wildcardClass9 = typeFactory0._findPrimitive("hi!");
        java.lang.ClassLoader classLoader10 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNotNull(javaType11);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        java.lang.String str9 = myTokenizer1._input;
        int int10 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "hi!";
        myTokenizer1.pushBack("");
        java.lang.String str10 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        int int7 = myTokenizer1.countTokens();
        myTokenizer1._index = 0;
        myTokenizer1._index = (short) -1;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        java.lang.String str9 = myTokenizer1._input;
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        java.lang.String str7 = myTokenizer1.getAllInput();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) -1;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        int int8 = myTokenizer1._index;
        int int9 = myTokenizer1.countTokens();
        myTokenizer1.pushBack("");
        myTokenizer1._index = '#';
        java.lang.String str14 = myTokenizer1.getAllInput();
        java.lang.String str15 = myTokenizer1.getAllInput();
        myTokenizer1._index = 10;
        java.lang.String str19 = myTokenizer1.nextToken("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("");
        myTokenizer1._index = 1;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer5 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer5.asIterator();
        java.lang.String str7 = myTokenizer5._input;
        myTokenizer5.pushBack("hi!");
        boolean boolean10 = myTokenizer5.hasMoreTokens();
        java.lang.IllegalArgumentException illegalArgumentException12 = typeParser3._problem(myTokenizer5, "");
        java.lang.String str13 = myTokenizer5._pushbackToken;
        int int14 = myTokenizer5.countTokens();
        boolean boolean15 = myTokenizer5.hasMoreTokens();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(illegalArgumentException12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("hi!");
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        java.lang.String str9 = myTokenizer1.getRemainingInput();
        java.lang.String str10 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer5 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer5.asIterator();
        java.lang.String str7 = myTokenizer5._input;
        myTokenizer5.pushBack("hi!");
        boolean boolean10 = myTokenizer5.hasMoreTokens();
        java.lang.IllegalArgumentException illegalArgumentException12 = typeParser3._problem(myTokenizer5, "");
        int int13 = myTokenizer5._index;
        java.util.Iterator<java.lang.Object> objItor14 = myTokenizer5.asIterator();
        java.lang.String str15 = myTokenizer5._input;
        java.lang.String str17 = myTokenizer5.nextToken("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(illegalArgumentException12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        myTokenizer1._index = (short) 1;
        myTokenizer1._index = (short) 0;
        int int9 = myTokenizer1._index;
        java.lang.String str10 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) 0;
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        int int9 = myTokenizer1.countTokens();
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objItor11);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory1.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) arrayType5);
        java.lang.Class<?> wildcardClass7 = arrayType6.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(arrayType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = typeParser4.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser4);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = 'a';
        boolean boolean14 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        myTokenizer1._index = (short) 1;
        java.lang.String str7 = myTokenizer1._input;
        myTokenizer1.pushBack("");
        java.lang.Object obj10 = myTokenizer1.nextElement();
        java.lang.String str11 = myTokenizer1._pushbackToken;
        int int12 = myTokenizer1._index;
        java.lang.String str13 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        java.lang.String str9 = myTokenizer1._input;
        myTokenizer1._index = 'a';
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        myTokenizer1._index = (short) 1;
        java.lang.String str7 = myTokenizer1._input;
        myTokenizer1.pushBack("");
        java.lang.Object obj10 = myTokenizer1.nextElement();
        java.lang.String str11 = myTokenizer1._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        myTokenizer1._index = (short) 1;
        java.lang.String str7 = myTokenizer1._input;
        myTokenizer1.pushBack("");
        java.lang.String str10 = myTokenizer1._pushbackToken;
        java.lang.String str11 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        java.lang.String str11 = myTokenizer1._pushbackToken;
        boolean boolean12 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = (-1);
        java.util.Iterator<java.lang.Object> objItor15 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor16 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertNotNull(objItor16);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        java.lang.String str7 = myTokenizer1.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        int int4 = myTokenizer1.countTokens();
        java.lang.String str6 = myTokenizer1.nextToken("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1.pushBack("");
        myTokenizer1._index = '#';
        java.lang.String str10 = myTokenizer1._input;
        boolean boolean11 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        java.lang.Class<?> wildcardClass9 = myTokenizer1.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._input;
        java.lang.String str8 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        int int6 = myTokenizer1._index;
        java.lang.Class<?> wildcardClass7 = myTokenizer1.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        int int6 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        myTokenizer1._index = (short) 10;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1._pushbackToken;
        int int11 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1._index;
        java.lang.String str6 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        boolean boolean2 = myTokenizer1.hasMoreElements();
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1._index;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        boolean boolean4 = myTokenizer1.hasMoreTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.lang.String str7 = myTokenizer1.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        int int8 = myTokenizer1.countTokens();
        java.lang.String str9 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str6 = myTokenizer1.nextToken("hi!");
        java.lang.String str7 = myTokenizer1._input;
        java.lang.String str8 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.Class<?> wildcardClass9 = typeFactory0._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.SimpleType simpleType11 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory0.constructType((java.lang.reflect.Type) simpleType11, javaType12);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(simpleType11);
        org.junit.Assert.assertNotNull(javaType13);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj6 = myTokenizer1.nextElement();
        myTokenizer1._index = 'a';
        boolean boolean9 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        myTokenizer1._index = (short) 1;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        java.lang.String str8 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory2._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap8 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap8);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(objLRUMap8);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory0.withModifier(typeModifier10);
        java.lang.ClassLoader classLoader12 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType18 = typeFactory14.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType17);
        com.fasterxml.jackson.databind.type.ArrayType arrayType19 = typeFactory13.constructArrayType((com.fasterxml.jackson.databind.JavaType) arrayType18);
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) arrayType19, javaType20);
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory0._unknownType();
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNull(classLoader12);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertNotNull(arrayType18);
        org.junit.Assert.assertNotNull(arrayType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) 1;
        myTokenizer1._pushbackToken = "";
        java.lang.String str10 = myTokenizer1.nextToken();
        boolean boolean11 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1._input;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory11);
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory11.withClassLoader(classLoader13);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory14);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        myTokenizer1._index = (short) 1;
        myTokenizer1._index = (short) 0;
        int int9 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        java.lang.String str12 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        int int7 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1._input;
        myTokenizer1._index = (byte) -1;
        java.lang.Object obj11 = myTokenizer1.nextElement();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        int int7 = myTokenizer1._index;
        java.lang.String str8 = myTokenizer1.nextToken();
        myTokenizer1._pushbackToken = "";
        java.lang.String str12 = myTokenizer1.nextToken("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        java.lang.reflect.ParameterizedType parameterizedType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._fromParamType(classStack7, parameterizedType8, typeBindings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = '#';
        java.lang.String str10 = myTokenizer1.nextToken("");
        boolean boolean11 = myTokenizer1.hasMoreElements();
        boolean boolean12 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        java.lang.ClassLoader classLoader11 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withClassLoader(classLoader13);
        com.fasterxml.jackson.databind.type.ClassStack classStack15 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass17 = simpleType16.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory12._fromAny(classStack15, (java.lang.reflect.Type) wildcardClass17, typeBindings18);
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory12._unknownType();
        com.fasterxml.jackson.databind.type.ArrayType arrayType21 = typeFactory0.constructArrayType(javaType20);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray22 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory0._unknownType();
        java.lang.ClassLoader classLoader24 = typeFactory0._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNull(classLoader11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(arrayType21);
        org.junit.Assert.assertNull(typeModifierArray22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNull(classLoader24);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        java.lang.String str7 = myTokenizer1.getAllInput();
        java.lang.String str8 = myTokenizer1._input;
        java.lang.String str9 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1.nextToken("hi!");
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objItor9);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1._index;
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "";
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = typeFactory4.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        java.lang.String str9 = myTokenizer1._input;
        int int10 = myTokenizer1._index;
        java.lang.String str11 = myTokenizer1.getAllInput();
        java.lang.String str12 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        java.lang.String str7 = myTokenizer1.getAllInput();
        java.lang.String str8 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objItor9);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        int int6 = myTokenizer1.countTokens();
        myTokenizer1.pushBack("");
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objItor9);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getAllInput();
        int int7 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str10 = myTokenizer1.getRemainingInput();
        int int11 = myTokenizer1.countTokens();
        java.lang.Object obj12 = myTokenizer1.nextElement();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer5 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer5.asIterator();
        java.lang.String str7 = myTokenizer5._input;
        myTokenizer5.pushBack("hi!");
        boolean boolean10 = myTokenizer5.hasMoreTokens();
        java.lang.IllegalArgumentException illegalArgumentException12 = typeParser3._problem(myTokenizer5, "");
        java.lang.String str13 = myTokenizer5._pushbackToken;
        java.lang.String str14 = myTokenizer5.getAllInput();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(illegalArgumentException12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        int int3 = myTokenizer1._index;
        myTokenizer1._index = 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1._index;
        myTokenizer1._index = (short) 0;
        myTokenizer1.pushBack("");
        myTokenizer1.pushBack("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "hi!";
        boolean boolean8 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = '#';
        java.lang.String str9 = myTokenizer1.nextToken();
        int int10 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = (byte) -1;
        java.lang.String str11 = myTokenizer1.getAllInput();
        boolean boolean12 = myTokenizer1.hasMoreElements();
        int int13 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory1.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) arrayType5);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer10 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer10.asIterator();
        java.lang.String str12 = myTokenizer10.getRemainingInput();
        java.lang.String str13 = myTokenizer10._input;
        int int14 = myTokenizer10._index;
        int int15 = myTokenizer10._index;
        java.lang.String str16 = myTokenizer10.getRemainingInput();
        myTokenizer10._pushbackToken = "hi!";
        java.lang.String str19 = myTokenizer10._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList20 = typeParser8.parseTypes(myTokenizer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(arrayType6);
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1._pushbackToken;
        int int11 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1.nextToken("hi!");
        java.lang.String str9 = myTokenizer1.getAllInput();
        java.lang.String str10 = myTokenizer1.getAllInput();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory6.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 35;
        myTokenizer1._pushbackToken = "hi!";
        myTokenizer1.pushBack("");
        myTokenizer1._index = (-1);
        int int13 = myTokenizer1._index;
        java.lang.String str15 = myTokenizer1.nextToken("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        myTokenizer1._index = (byte) 1;
        java.lang.String str9 = myTokenizer1._pushbackToken;
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        java.lang.String str9 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("hi!");
        java.lang.String str14 = myTokenizer1.nextToken();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        java.lang.ClassLoader classLoader11 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap12 = typeFactory0._typeCache;
        java.lang.ClassLoader classLoader13 = typeFactory0._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNull(classLoader11);
        org.junit.Assert.assertNotNull(objLRUMap12);
        org.junit.Assert.assertNull(classLoader13);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1._input;
        java.lang.String str9 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) 0;
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        int int9 = myTokenizer1.countTokens();
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        java.lang.String str12 = myTokenizer1.getRemainingInput();
        java.lang.String str13 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        int int6 = myTokenizer1._index;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        java.lang.ClassLoader classLoader5 = typeFactory2._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader5);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withCache(objLRUMap7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory10);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7, typeParser11, typeModifierArray12, classLoader13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType16 = typeParser11.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 35;
        myTokenizer1._pushbackToken = "hi!";
        myTokenizer1.pushBack("");
        myTokenizer1._index = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) 1;
        myTokenizer1._pushbackToken = "";
        myTokenizer1._pushbackToken = "";
        java.lang.String str12 = myTokenizer1.getAllInput();
        java.lang.String str13 = myTokenizer1.getAllInput();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "hi!";
        myTokenizer1.pushBack("");
        java.lang.Object obj10 = myTokenizer1.nextElement();
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        java.lang.ClassLoader classLoader11 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withClassLoader(classLoader13);
        com.fasterxml.jackson.databind.type.ClassStack classStack15 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass17 = simpleType16.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory12._fromAny(classStack15, (java.lang.reflect.Type) wildcardClass17, typeBindings18);
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory12._unknownType();
        com.fasterxml.jackson.databind.type.ArrayType arrayType21 = typeFactory0.constructArrayType(javaType20);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray22 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNull(classLoader11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(arrayType21);
        org.junit.Assert.assertNull(typeModifierArray22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(objLRUMap24);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        int int3 = myTokenizer1._index;
        myTokenizer1._index = (byte) -1;
        boolean boolean6 = myTokenizer1.hasMoreElements();
        java.lang.String str7 = myTokenizer1._pushbackToken;
        int int8 = myTokenizer1.countTokens();
        int int9 = myTokenizer1._index;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._pushbackToken = "hi!";
        int int10 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory0._typeCache;
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory0.classForName("", true, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(objLRUMap4);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        java.lang.String str9 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj4 = myTokenizer1.nextElement();
        myTokenizer1._pushbackToken = "hi!";
        int int7 = myTokenizer1._index;
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        int int6 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        int int9 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer5 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer5.asIterator();
        java.lang.String str7 = myTokenizer5._input;
        myTokenizer5.pushBack("hi!");
        boolean boolean10 = myTokenizer5.hasMoreTokens();
        java.lang.IllegalArgumentException illegalArgumentException12 = typeParser3._problem(myTokenizer5, "");
        java.lang.String str13 = myTokenizer5._input;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(illegalArgumentException12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        java.lang.Class<?> wildcardClass12 = typeFactory0._findPrimitive("hi!");
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNull(wildcardClass12);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory5.withClassLoader(classLoader6);
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeParser4.withFactory(typeFactory5);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeParser4._factory;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeFactory9);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        myTokenizer1.pushBack("");
        myTokenizer1.pushBack("hi!");
        int int11 = myTokenizer1.countTokens();
        java.lang.String str12 = myTokenizer1.getAllInput();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor4 = myTokenizer3.asIterator();
        java.lang.String str5 = myTokenizer3.getRemainingInput();
        java.lang.String str6 = myTokenizer3._input;
        int int7 = myTokenizer3._index;
        myTokenizer3._index = 0;
        myTokenizer3.pushBack("hi!");
        java.util.Iterator<java.lang.Object> objItor12 = myTokenizer3.asIterator();
        java.lang.IllegalArgumentException illegalArgumentException14 = typeParser1._problem(myTokenizer3, "hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(illegalArgumentException14);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        boolean boolean3 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = 1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        int int7 = myTokenizer1._index;
        myTokenizer1._index = (byte) 0;
        myTokenizer1._index = 35;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        java.lang.Class<?> wildcardClass4 = typeParser3.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        int int14 = myTokenizer12._index;
        java.lang.String str15 = myTokenizer12._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException17 = typeParser10._problem(myTokenizer12, "");
        myTokenizer12._pushbackToken = "hi!";
        int int20 = myTokenizer12._index;
        int int21 = myTokenizer12.countTokens();
        java.lang.String str22 = myTokenizer12._pushbackToken;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 35;
        myTokenizer1._pushbackToken = "hi!";
        myTokenizer1.pushBack("");
        java.lang.String str11 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._pushbackToken = "hi!";
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        java.lang.String str12 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        java.lang.ClassLoader classLoader11 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withClassLoader(classLoader13);
        com.fasterxml.jackson.databind.type.ClassStack classStack15 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass17 = simpleType16.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory12._fromAny(classStack15, (java.lang.reflect.Type) wildcardClass17, typeBindings18);
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory12._unknownType();
        com.fasterxml.jackson.databind.type.ArrayType arrayType21 = typeFactory0.constructArrayType(javaType20);
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray23 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory0.withClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNull(classLoader11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(arrayType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNull(typeModifierArray23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) -1;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        int int8 = myTokenizer1._index;
        int int9 = myTokenizer1.countTokens();
        myTokenizer1.pushBack("");
        myTokenizer1._index = '#';
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap12 = typeFactory11._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap12);
        java.lang.ClassLoader classLoader14 = typeFactory13.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(objLRUMap12);
        org.junit.Assert.assertNull(classLoader14);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1.nextToken("hi!");
        myTokenizer1._pushbackToken = "hi!";
        int int11 = myTokenizer1.countTokens();
        java.lang.String str12 = myTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory1.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) arrayType5);
        typeFactory0.clearCache();
        java.lang.ClassLoader classLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeFactory0.classForName("", true, classLoader10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(arrayType6);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap5 = typeFactory2._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(objLRUMap5);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer5 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer5.asIterator();
        java.lang.String str7 = myTokenizer5.getRemainingInput();
        java.lang.String str8 = myTokenizer5._input;
        int int9 = myTokenizer5._index;
        myTokenizer5.pushBack("");
        java.lang.Class<?> wildcardClass12 = myTokenizer5.getClass();
        java.lang.Class<?> wildcardClass13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory2._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass12, typeBindings14);
        java.lang.ClassLoader classLoader16 = typeFactory2.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = classLoader16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeBindings14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNull(classLoader16);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.lang.String str7 = myTokenizer1.nextToken("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(javaType4);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        java.lang.String str8 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        java.lang.String str14 = myTokenizer12._input;
        java.lang.String str15 = myTokenizer12.getRemainingInput();
        myTokenizer12._pushbackToken = "";
        java.lang.Object obj18 = myTokenizer12.nextElement();
        boolean boolean19 = myTokenizer12.hasMoreTokens();
        java.lang.IllegalArgumentException illegalArgumentException21 = typeParser10._problem(myTokenizer12, "hi!");
        java.lang.String str22 = myTokenizer12.getRemainingInput();
        myTokenizer12._pushbackToken = "";
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(illegalArgumentException21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.lang.String str7 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        java.lang.String str10 = myTokenizer1.nextToken("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) 1;
        myTokenizer1._pushbackToken = "";
        myTokenizer1._pushbackToken = "";
        boolean boolean12 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1.pushBack("");
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        java.lang.String str9 = myTokenizer1.getAllInput();
        java.lang.String str11 = myTokenizer1.nextToken("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "";
        int int7 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = 35;
        java.lang.String str10 = myTokenizer1.nextToken();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        int int14 = myTokenizer12._index;
        java.lang.String str15 = myTokenizer12._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException17 = typeParser10._problem(myTokenizer12, "");
        myTokenizer12._index = (byte) 0;
        myTokenizer12._pushbackToken = "hi!";
        java.lang.Object obj22 = myTokenizer12.nextElement();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "hi!" + "'", obj22, "hi!");
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1.nextToken("");
        java.lang.String str9 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        int int6 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        boolean boolean3 = myTokenizer1.hasMoreElements();
        int int4 = myTokenizer1.countTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        myTokenizer1._pushbackToken = "";
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        java.lang.String str6 = myTokenizer1._pushbackToken;
        int int7 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1.nextToken();
        boolean boolean11 = myTokenizer1.hasMoreElements();
        int int12 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj6 = myTokenizer1.nextElement();
        int int7 = myTokenizer1.countTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        java.lang.String str6 = myTokenizer1.getAllInput();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer5 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer5.asIterator();
        java.lang.String str7 = myTokenizer5._input;
        myTokenizer5.pushBack("hi!");
        boolean boolean10 = myTokenizer5.hasMoreTokens();
        java.lang.IllegalArgumentException illegalArgumentException12 = typeParser3._problem(myTokenizer5, "");
        int int13 = myTokenizer5._index;
        java.util.Iterator<java.lang.Object> objItor14 = myTokenizer5.asIterator();
        java.lang.Object obj15 = myTokenizer5.nextElement();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(illegalArgumentException12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        java.lang.String str6 = myTokenizer1._pushbackToken;
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (byte) 0;
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer5 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer5.asIterator();
        java.lang.String str7 = myTokenizer5._input;
        myTokenizer5.pushBack("hi!");
        boolean boolean10 = myTokenizer5.hasMoreTokens();
        java.lang.IllegalArgumentException illegalArgumentException12 = typeParser3._problem(myTokenizer5, "");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer14 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor15 = myTokenizer14.asIterator();
        java.util.Iterator<java.lang.Object> objItor16 = myTokenizer14.asIterator();
        myTokenizer14.pushBack("");
        java.lang.String str19 = myTokenizer14._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList20 = typeParser3.parseTypes(myTokenizer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class '', problem: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(illegalArgumentException12);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory1.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) arrayType5);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory0.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(arrayType6);
        org.junit.Assert.assertNotNull(javaType8);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        int int9 = myTokenizer1.countTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory2._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap8 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory2.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory10.withModifier(typeModifier11);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(objLRUMap8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._index = (byte) 0;
        java.lang.String str8 = myTokenizer1._input;
        java.lang.Class<?> wildcardClass9 = myTokenizer1.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        boolean boolean10 = myTokenizer1.hasMoreElements();
        myTokenizer1.pushBack("hi!");
        java.lang.String str14 = myTokenizer1.nextToken("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        java.lang.String str7 = myTokenizer1._input;
        java.lang.String str8 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1._index;
        boolean boolean6 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer3.pushBack("");
        java.lang.String str6 = myTokenizer3.nextToken();
        java.lang.String str7 = myTokenizer3._pushbackToken;
        java.lang.String str8 = myTokenizer3.getRemainingInput();
        java.lang.IllegalArgumentException illegalArgumentException10 = typeParser1._problem(myTokenizer3, "");
        myTokenizer3._index = '#';
        boolean boolean13 = myTokenizer3.hasMoreElements();
        boolean boolean14 = myTokenizer3.hasMoreElements();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(illegalArgumentException10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        myTokenizer1.pushBack("");
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor9);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("hi!");
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        myTokenizer1.pushBack("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._index = (byte) 0;
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        int int10 = myTokenizer1._index;
        int int11 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) -1;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1._index;
        myTokenizer1._index = (short) 0;
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str6 = myTokenizer1.nextToken("hi!");
        int int7 = myTokenizer1._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        int int6 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        java.lang.String str9 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        java.lang.String str12 = myTokenizer1.nextToken();
        java.lang.Class<?> wildcardClass13 = myTokenizer1.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.lang.String str7 = myTokenizer1.getAllInput();
        boolean boolean8 = myTokenizer1.hasMoreElements();
        java.lang.String str9 = myTokenizer1.getRemainingInput();
        int int10 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        int int2 = myTokenizer1.countTokens();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        int int5 = myTokenizer1._index;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.lang.String str7 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        myTokenizer1._index = 0;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("");
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory10.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(javaType6);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withCache(objLRUMap7);
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.moreSpecificType(javaType9, javaType11);
        java.lang.Class<?> wildcardClass14 = typeFactory8._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeParser15._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeParser15._factory;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory17);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1._input;
        myTokenizer1._index = (short) 1;
        boolean boolean12 = myTokenizer1.hasMoreElements();
        boolean boolean13 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "";
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        myTokenizer1._index = '4';
        myTokenizer1.pushBack("");
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        java.lang.Object obj11 = myTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withModifier(typeModifier3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = typeFactory4.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        myTokenizer1._index = '4';
        java.lang.String str8 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "";
        java.lang.String str11 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        int int5 = myTokenizer1._index;
        java.lang.String str6 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.lang.String str7 = myTokenizer1.getAllInput();
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        myTokenizer1._index = 0;
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer1.asIterator();
        java.lang.String str15 = myTokenizer1.nextToken("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withCache(objLRUMap7);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory0.withModifier(typeModifier9);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test906");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str7 = myTokenizer1.nextToken("");
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test907");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        boolean boolean4 = myTokenizer1.hasMoreTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.lang.String str7 = myTokenizer1.nextToken();
        java.lang.String str8 = myTokenizer1.getAllInput();
        boolean boolean9 = myTokenizer1.hasMoreElements();
        java.lang.String str10 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test908");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test909");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        java.lang.ClassLoader classLoader11 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withClassLoader(classLoader13);
        com.fasterxml.jackson.databind.type.ClassStack classStack15 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass17 = simpleType16.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory12._fromAny(classStack15, (java.lang.reflect.Type) wildcardClass17, typeBindings18);
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory12._unknownType();
        com.fasterxml.jackson.databind.type.ArrayType arrayType21 = typeFactory0.constructArrayType(javaType20);
        com.fasterxml.jackson.databind.type.TypeParser typeParser22 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        java.lang.ClassLoader classLoader23 = typeFactory0._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNull(classLoader11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(typeBindings18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(arrayType21);
        org.junit.Assert.assertNull(classLoader23);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test910");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = '#';
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1.getAllInput();
        boolean boolean11 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = 35;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test911");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        java.lang.String str9 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        java.lang.String str12 = myTokenizer1.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test912");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        java.lang.String str6 = myTokenizer1._input;
        boolean boolean7 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test913");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = typeFactory11._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap13 = typeFactory11._typeCache;
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory11.withClassLoader(classLoader14);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNull(typeModifierArray12);
        org.junit.Assert.assertNotNull(objLRUMap13);
        org.junit.Assert.assertNotNull(typeFactory15);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test914");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.lang.String str7 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test915");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) -1;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        int int8 = myTokenizer1._index;
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test916");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        int int14 = myTokenizer12._index;
        java.lang.String str15 = myTokenizer12._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException17 = typeParser10._problem(myTokenizer12, "");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeParser10._factory;
        java.lang.Class<?> wildcardClass20 = typeFactory18._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNull(wildcardClass20);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test917");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        java.lang.ClassLoader classLoader11 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader12 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeParser13._factory;
        java.lang.ClassLoader classLoader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = typeFactory14.classForName("hi!", true, classLoader17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNull(classLoader11);
        org.junit.Assert.assertNull(classLoader12);
        org.junit.Assert.assertNotNull(typeFactory14);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test918");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        int int7 = myTokenizer1.countTokens();
        myTokenizer1._index = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test919");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._pushbackToken = "hi!";
        int int7 = myTokenizer1._index;
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1.getAllInput();
        java.lang.String str10 = myTokenizer1.nextToken();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(objItor11);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test920");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory0.withModifier(typeModifier10);
        java.lang.ClassLoader classLoader12 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType18 = typeFactory14.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType17);
        com.fasterxml.jackson.databind.type.ArrayType arrayType19 = typeFactory13.constructArrayType((com.fasterxml.jackson.databind.JavaType) arrayType18);
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) arrayType19, javaType20);
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser23 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNull(classLoader12);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertNotNull(arrayType18);
        org.junit.Assert.assertNotNull(arrayType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType22);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test921");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        java.lang.String str14 = myTokenizer12._input;
        java.lang.String str15 = myTokenizer12.getRemainingInput();
        myTokenizer12._pushbackToken = "";
        java.lang.Object obj18 = myTokenizer12.nextElement();
        boolean boolean19 = myTokenizer12.hasMoreTokens();
        java.lang.IllegalArgumentException illegalArgumentException21 = typeParser10._problem(myTokenizer12, "hi!");
        java.lang.String str22 = myTokenizer12._pushbackToken;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(illegalArgumentException21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test922");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        myTokenizer1.pushBack("");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test923");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test924");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._input;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        java.lang.String str8 = myTokenizer1._input;
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test925");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = '#';
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1.nextToken();
        myTokenizer1._index = 0;
        java.lang.String str13 = myTokenizer1._pushbackToken;
        java.lang.String str14 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test926");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        int int3 = myTokenizer1._index;
        boolean boolean4 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test927");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = typeFactory2.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory2.withClassLoader(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test928");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap12 = typeFactory11._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap12);
        typeFactory13.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(objLRUMap12);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test929");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) 1;
        myTokenizer1._pushbackToken = "";
        java.lang.String str11 = myTokenizer1.nextToken("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test930");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        java.lang.String str6 = myTokenizer1._input;
        myTokenizer1.pushBack("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test931");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        myTokenizer1._index = 35;
        java.lang.String str7 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test932");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = (byte) -1;
        java.lang.String str11 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("hi!");
        int int14 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test933");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.lang.String str7 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1.nextToken("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test934");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        int int5 = myTokenizer1._index;
        boolean boolean6 = myTokenizer1.hasMoreElements();
        java.lang.Class<?> wildcardClass7 = myTokenizer1.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test935");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        java.lang.String str9 = myTokenizer1.nextToken("");
        myTokenizer1._index = (short) 10;
        myTokenizer1._index = ' ';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test936");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        int int7 = myTokenizer1.countTokens();
        myTokenizer1._index = 0;
        myTokenizer1._pushbackToken = "";
        java.lang.String str12 = myTokenizer1.getAllInput();
        int int13 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) -1;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test937");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 'a';
        int int7 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test938");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        int int3 = myTokenizer1._index;
        boolean boolean4 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test939");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory5.withClassLoader(classLoader6);
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeParser4.withFactory(typeFactory5);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeParser8._factory;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeFactory9);
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test940");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getAllInput();
        int int7 = myTokenizer1._index;
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test941");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        myTokenizer1._index = (byte) 1;
        myTokenizer1._index = 'a';
        boolean boolean11 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test942");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        int int14 = myTokenizer12._index;
        java.lang.String str15 = myTokenizer12._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException17 = typeParser10._problem(myTokenizer12, "");
        int int18 = myTokenizer12.countTokens();
        java.lang.String str19 = myTokenizer12.getRemainingInput();
        myTokenizer12._pushbackToken = "hi!";
        java.util.Iterator<java.lang.Object> objItor22 = myTokenizer12.asIterator();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(objItor22);
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test943");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withModifier(typeModifier3);
        java.lang.ClassLoader classLoader5 = typeFactory4.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test944");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        myTokenizer1.pushBack("hi!");
        java.lang.Object obj8 = myTokenizer1.nextElement();
        myTokenizer1._index = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test945");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj6 = myTokenizer1.nextElement();
        myTokenizer1._index = 'a';
        int int9 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) -1;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test946");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory6._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test947");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test948");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory6._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7);
        java.lang.Class<?> wildcardClass9 = typeFactory8.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test949");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = (short) 100;
        myTokenizer1.pushBack("");
        int int11 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test950");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        myTokenizer1.pushBack("");
        boolean boolean13 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test951");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        boolean boolean4 = myTokenizer1.hasMoreTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str9 = myTokenizer1.nextToken("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test952");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._pushbackToken = "hi!";
        int int10 = myTokenizer1._index;
        java.lang.String str12 = myTokenizer1.nextToken("");
        int int13 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test953");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.lang.String str7 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test954");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        int int14 = myTokenizer12._index;
        java.lang.String str15 = myTokenizer12._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException17 = typeParser10._problem(myTokenizer12, "");
        int int18 = myTokenizer12.countTokens();
        myTokenizer12.pushBack("hi!");
        myTokenizer12._pushbackToken = "hi!";
        myTokenizer12.pushBack("hi!");
        int int25 = myTokenizer12.countTokens();
        myTokenizer12._index = (byte) 1;
        java.lang.String str28 = myTokenizer12._pushbackToken;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test955");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        myTokenizer1._index = (byte) 1;
        java.lang.String str9 = myTokenizer1._pushbackToken;
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objItor11);
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test956");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        boolean boolean8 = myTokenizer1.hasMoreElements();
        int int9 = myTokenizer1.countTokens();
        java.lang.String str10 = myTokenizer1.getRemainingInput();
        java.lang.String str11 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test957");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withCache(objLRUMap7);
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.moreSpecificType(javaType9, javaType11);
        java.lang.Class<?> wildcardClass14 = typeFactory8._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser17 = typeParser15.withFactory(typeFactory16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeParser17._factory;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeParser17);
        org.junit.Assert.assertNull(typeFactory18);
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test958");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) 1;
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = 100;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test959");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("");
        java.lang.String str6 = myTokenizer1.nextToken();
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test960");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        myTokenizer1._index = 35;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test961");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("");
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        java.lang.String str8 = myTokenizer1.nextToken("hi!");
        java.lang.String str9 = myTokenizer1._input;
        myTokenizer1._index = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test962");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory11._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(javaType12);
    }

    @Test
    public void test963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test963");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.ClassLoader classLoader8 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        int int14 = myTokenizer12._index;
        java.lang.String str15 = myTokenizer12._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException17 = typeParser10._problem(myTokenizer12, "");
        java.lang.String str18 = myTokenizer12._input;
        boolean boolean19 = myTokenizer12.hasMoreTokens();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test964");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test965");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("");
        myTokenizer1._pushbackToken = "";
        boolean boolean8 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (-1);
        myTokenizer1._index = '4';
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test966");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0.constructType((java.lang.reflect.Type) simpleType8);
        java.lang.ClassLoader classLoader10 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        java.lang.Class<?> wildcardClass13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.ClassStack classStack17 = null;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer19 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor20 = myTokenizer19.asIterator();
        java.lang.String str21 = myTokenizer19.getRemainingInput();
        java.lang.String str22 = myTokenizer19._input;
        int int23 = myTokenizer19._index;
        myTokenizer19.pushBack("");
        java.lang.Class<?> wildcardClass26 = myTokenizer19.getClass();
        java.lang.Class<?> wildcardClass27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass26);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings28 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory16._fromAny(classStack17, (java.lang.reflect.Type) wildcardClass26, typeBindings28);
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass13, typeBindings28);
        java.lang.Class<?> wildcardClass31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType30);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(objItor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(typeBindings28);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test967");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "hi!";
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.lang.String str7 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test968");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        int int7 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }
}

