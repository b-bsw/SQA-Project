package org.apache.commons.lang;

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str6 = binaryEntityMap4.name((-1));
        entities0.map = binaryEntityMap4;
        java.lang.String str9 = entities0.escape("hi!");
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        arrayEntityMap1.size = (byte) 100;
        arrayEntityMap1.growBy = (short) 0;
        java.lang.Class<?> wildcardClass8 = arrayEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap1.name(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray11 = new int[] { ' ', '4' };
        binaryEntityMap8.values = intArray11;
        java.lang.String str14 = binaryEntityMap8.name((int) (byte) 100);
        binaryEntityMap8.add("hi!", (-1));
        java.lang.String str19 = binaryEntityMap8.name(0);
        java.lang.String str21 = binaryEntityMap8.name(10);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        binaryEntityMap8.names = strArray22;
        binaryEntityMap1.names = strArray22;
        int int25 = binaryEntityMap1.growBy;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.ensureCapacity((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1 out of bounds for object array[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("hi!", (int) (byte) 1);
        lookupEntityMap0.add("hi!", (int) 'a');
        int int22 = lookupEntityMap0.value("");
        java.lang.Class<?> wildcardClass23 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", 100);
        java.lang.String str7 = entities0.entityName((int) (byte) 100);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        entities0.addEntity("", 0);
        entities0.addEntity("", (int) (short) 0);
        java.lang.String str16 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
// flaky "1) test0507(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = lookupEntityMap0.name((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) '4');
        java.lang.Class<?> wildcardClass6 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap1.mapValueToName = map27;
        entities0.map = hashEntityMap1;
        java.lang.String str33 = entities0.escape("hi!");
        java.lang.String str35 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities0.map = arrayEntityMap37;
        java.lang.String str40 = entities0.escape("");
        java.io.Writer writer41 = null;
        entities0.escape(writer41, "");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap45 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray48 = new int[] { ' ', '4' };
        binaryEntityMap45.values = intArray48;
        int int51 = binaryEntityMap45.value("");
        int int53 = binaryEntityMap45.value("");
        binaryEntityMap45.add("hi!", 35);
        java.lang.String str58 = binaryEntityMap45.name((int) (short) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap60 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray63 = new int[] { ' ', '4' };
        binaryEntityMap60.values = intArray63;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap66 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray67 = arrayEntityMap66.values;
        java.lang.String str69 = arrayEntityMap66.name((int) (short) 100);
        int[] intArray72 = new int[] { (short) -1, 10 };
        arrayEntityMap66.values = intArray72;
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!" };
        arrayEntityMap66.names = strArray75;
        binaryEntityMap60.names = strArray75;
        java.lang.String[] strArray78 = binaryEntityMap60.names;
        binaryEntityMap45.names = strArray78;
        entities0.map = binaryEntityMap45;
        java.lang.String str82 = entities0.entityName((int) (byte) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 0 });
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        java.lang.String str13 = lookupEntityMap0.name((int) ' ');
        lookupEntityMap0.add("", (int) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        int int9 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", 35);
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 10);
        binaryEntityMap1.add("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 3 out of bounds for int[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 35 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        java.lang.String str11 = hashEntityMap5.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = null;
        hashEntityMap12.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap12.mapNameToValue = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap19.mapNameToValue = map22;
        java.util.Map map24 = null;
        hashEntityMap19.mapNameToValue = map24;
        java.util.Map map26 = hashEntityMap19.mapValueToName;
        hashEntityMap12.mapNameToValue = map26;
        hashEntityMap5.mapValueToName = map26;
        hashEntityMap0.mapValueToName = map26;
        java.lang.String str31 = hashEntityMap0.name((int) '#');
        java.util.Map map32 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = null;
        hashEntityMap33.mapNameToValue = map34;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = null;
        hashEntityMap37.mapNameToValue = map38;
        java.lang.String str41 = hashEntityMap37.name((int) '4');
        java.util.Map map42 = hashEntityMap37.mapValueToName;
        hashEntityMap36.mapValueToName = map42;
        hashEntityMap33.mapValueToName = map42;
        java.util.Map map45 = hashEntityMap33.mapValueToName;
        hashEntityMap0.mapValueToName = map45;
        java.lang.String str48 = hashEntityMap0.name((int) (byte) 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.entityName(100);
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer10 = null;
        entities9.escape(writer10, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities9);
        java.io.Writer writer14 = null;
        entities9.escape(writer14, "");
        org.apache.commons.lang.Entities entities17 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = null;
        hashEntityMap18.mapNameToValue = map19;
        java.lang.String str22 = hashEntityMap18.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = null;
        hashEntityMap23.mapNameToValue = map24;
        java.lang.String str27 = hashEntityMap23.name((int) '4');
        java.lang.String str29 = hashEntityMap23.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = null;
        hashEntityMap30.mapNameToValue = map31;
        java.util.Map map33 = null;
        hashEntityMap30.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap30.mapNameToValue = map35;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = null;
        hashEntityMap37.mapNameToValue = map38;
        java.util.Map map40 = null;
        hashEntityMap37.mapNameToValue = map40;
        java.util.Map map42 = null;
        hashEntityMap37.mapNameToValue = map42;
        java.util.Map map44 = hashEntityMap37.mapValueToName;
        hashEntityMap30.mapNameToValue = map44;
        hashEntityMap23.mapValueToName = map44;
        hashEntityMap18.mapValueToName = map44;
        entities17.map = hashEntityMap18;
        java.lang.String str50 = entities17.escape("hi!");
        java.lang.String str52 = entities17.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap54 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities17.map = arrayEntityMap54;
        java.io.Writer writer56 = null;
        entities17.escape(writer56, "");
        java.lang.String str60 = entities17.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities17);
        org.apache.commons.lang.Entities entities62 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap63 = entities62.map;
        java.lang.String str65 = entities62.unescape("hi!");
        org.apache.commons.lang.Entities entities66 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap67 = entities66.map;
        org.apache.commons.lang.Entities.EntityMap entityMap68 = entities66.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap70 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap70.add("hi!", 0);
        arrayEntityMap70.size = (byte) 1;
        arrayEntityMap70.growBy = 100;
        java.lang.String str79 = arrayEntityMap70.name((int) (byte) 1);
        entities66.map = arrayEntityMap70;
        entities62.map = arrayEntityMap70;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities62);
        org.apache.commons.lang.Entities entities83 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray84 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
// flaky "2) test0514(org.apache.commons.lang.RegressionTest1)":         entities83.addEntities(strArray84);
        entities62.addEntities(strArray84);
        entities17.addEntities(strArray84);
        entities9.addEntities(strArray84);
// flaky "1) test0514(org.apache.commons.lang.RegressionTest1)":         entities0.addEntities(strArray84);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(entities62);
        org.junit.Assert.assertNotNull(entityMap63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(entities66);
        org.junit.Assert.assertNotNull(entityMap67);
        org.junit.Assert.assertNotNull(entityMap68);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(entities83);
        org.junit.Assert.assertNotNull(strArray84);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = (short) -1;
        binaryEntityMap1.add("hi!", 100);
        java.lang.String str15 = binaryEntityMap1.name((int) (byte) 10);
        int[] intArray16 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = (byte) -1;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities4 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities4.map;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities4.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        arrayEntityMap8.growBy = 100;
        java.lang.String str17 = arrayEntityMap8.name((int) (byte) 1);
        entities4.map = arrayEntityMap8;
        entities0.map = arrayEntityMap8;
        java.lang.String str21 = entities0.entityName(0);
        java.lang.String str23 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) (short) 0);
        java.io.Writer writer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer27, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("");
        int int4 = lookupEntityMap0.value("");
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str6 = lookupEntityMap0.name(100);
        int int8 = lookupEntityMap0.value("hi!");
        int int10 = lookupEntityMap0.value("");
        java.lang.String str12 = lookupEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = (short) -1;
        binaryEntityMap1.add("hi!", 100);
        int int14 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        int[] intArray14 = new int[] {};
        arrayEntityMap8.values = intArray14;
        arrayEntityMap1.values = intArray14;
        arrayEntityMap1.ensureCapacity((int) (short) 0);
        int int19 = arrayEntityMap1.growBy;
        arrayEntityMap1.growBy = 'a';
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        int int11 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap13 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray14 = arrayEntityMap13.values;
        arrayEntityMap13.add("hi!", (int) (byte) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray20 = arrayEntityMap19.values;
        int int21 = arrayEntityMap19.growBy;
        arrayEntityMap19.add("", (int) (byte) 10);
        int[] intArray25 = arrayEntityMap19.values;
        arrayEntityMap13.values = intArray25;
        arrayEntityMap1.values = intArray25;
        int int28 = arrayEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.add("hi!", 0);
        int int7 = arrayEntityMap1.size;
        arrayEntityMap1.growBy = 0;
        java.lang.Class<?> wildcardClass10 = arrayEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        entities0.addEntity("", (int) 'a');
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = lookupEntityMap0.name((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", 10);
        lookupEntityMap0.add("", (int) (short) 1);
        int int18 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap1.mapValueToName = map27;
        entities0.map = hashEntityMap1;
        java.io.Writer writer32 = null;
        entities0.escape(writer32, "");
        java.io.Writer writer35 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer35, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.growBy = 10;
        binaryEntityMap1.add("hi!", (int) 'a');
        int[] intArray9 = binaryEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities12 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities12.map;
        java.lang.String str15 = entities12.unescape("hi!");
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities16.map;
        org.apache.commons.lang.Entities.EntityMap entityMap18 = entities16.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap20 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap20.add("hi!", 0);
        arrayEntityMap20.size = (byte) 1;
        arrayEntityMap20.growBy = 100;
        java.lang.String str29 = arrayEntityMap20.name((int) (byte) 1);
        entities16.map = arrayEntityMap20;
        entities12.map = arrayEntityMap20;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities12);
        org.apache.commons.lang.Entities entities33 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray34 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities33.addEntities(strArray34);
        entities12.addEntities(strArray34);
        entities0.addEntities(strArray34);
        java.lang.String str39 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(entities12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertNotNull(entityMap17);
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(entities33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap0 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.util.Map map4 = null;
        hashEntityMap1.mapNameToValue = map4;
        java.util.Map map6 = null;
        hashEntityMap1.mapNameToValue = map6;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap8.mapValueToName;
        hashEntityMap1.mapNameToValue = map15;
        treeEntityMap0.mapValueToName = map15;
        treeEntityMap0.add("", 35);
        java.util.Map map21 = treeEntityMap0.mapValueToName;
        java.lang.String str23 = treeEntityMap0.name(100);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.entityName(2);
        java.lang.String str9 = entities0.entityName(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray14 = new int[] { ' ', '4' };
        binaryEntityMap11.values = intArray14;
        java.lang.String str17 = binaryEntityMap11.name((int) (byte) 100);
        binaryEntityMap11.add("hi!", (-1));
        java.lang.String str22 = binaryEntityMap11.name(0);
        java.lang.String str24 = binaryEntityMap11.name(10);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        binaryEntityMap11.names = strArray25;
        entities0.map = binaryEntityMap11;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.ensureCapacity((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        java.lang.String str11 = hashEntityMap5.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = null;
        hashEntityMap12.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap12.mapNameToValue = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap19.mapNameToValue = map22;
        java.util.Map map24 = null;
        hashEntityMap19.mapNameToValue = map24;
        java.util.Map map26 = hashEntityMap19.mapValueToName;
        hashEntityMap12.mapNameToValue = map26;
        hashEntityMap5.mapValueToName = map26;
        hashEntityMap0.mapValueToName = map26;
        java.util.Map map30 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = null;
        hashEntityMap35.mapNameToValue = map36;
        java.lang.String str39 = hashEntityMap35.name((int) '4');
        java.util.Map map40 = hashEntityMap35.mapValueToName;
        hashEntityMap34.mapValueToName = map40;
        hashEntityMap31.mapValueToName = map40;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = null;
        hashEntityMap43.mapNameToValue = map44;
        java.util.Map map46 = hashEntityMap43.mapNameToValue;
        java.util.Map map47 = hashEntityMap43.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = null;
        hashEntityMap48.mapNameToValue = map49;
        java.lang.String str52 = hashEntityMap48.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = null;
        hashEntityMap53.mapNameToValue = map54;
        java.lang.String str57 = hashEntityMap53.name((int) '4');
        java.lang.String str59 = hashEntityMap53.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map61 = null;
        hashEntityMap60.mapNameToValue = map61;
        java.util.Map map63 = null;
        hashEntityMap60.mapNameToValue = map63;
        java.util.Map map65 = null;
        hashEntityMap60.mapNameToValue = map65;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map68 = null;
        hashEntityMap67.mapNameToValue = map68;
        java.util.Map map70 = null;
        hashEntityMap67.mapNameToValue = map70;
        java.util.Map map72 = null;
        hashEntityMap67.mapNameToValue = map72;
        java.util.Map map74 = hashEntityMap67.mapValueToName;
        hashEntityMap60.mapNameToValue = map74;
        hashEntityMap53.mapValueToName = map74;
        hashEntityMap48.mapValueToName = map74;
        hashEntityMap43.mapNameToValue = map74;
        java.util.Map map79 = hashEntityMap43.mapNameToValue;
        hashEntityMap31.mapValueToName = map79;
        java.util.Map map81 = hashEntityMap31.mapValueToName;
        hashEntityMap0.mapValueToName = map81;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        java.lang.String str6 = arrayEntityMap1.name(2);
        arrayEntityMap1.growBy = 100;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = hashEntityMap0.name(100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = null;
        hashEntityMap9.mapNameToValue = map10;
        java.util.Map map12 = hashEntityMap9.mapNameToValue;
        java.util.Map map13 = hashEntityMap9.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.lang.String str18 = hashEntityMap14.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.lang.String str23 = hashEntityMap19.name((int) '4');
        java.lang.String str25 = hashEntityMap19.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = null;
        hashEntityMap26.mapNameToValue = map27;
        java.util.Map map29 = null;
        hashEntityMap26.mapNameToValue = map29;
        java.util.Map map31 = null;
        hashEntityMap26.mapNameToValue = map31;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = null;
        hashEntityMap33.mapNameToValue = map34;
        java.util.Map map36 = null;
        hashEntityMap33.mapNameToValue = map36;
        java.util.Map map38 = null;
        hashEntityMap33.mapNameToValue = map38;
        java.util.Map map40 = hashEntityMap33.mapValueToName;
        hashEntityMap26.mapNameToValue = map40;
        hashEntityMap19.mapValueToName = map40;
        hashEntityMap14.mapValueToName = map40;
        hashEntityMap9.mapNameToValue = map40;
        hashEntityMap0.mapNameToValue = map40;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        arrayEntityMap1.add("hi!", (int) (byte) 10);
        arrayEntityMap1.add("", (int) (short) -1);
        java.lang.String str10 = arrayEntityMap1.name((int) (byte) 0);
        arrayEntityMap1.ensureCapacity((int) (byte) 100);
        arrayEntityMap1.growBy = (-1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) 'a');
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (int) (short) -1);
        lookupEntityMap0.add("hi!", 100);
        java.lang.String str14 = lookupEntityMap0.name(10);
        int int16 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.entityName(35);
        java.lang.String[][] strArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntities(strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap6.add("hi!", 0);
        arrayEntityMap6.size = (byte) 1;
        arrayEntityMap6.growBy = 100;
        java.lang.String[] strArray14 = arrayEntityMap6.names;
        arrayEntityMap1.names = strArray14;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray20 = new int[] { ' ', '4' };
        binaryEntityMap17.values = intArray20;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray24 = arrayEntityMap23.values;
        java.lang.String str26 = arrayEntityMap23.name((int) (short) 100);
        int[] intArray29 = new int[] { (short) -1, 10 };
        arrayEntityMap23.values = intArray29;
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        arrayEntityMap23.names = strArray32;
        binaryEntityMap17.names = strArray32;
        arrayEntityMap1.names = strArray32;
        int int37 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities entities38 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str40 = entities38.entityName((int) '#');
// flaky "3) test0542(org.apache.commons.lang.RegressionTest1)":         entities38.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap44 = entities38.map;
        java.io.Writer writer45 = null;
        entities38.escape(writer45, "");
        java.lang.String str49 = entities38.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap50 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray51 = null;
        binaryEntityMap50.values = intArray51;
        java.lang.String str54 = binaryEntityMap50.name((-1));
        entities38.map = binaryEntityMap50;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap57 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int59 = arrayEntityMap57.value("hi!");
        int int60 = arrayEntityMap57.growBy;
        int int61 = arrayEntityMap57.size;
        java.lang.String[] strArray62 = null;
        arrayEntityMap57.names = strArray62;
        int[] intArray64 = arrayEntityMap57.values;
        binaryEntityMap50.values = intArray64;
        arrayEntityMap1.values = intArray64;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0 });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(entities38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(entityMap44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 0 });
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        int[] intArray14 = new int[] {};
        arrayEntityMap8.values = intArray14;
        arrayEntityMap1.values = intArray14;
        arrayEntityMap1.ensureCapacity((int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap20 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray21 = arrayEntityMap20.values;
        java.lang.String str23 = arrayEntityMap20.name((int) (short) 100);
        int int25 = arrayEntityMap20.value("hi!");
        org.apache.commons.lang.Entities entities26 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str28 = entities26.unescape("hi!");
        java.io.Writer writer29 = null;
        entities26.escape(writer29, "");
        org.apache.commons.lang.Entities.EntityMap entityMap32 = entities26.map;
        org.apache.commons.lang.Entities entities33 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap34 = entities33.map;
        java.lang.String str36 = entities33.unescape("hi!");
        org.apache.commons.lang.Entities entities37 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap38 = entities37.map;
        org.apache.commons.lang.Entities.EntityMap entityMap39 = entities37.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap41 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap41.add("hi!", 0);
        arrayEntityMap41.size = (byte) 1;
        arrayEntityMap41.growBy = 100;
        java.lang.String str50 = arrayEntityMap41.name((int) (byte) 1);
        entities37.map = arrayEntityMap41;
        entities33.map = arrayEntityMap41;
        entities26.map = arrayEntityMap41;
        java.lang.String[] strArray54 = arrayEntityMap41.names;
        arrayEntityMap20.names = strArray54;
        arrayEntityMap1.names = strArray54;
        arrayEntityMap1.size = (short) 1;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0 });
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(entities26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(entityMap32);
        org.junit.Assert.assertNotNull(entities33);
        org.junit.Assert.assertNotNull(entityMap34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(entities37);
        org.junit.Assert.assertNotNull(entityMap38);
        org.junit.Assert.assertNotNull(entityMap39);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(strArray54);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        java.lang.String[] strArray4 = arrayEntityMap1.names;
        int[] intArray5 = arrayEntityMap1.values;
        arrayEntityMap1.growBy = (-1);
        arrayEntityMap1.size = 'a';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = arrayEntityMap1.name((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = (byte) -1;
        arrayEntityMap1.add("hi!", (int) (byte) 1);
        arrayEntityMap1.ensureCapacity(52);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        java.lang.String str11 = binaryEntityMap1.name((int) (byte) 10);
        java.lang.String str13 = binaryEntityMap1.name((int) (byte) -1);
        java.lang.String str15 = binaryEntityMap1.name(1);
        int int16 = binaryEntityMap1.size;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("hi!", (int) '#');
        java.lang.String str16 = lookupEntityMap0.name(32);
        lookupEntityMap0.add("", (int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.growBy = 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int9 = arrayEntityMap7.value("");
        arrayEntityMap7.size = (byte) 100;
        arrayEntityMap7.size = 100;
        arrayEntityMap7.ensureCapacity((int) (short) 1);
        int[] intArray16 = arrayEntityMap7.values;
        binaryEntityMap1.values = intArray16;
        binaryEntityMap1.add("", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10 });
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = null;
        hashEntityMap10.mapNameToValue = map11;
        java.lang.String str14 = hashEntityMap10.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap15.mapNameToValue = map18;
        java.util.Map map20 = null;
        hashEntityMap15.mapNameToValue = map20;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = null;
        hashEntityMap22.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap22.mapNameToValue = map25;
        java.util.Map map27 = null;
        hashEntityMap22.mapNameToValue = map27;
        java.util.Map map29 = hashEntityMap22.mapValueToName;
        hashEntityMap15.mapNameToValue = map29;
        hashEntityMap10.mapNameToValue = map29;
        hashEntityMap7.mapValueToName = map29;
        hashEntityMap0.mapNameToValue = map29;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = null;
        hashEntityMap34.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap34.mapNameToValue = map37;
        java.util.Map map39 = null;
        hashEntityMap34.mapNameToValue = map39;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = null;
        hashEntityMap41.mapNameToValue = map42;
        java.util.Map map44 = null;
        hashEntityMap41.mapNameToValue = map44;
        java.util.Map map46 = null;
        hashEntityMap41.mapNameToValue = map46;
        java.util.Map map48 = hashEntityMap41.mapValueToName;
        hashEntityMap34.mapNameToValue = map48;
        hashEntityMap0.mapValueToName = map48;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int53 = hashEntityMap51.value("");
        java.util.Map map54 = hashEntityMap51.mapValueToName;
        hashEntityMap0.mapValueToName = map54;
        int int57 = hashEntityMap0.value("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entityMap7);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = (-1);
        arrayEntityMap1.size = 10;
        java.lang.String[] strArray11 = arrayEntityMap1.names;
        java.lang.String str13 = arrayEntityMap1.name((int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        entities0.addEntity("", (int) (byte) 1);
        int int10 = entities0.entityValue("");
        entities0.addEntity("", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.unescape("hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("");
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        java.lang.Class<?> wildcardClass5 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("");
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.lang.String str2 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray7 = new int[] { ' ', '4' };
        binaryEntityMap4.values = intArray7;
        java.lang.String str10 = binaryEntityMap4.name((int) (byte) 100);
        binaryEntityMap4.add("hi!", (-1));
        java.lang.String str15 = binaryEntityMap4.name(0);
        entities0.map = binaryEntityMap4;
        binaryEntityMap4.add("hi!", 52);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.escape("hi!");
        java.lang.String str10 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", 35);
        java.lang.String str16 = lookupEntityMap0.name((int) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.util.Map map11 = hashEntityMap6.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapValueToName;
        java.util.Map map14 = null;
        hashEntityMap12.mapNameToValue = map14;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.lang.String str21 = hashEntityMap17.name((int) '4');
        java.util.Map map22 = hashEntityMap17.mapValueToName;
        hashEntityMap16.mapValueToName = map22;
        hashEntityMap12.mapNameToValue = map22;
        hashEntityMap6.mapNameToValue = map22;
        java.lang.String str27 = hashEntityMap6.name(2);
        java.util.Map map28 = hashEntityMap6.mapNameToValue;
        entities0.map = hashEntityMap6;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int32 = hashEntityMap30.value("");
        java.util.Map map33 = hashEntityMap30.mapValueToName;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap34 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = null;
        hashEntityMap35.mapNameToValue = map36;
        java.util.Map map38 = null;
        hashEntityMap35.mapNameToValue = map38;
        java.util.Map map40 = null;
        hashEntityMap35.mapNameToValue = map40;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = null;
        hashEntityMap42.mapNameToValue = map43;
        java.util.Map map45 = null;
        hashEntityMap42.mapNameToValue = map45;
        java.util.Map map47 = null;
        hashEntityMap42.mapNameToValue = map47;
        java.util.Map map49 = hashEntityMap42.mapValueToName;
        hashEntityMap35.mapNameToValue = map49;
        treeEntityMap34.mapValueToName = map49;
        hashEntityMap30.mapValueToName = map49;
        java.util.Map map53 = hashEntityMap30.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map55 = null;
        hashEntityMap54.mapNameToValue = map55;
        java.util.Map map57 = null;
        hashEntityMap54.mapNameToValue = map57;
        java.util.Map map59 = hashEntityMap54.mapValueToName;
        hashEntityMap30.mapNameToValue = map59;
        hashEntityMap6.mapValueToName = map59;
        java.util.Map map62 = hashEntityMap6.mapValueToName;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap0 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.util.Map map4 = null;
        hashEntityMap1.mapNameToValue = map4;
        java.util.Map map6 = null;
        hashEntityMap1.mapNameToValue = map6;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap8.mapValueToName;
        hashEntityMap1.mapNameToValue = map15;
        treeEntityMap0.mapValueToName = map15;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = null;
        hashEntityMap18.mapNameToValue = map19;
        java.lang.String str22 = hashEntityMap18.name((int) '4');
        java.lang.String str24 = hashEntityMap18.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = null;
        hashEntityMap25.mapNameToValue = map26;
        java.util.Map map28 = null;
        hashEntityMap25.mapNameToValue = map28;
        java.util.Map map30 = null;
        hashEntityMap25.mapNameToValue = map30;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = null;
        hashEntityMap32.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap32.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap32.mapNameToValue = map37;
        java.util.Map map39 = hashEntityMap32.mapValueToName;
        hashEntityMap25.mapNameToValue = map39;
        hashEntityMap18.mapValueToName = map39;
        treeEntityMap0.mapNameToValue = map39;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap43 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map45 = null;
        hashEntityMap44.mapNameToValue = map45;
        java.util.Map map47 = null;
        hashEntityMap44.mapNameToValue = map47;
        java.util.Map map49 = null;
        hashEntityMap44.mapNameToValue = map49;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map52 = null;
        hashEntityMap51.mapNameToValue = map52;
        java.util.Map map54 = null;
        hashEntityMap51.mapNameToValue = map54;
        java.util.Map map56 = null;
        hashEntityMap51.mapNameToValue = map56;
        java.util.Map map58 = hashEntityMap51.mapValueToName;
        hashEntityMap44.mapNameToValue = map58;
        treeEntityMap43.mapValueToName = map58;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map62 = null;
        hashEntityMap61.mapNameToValue = map62;
        java.lang.String str65 = hashEntityMap61.name((int) '4');
        java.lang.String str67 = hashEntityMap61.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap68 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map69 = null;
        hashEntityMap68.mapNameToValue = map69;
        java.util.Map map71 = null;
        hashEntityMap68.mapNameToValue = map71;
        java.util.Map map73 = null;
        hashEntityMap68.mapNameToValue = map73;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map76 = null;
        hashEntityMap75.mapNameToValue = map76;
        java.util.Map map78 = null;
        hashEntityMap75.mapNameToValue = map78;
        java.util.Map map80 = null;
        hashEntityMap75.mapNameToValue = map80;
        java.util.Map map82 = hashEntityMap75.mapValueToName;
        hashEntityMap68.mapNameToValue = map82;
        hashEntityMap61.mapValueToName = map82;
        treeEntityMap43.mapNameToValue = map82;
        java.util.Map map86 = treeEntityMap43.mapNameToValue;
        treeEntityMap0.mapNameToValue = map86;
        treeEntityMap0.add("hi!", (int) '#');
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map86);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        java.lang.String str5 = arrayEntityMap1.name((int) ' ');
        java.lang.Class<?> wildcardClass6 = arrayEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        java.lang.String[] strArray19 = binaryEntityMap1.names;
        binaryEntityMap1.add("", (int) 'a');
        int int23 = binaryEntityMap1.growBy;
        binaryEntityMap1.size = (byte) 10;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        java.util.Map map2 = null;
        hashEntityMap0.mapNameToValue = map2;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        java.util.Map map10 = hashEntityMap5.mapValueToName;
        hashEntityMap4.mapValueToName = map10;
        hashEntityMap0.mapNameToValue = map10;
        java.util.Map map13 = hashEntityMap0.mapNameToValue;
        java.util.Map map14 = null;
        hashEntityMap0.mapValueToName = map14;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap16.add("", (int) (byte) 100);
        java.util.Map map20 = hashEntityMap16.mapNameToValue;
        hashEntityMap0.mapValueToName = map20;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.entityName((int) (byte) 1);
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(entityMap12);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities12 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities12.map;
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities12.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap16.add("hi!", 0);
        arrayEntityMap16.size = (byte) 1;
        arrayEntityMap16.growBy = 100;
        java.lang.String str25 = arrayEntityMap16.name((int) (byte) 1);
        entities12.map = arrayEntityMap16;
        entities0.map = arrayEntityMap16;
        java.io.Writer writer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer28, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(entities12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.add("", (int) '4');
        int int7 = binaryEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        java.lang.String[] strArray19 = binaryEntityMap1.names;
        binaryEntityMap1.add("", 10);
        binaryEntityMap1.ensureCapacity(10);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "" };
        binaryEntityMap1.names = strArray27;
        int int29 = binaryEntityMap1.size;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[33]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap8.mapValueToName;
        hashEntityMap0.mapNameToValue = map15;
        int int18 = hashEntityMap0.value("");
        java.util.Map map19 = null;
        hashEntityMap0.mapNameToValue = map19;
        java.util.Map map21 = hashEntityMap0.mapNameToValue;
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(map21);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) '4');
        entities0.addEntity("hi!", 32);
        int int10 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
// flaky "4) test0571(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
// flaky "2) test0571(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        java.util.Map map2 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap3 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = null;
        hashEntityMap4.mapNameToValue = map5;
        java.util.Map map7 = null;
        hashEntityMap4.mapNameToValue = map7;
        java.util.Map map9 = null;
        hashEntityMap4.mapNameToValue = map9;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = null;
        hashEntityMap11.mapNameToValue = map12;
        java.util.Map map14 = null;
        hashEntityMap11.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap11.mapNameToValue = map16;
        java.util.Map map18 = hashEntityMap11.mapValueToName;
        hashEntityMap4.mapNameToValue = map18;
        treeEntityMap3.mapValueToName = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = null;
        hashEntityMap21.mapNameToValue = map22;
        java.lang.String str25 = hashEntityMap21.name((int) '4');
        java.lang.String str27 = hashEntityMap21.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = null;
        hashEntityMap28.mapNameToValue = map29;
        java.util.Map map31 = null;
        hashEntityMap28.mapNameToValue = map31;
        java.util.Map map33 = null;
        hashEntityMap28.mapNameToValue = map33;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = null;
        hashEntityMap35.mapNameToValue = map36;
        java.util.Map map38 = null;
        hashEntityMap35.mapNameToValue = map38;
        java.util.Map map40 = null;
        hashEntityMap35.mapNameToValue = map40;
        java.util.Map map42 = hashEntityMap35.mapValueToName;
        hashEntityMap28.mapNameToValue = map42;
        hashEntityMap21.mapValueToName = map42;
        treeEntityMap3.mapNameToValue = map42;
        java.util.Map map46 = treeEntityMap3.mapNameToValue;
        hashEntityMap0.mapValueToName = map46;
        java.util.Map map48 = hashEntityMap0.mapValueToName;
        java.util.Map map49 = hashEntityMap0.mapValueToName;
        java.lang.Class<?> wildcardClass50 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        int int9 = hashEntityMap0.value("hi!");
        java.lang.String str11 = hashEntityMap0.name(1);
        hashEntityMap0.add("hi!", 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer3, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
// flaky "5) test0574(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", 100);
        java.lang.String str7 = entities0.entityName((int) (byte) 100);
        java.lang.String str9 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(entityMap10);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        int int9 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", 35);
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray19 = new int[] { ' ', '4' };
        binaryEntityMap16.values = intArray19;
        int int22 = binaryEntityMap16.value("");
        binaryEntityMap16.add("hi!", (int) (short) 100);
        int[] intArray26 = binaryEntityMap16.values;
        binaryEntityMap1.values = intArray26;
        java.lang.String str29 = binaryEntityMap1.name((int) (short) 1);
        binaryEntityMap1.add("", (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 97, 100 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 97, 100 });
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.lang.String str6 = hashEntityMap0.name(10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.lang.String str11 = hashEntityMap7.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.lang.String str16 = hashEntityMap12.name((int) '4');
        java.lang.String str18 = hashEntityMap12.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap19.mapNameToValue = map22;
        java.util.Map map24 = null;
        hashEntityMap19.mapNameToValue = map24;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = null;
        hashEntityMap26.mapNameToValue = map27;
        java.util.Map map29 = null;
        hashEntityMap26.mapNameToValue = map29;
        java.util.Map map31 = null;
        hashEntityMap26.mapNameToValue = map31;
        java.util.Map map33 = hashEntityMap26.mapValueToName;
        hashEntityMap19.mapNameToValue = map33;
        hashEntityMap12.mapValueToName = map33;
        hashEntityMap7.mapValueToName = map33;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = null;
        hashEntityMap37.mapNameToValue = map38;
        java.util.Map map40 = null;
        hashEntityMap37.mapNameToValue = map40;
        java.util.Map map42 = null;
        hashEntityMap37.mapNameToValue = map42;
        java.util.Map map44 = hashEntityMap37.mapValueToName;
        java.util.Map map45 = hashEntityMap37.mapNameToValue;
        java.util.Map map46 = hashEntityMap37.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int49 = hashEntityMap47.value("");
        java.util.Map map50 = hashEntityMap47.mapValueToName;
        hashEntityMap37.mapValueToName = map50;
        hashEntityMap7.mapNameToValue = map50;
        hashEntityMap0.mapValueToName = map50;
        java.util.Map map54 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
// flaky "6) test0578(org.apache.commons.lang.RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 2 out of bounds for int[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities7.map;
        java.lang.String str10 = entities7.unescape("hi!");
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities11.map;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities11.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap15.add("hi!", 0);
        arrayEntityMap15.size = (byte) 1;
        arrayEntityMap15.growBy = 100;
        java.lang.String str24 = arrayEntityMap15.name((int) (byte) 1);
        entities11.map = arrayEntityMap15;
        entities7.map = arrayEntityMap15;
        entities0.map = arrayEntityMap15;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap28 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str30 = lookupEntityMap28.name(0);
        java.lang.String str32 = lookupEntityMap28.name((int) (short) 0);
        entities0.map = lookupEntityMap28;
        java.lang.String str35 = lookupEntityMap28.name(52);
        lookupEntityMap28.add("", (int) '#');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.util.Map map11 = hashEntityMap6.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapValueToName;
        java.util.Map map14 = null;
        hashEntityMap12.mapNameToValue = map14;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.lang.String str21 = hashEntityMap17.name((int) '4');
        java.util.Map map22 = hashEntityMap17.mapValueToName;
        hashEntityMap16.mapValueToName = map22;
        hashEntityMap12.mapNameToValue = map22;
        hashEntityMap6.mapNameToValue = map22;
        java.lang.String str27 = hashEntityMap6.name(2);
        java.util.Map map28 = hashEntityMap6.mapNameToValue;
        entities0.map = hashEntityMap6;
        java.util.Map map30 = hashEntityMap6.mapValueToName;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(2);
        binaryEntityMap1.growBy = 100;
        binaryEntityMap1.growBy = 32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        arrayEntityMap7.size = (byte) 0;
        int int13 = arrayEntityMap7.size;
        int int15 = arrayEntityMap7.value("");
        java.lang.String str17 = arrayEntityMap7.name((int) (short) 0);
        arrayEntityMap7.add("", 32);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int24 = binaryEntityMap22.value("hi!");
        binaryEntityMap22.add("", 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap29 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int31 = binaryEntityMap29.value("hi!");
        binaryEntityMap29.add("", 0);
        java.lang.String str36 = binaryEntityMap29.name((int) '#');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap38 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray41 = new int[] { ' ', '4' };
        binaryEntityMap38.values = intArray41;
        binaryEntityMap29.values = intArray41;
        binaryEntityMap22.values = intArray41;
        arrayEntityMap7.values = intArray41;
        binaryEntityMap1.values = intArray41;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 32, 52 });
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.add("hi!", 0);
        int int7 = arrayEntityMap1.size;
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.ensureCapacity((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.size = '#';
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 35 out of bounds for object array[32]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = lookupEntityMap0.name((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", 100);
        java.lang.String str7 = entities0.entityName((int) (byte) 100);
        java.lang.String str9 = entities0.escape("hi!");
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int10 = binaryEntityMap1.value("hi!");
        int int12 = binaryEntityMap1.value("hi!");
        org.apache.commons.lang.Entities entities13 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities13.map;
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities13.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap17.add("hi!", 0);
        arrayEntityMap17.size = (byte) 1;
        arrayEntityMap17.growBy = 100;
        java.lang.String str26 = arrayEntityMap17.name((int) (byte) 1);
        entities13.map = arrayEntityMap17;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap29 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap29.growBy = (-1);
        int[] intArray32 = arrayEntityMap29.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap34 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap34.add("hi!", 0);
        arrayEntityMap34.size = (byte) 1;
        arrayEntityMap34.growBy = 100;
        java.lang.String[] strArray42 = arrayEntityMap34.names;
        arrayEntityMap29.names = strArray42;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap45 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray48 = new int[] { ' ', '4' };
        binaryEntityMap45.values = intArray48;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap51 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray52 = arrayEntityMap51.values;
        java.lang.String str54 = arrayEntityMap51.name((int) (short) 100);
        int[] intArray57 = new int[] { (short) -1, 10 };
        arrayEntityMap51.values = intArray57;
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        arrayEntityMap51.names = strArray60;
        binaryEntityMap45.names = strArray60;
        arrayEntityMap29.names = strArray60;
        arrayEntityMap17.names = strArray60;
        binaryEntityMap1.names = strArray60;
        int int67 = binaryEntityMap1.value("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 0 });
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        java.lang.String str5 = entities0.entityName(0);
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap6 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap6.add("hi!", (int) (short) 1);
        java.lang.String str11 = lookupEntityMap6.name(0);
        java.lang.String str13 = lookupEntityMap6.name((int) (byte) 10);
        entities0.map = lookupEntityMap6;
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str7 = binaryEntityMap5.name((-1));
        entities0.map = binaryEntityMap5;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray13 = new int[] { ' ', '4' };
        binaryEntityMap10.values = intArray13;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray17 = arrayEntityMap16.values;
        java.lang.String str19 = arrayEntityMap16.name((int) (short) 100);
        int[] intArray22 = new int[] { (short) -1, 10 };
        arrayEntityMap16.values = intArray22;
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        arrayEntityMap16.names = strArray25;
        binaryEntityMap10.names = strArray25;
        java.lang.String[] strArray28 = binaryEntityMap10.names;
        entities0.map = binaryEntityMap10;
        java.io.Writer writer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer30, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
// flaky "7) test0589(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "3) test0589(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 160, 52 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0 });
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray25);
// flaky "1) test0589(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "nbsp" });
        org.junit.Assert.assertNotNull(strArray28);
// flaky "1) test0589(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "nbsp" });
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.escape("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        int int4 = arrayEntityMap1.growBy;
        arrayEntityMap1.growBy = (byte) 10;
        java.lang.Class<?> wildcardClass7 = arrayEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int2 = arrayEntityMap1.size;
        int int3 = arrayEntityMap1.growBy;
        java.lang.String str5 = arrayEntityMap1.name((int) (short) 100);
        int int7 = arrayEntityMap1.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap9.add("hi!", 0);
        arrayEntityMap9.size = (byte) 1;
        arrayEntityMap9.growBy = 100;
        java.lang.String[] strArray17 = arrayEntityMap9.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap19.add("hi!", 0);
        arrayEntityMap19.size = (byte) 1;
        arrayEntityMap19.growBy = 100;
        java.lang.String[] strArray27 = arrayEntityMap19.names;
        arrayEntityMap9.names = strArray27;
        arrayEntityMap1.names = strArray27;
        arrayEntityMap1.growBy = (byte) 1;
        int[] intArray32 = arrayEntityMap1.values;
        arrayEntityMap1.growBy = 'a';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        java.lang.String str4 = entities0.entityName((int) '#');
        int int6 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap1.mapValueToName = map27;
        entities0.map = hashEntityMap1;
        java.lang.String str33 = entities0.escape("hi!");
        java.lang.String str35 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities0.map = arrayEntityMap37;
        java.lang.String str40 = entities0.unescape("");
        java.lang.String str42 = entities0.unescape("");
        java.io.Writer writer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer43, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities12 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities12.map;
        java.lang.String str15 = entities12.unescape("hi!");
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities16.map;
        org.apache.commons.lang.Entities.EntityMap entityMap18 = entities16.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap20 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap20.add("hi!", 0);
        arrayEntityMap20.size = (byte) 1;
        arrayEntityMap20.growBy = 100;
        java.lang.String str29 = arrayEntityMap20.name((int) (byte) 1);
        entities16.map = arrayEntityMap20;
        entities12.map = arrayEntityMap20;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities12);
        org.apache.commons.lang.Entities entities33 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray34 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities33.addEntities(strArray34);
        entities12.addEntities(strArray34);
        entities0.addEntities(strArray34);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(entities12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertNotNull(entityMap17);
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(entities33);
        org.junit.Assert.assertNotNull(strArray34);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("");
        int int4 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        java.lang.String str4 = entities0.escape("hi!");
        java.lang.String str6 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.lang.String[][] strArray19 = new java.lang.String[][] { strArray12, strArray14, strArray16, strArray18 };
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntities(strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
// flaky "8) test0598(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray8, new int[] { 160, 10 });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("hi!", (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        int[] intArray7 = new int[] {};
        arrayEntityMap1.values = intArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = arrayEntityMap1.name((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] {});
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        java.lang.String[] strArray19 = binaryEntityMap1.names;
        binaryEntityMap1.add("", 10);
        binaryEntityMap1.ensureCapacity(10);
        java.lang.String str26 = binaryEntityMap1.name(35);
        binaryEntityMap1.add("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        int int6 = binaryEntityMap1.size;
        java.lang.String str8 = binaryEntityMap1.name(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap1.mapValueToName = map27;
        entities0.map = hashEntityMap1;
        java.lang.String str33 = entities0.escape("hi!");
        java.lang.String str35 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities0.map = arrayEntityMap37;
        java.lang.String[][] strArray39 = new java.lang.String[][] {};
        entities0.addEntities(strArray39);
        java.lang.String str42 = entities0.entityName(0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[][] {});
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        java.lang.String[] strArray19 = binaryEntityMap1.names;
        binaryEntityMap1.add("", 10);
        binaryEntityMap1.ensureCapacity(10);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[33]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int4 = arrayEntityMap2.value("hi!");
        int int5 = arrayEntityMap2.growBy;
        int int6 = arrayEntityMap2.size;
        java.lang.String[] strArray7 = null;
        arrayEntityMap2.names = strArray7;
        int[] intArray9 = arrayEntityMap2.values;
        binaryEntityMap0.values = intArray9;
        java.lang.String str12 = binaryEntityMap0.name(32);
        binaryEntityMap0.add("hi!", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100 });
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("");
        int int4 = lookupEntityMap0.value("");
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        java.lang.String str11 = hashEntityMap5.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = null;
        hashEntityMap12.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap12.mapNameToValue = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap19.mapNameToValue = map22;
        java.util.Map map24 = null;
        hashEntityMap19.mapNameToValue = map24;
        java.util.Map map26 = hashEntityMap19.mapValueToName;
        hashEntityMap12.mapNameToValue = map26;
        hashEntityMap5.mapValueToName = map26;
        hashEntityMap0.mapValueToName = map26;
        java.util.Map map30 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap31 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = null;
        hashEntityMap32.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap32.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap32.mapNameToValue = map37;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map40 = null;
        hashEntityMap39.mapNameToValue = map40;
        java.util.Map map42 = null;
        hashEntityMap39.mapNameToValue = map42;
        java.util.Map map44 = null;
        hashEntityMap39.mapNameToValue = map44;
        java.util.Map map46 = hashEntityMap39.mapValueToName;
        hashEntityMap32.mapNameToValue = map46;
        treeEntityMap31.mapValueToName = map46;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map50 = null;
        hashEntityMap49.mapNameToValue = map50;
        java.lang.String str53 = hashEntityMap49.name((int) '4');
        java.lang.String str55 = hashEntityMap49.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map57 = null;
        hashEntityMap56.mapNameToValue = map57;
        java.util.Map map59 = null;
        hashEntityMap56.mapNameToValue = map59;
        java.util.Map map61 = null;
        hashEntityMap56.mapNameToValue = map61;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map64 = null;
        hashEntityMap63.mapNameToValue = map64;
        java.util.Map map66 = null;
        hashEntityMap63.mapNameToValue = map66;
        java.util.Map map68 = null;
        hashEntityMap63.mapNameToValue = map68;
        java.util.Map map70 = hashEntityMap63.mapValueToName;
        hashEntityMap56.mapNameToValue = map70;
        hashEntityMap49.mapValueToName = map70;
        treeEntityMap31.mapNameToValue = map70;
        hashEntityMap0.mapValueToName = map70;
        java.lang.String str76 = hashEntityMap0.name((int) '4');
        java.util.Map map77 = hashEntityMap0.mapValueToName;
        java.util.Map map78 = hashEntityMap0.mapNameToValue;
        java.lang.String str80 = hashEntityMap0.name((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int82 = hashEntityMap0.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(map78);
        org.junit.Assert.assertNull(str80);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        binaryEntityMap1.ensureCapacity((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapValueToName;
        java.util.Map map11 = hashEntityMap9.mapNameToValue;
        hashEntityMap0.mapValueToName = map11;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.lang.String str18 = hashEntityMap14.name((int) '4');
        java.util.Map map19 = hashEntityMap14.mapValueToName;
        hashEntityMap13.mapValueToName = map19;
        java.util.Map map21 = hashEntityMap13.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = null;
        hashEntityMap23.mapNameToValue = map24;
        java.lang.String str27 = hashEntityMap23.name((int) '4');
        java.util.Map map28 = hashEntityMap23.mapValueToName;
        hashEntityMap22.mapValueToName = map28;
        java.util.Map map30 = hashEntityMap22.mapValueToName;
        hashEntityMap13.mapNameToValue = map30;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = null;
        hashEntityMap32.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap32.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap32.mapNameToValue = map37;
        java.util.Map map39 = hashEntityMap32.mapValueToName;
        hashEntityMap13.mapNameToValue = map39;
        hashEntityMap0.mapNameToValue = map39;
        java.lang.String str43 = hashEntityMap0.name((int) ' ');
        java.lang.String str45 = hashEntityMap0.name(52);
        java.util.Map map46 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("", (int) (short) 10);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str9 = entities0.unescape("");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap10 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap10.add("hi!", (int) (short) 1);
        java.lang.String str15 = lookupEntityMap10.name(0);
        java.lang.String str17 = lookupEntityMap10.name((int) (byte) 10);
        entities0.map = lookupEntityMap10;
        org.junit.Assert.assertNotNull(entities0);
// flaky "9) test0610(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap3 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = null;
        hashEntityMap4.mapNameToValue = map5;
        java.lang.String str8 = hashEntityMap4.name((int) '4');
        java.util.Map map9 = hashEntityMap4.mapValueToName;
        hashEntityMap3.mapValueToName = map9;
        hashEntityMap0.mapValueToName = map9;
        java.util.Map map12 = hashEntityMap0.mapValueToName;
        java.lang.String str14 = hashEntityMap0.name(0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hashEntityMap0.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.escape("");
        entities0.addEntity("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str7 = binaryEntityMap5.name((-1));
        entities0.map = binaryEntityMap5;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray13 = new int[] { ' ', '4' };
        binaryEntityMap10.values = intArray13;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray17 = arrayEntityMap16.values;
        java.lang.String str19 = arrayEntityMap16.name((int) (short) 100);
        int[] intArray22 = new int[] { (short) -1, 10 };
        arrayEntityMap16.values = intArray22;
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        arrayEntityMap16.names = strArray25;
        binaryEntityMap10.names = strArray25;
        java.lang.String[] strArray28 = binaryEntityMap10.names;
        entities0.map = binaryEntityMap10;
        binaryEntityMap10.add("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 100, 52 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0 });
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapValueToName;
        java.util.Map map6 = hashEntityMap4.mapNameToValue;
        entities0.map = hashEntityMap4;
        int int9 = hashEntityMap4.value("");
        java.util.Map map10 = hashEntityMap4.mapValueToName;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        java.util.Map map4 = null;
        hashEntityMap0.mapValueToName = map4;
        int int7 = hashEntityMap0.value("");
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        int int11 = hashEntityMap0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = hashEntityMap0.name(52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '#');
        java.lang.Class<?> wildcardClass2 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(52);
        int int10 = lookupEntityMap0.value("");
        java.lang.String str12 = lookupEntityMap0.name(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = lookupEntityMap0.name((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        java.lang.String str11 = binaryEntityMap1.name((int) (byte) 10);
        java.lang.String str13 = binaryEntityMap1.name((int) (byte) -1);
        java.lang.String str15 = binaryEntityMap1.name(52);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.util.Map map10 = null;
        hashEntityMap7.mapNameToValue = map10;
        java.util.Map map12 = null;
        hashEntityMap7.mapNameToValue = map12;
        java.util.Map map14 = hashEntityMap7.mapValueToName;
        hashEntityMap0.mapNameToValue = map14;
        int int17 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("", (int) (byte) 1);
        java.util.Map map21 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapValueToName;
        java.util.Map map24 = null;
        hashEntityMap22.mapNameToValue = map24;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap26 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = null;
        hashEntityMap27.mapNameToValue = map28;
        java.util.Map map30 = null;
        hashEntityMap27.mapNameToValue = map30;
        java.util.Map map32 = null;
        hashEntityMap27.mapNameToValue = map32;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = null;
        hashEntityMap34.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap34.mapNameToValue = map37;
        java.util.Map map39 = null;
        hashEntityMap34.mapNameToValue = map39;
        java.util.Map map41 = hashEntityMap34.mapValueToName;
        hashEntityMap27.mapNameToValue = map41;
        treeEntityMap26.mapValueToName = map41;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map45 = null;
        hashEntityMap44.mapNameToValue = map45;
        java.lang.String str48 = hashEntityMap44.name((int) '4');
        java.lang.String str50 = hashEntityMap44.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map52 = null;
        hashEntityMap51.mapNameToValue = map52;
        java.util.Map map54 = null;
        hashEntityMap51.mapNameToValue = map54;
        java.util.Map map56 = null;
        hashEntityMap51.mapNameToValue = map56;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap58 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map59 = null;
        hashEntityMap58.mapNameToValue = map59;
        java.util.Map map61 = null;
        hashEntityMap58.mapNameToValue = map61;
        java.util.Map map63 = null;
        hashEntityMap58.mapNameToValue = map63;
        java.util.Map map65 = hashEntityMap58.mapValueToName;
        hashEntityMap51.mapNameToValue = map65;
        hashEntityMap44.mapValueToName = map65;
        treeEntityMap26.mapNameToValue = map65;
        hashEntityMap22.mapValueToName = map65;
        java.lang.String str71 = hashEntityMap22.name(100);
        java.util.Map map72 = hashEntityMap22.mapValueToName;
        hashEntityMap0.mapNameToValue = map72;
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.Class<?> wildcardClass13 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        java.lang.String str16 = binaryEntityMap1.name((int) 'a');
        binaryEntityMap1.add("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 100 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) -1);
        int[] intArray4 = binaryEntityMap1.values;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        java.lang.String str11 = hashEntityMap5.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = null;
        hashEntityMap12.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap12.mapNameToValue = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap19.mapNameToValue = map22;
        java.util.Map map24 = null;
        hashEntityMap19.mapNameToValue = map24;
        java.util.Map map26 = hashEntityMap19.mapValueToName;
        hashEntityMap12.mapNameToValue = map26;
        hashEntityMap5.mapValueToName = map26;
        hashEntityMap0.mapValueToName = map26;
        java.util.Map map30 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap31 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = null;
        hashEntityMap32.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap32.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap32.mapNameToValue = map37;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map40 = null;
        hashEntityMap39.mapNameToValue = map40;
        java.util.Map map42 = null;
        hashEntityMap39.mapNameToValue = map42;
        java.util.Map map44 = null;
        hashEntityMap39.mapNameToValue = map44;
        java.util.Map map46 = hashEntityMap39.mapValueToName;
        hashEntityMap32.mapNameToValue = map46;
        treeEntityMap31.mapValueToName = map46;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map50 = null;
        hashEntityMap49.mapNameToValue = map50;
        java.lang.String str53 = hashEntityMap49.name((int) '4');
        java.lang.String str55 = hashEntityMap49.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map57 = null;
        hashEntityMap56.mapNameToValue = map57;
        java.util.Map map59 = null;
        hashEntityMap56.mapNameToValue = map59;
        java.util.Map map61 = null;
        hashEntityMap56.mapNameToValue = map61;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map64 = null;
        hashEntityMap63.mapNameToValue = map64;
        java.util.Map map66 = null;
        hashEntityMap63.mapNameToValue = map66;
        java.util.Map map68 = null;
        hashEntityMap63.mapNameToValue = map68;
        java.util.Map map70 = hashEntityMap63.mapValueToName;
        hashEntityMap56.mapNameToValue = map70;
        hashEntityMap49.mapValueToName = map70;
        treeEntityMap31.mapNameToValue = map70;
        hashEntityMap0.mapValueToName = map70;
        java.lang.String str76 = hashEntityMap0.name((int) '4');
        java.util.Map map77 = hashEntityMap0.mapValueToName;
        java.util.Map map78 = hashEntityMap0.mapNameToValue;
        java.lang.String str80 = hashEntityMap0.name((int) (short) 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap81 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap82 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map83 = null;
        hashEntityMap82.mapNameToValue = map83;
        java.lang.String str86 = hashEntityMap82.name((int) '4');
        java.util.Map map87 = hashEntityMap82.mapValueToName;
        hashEntityMap81.mapValueToName = map87;
        int int90 = hashEntityMap81.value("hi!");
        java.lang.String str92 = hashEntityMap81.name(1);
        java.util.Map map93 = hashEntityMap81.mapValueToName;
        hashEntityMap0.mapValueToName = map93;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(map78);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNotNull(map93);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        binaryEntityMap1.add("", (int) (byte) 1);
        int int10 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.add("hi!", 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap8.ensureCapacity((-1));
        binaryEntityMap8.ensureCapacity((int) (byte) 1);
        binaryEntityMap8.add("hi!", (int) (byte) 0);
        java.lang.String[] strArray16 = binaryEntityMap8.names;
        arrayEntityMap1.names = strArray16;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", null, null, null, null, null, null, null, null, null });
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(1);
        java.lang.Class<?> wildcardClass2 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.entityName(10);
        entities0.addEntity("", 52);
        entities0.addEntity("", (int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 52, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        binaryEntityMap1.add("", 1);
        java.lang.String[] strArray12 = binaryEntityMap1.names;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.add("hi!", (int) (byte) 0);
        java.lang.String[] strArray10 = arrayEntityMap1.names;
        java.lang.String str12 = arrayEntityMap1.name((int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer5 = null;
        entities0.escape(writer5, "");
        entities0.addEntity("hi!", (int) (short) 0);
        org.junit.Assert.assertNotNull(entities0);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.HTML32;
        int int12 = entities10.entityValue("");
        java.lang.String[][] strArray13 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities10.addEntities(strArray13);
        entities0.addEntities(strArray13);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("", 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) '4');
        java.lang.String str7 = entities0.unescape("");
        java.lang.String str9 = entities0.entityName(52);
        org.junit.Assert.assertNotNull(entities0);
// flaky "10) test0633(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "4) test0633(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = null;
        hashEntityMap11.mapNameToValue = map12;
        java.lang.String str15 = hashEntityMap11.name((int) '4');
        java.lang.String str17 = hashEntityMap11.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = null;
        hashEntityMap18.mapNameToValue = map19;
        java.util.Map map21 = null;
        hashEntityMap18.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap18.mapNameToValue = map23;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = null;
        hashEntityMap25.mapNameToValue = map26;
        java.util.Map map28 = null;
        hashEntityMap25.mapNameToValue = map28;
        java.util.Map map30 = null;
        hashEntityMap25.mapNameToValue = map30;
        java.util.Map map32 = hashEntityMap25.mapValueToName;
        hashEntityMap18.mapNameToValue = map32;
        hashEntityMap11.mapValueToName = map32;
        hashEntityMap6.mapValueToName = map32;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = null;
        hashEntityMap36.mapNameToValue = map37;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = null;
        hashEntityMap40.mapNameToValue = map41;
        java.lang.String str44 = hashEntityMap40.name((int) '4');
        java.util.Map map45 = hashEntityMap40.mapValueToName;
        hashEntityMap39.mapValueToName = map45;
        hashEntityMap36.mapValueToName = map45;
        hashEntityMap6.mapValueToName = map45;
        entities0.map = hashEntityMap6;
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str9 = binaryEntityMap7.name((int) '#');
        binaryEntityMap7.add("", (int) (byte) -1);
        java.lang.String str14 = binaryEntityMap7.name((int) (byte) 10);
        entities0.map = binaryEntityMap7;
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray19 = arrayEntityMap18.values;
        java.lang.String str21 = arrayEntityMap18.name((int) (short) 100);
        int[] intArray24 = new int[] { (short) -1, 10 };
        arrayEntityMap18.values = intArray24;
        entities16.map = arrayEntityMap18;
        int int28 = entities16.entityValue("");
        org.apache.commons.lang.Entities entities29 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap30 = entities29.map;
        java.lang.String str32 = entities29.unescape("hi!");
        org.apache.commons.lang.Entities entities33 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap34 = entities33.map;
        org.apache.commons.lang.Entities.EntityMap entityMap35 = entities33.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap37.add("hi!", 0);
        arrayEntityMap37.size = (byte) 1;
        arrayEntityMap37.growBy = 100;
        java.lang.String str46 = arrayEntityMap37.name((int) (byte) 1);
        entities33.map = arrayEntityMap37;
        entities29.map = arrayEntityMap37;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities29);
        org.apache.commons.lang.Entities entities50 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray51 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities50.addEntities(strArray51);
        entities29.addEntities(strArray51);
        entities16.addEntities(strArray51);
        entities0.addEntities(strArray51);
        java.io.Writer writer56 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer56, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0 });
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 160, 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(entities29);
        org.junit.Assert.assertNotNull(entityMap30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(entities33);
        org.junit.Assert.assertNotNull(entityMap34);
        org.junit.Assert.assertNotNull(entityMap35);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(entities50);
        org.junit.Assert.assertNotNull(strArray51);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.lang.String str5 = hashEntityMap0.name((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap1.name(100);
        int int8 = binaryEntityMap1.value("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((-1));
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.add("", (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        int[] intArray6 = binaryEntityMap1.values;
        int int7 = binaryEntityMap1.size;
        binaryEntityMap1.size = 1;
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray6 = arrayEntityMap5.values;
        java.lang.String str8 = arrayEntityMap5.name((int) (short) 100);
        int[] intArray11 = new int[] { (short) -1, 10 };
        arrayEntityMap5.values = intArray11;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        arrayEntityMap5.names = strArray14;
        binaryEntityMap1.names = strArray14;
        int int18 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        arrayEntityMap1.size = (byte) 100;
        arrayEntityMap1.size = 100;
        int int8 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        int int13 = lookupEntityMap0.value("");
        java.lang.String str15 = lookupEntityMap0.name((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = lookupEntityMap0.name((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str9 = binaryEntityMap7.name((int) '#');
        binaryEntityMap7.add("", (int) (byte) -1);
        java.lang.String str14 = binaryEntityMap7.name((int) (byte) 10);
        entities0.map = binaryEntityMap7;
        binaryEntityMap7.add("", (int) '4');
        java.lang.String str20 = binaryEntityMap7.name(10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap6.add("hi!", 0);
        arrayEntityMap6.size = (byte) 1;
        arrayEntityMap6.growBy = 100;
        entities0.map = arrayEntityMap6;
        arrayEntityMap6.ensureCapacity(0);
        org.junit.Assert.assertNotNull(entities0);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap8.mapValueToName;
        hashEntityMap0.mapNameToValue = map15;
        int int18 = hashEntityMap0.value("");
        java.util.Map map19 = null;
        hashEntityMap0.mapNameToValue = map19;
        java.util.Map map21 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = null;
        hashEntityMap22.mapNameToValue = map23;
        java.lang.String str26 = hashEntityMap22.name((int) '4');
        java.lang.String str28 = hashEntityMap22.name((int) (byte) 1);
        java.lang.String str30 = hashEntityMap22.name(100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = null;
        hashEntityMap35.mapNameToValue = map36;
        java.lang.String str39 = hashEntityMap35.name((int) '4');
        java.util.Map map40 = hashEntityMap35.mapValueToName;
        hashEntityMap34.mapValueToName = map40;
        hashEntityMap31.mapValueToName = map40;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = null;
        hashEntityMap43.mapNameToValue = map44;
        java.util.Map map46 = hashEntityMap43.mapNameToValue;
        java.util.Map map47 = hashEntityMap43.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = null;
        hashEntityMap48.mapNameToValue = map49;
        java.lang.String str52 = hashEntityMap48.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = null;
        hashEntityMap53.mapNameToValue = map54;
        java.lang.String str57 = hashEntityMap53.name((int) '4');
        java.lang.String str59 = hashEntityMap53.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map61 = null;
        hashEntityMap60.mapNameToValue = map61;
        java.util.Map map63 = null;
        hashEntityMap60.mapNameToValue = map63;
        java.util.Map map65 = null;
        hashEntityMap60.mapNameToValue = map65;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map68 = null;
        hashEntityMap67.mapNameToValue = map68;
        java.util.Map map70 = null;
        hashEntityMap67.mapNameToValue = map70;
        java.util.Map map72 = null;
        hashEntityMap67.mapNameToValue = map72;
        java.util.Map map74 = hashEntityMap67.mapValueToName;
        hashEntityMap60.mapNameToValue = map74;
        hashEntityMap53.mapValueToName = map74;
        hashEntityMap48.mapValueToName = map74;
        hashEntityMap43.mapNameToValue = map74;
        java.util.Map map79 = hashEntityMap43.mapNameToValue;
        hashEntityMap31.mapValueToName = map79;
        hashEntityMap22.mapNameToValue = map79;
        hashEntityMap0.mapValueToName = map79;
        java.util.Map map83 = hashEntityMap0.mapNameToValue;
        // The following exception was thrown during execution in test generation
        try {
            int int85 = hashEntityMap0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNull(map83);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        binaryEntityMap1.growBy = 100;
        binaryEntityMap1.growBy = 100;
        binaryEntityMap1.add("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap23.add("hi!", 0);
        java.lang.String str28 = arrayEntityMap23.name(0);
        int[] intArray29 = arrayEntityMap23.values;
        binaryEntityMap1.values = intArray29;
        java.lang.String str32 = binaryEntityMap1.name((int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("hi!");
        java.lang.String str12 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "11) test0647(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        arrayEntityMap1.growBy = 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray11 = new int[] { ' ', '4' };
        binaryEntityMap8.values = intArray11;
        binaryEntityMap8.size = '#';
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray17 = arrayEntityMap16.values;
        java.lang.String str19 = arrayEntityMap16.name((int) (short) 100);
        int int21 = arrayEntityMap16.value("hi!");
        arrayEntityMap16.size = (byte) 0;
        int int24 = arrayEntityMap16.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap26.add("hi!", 0);
        arrayEntityMap26.size = (byte) 1;
        int[] intArray32 = new int[] {};
        arrayEntityMap26.values = intArray32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap35 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int37 = arrayEntityMap35.value("");
        java.lang.String[] strArray38 = arrayEntityMap35.names;
        arrayEntityMap26.names = strArray38;
        arrayEntityMap16.names = strArray38;
        binaryEntityMap8.names = strArray38;
        arrayEntityMap1.names = strArray38;
        arrayEntityMap1.add("", (int) '4');
        int int46 = arrayEntityMap1.growBy;
        int int48 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0 });
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(52);
        int int10 = lookupEntityMap0.value("");
        java.lang.String str12 = lookupEntityMap0.name(100);
        java.lang.String str14 = lookupEntityMap0.name((int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap3 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = null;
        hashEntityMap4.mapNameToValue = map5;
        java.lang.String str8 = hashEntityMap4.name((int) '4');
        java.util.Map map9 = hashEntityMap4.mapValueToName;
        hashEntityMap3.mapValueToName = map9;
        hashEntityMap0.mapValueToName = map9;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap12.mapNameToValue;
        java.util.Map map16 = hashEntityMap12.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.lang.String str21 = hashEntityMap17.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = null;
        hashEntityMap22.mapNameToValue = map23;
        java.lang.String str26 = hashEntityMap22.name((int) '4');
        java.lang.String str28 = hashEntityMap22.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = null;
        hashEntityMap29.mapNameToValue = map30;
        java.util.Map map32 = null;
        hashEntityMap29.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap29.mapNameToValue = map34;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = null;
        hashEntityMap36.mapNameToValue = map37;
        java.util.Map map39 = null;
        hashEntityMap36.mapNameToValue = map39;
        java.util.Map map41 = null;
        hashEntityMap36.mapNameToValue = map41;
        java.util.Map map43 = hashEntityMap36.mapValueToName;
        hashEntityMap29.mapNameToValue = map43;
        hashEntityMap22.mapValueToName = map43;
        hashEntityMap17.mapValueToName = map43;
        hashEntityMap12.mapNameToValue = map43;
        java.util.Map map48 = hashEntityMap12.mapNameToValue;
        hashEntityMap0.mapValueToName = map48;
        // The following exception was thrown during execution in test generation
        try {
            int int51 = hashEntityMap0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray12 = arrayEntityMap11.values;
        java.lang.String str14 = arrayEntityMap11.name((int) (short) 100);
        int[] intArray17 = new int[] { (short) -1, 10 };
        arrayEntityMap11.values = intArray17;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        arrayEntityMap11.names = strArray20;
        binaryEntityMap5.names = strArray20;
        binaryEntityMap1.names = strArray20;
        java.lang.String str25 = binaryEntityMap1.name(52);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = lookupEntityMap0.name((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) '4');
        java.lang.String str7 = entities0.escape("");
        java.lang.String str9 = entities0.entityName((int) (short) 1);
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        java.io.Writer writer11 = null;
        entities0.escape(writer11, "");
        org.junit.Assert.assertNotNull(entities0);
// flaky "12) test0653(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(entityMap10);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        java.lang.String[] strArray19 = binaryEntityMap1.names;
        binaryEntityMap1.add("", 10);
        binaryEntityMap1.ensureCapacity(10);
        int int25 = binaryEntityMap1.growBy;
        binaryEntityMap1.add("", (int) '#');
        binaryEntityMap1.add("", 100);
        int int32 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities4 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities4.map;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities4.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        arrayEntityMap8.growBy = 100;
        java.lang.String str17 = arrayEntityMap8.name((int) (byte) 1);
        entities4.map = arrayEntityMap8;
        entities0.map = arrayEntityMap8;
        int int20 = arrayEntityMap8.growBy;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapValueToName;
        java.util.Map map6 = hashEntityMap4.mapNameToValue;
        entities0.map = hashEntityMap4;
        int int9 = hashEntityMap4.value("");
        int int11 = hashEntityMap4.value("hi!");
        java.util.Map map12 = hashEntityMap4.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        java.util.Map map20 = hashEntityMap13.mapValueToName;
        java.util.Map map21 = hashEntityMap13.mapNameToValue;
        java.util.Map map22 = hashEntityMap13.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int25 = hashEntityMap23.value("");
        java.util.Map map26 = hashEntityMap23.mapValueToName;
        hashEntityMap13.mapValueToName = map26;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = null;
        hashEntityMap28.mapNameToValue = map29;
        java.util.Map map31 = hashEntityMap28.mapNameToValue;
        java.util.Map map32 = hashEntityMap28.mapValueToName;
        java.lang.String str34 = hashEntityMap28.name(10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = null;
        hashEntityMap35.mapNameToValue = map36;
        java.lang.String str39 = hashEntityMap35.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = null;
        hashEntityMap40.mapNameToValue = map41;
        java.lang.String str44 = hashEntityMap40.name((int) '4');
        java.lang.String str46 = hashEntityMap40.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map48 = null;
        hashEntityMap47.mapNameToValue = map48;
        java.util.Map map50 = null;
        hashEntityMap47.mapNameToValue = map50;
        java.util.Map map52 = null;
        hashEntityMap47.mapNameToValue = map52;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map55 = null;
        hashEntityMap54.mapNameToValue = map55;
        java.util.Map map57 = null;
        hashEntityMap54.mapNameToValue = map57;
        java.util.Map map59 = null;
        hashEntityMap54.mapNameToValue = map59;
        java.util.Map map61 = hashEntityMap54.mapValueToName;
        hashEntityMap47.mapNameToValue = map61;
        hashEntityMap40.mapValueToName = map61;
        hashEntityMap35.mapValueToName = map61;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = null;
        hashEntityMap65.mapNameToValue = map66;
        java.util.Map map68 = null;
        hashEntityMap65.mapNameToValue = map68;
        java.util.Map map70 = null;
        hashEntityMap65.mapNameToValue = map70;
        java.util.Map map72 = hashEntityMap65.mapValueToName;
        java.util.Map map73 = hashEntityMap65.mapNameToValue;
        java.util.Map map74 = hashEntityMap65.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int77 = hashEntityMap75.value("");
        java.util.Map map78 = hashEntityMap75.mapValueToName;
        hashEntityMap65.mapValueToName = map78;
        hashEntityMap35.mapNameToValue = map78;
        hashEntityMap28.mapValueToName = map78;
        hashEntityMap13.mapValueToName = map78;
        hashEntityMap4.mapValueToName = map78;
        java.lang.String str85 = hashEntityMap4.name((-1));
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNull(str85);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 0);
        java.lang.String[] strArray15 = binaryEntityMap1.names;
        java.lang.String str17 = binaryEntityMap1.name((int) '#');
        int int19 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        java.lang.String[] strArray4 = arrayEntityMap1.names;
        int[] intArray5 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap7.add("hi!", 0);
        java.lang.String str12 = arrayEntityMap7.name(0);
        int[] intArray13 = arrayEntityMap7.values;
        arrayEntityMap1.values = intArray13;
        java.lang.Class<?> wildcardClass15 = arrayEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int10 = arrayEntityMap8.value("");
        arrayEntityMap8.size = (byte) 100;
        arrayEntityMap8.size = 100;
        arrayEntityMap8.ensureCapacity((int) (short) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray19 = arrayEntityMap18.values;
        int int20 = arrayEntityMap18.growBy;
        arrayEntityMap18.add("", (int) (byte) 10);
        int[] intArray24 = arrayEntityMap18.values;
        int[] intArray25 = arrayEntityMap18.values;
        arrayEntityMap8.values = intArray25;
        arrayEntityMap1.values = intArray25;
        java.lang.String str29 = arrayEntityMap1.name((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 10 });
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap0 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.util.Map map4 = null;
        hashEntityMap1.mapNameToValue = map4;
        java.util.Map map6 = null;
        hashEntityMap1.mapNameToValue = map6;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap8.mapValueToName;
        hashEntityMap1.mapNameToValue = map15;
        treeEntityMap0.mapValueToName = map15;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = null;
        hashEntityMap18.mapNameToValue = map19;
        java.lang.String str22 = hashEntityMap18.name((int) '4');
        java.lang.String str24 = hashEntityMap18.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = null;
        hashEntityMap25.mapNameToValue = map26;
        java.util.Map map28 = null;
        hashEntityMap25.mapNameToValue = map28;
        java.util.Map map30 = null;
        hashEntityMap25.mapNameToValue = map30;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = null;
        hashEntityMap32.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap32.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap32.mapNameToValue = map37;
        java.util.Map map39 = hashEntityMap32.mapValueToName;
        hashEntityMap25.mapNameToValue = map39;
        hashEntityMap18.mapValueToName = map39;
        treeEntityMap0.mapNameToValue = map39;
        int int44 = treeEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = null;
        hashEntityMap46.mapNameToValue = map47;
        java.lang.String str50 = hashEntityMap46.name((int) '4');
        java.util.Map map51 = hashEntityMap46.mapValueToName;
        hashEntityMap45.mapValueToName = map51;
        java.util.Map map53 = hashEntityMap45.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = null;
        hashEntityMap55.mapNameToValue = map56;
        java.lang.String str59 = hashEntityMap55.name((int) '4');
        java.util.Map map60 = hashEntityMap55.mapValueToName;
        hashEntityMap54.mapValueToName = map60;
        java.util.Map map62 = hashEntityMap54.mapValueToName;
        hashEntityMap45.mapNameToValue = map62;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map65 = null;
        hashEntityMap64.mapNameToValue = map65;
        java.util.Map map67 = null;
        hashEntityMap64.mapNameToValue = map67;
        java.util.Map map69 = null;
        hashEntityMap64.mapNameToValue = map69;
        java.util.Map map71 = hashEntityMap64.mapValueToName;
        hashEntityMap45.mapNameToValue = map71;
        java.util.Map map73 = hashEntityMap45.mapValueToName;
        treeEntityMap0.mapNameToValue = map73;
        treeEntityMap0.add("", (int) (short) 100);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("");
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap4 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.util.Map map8 = null;
        hashEntityMap5.mapNameToValue = map8;
        java.util.Map map10 = null;
        hashEntityMap5.mapNameToValue = map10;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = null;
        hashEntityMap12.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap12.mapNameToValue = map17;
        java.util.Map map19 = hashEntityMap12.mapValueToName;
        hashEntityMap5.mapNameToValue = map19;
        treeEntityMap4.mapValueToName = map19;
        hashEntityMap0.mapValueToName = map19;
        java.util.Map map23 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap24.mapNameToValue;
        java.util.Map map28 = hashEntityMap24.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = null;
        hashEntityMap29.mapNameToValue = map30;
        java.lang.String str33 = hashEntityMap29.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = null;
        hashEntityMap34.mapNameToValue = map35;
        java.lang.String str38 = hashEntityMap34.name((int) '4');
        java.lang.String str40 = hashEntityMap34.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = null;
        hashEntityMap41.mapNameToValue = map42;
        java.util.Map map44 = null;
        hashEntityMap41.mapNameToValue = map44;
        java.util.Map map46 = null;
        hashEntityMap41.mapNameToValue = map46;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = null;
        hashEntityMap48.mapNameToValue = map49;
        java.util.Map map51 = null;
        hashEntityMap48.mapNameToValue = map51;
        java.util.Map map53 = null;
        hashEntityMap48.mapNameToValue = map53;
        java.util.Map map55 = hashEntityMap48.mapValueToName;
        hashEntityMap41.mapNameToValue = map55;
        hashEntityMap34.mapValueToName = map55;
        hashEntityMap29.mapValueToName = map55;
        hashEntityMap24.mapNameToValue = map55;
        java.util.Map map60 = hashEntityMap24.mapNameToValue;
        java.util.Map map61 = hashEntityMap24.mapNameToValue;
        java.util.Map map62 = hashEntityMap24.mapNameToValue;
        hashEntityMap0.mapNameToValue = map62;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        java.lang.String str11 = hashEntityMap5.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = null;
        hashEntityMap12.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap12.mapNameToValue = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap19.mapNameToValue = map22;
        java.util.Map map24 = null;
        hashEntityMap19.mapNameToValue = map24;
        java.util.Map map26 = hashEntityMap19.mapValueToName;
        hashEntityMap12.mapNameToValue = map26;
        hashEntityMap5.mapValueToName = map26;
        hashEntityMap0.mapValueToName = map26;
        java.lang.String str31 = hashEntityMap0.name((int) '#');
        java.util.Map map32 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = null;
        hashEntityMap33.mapNameToValue = map34;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = null;
        hashEntityMap37.mapNameToValue = map38;
        java.lang.String str41 = hashEntityMap37.name((int) '4');
        java.util.Map map42 = hashEntityMap37.mapValueToName;
        hashEntityMap36.mapValueToName = map42;
        hashEntityMap33.mapValueToName = map42;
        java.util.Map map45 = hashEntityMap33.mapValueToName;
        hashEntityMap0.mapValueToName = map45;
        java.util.Map map47 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = null;
        hashEntityMap48.mapNameToValue = map49;
        java.lang.String str52 = hashEntityMap48.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = null;
        hashEntityMap53.mapNameToValue = map54;
        java.util.Map map56 = null;
        hashEntityMap53.mapNameToValue = map56;
        java.util.Map map58 = null;
        hashEntityMap53.mapNameToValue = map58;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map61 = null;
        hashEntityMap60.mapNameToValue = map61;
        java.util.Map map63 = null;
        hashEntityMap60.mapNameToValue = map63;
        java.util.Map map65 = null;
        hashEntityMap60.mapNameToValue = map65;
        java.util.Map map67 = hashEntityMap60.mapValueToName;
        hashEntityMap53.mapNameToValue = map67;
        hashEntityMap48.mapNameToValue = map67;
        hashEntityMap0.mapNameToValue = map67;
        java.util.Map map71 = hashEntityMap0.mapNameToValue;
        java.util.Map map72 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        entities0.addEntity("", (int) (byte) 10);
        java.lang.String str7 = entities0.escape("hi!");
        org.apache.commons.lang.Entities entities8 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer9 = null;
        entities8.escape(writer9, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities8);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap14.add("hi!", 0);
        arrayEntityMap14.size = (byte) 1;
        arrayEntityMap14.growBy = 100;
        entities8.map = arrayEntityMap14;
        java.lang.String[][] strArray23 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities8.addEntities(strArray23);
        entities0.addEntities(strArray23);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
// flaky "13) test0663(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        int int6 = lookupEntityMap0.value("hi!");
        java.lang.String str8 = lookupEntityMap0.name(10);
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = lookupEntityMap0.name((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities4 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities4.map;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities4.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        arrayEntityMap8.growBy = 100;
        java.lang.String str17 = arrayEntityMap8.name((int) (byte) 1);
        entities4.map = arrayEntityMap8;
        entities0.map = arrayEntityMap8;
        java.lang.String str21 = entities0.entityName(0);
        java.lang.String str23 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) (short) 0);
        entities0.addEntity("hi!", 100);
        entities0.addEntity("hi!", (int) (short) 10);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap6.add("hi!", 0);
        arrayEntityMap6.size = (byte) 1;
        arrayEntityMap6.growBy = 100;
        java.lang.String[] strArray14 = arrayEntityMap6.names;
        arrayEntityMap1.names = strArray14;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray20 = new int[] { ' ', '4' };
        binaryEntityMap17.values = intArray20;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray24 = arrayEntityMap23.values;
        java.lang.String str26 = arrayEntityMap23.name((int) (short) 100);
        int[] intArray29 = new int[] { (short) -1, 10 };
        arrayEntityMap23.values = intArray29;
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        arrayEntityMap23.names = strArray32;
        binaryEntityMap17.names = strArray32;
        arrayEntityMap1.names = strArray32;
        arrayEntityMap1.ensureCapacity((int) 'a');
        java.lang.String[] strArray38 = null;
        arrayEntityMap1.names = strArray38;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0 });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", (int) (short) 10);
        java.lang.String str11 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.entityName(35);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.util.Map map11 = hashEntityMap6.mapValueToName;
        hashEntityMap5.mapValueToName = map11;
        java.util.Map map13 = hashEntityMap5.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.lang.String str19 = hashEntityMap15.name((int) '4');
        java.util.Map map20 = hashEntityMap15.mapValueToName;
        hashEntityMap14.mapValueToName = map20;
        java.util.Map map22 = hashEntityMap14.mapValueToName;
        hashEntityMap5.mapNameToValue = map22;
        java.util.Map map24 = hashEntityMap5.mapValueToName;
        hashEntityMap0.mapValueToName = map24;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = null;
        hashEntityMap26.mapNameToValue = map27;
        java.util.Map map29 = hashEntityMap26.mapNameToValue;
        java.util.Map map30 = hashEntityMap26.mapValueToName;
        hashEntityMap0.mapValueToName = map30;
        java.lang.String str33 = hashEntityMap0.name(35);
        java.lang.String str35 = hashEntityMap0.name(2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        int int2 = binaryEntityMap1.size;
        binaryEntityMap1.add("", (int) (short) 1);
        java.lang.String str7 = binaryEntityMap1.name(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        int[] intArray14 = new int[] {};
        arrayEntityMap8.values = intArray14;
        arrayEntityMap1.values = intArray14;
        arrayEntityMap1.ensureCapacity((int) (short) 0);
        int int19 = arrayEntityMap1.growBy;
        java.lang.String str21 = arrayEntityMap1.name(0);
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("", 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray3);
        int int6 = entities0.entityValue("hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name(100);
        java.lang.String str11 = lookupEntityMap0.name((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
// flaky "14) test0674(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        arrayEntityMap1.size = (byte) 1;
        java.lang.String str14 = arrayEntityMap1.name((int) '#');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        int int9 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", 35);
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 10);
        binaryEntityMap1.add("hi!", (int) (short) 0);
        binaryEntityMap1.add("", (int) '#');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str23 = binaryEntityMap21.name(100);
        binaryEntityMap21.growBy = (byte) -1;
        java.lang.String[] strArray26 = binaryEntityMap21.names;
        binaryEntityMap1.names = strArray26;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 35 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) '4');
        java.lang.String str7 = entities0.entityName((int) (short) 1);
        int int9 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) (byte) 100);
        java.io.Writer writer13 = null;
        entities0.escape(writer13, "");
        entities0.addEntity("hi!", 2);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.add("hi!", 0);
        int int7 = arrayEntityMap1.size;
        arrayEntityMap1.growBy = 0;
        int int10 = arrayEntityMap1.growBy;
        int int11 = arrayEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        int int9 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", 35);
        int int13 = binaryEntityMap1.size;
        java.lang.String[] strArray14 = binaryEntityMap1.names;
        int int16 = binaryEntityMap1.value("");
        int[] intArray17 = binaryEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 52 });
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities7.map;
        java.lang.String str10 = entities7.unescape("hi!");
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities11.map;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities11.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap15.add("hi!", 0);
        arrayEntityMap15.size = (byte) 1;
        arrayEntityMap15.growBy = 100;
        java.lang.String str24 = arrayEntityMap15.name((int) (byte) 1);
        entities11.map = arrayEntityMap15;
        entities7.map = arrayEntityMap15;
        entities0.map = arrayEntityMap15;
        arrayEntityMap15.size = 1;
        org.apache.commons.lang.Entities entities30 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap32 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray33 = arrayEntityMap32.values;
        java.lang.String str35 = arrayEntityMap32.name((int) (short) 100);
        int[] intArray38 = new int[] { (short) -1, 10 };
        arrayEntityMap32.values = intArray38;
        entities30.map = arrayEntityMap32;
        java.lang.String[] strArray41 = arrayEntityMap32.names;
        arrayEntityMap15.names = strArray41;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(entities30);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 0 });
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(intArray38);
// flaky "15) test0680(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray38, new int[] { 402, 10 });
        org.junit.Assert.assertNotNull(strArray41);
// flaky "5) test0680(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "fnof" });
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities7.map;
        java.lang.String str10 = entities7.unescape("hi!");
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities11.map;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities11.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap15.add("hi!", 0);
        arrayEntityMap15.size = (byte) 1;
        arrayEntityMap15.growBy = 100;
        java.lang.String str24 = arrayEntityMap15.name((int) (byte) 1);
        entities11.map = arrayEntityMap15;
        entities7.map = arrayEntityMap15;
        entities0.map = arrayEntityMap15;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap29 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray30 = arrayEntityMap29.values;
        java.lang.String str32 = arrayEntityMap29.name((int) (short) 100);
        int int34 = arrayEntityMap29.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap36 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray37 = arrayEntityMap36.values;
        int int38 = arrayEntityMap36.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap40 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap40.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap44 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray47 = new int[] { ' ', '4' };
        binaryEntityMap44.values = intArray47;
        arrayEntityMap40.values = intArray47;
        arrayEntityMap36.values = intArray47;
        arrayEntityMap29.values = intArray47;
        java.lang.String[] strArray52 = arrayEntityMap29.names;
        arrayEntityMap15.names = strArray52;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 0 });
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { null });
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        java.util.Map map2 = null;
        hashEntityMap0.mapNameToValue = map2;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        java.util.Map map10 = hashEntityMap5.mapValueToName;
        hashEntityMap4.mapValueToName = map10;
        hashEntityMap0.mapNameToValue = map10;
        java.util.Map map13 = hashEntityMap0.mapNameToValue;
        java.util.Map map14 = null;
        hashEntityMap0.mapValueToName = map14;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map17 = null;
        hashEntityMap16.mapNameToValue = map17;
        java.lang.String str20 = hashEntityMap16.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = null;
        hashEntityMap21.mapNameToValue = map22;
        java.lang.String str25 = hashEntityMap21.name((int) '4');
        java.lang.String str27 = hashEntityMap21.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = null;
        hashEntityMap28.mapNameToValue = map29;
        java.util.Map map31 = null;
        hashEntityMap28.mapNameToValue = map31;
        java.util.Map map33 = null;
        hashEntityMap28.mapNameToValue = map33;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = null;
        hashEntityMap35.mapNameToValue = map36;
        java.util.Map map38 = null;
        hashEntityMap35.mapNameToValue = map38;
        java.util.Map map40 = null;
        hashEntityMap35.mapNameToValue = map40;
        java.util.Map map42 = hashEntityMap35.mapValueToName;
        hashEntityMap28.mapNameToValue = map42;
        hashEntityMap21.mapValueToName = map42;
        hashEntityMap16.mapValueToName = map42;
        java.util.Map map46 = hashEntityMap16.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap47 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = null;
        hashEntityMap48.mapNameToValue = map49;
        java.util.Map map51 = null;
        hashEntityMap48.mapNameToValue = map51;
        java.util.Map map53 = null;
        hashEntityMap48.mapNameToValue = map53;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = null;
        hashEntityMap55.mapNameToValue = map56;
        java.util.Map map58 = null;
        hashEntityMap55.mapNameToValue = map58;
        java.util.Map map60 = null;
        hashEntityMap55.mapNameToValue = map60;
        java.util.Map map62 = hashEntityMap55.mapValueToName;
        hashEntityMap48.mapNameToValue = map62;
        treeEntityMap47.mapValueToName = map62;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = null;
        hashEntityMap65.mapNameToValue = map66;
        java.lang.String str69 = hashEntityMap65.name((int) '4');
        java.lang.String str71 = hashEntityMap65.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map73 = null;
        hashEntityMap72.mapNameToValue = map73;
        java.util.Map map75 = null;
        hashEntityMap72.mapNameToValue = map75;
        java.util.Map map77 = null;
        hashEntityMap72.mapNameToValue = map77;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap79 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map80 = null;
        hashEntityMap79.mapNameToValue = map80;
        java.util.Map map82 = null;
        hashEntityMap79.mapNameToValue = map82;
        java.util.Map map84 = null;
        hashEntityMap79.mapNameToValue = map84;
        java.util.Map map86 = hashEntityMap79.mapValueToName;
        hashEntityMap72.mapNameToValue = map86;
        hashEntityMap65.mapValueToName = map86;
        treeEntityMap47.mapNameToValue = map86;
        hashEntityMap16.mapValueToName = map86;
        hashEntityMap0.mapValueToName = map86;
        java.util.Map map92 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(map46);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", 10);
        int int15 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        java.lang.String str16 = binaryEntityMap1.name((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap1.mapValueToName = map27;
        entities0.map = hashEntityMap1;
        java.lang.String str33 = entities0.escape("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        entities0.addEntity("hi!", 100);
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.escape("hi!");
        org.apache.commons.lang.Entities entities13 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities13.map;
        java.lang.String str16 = entities13.unescape("hi!");
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap18 = entities17.map;
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities17.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap21.add("hi!", 0);
        arrayEntityMap21.size = (byte) 1;
        arrayEntityMap21.growBy = 100;
        java.lang.String str30 = arrayEntityMap21.name((int) (byte) 1);
        entities17.map = arrayEntityMap21;
        entities13.map = arrayEntityMap21;
        arrayEntityMap21.add("hi!", 100);
        arrayEntityMap21.add("hi!", (int) '#');
        entities0.map = arrayEntityMap21;
        org.apache.commons.lang.Entities entities40 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap41 = entities40.map;
        org.apache.commons.lang.Entities.EntityMap entityMap42 = entities40.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap44 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap44.add("hi!", 0);
        arrayEntityMap44.size = (byte) 1;
        arrayEntityMap44.growBy = 100;
        java.lang.String str53 = arrayEntityMap44.name((int) (byte) 1);
        entities40.map = arrayEntityMap44;
        java.lang.String str56 = arrayEntityMap44.name(100);
        int int57 = arrayEntityMap44.size;
        entities0.map = arrayEntityMap44;
        int int60 = entities0.entityValue("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(entities40);
        org.junit.Assert.assertNotNull(entityMap41);
        org.junit.Assert.assertNotNull(entityMap42);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        java.lang.String[] strArray19 = binaryEntityMap1.names;
        binaryEntityMap1.add("", 10);
        binaryEntityMap1.ensureCapacity(10);
        int int25 = binaryEntityMap1.growBy;
        int int26 = binaryEntityMap1.growBy;
        binaryEntityMap1.add("", 2);
        binaryEntityMap1.add("", 0);
        binaryEntityMap1.size = 35;
        binaryEntityMap1.growBy = (short) -1;
        binaryEntityMap1.size = (short) 1;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        int int9 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", 35);
        int int13 = binaryEntityMap1.size;
        binaryEntityMap1.add("hi!", 2);
        java.lang.String str18 = binaryEntityMap1.name((-1));
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 2, 35 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        java.lang.String str11 = hashEntityMap5.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = null;
        hashEntityMap12.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap12.mapNameToValue = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap19.mapNameToValue = map22;
        java.util.Map map24 = null;
        hashEntityMap19.mapNameToValue = map24;
        java.util.Map map26 = hashEntityMap19.mapValueToName;
        hashEntityMap12.mapNameToValue = map26;
        hashEntityMap5.mapValueToName = map26;
        hashEntityMap0.mapValueToName = map26;
        java.util.Map map30 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap31 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = null;
        hashEntityMap32.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap32.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap32.mapNameToValue = map37;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map40 = null;
        hashEntityMap39.mapNameToValue = map40;
        java.util.Map map42 = null;
        hashEntityMap39.mapNameToValue = map42;
        java.util.Map map44 = null;
        hashEntityMap39.mapNameToValue = map44;
        java.util.Map map46 = hashEntityMap39.mapValueToName;
        hashEntityMap32.mapNameToValue = map46;
        treeEntityMap31.mapValueToName = map46;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map50 = null;
        hashEntityMap49.mapNameToValue = map50;
        java.lang.String str53 = hashEntityMap49.name((int) '4');
        java.lang.String str55 = hashEntityMap49.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map57 = null;
        hashEntityMap56.mapNameToValue = map57;
        java.util.Map map59 = null;
        hashEntityMap56.mapNameToValue = map59;
        java.util.Map map61 = null;
        hashEntityMap56.mapNameToValue = map61;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map64 = null;
        hashEntityMap63.mapNameToValue = map64;
        java.util.Map map66 = null;
        hashEntityMap63.mapNameToValue = map66;
        java.util.Map map68 = null;
        hashEntityMap63.mapNameToValue = map68;
        java.util.Map map70 = hashEntityMap63.mapValueToName;
        hashEntityMap56.mapNameToValue = map70;
        hashEntityMap49.mapValueToName = map70;
        treeEntityMap31.mapNameToValue = map70;
        hashEntityMap0.mapValueToName = map70;
        java.lang.String str76 = hashEntityMap0.name((int) '4');
        java.util.Map map77 = hashEntityMap0.mapValueToName;
        java.util.Map map78 = hashEntityMap0.mapNameToValue;
        java.util.Map map79 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap80 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap80.add("", (int) (byte) 100);
        java.util.Map map84 = null;
        hashEntityMap80.mapValueToName = map84;
        int int87 = hashEntityMap80.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap88 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map89 = null;
        hashEntityMap88.mapNameToValue = map89;
        java.util.Map map91 = null;
        hashEntityMap88.mapNameToValue = map91;
        java.util.Map map93 = null;
        hashEntityMap88.mapNameToValue = map93;
        java.util.Map map95 = hashEntityMap88.mapValueToName;
        java.util.Map map96 = hashEntityMap88.mapNameToValue;
        java.util.Map map97 = hashEntityMap88.mapValueToName;
        hashEntityMap80.mapNameToValue = map97;
        hashEntityMap0.mapNameToValue = map97;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 100 + "'", int87 == 100);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNull(map96);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray12 = arrayEntityMap11.values;
        java.lang.String str14 = arrayEntityMap11.name((int) (short) 100);
        int[] intArray17 = new int[] { (short) -1, 10 };
        arrayEntityMap11.values = intArray17;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        arrayEntityMap11.names = strArray20;
        binaryEntityMap5.names = strArray20;
        binaryEntityMap1.names = strArray20;
        java.lang.String str25 = binaryEntityMap1.name((int) (short) 10);
        java.lang.String str27 = binaryEntityMap1.name((-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("hi!", (int) (byte) 1);
        lookupEntityMap0.add("hi!", (int) (short) 10);
        lookupEntityMap0.add("", 35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.entityName(52);
        java.lang.String str9 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities4 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities4.map;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities4.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        arrayEntityMap8.growBy = 100;
        java.lang.String str17 = arrayEntityMap8.name((int) (byte) 1);
        entities4.map = arrayEntityMap8;
        entities0.map = arrayEntityMap8;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str23 = binaryEntityMap21.name(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray28 = new int[] { ' ', '4' };
        binaryEntityMap25.values = intArray28;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap31 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray32 = arrayEntityMap31.values;
        java.lang.String str34 = arrayEntityMap31.name((int) (short) 100);
        int[] intArray37 = new int[] { (short) -1, 10 };
        arrayEntityMap31.values = intArray37;
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        arrayEntityMap31.names = strArray40;
        binaryEntityMap25.names = strArray40;
        binaryEntityMap21.names = strArray40;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap45 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int47 = arrayEntityMap45.value("");
        java.lang.String[] strArray48 = arrayEntityMap45.names;
        int[] intArray49 = arrayEntityMap45.values;
        binaryEntityMap21.values = intArray49;
        java.lang.String str52 = binaryEntityMap21.name((int) (short) -1);
        entities0.map = binaryEntityMap21;
        java.lang.String str55 = entities0.entityName((int) (byte) 10);
        java.lang.String str57 = entities0.escape("hi!");
        entities0.addEntity("", 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap62 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap62.add("hi!", (-1));
        binaryEntityMap62.ensureCapacity((int) 'a');
        entities0.map = binaryEntityMap62;
        java.io.Writer writer69 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer69, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 0 });
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 0 });
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray14 = new int[] { ' ', '4' };
        binaryEntityMap11.values = intArray14;
        java.lang.String str17 = binaryEntityMap11.name((int) (byte) 100);
        binaryEntityMap11.add("hi!", (-1));
        java.lang.String str22 = binaryEntityMap11.name(0);
        java.lang.String str24 = binaryEntityMap11.name(10);
        binaryEntityMap11.growBy = 100;
        binaryEntityMap11.growBy = 100;
        binaryEntityMap11.add("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap33 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap33.add("hi!", 0);
        java.lang.String str38 = arrayEntityMap33.name(0);
        int[] intArray39 = arrayEntityMap33.values;
        binaryEntityMap11.values = intArray39;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap42 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap42.growBy = (-1);
        arrayEntityMap42.ensureCapacity((int) (byte) 1);
        java.lang.String str48 = arrayEntityMap42.name(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap50 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str52 = binaryEntityMap50.name(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap54 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray57 = new int[] { ' ', '4' };
        binaryEntityMap54.values = intArray57;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap60 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray61 = arrayEntityMap60.values;
        java.lang.String str63 = arrayEntityMap60.name((int) (short) 100);
        int[] intArray66 = new int[] { (short) -1, 10 };
        arrayEntityMap60.values = intArray66;
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!" };
        arrayEntityMap60.names = strArray69;
        binaryEntityMap54.names = strArray69;
        binaryEntityMap50.names = strArray69;
        arrayEntityMap42.names = strArray69;
        binaryEntityMap11.names = strArray69;
        arrayEntityMap1.names = strArray69;
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 0 });
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap5.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray12 = new int[] { ' ', '4' };
        binaryEntityMap9.values = intArray12;
        arrayEntityMap5.values = intArray12;
        arrayEntityMap1.values = intArray12;
        arrayEntityMap1.add("hi!", 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 52 });
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap8.mapValueToName;
        hashEntityMap0.mapNameToValue = map15;
        int int18 = hashEntityMap0.value("");
        java.util.Map map19 = null;
        hashEntityMap0.mapNameToValue = map19;
        java.util.Map map21 = hashEntityMap0.mapValueToName;
        java.lang.String str23 = hashEntityMap0.name(0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        java.lang.String[] strArray19 = binaryEntityMap1.names;
        binaryEntityMap1.add("", 10);
        binaryEntityMap1.ensureCapacity(10);
        int int25 = binaryEntityMap1.growBy;
        binaryEntityMap1.add("", (int) '#');
        java.lang.String str30 = binaryEntityMap1.name((int) (byte) 1);
        binaryEntityMap1.ensureCapacity((int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        java.lang.String str11 = hashEntityMap5.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = null;
        hashEntityMap12.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap12.mapNameToValue = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap19.mapNameToValue = map22;
        java.util.Map map24 = null;
        hashEntityMap19.mapNameToValue = map24;
        java.util.Map map26 = hashEntityMap19.mapValueToName;
        hashEntityMap12.mapNameToValue = map26;
        hashEntityMap5.mapValueToName = map26;
        hashEntityMap0.mapValueToName = map26;
        java.lang.String str31 = hashEntityMap0.name((int) '#');
        java.util.Map map32 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = null;
        hashEntityMap33.mapNameToValue = map34;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = null;
        hashEntityMap37.mapNameToValue = map38;
        java.lang.String str41 = hashEntityMap37.name((int) '4');
        java.util.Map map42 = hashEntityMap37.mapValueToName;
        hashEntityMap36.mapValueToName = map42;
        hashEntityMap33.mapValueToName = map42;
        java.util.Map map45 = hashEntityMap33.mapValueToName;
        hashEntityMap0.mapValueToName = map45;
        java.util.Map map47 = hashEntityMap0.mapValueToName;
        // The following exception was thrown during execution in test generation
        try {
            int int49 = hashEntityMap0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap1 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap1.add("hi!", (int) (short) 1);
        int int6 = lookupEntityMap1.value("hi!");
        int int8 = lookupEntityMap1.value("");
        java.lang.String str10 = lookupEntityMap1.name((int) (byte) 1);
        lookupEntityMap1.add("hi!", 10);
        entities0.map = lookupEntityMap1;
        java.lang.String str16 = entities0.escape("hi!");
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        java.lang.String str5 = binaryEntityMap1.name((int) (byte) 0);
        java.lang.String str7 = binaryEntityMap1.name(0);
        int int8 = binaryEntityMap1.growBy;
        int int9 = binaryEntityMap1.growBy;
        int[] intArray10 = binaryEntityMap1.values;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        arrayEntityMap2.growBy = 0;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 10 });
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        entities0.addEntity("", (int) (short) 1);
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        java.util.Map map4 = null;
        hashEntityMap0.mapValueToName = map4;
        int int7 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap8.mapValueToName;
        java.util.Map map16 = hashEntityMap8.mapNameToValue;
        java.util.Map map17 = hashEntityMap8.mapValueToName;
        hashEntityMap0.mapNameToValue = map17;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = hashEntityMap0.name(35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        int int13 = lookupEntityMap0.value("hi!");
        int int15 = lookupEntityMap0.value("hi!");
        java.lang.String str17 = lookupEntityMap0.name((int) (short) 1);
        int int19 = lookupEntityMap0.value("hi!");
        int int21 = lookupEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap8.mapValueToName;
        hashEntityMap0.mapNameToValue = map15;
        int int18 = hashEntityMap0.value("");
        java.util.Map map19 = hashEntityMap0.mapNameToValue;
        java.lang.String str21 = hashEntityMap0.name(0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = null;
        hashEntityMap22.mapNameToValue = map23;
        java.lang.String str26 = hashEntityMap22.name((int) '4');
        java.lang.String str28 = hashEntityMap22.name((int) (byte) 1);
        java.lang.String str30 = hashEntityMap22.name(100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = null;
        hashEntityMap35.mapNameToValue = map36;
        java.lang.String str39 = hashEntityMap35.name((int) '4');
        java.util.Map map40 = hashEntityMap35.mapValueToName;
        hashEntityMap34.mapValueToName = map40;
        hashEntityMap31.mapValueToName = map40;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = null;
        hashEntityMap43.mapNameToValue = map44;
        java.util.Map map46 = hashEntityMap43.mapNameToValue;
        java.util.Map map47 = hashEntityMap43.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = null;
        hashEntityMap48.mapNameToValue = map49;
        java.lang.String str52 = hashEntityMap48.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = null;
        hashEntityMap53.mapNameToValue = map54;
        java.lang.String str57 = hashEntityMap53.name((int) '4');
        java.lang.String str59 = hashEntityMap53.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map61 = null;
        hashEntityMap60.mapNameToValue = map61;
        java.util.Map map63 = null;
        hashEntityMap60.mapNameToValue = map63;
        java.util.Map map65 = null;
        hashEntityMap60.mapNameToValue = map65;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map68 = null;
        hashEntityMap67.mapNameToValue = map68;
        java.util.Map map70 = null;
        hashEntityMap67.mapNameToValue = map70;
        java.util.Map map72 = null;
        hashEntityMap67.mapNameToValue = map72;
        java.util.Map map74 = hashEntityMap67.mapValueToName;
        hashEntityMap60.mapNameToValue = map74;
        hashEntityMap53.mapValueToName = map74;
        hashEntityMap48.mapValueToName = map74;
        hashEntityMap43.mapNameToValue = map74;
        java.util.Map map79 = hashEntityMap43.mapNameToValue;
        hashEntityMap31.mapValueToName = map79;
        hashEntityMap22.mapNameToValue = map79;
        hashEntityMap0.mapValueToName = map79;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map79);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = null;
        hashEntityMap10.mapNameToValue = map11;
        java.lang.String str14 = hashEntityMap10.name((int) '4');
        java.lang.String str16 = hashEntityMap10.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.util.Map map20 = null;
        hashEntityMap17.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap17.mapNameToValue = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.util.Map map27 = null;
        hashEntityMap24.mapNameToValue = map27;
        java.util.Map map29 = null;
        hashEntityMap24.mapNameToValue = map29;
        java.util.Map map31 = hashEntityMap24.mapValueToName;
        hashEntityMap17.mapNameToValue = map31;
        hashEntityMap10.mapValueToName = map31;
        hashEntityMap5.mapValueToName = map31;
        hashEntityMap0.mapNameToValue = map31;
        java.util.Map map36 = hashEntityMap0.mapNameToValue;
        java.util.Map map37 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = null;
        hashEntityMap38.mapNameToValue = map39;
        java.lang.String str42 = hashEntityMap38.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = null;
        hashEntityMap43.mapNameToValue = map44;
        java.lang.String str47 = hashEntityMap43.name((int) '4');
        java.lang.String str49 = hashEntityMap43.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map51 = null;
        hashEntityMap50.mapNameToValue = map51;
        java.util.Map map53 = null;
        hashEntityMap50.mapNameToValue = map53;
        java.util.Map map55 = null;
        hashEntityMap50.mapNameToValue = map55;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map58 = null;
        hashEntityMap57.mapNameToValue = map58;
        java.util.Map map60 = null;
        hashEntityMap57.mapNameToValue = map60;
        java.util.Map map62 = null;
        hashEntityMap57.mapNameToValue = map62;
        java.util.Map map64 = hashEntityMap57.mapValueToName;
        hashEntityMap50.mapNameToValue = map64;
        hashEntityMap43.mapValueToName = map64;
        hashEntityMap38.mapValueToName = map64;
        java.lang.String str69 = hashEntityMap38.name((int) '#');
        java.util.Map map70 = hashEntityMap38.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap71 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map72 = null;
        hashEntityMap71.mapNameToValue = map72;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap74 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map76 = null;
        hashEntityMap75.mapNameToValue = map76;
        java.lang.String str79 = hashEntityMap75.name((int) '4');
        java.util.Map map80 = hashEntityMap75.mapValueToName;
        hashEntityMap74.mapValueToName = map80;
        hashEntityMap71.mapValueToName = map80;
        java.util.Map map83 = hashEntityMap71.mapValueToName;
        hashEntityMap38.mapValueToName = map83;
        java.util.Map map85 = hashEntityMap38.mapValueToName;
        hashEntityMap0.mapNameToValue = map85;
        hashEntityMap0.add("", 0);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(map70);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.util.Map map10 = null;
        hashEntityMap7.mapNameToValue = map10;
        java.util.Map map12 = null;
        hashEntityMap7.mapNameToValue = map12;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap14.mapNameToValue = map17;
        java.util.Map map19 = null;
        hashEntityMap14.mapNameToValue = map19;
        java.util.Map map21 = hashEntityMap14.mapValueToName;
        hashEntityMap7.mapNameToValue = map21;
        hashEntityMap0.mapValueToName = map21;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.lang.String str28 = hashEntityMap24.name((int) '4');
        java.lang.String str30 = hashEntityMap24.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap31.mapNameToValue = map34;
        java.util.Map map36 = null;
        hashEntityMap31.mapNameToValue = map36;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = null;
        hashEntityMap38.mapNameToValue = map39;
        java.util.Map map41 = null;
        hashEntityMap38.mapNameToValue = map41;
        java.util.Map map43 = null;
        hashEntityMap38.mapNameToValue = map43;
        java.util.Map map45 = hashEntityMap38.mapValueToName;
        hashEntityMap31.mapNameToValue = map45;
        hashEntityMap24.mapValueToName = map45;
        hashEntityMap0.mapValueToName = map45;
        java.util.Map map49 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map51 = null;
        hashEntityMap50.mapNameToValue = map51;
        java.lang.String str54 = hashEntityMap50.name((int) '4');
        java.lang.String str56 = hashEntityMap50.name((int) (short) 100);
        java.util.Map map57 = hashEntityMap50.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap58 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map59 = null;
        hashEntityMap58.mapNameToValue = map59;
        java.util.Map map61 = null;
        hashEntityMap58.mapNameToValue = map61;
        java.util.Map map63 = null;
        hashEntityMap58.mapNameToValue = map63;
        java.util.Map map65 = hashEntityMap58.mapValueToName;
        hashEntityMap50.mapNameToValue = map65;
        int int68 = hashEntityMap50.value("");
        java.util.Map map69 = null;
        hashEntityMap50.mapNameToValue = map69;
        java.util.Map map71 = hashEntityMap50.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap73 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map74 = null;
        hashEntityMap73.mapNameToValue = map74;
        java.lang.String str77 = hashEntityMap73.name((int) '4');
        java.util.Map map78 = hashEntityMap73.mapValueToName;
        hashEntityMap72.mapValueToName = map78;
        java.util.Map map80 = hashEntityMap72.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap81 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap82 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map83 = null;
        hashEntityMap82.mapNameToValue = map83;
        java.lang.String str86 = hashEntityMap82.name((int) '4');
        java.util.Map map87 = hashEntityMap82.mapValueToName;
        hashEntityMap81.mapValueToName = map87;
        java.util.Map map89 = hashEntityMap81.mapValueToName;
        hashEntityMap72.mapNameToValue = map89;
        hashEntityMap50.mapNameToValue = map89;
        hashEntityMap0.mapNameToValue = map89;
        int int94 = hashEntityMap0.value("");
        java.util.Map map95 = hashEntityMap0.mapNameToValue;
        java.util.Map map96 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(map57);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNull(map71);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map96);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        binaryEntityMap1.growBy = 100;
        binaryEntityMap1.growBy = 100;
        binaryEntityMap1.add("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap23.add("hi!", 0);
        java.lang.String str28 = arrayEntityMap23.name(0);
        int[] intArray29 = arrayEntityMap23.values;
        binaryEntityMap1.values = intArray29;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap32 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap32.growBy = (-1);
        arrayEntityMap32.ensureCapacity((int) (byte) 1);
        java.lang.String str38 = arrayEntityMap32.name(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap40 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str42 = binaryEntityMap40.name(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap44 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray47 = new int[] { ' ', '4' };
        binaryEntityMap44.values = intArray47;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap50 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray51 = arrayEntityMap50.values;
        java.lang.String str53 = arrayEntityMap50.name((int) (short) 100);
        int[] intArray56 = new int[] { (short) -1, 10 };
        arrayEntityMap50.values = intArray56;
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!" };
        arrayEntityMap50.names = strArray59;
        binaryEntityMap44.names = strArray59;
        binaryEntityMap40.names = strArray59;
        arrayEntityMap32.names = strArray59;
        binaryEntityMap1.names = strArray59;
        java.lang.String str66 = binaryEntityMap1.name((int) (byte) -1);
        binaryEntityMap1.ensureCapacity(0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 0 });
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        java.lang.String str8 = hashEntityMap0.name(100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = null;
        hashEntityMap10.mapNameToValue = map11;
        java.lang.String str14 = hashEntityMap10.name((int) '4');
        java.util.Map map15 = hashEntityMap10.mapValueToName;
        hashEntityMap9.mapValueToName = map15;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.util.Map map20 = hashEntityMap17.mapNameToValue;
        java.util.Map map21 = hashEntityMap17.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = null;
        hashEntityMap22.mapNameToValue = map23;
        java.lang.String str26 = hashEntityMap22.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = null;
        hashEntityMap27.mapNameToValue = map28;
        java.lang.String str31 = hashEntityMap27.name((int) '4');
        java.lang.String str33 = hashEntityMap27.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = null;
        hashEntityMap34.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap34.mapNameToValue = map37;
        java.util.Map map39 = null;
        hashEntityMap34.mapNameToValue = map39;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = null;
        hashEntityMap41.mapNameToValue = map42;
        java.util.Map map44 = null;
        hashEntityMap41.mapNameToValue = map44;
        java.util.Map map46 = null;
        hashEntityMap41.mapNameToValue = map46;
        java.util.Map map48 = hashEntityMap41.mapValueToName;
        hashEntityMap34.mapNameToValue = map48;
        hashEntityMap27.mapValueToName = map48;
        hashEntityMap22.mapValueToName = map48;
        hashEntityMap17.mapNameToValue = map48;
        java.util.Map map53 = hashEntityMap17.mapNameToValue;
        java.util.Map map54 = hashEntityMap17.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = null;
        hashEntityMap55.mapNameToValue = map56;
        java.util.Map map58 = null;
        hashEntityMap55.mapNameToValue = map58;
        java.util.Map map60 = null;
        hashEntityMap55.mapNameToValue = map60;
        java.util.Map map62 = hashEntityMap55.mapValueToName;
        java.util.Map map63 = hashEntityMap55.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map65 = hashEntityMap64.mapValueToName;
        java.util.Map map66 = hashEntityMap64.mapNameToValue;
        hashEntityMap55.mapValueToName = map66;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap68 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap69 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map70 = null;
        hashEntityMap69.mapNameToValue = map70;
        java.lang.String str73 = hashEntityMap69.name((int) '4');
        java.util.Map map74 = hashEntityMap69.mapValueToName;
        hashEntityMap68.mapValueToName = map74;
        java.util.Map map76 = hashEntityMap68.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap77 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap78 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map79 = null;
        hashEntityMap78.mapNameToValue = map79;
        java.lang.String str82 = hashEntityMap78.name((int) '4');
        java.util.Map map83 = hashEntityMap78.mapValueToName;
        hashEntityMap77.mapValueToName = map83;
        java.util.Map map85 = hashEntityMap77.mapValueToName;
        hashEntityMap68.mapNameToValue = map85;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap87 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map88 = null;
        hashEntityMap87.mapNameToValue = map88;
        java.util.Map map90 = null;
        hashEntityMap87.mapNameToValue = map90;
        java.util.Map map92 = null;
        hashEntityMap87.mapNameToValue = map92;
        java.util.Map map94 = hashEntityMap87.mapValueToName;
        hashEntityMap68.mapNameToValue = map94;
        hashEntityMap55.mapNameToValue = map94;
        hashEntityMap17.mapNameToValue = map94;
        hashEntityMap9.mapNameToValue = map94;
        hashEntityMap0.mapValueToName = map94;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map94);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("hi!", (int) (byte) 1);
        lookupEntityMap0.add("hi!", (int) (short) 10);
        java.lang.String str22 = lookupEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.util.Map map10 = null;
        hashEntityMap7.mapNameToValue = map10;
        java.util.Map map12 = null;
        hashEntityMap7.mapNameToValue = map12;
        java.util.Map map14 = hashEntityMap7.mapValueToName;
        hashEntityMap0.mapNameToValue = map14;
        int int17 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("", 52);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = hashEntityMap21.mapValueToName;
        java.util.Map map23 = null;
        hashEntityMap21.mapNameToValue = map23;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = null;
        hashEntityMap26.mapNameToValue = map27;
        java.lang.String str30 = hashEntityMap26.name((int) '4');
        java.util.Map map31 = hashEntityMap26.mapValueToName;
        hashEntityMap25.mapValueToName = map31;
        hashEntityMap21.mapNameToValue = map31;
        java.util.Map map34 = hashEntityMap21.mapNameToValue;
        hashEntityMap21.add("hi!", 35);
        int int39 = hashEntityMap21.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = null;
        hashEntityMap40.mapNameToValue = map41;
        java.lang.String str44 = hashEntityMap40.name((int) '4');
        java.util.Map map45 = hashEntityMap40.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = hashEntityMap46.mapValueToName;
        java.util.Map map48 = null;
        hashEntityMap46.mapNameToValue = map48;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map52 = null;
        hashEntityMap51.mapNameToValue = map52;
        java.lang.String str55 = hashEntityMap51.name((int) '4');
        java.util.Map map56 = hashEntityMap51.mapValueToName;
        hashEntityMap50.mapValueToName = map56;
        hashEntityMap46.mapNameToValue = map56;
        hashEntityMap40.mapNameToValue = map56;
        java.lang.String str61 = hashEntityMap40.name(2);
        java.util.Map map62 = hashEntityMap40.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map65 = null;
        hashEntityMap64.mapNameToValue = map65;
        java.lang.String str68 = hashEntityMap64.name((int) '4');
        java.util.Map map69 = hashEntityMap64.mapValueToName;
        hashEntityMap63.mapValueToName = map69;
        java.util.Map map71 = hashEntityMap63.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap73 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map74 = null;
        hashEntityMap73.mapNameToValue = map74;
        java.lang.String str77 = hashEntityMap73.name((int) '4');
        java.util.Map map78 = hashEntityMap73.mapValueToName;
        hashEntityMap72.mapValueToName = map78;
        java.util.Map map80 = hashEntityMap72.mapValueToName;
        hashEntityMap63.mapNameToValue = map80;
        java.util.Map map82 = hashEntityMap63.mapValueToName;
        hashEntityMap40.mapValueToName = map82;
        java.util.Map map84 = hashEntityMap40.mapNameToValue;
        hashEntityMap21.mapValueToName = map84;
        hashEntityMap0.mapNameToValue = map84;
        java.lang.String str88 = hashEntityMap0.name((int) (short) -1);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap8.mapValueToName;
        hashEntityMap0.mapNameToValue = map15;
        java.lang.String str18 = hashEntityMap0.name((int) (byte) 1);
        java.lang.String str20 = hashEntityMap0.name((int) (byte) 10);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.lang.String str2 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray7 = new int[] { ' ', '4' };
        binaryEntityMap4.values = intArray7;
        java.lang.String str10 = binaryEntityMap4.name((int) (byte) 100);
        binaryEntityMap4.add("hi!", (-1));
        java.lang.String str15 = binaryEntityMap4.name(0);
        entities0.map = binaryEntityMap4;
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities0.map;
        java.io.Writer writer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(entityMap17);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.ensureCapacity((int) (byte) 10);
        binaryEntityMap1.add("", (int) (short) 1);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        int[] intArray14 = new int[] {};
        arrayEntityMap8.values = intArray14;
        arrayEntityMap1.values = intArray14;
        arrayEntityMap1.ensureCapacity((int) (short) 0);
        int int19 = arrayEntityMap1.growBy;
        java.lang.String[] strArray20 = arrayEntityMap1.names;
        int int21 = arrayEntityMap1.growBy;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities7.map;
        java.lang.String str10 = entities7.unescape("hi!");
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities11.map;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities11.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap15.add("hi!", 0);
        arrayEntityMap15.size = (byte) 1;
        arrayEntityMap15.growBy = 100;
        java.lang.String str24 = arrayEntityMap15.name((int) (byte) 1);
        entities11.map = arrayEntityMap15;
        entities7.map = arrayEntityMap15;
        entities0.map = arrayEntityMap15;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.growBy = 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int9 = arrayEntityMap7.value("");
        arrayEntityMap7.size = (byte) 100;
        arrayEntityMap7.size = 100;
        arrayEntityMap7.ensureCapacity((int) (short) 1);
        int[] intArray16 = arrayEntityMap7.values;
        binaryEntityMap1.values = intArray16;
        java.lang.Class<?> wildcardClass18 = binaryEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        int int11 = arrayEntityMap1.growBy;
        java.lang.String[] strArray12 = arrayEntityMap1.names;
        arrayEntityMap1.growBy = 10;
        int int15 = arrayEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap1.mapValueToName = map27;
        entities0.map = hashEntityMap1;
        java.lang.String str33 = entities0.escape("hi!");
        java.lang.String str35 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities0.map = arrayEntityMap37;
        java.lang.String str40 = entities0.escape("");
        java.io.Writer writer41 = null;
        entities0.escape(writer41, "");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap45 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray48 = new int[] { ' ', '4' };
        binaryEntityMap45.values = intArray48;
        int int51 = binaryEntityMap45.value("");
        int int53 = binaryEntityMap45.value("");
        binaryEntityMap45.add("hi!", 35);
        java.lang.String str58 = binaryEntityMap45.name((int) (short) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap60 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray63 = new int[] { ' ', '4' };
        binaryEntityMap60.values = intArray63;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap66 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray67 = arrayEntityMap66.values;
        java.lang.String str69 = arrayEntityMap66.name((int) (short) 100);
        int[] intArray72 = new int[] { (short) -1, 10 };
        arrayEntityMap66.values = intArray72;
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!" };
        arrayEntityMap66.names = strArray75;
        binaryEntityMap60.names = strArray75;
        java.lang.String[] strArray78 = binaryEntityMap60.names;
        binaryEntityMap45.names = strArray78;
        entities0.map = binaryEntityMap45;
        java.lang.String str82 = entities0.unescape("");
        int int84 = entities0.entityValue("hi!");
        entities0.addEntity("", (int) (short) 100);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 0 });
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 35 + "'", int84 == 35);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.entityName(100);
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 0);
        int int15 = binaryEntityMap1.size;
        int int17 = binaryEntityMap1.value("hi!");
        java.lang.String str19 = binaryEntityMap1.name(0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities4 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities4.map;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities4.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        arrayEntityMap8.growBy = 100;
        java.lang.String str17 = arrayEntityMap8.name((int) (byte) 1);
        entities4.map = arrayEntityMap8;
        entities0.map = arrayEntityMap8;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str22 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap23 = null;
        entities0.map = entityMap23;
        java.lang.Class<?> wildcardClass25 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap6.add("hi!", 0);
        arrayEntityMap6.size = (byte) 1;
        arrayEntityMap6.growBy = 100;
        java.lang.String[] strArray14 = arrayEntityMap6.names;
        arrayEntityMap1.names = strArray14;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray20 = new int[] { ' ', '4' };
        binaryEntityMap17.values = intArray20;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray24 = arrayEntityMap23.values;
        java.lang.String str26 = arrayEntityMap23.name((int) (short) 100);
        int[] intArray29 = new int[] { (short) -1, 10 };
        arrayEntityMap23.values = intArray29;
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        arrayEntityMap23.names = strArray32;
        binaryEntityMap17.names = strArray32;
        arrayEntityMap1.names = strArray32;
        int int37 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.add("", (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0 });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(entities0);
// flaky "16) test0724(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(entityMap3);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        java.lang.String str11 = binaryEntityMap1.name((int) (byte) 10);
        java.lang.String str13 = binaryEntityMap1.name(10);
        binaryEntityMap1.growBy = (byte) 1;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("", (int) (byte) 1);
        lookupEntityMap0.add("hi!", (int) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities4 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities4.map;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities4.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        arrayEntityMap8.growBy = 100;
        java.lang.String str17 = arrayEntityMap8.name((int) (byte) 1);
        entities4.map = arrayEntityMap8;
        entities0.map = arrayEntityMap8;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int22 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNull(entityMap5);
        org.junit.Assert.assertNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap5.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray12 = new int[] { ' ', '4' };
        binaryEntityMap9.values = intArray12;
        arrayEntityMap5.values = intArray12;
        arrayEntityMap1.values = intArray12;
        java.lang.String str17 = arrayEntityMap1.name(1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap19.ensureCapacity((-1));
        binaryEntityMap19.growBy = 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str27 = binaryEntityMap25.name((-1));
        int[] intArray28 = binaryEntityMap25.values;
        binaryEntityMap19.values = intArray28;
        arrayEntityMap1.values = intArray28;
        int[] intArray31 = arrayEntityMap1.values;
        java.lang.String str33 = arrayEntityMap1.name((int) '4');
        arrayEntityMap1.add("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        int int11 = lookupEntityMap0.value("");
        java.lang.String str13 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", (int) (short) 1);
        java.lang.String str18 = lookupEntityMap0.name((int) (short) 10);
        lookupEntityMap0.add("hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = lookupEntityMap0.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        int int9 = binaryEntityMap1.growBy;
        java.lang.String[] strArray10 = binaryEntityMap1.names;
        int int11 = binaryEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str8 = entities6.entityName((int) '#');
        entities6.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities6.map;
        java.io.Writer writer13 = null;
        entities6.escape(writer13, "");
        java.lang.String str17 = entities6.unescape("hi!");
        org.apache.commons.lang.Entities entities18 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities18.map;
        java.lang.String str21 = entities18.unescape("hi!");
        org.apache.commons.lang.Entities entities22 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap23 = entities22.map;
        org.apache.commons.lang.Entities.EntityMap entityMap24 = entities22.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap26.add("hi!", 0);
        arrayEntityMap26.size = (byte) 1;
        arrayEntityMap26.growBy = 100;
        java.lang.String str35 = arrayEntityMap26.name((int) (byte) 1);
        entities22.map = arrayEntityMap26;
        entities18.map = arrayEntityMap26;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities18);
        org.apache.commons.lang.Entities entities39 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray40 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities39.addEntities(strArray40);
        entities18.addEntities(strArray40);
        entities6.addEntities(strArray40);
        entities0.addEntities(strArray40);
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap45 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str47 = lookupEntityMap45.name(0);
        java.lang.String str49 = lookupEntityMap45.name(0);
        int int51 = lookupEntityMap45.value("");
        lookupEntityMap45.add("hi!", 10);
        int int56 = lookupEntityMap45.value("");
        java.lang.String str58 = lookupEntityMap45.name(10);
        lookupEntityMap45.add("hi!", (int) (short) 1);
        entities0.map = lookupEntityMap45;
        java.lang.String str64 = lookupEntityMap45.name((int) '4');
        org.junit.Assert.assertNotNull(entities0);
// flaky "17) test0731(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(entities18);
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertNotNull(entityMap23);
        org.junit.Assert.assertNotNull(entityMap24);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(entities39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int2 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) 'a');
        int int4 = binaryEntityMap1.size;
        binaryEntityMap1.size = (byte) 100;
        binaryEntityMap1.size = 2;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.escape("hi!");
        int int16 = entities0.entityValue("");
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        java.lang.String str7 = entities0.entityName(100);
        entities0.addEntity("hi!", (int) (byte) -1);
        java.io.Writer writer11 = null;
        entities0.escape(writer11, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        java.lang.String str3 = arrayEntityMap1.name(32);
        arrayEntityMap1.growBy = (short) 100;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        java.lang.String[] strArray4 = arrayEntityMap1.names;
        int[] intArray5 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap7.add("hi!", 0);
        java.lang.String str12 = arrayEntityMap7.name(0);
        int[] intArray13 = arrayEntityMap7.values;
        arrayEntityMap1.values = intArray13;
        arrayEntityMap1.growBy = 2;
        arrayEntityMap1.add("", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        java.lang.String[] strArray19 = binaryEntityMap1.names;
        binaryEntityMap1.add("", (int) 'a');
        int int23 = binaryEntityMap1.growBy;
        binaryEntityMap1.growBy = 'a';
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap3 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = null;
        hashEntityMap4.mapNameToValue = map5;
        java.lang.String str8 = hashEntityMap4.name((int) '4');
        java.util.Map map9 = hashEntityMap4.mapValueToName;
        hashEntityMap3.mapValueToName = map9;
        hashEntityMap0.mapValueToName = map9;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap12.mapNameToValue;
        java.util.Map map16 = hashEntityMap12.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.lang.String str21 = hashEntityMap17.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = null;
        hashEntityMap22.mapNameToValue = map23;
        java.lang.String str26 = hashEntityMap22.name((int) '4');
        java.lang.String str28 = hashEntityMap22.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = null;
        hashEntityMap29.mapNameToValue = map30;
        java.util.Map map32 = null;
        hashEntityMap29.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap29.mapNameToValue = map34;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = null;
        hashEntityMap36.mapNameToValue = map37;
        java.util.Map map39 = null;
        hashEntityMap36.mapNameToValue = map39;
        java.util.Map map41 = null;
        hashEntityMap36.mapNameToValue = map41;
        java.util.Map map43 = hashEntityMap36.mapValueToName;
        hashEntityMap29.mapNameToValue = map43;
        hashEntityMap22.mapValueToName = map43;
        hashEntityMap17.mapValueToName = map43;
        hashEntityMap12.mapNameToValue = map43;
        java.util.Map map48 = hashEntityMap12.mapNameToValue;
        hashEntityMap0.mapValueToName = map48;
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap3.add("hi!", 0);
        arrayEntityMap3.size = (byte) 1;
        arrayEntityMap3.size = (-1);
        arrayEntityMap3.size = (byte) 10;
        entities0.map = arrayEntityMap3;
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities0.map;
        java.lang.String str16 = entities0.entityName((int) 'a');
        entities0.addEntity("", (int) (byte) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("hi!", (int) (short) 0);
        java.lang.String str5 = entities0.unescape("");
        java.lang.String[][] strArray6 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray6);
        java.lang.String str9 = entities0.entityName((int) (byte) 10);
        java.lang.String str11 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(entityMap12);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        java.lang.String[] strArray19 = binaryEntityMap1.names;
        binaryEntityMap1.add("hi!", (int) (byte) -1);
        binaryEntityMap1.growBy = (byte) -1;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        int int9 = binaryEntityMap1.growBy;
        binaryEntityMap1.growBy = (-1);
        int int12 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.add("hi!", (-1));
        binaryEntityMap1.growBy = 10;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap1.mapValueToName = map27;
        entities0.map = hashEntityMap1;
        java.lang.String str33 = entities0.escape("hi!");
        java.lang.String str35 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities0.map = arrayEntityMap37;
        java.io.Writer writer39 = null;
        entities0.escape(writer39, "");
        java.lang.String str43 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities entities45 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap46 = entities45.map;
        java.lang.String str48 = entities45.unescape("hi!");
        org.apache.commons.lang.Entities entities49 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap50 = entities49.map;
        org.apache.commons.lang.Entities.EntityMap entityMap51 = entities49.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap53 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap53.add("hi!", 0);
        arrayEntityMap53.size = (byte) 1;
        arrayEntityMap53.growBy = 100;
        java.lang.String str62 = arrayEntityMap53.name((int) (byte) 1);
        entities49.map = arrayEntityMap53;
        entities45.map = arrayEntityMap53;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities45);
        org.apache.commons.lang.Entities entities66 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray67 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities66.addEntities(strArray67);
        entities45.addEntities(strArray67);
        entities0.addEntities(strArray67);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(entities45);
        org.junit.Assert.assertNotNull(entityMap46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(entities49);
        org.junit.Assert.assertNotNull(entityMap50);
        org.junit.Assert.assertNotNull(entityMap51);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(entities66);
        org.junit.Assert.assertNotNull(strArray67);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.util.Map map10 = null;
        hashEntityMap7.mapNameToValue = map10;
        java.util.Map map12 = null;
        hashEntityMap7.mapNameToValue = map12;
        java.util.Map map14 = hashEntityMap7.mapValueToName;
        hashEntityMap0.mapNameToValue = map14;
        int int17 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = null;
        hashEntityMap18.mapNameToValue = map19;
        java.lang.String str22 = hashEntityMap18.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = null;
        hashEntityMap23.mapNameToValue = map24;
        java.lang.String str27 = hashEntityMap23.name((int) '4');
        java.lang.String str29 = hashEntityMap23.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = null;
        hashEntityMap30.mapNameToValue = map31;
        java.util.Map map33 = null;
        hashEntityMap30.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap30.mapNameToValue = map35;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = null;
        hashEntityMap37.mapNameToValue = map38;
        java.util.Map map40 = null;
        hashEntityMap37.mapNameToValue = map40;
        java.util.Map map42 = null;
        hashEntityMap37.mapNameToValue = map42;
        java.util.Map map44 = hashEntityMap37.mapValueToName;
        hashEntityMap30.mapNameToValue = map44;
        hashEntityMap23.mapValueToName = map44;
        hashEntityMap18.mapValueToName = map44;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = null;
        hashEntityMap48.mapNameToValue = map49;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = null;
        hashEntityMap52.mapNameToValue = map53;
        java.lang.String str56 = hashEntityMap52.name((int) '4');
        java.util.Map map57 = hashEntityMap52.mapValueToName;
        hashEntityMap51.mapValueToName = map57;
        hashEntityMap48.mapValueToName = map57;
        hashEntityMap18.mapValueToName = map57;
        hashEntityMap0.mapNameToValue = map57;
        java.util.Map map62 = hashEntityMap0.mapNameToValue;
        java.util.Map map63 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        java.lang.String str7 = arrayEntityMap1.name(52);
        java.lang.String[] strArray8 = arrayEntityMap1.names;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { null });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { null });
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.add("hi!", 0);
        int int7 = arrayEntityMap1.size;
        int int8 = arrayEntityMap1.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray11 = arrayEntityMap10.values;
        java.lang.String str13 = arrayEntityMap10.name((int) (short) 100);
        int int15 = arrayEntityMap10.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap17.add("hi!", 0);
        arrayEntityMap17.size = (byte) 1;
        int[] intArray23 = new int[] {};
        arrayEntityMap17.values = intArray23;
        arrayEntityMap10.values = intArray23;
        arrayEntityMap1.values = intArray23;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] {});
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str7 = binaryEntityMap5.name((-1));
        entities0.map = binaryEntityMap5;
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray10 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities9.addEntities(strArray10);
        org.apache.commons.lang.Entities entities12 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities12.map;
        entities9.map = entityMap13;
        java.io.Writer writer15 = null;
        entities9.escape(writer15, "");
        org.apache.commons.lang.Entities entities18 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray19 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities18.addEntities(strArray19);
        org.apache.commons.lang.Entities entities21 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap22 = entities21.map;
        entities18.map = entityMap22;
        java.io.Writer writer24 = null;
        entities18.escape(writer24, "");
        java.lang.String str28 = entities18.unescape("hi!");
        org.apache.commons.lang.Entities entities29 = org.apache.commons.lang.Entities.HTML32;
        int int31 = entities29.entityValue("");
        java.lang.String[][] strArray32 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities29.addEntities(strArray32);
        entities18.addEntities(strArray32);
        entities9.addEntities(strArray32);
        entities0.addEntities(strArray32);
        org.junit.Assert.assertNotNull(entities0);
// flaky "18) test0749(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(entities12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNotNull(entities18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(entities21);
        org.junit.Assert.assertNotNull(entityMap22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(entities29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray3);
        int int6 = entities0.entityValue("hi!");
        java.lang.String str8 = entities0.escape("");
        java.lang.String str10 = entities0.entityName(100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.entityName(100);
        entities0.addEntity("hi!", 2);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) 'a');
        int int4 = lookupEntityMap0.value("hi!");
        java.lang.String str6 = lookupEntityMap0.name(52);
        java.lang.String str8 = lookupEntityMap0.name(35);
        lookupEntityMap0.add("", 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = lookupEntityMap0.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("");
        java.lang.String str4 = lookupEntityMap0.name(1);
        int int6 = lookupEntityMap0.value("hi!");
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = (short) -1;
        binaryEntityMap1.add("hi!", 100);
        java.lang.String str15 = binaryEntityMap1.name((int) (byte) 10);
        int[] intArray16 = binaryEntityMap1.values;
        binaryEntityMap1.add("hi!", (int) (short) 100);
        java.lang.String[] strArray20 = binaryEntityMap1.names;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        java.lang.String str11 = hashEntityMap0.name((int) (byte) -1);
        java.lang.String str13 = hashEntityMap0.name(10);
        java.util.Map map14 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(map14);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int12 = arrayEntityMap10.value("");
        java.lang.String[] strArray13 = arrayEntityMap10.names;
        int[] intArray14 = arrayEntityMap10.values;
        binaryEntityMap1.values = intArray14;
        java.lang.String str17 = binaryEntityMap1.name((-1));
        binaryEntityMap1.growBy = 52;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        int int6 = arrayEntityMap1.value("hi!");
        int int8 = arrayEntityMap1.value("hi!");
        java.lang.String str10 = arrayEntityMap1.name(10);
        arrayEntityMap1.add("", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities4 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities4.map;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities4.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        arrayEntityMap8.growBy = 100;
        java.lang.String str17 = arrayEntityMap8.name((int) (byte) 1);
        entities4.map = arrayEntityMap8;
        entities0.map = arrayEntityMap8;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str22 = entities0.escape("");
        org.apache.commons.lang.Entities.EntityMap entityMap23 = entities0.map;
        java.lang.String str25 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(entityMap23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        int int11 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.util.Map map11 = hashEntityMap6.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapValueToName;
        java.util.Map map14 = null;
        hashEntityMap12.mapNameToValue = map14;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.lang.String str21 = hashEntityMap17.name((int) '4');
        java.util.Map map22 = hashEntityMap17.mapValueToName;
        hashEntityMap16.mapValueToName = map22;
        hashEntityMap12.mapNameToValue = map22;
        hashEntityMap6.mapNameToValue = map22;
        java.lang.String str27 = hashEntityMap6.name(2);
        java.util.Map map28 = hashEntityMap6.mapNameToValue;
        entities0.map = hashEntityMap6;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int32 = hashEntityMap30.value("");
        java.util.Map map33 = hashEntityMap30.mapValueToName;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap34 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = null;
        hashEntityMap35.mapNameToValue = map36;
        java.util.Map map38 = null;
        hashEntityMap35.mapNameToValue = map38;
        java.util.Map map40 = null;
        hashEntityMap35.mapNameToValue = map40;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = null;
        hashEntityMap42.mapNameToValue = map43;
        java.util.Map map45 = null;
        hashEntityMap42.mapNameToValue = map45;
        java.util.Map map47 = null;
        hashEntityMap42.mapNameToValue = map47;
        java.util.Map map49 = hashEntityMap42.mapValueToName;
        hashEntityMap35.mapNameToValue = map49;
        treeEntityMap34.mapValueToName = map49;
        hashEntityMap30.mapValueToName = map49;
        java.util.Map map53 = hashEntityMap30.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map55 = null;
        hashEntityMap54.mapNameToValue = map55;
        java.util.Map map57 = null;
        hashEntityMap54.mapNameToValue = map57;
        java.util.Map map59 = hashEntityMap54.mapValueToName;
        hashEntityMap30.mapNameToValue = map59;
        hashEntityMap6.mapValueToName = map59;
        java.lang.String str63 = hashEntityMap6.name((int) '#');
        hashEntityMap6.add("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap1.mapValueToName = map27;
        entities0.map = hashEntityMap1;
        java.lang.String str33 = entities0.escape("hi!");
        java.lang.String str35 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities0.map = arrayEntityMap37;
        java.io.Writer writer39 = null;
        entities0.escape(writer39, "");
        java.lang.String str43 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int46 = entities0.entityValue("");
        java.io.Writer writer47 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer47, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray13 = null;
        binaryEntityMap12.values = intArray13;
        java.lang.String str16 = binaryEntityMap12.name((-1));
        entities0.map = binaryEntityMap12;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int21 = arrayEntityMap19.value("hi!");
        int int22 = arrayEntityMap19.growBy;
        int int23 = arrayEntityMap19.size;
        java.lang.String[] strArray24 = null;
        arrayEntityMap19.names = strArray24;
        int[] intArray26 = arrayEntityMap19.values;
        binaryEntityMap12.values = intArray26;
        int int28 = binaryEntityMap12.size;
        int int29 = binaryEntityMap12.size;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        java.lang.String str8 = hashEntityMap0.name((int) (short) 0);
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = null;
        hashEntityMap10.mapNameToValue = map11;
        java.lang.String str14 = hashEntityMap10.name((int) '4');
        java.lang.String str16 = hashEntityMap10.name((int) (short) 100);
        java.util.Map map17 = hashEntityMap10.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = null;
        hashEntityMap18.mapNameToValue = map19;
        java.util.Map map21 = null;
        hashEntityMap18.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap18.mapNameToValue = map23;
        java.util.Map map25 = hashEntityMap18.mapValueToName;
        hashEntityMap10.mapNameToValue = map25;
        int int28 = hashEntityMap10.value("");
        java.util.Map map29 = hashEntityMap10.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapValueToName;
        java.util.Map map32 = hashEntityMap30.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap33 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = null;
        hashEntityMap34.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap34.mapNameToValue = map37;
        java.util.Map map39 = null;
        hashEntityMap34.mapNameToValue = map39;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = null;
        hashEntityMap41.mapNameToValue = map42;
        java.util.Map map44 = null;
        hashEntityMap41.mapNameToValue = map44;
        java.util.Map map46 = null;
        hashEntityMap41.mapNameToValue = map46;
        java.util.Map map48 = hashEntityMap41.mapValueToName;
        hashEntityMap34.mapNameToValue = map48;
        treeEntityMap33.mapValueToName = map48;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map52 = null;
        hashEntityMap51.mapNameToValue = map52;
        java.lang.String str55 = hashEntityMap51.name((int) '4');
        java.lang.String str57 = hashEntityMap51.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap58 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map59 = null;
        hashEntityMap58.mapNameToValue = map59;
        java.util.Map map61 = null;
        hashEntityMap58.mapNameToValue = map61;
        java.util.Map map63 = null;
        hashEntityMap58.mapNameToValue = map63;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = null;
        hashEntityMap65.mapNameToValue = map66;
        java.util.Map map68 = null;
        hashEntityMap65.mapNameToValue = map68;
        java.util.Map map70 = null;
        hashEntityMap65.mapNameToValue = map70;
        java.util.Map map72 = hashEntityMap65.mapValueToName;
        hashEntityMap58.mapNameToValue = map72;
        hashEntityMap51.mapValueToName = map72;
        treeEntityMap33.mapNameToValue = map72;
        java.util.Map map76 = treeEntityMap33.mapNameToValue;
        hashEntityMap30.mapValueToName = map76;
        java.util.Map map78 = hashEntityMap30.mapValueToName;
        java.util.Map map79 = hashEntityMap30.mapValueToName;
        java.util.Map map80 = hashEntityMap30.mapValueToName;
        hashEntityMap10.mapValueToName = map80;
        hashEntityMap0.mapValueToName = map80;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int7 = arrayEntityMap5.value("");
        java.lang.String[] strArray8 = arrayEntityMap5.names;
        entities0.map = arrayEntityMap5;
        arrayEntityMap5.growBy = 0;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
// flaky "19) test0764(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities4 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities4.map;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities4.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        arrayEntityMap8.growBy = 100;
        java.lang.String str17 = arrayEntityMap8.name((int) (byte) 1);
        entities4.map = arrayEntityMap8;
        entities0.map = arrayEntityMap8;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str23 = binaryEntityMap21.name(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray28 = new int[] { ' ', '4' };
        binaryEntityMap25.values = intArray28;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap31 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray32 = arrayEntityMap31.values;
        java.lang.String str34 = arrayEntityMap31.name((int) (short) 100);
        int[] intArray37 = new int[] { (short) -1, 10 };
        arrayEntityMap31.values = intArray37;
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        arrayEntityMap31.names = strArray40;
        binaryEntityMap25.names = strArray40;
        binaryEntityMap21.names = strArray40;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap45 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int47 = arrayEntityMap45.value("");
        java.lang.String[] strArray48 = arrayEntityMap45.names;
        int[] intArray49 = arrayEntityMap45.values;
        binaryEntityMap21.values = intArray49;
        java.lang.String str52 = binaryEntityMap21.name((int) (short) -1);
        entities0.map = binaryEntityMap21;
        java.lang.String str55 = entities0.entityName((int) (byte) 10);
        java.lang.String str57 = entities0.escape("hi!");
        entities0.addEntity("", 0);
        entities0.addEntity("hi!", 2);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 0 });
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 0 });
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = null;
        hashEntityMap4.mapNameToValue = map5;
        java.lang.String str8 = hashEntityMap4.name((int) '4');
        java.lang.String str10 = hashEntityMap4.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = null;
        hashEntityMap11.mapNameToValue = map12;
        java.util.Map map14 = null;
        hashEntityMap11.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap11.mapNameToValue = map16;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = null;
        hashEntityMap18.mapNameToValue = map19;
        java.util.Map map21 = null;
        hashEntityMap18.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap18.mapNameToValue = map23;
        java.util.Map map25 = hashEntityMap18.mapValueToName;
        hashEntityMap11.mapNameToValue = map25;
        hashEntityMap4.mapValueToName = map25;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = null;
        hashEntityMap28.mapNameToValue = map29;
        java.lang.String str32 = hashEntityMap28.name((int) '4');
        java.lang.String str34 = hashEntityMap28.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = null;
        hashEntityMap35.mapNameToValue = map36;
        java.util.Map map38 = null;
        hashEntityMap35.mapNameToValue = map38;
        java.util.Map map40 = null;
        hashEntityMap35.mapNameToValue = map40;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = null;
        hashEntityMap42.mapNameToValue = map43;
        java.util.Map map45 = null;
        hashEntityMap42.mapNameToValue = map45;
        java.util.Map map47 = null;
        hashEntityMap42.mapNameToValue = map47;
        java.util.Map map49 = hashEntityMap42.mapValueToName;
        hashEntityMap35.mapNameToValue = map49;
        hashEntityMap28.mapValueToName = map49;
        hashEntityMap4.mapValueToName = map49;
        java.util.Map map53 = hashEntityMap4.mapNameToValue;
        java.util.Map map54 = hashEntityMap4.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = hashEntityMap55.mapValueToName;
        hashEntityMap4.mapValueToName = map56;
        entities0.map = hashEntityMap4;
        java.io.Writer writer59 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer59, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(map53);
        org.junit.Assert.assertNull(map54);
        org.junit.Assert.assertNotNull(map56);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        int int6 = lookupEntityMap0.value("");
        java.lang.Class<?> wildcardClass7 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        java.util.Map map2 = hashEntityMap0.mapNameToValue;
        int int4 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap5 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.util.Map map9 = null;
        hashEntityMap6.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap6.mapNameToValue = map11;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        java.util.Map map20 = hashEntityMap13.mapValueToName;
        hashEntityMap6.mapNameToValue = map20;
        treeEntityMap5.mapValueToName = map20;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = null;
        hashEntityMap23.mapNameToValue = map24;
        java.lang.String str27 = hashEntityMap23.name((int) '4');
        java.lang.String str29 = hashEntityMap23.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = null;
        hashEntityMap30.mapNameToValue = map31;
        java.util.Map map33 = null;
        hashEntityMap30.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap30.mapNameToValue = map35;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = null;
        hashEntityMap37.mapNameToValue = map38;
        java.util.Map map40 = null;
        hashEntityMap37.mapNameToValue = map40;
        java.util.Map map42 = null;
        hashEntityMap37.mapNameToValue = map42;
        java.util.Map map44 = hashEntityMap37.mapValueToName;
        hashEntityMap30.mapNameToValue = map44;
        hashEntityMap23.mapValueToName = map44;
        treeEntityMap5.mapNameToValue = map44;
        java.util.Map map48 = treeEntityMap5.mapNameToValue;
        java.lang.String str50 = treeEntityMap5.name((int) (byte) 100);
        java.lang.String str52 = treeEntityMap5.name(0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = null;
        hashEntityMap53.mapNameToValue = map54;
        java.lang.String str57 = hashEntityMap53.name((int) '4');
        java.lang.String str59 = hashEntityMap53.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map61 = null;
        hashEntityMap60.mapNameToValue = map61;
        java.util.Map map63 = null;
        hashEntityMap60.mapNameToValue = map63;
        java.util.Map map65 = null;
        hashEntityMap60.mapNameToValue = map65;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map68 = null;
        hashEntityMap67.mapNameToValue = map68;
        java.util.Map map70 = null;
        hashEntityMap67.mapNameToValue = map70;
        java.util.Map map72 = null;
        hashEntityMap67.mapNameToValue = map72;
        java.util.Map map74 = hashEntityMap67.mapValueToName;
        hashEntityMap60.mapNameToValue = map74;
        hashEntityMap53.mapValueToName = map74;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap77 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map78 = null;
        hashEntityMap77.mapNameToValue = map78;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap80 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap81 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map82 = null;
        hashEntityMap81.mapNameToValue = map82;
        java.lang.String str85 = hashEntityMap81.name((int) '4');
        java.util.Map map86 = hashEntityMap81.mapValueToName;
        hashEntityMap80.mapValueToName = map86;
        hashEntityMap77.mapValueToName = map86;
        hashEntityMap53.mapNameToValue = map86;
        hashEntityMap53.add("hi!", (int) (short) 1);
        java.util.Map map93 = hashEntityMap53.mapNameToValue;
        treeEntityMap5.mapValueToName = map93;
        hashEntityMap0.mapNameToValue = map93;
        java.lang.String str97 = hashEntityMap0.name((int) (byte) 10);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNull(str97);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        java.lang.String[] strArray19 = binaryEntityMap1.names;
        binaryEntityMap1.add("", 10);
        binaryEntityMap1.ensureCapacity(10);
        int int25 = binaryEntityMap1.growBy;
        int int26 = binaryEntityMap1.growBy;
        binaryEntityMap1.add("", 2);
        binaryEntityMap1.add("", 0);
        int int34 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(10);
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str14 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("", 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        int int4 = arrayEntityMap1.growBy;
        int int5 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = null;
        hashEntityMap10.mapNameToValue = map11;
        java.lang.String str14 = hashEntityMap10.name((int) '4');
        java.lang.String str16 = hashEntityMap10.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.util.Map map20 = null;
        hashEntityMap17.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap17.mapNameToValue = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.util.Map map27 = null;
        hashEntityMap24.mapNameToValue = map27;
        java.util.Map map29 = null;
        hashEntityMap24.mapNameToValue = map29;
        java.util.Map map31 = hashEntityMap24.mapValueToName;
        hashEntityMap17.mapNameToValue = map31;
        hashEntityMap10.mapValueToName = map31;
        hashEntityMap5.mapValueToName = map31;
        hashEntityMap0.mapNameToValue = map31;
        java.util.Map map36 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", 100);
        java.util.Map map40 = hashEntityMap0.mapNameToValue;
        int int42 = hashEntityMap0.value("");
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        java.lang.String str9 = binaryEntityMap1.name(1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.lang.String str12 = hashEntityMap8.name((int) '4');
        java.lang.String str14 = hashEntityMap8.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap15.mapNameToValue = map18;
        java.util.Map map20 = null;
        hashEntityMap15.mapNameToValue = map20;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = null;
        hashEntityMap22.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap22.mapNameToValue = map25;
        java.util.Map map27 = null;
        hashEntityMap22.mapNameToValue = map27;
        java.util.Map map29 = hashEntityMap22.mapValueToName;
        hashEntityMap15.mapNameToValue = map29;
        hashEntityMap8.mapValueToName = map29;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = null;
        hashEntityMap32.mapNameToValue = map33;
        java.lang.String str36 = hashEntityMap32.name((int) '4');
        java.lang.String str38 = hashEntityMap32.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map40 = null;
        hashEntityMap39.mapNameToValue = map40;
        java.util.Map map42 = null;
        hashEntityMap39.mapNameToValue = map42;
        java.util.Map map44 = null;
        hashEntityMap39.mapNameToValue = map44;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = null;
        hashEntityMap46.mapNameToValue = map47;
        java.util.Map map49 = null;
        hashEntityMap46.mapNameToValue = map49;
        java.util.Map map51 = null;
        hashEntityMap46.mapNameToValue = map51;
        java.util.Map map53 = hashEntityMap46.mapValueToName;
        hashEntityMap39.mapNameToValue = map53;
        hashEntityMap32.mapValueToName = map53;
        hashEntityMap8.mapValueToName = map53;
        java.util.Map map57 = hashEntityMap8.mapNameToValue;
        java.util.Map map58 = hashEntityMap8.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = null;
        hashEntityMap59.mapNameToValue = map60;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map64 = null;
        hashEntityMap63.mapNameToValue = map64;
        java.lang.String str67 = hashEntityMap63.name((int) '4');
        java.util.Map map68 = hashEntityMap63.mapValueToName;
        hashEntityMap62.mapValueToName = map68;
        hashEntityMap59.mapValueToName = map68;
        java.util.Map map71 = hashEntityMap59.mapValueToName;
        hashEntityMap8.mapNameToValue = map71;
        hashEntityMap0.mapNameToValue = map71;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("hi!", (int) (byte) 1);
        java.lang.String str19 = lookupEntityMap0.name(32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = lookupEntityMap0.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap1.mapValueToName = map27;
        entities0.map = hashEntityMap1;
        java.lang.String str33 = entities0.escape("hi!");
        java.lang.String str35 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities0.map = arrayEntityMap37;
        java.io.Writer writer39 = null;
        entities0.escape(writer39, "");
        java.lang.String str43 = entities0.entityName((int) (byte) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str6 = lookupEntityMap0.name(100);
        int int8 = lookupEntityMap0.value("hi!");
        java.lang.String str10 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str12 = lookupEntityMap0.name(35);
        int int14 = lookupEntityMap0.value("hi!");
        java.lang.String str16 = lookupEntityMap0.name(0);
        java.lang.String str18 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = 100;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.ensureCapacity((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for object array[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("hi!", (int) (byte) 1);
        lookupEntityMap0.add("", 35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = lookupEntityMap0.name((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        int int9 = arrayEntityMap1.value("");
        java.lang.String str11 = arrayEntityMap1.name((int) (short) 0);
        java.lang.String str13 = arrayEntityMap1.name((int) '#');
        arrayEntityMap1.ensureCapacity((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        java.util.Map map2 = null;
        hashEntityMap0.mapNameToValue = map2;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        java.util.Map map10 = hashEntityMap5.mapValueToName;
        hashEntityMap4.mapValueToName = map10;
        hashEntityMap0.mapNameToValue = map10;
        java.util.Map map13 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) '#');
        hashEntityMap0.add("hi!", (int) (short) 1);
        java.lang.String str21 = hashEntityMap0.name(0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        binaryEntityMap1.growBy = 100;
        java.lang.String[] strArray17 = binaryEntityMap1.names;
        int int19 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) '4');
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap6 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str8 = lookupEntityMap6.name(0);
        java.lang.String str10 = lookupEntityMap6.name(0);
        int int12 = lookupEntityMap6.value("");
        entities0.map = lookupEntityMap6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = lookupEntityMap6.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = lookupEntityMap0.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.ensureCapacity((int) (byte) 1);
        binaryEntityMap1.add("hi!", (int) (byte) 0);
        int int9 = binaryEntityMap1.growBy;
        int int10 = binaryEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str7 = binaryEntityMap5.name((-1));
        entities0.map = binaryEntityMap5;
        binaryEntityMap5.add("hi!", 0);
        org.junit.Assert.assertNotNull(entities0);
// flaky "20) test0786(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        java.lang.String str5 = binaryEntityMap1.name((int) (byte) 0);
        java.lang.String str7 = binaryEntityMap1.name(0);
        int int8 = binaryEntityMap1.growBy;
        binaryEntityMap1.ensureCapacity((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNull(map7);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        java.lang.String str6 = arrayEntityMap1.name(0);
        int[] intArray7 = arrayEntityMap1.values;
        arrayEntityMap1.growBy = 1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray12 = arrayEntityMap11.values;
        java.lang.String str14 = arrayEntityMap11.name((int) (short) 100);
        arrayEntityMap11.size = (byte) 0;
        int int17 = arrayEntityMap11.size;
        int int19 = arrayEntityMap11.value("");
        java.lang.String str21 = arrayEntityMap11.name((int) (short) 0);
        java.lang.String[] strArray22 = arrayEntityMap11.names;
        arrayEntityMap1.names = strArray22;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { null });
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap3.add("hi!", 0);
        arrayEntityMap3.size = (byte) 1;
        arrayEntityMap3.size = (-1);
        arrayEntityMap3.size = (byte) 10;
        entities0.map = arrayEntityMap3;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.lang.String str18 = hashEntityMap14.name((int) '4');
        java.util.Map map19 = hashEntityMap14.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapValueToName;
        java.util.Map map22 = null;
        hashEntityMap20.mapNameToValue = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = null;
        hashEntityMap25.mapNameToValue = map26;
        java.lang.String str29 = hashEntityMap25.name((int) '4');
        java.util.Map map30 = hashEntityMap25.mapValueToName;
        hashEntityMap24.mapValueToName = map30;
        hashEntityMap20.mapNameToValue = map30;
        hashEntityMap14.mapNameToValue = map30;
        java.lang.String str35 = hashEntityMap14.name(2);
        java.lang.String str37 = hashEntityMap14.name((int) (byte) 10);
        entities0.map = hashEntityMap14;
        org.apache.commons.lang.Entities.EntityMap entityMap39 = entities0.map;
        entityMap39.add("", 35);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(entityMap39);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.growBy = 35;
        int int8 = arrayEntityMap1.value("");
        int int10 = arrayEntityMap1.value("");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        int int4 = entities0.entityValue("hi!");
        java.lang.String str6 = entities0.escape("hi!");
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities4 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities4.map;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities4.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        arrayEntityMap8.growBy = 100;
        java.lang.String str17 = arrayEntityMap8.name((int) (byte) 1);
        entities4.map = arrayEntityMap8;
        entities0.map = arrayEntityMap8;
        int[] intArray20 = arrayEntityMap8.values;
        int int21 = arrayEntityMap8.size;
        int[] intArray22 = arrayEntityMap8.values;
        java.lang.Class<?> wildcardClass23 = arrayEntityMap8.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap1.mapValueToName = map27;
        entities0.map = hashEntityMap1;
        java.lang.String str33 = entities0.escape("hi!");
        java.lang.String str35 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities0.map = arrayEntityMap37;
        java.lang.String str40 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str43 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities44 = org.apache.commons.lang.Entities.HTML32;
        int int46 = entities44.entityValue("");
        entities44.addEntity("", (int) (short) 10);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities44);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities44);
        org.apache.commons.lang.Entities entities52 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap54 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray55 = arrayEntityMap54.values;
        java.lang.String str57 = arrayEntityMap54.name((int) (short) 100);
        int[] intArray60 = new int[] { (short) -1, 10 };
        arrayEntityMap54.values = intArray60;
        entities52.map = arrayEntityMap54;
        int int64 = entities52.entityValue("");
        org.apache.commons.lang.Entities entities65 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap66 = entities65.map;
        java.lang.String str68 = entities65.unescape("hi!");
        org.apache.commons.lang.Entities entities69 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap70 = entities69.map;
        org.apache.commons.lang.Entities.EntityMap entityMap71 = entities69.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap73 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap73.add("hi!", 0);
        arrayEntityMap73.size = (byte) 1;
        arrayEntityMap73.growBy = 100;
        java.lang.String str82 = arrayEntityMap73.name((int) (byte) 1);
        entities69.map = arrayEntityMap73;
        entities65.map = arrayEntityMap73;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities65);
        org.apache.commons.lang.Entities entities86 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray87 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities86.addEntities(strArray87);
        entities65.addEntities(strArray87);
        entities52.addEntities(strArray87);
        entities44.addEntities(strArray87);
        entities0.addEntities(strArray87);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(entities44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(entities52);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 0 });
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 160, 10 });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(entities65);
        org.junit.Assert.assertNotNull(entityMap66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(entities69);
        org.junit.Assert.assertNotNull(entityMap70);
        org.junit.Assert.assertNotNull(entityMap71);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(entities86);
        org.junit.Assert.assertNotNull(strArray87);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int6 = binaryEntityMap1.growBy;
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 100);
        java.lang.String str10 = binaryEntityMap1.name(0);
        binaryEntityMap1.add("hi!", 32);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        int int6 = lookupEntityMap0.value("hi!");
        java.lang.String str8 = lookupEntityMap0.name(32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = hashEntityMap6.mapValueToName;
        java.util.Map map8 = null;
        hashEntityMap6.mapNameToValue = map8;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = null;
        hashEntityMap11.mapNameToValue = map12;
        java.lang.String str15 = hashEntityMap11.name((int) '4');
        java.util.Map map16 = hashEntityMap11.mapValueToName;
        hashEntityMap10.mapValueToName = map16;
        hashEntityMap6.mapNameToValue = map16;
        hashEntityMap0.mapNameToValue = map16;
        java.lang.String str21 = hashEntityMap0.name(2);
        java.util.Map map22 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.lang.String str28 = hashEntityMap24.name((int) '4');
        java.util.Map map29 = hashEntityMap24.mapValueToName;
        hashEntityMap23.mapValueToName = map29;
        java.util.Map map31 = hashEntityMap23.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = null;
        hashEntityMap33.mapNameToValue = map34;
        java.lang.String str37 = hashEntityMap33.name((int) '4');
        java.util.Map map38 = hashEntityMap33.mapValueToName;
        hashEntityMap32.mapValueToName = map38;
        java.util.Map map40 = hashEntityMap32.mapValueToName;
        hashEntityMap23.mapNameToValue = map40;
        java.util.Map map42 = hashEntityMap23.mapValueToName;
        hashEntityMap0.mapValueToName = map42;
        java.util.Map map44 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = null;
        hashEntityMap45.mapNameToValue = map46;
        java.util.Map map48 = null;
        hashEntityMap45.mapNameToValue = map48;
        java.util.Map map50 = null;
        hashEntityMap45.mapNameToValue = map50;
        java.util.Map map52 = hashEntityMap45.mapValueToName;
        java.util.Map map53 = hashEntityMap45.mapNameToValue;
        java.util.Map map54 = hashEntityMap45.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int57 = hashEntityMap55.value("");
        java.util.Map map58 = hashEntityMap55.mapValueToName;
        hashEntityMap45.mapValueToName = map58;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map61 = null;
        hashEntityMap60.mapNameToValue = map61;
        java.util.Map map63 = null;
        hashEntityMap60.mapNameToValue = map63;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap66 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map67 = null;
        hashEntityMap66.mapNameToValue = map67;
        java.lang.String str70 = hashEntityMap66.name((int) '4');
        java.util.Map map71 = hashEntityMap66.mapValueToName;
        hashEntityMap65.mapValueToName = map71;
        java.util.Map map73 = hashEntityMap65.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap74 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map76 = null;
        hashEntityMap75.mapNameToValue = map76;
        java.lang.String str79 = hashEntityMap75.name((int) '4');
        java.util.Map map80 = hashEntityMap75.mapValueToName;
        hashEntityMap74.mapValueToName = map80;
        java.util.Map map82 = hashEntityMap74.mapValueToName;
        hashEntityMap65.mapNameToValue = map82;
        java.util.Map map84 = hashEntityMap65.mapValueToName;
        hashEntityMap60.mapValueToName = map84;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap86 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map87 = null;
        hashEntityMap86.mapNameToValue = map87;
        java.lang.String str90 = hashEntityMap86.name((int) '4');
        java.util.Map map91 = hashEntityMap86.mapValueToName;
        hashEntityMap60.mapValueToName = map91;
        hashEntityMap45.mapNameToValue = map91;
        hashEntityMap0.mapNameToValue = map91;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = (-1);
        int int9 = arrayEntityMap1.growBy;
        java.lang.String str11 = arrayEntityMap1.name((int) (short) 1);
        java.lang.String str13 = arrayEntityMap1.name((int) (byte) 1);
        arrayEntityMap1.size = '#';
        java.lang.Class<?> wildcardClass16 = arrayEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        java.util.Map map4 = null;
        hashEntityMap0.mapValueToName = map4;
        int int7 = hashEntityMap0.value("");
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        java.util.Map map10 = hashEntityMap0.mapValueToName;
        int int12 = hashEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str8 = entities6.entityName((int) '#');
        entities6.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities6.map;
        java.io.Writer writer13 = null;
        entities6.escape(writer13, "");
        java.lang.String str17 = entities6.unescape("hi!");
        org.apache.commons.lang.Entities entities18 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities18.map;
        java.lang.String str21 = entities18.unescape("hi!");
        org.apache.commons.lang.Entities entities22 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap23 = entities22.map;
        org.apache.commons.lang.Entities.EntityMap entityMap24 = entities22.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap26.add("hi!", 0);
        arrayEntityMap26.size = (byte) 1;
        arrayEntityMap26.growBy = 100;
        java.lang.String str35 = arrayEntityMap26.name((int) (byte) 1);
        entities22.map = arrayEntityMap26;
        entities18.map = arrayEntityMap26;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities18);
        org.apache.commons.lang.Entities entities39 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray40 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities39.addEntities(strArray40);
        entities18.addEntities(strArray40);
        entities6.addEntities(strArray40);
        entities0.addEntities(strArray40);
        java.lang.String str46 = entities0.escape("");
        java.lang.String str48 = entities0.entityName((int) (byte) 100);
        java.lang.String str50 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(entities18);
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertNotNull(entityMap23);
        org.junit.Assert.assertNotNull(entityMap24);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(entities39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
// flaky "21) test0800(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        int[] intArray7 = new int[] {};
        arrayEntityMap1.values = intArray7;
        int int10 = arrayEntityMap1.value("");
        arrayEntityMap1.size = 10;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(32);
        lookupEntityMap0.add("", (int) (short) 0);
        java.lang.String str15 = lookupEntityMap0.name((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        binaryEntityMap5.size = '#';
        int[] intArray12 = binaryEntityMap5.values;
        binaryEntityMap1.values = intArray12;
        java.lang.Class<?> wildcardClass14 = intArray12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        java.lang.String str5 = binaryEntityMap1.name((int) (byte) 1);
        java.lang.String str7 = binaryEntityMap1.name((int) (short) 0);
        binaryEntityMap1.add("", (int) '4');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray13 = new int[] { ' ', '4' };
        binaryEntityMap10.values = intArray13;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray17 = arrayEntityMap16.values;
        java.lang.String str19 = arrayEntityMap16.name((int) (short) 100);
        int[] intArray22 = new int[] { (short) -1, 10 };
        arrayEntityMap16.values = intArray22;
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        arrayEntityMap16.names = strArray25;
        binaryEntityMap10.names = strArray25;
        int int29 = binaryEntityMap10.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap31 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap31.add("hi!", 0);
        arrayEntityMap31.size = (byte) 1;
        arrayEntityMap31.size = (-1);
        arrayEntityMap31.size = (byte) 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap42 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int44 = arrayEntityMap42.value("");
        arrayEntityMap42.size = (byte) 100;
        arrayEntityMap42.size = 100;
        arrayEntityMap42.ensureCapacity((int) (short) 1);
        int[] intArray51 = arrayEntityMap42.values;
        arrayEntityMap31.values = intArray51;
        binaryEntityMap10.values = intArray51;
        entities0.map = binaryEntityMap10;
        binaryEntityMap10.growBy = 'a';
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0 });
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 0 });
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        int int5 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap6.add("", (int) (byte) 100);
        int int11 = hashEntityMap6.value("");
        java.util.Map map12 = hashEntityMap6.mapValueToName;
        hashEntityMap0.mapValueToName = map12;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.util.Map map17 = hashEntityMap14.mapNameToValue;
        java.util.Map map18 = hashEntityMap14.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.lang.String str23 = hashEntityMap19.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.lang.String str28 = hashEntityMap24.name((int) '4');
        java.lang.String str30 = hashEntityMap24.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap31.mapNameToValue = map34;
        java.util.Map map36 = null;
        hashEntityMap31.mapNameToValue = map36;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = null;
        hashEntityMap38.mapNameToValue = map39;
        java.util.Map map41 = null;
        hashEntityMap38.mapNameToValue = map41;
        java.util.Map map43 = null;
        hashEntityMap38.mapNameToValue = map43;
        java.util.Map map45 = hashEntityMap38.mapValueToName;
        hashEntityMap31.mapNameToValue = map45;
        hashEntityMap24.mapValueToName = map45;
        hashEntityMap19.mapValueToName = map45;
        hashEntityMap14.mapNameToValue = map45;
        java.util.Map map50 = hashEntityMap14.mapNameToValue;
        java.util.Map map51 = hashEntityMap14.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = null;
        hashEntityMap52.mapNameToValue = map53;
        java.util.Map map55 = null;
        hashEntityMap52.mapNameToValue = map55;
        java.util.Map map57 = null;
        hashEntityMap52.mapNameToValue = map57;
        java.util.Map map59 = hashEntityMap52.mapValueToName;
        java.util.Map map60 = hashEntityMap52.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map62 = hashEntityMap61.mapValueToName;
        java.util.Map map63 = hashEntityMap61.mapNameToValue;
        hashEntityMap52.mapValueToName = map63;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap66 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map67 = null;
        hashEntityMap66.mapNameToValue = map67;
        java.lang.String str70 = hashEntityMap66.name((int) '4');
        java.util.Map map71 = hashEntityMap66.mapValueToName;
        hashEntityMap65.mapValueToName = map71;
        java.util.Map map73 = hashEntityMap65.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap74 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map76 = null;
        hashEntityMap75.mapNameToValue = map76;
        java.lang.String str79 = hashEntityMap75.name((int) '4');
        java.util.Map map80 = hashEntityMap75.mapValueToName;
        hashEntityMap74.mapValueToName = map80;
        java.util.Map map82 = hashEntityMap74.mapValueToName;
        hashEntityMap65.mapNameToValue = map82;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap84 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map85 = null;
        hashEntityMap84.mapNameToValue = map85;
        java.util.Map map87 = null;
        hashEntityMap84.mapNameToValue = map87;
        java.util.Map map89 = null;
        hashEntityMap84.mapNameToValue = map89;
        java.util.Map map91 = hashEntityMap84.mapValueToName;
        hashEntityMap65.mapNameToValue = map91;
        hashEntityMap52.mapNameToValue = map91;
        hashEntityMap14.mapNameToValue = map91;
        hashEntityMap0.mapValueToName = map91;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(map60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        entities0.addEntity("", (int) (short) 1);
        java.lang.String str7 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        int int10 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        int int14 = binaryEntityMap1.value("");
        java.lang.String str16 = binaryEntityMap1.name((int) 'a');
        binaryEntityMap1.growBy = 0;
        int int19 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String[] strArray11 = binaryEntityMap1.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap13 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap13.add("hi!", 0);
        arrayEntityMap13.size = (byte) 1;
        int[] intArray19 = new int[] {};
        arrayEntityMap13.values = intArray19;
        binaryEntityMap1.values = intArray19;
        int int22 = binaryEntityMap1.growBy;
        binaryEntityMap1.growBy = 52;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap28 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int30 = arrayEntityMap28.value("hi!");
        arrayEntityMap28.size = (byte) 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str36 = binaryEntityMap34.name((int) '#');
        int[] intArray37 = binaryEntityMap34.values;
        arrayEntityMap28.values = intArray37;
        arrayEntityMap26.values = intArray37;
        binaryEntityMap1.values = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = binaryEntityMap1.name(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] {});
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = null;
        hashEntityMap10.mapNameToValue = map11;
        java.lang.String str14 = hashEntityMap10.name((int) '4');
        java.lang.String str16 = hashEntityMap10.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.util.Map map20 = null;
        hashEntityMap17.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap17.mapNameToValue = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.util.Map map27 = null;
        hashEntityMap24.mapNameToValue = map27;
        java.util.Map map29 = null;
        hashEntityMap24.mapNameToValue = map29;
        java.util.Map map31 = hashEntityMap24.mapValueToName;
        hashEntityMap17.mapNameToValue = map31;
        hashEntityMap10.mapValueToName = map31;
        hashEntityMap5.mapValueToName = map31;
        hashEntityMap0.mapNameToValue = map31;
        java.util.Map map36 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int39 = hashEntityMap37.value("");
        java.util.Map map40 = hashEntityMap37.mapValueToName;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap41 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = null;
        hashEntityMap42.mapNameToValue = map43;
        java.util.Map map45 = null;
        hashEntityMap42.mapNameToValue = map45;
        java.util.Map map47 = null;
        hashEntityMap42.mapNameToValue = map47;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map50 = null;
        hashEntityMap49.mapNameToValue = map50;
        java.util.Map map52 = null;
        hashEntityMap49.mapNameToValue = map52;
        java.util.Map map54 = null;
        hashEntityMap49.mapNameToValue = map54;
        java.util.Map map56 = hashEntityMap49.mapValueToName;
        hashEntityMap42.mapNameToValue = map56;
        treeEntityMap41.mapValueToName = map56;
        hashEntityMap37.mapValueToName = map56;
        java.util.Map map60 = hashEntityMap37.mapValueToName;
        hashEntityMap0.mapNameToValue = map60;
        java.util.Map map62 = hashEntityMap0.mapNameToValue;
        java.util.Map map63 = null;
        hashEntityMap0.mapNameToValue = map63;
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str6 = binaryEntityMap4.name((-1));
        entities0.map = binaryEntityMap4;
        entities0.addEntity("", 2);
        java.io.Writer writer11 = null;
        entities0.escape(writer11, "");
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name(10);
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", 0);
        int int15 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        hashEntityMap0.add("", (int) (byte) 0);
        java.lang.String str12 = hashEntityMap0.name((int) (short) 10);
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap13 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap14.mapNameToValue = map17;
        java.util.Map map19 = null;
        hashEntityMap14.mapNameToValue = map19;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = null;
        hashEntityMap21.mapNameToValue = map22;
        java.util.Map map24 = null;
        hashEntityMap21.mapNameToValue = map24;
        java.util.Map map26 = null;
        hashEntityMap21.mapNameToValue = map26;
        java.util.Map map28 = hashEntityMap21.mapValueToName;
        hashEntityMap14.mapNameToValue = map28;
        treeEntityMap13.mapValueToName = map28;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        java.lang.String str35 = hashEntityMap31.name((int) '4');
        java.lang.String str37 = hashEntityMap31.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = null;
        hashEntityMap38.mapNameToValue = map39;
        java.util.Map map41 = null;
        hashEntityMap38.mapNameToValue = map41;
        java.util.Map map43 = null;
        hashEntityMap38.mapNameToValue = map43;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = null;
        hashEntityMap45.mapNameToValue = map46;
        java.util.Map map48 = null;
        hashEntityMap45.mapNameToValue = map48;
        java.util.Map map50 = null;
        hashEntityMap45.mapNameToValue = map50;
        java.util.Map map52 = hashEntityMap45.mapValueToName;
        hashEntityMap38.mapNameToValue = map52;
        hashEntityMap31.mapValueToName = map52;
        treeEntityMap13.mapNameToValue = map52;
        int int57 = treeEntityMap13.value("hi!");
        int int59 = treeEntityMap13.value("");
        java.util.Map map60 = treeEntityMap13.mapValueToName;
        hashEntityMap0.mapNameToValue = map60;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        java.lang.String str11 = hashEntityMap5.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = null;
        hashEntityMap12.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap12.mapNameToValue = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap19.mapNameToValue = map22;
        java.util.Map map24 = null;
        hashEntityMap19.mapNameToValue = map24;
        java.util.Map map26 = hashEntityMap19.mapValueToName;
        hashEntityMap12.mapNameToValue = map26;
        hashEntityMap5.mapValueToName = map26;
        hashEntityMap0.mapValueToName = map26;
        java.lang.String str31 = hashEntityMap0.name((int) '#');
        java.util.Map map32 = null;
        hashEntityMap0.mapValueToName = map32;
        java.util.Map map34 = hashEntityMap0.mapNameToValue;
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(map34);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        java.lang.String[] strArray19 = binaryEntityMap1.names;
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.ensureCapacity((int) '#');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray29 = new int[] { ' ', '4' };
        binaryEntityMap26.values = intArray29;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap32 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray33 = arrayEntityMap32.values;
        java.lang.String str35 = arrayEntityMap32.name((int) (short) 100);
        int[] intArray38 = new int[] { (short) -1, 10 };
        arrayEntityMap32.values = intArray38;
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        arrayEntityMap32.names = strArray41;
        binaryEntityMap26.names = strArray41;
        int int45 = binaryEntityMap26.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap47 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap47.add("hi!", 0);
        arrayEntityMap47.size = (byte) 1;
        arrayEntityMap47.size = (-1);
        arrayEntityMap47.size = (byte) 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap58 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int60 = arrayEntityMap58.value("");
        arrayEntityMap58.size = (byte) 100;
        arrayEntityMap58.size = 100;
        arrayEntityMap58.ensureCapacity((int) (short) 1);
        int[] intArray67 = arrayEntityMap58.values;
        arrayEntityMap47.values = intArray67;
        binaryEntityMap26.values = intArray67;
        binaryEntityMap1.values = intArray67;
        java.lang.String[] strArray71 = binaryEntityMap1.names;
        int int73 = binaryEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap75 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap75.ensureCapacity(0);
        binaryEntityMap75.ensureCapacity(100);
        binaryEntityMap75.add("", (int) (byte) 1);
        int[] intArray86 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap75.values = intArray86;
        binaryEntityMap75.add("", 0);
        java.lang.String[] strArray91 = binaryEntityMap75.names;
        binaryEntityMap1.names = strArray91;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 0 });
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 0, 1, 32 });
        org.junit.Assert.assertNotNull(strArray91);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        java.lang.String[] strArray19 = binaryEntityMap1.names;
        binaryEntityMap1.add("", 10);
        binaryEntityMap1.ensureCapacity(10);
        int int25 = binaryEntityMap1.growBy;
        int int26 = binaryEntityMap1.growBy;
        binaryEntityMap1.add("", 2);
        binaryEntityMap1.add("", 0);
        binaryEntityMap1.size = 35;
        binaryEntityMap1.size = 100;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        java.lang.String str11 = hashEntityMap0.name((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hashEntityMap0.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap3.add("hi!", 0);
        arrayEntityMap3.size = (byte) 1;
        arrayEntityMap3.size = (-1);
        arrayEntityMap3.size = (byte) 10;
        entities0.map = arrayEntityMap3;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray16 = arrayEntityMap15.values;
        java.lang.String str18 = arrayEntityMap15.name((int) (short) 100);
        int int20 = arrayEntityMap15.value("hi!");
        arrayEntityMap15.size = (byte) 0;
        int int23 = arrayEntityMap15.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap25.add("hi!", 0);
        arrayEntityMap25.size = (byte) 1;
        int[] intArray31 = new int[] {};
        arrayEntityMap25.values = intArray31;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap34 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int36 = arrayEntityMap34.value("");
        java.lang.String[] strArray37 = arrayEntityMap34.names;
        arrayEntityMap25.names = strArray37;
        arrayEntityMap15.names = strArray37;
        java.lang.String str41 = arrayEntityMap15.name(1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap43 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str45 = binaryEntityMap43.name(100);
        java.lang.String str47 = binaryEntityMap43.name((-1));
        int int48 = binaryEntityMap43.size;
        binaryEntityMap43.growBy = (short) 1;
        int[] intArray51 = binaryEntityMap43.values;
        arrayEntityMap15.values = intArray51;
        arrayEntityMap3.values = intArray51;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0 });
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { null });
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(intArray51);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap8.mapValueToName;
        hashEntityMap0.mapNameToValue = map15;
        int int18 = hashEntityMap0.value("");
        java.util.Map map19 = null;
        hashEntityMap0.mapNameToValue = map19;
        java.util.Map map21 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = null;
        hashEntityMap22.mapNameToValue = map23;
        java.lang.String str26 = hashEntityMap22.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = null;
        hashEntityMap27.mapNameToValue = map28;
        java.lang.String str31 = hashEntityMap27.name((int) '4');
        java.lang.String str33 = hashEntityMap27.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = null;
        hashEntityMap34.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap34.mapNameToValue = map37;
        java.util.Map map39 = null;
        hashEntityMap34.mapNameToValue = map39;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = null;
        hashEntityMap41.mapNameToValue = map42;
        java.util.Map map44 = null;
        hashEntityMap41.mapNameToValue = map44;
        java.util.Map map46 = null;
        hashEntityMap41.mapNameToValue = map46;
        java.util.Map map48 = hashEntityMap41.mapValueToName;
        hashEntityMap34.mapNameToValue = map48;
        hashEntityMap27.mapValueToName = map48;
        hashEntityMap22.mapValueToName = map48;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = null;
        hashEntityMap52.mapNameToValue = map53;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map57 = null;
        hashEntityMap56.mapNameToValue = map57;
        java.lang.String str60 = hashEntityMap56.name((int) '4');
        java.util.Map map61 = hashEntityMap56.mapValueToName;
        hashEntityMap55.mapValueToName = map61;
        hashEntityMap52.mapValueToName = map61;
        hashEntityMap22.mapValueToName = map61;
        hashEntityMap0.mapNameToValue = map61;
        int int67 = hashEntityMap0.value("hi!");
        java.util.Map map68 = hashEntityMap0.mapNameToValue;
        java.util.Map map69 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = hashEntityMap0.name((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        int int14 = binaryEntityMap1.value("");
        java.lang.String str16 = binaryEntityMap1.name((int) 'a');
        binaryEntityMap1.growBy = 0;
        binaryEntityMap1.ensureCapacity((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        binaryEntityMap1.growBy = ' ';
        java.lang.Class<?> wildcardClass10 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = hashEntityMap6.mapValueToName;
        java.util.Map map8 = null;
        hashEntityMap6.mapNameToValue = map8;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = null;
        hashEntityMap11.mapNameToValue = map12;
        java.lang.String str15 = hashEntityMap11.name((int) '4');
        java.util.Map map16 = hashEntityMap11.mapValueToName;
        hashEntityMap10.mapValueToName = map16;
        hashEntityMap6.mapNameToValue = map16;
        hashEntityMap0.mapNameToValue = map16;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int22 = hashEntityMap20.value("");
        java.util.Map map23 = hashEntityMap20.mapValueToName;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap24 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = null;
        hashEntityMap25.mapNameToValue = map26;
        java.util.Map map28 = null;
        hashEntityMap25.mapNameToValue = map28;
        java.util.Map map30 = null;
        hashEntityMap25.mapNameToValue = map30;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = null;
        hashEntityMap32.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap32.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap32.mapNameToValue = map37;
        java.util.Map map39 = hashEntityMap32.mapValueToName;
        hashEntityMap25.mapNameToValue = map39;
        treeEntityMap24.mapValueToName = map39;
        hashEntityMap20.mapValueToName = map39;
        hashEntityMap0.mapValueToName = map39;
        java.lang.String str45 = hashEntityMap0.name(35);
        java.util.Map map46 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities4 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities4.map;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities4.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        arrayEntityMap8.growBy = 100;
        java.lang.String str17 = arrayEntityMap8.name((int) (byte) 1);
        entities4.map = arrayEntityMap8;
        entities0.map = arrayEntityMap8;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap21 = entities0.map;
        java.lang.String str23 = entities0.escape("");
        java.io.Writer writer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer24, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(entityMap21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("");
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap4 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.util.Map map8 = null;
        hashEntityMap5.mapNameToValue = map8;
        java.util.Map map10 = null;
        hashEntityMap5.mapNameToValue = map10;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = null;
        hashEntityMap12.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap12.mapNameToValue = map17;
        java.util.Map map19 = hashEntityMap12.mapValueToName;
        hashEntityMap5.mapNameToValue = map19;
        treeEntityMap4.mapValueToName = map19;
        hashEntityMap0.mapValueToName = map19;
        hashEntityMap0.add("hi!", 10);
        java.lang.String str27 = hashEntityMap0.name(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray11 = arrayEntityMap10.values;
        int int12 = arrayEntityMap10.growBy;
        arrayEntityMap10.size = 100;
        arrayEntityMap10.growBy = (byte) 100;
        arrayEntityMap10.growBy = (short) 1;
        int[] intArray19 = arrayEntityMap10.values;
        entities0.map = arrayEntityMap10;
        java.lang.String str22 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap23 = entities0.map;
        java.lang.String str25 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(entityMap23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        int int9 = binaryEntityMap1.growBy;
        java.lang.String str11 = binaryEntityMap1.name(35);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        entities0.addEntity("hi!", 100);
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.escape("hi!");
        org.apache.commons.lang.Entities entities13 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities13.map;
        java.lang.String str16 = entities13.unescape("hi!");
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap18 = entities17.map;
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities17.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap21.add("hi!", 0);
        arrayEntityMap21.size = (byte) 1;
        arrayEntityMap21.growBy = 100;
        java.lang.String str30 = arrayEntityMap21.name((int) (byte) 1);
        entities17.map = arrayEntityMap21;
        entities13.map = arrayEntityMap21;
        arrayEntityMap21.add("hi!", 100);
        arrayEntityMap21.add("hi!", (int) '#');
        entities0.map = arrayEntityMap21;
        org.apache.commons.lang.Entities.EntityMap entityMap40 = entities0.map;
        org.apache.commons.lang.Entities entities41 = new org.apache.commons.lang.Entities();
        java.lang.String str43 = entities41.escape("hi!");
        java.lang.String str45 = entities41.escape("");
        java.lang.String str47 = entities41.unescape("hi!");
        java.lang.String str49 = entities41.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap51 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray54 = new int[] { ' ', '4' };
        binaryEntityMap51.values = intArray54;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap57 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray58 = arrayEntityMap57.values;
        java.lang.String str60 = arrayEntityMap57.name((int) (short) 100);
        int[] intArray63 = new int[] { (short) -1, 10 };
        arrayEntityMap57.values = intArray63;
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!" };
        arrayEntityMap57.names = strArray66;
        binaryEntityMap51.names = strArray66;
        int int70 = binaryEntityMap51.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap72 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap72.add("hi!", 0);
        arrayEntityMap72.size = (byte) 1;
        arrayEntityMap72.size = (-1);
        arrayEntityMap72.size = (byte) 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap83 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int85 = arrayEntityMap83.value("");
        arrayEntityMap83.size = (byte) 100;
        arrayEntityMap83.size = 100;
        arrayEntityMap83.ensureCapacity((int) (short) 1);
        int[] intArray92 = arrayEntityMap83.values;
        arrayEntityMap72.values = intArray92;
        binaryEntityMap51.values = intArray92;
        entities41.map = binaryEntityMap51;
        java.lang.String[][] strArray96 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities41.addEntities(strArray96);
        entities0.addEntities(strArray96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(entityMap40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 0 });
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "nbsp" });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertArrayEquals(intArray92, new int[] { 160 });
        org.junit.Assert.assertNotNull(strArray96);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray2 = binaryEntityMap1.values;
        java.lang.String[] strArray3 = null;
        binaryEntityMap1.names = strArray3;
        int int5 = binaryEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.lang.String str5 = hashEntityMap0.name((int) 'a');
        java.lang.String str7 = hashEntityMap0.name((int) (short) 0);
        java.lang.String str9 = hashEntityMap0.name((int) (byte) 10);
        java.util.Map map10 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(map10);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("hi!", (int) (byte) 1);
        binaryEntityMap1.add("", 35);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.size = (-1);
        arrayEntityMap1.ensureCapacity((int) (short) 1);
        arrayEntityMap1.growBy = 10;
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = 0; // flaky "22) test0836(org.apache.commons.lang.RegressionTest1)": entities0.entityValue("");
// flaky "6) test0836(org.apache.commons.lang.RegressionTest1)":         entities0.addEntity("hi!", (int) '4');
        java.lang.String str7 = null; // flaky "2) test0836(org.apache.commons.lang.RegressionTest1)": entities0.entityName((int) (short) 1);
        java.lang.String str9 = null; // flaky "2) test0836(org.apache.commons.lang.RegressionTest1)": entities0.entityName((int) 'a');
        org.junit.Assert.assertNotNull(entities0);
// flaky "1) test0836(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        java.lang.String str11 = hashEntityMap0.name(35);
        java.lang.String str13 = hashEntityMap0.name((int) (byte) 100);
        java.util.Map map14 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        arrayEntityMap1.growBy = (byte) 1;
        arrayEntityMap1.add("hi!", 35);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 35, 52 });
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        java.lang.String str11 = hashEntityMap5.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = null;
        hashEntityMap12.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap12.mapNameToValue = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap19.mapNameToValue = map22;
        java.util.Map map24 = null;
        hashEntityMap19.mapNameToValue = map24;
        java.util.Map map26 = hashEntityMap19.mapValueToName;
        hashEntityMap12.mapNameToValue = map26;
        hashEntityMap5.mapValueToName = map26;
        hashEntityMap0.mapValueToName = map26;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = null;
        hashEntityMap30.mapNameToValue = map31;
        java.util.Map map33 = null;
        hashEntityMap30.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap30.mapNameToValue = map35;
        java.util.Map map37 = hashEntityMap30.mapValueToName;
        java.util.Map map38 = hashEntityMap30.mapNameToValue;
        java.util.Map map39 = hashEntityMap30.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int42 = hashEntityMap40.value("");
        java.util.Map map43 = hashEntityMap40.mapValueToName;
        hashEntityMap30.mapValueToName = map43;
        hashEntityMap0.mapNameToValue = map43;
        int int47 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = null;
        hashEntityMap48.mapNameToValue = map49;
        java.lang.String str52 = hashEntityMap48.name((int) '4');
        java.lang.String str54 = hashEntityMap48.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = null;
        hashEntityMap55.mapNameToValue = map56;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap58 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map59 = null;
        hashEntityMap58.mapNameToValue = map59;
        java.lang.String str62 = hashEntityMap58.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map64 = null;
        hashEntityMap63.mapNameToValue = map64;
        java.util.Map map66 = null;
        hashEntityMap63.mapNameToValue = map66;
        java.util.Map map68 = null;
        hashEntityMap63.mapNameToValue = map68;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap70 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map71 = null;
        hashEntityMap70.mapNameToValue = map71;
        java.util.Map map73 = null;
        hashEntityMap70.mapNameToValue = map73;
        java.util.Map map75 = null;
        hashEntityMap70.mapNameToValue = map75;
        java.util.Map map77 = hashEntityMap70.mapValueToName;
        hashEntityMap63.mapNameToValue = map77;
        hashEntityMap58.mapNameToValue = map77;
        hashEntityMap55.mapValueToName = map77;
        hashEntityMap48.mapNameToValue = map77;
        int int83 = hashEntityMap48.value("hi!");
        java.util.Map map84 = hashEntityMap48.mapValueToName;
        java.util.Map map85 = hashEntityMap48.mapNameToValue;
        hashEntityMap0.mapNameToValue = map85;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        java.util.Map map10 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap11.add("", (int) (byte) 100);
        int int16 = hashEntityMap11.value("");
        java.util.Map map17 = hashEntityMap11.mapValueToName;
        java.util.Map map18 = hashEntityMap11.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.lang.String str23 = hashEntityMap19.name((int) '4');
        java.lang.String str25 = hashEntityMap19.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = null;
        hashEntityMap26.mapNameToValue = map27;
        java.util.Map map29 = null;
        hashEntityMap26.mapNameToValue = map29;
        java.util.Map map31 = null;
        hashEntityMap26.mapNameToValue = map31;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = null;
        hashEntityMap33.mapNameToValue = map34;
        java.util.Map map36 = null;
        hashEntityMap33.mapNameToValue = map36;
        java.util.Map map38 = null;
        hashEntityMap33.mapNameToValue = map38;
        java.util.Map map40 = hashEntityMap33.mapValueToName;
        hashEntityMap26.mapNameToValue = map40;
        hashEntityMap19.mapValueToName = map40;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = null;
        hashEntityMap43.mapNameToValue = map44;
        java.lang.String str47 = hashEntityMap43.name((int) '4');
        java.lang.String str49 = hashEntityMap43.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map51 = null;
        hashEntityMap50.mapNameToValue = map51;
        java.util.Map map53 = null;
        hashEntityMap50.mapNameToValue = map53;
        java.util.Map map55 = null;
        hashEntityMap50.mapNameToValue = map55;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map58 = null;
        hashEntityMap57.mapNameToValue = map58;
        java.util.Map map60 = null;
        hashEntityMap57.mapNameToValue = map60;
        java.util.Map map62 = null;
        hashEntityMap57.mapNameToValue = map62;
        java.util.Map map64 = hashEntityMap57.mapValueToName;
        hashEntityMap50.mapNameToValue = map64;
        hashEntityMap43.mapValueToName = map64;
        hashEntityMap19.mapValueToName = map64;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap68 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map69 = null;
        hashEntityMap68.mapNameToValue = map69;
        java.util.Map map71 = null;
        hashEntityMap68.mapNameToValue = map71;
        java.util.Map map73 = null;
        hashEntityMap68.mapNameToValue = map73;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map76 = null;
        hashEntityMap75.mapNameToValue = map76;
        java.util.Map map78 = null;
        hashEntityMap75.mapNameToValue = map78;
        java.util.Map map80 = null;
        hashEntityMap75.mapNameToValue = map80;
        java.util.Map map82 = hashEntityMap75.mapValueToName;
        hashEntityMap68.mapNameToValue = map82;
        hashEntityMap19.mapValueToName = map82;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap85 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int87 = hashEntityMap85.value("");
        java.util.Map map88 = hashEntityMap85.mapValueToName;
        hashEntityMap19.mapValueToName = map88;
        hashEntityMap11.mapNameToValue = map88;
        hashEntityMap0.mapValueToName = map88;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(map88);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        binaryEntityMap1.growBy = 100;
        binaryEntityMap1.add("hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        java.io.Writer writer11 = null;
        entities0.escape(writer11, "");
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
// flaky "23) test0842(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray8, new int[] { 160, 10 });
        org.junit.Assert.assertNotNull(entityMap14);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.lang.String str5 = hashEntityMap0.name((int) 'a');
        java.lang.String str7 = hashEntityMap0.name((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hashEntityMap0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        int int20 = binaryEntityMap1.value("hi!");
        java.lang.String str22 = binaryEntityMap1.name(52);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(10);
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = lookupEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        java.lang.String str13 = lookupEntityMap0.name(32);
        java.lang.String str15 = lookupEntityMap0.name((int) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str6 = lookupEntityMap0.name(100);
        int int8 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", (int) 'a');
        lookupEntityMap0.add("", (-1));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("");
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap4 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.util.Map map8 = null;
        hashEntityMap5.mapNameToValue = map8;
        java.util.Map map10 = null;
        hashEntityMap5.mapNameToValue = map10;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = null;
        hashEntityMap12.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap12.mapNameToValue = map17;
        java.util.Map map19 = hashEntityMap12.mapValueToName;
        hashEntityMap5.mapNameToValue = map19;
        treeEntityMap4.mapValueToName = map19;
        hashEntityMap0.mapValueToName = map19;
        java.util.Map map23 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.util.Map map27 = null;
        hashEntityMap24.mapNameToValue = map27;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = null;
        hashEntityMap30.mapNameToValue = map31;
        java.lang.String str34 = hashEntityMap30.name((int) '4');
        java.util.Map map35 = hashEntityMap30.mapValueToName;
        hashEntityMap29.mapValueToName = map35;
        java.util.Map map37 = hashEntityMap29.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map40 = null;
        hashEntityMap39.mapNameToValue = map40;
        java.lang.String str43 = hashEntityMap39.name((int) '4');
        java.util.Map map44 = hashEntityMap39.mapValueToName;
        hashEntityMap38.mapValueToName = map44;
        java.util.Map map46 = hashEntityMap38.mapValueToName;
        hashEntityMap29.mapNameToValue = map46;
        java.util.Map map48 = hashEntityMap29.mapValueToName;
        hashEntityMap24.mapValueToName = map48;
        hashEntityMap0.mapValueToName = map48;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("hi!");
        java.lang.String str12 = entities0.escape("");
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("", (int) (byte) 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.growBy = 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int9 = arrayEntityMap7.value("");
        arrayEntityMap7.size = (byte) 100;
        arrayEntityMap7.size = 100;
        arrayEntityMap7.ensureCapacity((int) (short) 1);
        int[] intArray16 = arrayEntityMap7.values;
        binaryEntityMap1.values = intArray16;
        binaryEntityMap1.ensureCapacity((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0 });
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) 'a');
        int int4 = lookupEntityMap0.value("hi!");
        java.lang.String str6 = lookupEntityMap0.name(52);
        java.lang.String str8 = lookupEntityMap0.name(35);
        lookupEntityMap0.add("", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = lookupEntityMap0.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap5.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray12 = new int[] { ' ', '4' };
        binaryEntityMap9.values = intArray12;
        arrayEntityMap5.values = intArray12;
        arrayEntityMap1.values = intArray12;
        arrayEntityMap1.ensureCapacity(35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 52 });
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities4 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities4.map;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities4.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        arrayEntityMap8.growBy = 100;
        java.lang.String str17 = arrayEntityMap8.name((int) (byte) 1);
        entities4.map = arrayEntityMap8;
        entities0.map = arrayEntityMap8;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str23 = binaryEntityMap21.name(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray28 = new int[] { ' ', '4' };
        binaryEntityMap25.values = intArray28;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap31 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray32 = arrayEntityMap31.values;
        java.lang.String str34 = arrayEntityMap31.name((int) (short) 100);
        int[] intArray37 = new int[] { (short) -1, 10 };
        arrayEntityMap31.values = intArray37;
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        arrayEntityMap31.names = strArray40;
        binaryEntityMap25.names = strArray40;
        binaryEntityMap21.names = strArray40;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap45 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int47 = arrayEntityMap45.value("");
        java.lang.String[] strArray48 = arrayEntityMap45.names;
        int[] intArray49 = arrayEntityMap45.values;
        binaryEntityMap21.values = intArray49;
        java.lang.String str52 = binaryEntityMap21.name((int) (short) -1);
        entities0.map = binaryEntityMap21;
        java.lang.String str55 = entities0.entityName((int) (byte) 10);
        java.lang.String str57 = entities0.escape("hi!");
        entities0.addEntity("", 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap62 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap62.add("hi!", (-1));
        binaryEntityMap62.ensureCapacity((int) 'a');
        entities0.map = binaryEntityMap62;
        binaryEntityMap62.add("hi!", (int) (short) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 0 });
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 0 });
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        binaryEntityMap1.names = strArray15;
        int int17 = binaryEntityMap1.size;
        binaryEntityMap1.size = 100;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(2);
        binaryEntityMap1.add("hi!", 2);
        binaryEntityMap1.ensureCapacity(35);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        java.lang.String str5 = entities0.unescape("");
        java.lang.String str7 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.size = ' ';
        java.lang.Class<?> wildcardClass8 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = null;
        hashEntityMap10.mapNameToValue = map11;
        java.lang.String str14 = hashEntityMap10.name((int) '4');
        java.lang.String str16 = hashEntityMap10.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.util.Map map20 = null;
        hashEntityMap17.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap17.mapNameToValue = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.util.Map map27 = null;
        hashEntityMap24.mapNameToValue = map27;
        java.util.Map map29 = null;
        hashEntityMap24.mapNameToValue = map29;
        java.util.Map map31 = hashEntityMap24.mapValueToName;
        hashEntityMap17.mapNameToValue = map31;
        hashEntityMap10.mapValueToName = map31;
        hashEntityMap5.mapValueToName = map31;
        hashEntityMap0.mapNameToValue = map31;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = null;
        hashEntityMap36.mapNameToValue = map37;
        java.lang.String str40 = hashEntityMap36.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = null;
        hashEntityMap41.mapNameToValue = map42;
        java.lang.String str45 = hashEntityMap41.name((int) '4');
        java.lang.String str47 = hashEntityMap41.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = null;
        hashEntityMap48.mapNameToValue = map49;
        java.util.Map map51 = null;
        hashEntityMap48.mapNameToValue = map51;
        java.util.Map map53 = null;
        hashEntityMap48.mapNameToValue = map53;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = null;
        hashEntityMap55.mapNameToValue = map56;
        java.util.Map map58 = null;
        hashEntityMap55.mapNameToValue = map58;
        java.util.Map map60 = null;
        hashEntityMap55.mapNameToValue = map60;
        java.util.Map map62 = hashEntityMap55.mapValueToName;
        hashEntityMap48.mapNameToValue = map62;
        hashEntityMap41.mapValueToName = map62;
        hashEntityMap36.mapValueToName = map62;
        java.lang.String str67 = hashEntityMap36.name((int) '#');
        java.util.Map map68 = hashEntityMap36.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap69 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map70 = null;
        hashEntityMap69.mapNameToValue = map70;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap73 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map74 = null;
        hashEntityMap73.mapNameToValue = map74;
        java.lang.String str77 = hashEntityMap73.name((int) '4');
        java.util.Map map78 = hashEntityMap73.mapValueToName;
        hashEntityMap72.mapValueToName = map78;
        hashEntityMap69.mapValueToName = map78;
        java.util.Map map81 = hashEntityMap69.mapValueToName;
        hashEntityMap36.mapValueToName = map81;
        hashEntityMap0.mapValueToName = map81;
        java.lang.String str85 = hashEntityMap0.name(52);
        java.util.Map map86 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", (int) (byte) 10);
        hashEntityMap0.add("", 2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(map68);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(map86);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap3.add("hi!", 0);
        arrayEntityMap3.size = (byte) 1;
        arrayEntityMap3.size = (-1);
        arrayEntityMap3.size = (byte) 10;
        entities0.map = arrayEntityMap3;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.lang.String str18 = hashEntityMap14.name((int) '4');
        java.util.Map map19 = hashEntityMap14.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapValueToName;
        java.util.Map map22 = null;
        hashEntityMap20.mapNameToValue = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = null;
        hashEntityMap25.mapNameToValue = map26;
        java.lang.String str29 = hashEntityMap25.name((int) '4');
        java.util.Map map30 = hashEntityMap25.mapValueToName;
        hashEntityMap24.mapValueToName = map30;
        hashEntityMap20.mapNameToValue = map30;
        hashEntityMap14.mapNameToValue = map30;
        java.lang.String str35 = hashEntityMap14.name(2);
        java.lang.String str37 = hashEntityMap14.name((int) (byte) 10);
        entities0.map = hashEntityMap14;
        java.util.Map map39 = hashEntityMap14.mapNameToValue;
        java.lang.String str41 = hashEntityMap14.name((int) 'a');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapValueToName;
        java.util.Map map6 = hashEntityMap4.mapNameToValue;
        entities0.map = hashEntityMap4;
        hashEntityMap4.add("", (int) '#');
        int int12 = hashEntityMap4.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        int int4 = binaryEntityMap1.size;
        binaryEntityMap1.size = 'a';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = binaryEntityMap1.name(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(1);
        int[] intArray2 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = '4';
        binaryEntityMap1.add("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100 });
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap1.mapValueToName = map27;
        entities0.map = hashEntityMap1;
        java.lang.String str33 = entities0.escape("hi!");
        java.lang.String str35 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities0.map = arrayEntityMap37;
        int int40 = arrayEntityMap37.value("hi!");
        java.lang.String[] strArray41 = arrayEntityMap37.names;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { null });
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.util.Map map10 = null;
        hashEntityMap7.mapNameToValue = map10;
        java.util.Map map12 = null;
        hashEntityMap7.mapNameToValue = map12;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap14.mapNameToValue = map17;
        java.util.Map map19 = null;
        hashEntityMap14.mapNameToValue = map19;
        java.util.Map map21 = hashEntityMap14.mapValueToName;
        hashEntityMap7.mapNameToValue = map21;
        hashEntityMap0.mapValueToName = map21;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.lang.String str28 = hashEntityMap24.name((int) '4');
        java.lang.String str30 = hashEntityMap24.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap31.mapNameToValue = map34;
        java.util.Map map36 = null;
        hashEntityMap31.mapNameToValue = map36;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = null;
        hashEntityMap38.mapNameToValue = map39;
        java.util.Map map41 = null;
        hashEntityMap38.mapNameToValue = map41;
        java.util.Map map43 = null;
        hashEntityMap38.mapNameToValue = map43;
        java.util.Map map45 = hashEntityMap38.mapValueToName;
        hashEntityMap31.mapNameToValue = map45;
        hashEntityMap24.mapValueToName = map45;
        hashEntityMap0.mapValueToName = map45;
        java.util.Map map49 = hashEntityMap0.mapNameToValue;
        java.util.Map map50 = hashEntityMap0.mapNameToValue;
        java.lang.String str52 = hashEntityMap0.name((int) ' ');
        java.lang.String str54 = hashEntityMap0.name((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = hashEntityMap0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNull(map50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapValueToName;
        java.util.Map map6 = hashEntityMap4.mapNameToValue;
        entities0.map = hashEntityMap4;
        java.lang.String str9 = entities0.unescape("");
        org.apache.commons.lang.Entities entities10 = new org.apache.commons.lang.Entities();
        java.lang.String str12 = entities10.escape("hi!");
        java.lang.String str14 = entities10.escape("");
        java.lang.String str16 = entities10.unescape("hi!");
        java.lang.String str18 = entities10.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray23 = new int[] { ' ', '4' };
        binaryEntityMap20.values = intArray23;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray27 = arrayEntityMap26.values;
        java.lang.String str29 = arrayEntityMap26.name((int) (short) 100);
        int[] intArray32 = new int[] { (short) -1, 10 };
        arrayEntityMap26.values = intArray32;
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        arrayEntityMap26.names = strArray35;
        binaryEntityMap20.names = strArray35;
        int int39 = binaryEntityMap20.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap41 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap41.add("hi!", 0);
        arrayEntityMap41.size = (byte) 1;
        arrayEntityMap41.size = (-1);
        arrayEntityMap41.size = (byte) 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap52 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int54 = arrayEntityMap52.value("");
        arrayEntityMap52.size = (byte) 100;
        arrayEntityMap52.size = 100;
        arrayEntityMap52.ensureCapacity((int) (short) 1);
        int[] intArray61 = arrayEntityMap52.values;
        arrayEntityMap41.values = intArray61;
        binaryEntityMap20.values = intArray61;
        entities10.map = binaryEntityMap20;
        java.lang.String[][] strArray65 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities10.addEntities(strArray65);
        entities0.addEntities(strArray65);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 0 });
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "nbsp" });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 160 });
        org.junit.Assert.assertNotNull(strArray65);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        java.lang.String str7 = arrayEntityMap1.name(52);
        int int9 = arrayEntityMap1.value("hi!");
        java.lang.String str11 = arrayEntityMap1.name(32);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { null });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String[] strArray11 = binaryEntityMap1.names;
        java.lang.String str13 = binaryEntityMap1.name((int) (byte) 10);
        binaryEntityMap1.size = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str7 = binaryEntityMap5.name((-1));
        entities0.map = binaryEntityMap5;
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.size = ' ';
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for int[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.growBy = 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int9 = arrayEntityMap7.value("");
        arrayEntityMap7.size = (byte) 100;
        arrayEntityMap7.size = 100;
        arrayEntityMap7.ensureCapacity((int) (short) 1);
        int[] intArray16 = arrayEntityMap7.values;
        binaryEntityMap1.values = intArray16;
        binaryEntityMap1.add("", (int) (short) 10);
        binaryEntityMap1.ensureCapacity(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap24 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray25 = arrayEntityMap24.values;
        int int26 = arrayEntityMap24.growBy;
        arrayEntityMap24.add("", (int) (byte) 10);
        int[] intArray30 = arrayEntityMap24.values;
        int[] intArray31 = arrayEntityMap24.values;
        binaryEntityMap1.values = intArray31;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 2 out of bounds for int[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 10 });
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.entityName((int) (byte) 1);
        java.io.Writer writer12 = null;
        entities0.escape(writer12, "");
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = null;
        hashEntityMap11.mapNameToValue = map12;
        java.lang.String str15 = hashEntityMap11.name((int) '4');
        java.lang.String str17 = hashEntityMap11.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = null;
        hashEntityMap18.mapNameToValue = map19;
        java.util.Map map21 = null;
        hashEntityMap18.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap18.mapNameToValue = map23;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = null;
        hashEntityMap25.mapNameToValue = map26;
        java.util.Map map28 = null;
        hashEntityMap25.mapNameToValue = map28;
        java.util.Map map30 = null;
        hashEntityMap25.mapNameToValue = map30;
        java.util.Map map32 = hashEntityMap25.mapValueToName;
        hashEntityMap18.mapNameToValue = map32;
        hashEntityMap11.mapValueToName = map32;
        hashEntityMap6.mapValueToName = map32;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = null;
        hashEntityMap36.mapNameToValue = map37;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = null;
        hashEntityMap40.mapNameToValue = map41;
        java.lang.String str44 = hashEntityMap40.name((int) '4');
        java.util.Map map45 = hashEntityMap40.mapValueToName;
        hashEntityMap39.mapValueToName = map45;
        hashEntityMap36.mapValueToName = map45;
        hashEntityMap6.mapValueToName = map45;
        entities0.map = hashEntityMap6;
        // The following exception was thrown during execution in test generation
        try {
            int int51 = hashEntityMap6.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        int int13 = entities0.entityValue("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.io.Writer writer10 = null;
        entities0.escape(writer10, "");
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.entityName((int) (byte) 0);
        int int16 = entities0.entityValue("");
        int int18 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((int) (short) 1);
        binaryEntityMap1.add("", (int) (byte) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities4 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities4.map;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities4.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        arrayEntityMap8.growBy = 100;
        java.lang.String str17 = arrayEntityMap8.name((int) (byte) 1);
        entities4.map = arrayEntityMap8;
        entities0.map = arrayEntityMap8;
        java.lang.String str21 = entities0.entityName(0);
        java.lang.String str23 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) (short) 0);
        entities0.addEntity("hi!", 100);
        entities0.addEntity("hi!", (int) (short) 10);
        java.io.Writer writer33 = null;
        entities0.escape(writer33, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer37 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer37, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str9 = binaryEntityMap7.name((int) '#');
        binaryEntityMap7.add("", (int) (byte) -1);
        java.lang.String str14 = binaryEntityMap7.name((int) (byte) 10);
        entities0.map = binaryEntityMap7;
        binaryEntityMap7.growBy = (-1);
        int int18 = binaryEntityMap7.size;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap3.add("hi!", 0);
        arrayEntityMap3.size = (byte) 1;
        arrayEntityMap3.size = (-1);
        arrayEntityMap3.size = (byte) 10;
        entities0.map = arrayEntityMap3;
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities0.map;
        int int17 = entityMap15.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.unescape("");
        java.lang.Class<?> wildcardClass8 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        int int10 = entities0.entityValue("hi!");
        int int12 = entities0.entityValue("");
        java.io.Writer writer13 = null;
        entities0.escape(writer13, "");
        entities0.addEntity("", (int) (byte) 100);
        java.io.Writer writer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer19, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str13 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 34, 10 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        binaryEntityMap1.add("", (int) (byte) 1);
        java.lang.String str10 = binaryEntityMap1.name((int) (byte) -1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap6.add("hi!", 0);
        arrayEntityMap6.size = (byte) 1;
        arrayEntityMap6.growBy = 100;
        entities0.map = arrayEntityMap6;
        java.lang.String[] strArray15 = arrayEntityMap6.names;
        int int16 = arrayEntityMap6.growBy;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        int int9 = arrayEntityMap1.value("");
        int[] intArray10 = arrayEntityMap1.values;
        java.lang.String[] strArray11 = arrayEntityMap1.names;
        arrayEntityMap1.size = (byte) -1;
        int int14 = arrayEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str7 = binaryEntityMap5.name((-1));
        entities0.map = binaryEntityMap5;
        int int10 = binaryEntityMap5.value("");
        binaryEntityMap5.add("", 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap0 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.util.Map map4 = null;
        hashEntityMap1.mapNameToValue = map4;
        java.util.Map map6 = null;
        hashEntityMap1.mapNameToValue = map6;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap8.mapValueToName;
        hashEntityMap1.mapNameToValue = map15;
        treeEntityMap0.mapValueToName = map15;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = null;
        hashEntityMap18.mapNameToValue = map19;
        java.lang.String str22 = hashEntityMap18.name((int) '4');
        java.lang.String str24 = hashEntityMap18.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = null;
        hashEntityMap25.mapNameToValue = map26;
        java.util.Map map28 = null;
        hashEntityMap25.mapNameToValue = map28;
        java.util.Map map30 = null;
        hashEntityMap25.mapNameToValue = map30;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = null;
        hashEntityMap32.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap32.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap32.mapNameToValue = map37;
        java.util.Map map39 = hashEntityMap32.mapValueToName;
        hashEntityMap25.mapNameToValue = map39;
        hashEntityMap18.mapValueToName = map39;
        treeEntityMap0.mapNameToValue = map39;
        int int44 = treeEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = null;
        hashEntityMap46.mapNameToValue = map47;
        java.lang.String str50 = hashEntityMap46.name((int) '4');
        java.util.Map map51 = hashEntityMap46.mapValueToName;
        hashEntityMap45.mapValueToName = map51;
        java.util.Map map53 = hashEntityMap45.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = null;
        hashEntityMap55.mapNameToValue = map56;
        java.lang.String str59 = hashEntityMap55.name((int) '4');
        java.util.Map map60 = hashEntityMap55.mapValueToName;
        hashEntityMap54.mapValueToName = map60;
        java.util.Map map62 = hashEntityMap54.mapValueToName;
        hashEntityMap45.mapNameToValue = map62;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map65 = null;
        hashEntityMap64.mapNameToValue = map65;
        java.util.Map map67 = null;
        hashEntityMap64.mapNameToValue = map67;
        java.util.Map map69 = null;
        hashEntityMap64.mapNameToValue = map69;
        java.util.Map map71 = hashEntityMap64.mapValueToName;
        hashEntityMap45.mapNameToValue = map71;
        java.util.Map map73 = hashEntityMap45.mapValueToName;
        treeEntityMap0.mapNameToValue = map73;
        java.lang.Class<?> wildcardClass75 = treeEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (byte) 100);
        lookupEntityMap0.add("", 10);
        java.lang.String str7 = lookupEntityMap0.name(32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.util.Map map10 = null;
        hashEntityMap7.mapNameToValue = map10;
        java.util.Map map12 = null;
        hashEntityMap7.mapNameToValue = map12;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap14.mapNameToValue = map17;
        java.util.Map map19 = null;
        hashEntityMap14.mapNameToValue = map19;
        java.util.Map map21 = hashEntityMap14.mapValueToName;
        hashEntityMap7.mapNameToValue = map21;
        hashEntityMap0.mapValueToName = map21;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.lang.String str28 = hashEntityMap24.name((int) '4');
        java.lang.String str30 = hashEntityMap24.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap31.mapNameToValue = map34;
        java.util.Map map36 = null;
        hashEntityMap31.mapNameToValue = map36;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = null;
        hashEntityMap38.mapNameToValue = map39;
        java.util.Map map41 = null;
        hashEntityMap38.mapNameToValue = map41;
        java.util.Map map43 = null;
        hashEntityMap38.mapNameToValue = map43;
        java.util.Map map45 = hashEntityMap38.mapValueToName;
        hashEntityMap31.mapNameToValue = map45;
        hashEntityMap24.mapValueToName = map45;
        hashEntityMap0.mapValueToName = map45;
        java.util.Map map49 = hashEntityMap0.mapNameToValue;
        java.util.Map map50 = hashEntityMap0.mapNameToValue;
        java.lang.String str52 = hashEntityMap0.name(52);
        java.lang.String str54 = hashEntityMap0.name(0);
        java.lang.String str56 = hashEntityMap0.name((int) ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNull(map50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        java.lang.String str5 = binaryEntityMap1.name((int) (byte) 0);
        java.lang.String str7 = binaryEntityMap1.name(0);
        int int8 = binaryEntityMap1.growBy;
        int int9 = binaryEntityMap1.growBy;
        int int10 = binaryEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.growBy = (byte) 0;
        binaryEntityMap1.add("", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("hi!", (int) (byte) 1);
        binaryEntityMap1.add("hi!", (int) (byte) 10);
        binaryEntityMap1.size = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        entities0.addEntity("", (int) (byte) 1);
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities7.map;
        java.lang.String str10 = entities7.unescape("hi!");
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities11.map;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities11.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap15.add("hi!", 0);
        arrayEntityMap15.size = (byte) 1;
        arrayEntityMap15.growBy = 100;
        java.lang.String str24 = arrayEntityMap15.name((int) (byte) 1);
        entities11.map = arrayEntityMap15;
        entities7.map = arrayEntityMap15;
        entities0.map = arrayEntityMap15;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap28 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str30 = lookupEntityMap28.name(0);
        java.lang.String str32 = lookupEntityMap28.name((int) (short) 0);
        entities0.map = lookupEntityMap28;
        org.apache.commons.lang.Entities.EntityMap entityMap34 = entities0.map;
        java.lang.String str36 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(entityMap34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.lang.String str6 = hashEntityMap0.name(10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.util.Map map10 = null;
        hashEntityMap7.mapNameToValue = map10;
        java.util.Map map12 = null;
        hashEntityMap7.mapNameToValue = map12;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap14.mapNameToValue = map17;
        java.util.Map map19 = null;
        hashEntityMap14.mapNameToValue = map19;
        java.util.Map map21 = hashEntityMap14.mapValueToName;
        hashEntityMap7.mapNameToValue = map21;
        hashEntityMap0.mapNameToValue = map21;
        java.util.Map map24 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("hi!", (int) (short) 0);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '4');
        java.lang.String[] strArray2 = binaryEntityMap1.names;
        java.lang.String str4 = binaryEntityMap1.name((int) (short) 100);
        binaryEntityMap1.add("", 52);
        int int8 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.lang.String str5 = hashEntityMap0.name((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        int int9 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", 35);
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray19 = new int[] { ' ', '4' };
        binaryEntityMap16.values = intArray19;
        java.lang.String str22 = binaryEntityMap16.name((int) (byte) 100);
        binaryEntityMap16.add("hi!", (-1));
        java.lang.String[] strArray26 = binaryEntityMap16.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap28 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap28.add("hi!", 0);
        arrayEntityMap28.size = (byte) 1;
        int[] intArray34 = new int[] {};
        arrayEntityMap28.values = intArray34;
        binaryEntityMap16.values = intArray34;
        binaryEntityMap1.values = intArray34;
        int int38 = binaryEntityMap1.size;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.add("hi!", 10);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", 1);
        int int15 = lookupEntityMap0.value("");
        int int17 = lookupEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int2 = arrayEntityMap1.size;
        int int3 = arrayEntityMap1.growBy;
        java.lang.String str5 = arrayEntityMap1.name((int) (short) 100);
        int int7 = arrayEntityMap1.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap9.add("hi!", 0);
        arrayEntityMap9.size = (byte) 1;
        arrayEntityMap9.growBy = 100;
        java.lang.String[] strArray17 = arrayEntityMap9.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap19.add("hi!", 0);
        arrayEntityMap19.size = (byte) 1;
        arrayEntityMap19.growBy = 100;
        java.lang.String[] strArray27 = arrayEntityMap19.names;
        arrayEntityMap9.names = strArray27;
        arrayEntityMap1.names = strArray27;
        arrayEntityMap1.growBy = (byte) 1;
        int[] intArray32 = arrayEntityMap1.values;
        arrayEntityMap1.growBy = '#';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        int int14 = binaryEntityMap1.value("");
        binaryEntityMap1.size = 35;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = binaryEntityMap1.name((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray2 = binaryEntityMap1.values;
        java.lang.String[] strArray3 = null;
        binaryEntityMap1.names = strArray3;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray9 = new int[] { ' ', '4' };
        binaryEntityMap6.values = intArray9;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray13 = arrayEntityMap12.values;
        java.lang.String str15 = arrayEntityMap12.name((int) (short) 100);
        int[] intArray18 = new int[] { (short) -1, 10 };
        arrayEntityMap12.values = intArray18;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        arrayEntityMap12.names = strArray21;
        binaryEntityMap6.names = strArray21;
        int int25 = binaryEntityMap6.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap27 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap27.add("hi!", 0);
        arrayEntityMap27.size = (byte) 1;
        arrayEntityMap27.size = (-1);
        arrayEntityMap27.size = (byte) 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap38 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int40 = arrayEntityMap38.value("");
        arrayEntityMap38.size = (byte) 100;
        arrayEntityMap38.size = 100;
        arrayEntityMap38.ensureCapacity((int) (short) 1);
        int[] intArray47 = arrayEntityMap38.values;
        arrayEntityMap27.values = intArray47;
        binaryEntityMap6.values = intArray47;
        binaryEntityMap1.values = intArray47;
        java.lang.String str52 = binaryEntityMap1.name(52);
        java.lang.String str54 = binaryEntityMap1.name(35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0 });
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 0 });
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        int int6 = arrayEntityMap1.growBy;
        int int8 = arrayEntityMap1.value("");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.util.Map map10 = null;
        hashEntityMap7.mapNameToValue = map10;
        java.util.Map map12 = null;
        hashEntityMap7.mapNameToValue = map12;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap14.mapNameToValue = map17;
        java.util.Map map19 = null;
        hashEntityMap14.mapNameToValue = map19;
        java.util.Map map21 = hashEntityMap14.mapValueToName;
        hashEntityMap7.mapNameToValue = map21;
        hashEntityMap0.mapValueToName = map21;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.lang.String str28 = hashEntityMap24.name((int) '4');
        java.lang.String str30 = hashEntityMap24.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap31.mapNameToValue = map34;
        java.util.Map map36 = null;
        hashEntityMap31.mapNameToValue = map36;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = null;
        hashEntityMap38.mapNameToValue = map39;
        java.util.Map map41 = null;
        hashEntityMap38.mapNameToValue = map41;
        java.util.Map map43 = null;
        hashEntityMap38.mapNameToValue = map43;
        java.util.Map map45 = hashEntityMap38.mapValueToName;
        hashEntityMap31.mapNameToValue = map45;
        hashEntityMap24.mapValueToName = map45;
        hashEntityMap0.mapValueToName = map45;
        java.util.Map map49 = hashEntityMap0.mapNameToValue;
        java.util.Map map50 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map52 = null;
        hashEntityMap51.mapNameToValue = map52;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = null;
        hashEntityMap55.mapNameToValue = map56;
        java.lang.String str59 = hashEntityMap55.name((int) '4');
        java.util.Map map60 = hashEntityMap55.mapValueToName;
        hashEntityMap54.mapValueToName = map60;
        hashEntityMap51.mapValueToName = map60;
        java.util.Map map63 = hashEntityMap51.mapValueToName;
        hashEntityMap0.mapNameToValue = map63;
        java.lang.String str66 = hashEntityMap0.name((int) (byte) 100);
        hashEntityMap0.add("", (int) '#');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.lang.String str5 = hashEntityMap0.name((int) 'a');
        java.lang.String str7 = hashEntityMap0.name((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap6.add("hi!", 0);
        arrayEntityMap6.size = (byte) 1;
        arrayEntityMap6.growBy = 100;
        java.lang.String[] strArray14 = arrayEntityMap6.names;
        arrayEntityMap1.names = strArray14;
        arrayEntityMap1.add("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(100);
        int int3 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("hi!", (-1));
        binaryEntityMap1.add("", 1);
        int int8 = binaryEntityMap1.growBy;
        binaryEntityMap1.add("hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        arrayEntityMap1.add("", (int) (byte) 10);
        int[] intArray7 = arrayEntityMap1.values;
        arrayEntityMap1.growBy = (byte) 0;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 10 });
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        int int20 = binaryEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap22.add("hi!", 0);
        arrayEntityMap22.size = (byte) 1;
        arrayEntityMap22.size = (-1);
        arrayEntityMap22.size = (byte) 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap33 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int35 = arrayEntityMap33.value("");
        arrayEntityMap33.size = (byte) 100;
        arrayEntityMap33.size = 100;
        arrayEntityMap33.ensureCapacity((int) (short) 1);
        int[] intArray42 = arrayEntityMap33.values;
        arrayEntityMap22.values = intArray42;
        binaryEntityMap1.values = intArray42;
        int int46 = binaryEntityMap1.value("");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        int int11 = lookupEntityMap0.value("");
        java.lang.String str13 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", (int) 'a');
        java.lang.String str18 = lookupEntityMap0.name(52);
        lookupEntityMap0.add("hi!", 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        entities0.addEntity("hi!", 100);
        java.lang.String str10 = entities0.unescape("");
        int int12 = entities0.entityValue("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = 1;
        int int5 = arrayEntityMap1.value("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray10 = new int[] { ' ', '4' };
        binaryEntityMap7.values = intArray10;
        int int13 = binaryEntityMap7.value("");
        binaryEntityMap7.add("hi!", (int) (short) 100);
        int[] intArray17 = binaryEntityMap7.values;
        arrayEntityMap1.values = intArray17;
        java.lang.String str20 = arrayEntityMap1.name(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray25 = new int[] { ' ', '4' };
        binaryEntityMap22.values = intArray25;
        java.lang.String str28 = binaryEntityMap22.name((int) (byte) 100);
        binaryEntityMap22.add("", (int) (byte) 0);
        java.lang.String str33 = binaryEntityMap22.name(10);
        org.apache.commons.lang.Entities entities34 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap35 = entities34.map;
        java.lang.String str37 = entities34.unescape("hi!");
        org.apache.commons.lang.Entities entities38 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap39 = entities38.map;
        org.apache.commons.lang.Entities.EntityMap entityMap40 = entities38.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap42 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap42.add("hi!", 0);
        arrayEntityMap42.size = (byte) 1;
        arrayEntityMap42.growBy = 100;
        java.lang.String str51 = arrayEntityMap42.name((int) (byte) 1);
        entities38.map = arrayEntityMap42;
        entities34.map = arrayEntityMap42;
        arrayEntityMap42.add("hi!", 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap58 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray61 = new int[] { ' ', '4' };
        binaryEntityMap58.values = intArray61;
        binaryEntityMap58.size = '#';
        int[] intArray65 = binaryEntityMap58.values;
        arrayEntityMap42.values = intArray65;
        binaryEntityMap22.values = intArray65;
        arrayEntityMap1.values = intArray65;
        arrayEntityMap1.ensureCapacity(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, 52 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 100, 52 });
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(entities34);
        org.junit.Assert.assertNotNull(entityMap35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(entities38);
        org.junit.Assert.assertNotNull(entityMap39);
        org.junit.Assert.assertNotNull(entityMap40);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 32, 52 });
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) '4');
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap6 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str8 = lookupEntityMap6.name(0);
        java.lang.String str10 = lookupEntityMap6.name(0);
        int int12 = lookupEntityMap6.value("");
        entities0.map = lookupEntityMap6;
        java.lang.String str15 = lookupEntityMap6.name(0);
        int int17 = lookupEntityMap6.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap2 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap4.add("hi!", 0);
        arrayEntityMap4.size = (byte) 1;
        arrayEntityMap4.growBy = 100;
        java.lang.String str13 = arrayEntityMap4.name((int) (byte) 1);
        entities0.map = arrayEntityMap4;
        int int15 = arrayEntityMap4.growBy;
        int int17 = arrayEntityMap4.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) '#');
        int int7 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("hi!", (int) (byte) 100);
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", 35);
        java.lang.String str9 = hashEntityMap0.name(10);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        java.util.Map map4 = null;
        hashEntityMap0.mapValueToName = map4;
        int int7 = hashEntityMap0.value("");
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        java.util.Map map10 = hashEntityMap0.mapValueToName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = hashEntityMap0.name(32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(map10);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) 'a');
        int int4 = lookupEntityMap0.value("hi!");
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 10);
        int int8 = lookupEntityMap0.value("hi!");
        java.lang.String str10 = lookupEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("hi!");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer5 = null;
        entities0.escape(writer5, "");
        entities0.addEntity("", 1);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        java.lang.String[] strArray8 = null;
        arrayEntityMap1.names = strArray8;
        int int11 = arrayEntityMap1.value("hi!");
        int int12 = arrayEntityMap1.size;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        int int11 = hashEntityMap0.value("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", 100);
        java.lang.String str7 = entities0.entityName((int) (byte) 100);
        java.lang.String str9 = entities0.entityName((int) (short) 0);
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray11 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities10.addEntities(strArray11);
        org.apache.commons.lang.Entities entities13 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities13.map;
        entities10.map = entityMap14;
        java.io.Writer writer16 = null;
        entities10.escape(writer16, "");
        java.lang.String str20 = entities10.unescape("hi!");
        org.apache.commons.lang.Entities entities21 = org.apache.commons.lang.Entities.HTML32;
        int int23 = entities21.entityValue("");
        java.lang.String[][] strArray24 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities21.addEntities(strArray24);
        entities10.addEntities(strArray24);
        entities0.addEntities(strArray24);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(entities21);
// flaky "24) test0931(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.size = 0;
        java.lang.String str10 = binaryEntityMap1.name((int) 'a');
        binaryEntityMap1.add("", (-1));
        int int15 = binaryEntityMap1.value("");
        java.lang.String str17 = binaryEntityMap1.name((int) '4');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap3 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = null;
        hashEntityMap4.mapNameToValue = map5;
        java.lang.String str8 = hashEntityMap4.name((int) '4');
        java.util.Map map9 = hashEntityMap4.mapValueToName;
        hashEntityMap3.mapValueToName = map9;
        hashEntityMap0.mapValueToName = map9;
        java.util.Map map12 = hashEntityMap0.mapValueToName;
        java.lang.String str14 = hashEntityMap0.name(0);
        java.util.Map map15 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(map15);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(35);
        java.lang.String str3 = binaryEntityMap1.name(0);
        java.lang.String str5 = binaryEntityMap1.name(0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities4 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities4.map;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities4.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        arrayEntityMap8.growBy = 100;
        java.lang.String str17 = arrayEntityMap8.name((int) (byte) 1);
        entities4.map = arrayEntityMap8;
        entities0.map = arrayEntityMap8;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap21 = entities0.map;
        java.io.Writer writer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer22, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(entityMap21);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("hi!", (int) (byte) 1);
        lookupEntityMap0.add("hi!", (int) 'a');
        java.lang.String str22 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str24 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '4');
        int int3 = arrayEntityMap1.value("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray3);
        int int6 = entities0.entityValue("hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
// flaky "25) test0938(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = null;
        hashEntityMap10.mapNameToValue = map11;
        java.lang.String str14 = hashEntityMap10.name((int) '4');
        java.lang.String str16 = hashEntityMap10.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.util.Map map20 = null;
        hashEntityMap17.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap17.mapNameToValue = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.util.Map map27 = null;
        hashEntityMap24.mapNameToValue = map27;
        java.util.Map map29 = null;
        hashEntityMap24.mapNameToValue = map29;
        java.util.Map map31 = hashEntityMap24.mapValueToName;
        hashEntityMap17.mapNameToValue = map31;
        hashEntityMap10.mapValueToName = map31;
        hashEntityMap5.mapValueToName = map31;
        hashEntityMap0.mapNameToValue = map31;
        java.util.Map map36 = hashEntityMap0.mapNameToValue;
        java.util.Map map37 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = null;
        hashEntityMap38.mapNameToValue = map39;
        java.util.Map map41 = null;
        hashEntityMap38.mapNameToValue = map41;
        java.util.Map map43 = null;
        hashEntityMap38.mapNameToValue = map43;
        java.util.Map map45 = hashEntityMap38.mapValueToName;
        java.util.Map map46 = hashEntityMap38.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map48 = hashEntityMap47.mapValueToName;
        java.util.Map map49 = hashEntityMap47.mapNameToValue;
        hashEntityMap38.mapValueToName = map49;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = null;
        hashEntityMap52.mapNameToValue = map53;
        java.lang.String str56 = hashEntityMap52.name((int) '4');
        java.util.Map map57 = hashEntityMap52.mapValueToName;
        hashEntityMap51.mapValueToName = map57;
        java.util.Map map59 = hashEntityMap51.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map62 = null;
        hashEntityMap61.mapNameToValue = map62;
        java.lang.String str65 = hashEntityMap61.name((int) '4');
        java.util.Map map66 = hashEntityMap61.mapValueToName;
        hashEntityMap60.mapValueToName = map66;
        java.util.Map map68 = hashEntityMap60.mapValueToName;
        hashEntityMap51.mapNameToValue = map68;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap70 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map71 = null;
        hashEntityMap70.mapNameToValue = map71;
        java.util.Map map73 = null;
        hashEntityMap70.mapNameToValue = map73;
        java.util.Map map75 = null;
        hashEntityMap70.mapNameToValue = map75;
        java.util.Map map77 = hashEntityMap70.mapValueToName;
        hashEntityMap51.mapNameToValue = map77;
        hashEntityMap38.mapNameToValue = map77;
        hashEntityMap0.mapNameToValue = map77;
        hashEntityMap0.add("", (int) ' ');
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.lang.String str5 = hashEntityMap0.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.lang.String str11 = hashEntityMap7.name((int) '4');
        java.util.Map map12 = hashEntityMap7.mapValueToName;
        hashEntityMap6.mapValueToName = map12;
        hashEntityMap0.mapValueToName = map12;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hashEntityMap0.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.entityName((int) (short) 0);
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.growBy = (byte) -1;
        binaryEntityMap1.add("hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 52, 52 });
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap0 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.util.Map map4 = null;
        hashEntityMap1.mapNameToValue = map4;
        java.util.Map map6 = null;
        hashEntityMap1.mapNameToValue = map6;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap8.mapValueToName;
        hashEntityMap1.mapNameToValue = map15;
        treeEntityMap0.mapValueToName = map15;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = null;
        hashEntityMap18.mapNameToValue = map19;
        java.lang.String str22 = hashEntityMap18.name((int) '4');
        java.lang.String str24 = hashEntityMap18.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = null;
        hashEntityMap25.mapNameToValue = map26;
        java.util.Map map28 = null;
        hashEntityMap25.mapNameToValue = map28;
        java.util.Map map30 = null;
        hashEntityMap25.mapNameToValue = map30;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = null;
        hashEntityMap32.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap32.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap32.mapNameToValue = map37;
        java.util.Map map39 = hashEntityMap32.mapValueToName;
        hashEntityMap25.mapNameToValue = map39;
        hashEntityMap18.mapValueToName = map39;
        treeEntityMap0.mapNameToValue = map39;
        int int44 = treeEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = null;
        hashEntityMap46.mapNameToValue = map47;
        java.lang.String str50 = hashEntityMap46.name((int) '4');
        java.util.Map map51 = hashEntityMap46.mapValueToName;
        hashEntityMap45.mapValueToName = map51;
        java.util.Map map53 = hashEntityMap45.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = null;
        hashEntityMap55.mapNameToValue = map56;
        java.lang.String str59 = hashEntityMap55.name((int) '4');
        java.util.Map map60 = hashEntityMap55.mapValueToName;
        hashEntityMap54.mapValueToName = map60;
        java.util.Map map62 = hashEntityMap54.mapValueToName;
        hashEntityMap45.mapNameToValue = map62;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map65 = null;
        hashEntityMap64.mapNameToValue = map65;
        java.util.Map map67 = null;
        hashEntityMap64.mapNameToValue = map67;
        java.util.Map map69 = null;
        hashEntityMap64.mapNameToValue = map69;
        java.util.Map map71 = hashEntityMap64.mapValueToName;
        hashEntityMap45.mapNameToValue = map71;
        java.util.Map map73 = hashEntityMap45.mapValueToName;
        treeEntityMap0.mapNameToValue = map73;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map76 = null;
        hashEntityMap75.mapNameToValue = map76;
        java.lang.String str79 = hashEntityMap75.name((int) '4');
        java.lang.String str81 = hashEntityMap75.name((int) (short) 100);
        java.util.Map map82 = hashEntityMap75.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap83 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map84 = null;
        hashEntityMap83.mapNameToValue = map84;
        java.util.Map map86 = null;
        hashEntityMap83.mapNameToValue = map86;
        java.util.Map map88 = null;
        hashEntityMap83.mapNameToValue = map88;
        java.util.Map map90 = hashEntityMap83.mapValueToName;
        hashEntityMap75.mapNameToValue = map90;
        treeEntityMap0.mapValueToName = map90;
        java.lang.String str94 = treeEntityMap0.name((int) '#');
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNull(map82);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNull(str94);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 10);
        binaryEntityMap1.size = (-1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap1.names = strArray16;
        java.lang.String[] strArray19 = binaryEntityMap1.names;
        binaryEntityMap1.add("", (int) 'a');
        int int23 = binaryEntityMap1.growBy;
        binaryEntityMap1.size = 'a';
        binaryEntityMap1.growBy = 32;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) '4');
        java.lang.String str7 = entities0.entityName((int) (short) 1);
        int int9 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) (byte) 100);
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        entities0.addEntities(strArray13);
        java.lang.String str16 = entities0.entityName((int) (byte) 1);
        org.junit.Assert.assertNotNull(entities0);
// flaky "26) test0946(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky "7) test0946(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertNull(str7);
// flaky "3) test0946(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[][] {});
// flaky "3) test0946(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        int int6 = arrayEntityMap1.value("hi!");
        java.lang.String str8 = arrayEntityMap1.name(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int12 = binaryEntityMap10.value("hi!");
        binaryEntityMap10.add("", 0);
        java.lang.String str17 = binaryEntityMap10.name((int) '#');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray22 = new int[] { ' ', '4' };
        binaryEntityMap19.values = intArray22;
        binaryEntityMap10.values = intArray22;
        arrayEntityMap1.values = intArray22;
        java.lang.Class<?> wildcardClass26 = intArray22.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.entityName(2);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap8.mapValueToName;
        hashEntityMap0.mapNameToValue = map15;
        int int18 = hashEntityMap0.value("");
        java.util.Map map19 = null;
        hashEntityMap0.mapNameToValue = map19;
        java.util.Map map21 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = null;
        hashEntityMap22.mapNameToValue = map23;
        java.lang.String str26 = hashEntityMap22.name((int) '4');
        java.lang.String str28 = hashEntityMap22.name((int) (byte) 1);
        java.lang.String str30 = hashEntityMap22.name(100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = null;
        hashEntityMap35.mapNameToValue = map36;
        java.lang.String str39 = hashEntityMap35.name((int) '4');
        java.util.Map map40 = hashEntityMap35.mapValueToName;
        hashEntityMap34.mapValueToName = map40;
        hashEntityMap31.mapValueToName = map40;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = null;
        hashEntityMap43.mapNameToValue = map44;
        java.util.Map map46 = hashEntityMap43.mapNameToValue;
        java.util.Map map47 = hashEntityMap43.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = null;
        hashEntityMap48.mapNameToValue = map49;
        java.lang.String str52 = hashEntityMap48.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = null;
        hashEntityMap53.mapNameToValue = map54;
        java.lang.String str57 = hashEntityMap53.name((int) '4');
        java.lang.String str59 = hashEntityMap53.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map61 = null;
        hashEntityMap60.mapNameToValue = map61;
        java.util.Map map63 = null;
        hashEntityMap60.mapNameToValue = map63;
        java.util.Map map65 = null;
        hashEntityMap60.mapNameToValue = map65;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map68 = null;
        hashEntityMap67.mapNameToValue = map68;
        java.util.Map map70 = null;
        hashEntityMap67.mapNameToValue = map70;
        java.util.Map map72 = null;
        hashEntityMap67.mapNameToValue = map72;
        java.util.Map map74 = hashEntityMap67.mapValueToName;
        hashEntityMap60.mapNameToValue = map74;
        hashEntityMap53.mapValueToName = map74;
        hashEntityMap48.mapValueToName = map74;
        hashEntityMap43.mapNameToValue = map74;
        java.util.Map map79 = hashEntityMap43.mapNameToValue;
        hashEntityMap31.mapValueToName = map79;
        hashEntityMap22.mapNameToValue = map79;
        hashEntityMap0.mapValueToName = map79;
        java.util.Map map83 = hashEntityMap0.mapNameToValue;
        java.util.Map map84 = hashEntityMap0.mapNameToValue;
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNull(map83);
        org.junit.Assert.assertNull(map84);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap1.mapValueToName = map27;
        entities0.map = hashEntityMap1;
        java.lang.String str33 = entities0.escape("hi!");
        java.lang.String str35 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities0.map = arrayEntityMap37;
        java.lang.String str40 = entities0.escape("");
        java.io.Writer writer41 = null;
        entities0.escape(writer41, "");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap45 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray48 = new int[] { ' ', '4' };
        binaryEntityMap45.values = intArray48;
        int int51 = binaryEntityMap45.value("");
        int int53 = binaryEntityMap45.value("");
        binaryEntityMap45.add("hi!", 35);
        java.lang.String str58 = binaryEntityMap45.name((int) (short) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap60 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray63 = new int[] { ' ', '4' };
        binaryEntityMap60.values = intArray63;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap66 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray67 = arrayEntityMap66.values;
        java.lang.String str69 = arrayEntityMap66.name((int) (short) 100);
        int[] intArray72 = new int[] { (short) -1, 10 };
        arrayEntityMap66.values = intArray72;
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!" };
        arrayEntityMap66.names = strArray75;
        binaryEntityMap60.names = strArray75;
        java.lang.String[] strArray78 = binaryEntityMap60.names;
        binaryEntityMap45.names = strArray78;
        entities0.map = binaryEntityMap45;
        java.lang.String str82 = entities0.unescape("");
        int int84 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap85 = entities0.map;
        java.lang.String str87 = entities0.entityName(52);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 0 });
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 35 + "'", int84 == 35);
        org.junit.Assert.assertNotNull(entityMap85);
        org.junit.Assert.assertNull(str87);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray11 = arrayEntityMap10.values;
        int int12 = arrayEntityMap10.growBy;
        arrayEntityMap10.size = 100;
        arrayEntityMap10.growBy = (byte) 100;
        arrayEntityMap10.growBy = (short) 1;
        int[] intArray19 = arrayEntityMap10.values;
        entities0.map = arrayEntityMap10;
        java.lang.String str22 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap23 = entities0.map;
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for object array[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(entityMap23);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = null;
        hashEntityMap10.mapNameToValue = map11;
        java.lang.String str14 = hashEntityMap10.name((int) '4');
        java.util.Map map15 = hashEntityMap10.mapValueToName;
        hashEntityMap9.mapValueToName = map15;
        java.util.Map map17 = hashEntityMap9.mapValueToName;
        hashEntityMap0.mapNameToValue = map17;
        java.util.Map map19 = hashEntityMap0.mapValueToName;
        java.util.Map map20 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        java.util.Map map2 = null;
        hashEntityMap0.mapNameToValue = map2;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        java.util.Map map10 = hashEntityMap5.mapValueToName;
        hashEntityMap4.mapValueToName = map10;
        hashEntityMap0.mapNameToValue = map10;
        java.util.Map map13 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", 35);
        hashEntityMap0.add("", 100);
        java.util.Map map20 = hashEntityMap0.mapValueToName;
        java.util.Map map21 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = null;
        hashEntityMap22.mapNameToValue = map23;
        java.util.Map map25 = hashEntityMap22.mapNameToValue;
        java.util.Map map26 = hashEntityMap22.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = null;
        hashEntityMap27.mapNameToValue = map28;
        java.lang.String str31 = hashEntityMap27.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = null;
        hashEntityMap32.mapNameToValue = map33;
        java.lang.String str36 = hashEntityMap32.name((int) '4');
        java.lang.String str38 = hashEntityMap32.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map40 = null;
        hashEntityMap39.mapNameToValue = map40;
        java.util.Map map42 = null;
        hashEntityMap39.mapNameToValue = map42;
        java.util.Map map44 = null;
        hashEntityMap39.mapNameToValue = map44;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = null;
        hashEntityMap46.mapNameToValue = map47;
        java.util.Map map49 = null;
        hashEntityMap46.mapNameToValue = map49;
        java.util.Map map51 = null;
        hashEntityMap46.mapNameToValue = map51;
        java.util.Map map53 = hashEntityMap46.mapValueToName;
        hashEntityMap39.mapNameToValue = map53;
        hashEntityMap32.mapValueToName = map53;
        hashEntityMap27.mapValueToName = map53;
        hashEntityMap22.mapNameToValue = map53;
        hashEntityMap0.mapValueToName = map53;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray6 = arrayEntityMap5.values;
        java.lang.String str8 = arrayEntityMap5.name((int) (short) 100);
        int[] intArray11 = new int[] { (short) -1, 10 };
        arrayEntityMap5.values = intArray11;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        arrayEntityMap5.names = strArray14;
        binaryEntityMap1.names = strArray14;
        binaryEntityMap1.ensureCapacity(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap5.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray12 = new int[] { ' ', '4' };
        binaryEntityMap9.values = intArray12;
        arrayEntityMap5.values = intArray12;
        arrayEntityMap1.values = intArray12;
        java.lang.String str17 = arrayEntityMap1.name(1);
        int[] intArray18 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap20 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap20.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray27 = new int[] { ' ', '4' };
        binaryEntityMap24.values = intArray27;
        arrayEntityMap20.values = intArray27;
        int int30 = arrayEntityMap20.growBy;
        java.lang.String[] strArray31 = arrayEntityMap20.names;
        arrayEntityMap1.names = strArray31;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { null });
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        binaryEntityMap1.add("", (int) (byte) 1);
        int[] intArray12 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap1.values = intArray12;
        binaryEntityMap1.add("hi!", (int) '4');
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1, 52, 32 });
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        int int14 = binaryEntityMap1.value("");
        java.lang.String str16 = binaryEntityMap1.name((int) 'a');
        binaryEntityMap1.growBy = 0;
        java.lang.Class<?> wildcardClass19 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("", 32);
        java.lang.String str19 = lookupEntityMap0.name((int) 'a');
        lookupEntityMap0.add("", (int) (short) -1);
        java.lang.String str24 = lookupEntityMap0.name(32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer4 = null;
        entities0.escape(writer4, "");
        java.lang.String str8 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        binaryEntityMap1.add("hi!", 0);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        int int6 = arrayEntityMap1.value("hi!");
        int int8 = arrayEntityMap1.value("hi!");
        java.lang.String[] strArray9 = arrayEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { null });
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        int int7 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
// flaky "27) test0962(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(10);
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str14 = lookupEntityMap0.name(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.lang.String str9 = hashEntityMap5.name((int) '4');
        java.lang.String str11 = hashEntityMap5.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.util.Map map15 = null;
        hashEntityMap12.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap12.mapNameToValue = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap19.mapNameToValue = map22;
        java.util.Map map24 = null;
        hashEntityMap19.mapNameToValue = map24;
        java.util.Map map26 = hashEntityMap19.mapValueToName;
        hashEntityMap12.mapNameToValue = map26;
        hashEntityMap5.mapValueToName = map26;
        hashEntityMap0.mapValueToName = map26;
        java.lang.String str31 = hashEntityMap0.name((int) '#');
        java.util.Map map32 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = null;
        hashEntityMap33.mapNameToValue = map34;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = null;
        hashEntityMap37.mapNameToValue = map38;
        java.lang.String str41 = hashEntityMap37.name((int) '4');
        java.util.Map map42 = hashEntityMap37.mapValueToName;
        hashEntityMap36.mapValueToName = map42;
        hashEntityMap33.mapValueToName = map42;
        java.util.Map map45 = hashEntityMap33.mapValueToName;
        hashEntityMap0.mapValueToName = map45;
        java.lang.String str48 = hashEntityMap0.name((int) '#');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = 0; // flaky "28) test0965(org.apache.commons.lang.RegressionTest1)": entities0.entityValue("");
// flaky "8) test0965(org.apache.commons.lang.RegressionTest1)":         entities0.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities6.map;
        java.lang.String str9 = entities6.unescape("");
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.HTML32;
        int int12 = 0; // flaky "4) test0965(org.apache.commons.lang.RegressionTest1)": entities10.entityValue("");
// flaky "4) test0965(org.apache.commons.lang.RegressionTest1)":         entities10.addEntity("hi!", (int) '4');
        java.lang.String str17 = null; // flaky "2) test0965(org.apache.commons.lang.RegressionTest1)": entities10.entityName((int) (short) 1);
        int int19 = 0; // flaky "1) test0965(org.apache.commons.lang.RegressionTest1)": entities10.entityValue("");
// flaky "1) test0965(org.apache.commons.lang.RegressionTest1)":         entities10.addEntity("hi!", (int) (byte) 100);
        java.lang.String[][] strArray23 = new java.lang.String[][] {};
        entities10.addEntities(strArray23);
        entities6.addEntities(strArray23);
        entities0.addEntities(strArray23);
// flaky "1) test0965(org.apache.commons.lang.RegressionTest1)":         entities0.addEntity("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(entities0);
// flaky "1) test0965(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(entities10);
// flaky "1) test0965(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky "1) test0965(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[][] {});
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.entityName(2);
        java.lang.String str9 = entities0.entityName((int) (byte) 10);
        java.io.Writer writer10 = null;
        entities0.escape(writer10, "");
        java.io.Writer writer13 = null;
        entities0.escape(writer13, "");
        java.lang.String str17 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
// flaky "29) test0966(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities12 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities12.map;
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities12.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap16.add("hi!", 0);
        arrayEntityMap16.size = (byte) 1;
        arrayEntityMap16.growBy = 100;
        java.lang.String str25 = arrayEntityMap16.name((int) (byte) 1);
        entities12.map = arrayEntityMap16;
        entities0.map = arrayEntityMap16;
        arrayEntityMap16.ensureCapacity((int) '4');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(entities12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) 'a');
        int int4 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = lookupEntityMap0.name((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        java.util.Map map4 = null;
        hashEntityMap0.mapValueToName = map4;
        int int7 = hashEntityMap0.value("");
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        java.util.Map map10 = hashEntityMap0.mapValueToName;
        java.util.Map map11 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(map11);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        java.util.Map map15 = hashEntityMap8.mapValueToName;
        hashEntityMap0.mapNameToValue = map15;
        int int18 = hashEntityMap0.value("");
        java.util.Map map19 = null;
        hashEntityMap0.mapNameToValue = map19;
        java.util.Map map21 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = null;
        hashEntityMap22.mapNameToValue = map23;
        java.lang.String str26 = hashEntityMap22.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = null;
        hashEntityMap27.mapNameToValue = map28;
        java.lang.String str31 = hashEntityMap27.name((int) '4');
        java.lang.String str33 = hashEntityMap27.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = null;
        hashEntityMap34.mapNameToValue = map35;
        java.util.Map map37 = null;
        hashEntityMap34.mapNameToValue = map37;
        java.util.Map map39 = null;
        hashEntityMap34.mapNameToValue = map39;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = null;
        hashEntityMap41.mapNameToValue = map42;
        java.util.Map map44 = null;
        hashEntityMap41.mapNameToValue = map44;
        java.util.Map map46 = null;
        hashEntityMap41.mapNameToValue = map46;
        java.util.Map map48 = hashEntityMap41.mapValueToName;
        hashEntityMap34.mapNameToValue = map48;
        hashEntityMap27.mapValueToName = map48;
        hashEntityMap22.mapValueToName = map48;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = null;
        hashEntityMap52.mapNameToValue = map53;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map57 = null;
        hashEntityMap56.mapNameToValue = map57;
        java.lang.String str60 = hashEntityMap56.name((int) '4');
        java.util.Map map61 = hashEntityMap56.mapValueToName;
        hashEntityMap55.mapValueToName = map61;
        hashEntityMap52.mapValueToName = map61;
        hashEntityMap22.mapValueToName = map61;
        hashEntityMap0.mapNameToValue = map61;
        java.util.Map map66 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = null;
        binaryEntityMap0.values = intArray1;
        java.lang.String str4 = binaryEntityMap0.name((-1));
        binaryEntityMap0.size = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
// flaky "30) test0972(org.apache.commons.lang.RegressionTest1)":         entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = null; // flaky "9) test0972(org.apache.commons.lang.RegressionTest1)": entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("");
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "5) test0972(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) (byte) 10);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        java.util.Map map4 = null;
        hashEntityMap0.mapValueToName = map4;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap0.mapNameToValue = map27;
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap1.mapValueToName = map27;
        entities0.map = hashEntityMap1;
        java.lang.String str33 = entities0.escape("hi!");
        java.lang.String str35 = entities0.unescape("");
        // The following exception was thrown during execution in test generation
        try {
            int int37 = entities0.entityValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int2 = arrayEntityMap1.growBy;
        int int3 = arrayEntityMap1.size;
        int[] intArray4 = arrayEntityMap1.values;
        java.lang.Class<?> wildcardClass5 = arrayEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        int int6 = lookupEntityMap0.value("hi!");
        java.lang.String str8 = lookupEntityMap0.name(10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int5 = arrayEntityMap3.value("hi!");
        arrayEntityMap3.size = (byte) 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str11 = binaryEntityMap9.name((int) '#');
        int[] intArray12 = binaryEntityMap9.values;
        arrayEntityMap3.values = intArray12;
        arrayEntityMap1.values = intArray12;
        java.lang.String str16 = arrayEntityMap1.name((int) (short) 0);
        java.lang.String str18 = arrayEntityMap1.name((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] {});
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap5.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray12 = new int[] { ' ', '4' };
        binaryEntityMap9.values = intArray12;
        arrayEntityMap5.values = intArray12;
        arrayEntityMap1.values = intArray12;
        java.lang.String str17 = arrayEntityMap1.name(1);
        arrayEntityMap1.ensureCapacity((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        arrayEntityMap1.add("", (int) (short) -1);
        arrayEntityMap1.add("hi!", (int) '4');
        int int13 = arrayEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1) });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        java.lang.String str12 = binaryEntityMap1.name((int) (byte) 0);
        java.lang.String str14 = binaryEntityMap1.name((int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.util.Map map10 = null;
        hashEntityMap7.mapNameToValue = map10;
        java.util.Map map12 = null;
        hashEntityMap7.mapNameToValue = map12;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap14.mapNameToValue = map17;
        java.util.Map map19 = null;
        hashEntityMap14.mapNameToValue = map19;
        java.util.Map map21 = hashEntityMap14.mapValueToName;
        hashEntityMap7.mapNameToValue = map21;
        hashEntityMap0.mapValueToName = map21;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = null;
        hashEntityMap28.mapNameToValue = map29;
        java.lang.String str32 = hashEntityMap28.name((int) '4');
        java.util.Map map33 = hashEntityMap28.mapValueToName;
        hashEntityMap27.mapValueToName = map33;
        hashEntityMap24.mapValueToName = map33;
        hashEntityMap0.mapNameToValue = map33;
        hashEntityMap0.add("hi!", (int) (short) 1);
        hashEntityMap0.add("", 10);
        int int44 = hashEntityMap0.value("");
        java.util.Map map45 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap2 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap4.add("hi!", 0);
        arrayEntityMap4.size = (byte) 1;
        arrayEntityMap4.growBy = 100;
        java.lang.String str13 = arrayEntityMap4.name((int) (byte) 1);
        entities0.map = arrayEntityMap4;
        java.lang.String str16 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities0.map;
        java.lang.String str19 = entities0.entityName(100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(entityMap17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.entityName(10);
        entities0.addEntity("", 52);
        entities0.addEntity("", (int) '#');
        java.lang.String str22 = entities0.unescape("");
        entities0.addEntity("hi!", 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 52, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities7.map;
        java.lang.String str10 = entities7.unescape("hi!");
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities11.map;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities11.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap15.add("hi!", 0);
        arrayEntityMap15.size = (byte) 1;
        arrayEntityMap15.growBy = 100;
        java.lang.String str24 = arrayEntityMap15.name((int) (byte) 1);
        entities11.map = arrayEntityMap15;
        entities7.map = arrayEntityMap15;
        entities0.map = arrayEntityMap15;
        org.apache.commons.lang.Entities.EntityMap entityMap28 = entities0.map;
        entities0.addEntity("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap32 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str34 = lookupEntityMap32.name(0);
        java.lang.String str36 = lookupEntityMap32.name(0);
        int int38 = lookupEntityMap32.value("");
        lookupEntityMap32.add("hi!", 10);
        java.lang.String str43 = lookupEntityMap32.name((int) '4');
        lookupEntityMap32.add("hi!", (int) '#');
        java.lang.String str48 = lookupEntityMap32.name((int) ' ');
        entities0.map = lookupEntityMap32;
        java.io.Writer writer50 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer50, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(entityMap28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        int int9 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", 35);
        java.lang.String str14 = binaryEntityMap1.name(0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.util.Map map10 = null;
        hashEntityMap7.mapNameToValue = map10;
        java.util.Map map12 = null;
        hashEntityMap7.mapNameToValue = map12;
        java.util.Map map14 = hashEntityMap7.mapValueToName;
        hashEntityMap0.mapNameToValue = map14;
        java.util.Map map16 = hashEntityMap0.mapValueToName;
        java.util.Map map17 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("hi!", (int) (short) 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        arrayEntityMap1.growBy = 0;
        int int10 = arrayEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        java.lang.String str12 = entities0.escape("hi!");
        entities0.addEntity("hi!", 35);
        org.apache.commons.lang.Entities.EntityMap entityMap16 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 35, 10 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(entityMap16);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        java.util.Map map2 = hashEntityMap0.mapNameToValue;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        java.lang.String str8 = hashEntityMap0.name((int) (byte) -1);
        int int10 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        int int10 = binaryEntityMap1.value("");
        binaryEntityMap1.ensureCapacity(100);
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 100);
        binaryEntityMap1.add("hi!", (int) (byte) 1);
        binaryEntityMap1.size = (byte) 0;
        binaryEntityMap1.add("", (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (int) (short) -1);
        lookupEntityMap0.add("hi!", 100);
        java.lang.String str14 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("hi!", (int) (short) 10);
        java.lang.String str19 = lookupEntityMap0.name((int) (byte) 100);
        lookupEntityMap0.add("", (int) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = null;
        hashEntityMap6.mapNameToValue = map7;
        java.lang.String str10 = hashEntityMap6.name((int) '4');
        java.lang.String str12 = hashEntityMap6.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.util.Map map16 = null;
        hashEntityMap13.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap13.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap20.mapValueToName;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap6.mapValueToName = map27;
        hashEntityMap1.mapValueToName = map27;
        entities0.map = hashEntityMap1;
        java.lang.String str33 = entities0.escape("hi!");
        java.lang.String str35 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities0.map = arrayEntityMap37;
        java.lang.String str40 = entities0.escape("");
        java.io.Writer writer41 = null;
        entities0.escape(writer41, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap45 = entities0.map;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(entityMap45);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.util.Map map10 = null;
        hashEntityMap7.mapNameToValue = map10;
        java.util.Map map12 = null;
        hashEntityMap7.mapNameToValue = map12;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.util.Map map17 = null;
        hashEntityMap14.mapNameToValue = map17;
        java.util.Map map19 = null;
        hashEntityMap14.mapNameToValue = map19;
        java.util.Map map21 = hashEntityMap14.mapValueToName;
        hashEntityMap7.mapNameToValue = map21;
        hashEntityMap0.mapValueToName = map21;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.lang.String str28 = hashEntityMap24.name((int) '4');
        java.lang.String str30 = hashEntityMap24.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap31.mapNameToValue = map34;
        java.util.Map map36 = null;
        hashEntityMap31.mapNameToValue = map36;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = null;
        hashEntityMap38.mapNameToValue = map39;
        java.util.Map map41 = null;
        hashEntityMap38.mapNameToValue = map41;
        java.util.Map map43 = null;
        hashEntityMap38.mapNameToValue = map43;
        java.util.Map map45 = hashEntityMap38.mapValueToName;
        hashEntityMap31.mapNameToValue = map45;
        hashEntityMap24.mapValueToName = map45;
        hashEntityMap0.mapValueToName = map45;
        java.util.Map map49 = hashEntityMap0.mapNameToValue;
        java.util.Map map50 = hashEntityMap0.mapNameToValue;
        java.lang.String str52 = hashEntityMap0.name((int) ' ');
        java.util.Map map53 = null;
        hashEntityMap0.mapValueToName = map53;
        java.util.Map map55 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNull(map50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(map55);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        int int7 = entities0.entityValue("hi!");
        entities0.addEntity("hi!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str9 = binaryEntityMap7.name((int) '#');
        binaryEntityMap7.add("", (int) (byte) -1);
        java.lang.String str14 = binaryEntityMap7.name((int) (byte) 10);
        entities0.map = binaryEntityMap7;
        binaryEntityMap7.growBy = (-1);
        binaryEntityMap7.add("hi!", (int) (short) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.lang.String str2 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray7 = new int[] { ' ', '4' };
        binaryEntityMap4.values = intArray7;
        java.lang.String str10 = binaryEntityMap4.name((int) (byte) 100);
        binaryEntityMap4.add("hi!", (-1));
        java.lang.String str15 = binaryEntityMap4.name(0);
        entities0.map = binaryEntityMap4;
        java.lang.String str18 = entities0.escape("");
        int int20 = entities0.entityValue("hi!");
        java.lang.String str22 = entities0.unescape("hi!");
        java.lang.String str24 = entities0.entityName(35);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
// flaky "31) test1000(org.apache.commons.lang.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 32 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str24);
    }
}
