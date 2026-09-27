package com.fasterxml.jackson.databind.type;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        org.junit.Assert.assertNotNull(simpleType0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier2 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier2 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0, typeParser1, typeModifierArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeModifierArray3);
        org.junit.Assert.assertArrayEquals(typeModifierArray3, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        org.junit.Assert.assertNotNull(simpleType0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        org.junit.Assert.assertNotNull(simpleType0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType4 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType3);
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory0.classForName("hi!", false, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(arrayType4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.reflect.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        typeFactory0.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = typeFactory0.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.ClassStack classStack1 = null;
        java.lang.reflect.WildcardType wildcardType2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.ClassStack classStack6 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass8 = simpleType7.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3._fromAny(classStack6, (java.lang.reflect.Type) wildcardClass8, typeBindings9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory0._fromWildcard(classStack1, wildcardType2, typeBindings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(typeBindings9);
        org.junit.Assert.assertNotNull(javaType10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        org.junit.Assert.assertNotNull(simpleType0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer6 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer6.asIterator();
        java.lang.String str8 = myTokenizer6.getRemainingInput();
        java.lang.String str9 = myTokenizer6._input;
        java.lang.String str10 = myTokenizer6.getAllInput();
        java.lang.String str11 = myTokenizer6.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeParser3.findClass("hi!", myTokenizer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        typeFactory0.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = typeFactory0.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = typeFactory2.getClassLoader();
        java.lang.ClassLoader classLoader4 = typeFactory2.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNull(classLoader4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeParser10.parse("");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
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
        java.lang.ClassLoader classLoader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = typeFactory0.classForName("", false, classLoader13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
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
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        myTokenizer1._index = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        int int6 = myTokenizer1._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = typeModifierArray3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = typeFactory0.classForName("hi!", false, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = typeFactory0.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
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
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1._index;
        myTokenizer1._index = (short) 0;
        myTokenizer1.pushBack("");
        java.lang.Class<?> wildcardClass9 = myTokenizer1.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType2 = typeFactory0.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory1.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) arrayType5);
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) arrayType6);
        java.lang.Class<?> wildcardClass8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass7);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(arrayType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeFactory0.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
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
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = typeFactory0.classForName("", true, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
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
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withClassLoader(classLoader19);
        com.fasterxml.jackson.databind.type.ClassStack classStack21 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass23 = simpleType22.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings24 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType25 = typeFactory18._fromAny(classStack21, (java.lang.reflect.Type) wildcardClass23, typeBindings24);
        java.lang.ClassLoader classLoader26 = typeFactory18._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap27 = typeFactory18._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory18);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer30 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor31 = myTokenizer30.asIterator();
        int int32 = myTokenizer30._index;
        java.lang.String str33 = myTokenizer30._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException35 = typeParser28._problem(myTokenizer30, "");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType36 = typeParser10.parseType(myTokenizer30);
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
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(typeBindings24);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNull(classLoader26);
        org.junit.Assert.assertNotNull(objLRUMap27);
        org.junit.Assert.assertNotNull(objItor31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(illegalArgumentException35);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType3 = typeParser1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = typeParser10.parse("hi!");
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
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
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
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer13 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor14 = myTokenizer13.asIterator();
        java.lang.String str15 = myTokenizer13._input;
        myTokenizer13.pushBack("hi!");
        myTokenizer13._index = (byte) 10;
        int int20 = myTokenizer13._index;
        myTokenizer13._index = (short) 100;
        java.lang.String str23 = myTokenizer13._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList24 = typeParser10.parseTypes(myTokenizer13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory1.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) arrayType5);
        typeFactory0.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = typeFactory0.classForName("");
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
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
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer14 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer14._pushbackToken = "";
        int int17 = myTokenizer14._index;
        java.lang.String str18 = myTokenizer14.getAllInput();
        java.lang.IllegalArgumentException illegalArgumentException20 = typeParser12._problem(myTokenizer14, "");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer22 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor23 = myTokenizer22.asIterator();
        boolean boolean24 = myTokenizer22.hasMoreTokens();
        java.lang.String str25 = myTokenizer22.getRemainingInput();
        int int26 = myTokenizer22.countTokens();
        boolean boolean27 = myTokenizer22.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType28 = typeParser12.parseType(myTokenizer22);
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
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(illegalArgumentException20);
        org.junit.Assert.assertNotNull(objItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer3._pushbackToken = "";
        int int6 = myTokenizer3._index;
        java.lang.String str7 = myTokenizer3.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList8 = typeParser1.parseTypes(myTokenizer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        java.lang.Class<?> wildcardClass8 = myTokenizer1.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        java.lang.String str5 = myTokenizer1._pushbackToken;
        boolean boolean6 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = typeParser12.parse("hi!");
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
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = typeFactory2.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
        java.lang.ClassLoader classLoader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = typeFactory0.classForName("hi!", false, classLoader14);
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
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        java.lang.String str5 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
        java.lang.String str21 = myTokenizer19._input;
        myTokenizer19.pushBack("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType24 = typeParser10.parseType(myTokenizer19);
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
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        int int2 = myTokenizer1._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        boolean boolean8 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        java.lang.Class<?> wildcardClass6 = myTokenizer1.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        int int5 = myTokenizer1._index;
        java.lang.String str6 = myTokenizer1._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1._index;
        int int6 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("hi!");
        java.lang.String str8 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer5 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer5.asIterator();
        java.lang.String str7 = myTokenizer5.getRemainingInput();
        java.lang.String str8 = myTokenizer5._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer5.asIterator();
        myTokenizer5._pushbackToken = "";
        myTokenizer5.pushBack("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = typeParser3.parseType(myTokenizer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(objItor9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1.getRemainingInput();
        myTokenizer1.pushBack("hi!");
        boolean boolean8 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
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
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = typeFactory11.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        java.lang.Class<?> wildcardClass1 = simpleType0.getClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (byte) 0;
        myTokenizer1._pushbackToken = "";
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objItor10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj4 = myTokenizer1.nextElement();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        myTokenizer1._index = '4';
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer3.pushBack("");
        java.lang.String str6 = myTokenizer3.nextToken();
        java.lang.String str7 = myTokenizer3._pushbackToken;
        java.lang.String str8 = myTokenizer3.getRemainingInput();
        java.lang.IllegalArgumentException illegalArgumentException10 = typeParser1._problem(myTokenizer3, "");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer12.asIterator();
        boolean boolean14 = myTokenizer12.hasMoreTokens();
        java.lang.String str15 = myTokenizer12.getRemainingInput();
        int int16 = myTokenizer12.countTokens();
        boolean boolean17 = myTokenizer12.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeParser1.parseType(myTokenizer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(illegalArgumentException10);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        java.lang.String str11 = myTokenizer1.nextToken();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        myTokenizer1._index = 0;
        myTokenizer1._index = (byte) 100;
        boolean boolean15 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType4 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType3);
        java.lang.Class<?> wildcardClass5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) arrayType4);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(arrayType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        myTokenizer1._index = 100;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory11.constructFromCanonical("");
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
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = typeFactory2.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        java.lang.String str11 = myTokenizer1._pushbackToken;
        boolean boolean12 = myTokenizer1.hasMoreTokens();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("hi!");
        boolean boolean12 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        myTokenizer1._index = (byte) 1;
        myTokenizer1._index = 'a';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (byte) 1;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) 1;
        myTokenizer1._pushbackToken = "";
        myTokenizer1._pushbackToken = "";
        java.lang.String str12 = myTokenizer1._input;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
        java.lang.Class<?> wildcardClass13 = typeParser12.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray2 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0, typeParser1, typeModifierArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeModifierArray2);
        org.junit.Assert.assertArrayEquals(typeModifierArray2, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
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
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.IllegalArgumentException illegalArgumentException15 = typeParser12._problem(myTokenizer13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory0._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = typeFactory0.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        int int3 = myTokenizer1._index;
        myTokenizer1._index = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        java.lang.String str6 = myTokenizer1._input;
        myTokenizer1._index = '#';
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        java.lang.reflect.WildcardType wildcardType8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory9.withClassLoader(classLoader10);
        com.fasterxml.jackson.databind.type.ClassStack classStack12 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass14 = simpleType13.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings15 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory9._fromAny(classStack12, (java.lang.reflect.Type) wildcardClass14, typeBindings15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory2._fromWildcard(classStack7, wildcardType8, typeBindings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(typeBindings15);
        org.junit.Assert.assertNotNull(javaType16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        java.lang.String str8 = myTokenizer1.getAllInput();
        myTokenizer1._index = 10;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = typeFactory8.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
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
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        int int7 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        int int6 = myTokenizer1._index;
        java.lang.Object obj7 = myTokenizer1.nextElement();
        myTokenizer1._pushbackToken = "";
        int int10 = myTokenizer1._index;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1._index;
        myTokenizer1._index = (short) 0;
        myTokenizer1.pushBack("");
        java.lang.String str9 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 'a';
        java.lang.String str7 = myTokenizer1._pushbackToken;
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = myTokenizer12.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
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
        typeFactory0.clearCache();
        java.lang.Class<?> wildcardClass24 = typeFactory0._findPrimitive("hi!");
        java.lang.ClassLoader classLoader25 = typeFactory0._classLoader;
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
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNull(classLoader25);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        int int6 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str9 = myTokenizer1.getRemainingInput();
        myTokenizer1.pushBack("");
        boolean boolean12 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        java.lang.String str7 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        myTokenizer1._index = 0;
        myTokenizer1._index = (byte) 100;
        java.lang.Object obj15 = myTokenizer1.nextElement();
        boolean boolean16 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) -1;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
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
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory2._modifiers;
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
        org.junit.Assert.assertNull(typeModifierArray16);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = '4';
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1.getAllInput();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = myTokenizer12.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
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
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
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
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._unknownType();
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
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("hi!");
        java.lang.String str12 = myTokenizer1.nextToken();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass8 = typeFactory6._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        java.lang.String str9 = myTokenizer1.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        java.lang.String str7 = myTokenizer1.getAllInput();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        int int6 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str8 = myTokenizer1.getAllInput();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
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
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer17 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer17._pushbackToken = "";
        int int20 = myTokenizer17._index;
        java.lang.String str21 = myTokenizer17.nextToken();
        myTokenizer17._index = (short) 1;
        myTokenizer17._pushbackToken = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = typeParser11.findClass("", myTokenizer17);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
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
        java.lang.String str13 = myTokenizer5.getAllInput();
        java.lang.String str14 = myTokenizer5._input;
        int int15 = myTokenizer5._index;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(illegalArgumentException12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        int int7 = myTokenizer1._index;
        boolean boolean8 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = '#';
        java.lang.String str9 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(objItor10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        java.lang.String str8 = myTokenizer1.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1._index = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
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
        java.lang.Class<?> wildcardClass22 = arrayType21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        boolean boolean2 = myTokenizer1.hasMoreElements();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
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
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = typeFactory0._parser;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = typeParser12.parse("hi!");
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
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser12);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1._input;
        myTokenizer1._index = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = myTokenizer1.getRemainingInput();
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
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        java.lang.reflect.GenericArrayType genericArrayType4 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory2._fromArrayType(classStack3, genericArrayType4, typeBindings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeBindings5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        java.lang.String str7 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
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
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer14 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer14._pushbackToken = "";
        int int17 = myTokenizer14._index;
        java.lang.String str18 = myTokenizer14.getAllInput();
        java.lang.IllegalArgumentException illegalArgumentException20 = typeParser12._problem(myTokenizer14, "");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer22 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor23 = myTokenizer22.asIterator();
        java.lang.String str24 = myTokenizer22._input;
        myTokenizer22.pushBack("hi!");
        myTokenizer22._index = (byte) 10;
        int int29 = myTokenizer22._index;
        myTokenizer22._index = (short) 100;
        myTokenizer22._index = 0;
        myTokenizer22._index = (byte) 100;
        java.lang.Object obj36 = myTokenizer22.nextElement();
        java.util.Iterator<java.lang.Object> objItor37 = myTokenizer22.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.IllegalArgumentException illegalArgumentException39 = typeParser12._problem(myTokenizer22, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(illegalArgumentException20);
        org.junit.Assert.assertNotNull(objItor23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "hi!" + "'", obj36, "hi!");
        org.junit.Assert.assertNotNull(objItor37);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._input;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "hi!";
        java.lang.Class<?> wildcardClass8 = myTokenizer1.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.lang.String str7 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) -1;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        int int8 = myTokenizer1._index;
        int int9 = myTokenizer1.countTokens();
        java.lang.String str10 = myTokenizer1._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeParser3.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("hi!");
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer4 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer4.asIterator();
        java.lang.String str6 = myTokenizer4._input;
        java.lang.String str7 = myTokenizer4.getRemainingInput();
        myTokenizer4._pushbackToken = "";
        int int10 = myTokenizer4.countTokens();
        java.lang.String str11 = myTokenizer4._input;
        java.lang.String str12 = myTokenizer4.nextToken();
        boolean boolean13 = myTokenizer4.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = typeParser1.findClass("", myTokenizer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class '', problem: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj4 = myTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertNotNull(objItor5);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1.getAllInput();
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        int int6 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1.nextToken("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        java.lang.String str6 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        java.lang.String str11 = myTokenizer1._pushbackToken;
        java.lang.String str12 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        java.lang.String str8 = myTokenizer1.getAllInput();
        myTokenizer1._index = '#';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._pushbackToken = "";
        java.lang.String str8 = myTokenizer1.nextToken();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
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
        typeFactory16.clearCache();
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
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = typeFactory8.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(javaType11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.lang.Class<?> wildcardClass7 = myTokenizer1.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
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
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer17 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor18 = myTokenizer17.asIterator();
        boolean boolean19 = myTokenizer17.hasMoreTokens();
        int int20 = myTokenizer17._index;
        boolean boolean21 = myTokenizer17.hasMoreTokens();
        boolean boolean22 = myTokenizer17.hasMoreTokens();
        boolean boolean23 = myTokenizer17.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = typeParser11.findClass("", myTokenizer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class '', problem: ");
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
        org.junit.Assert.assertNotNull(objItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
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
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer14 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor15 = myTokenizer14.asIterator();
        java.lang.String str16 = myTokenizer14.getRemainingInput();
        java.lang.String str17 = myTokenizer14._input;
        java.lang.String str18 = myTokenizer14.getAllInput();
        myTokenizer14.pushBack("hi!");
        boolean boolean21 = myTokenizer14.hasMoreTokens();
        int int22 = myTokenizer14.countTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList23 = typeParser12.parseTypes(myTokenizer14);
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
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser12);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer3.pushBack("");
        java.lang.String str6 = myTokenizer3.nextToken();
        java.lang.String str7 = myTokenizer3._pushbackToken;
        java.lang.String str8 = myTokenizer3.getRemainingInput();
        java.lang.IllegalArgumentException illegalArgumentException10 = typeParser1._problem(myTokenizer3, "");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer13 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor14 = myTokenizer13.asIterator();
        java.lang.String str15 = myTokenizer13._input;
        myTokenizer13.pushBack("hi!");
        myTokenizer13._index = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = typeParser1.findClass("hi!", myTokenizer13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(illegalArgumentException10);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        int int6 = myTokenizer1._index;
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str10 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._index = (byte) 0;
        myTokenizer1.pushBack("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory0._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = typeFactory0.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.Class<?> wildcardClass5 = myTokenizer1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
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
        boolean boolean18 = myTokenizer16.hasMoreTokens();
        java.lang.String str19 = myTokenizer16.getRemainingInput();
        int int20 = myTokenizer16.countTokens();
        myTokenizer16._pushbackToken = "";
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType23 = typeParser11.parseType(myTokenizer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class '', problem: ");
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
        org.junit.Assert.assertNotNull(objItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        int int5 = myTokenizer1._index;
        java.lang.String str6 = myTokenizer1._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
        java.lang.String str19 = myTokenizer12._pushbackToken;
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
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer3.pushBack("");
        java.lang.String str6 = myTokenizer3.nextToken();
        java.lang.String str7 = myTokenizer3._pushbackToken;
        myTokenizer3._index = '4';
        myTokenizer3.pushBack("");
        int int12 = myTokenizer3._index;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList13 = typeParser1.parseTypes(myTokenizer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory0.constructFromCanonical("");
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
        org.junit.Assert.assertNull(classLoader11);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        myTokenizer1._index = 0;
        java.lang.String str13 = myTokenizer1.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = '#';
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1.nextToken();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
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
            java.lang.Class<?> wildcardClass11 = typeFactory0.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        boolean boolean4 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
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
        java.lang.ClassLoader classLoader17 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withClassLoader(classLoader19);
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType22 = typeFactory18.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory2.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
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
        org.junit.Assert.assertNull(classLoader17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(arrayType22);
        org.junit.Assert.assertNotNull(arrayType23);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = myTokenizer1.nextElement();
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
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        java.lang.String str6 = myTokenizer1.getAllInput();
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        java.lang.String str6 = myTokenizer1.getAllInput();
        boolean boolean7 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.Class<?> wildcardClass6 = objItor5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory2._typeCache;
        typeFactory2.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        myTokenizer1._pushbackToken = "hi!";
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        myTokenizer1._index = (short) 100;
        java.lang.String str10 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
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
        typeFactory12.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory12._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(javaType15);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) 1;
        myTokenizer1._index = (-1);
        myTokenizer1.pushBack("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        java.lang.String str8 = myTokenizer1.nextToken();
        myTokenizer1._index = 100;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
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
        java.lang.Class<?> wildcardClass12 = typeFactory0._findPrimitive("");
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNotNull(javaType13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        boolean boolean11 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer3.pushBack("");
        java.lang.String str6 = myTokenizer3.nextToken();
        java.lang.String str7 = myTokenizer3._pushbackToken;
        java.lang.String str8 = myTokenizer3.getRemainingInput();
        java.lang.IllegalArgumentException illegalArgumentException10 = typeParser1._problem(myTokenizer3, "");
        myTokenizer3._index = '#';
        java.lang.String str13 = myTokenizer3.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = myTokenizer3.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(illegalArgumentException10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.lang.Class<?> wildcardClass7 = myTokenizer1.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory11.constructFromCanonical("hi!");
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
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getAllInput();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        int int7 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        java.lang.String str9 = myTokenizer1.getAllInput();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        myTokenizer1._index = (short) 100;
        java.lang.String str10 = myTokenizer1._pushbackToken;
        java.lang.String str12 = myTokenizer1.nextToken("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        int int6 = myTokenizer1._index;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(objItor9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1._index;
        myTokenizer1._index = (short) 0;
        myTokenizer1.pushBack("");
        int int9 = myTokenizer1.countTokens();
        java.lang.String str10 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        myTokenizer1._index = 0;
        java.lang.String str13 = myTokenizer1.nextToken();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) -1;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        int int8 = myTokenizer1._index;
        int int9 = myTokenizer1.countTokens();
        myTokenizer1.pushBack("");
        java.lang.Class<?> wildcardClass12 = myTokenizer1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
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
        java.lang.Class<?> wildcardClass12 = typeFactory0._findPrimitive("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory0.constructFromCanonical("");
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
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNull(wildcardClass12);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._unknownType();
        java.lang.Class<?> wildcardClass9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType8);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1._input;
        myTokenizer1.pushBack("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        java.lang.String str9 = myTokenizer1.nextToken("");
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
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
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer15 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor16 = myTokenizer15.asIterator();
        boolean boolean17 = myTokenizer15.hasMoreTokens();
        java.lang.String str18 = myTokenizer15.getRemainingInput();
        int int19 = myTokenizer15.countTokens();
        myTokenizer15._pushbackToken = "";
        java.lang.String str22 = myTokenizer15.getRemainingInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = typeParser3.findClass("", myTokenizer15);
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
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
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
        java.lang.Class<?> wildcardClass14 = typeFactory0._findPrimitive("hi!");
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
        org.junit.Assert.assertNull(wildcardClass14);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory11.constructFromCanonical("");
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
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(objLRUMap12);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeFactory0.classForName("hi!");
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
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.lang.String str5 = myTokenizer1.getRemainingInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory1.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) arrayType5);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory0.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._input;
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        java.lang.String str9 = myTokenizer1.getAllInput();
        java.lang.String str10 = myTokenizer1._input;
        java.lang.String str11 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) 0;
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        myTokenizer1._index = (short) 1;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1.getRemainingInput();
        myTokenizer1.pushBack("");
        myTokenizer1.pushBack("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        java.lang.String str12 = myTokenizer1.nextToken("");
        boolean boolean13 = myTokenizer1.hasMoreTokens();
        java.lang.String str14 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        boolean boolean4 = myTokenizer1.hasMoreTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        myTokenizer1._index = (short) 0;
        myTokenizer1._index = ' ';
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
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
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap13 = typeFactory11._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(objLRUMap13);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory6.classForName("", true, classLoader9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        boolean boolean8 = myTokenizer1.hasMoreElements();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        int int6 = myTokenizer1._index;
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str10 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1._index;
        myTokenizer1._index = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.Class<?> wildcardClass8 = myTokenizer1.getClass();
        java.lang.Class<?> wildcardClass9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass8);
        java.lang.Class<?> wildcardClass11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass8);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
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
        java.lang.String str13 = myTokenizer5.getRemainingInput();
        int int14 = myTokenizer5._index;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(illegalArgumentException12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        int int6 = myTokenizer1._index;
        java.lang.Object obj7 = myTokenizer1.nextElement();
        myTokenizer1._index = (byte) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = typeFactory0.classForName("hi!", false, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        java.lang.String str5 = myTokenizer1._pushbackToken;
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        int int7 = myTokenizer1.countTokens();
        int int8 = myTokenizer1._index;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 'a';
        int int7 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) -1;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        int int8 = myTokenizer1._index;
        int int9 = myTokenizer1.countTokens();
        int int10 = myTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str7 = myTokenizer1.nextToken("hi!");
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = myTokenizer3.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(illegalArgumentException10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        myTokenizer1._index = (short) 1;
        java.lang.String str7 = myTokenizer1._input;
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        int int6 = myTokenizer1._index;
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        java.lang.String str9 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        java.lang.String str5 = myTokenizer1._pushbackToken;
        boolean boolean6 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
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
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory12);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer15 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer15.pushBack("");
        java.lang.String str18 = myTokenizer15.nextToken();
        java.lang.String str19 = myTokenizer15._pushbackToken;
        java.lang.String str20 = myTokenizer15.getRemainingInput();
        java.lang.IllegalArgumentException illegalArgumentException22 = typeParser13._problem(myTokenizer15, "");
        myTokenizer15._index = '#';
        java.lang.String str25 = myTokenizer15.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType26 = typeParser10.parseType(myTokenizer15);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(illegalArgumentException22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 'a';
        java.lang.String str7 = myTokenizer1._pushbackToken;
        java.lang.String str8 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = 'a';
        java.lang.String str14 = myTokenizer1.getAllInput();
        myTokenizer1._index = (short) 1;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = '#';
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1.nextToken();
        myTokenizer1._index = 0;
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        int int6 = myTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str7 = myTokenizer1._input;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory5._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(typeModifierArray6);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        int int6 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        int int8 = myTokenizer1.countTokens();
        myTokenizer1._index = (byte) 0;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        myTokenizer1._index = 0;
        myTokenizer1._index = (byte) 100;
        java.lang.Object obj15 = myTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor16 = myTokenizer1.asIterator();
        myTokenizer1._index = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertNotNull(objItor16);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        int int3 = myTokenizer1._index;
        myTokenizer1._index = (byte) -1;
        int int6 = myTokenizer1._index;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        java.lang.String str7 = myTokenizer1.nextToken();
        java.lang.String str8 = myTokenizer1.getAllInput();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        int int6 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str9 = myTokenizer1.getRemainingInput();
        java.lang.Object obj10 = myTokenizer1.nextElement();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        int int7 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1._input;
        java.lang.String str9 = myTokenizer1.nextToken();
        boolean boolean10 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
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
        java.lang.String str18 = myTokenizer16.getRemainingInput();
        java.lang.String str19 = myTokenizer16._input;
        int int20 = myTokenizer16._index;
        myTokenizer16.pushBack("");
        int int23 = myTokenizer16.countTokens();
        java.lang.IllegalArgumentException illegalArgumentException25 = typeParser11._problem(myTokenizer16, "hi!");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer27 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor28 = myTokenizer27.asIterator();
        java.lang.String str29 = myTokenizer27._input;
        java.lang.String str30 = myTokenizer27.getRemainingInput();
        myTokenizer27._pushbackToken = "";
        java.lang.Object obj33 = myTokenizer27.nextElement();
        java.util.Iterator<java.lang.Object> objItor34 = myTokenizer27.asIterator();
        java.lang.String str35 = myTokenizer27._input;
        int int36 = myTokenizer27._index;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList37 = typeParser11.parseTypes(myTokenizer27);
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
        org.junit.Assert.assertNotNull(objItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(illegalArgumentException25);
        org.junit.Assert.assertNotNull(objItor28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertNotNull(objItor34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "";
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = 'a';
        java.lang.String str14 = myTokenizer1.getAllInput();
        java.lang.String str15 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) 1;
        myTokenizer1._index = (-1);
        myTokenizer1.pushBack("hi!");
        java.lang.Object obj13 = myTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        int int7 = myTokenizer1._index;
        myTokenizer1._index = (byte) 0;
        int int10 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) -1;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        int int8 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        java.lang.String str7 = myTokenizer1.nextToken();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        myTokenizer1._pushbackToken = "";
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        java.lang.Object obj9 = myTokenizer1.nextElement();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("");
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        java.lang.String str8 = myTokenizer1.nextToken("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.String str7 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("hi!");
        java.lang.String str8 = myTokenizer1._pushbackToken;
        boolean boolean9 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        int int7 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1._input;
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        int int8 = myTokenizer1._index;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType5 = typeFactory1.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType4);
        com.fasterxml.jackson.databind.type.ArrayType arrayType6 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) arrayType5);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray8 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader9 = typeFactory0._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(arrayType5);
        org.junit.Assert.assertNotNull(arrayType6);
        org.junit.Assert.assertNull(typeModifierArray8);
        org.junit.Assert.assertNull(classLoader9);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        myTokenizer1._index = '4';
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1._input;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 35;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
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
        myTokenizer3._index = 35;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(illegalArgumentException10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1.nextToken("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        int int7 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 35;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        int int6 = myTokenizer1._index;
        java.lang.Object obj7 = myTokenizer1.nextElement();
        int int8 = myTokenizer1._index;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        boolean boolean7 = myTokenizer1.hasMoreElements();
        java.lang.String str8 = myTokenizer1._pushbackToken;
        java.lang.String str9 = myTokenizer1.getAllInput();
        boolean boolean10 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj9 = myTokenizer1.nextElement();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = (byte) 0;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        int int8 = myTokenizer1.countTokens();
        java.lang.String str9 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        java.lang.String str5 = myTokenizer1._pushbackToken;
        boolean boolean6 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor5);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.lang.String str7 = myTokenizer1.getAllInput();
        boolean boolean8 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        int int7 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        int int6 = myTokenizer1._index;
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        int int6 = myTokenizer1._index;
        int int7 = myTokenizer1.countTokens();
        myTokenizer1.pushBack("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.lang.String str5 = myTokenizer1.getRemainingInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
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
        myTokenizer10.pushBack("hi!");
        boolean boolean15 = myTokenizer10.hasMoreTokens();
        int int16 = myTokenizer10._index;
        java.lang.Object obj17 = myTokenizer10.nextElement();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeParser8.parseType(myTokenizer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken("");
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
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = typeFactory2.getClassLoader();
        java.lang.ClassLoader classLoader4 = typeFactory2._classLoader;
        typeFactory2.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNull(classLoader4);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        java.lang.String str8 = myTokenizer1.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str7 = myTokenizer1.nextToken("hi!");
        java.lang.String str8 = myTokenizer1.getAllInput();
        myTokenizer1._index = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
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
        boolean boolean15 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        int int6 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        myTokenizer1._index = (byte) 0;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
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
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer17 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer17.pushBack("");
        java.lang.String str20 = myTokenizer17.nextToken();
        myTokenizer17._index = (short) -1;
        boolean boolean23 = myTokenizer17.hasMoreTokens();
        int int24 = myTokenizer17._index;
        int int25 = myTokenizer17.countTokens();
        myTokenizer17.pushBack("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType28 = typeParser15.parseType(myTokenizer17);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        boolean boolean7 = myTokenizer1.hasMoreElements();
        java.lang.Object obj8 = myTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getAllInput();
        myTokenizer1._index = 0;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap3);
        java.lang.Class<?> wildcardClass5 = typeFactory4.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._pushbackToken = "hi!";
        int int7 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer5 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer5.asIterator();
        int int7 = myTokenizer5._index;
        java.lang.String str8 = myTokenizer5._pushbackToken;
        myTokenizer5._pushbackToken = "hi!";
        java.lang.IllegalArgumentException illegalArgumentException12 = typeParser3._problem(myTokenizer5, "");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer15 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor16 = myTokenizer15.asIterator();
        java.lang.String str17 = myTokenizer15.getRemainingInput();
        java.lang.String str18 = myTokenizer15._pushbackToken;
        boolean boolean19 = myTokenizer15.hasMoreTokens();
        boolean boolean20 = myTokenizer15.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = typeParser3.findClass("", myTokenizer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class '', problem: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(illegalArgumentException12);
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withClassLoader(classLoader6);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory7);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
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
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer14 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer14._pushbackToken = "";
        int int17 = myTokenizer14._index;
        java.lang.String str18 = myTokenizer14.getAllInput();
        java.lang.IllegalArgumentException illegalArgumentException20 = typeParser12._problem(myTokenizer14, "");
        int int21 = myTokenizer14._index;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(objLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(illegalArgumentException20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
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
        myTokenizer19.pushBack("");
        java.lang.String str27 = myTokenizer19.getRemainingInput();
        myTokenizer19.pushBack("");
        java.lang.String str31 = myTokenizer19.nextToken("hi!");
        java.lang.IllegalArgumentException illegalArgumentException33 = typeParser10._problem(myTokenizer19, "");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(illegalArgumentException33);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        java.lang.Class<?> wildcardClass8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass5);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        myTokenizer1._index = 'a';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._input;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1.countTokens();
        int int7 = myTokenizer1._index;
        java.lang.Class<?> wildcardClass8 = myTokenizer1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1._index;
        myTokenizer1._index = (short) 0;
        myTokenizer1.pushBack("");
        int int9 = myTokenizer1.countTokens();
        myTokenizer1._index = '4';
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        int int7 = myTokenizer1._index;
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        int int7 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj6 = myTokenizer1.nextElement();
        myTokenizer1._index = 'a';
        java.lang.String str9 = myTokenizer1._pushbackToken;
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 'a';
        java.lang.String str7 = myTokenizer1._pushbackToken;
        java.lang.String str8 = myTokenizer1._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = (byte) -1;
        myTokenizer1._pushbackToken = "";
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = '#';
        java.lang.String str10 = myTokenizer1.nextToken("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
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
        java.lang.String str18 = myTokenizer16.getRemainingInput();
        java.lang.String str19 = myTokenizer16._input;
        int int20 = myTokenizer16._index;
        myTokenizer16.pushBack("");
        int int23 = myTokenizer16.countTokens();
        java.lang.IllegalArgumentException illegalArgumentException25 = typeParser11._problem(myTokenizer16, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType27 = typeParser11.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
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
        org.junit.Assert.assertNotNull(objItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(illegalArgumentException25);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        int int7 = myTokenizer1.countTokens();
        int int8 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objItor5);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        int int6 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.Object obj8 = myTokenizer1.nextElement();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        myTokenizer1._index = 'a';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
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
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = typeFactory11._modifiers;
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
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = (byte) -1;
        java.lang.String str11 = myTokenizer1.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory0._typeCache;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap5 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap6 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap6);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(objLRUMap5);
        org.junit.Assert.assertNotNull(objLRUMap6);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer5 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer5.asIterator();
        int int7 = myTokenizer5._index;
        java.lang.String str8 = myTokenizer5._pushbackToken;
        myTokenizer5._pushbackToken = "hi!";
        java.lang.IllegalArgumentException illegalArgumentException12 = typeParser3._problem(myTokenizer5, "");
        int int13 = myTokenizer5.countTokens();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(illegalArgumentException12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
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
        int int12 = myTokenizer1.countTokens();
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
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        int int6 = myTokenizer1._index;
        int int7 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        int int7 = myTokenizer1.countTokens();
        int int8 = myTokenizer1._index;
        int int9 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
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
        myTokenizer12.pushBack("hi!");
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
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        java.lang.String str11 = myTokenizer1._pushbackToken;
        boolean boolean12 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        java.lang.String str8 = myTokenizer1._input;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
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
        java.lang.ClassLoader classLoader15 = typeFactory14.getClassLoader();
        com.fasterxml.jackson.databind.type.ClassStack classStack16 = null;
        java.lang.reflect.GenericArrayType genericArrayType17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withClassLoader(classLoader19);
        com.fasterxml.jackson.databind.type.ClassStack classStack21 = null;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer23 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor24 = myTokenizer23.asIterator();
        java.lang.String str25 = myTokenizer23.getRemainingInput();
        java.lang.String str26 = myTokenizer23._input;
        int int27 = myTokenizer23._index;
        myTokenizer23.pushBack("");
        java.lang.Class<?> wildcardClass30 = myTokenizer23.getClass();
        java.lang.Class<?> wildcardClass31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass30);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings32 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType33 = typeFactory20._fromAny(classStack21, (java.lang.reflect.Type) wildcardClass30, typeBindings32);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory14._fromArrayType(classStack16, genericArrayType17, typeBindings32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(classLoader15);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(objItor24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(typeBindings32);
        org.junit.Assert.assertNotNull(javaType33);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        boolean boolean3 = myTokenizer1.hasMoreElements();
        int int4 = myTokenizer1.countTokens();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        int int7 = myTokenizer1.countTokens();
        myTokenizer1._index = 0;
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj12 = myTokenizer1.nextElement();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1.nextToken();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objItor11);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "hi!";
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getAllInput();
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        java.lang.String str6 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = typeFactory16.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
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
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType4 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass5 = simpleType4.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) wildcardClass5, typeBindings6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = typeFactory0.findClass("hi!");
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
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        int int6 = myTokenizer1._index;
        java.lang.Object obj7 = myTokenizer1.nextElement();
        myTokenizer1._pushbackToken = "";
        boolean boolean10 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        boolean boolean4 = myTokenizer1.hasMoreTokens();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.lang.String str7 = myTokenizer1.nextToken();
        java.lang.String str8 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.Class<?> wildcardClass6 = myTokenizer1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = typeParser10.parse("");
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
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) -1;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        int int8 = myTokenizer1._index;
        int int9 = myTokenizer1.countTokens();
        java.lang.String str10 = myTokenizer1._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
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
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        typeFactory16.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory16);
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
        org.junit.Assert.assertNotNull(typeFactory16);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        int int2 = myTokenizer1.countTokens();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        java.lang.String str11 = myTokenizer1._pushbackToken;
        java.lang.String str12 = myTokenizer1._input;
        myTokenizer1._index = (short) 0;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.Class<?> wildcardClass11 = myTokenizer1.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1._index;
        myTokenizer1._index = (short) 0;
        myTokenizer1.pushBack("");
        java.lang.String str9 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        java.lang.Class<?> wildcardClass5 = typeFactory0._findPrimitive("");
        java.lang.ClassLoader classLoader6 = typeFactory0.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(classLoader6);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        java.lang.String str5 = myTokenizer1._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1.pushBack("");
        int int8 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) 0;
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        int int9 = myTokenizer1.countTokens();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory2._typeCache;
        java.lang.Class<?> wildcardClass4 = objLRUMap3.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer6 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer6.asIterator();
        boolean boolean8 = myTokenizer6.hasMoreTokens();
        java.lang.String str9 = myTokenizer6.getRemainingInput();
        int int10 = myTokenizer6.countTokens();
        myTokenizer6._index = (short) 0;
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer6.asIterator();
        int int14 = myTokenizer6.countTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList15 = typeParser4.parseTypes(myTokenizer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        java.lang.String str11 = myTokenizer1._pushbackToken;
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        int int7 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        int int7 = myTokenizer1.countTokens();
        myTokenizer1._index = (byte) 100;
        java.lang.String str10 = myTokenizer1._input;
        java.lang.String str11 = myTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
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
        java.lang.String str18 = myTokenizer16.getRemainingInput();
        java.lang.String str19 = myTokenizer16._input;
        int int20 = myTokenizer16._index;
        myTokenizer16.pushBack("");
        int int23 = myTokenizer16.countTokens();
        java.lang.IllegalArgumentException illegalArgumentException25 = typeParser11._problem(myTokenizer16, "hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = typeParser11._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer28 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor29 = myTokenizer28.asIterator();
        int int30 = myTokenizer28._index;
        java.lang.String str31 = myTokenizer28._pushbackToken;
        boolean boolean32 = myTokenizer28.hasMoreElements();
        myTokenizer28._pushbackToken = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList35 = typeParser11.parseTypes(myTokenizer28);
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
        org.junit.Assert.assertNotNull(objItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(illegalArgumentException25);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(objItor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.Class<?> wildcardClass6 = objItor5.getClass();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = (byte) -1;
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        int int4 = myTokenizer1.countTokens();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
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
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType20 = typeParser10.parseType(myTokenizer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(typeFactory18);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer3.pushBack("");
        java.lang.String str6 = myTokenizer3.nextToken();
        java.lang.String str7 = myTokenizer3._pushbackToken;
        java.lang.String str8 = myTokenizer3.getRemainingInput();
        java.lang.IllegalArgumentException illegalArgumentException10 = typeParser1._problem(myTokenizer3, "");
        myTokenizer3._index = '#';
        java.lang.String str13 = myTokenizer3.getAllInput();
        int int14 = myTokenizer3.countTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = myTokenizer3.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(illegalArgumentException10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = 'a';
        java.lang.String str7 = myTokenizer1._pushbackToken;
        java.lang.String str8 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        int int6 = myTokenizer1._index;
        java.lang.Object obj7 = myTokenizer1.nextElement();
        myTokenizer1.pushBack("hi!");
        java.lang.String str10 = myTokenizer1.getRemainingInput();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objItor11);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str6 = myTokenizer1.nextToken("hi!");
        myTokenizer1._index = '#';
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = (byte) -1;
        java.lang.String str11 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) -1;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        int int8 = myTokenizer1._index;
        int int9 = myTokenizer1.countTokens();
        java.lang.String str10 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 10;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory2._typeCache;
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap6 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory8.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNotNull(objLRUMap6);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        int int7 = myTokenizer1.countTokens();
        myTokenizer1._index = (byte) 100;
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1._index = '#';
        myTokenizer1._index = (short) 1;
        java.lang.String str7 = myTokenizer1._input;
        java.lang.String str8 = myTokenizer1.getAllInput();
        int int9 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.nextToken("");
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        boolean boolean7 = myTokenizer1.hasMoreElements();
        myTokenizer1.pushBack("hi!");
        java.lang.String str10 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer10 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer10.asIterator();
        java.lang.String str12 = myTokenizer10.getRemainingInput();
        boolean boolean13 = myTokenizer10.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = typeParser7.findClass("", myTokenizer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class '', problem: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        int int7 = myTokenizer1.countTokens();
        myTokenizer1._index = (byte) 100;
        int int10 = myTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        int int6 = myTokenizer1._index;
        java.lang.Class<?> wildcardClass7 = myTokenizer1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1.pushBack("");
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        int int10 = myTokenizer1.countTokens();
        myTokenizer1.pushBack("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        java.lang.String str11 = myTokenizer1._pushbackToken;
        java.lang.String str12 = myTokenizer1._input;
        int int13 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str7 = myTokenizer1.nextToken("hi!");
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        java.lang.String str9 = myTokenizer1.nextToken("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        boolean boolean4 = myTokenizer1.hasMoreTokens();
        java.lang.String str5 = myTokenizer1._input;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.nextToken();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
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
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        typeFactory16.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap18 = typeFactory16._typeCache;
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
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(objLRUMap18);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        java.lang.String str11 = myTokenizer1._pushbackToken;
        java.lang.String str12 = myTokenizer1._input;
        int int13 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("hi!");
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        int int9 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objItor10);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = typeFactory0.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
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
        com.fasterxml.jackson.databind.type.TypeParser typeParser23 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
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
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        int int4 = myTokenizer1.countTokens();
        java.lang.String str6 = myTokenizer1.nextToken("hi!");
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        int int6 = myTokenizer1.countTokens();
        java.lang.String str7 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) 1;
        myTokenizer1._pushbackToken = "";
        java.lang.String str10 = myTokenizer1.nextToken();
        myTokenizer1.pushBack("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1._index;
        myTokenizer1._index = (short) 0;
        myTokenizer1.pushBack("");
        boolean boolean9 = myTokenizer1.hasMoreElements();
        java.lang.String str10 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        java.lang.String str9 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(objItor10);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        int int5 = myTokenizer1.countTokens();
        int int6 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._pushbackToken = "hi!";
        int int7 = myTokenizer1._index;
        myTokenizer1._index = (short) -1;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = '#';
        java.lang.String str10 = myTokenizer1.nextToken("");
        boolean boolean11 = myTokenizer1.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        myTokenizer1._index = '4';
        myTokenizer1.pushBack("");
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objItor11);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNotNull(objItor2);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap4);
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory5._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNotNull(javaType6);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        java.lang.String str2 = myTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        int int2 = myTokenizer1.countTokens();
        java.lang.Class<?> wildcardClass3 = myTokenizer1.getClass();
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer3 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer3.pushBack("");
        java.lang.String str6 = myTokenizer3.nextToken();
        java.lang.String str7 = myTokenizer3._pushbackToken;
        java.lang.String str8 = myTokenizer3.getRemainingInput();
        java.lang.IllegalArgumentException illegalArgumentException10 = typeParser1._problem(myTokenizer3, "");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str13 = myTokenizer12._pushbackToken;
        java.lang.String str14 = myTokenizer12.getRemainingInput();
        java.lang.String str15 = myTokenizer12._input;
        myTokenizer12._pushbackToken = "hi!";
        java.lang.Object obj18 = myTokenizer12.nextElement();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList19 = typeParser1.parseTypes(myTokenizer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(illegalArgumentException10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
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
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer15 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer15.pushBack("");
        java.lang.String str18 = myTokenizer15._pushbackToken;
        java.lang.String str20 = myTokenizer15.nextToken("hi!");
        java.lang.String str21 = myTokenizer15._input;
        java.lang.String str22 = myTokenizer15._input;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType23 = typeParser13.parseType(myTokenizer15);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._index = (short) 0;
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
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
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap13 = typeFactory8._typeCache;
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
        org.junit.Assert.assertNotNull(objLRUMap13);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.lang.String str7 = myTokenizer1.nextToken("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory0._typeCache;
        java.lang.ClassLoader classLoader4 = typeFactory0._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNull(classLoader4);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
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
        java.lang.ClassLoader classLoader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = typeFactory11.classForName("hi!", false, classLoader14);
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
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        java.lang.String str12 = myTokenizer1.nextToken("");
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        int int7 = myTokenizer1._index;
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        int int6 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        int int8 = myTokenizer1.countTokens();
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1._index = (short) 100;
        myTokenizer1._index = 0;
        myTokenizer1._index = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
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
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap31 = typeFactory0._typeCache;
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
        org.junit.Assert.assertNotNull(objLRUMap31);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        int int7 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1._input;
        myTokenizer1.pushBack("");
        java.lang.String str11 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1._input;
        java.lang.String str10 = myTokenizer1.nextToken();
        java.lang.String str11 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj7 = myTokenizer1.nextElement();
        myTokenizer1._index = (byte) 100;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        int int2 = myTokenizer1._index;
        java.lang.Class<?> wildcardClass3 = myTokenizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        java.lang.String str9 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        java.lang.Object obj11 = myTokenizer1.nextElement();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        typeFactory6.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        int int4 = myTokenizer1.countTokens();
        java.lang.String str6 = myTokenizer1.nextToken("hi!");
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        java.lang.String str8 = myTokenizer1._input;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        boolean boolean2 = myTokenizer1.hasMoreElements();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("");
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str11 = myTokenizer1._pushbackToken;
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        int int10 = myTokenizer1._index;
        java.lang.String str11 = myTokenizer1.getAllInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        int int6 = myTokenizer1._index;
        int int7 = myTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "hi!";
        java.lang.Object obj8 = myTokenizer1.nextElement();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        int int4 = myTokenizer1.countTokens();
        java.lang.String str6 = myTokenizer1.nextToken("hi!");
        java.lang.String str7 = myTokenizer1.getAllInput();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType4 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType3);
        java.lang.Class<?> wildcardClass5 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(arrayType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        java.lang.String str4 = myTokenizer1.getAllInput();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1.pushBack("");
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        int int10 = myTokenizer1.countTokens();
        java.lang.String str12 = myTokenizer1.nextToken("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        int int6 = myTokenizer1.countTokens();
        int int7 = myTokenizer1._index;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("");
        myTokenizer1._pushbackToken = "";
        boolean boolean8 = myTokenizer1.hasMoreElements();
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._input;
        int int6 = myTokenizer1.countTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken();
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
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (byte) 10;
        int int8 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str11 = myTokenizer1._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
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
            java.lang.Class<?> wildcardClass10 = typeFactory0.findClass("hi!");
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
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) 1;
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) 1;
        boolean boolean8 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        int int6 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) 1;
        myTokenizer1._index = (-1);
        int int11 = myTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._pushbackToken = "hi!";
        int int7 = myTokenizer1._index;
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.ArrayType arrayType4 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType3);
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(arrayType4);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.getAllInput();
        int int6 = myTokenizer1._index;
        int int7 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "";
        int int10 = myTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "";
        int int4 = myTokenizer1._index;
        java.lang.String str5 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) 1;
        myTokenizer1._pushbackToken = "";
        java.lang.String str10 = myTokenizer1.nextToken();
        java.lang.String str11 = myTokenizer1.getAllInput();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        myTokenizer1._index = '4';
        myTokenizer1.pushBack("");
        java.lang.String str10 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType3 = typeParser1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
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
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeFactory10.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory2._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNull(typeModifierArray5);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = typeFactory2.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(classLoader7);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory2);
        java.lang.Class<?> wildcardClass5 = typeFactory2._findPrimitive("hi!");
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withClassLoader(classLoader6);
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory2._unknownType();
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap10 = typeFactory2._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(objLRUMap10);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) -1;
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        int int8 = myTokenizer1._index;
        java.lang.String str9 = myTokenizer1.getAllInput();
        myTokenizer1._index = (short) -1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        int int6 = myTokenizer1._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        int int5 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) 0;
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        int int9 = myTokenizer1.countTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1.nextToken();
        myTokenizer1._index = (short) -1;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
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
        com.fasterxml.jackson.databind.type.ClassStack classStack19 = null;
        java.lang.reflect.GenericArrayType genericArrayType20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withClassLoader(classLoader22);
        com.fasterxml.jackson.databind.type.ClassStack classStack24 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType25 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass26 = simpleType25.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory21._fromAny(classStack24, (java.lang.reflect.Type) wildcardClass26, typeBindings27);
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory21.constructType((java.lang.reflect.Type) simpleType29);
        java.lang.ClassLoader classLoader31 = typeFactory21._classLoader;
        com.fasterxml.jackson.databind.JavaType javaType32 = typeFactory21._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        java.lang.Class<?> wildcardClass34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType33);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = typeFactory35.withClassLoader(classLoader36);
        com.fasterxml.jackson.databind.type.ClassStack classStack38 = null;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer40 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor41 = myTokenizer40.asIterator();
        java.lang.String str42 = myTokenizer40.getRemainingInput();
        java.lang.String str43 = myTokenizer40._input;
        int int44 = myTokenizer40._index;
        myTokenizer40.pushBack("");
        java.lang.Class<?> wildcardClass47 = myTokenizer40.getClass();
        java.lang.Class<?> wildcardClass48 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass47);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings49 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType50 = typeFactory37._fromAny(classStack38, (java.lang.reflect.Type) wildcardClass47, typeBindings49);
        com.fasterxml.jackson.databind.JavaType javaType51 = typeFactory21.constructType((java.lang.reflect.Type) wildcardClass34, typeBindings49);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType52 = typeFactory18._fromArrayType(classStack19, genericArrayType20, typeBindings49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(simpleType25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(typeBindings27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(simpleType29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNull(classLoader31);
        org.junit.Assert.assertNotNull(javaType32);
        org.junit.Assert.assertNotNull(javaType33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(objItor41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(typeBindings49);
        org.junit.Assert.assertNotNull(javaType50);
        org.junit.Assert.assertNotNull(javaType51);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1._input;
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        int int7 = myTokenizer1.countTokens();
        java.lang.String str8 = myTokenizer1._input;
        java.lang.String str9 = myTokenizer1.nextToken();
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("hi!");
        java.lang.Object obj14 = myTokenizer1.nextElement();
        boolean boolean15 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        int int3 = myTokenizer1._index;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1.pushBack("");
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        int int7 = myTokenizer1.countTokens();
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
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
        boolean boolean11 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = myTokenizer1.nextElement();
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
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("hi!");
        java.lang.Object obj8 = myTokenizer1.nextElement();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = myTokenizer1.asIterator();
        java.lang.String str3 = myTokenizer1.getRemainingInput();
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = 'a';
        java.lang.String str14 = myTokenizer1.getAllInput();
        java.lang.String str16 = myTokenizer1.nextToken("hi!");
        myTokenizer1._index = (byte) 0;
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
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
        java.lang.String str15 = myTokenizer5.nextToken("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(illegalArgumentException12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1.pushBack("");
        java.lang.String str4 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 100;
        boolean boolean7 = myTokenizer1.hasMoreElements();
        java.lang.String str9 = myTokenizer1.nextToken("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }
}

