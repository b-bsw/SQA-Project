package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        java.util.Map map84 = hashEntityMap0.mapValueToName;
        java.util.Map map85 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        int int16 = lookupEntityMap0.value("hi!");
        java.lang.String str18 = lookupEntityMap0.name(52);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray4 = arrayEntityMap3.values;
        java.lang.String str6 = arrayEntityMap3.name((int) (short) 100);
        int int8 = arrayEntityMap3.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray11 = arrayEntityMap10.values;
        int int12 = arrayEntityMap10.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap14.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray21 = new int[] { ' ', '4' };
        binaryEntityMap18.values = intArray21;
        arrayEntityMap14.values = intArray21;
        arrayEntityMap10.values = intArray21;
        arrayEntityMap3.values = intArray21;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap27 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int28 = arrayEntityMap27.size;
        int int29 = arrayEntityMap27.growBy;
        java.lang.String str31 = arrayEntityMap27.name((int) (short) 100);
        int int32 = arrayEntityMap27.growBy;
        java.lang.String str34 = arrayEntityMap27.name((int) ' ');
        arrayEntityMap27.add("", (int) ' ');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int41 = arrayEntityMap39.value("hi!");
        int int42 = arrayEntityMap39.growBy;
        arrayEntityMap39.growBy = 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap46 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray49 = new int[] { ' ', '4' };
        binaryEntityMap46.values = intArray49;
        binaryEntityMap46.size = '#';
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap54 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray55 = arrayEntityMap54.values;
        java.lang.String str57 = arrayEntityMap54.name((int) (short) 100);
        int int59 = arrayEntityMap54.value("hi!");
        arrayEntityMap54.size = (byte) 0;
        int int62 = arrayEntityMap54.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap64 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap64.add("hi!", 0);
        arrayEntityMap64.size = (byte) 1;
        int[] intArray70 = new int[] {};
        arrayEntityMap64.values = intArray70;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap73 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int75 = arrayEntityMap73.value("");
        java.lang.String[] strArray76 = arrayEntityMap73.names;
        arrayEntityMap64.names = strArray76;
        arrayEntityMap54.names = strArray76;
        binaryEntityMap46.names = strArray76;
        arrayEntityMap39.names = strArray76;
        arrayEntityMap27.names = strArray76;
        arrayEntityMap3.names = strArray76;
        binaryEntityMap1.names = strArray76;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 0 });
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] {});
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { null });
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.lang.String str2 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray7 = new int[] { ' ', '4' };
        binaryEntityMap4.values = intArray7;
        java.lang.String str10 = binaryEntityMap4.name((int) (byte) 100);
        binaryEntityMap4.add("hi!", (-1));
        java.lang.String str15 = binaryEntityMap4.name(0);
        entities0.map = binaryEntityMap4;
        binaryEntityMap4.add("hi!", (int) (short) 0);
        java.lang.String str21 = binaryEntityMap4.name(100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        java.util.Map map4 = null;
        hashEntityMap0.mapValueToName = map4;
        int int7 = hashEntityMap0.value("");
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        int int11 = hashEntityMap0.value("hi!");
        java.util.Map map12 = hashEntityMap0.mapValueToName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = hashEntityMap0.name((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(map12);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap3.add("hi!", 0);
        arrayEntityMap3.size = (byte) 1;
        arrayEntityMap3.size = (-1);
        arrayEntityMap3.size = (byte) 10;
        entities0.map = arrayEntityMap3;
        arrayEntityMap3.ensureCapacity(100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap17.add("hi!", 0);
        java.lang.String str22 = arrayEntityMap17.name(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap24.ensureCapacity(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray31 = new int[] { ' ', '4' };
        binaryEntityMap28.values = intArray31;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap34 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray35 = arrayEntityMap34.values;
        java.lang.String str37 = arrayEntityMap34.name((int) (short) 100);
        int[] intArray40 = new int[] { (short) -1, 10 };
        arrayEntityMap34.values = intArray40;
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        arrayEntityMap34.names = strArray43;
        binaryEntityMap28.names = strArray43;
        java.lang.String[] strArray46 = binaryEntityMap28.names;
        binaryEntityMap28.add("", 10);
        binaryEntityMap28.ensureCapacity(10);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "" };
        binaryEntityMap28.names = strArray54;
        binaryEntityMap24.names = strArray54;
        arrayEntityMap17.names = strArray54;
        arrayEntityMap3.names = strArray54;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap60 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap60.growBy = (-1);
        int[] intArray63 = arrayEntityMap60.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap65 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap65.add("hi!", 0);
        arrayEntityMap65.size = (byte) 1;
        arrayEntityMap65.growBy = 100;
        java.lang.String[] strArray73 = arrayEntityMap65.names;
        arrayEntityMap60.names = strArray73;
        arrayEntityMap3.names = strArray73;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 0 });
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray73);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        int[] intArray23 = binaryEntityMap1.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str27 = binaryEntityMap25.name(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap29 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray32 = new int[] { ' ', '4' };
        binaryEntityMap29.values = intArray32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap35 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray36 = arrayEntityMap35.values;
        java.lang.String str38 = arrayEntityMap35.name((int) (short) 100);
        int[] intArray41 = new int[] { (short) -1, 10 };
        arrayEntityMap35.values = intArray41;
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!" };
        arrayEntityMap35.names = strArray44;
        binaryEntityMap29.names = strArray44;
        binaryEntityMap25.names = strArray44;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap49 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int51 = arrayEntityMap49.value("");
        java.lang.String[] strArray52 = arrayEntityMap49.names;
        int[] intArray53 = arrayEntityMap49.values;
        binaryEntityMap25.values = intArray53;
        binaryEntityMap1.values = intArray53;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 10 });
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0 });
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 0 });
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        int int6 = lookupEntityMap0.value("hi!");
        java.lang.String str8 = lookupEntityMap0.name(10);
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        int int14 = lookupEntityMap0.value("hi!");
        java.lang.String str16 = lookupEntityMap0.name(10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        java.io.Writer writer17 = null;
        entities0.escape(writer17, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("hi!");
        int int7 = arrayEntityMap1.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray12 = new int[] { ' ', '4' };
        binaryEntityMap9.values = intArray12;
        arrayEntityMap1.values = intArray12;
        arrayEntityMap1.growBy = (short) 1;
        java.lang.String[] strArray17 = arrayEntityMap1.names;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { null });
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        arrayEntityMap1.size = (byte) 100;
        arrayEntityMap1.size = 100;
        arrayEntityMap1.ensureCapacity((int) (short) 1);
        arrayEntityMap1.size = (short) -1;
        int int12 = arrayEntityMap1.size;
        arrayEntityMap1.size = ' ';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str6 = lookupEntityMap0.name(100);
        int int8 = lookupEntityMap0.value("hi!");
        int int10 = lookupEntityMap0.value("");
        java.lang.String str12 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (int) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name((int) (short) 100);
        int int14 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.add("", (int) (byte) 10);
        org.apache.commons.lang.Entities entities18 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str20 = entities18.unescape("hi!");
        java.io.Writer writer21 = null;
        entities18.escape(writer21, "");
        org.apache.commons.lang.Entities.EntityMap entityMap24 = entities18.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray29 = new int[] { ' ', '4' };
        binaryEntityMap26.values = intArray29;
        java.lang.String str32 = binaryEntityMap26.name((int) (byte) 100);
        binaryEntityMap26.add("hi!", (-1));
        java.lang.String[] strArray36 = binaryEntityMap26.names;
        binaryEntityMap26.add("", (int) (byte) 0);
        entities18.map = binaryEntityMap26;
        java.lang.String[] strArray41 = binaryEntityMap26.names;
        binaryEntityMap1.names = strArray41;
        binaryEntityMap1.growBy = 100;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 10 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(entities18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(entityMap24);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.size = (short) 10;
        int int6 = binaryEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        java.lang.String str45 = hashEntityMap14.name((int) '#');
        java.util.Map map46 = hashEntityMap14.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map48 = null;
        hashEntityMap47.mapNameToValue = map48;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map52 = null;
        hashEntityMap51.mapNameToValue = map52;
        java.lang.String str55 = hashEntityMap51.name((int) '4');
        java.util.Map map56 = hashEntityMap51.mapValueToName;
        hashEntityMap50.mapValueToName = map56;
        hashEntityMap47.mapValueToName = map56;
        java.util.Map map59 = hashEntityMap47.mapValueToName;
        hashEntityMap14.mapValueToName = map59;
        java.util.Map map61 = hashEntityMap14.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map63 = null;
        hashEntityMap62.mapNameToValue = map63;
        java.lang.String str66 = hashEntityMap62.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map68 = null;
        hashEntityMap67.mapNameToValue = map68;
        java.util.Map map70 = null;
        hashEntityMap67.mapNameToValue = map70;
        java.util.Map map72 = null;
        hashEntityMap67.mapNameToValue = map72;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap74 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map75 = null;
        hashEntityMap74.mapNameToValue = map75;
        java.util.Map map77 = null;
        hashEntityMap74.mapNameToValue = map77;
        java.util.Map map79 = null;
        hashEntityMap74.mapNameToValue = map79;
        java.util.Map map81 = hashEntityMap74.mapValueToName;
        hashEntityMap67.mapNameToValue = map81;
        hashEntityMap62.mapNameToValue = map81;
        hashEntityMap14.mapNameToValue = map81;
        hashEntityMap0.mapNameToValue = map81;
        java.util.Map map86 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(map46);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map86);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        java.lang.String str10 = hashEntityMap0.name(0);
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = 100;
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.size = 0;
        int int10 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(97);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = 100;
        java.lang.String[] strArray9 = arrayEntityMap1.names;
        int[] intArray10 = arrayEntityMap1.values;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        java.lang.String str36 = entities0.entityName((int) (byte) 100);
        org.apache.commons.lang.Entities.EntityMap entityMap37 = entities0.map;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(entityMap37);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        java.lang.String str24 = binaryEntityMap1.name((int) (short) 0);
        binaryEntityMap1.growBy = (short) 1;
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
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap2 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap4.add("hi!", 0);
        arrayEntityMap4.size = (byte) 1;
        arrayEntityMap4.growBy = 100;
        java.lang.String str13 = arrayEntityMap4.name((int) (byte) 1);
        entities0.map = arrayEntityMap4;
        java.lang.String str16 = arrayEntityMap4.name(100);
        int int17 = arrayEntityMap4.size;
        int int18 = arrayEntityMap4.growBy;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.add("", 0);
        binaryEntityMap1.add("", (int) (byte) 1);
        java.lang.String str11 = binaryEntityMap1.name(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = null;
        hashEntityMap23.mapNameToValue = map24;
        java.lang.String str27 = hashEntityMap23.name((int) '4');
        java.util.Map map28 = hashEntityMap23.mapValueToName;
        hashEntityMap22.mapValueToName = map28;
        java.util.Map map30 = hashEntityMap22.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = null;
        hashEntityMap32.mapNameToValue = map33;
        java.lang.String str36 = hashEntityMap32.name((int) '4');
        java.util.Map map37 = hashEntityMap32.mapValueToName;
        hashEntityMap31.mapValueToName = map37;
        java.util.Map map39 = hashEntityMap31.mapValueToName;
        hashEntityMap22.mapNameToValue = map39;
        hashEntityMap0.mapNameToValue = map39;
        hashEntityMap0.add("", 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        java.util.Map map56 = hashEntityMap0.mapValueToName;
        java.lang.String str58 = hashEntityMap0.name((int) (byte) 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = hashEntityMap0.name(100);
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        java.lang.String str11 = hashEntityMap0.name((int) 'a');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        java.util.Map map21 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        java.lang.String str22 = hashEntityMap0.name((int) (short) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = null;
        hashEntityMap23.mapNameToValue = map24;
        java.lang.String str27 = hashEntityMap23.name((int) '4');
        java.lang.String str29 = hashEntityMap23.name((int) (short) 100);
        java.util.Map map30 = hashEntityMap23.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap31.mapNameToValue = map34;
        java.util.Map map36 = null;
        hashEntityMap31.mapNameToValue = map36;
        java.util.Map map38 = hashEntityMap31.mapValueToName;
        hashEntityMap23.mapNameToValue = map38;
        int int41 = hashEntityMap23.value("");
        java.util.Map map42 = null;
        hashEntityMap23.mapNameToValue = map42;
        java.util.Map map44 = hashEntityMap23.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = null;
        hashEntityMap45.mapNameToValue = map46;
        java.lang.String str49 = hashEntityMap45.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map51 = null;
        hashEntityMap50.mapNameToValue = map51;
        java.lang.String str54 = hashEntityMap50.name((int) '4');
        java.lang.String str56 = hashEntityMap50.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map58 = null;
        hashEntityMap57.mapNameToValue = map58;
        java.util.Map map60 = null;
        hashEntityMap57.mapNameToValue = map60;
        java.util.Map map62 = null;
        hashEntityMap57.mapNameToValue = map62;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map65 = null;
        hashEntityMap64.mapNameToValue = map65;
        java.util.Map map67 = null;
        hashEntityMap64.mapNameToValue = map67;
        java.util.Map map69 = null;
        hashEntityMap64.mapNameToValue = map69;
        java.util.Map map71 = hashEntityMap64.mapValueToName;
        hashEntityMap57.mapNameToValue = map71;
        hashEntityMap50.mapValueToName = map71;
        hashEntityMap45.mapValueToName = map71;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map76 = null;
        hashEntityMap75.mapNameToValue = map76;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap78 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap79 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map80 = null;
        hashEntityMap79.mapNameToValue = map80;
        java.lang.String str83 = hashEntityMap79.name((int) '4');
        java.util.Map map84 = hashEntityMap79.mapValueToName;
        hashEntityMap78.mapValueToName = map84;
        hashEntityMap75.mapValueToName = map84;
        hashEntityMap45.mapValueToName = map84;
        hashEntityMap23.mapNameToValue = map84;
        int int90 = hashEntityMap23.value("hi!");
        java.util.Map map91 = hashEntityMap23.mapNameToValue;
        hashEntityMap0.mapNameToValue = map91;
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        int int9 = arrayEntityMap1.value("");
        java.lang.String str11 = arrayEntityMap1.name((int) (short) 0);
        arrayEntityMap1.add("", 32);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int18 = binaryEntityMap16.value("hi!");
        binaryEntityMap16.add("", 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int25 = binaryEntityMap23.value("hi!");
        binaryEntityMap23.add("", 0);
        java.lang.String str30 = binaryEntityMap23.name((int) '#');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray35 = new int[] { ' ', '4' };
        binaryEntityMap32.values = intArray35;
        binaryEntityMap23.values = intArray35;
        binaryEntityMap16.values = intArray35;
        arrayEntityMap1.values = intArray35;
        int int41 = arrayEntityMap1.value("");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 32 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        int int31 = entities0.entityValue("");
        java.lang.String str33 = entities0.entityName((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray9 = arrayEntityMap8.values;
        int int10 = arrayEntityMap8.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap12.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray19 = new int[] { ' ', '4' };
        binaryEntityMap16.values = intArray19;
        arrayEntityMap12.values = intArray19;
        arrayEntityMap8.values = intArray19;
        arrayEntityMap1.values = intArray19;
        arrayEntityMap1.add("", 0);
        int int28 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.growBy = (byte) 10;
        org.apache.commons.lang.Entities entities31 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap32 = entities31.map;
        org.apache.commons.lang.Entities.EntityMap entityMap33 = entities31.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap35 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap35.add("hi!", 0);
        arrayEntityMap35.size = (byte) 1;
        arrayEntityMap35.growBy = 100;
        java.lang.String str44 = arrayEntityMap35.name((int) (byte) 1);
        entities31.map = arrayEntityMap35;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap47 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray48 = arrayEntityMap47.values;
        java.lang.String str50 = arrayEntityMap47.name((int) (short) 100);
        int int52 = arrayEntityMap47.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap54 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap54.add("hi!", 0);
        arrayEntityMap54.size = (byte) 1;
        int[] intArray60 = new int[] {};
        arrayEntityMap54.values = intArray60;
        arrayEntityMap47.values = intArray60;
        arrayEntityMap35.values = intArray60;
        arrayEntityMap1.values = intArray60;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, 52 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(entities31);
        org.junit.Assert.assertNotNull(entityMap32);
        org.junit.Assert.assertNotNull(entityMap33);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 0 });
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] {});
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = null;
        binaryEntityMap0.values = intArray1;
        int[] intArray3 = binaryEntityMap0.values;
        java.lang.String str5 = binaryEntityMap0.name(0);
        org.junit.Assert.assertNull(intArray3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("hi!");
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 100);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = hashEntityMap0.name(100);
        java.lang.String str10 = hashEntityMap0.name(2);
        java.lang.String str12 = hashEntityMap0.name(52);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hashEntityMap0.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        int int13 = lookupEntityMap0.value("");
        java.lang.String str15 = lookupEntityMap0.name(32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        binaryEntityMap1.names = strArray15;
        binaryEntityMap1.size = 10;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for object array[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        int int46 = treeEntityMap0.value("hi!");
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
        treeEntityMap47.add("", 35);
        treeEntityMap47.add("hi!", (int) (byte) 100);
        java.util.Map map71 = treeEntityMap47.mapValueToName;
        treeEntityMap0.mapValueToName = map71;
        java.util.Map map73 = treeEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap74 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap74.add("", (int) (byte) 100);
        int int79 = hashEntityMap74.value("");
        java.util.Map map80 = hashEntityMap74.mapNameToValue;
        treeEntityMap0.mapNameToValue = map80;
        int int83 = treeEntityMap0.value("");
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 100 + "'", int83 == 100);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        int[] intArray4 = arrayEntityMap1.values;
        int int6 = arrayEntityMap1.value("");
        java.lang.String str8 = arrayEntityMap1.name(10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        java.lang.String[][] strArray55 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray55);
        java.lang.String str58 = entities0.entityName((int) (short) 1);
        entities0.addEntity("hi!", (int) (byte) 1);
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
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "nbsp" });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 160 });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.growBy = (byte) 0;
        int int7 = binaryEntityMap1.value("");
        int[] intArray8 = binaryEntityMap1.values;
        binaryEntityMap1.add("hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        int int15 = binaryEntityMap1.size;
        int int16 = binaryEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap5.ensureCapacity(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray12 = new int[] { ' ', '4' };
        binaryEntityMap9.values = intArray12;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray16 = arrayEntityMap15.values;
        java.lang.String str18 = arrayEntityMap15.name((int) (short) 100);
        int[] intArray21 = new int[] { (short) -1, 10 };
        arrayEntityMap15.values = intArray21;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        arrayEntityMap15.names = strArray24;
        binaryEntityMap9.names = strArray24;
        java.lang.String[] strArray27 = binaryEntityMap9.names;
        binaryEntityMap9.add("", 10);
        binaryEntityMap9.ensureCapacity(10);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "" };
        binaryEntityMap9.names = strArray35;
        binaryEntityMap5.names = strArray35;
        arrayEntityMap1.names = strArray35;
        arrayEntityMap1.add("hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0 });
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        int int11 = lookupEntityMap0.value("");
        java.lang.String str13 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", (int) 'a');
        java.lang.String str18 = lookupEntityMap0.name(52);
        lookupEntityMap0.add("", (int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entityMap7);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        entities0.addEntity("", 35);
        java.lang.String str26 = entities0.entityName((int) (byte) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.size = '#';
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray10 = arrayEntityMap9.values;
        java.lang.String str12 = arrayEntityMap9.name((int) (short) 100);
        int int14 = arrayEntityMap9.value("hi!");
        arrayEntityMap9.size = (byte) 0;
        int int17 = arrayEntityMap9.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap19.add("hi!", 0);
        arrayEntityMap19.size = (byte) 1;
        int[] intArray25 = new int[] {};
        arrayEntityMap19.values = intArray25;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap28 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int30 = arrayEntityMap28.value("");
        java.lang.String[] strArray31 = arrayEntityMap28.names;
        arrayEntityMap19.names = strArray31;
        arrayEntityMap9.names = strArray31;
        binaryEntityMap1.names = strArray31;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 35 out of bounds for object array[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { null });
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = hashEntityMap0.name(100);
        java.lang.String str10 = hashEntityMap0.name(2);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = null;
        hashEntityMap11.mapNameToValue = map12;
        java.lang.String str15 = hashEntityMap11.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map17 = null;
        hashEntityMap16.mapNameToValue = map17;
        java.lang.String str20 = hashEntityMap16.name((int) '4');
        java.lang.String str22 = hashEntityMap16.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = null;
        hashEntityMap23.mapNameToValue = map24;
        java.util.Map map26 = null;
        hashEntityMap23.mapNameToValue = map26;
        java.util.Map map28 = null;
        hashEntityMap23.mapNameToValue = map28;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = null;
        hashEntityMap30.mapNameToValue = map31;
        java.util.Map map33 = null;
        hashEntityMap30.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap30.mapNameToValue = map35;
        java.util.Map map37 = hashEntityMap30.mapValueToName;
        hashEntityMap23.mapNameToValue = map37;
        hashEntityMap16.mapValueToName = map37;
        hashEntityMap11.mapValueToName = map37;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = null;
        hashEntityMap41.mapNameToValue = map42;
        java.util.Map map44 = null;
        hashEntityMap41.mapNameToValue = map44;
        java.util.Map map46 = null;
        hashEntityMap41.mapNameToValue = map46;
        java.util.Map map48 = hashEntityMap41.mapValueToName;
        java.util.Map map49 = hashEntityMap41.mapNameToValue;
        java.util.Map map50 = hashEntityMap41.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int53 = hashEntityMap51.value("");
        java.util.Map map54 = hashEntityMap51.mapValueToName;
        hashEntityMap41.mapValueToName = map54;
        hashEntityMap11.mapNameToValue = map54;
        int int58 = hashEntityMap11.value("hi!");
        hashEntityMap11.add("hi!", (int) (short) 1);
        hashEntityMap11.add("", (int) 'a');
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap65 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap66 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map67 = null;
        hashEntityMap66.mapNameToValue = map67;
        java.util.Map map69 = null;
        hashEntityMap66.mapNameToValue = map69;
        java.util.Map map71 = null;
        hashEntityMap66.mapNameToValue = map71;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap73 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map74 = null;
        hashEntityMap73.mapNameToValue = map74;
        java.util.Map map76 = null;
        hashEntityMap73.mapNameToValue = map76;
        java.util.Map map78 = null;
        hashEntityMap73.mapNameToValue = map78;
        java.util.Map map80 = hashEntityMap73.mapValueToName;
        hashEntityMap66.mapNameToValue = map80;
        treeEntityMap65.mapValueToName = map80;
        treeEntityMap65.add("", 35);
        treeEntityMap65.add("hi!", (int) (byte) 100);
        java.util.Map map89 = treeEntityMap65.mapValueToName;
        hashEntityMap11.mapNameToValue = map89;
        hashEntityMap0.mapValueToName = map89;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        java.lang.String str4 = entities0.escape("hi!");
        int int6 = entities0.entityValue("hi!");
        java.lang.String str8 = entities0.entityName(1);
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(32);
        int[] intArray2 = arrayEntityMap1.values;
        int int4 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        int[] intArray7 = new int[] {};
        arrayEntityMap1.values = intArray7;
        int int10 = arrayEntityMap1.value("");
        java.lang.String[] strArray11 = arrayEntityMap1.names;
        arrayEntityMap1.ensureCapacity((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.util.Map map10 = hashEntityMap7.mapNameToValue;
        java.util.Map map11 = hashEntityMap7.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.lang.String str16 = hashEntityMap12.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.lang.String str21 = hashEntityMap17.name((int) '4');
        java.lang.String str23 = hashEntityMap17.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.util.Map map27 = null;
        hashEntityMap24.mapNameToValue = map27;
        java.util.Map map29 = null;
        hashEntityMap24.mapNameToValue = map29;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap31.mapNameToValue = map34;
        java.util.Map map36 = null;
        hashEntityMap31.mapNameToValue = map36;
        java.util.Map map38 = hashEntityMap31.mapValueToName;
        hashEntityMap24.mapNameToValue = map38;
        hashEntityMap17.mapValueToName = map38;
        hashEntityMap12.mapValueToName = map38;
        hashEntityMap7.mapNameToValue = map38;
        java.util.Map map43 = hashEntityMap7.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map45 = null;
        hashEntityMap44.mapNameToValue = map45;
        java.lang.String str48 = hashEntityMap44.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map50 = null;
        hashEntityMap49.mapNameToValue = map50;
        java.util.Map map52 = null;
        hashEntityMap49.mapNameToValue = map52;
        java.util.Map map54 = null;
        hashEntityMap49.mapNameToValue = map54;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map57 = null;
        hashEntityMap56.mapNameToValue = map57;
        java.util.Map map59 = null;
        hashEntityMap56.mapNameToValue = map59;
        java.util.Map map61 = null;
        hashEntityMap56.mapNameToValue = map61;
        java.util.Map map63 = hashEntityMap56.mapValueToName;
        hashEntityMap49.mapNameToValue = map63;
        hashEntityMap44.mapNameToValue = map63;
        java.util.Map map66 = hashEntityMap44.mapValueToName;
        hashEntityMap7.mapValueToName = map66;
        hashEntityMap0.mapNameToValue = map66;
        java.lang.String str70 = hashEntityMap0.name(0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        arrayEntityMap1.add("hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass33 = arrayEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        java.lang.String[] strArray30 = arrayEntityMap1.names;
        arrayEntityMap1.growBy = (byte) 100;
        java.lang.String[] strArray33 = arrayEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        int int4 = binaryEntityMap1.growBy;
        java.lang.String[] strArray5 = binaryEntityMap1.names;
        binaryEntityMap1.ensureCapacity(97);
        binaryEntityMap1.ensureCapacity((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap5.growBy = 0;
        arrayEntityMap5.add("hi!", 0);
        int int11 = arrayEntityMap5.size;
        arrayEntityMap5.growBy = 0;
        int int14 = arrayEntityMap5.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray17 = arrayEntityMap16.values;
        int int18 = arrayEntityMap16.growBy;
        arrayEntityMap16.size = 100;
        arrayEntityMap16.growBy = (byte) 100;
        arrayEntityMap16.growBy = (short) 1;
        int[] intArray25 = arrayEntityMap16.values;
        arrayEntityMap5.values = intArray25;
        int int28 = arrayEntityMap5.value("");
        entities0.map = arrayEntityMap5;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap31 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int33 = arrayEntityMap31.value("hi!");
        arrayEntityMap31.size = (short) 1;
        arrayEntityMap31.add("hi!", 1);
        entities0.map = arrayEntityMap31;
        entities0.addEntity("", (int) ' ');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.entityName((int) (short) -1);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int8 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        java.lang.String[] strArray26 = binaryEntityMap1.names;
        java.lang.Class<?> wildcardClass27 = binaryEntityMap1.getClass();
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
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        java.lang.String str70 = arrayEntityMap1.name((int) (short) 10);
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
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.entityName((int) (short) 0);
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        int int13 = entities0.entityValue("hi!");
        entities0.addEntity("hi!", 10);
        java.lang.String str18 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities0.map;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(entityMap19);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        binaryEntityMap1.ensureCapacity(97);
        binaryEntityMap1.add("", 1);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray7 = new int[] { (short) -1, 10 };
        arrayEntityMap1.values = intArray7;
        java.lang.String str10 = arrayEntityMap1.name((int) (short) 10);
        int int11 = arrayEntityMap1.size;
        arrayEntityMap1.growBy = 2;
        int int14 = arrayEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 10 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap0 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapValueToName;
        java.util.Map map9 = null;
        hashEntityMap7.mapNameToValue = map9;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.lang.String str16 = hashEntityMap12.name((int) '4');
        java.util.Map map17 = hashEntityMap12.mapValueToName;
        hashEntityMap11.mapValueToName = map17;
        hashEntityMap7.mapNameToValue = map17;
        hashEntityMap1.mapNameToValue = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int23 = hashEntityMap21.value("");
        java.util.Map map24 = hashEntityMap21.mapValueToName;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap25 = new org.apache.commons.lang.Entities.TreeEntityMap();
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
        treeEntityMap25.mapValueToName = map40;
        hashEntityMap21.mapValueToName = map40;
        hashEntityMap1.mapValueToName = map40;
        treeEntityMap0.mapNameToValue = map40;
        int int47 = treeEntityMap0.value("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str6 = binaryEntityMap4.name((-1));
        entities0.map = binaryEntityMap4;
        entities0.addEntity("", 2);
        java.lang.String str12 = entities0.escape("hi!");
        entities0.addEntity("", 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.size = (byte) 0;
        java.lang.String[] strArray4 = arrayEntityMap1.names;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null });
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) '4');
        int int7 = entities0.entityValue("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 3 out of bounds for int[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        java.lang.String str22 = hashEntityMap0.name((int) (short) 10);
        hashEntityMap0.add("", 1);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        java.util.Map map18 = treeEntityMap0.mapValueToName;
        java.lang.Class<?> wildcardClass19 = treeEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = null;
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name(0);
        java.lang.String str8 = binaryEntityMap0.name((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int10 = binaryEntityMap1.value("hi!");
        java.lang.String[] strArray11 = binaryEntityMap1.names;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap41 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray44 = new int[] { ' ', '4' };
        binaryEntityMap41.values = intArray44;
        int int47 = binaryEntityMap41.value("");
        java.lang.String[] strArray48 = binaryEntityMap41.names;
        binaryEntityMap41.growBy = (byte) -1;
        entities0.map = binaryEntityMap41;
        int int52 = binaryEntityMap41.size;
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
        org.junit.Assert.assertNotNull(intArray44);
// flaky "1) test2071(org.apache.commons.lang.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray44, new int[] { 34, 38 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(52);
        java.lang.String str10 = lookupEntityMap0.name(1);
        java.lang.String str12 = lookupEntityMap0.name((int) '#');
        java.lang.String str14 = lookupEntityMap0.name(35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 34, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("hi!", (int) (short) 0);
        java.lang.String[] strArray7 = binaryEntityMap1.names;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        java.lang.String str11 = binaryEntityMap1.name((int) (byte) 10);
        java.lang.String str13 = binaryEntityMap1.name(10);
        binaryEntityMap1.growBy = ' ';
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.io.Writer writer2 = null;
        entities0.escape(writer2, "");
        java.io.Writer writer5 = null;
        entities0.escape(writer5, "");
        java.io.Writer writer8 = null;
        entities0.escape(writer8, "");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        java.lang.String str13 = entities0.entityName((int) (byte) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        int int13 = lookupEntityMap0.value("");
        int int15 = lookupEntityMap0.value("hi!");
        int int17 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (int) ' ');
        java.lang.String str22 = lookupEntityMap0.name((int) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.lang.String str2 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray7 = new int[] { ' ', '4' };
        binaryEntityMap4.values = intArray7;
        java.lang.String str10 = binaryEntityMap4.name((int) (byte) 100);
        binaryEntityMap4.add("hi!", (-1));
        java.lang.String str15 = binaryEntityMap4.name(0);
        entities0.map = binaryEntityMap4;
        binaryEntityMap4.add("", (int) (short) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap21.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray28 = new int[] { ' ', '4' };
        binaryEntityMap25.values = intArray28;
        arrayEntityMap21.values = intArray28;
        int int31 = arrayEntityMap21.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap33 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray34 = arrayEntityMap33.values;
        arrayEntityMap33.add("hi!", (int) (byte) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray40 = arrayEntityMap39.values;
        int int41 = arrayEntityMap39.growBy;
        arrayEntityMap39.add("", (int) (byte) 10);
        int[] intArray45 = arrayEntityMap39.values;
        arrayEntityMap33.values = intArray45;
        arrayEntityMap21.values = intArray45;
        binaryEntityMap4.values = intArray45;
        java.lang.String str50 = binaryEntityMap4.name((int) (byte) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 1 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 10 });
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.String[][] strArray8 = new java.lang.String[][] { strArray5, strArray7 };
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntities(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(32);
        binaryEntityMap1.add("hi!", (-1));
        binaryEntityMap1.add("hi!", (int) 'a');
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        java.lang.String str8 = hashEntityMap0.name((int) (short) 0);
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        java.lang.String[] strArray38 = binaryEntityMap20.names;
        binaryEntityMap1.names = strArray38;
        binaryEntityMap1.add("", (-1));
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap44 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray47 = new int[] { ' ', '4' };
        binaryEntityMap44.values = intArray47;
        java.lang.String str50 = binaryEntityMap44.name((int) (byte) 100);
        binaryEntityMap44.add("hi!", (-1));
        java.lang.String str55 = binaryEntityMap44.name(0);
        java.lang.String str57 = binaryEntityMap44.name(10);
        binaryEntityMap44.growBy = 100;
        java.lang.String[] strArray60 = binaryEntityMap44.names;
        binaryEntityMap1.names = strArray60;
        java.lang.String[] strArray62 = binaryEntityMap1.names;
        int int63 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 0 });
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 32 + "'", int63 == 32);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = (-1);
        arrayEntityMap1.size = 10;
        java.lang.String str12 = arrayEntityMap1.name(100);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str34 = binaryEntityMap32.name((-1));
        int[] intArray35 = binaryEntityMap32.values;
        arrayEntityMap1.values = intArray35;
        java.lang.String str38 = arrayEntityMap1.name((int) (short) -1);
        int int39 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        int int7 = binaryEntityMap1.size;
        int int8 = binaryEntityMap1.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray13 = new int[] { ' ', '4' };
        binaryEntityMap10.values = intArray13;
        int int16 = binaryEntityMap10.value("");
        int int18 = binaryEntityMap10.value("");
        org.apache.commons.lang.Entities entities19 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap20 = entities19.map;
        org.apache.commons.lang.Entities.EntityMap entityMap21 = entities19.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap23.add("hi!", 0);
        arrayEntityMap23.size = (byte) 1;
        arrayEntityMap23.growBy = 100;
        java.lang.String str32 = arrayEntityMap23.name((int) (byte) 1);
        entities19.map = arrayEntityMap23;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap35 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray36 = arrayEntityMap35.values;
        java.lang.String str38 = arrayEntityMap35.name((int) (short) 100);
        int int40 = arrayEntityMap35.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap42 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap42.add("hi!", 0);
        arrayEntityMap42.size = (byte) 1;
        int[] intArray48 = new int[] {};
        arrayEntityMap42.values = intArray48;
        arrayEntityMap35.values = intArray48;
        arrayEntityMap23.values = intArray48;
        binaryEntityMap10.values = intArray48;
        binaryEntityMap1.values = intArray48;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(entities19);
        org.junit.Assert.assertNotNull(entityMap20);
        org.junit.Assert.assertNotNull(entityMap21);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0 });
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] {});
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        java.lang.String str22 = treeEntityMap0.name(35);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        arrayEntityMap8.add("hi!", 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray27 = new int[] { ' ', '4' };
        binaryEntityMap24.values = intArray27;
        binaryEntityMap24.size = '#';
        int[] intArray31 = binaryEntityMap24.values;
        arrayEntityMap8.values = intArray31;
        int int33 = arrayEntityMap8.size;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        int int31 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("hi!", (int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int9 = arrayEntityMap8.size;
        int int10 = arrayEntityMap8.growBy;
        java.lang.String str12 = arrayEntityMap8.name((int) (short) 100);
        int int14 = arrayEntityMap8.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap16.add("hi!", 0);
        arrayEntityMap16.size = (byte) 1;
        arrayEntityMap16.growBy = 100;
        java.lang.String[] strArray24 = arrayEntityMap16.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap26.add("hi!", 0);
        arrayEntityMap26.size = (byte) 1;
        arrayEntityMap26.growBy = 100;
        java.lang.String[] strArray34 = arrayEntityMap26.names;
        arrayEntityMap16.names = strArray34;
        arrayEntityMap8.names = strArray34;
        arrayEntityMap8.growBy = (byte) 1;
        int[] intArray39 = arrayEntityMap8.values;
        binaryEntityMap1.values = intArray39;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(intArray39);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 100);
        int int2 = binaryEntityMap1.growBy;
        binaryEntityMap1.ensureCapacity(0);
        java.lang.String str6 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name((int) '4');
        int int12 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        java.util.Map map37 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = null;
        hashEntityMap38.mapNameToValue = map39;
        java.lang.String str42 = hashEntityMap38.name((int) '4');
        java.lang.String str44 = hashEntityMap38.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = null;
        hashEntityMap45.mapNameToValue = map46;
        java.util.Map map48 = null;
        hashEntityMap45.mapNameToValue = map48;
        java.util.Map map50 = null;
        hashEntityMap45.mapNameToValue = map50;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = null;
        hashEntityMap52.mapNameToValue = map53;
        java.util.Map map55 = null;
        hashEntityMap52.mapNameToValue = map55;
        java.util.Map map57 = null;
        hashEntityMap52.mapNameToValue = map57;
        java.util.Map map59 = hashEntityMap52.mapValueToName;
        hashEntityMap45.mapNameToValue = map59;
        hashEntityMap38.mapValueToName = map59;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map63 = null;
        hashEntityMap62.mapNameToValue = map63;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap66 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map67 = null;
        hashEntityMap66.mapNameToValue = map67;
        java.lang.String str70 = hashEntityMap66.name((int) '4');
        java.util.Map map71 = hashEntityMap66.mapValueToName;
        hashEntityMap65.mapValueToName = map71;
        hashEntityMap62.mapValueToName = map71;
        hashEntityMap38.mapNameToValue = map71;
        hashEntityMap0.mapValueToName = map71;
        hashEntityMap0.add("hi!", 1);
        hashEntityMap0.add("", (int) '4');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int5 = arrayEntityMap3.value("hi!");
        arrayEntityMap3.size = (byte) 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str11 = binaryEntityMap9.name((int) '#');
        int[] intArray12 = binaryEntityMap9.values;
        arrayEntityMap3.values = intArray12;
        arrayEntityMap1.values = intArray12;
        int int16 = arrayEntityMap1.value("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", (int) (short) 10);
        int int12 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        java.lang.String str10 = hashEntityMap0.name(0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hashEntityMap0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        int int13 = lookupEntityMap0.value("hi!");
        java.lang.String str15 = lookupEntityMap0.name(35);
        lookupEntityMap0.add("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        int int5 = arrayEntityMap1.size;
        java.lang.String str7 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.add("hi!", 32);
        int int11 = arrayEntityMap1.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap13 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray14 = arrayEntityMap13.values;
        java.lang.String str16 = arrayEntityMap13.name((int) (short) 100);
        arrayEntityMap13.size = (byte) 0;
        int int19 = arrayEntityMap13.size;
        arrayEntityMap13.add("hi!", 35);
        java.lang.String[] strArray23 = arrayEntityMap13.names;
        arrayEntityMap1.names = strArray23;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 35 });
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        java.lang.String str25 = entities0.entityName(35);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray30 = new int[] { ' ', '4' };
        binaryEntityMap27.values = intArray30;
        java.lang.String str33 = binaryEntityMap27.name((int) (byte) 100);
        binaryEntityMap27.add("hi!", (-1));
        java.lang.String str38 = binaryEntityMap27.name((int) (short) 100);
        int int40 = binaryEntityMap27.value("hi!");
        java.lang.String str42 = binaryEntityMap27.name((int) ' ');
        entities0.map = binaryEntityMap27;
        java.lang.Class<?> wildcardClass44 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(entityMap23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
            entities0.unescape(writer18, "hi!");
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
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("hi!", (int) '#');
        java.lang.String str16 = lookupEntityMap0.name((int) ' ');
        java.lang.String str18 = lookupEntityMap0.name((int) (byte) 10);
        int int20 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String[] strArray13 = binaryEntityMap1.names;
        binaryEntityMap1.ensureCapacity(97);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        hashEntityMap0.add("", (int) (short) 0);
        java.lang.String str24 = hashEntityMap0.name(1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = null;
        hashEntityMap25.mapNameToValue = map26;
        java.lang.String str29 = hashEntityMap25.name((int) '4');
        java.lang.String str31 = hashEntityMap25.name((int) (short) 100);
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
        hashEntityMap25.mapValueToName = map46;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map50 = null;
        hashEntityMap49.mapNameToValue = map50;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = null;
        hashEntityMap53.mapNameToValue = map54;
        java.lang.String str57 = hashEntityMap53.name((int) '4');
        java.util.Map map58 = hashEntityMap53.mapValueToName;
        hashEntityMap52.mapValueToName = map58;
        hashEntityMap49.mapValueToName = map58;
        hashEntityMap25.mapNameToValue = map58;
        int int63 = hashEntityMap25.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map65 = null;
        hashEntityMap64.mapNameToValue = map65;
        java.util.Map map67 = null;
        hashEntityMap64.mapNameToValue = map67;
        java.util.Map map69 = null;
        hashEntityMap64.mapNameToValue = map69;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap71 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map72 = null;
        hashEntityMap71.mapNameToValue = map72;
        java.util.Map map74 = null;
        hashEntityMap71.mapNameToValue = map74;
        java.util.Map map76 = null;
        hashEntityMap71.mapNameToValue = map76;
        java.util.Map map78 = hashEntityMap71.mapValueToName;
        hashEntityMap64.mapNameToValue = map78;
        java.util.Map map80 = hashEntityMap64.mapValueToName;
        java.util.Map map81 = hashEntityMap64.mapNameToValue;
        hashEntityMap25.mapNameToValue = map81;
        hashEntityMap0.mapNameToValue = map81;
        int int85 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int27 = arrayEntityMap25.value("");
        java.lang.String[] strArray28 = arrayEntityMap25.names;
        int[] intArray29 = arrayEntityMap25.values;
        binaryEntityMap1.values = intArray29;
        java.lang.String str32 = binaryEntityMap1.name((int) (short) -1);
        int int33 = binaryEntityMap1.growBy;
        binaryEntityMap1.growBy = '4';
        java.lang.String str37 = binaryEntityMap1.name((int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap39 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray42 = new int[] { ' ', '4' };
        binaryEntityMap39.values = intArray42;
        int int45 = binaryEntityMap39.value("");
        int int47 = binaryEntityMap39.value("");
        binaryEntityMap39.add("hi!", 35);
        java.lang.String str52 = binaryEntityMap39.name((int) (short) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap54 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap54.growBy = (-1);
        arrayEntityMap54.ensureCapacity((int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap60 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray61 = arrayEntityMap60.values;
        java.lang.String str63 = arrayEntityMap60.name((int) (short) 100);
        int[] intArray66 = new int[] { (short) -1, 10 };
        arrayEntityMap60.values = intArray66;
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!" };
        arrayEntityMap60.names = strArray69;
        int[] intArray71 = arrayEntityMap60.values;
        arrayEntityMap54.values = intArray71;
        binaryEntityMap39.values = intArray71;
        binaryEntityMap1.values = intArray71;
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 0 });
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 0 });
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { (-1), 10 });
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.ensureCapacity((int) (byte) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray10 = new int[] { ' ', '4' };
        binaryEntityMap7.values = intArray10;
        binaryEntityMap7.growBy = (byte) -1;
        binaryEntityMap7.growBy = 'a';
        binaryEntityMap7.size = (byte) 0;
        java.lang.String str19 = binaryEntityMap7.name(2);
        java.lang.String[] strArray20 = binaryEntityMap7.names;
        java.lang.String[] strArray21 = binaryEntityMap7.names;
        binaryEntityMap1.names = strArray21;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) '4');
        java.lang.String str7 = entities0.entityName((int) (short) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray12 = new int[] { ' ', '4' };
        binaryEntityMap9.values = intArray12;
        java.lang.String str15 = binaryEntityMap9.name((int) (byte) 100);
        binaryEntityMap9.add("", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap20 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap20.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray27 = new int[] { ' ', '4' };
        binaryEntityMap24.values = intArray27;
        arrayEntityMap20.values = intArray27;
        int int30 = arrayEntityMap20.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap32 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray33 = arrayEntityMap32.values;
        arrayEntityMap32.add("hi!", (int) (byte) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap38 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray39 = arrayEntityMap38.values;
        int int40 = arrayEntityMap38.growBy;
        arrayEntityMap38.add("", (int) (byte) 10);
        int[] intArray44 = arrayEntityMap38.values;
        arrayEntityMap32.values = intArray44;
        arrayEntityMap20.values = intArray44;
        binaryEntityMap9.values = intArray44;
        entities0.map = binaryEntityMap9;
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 2 out of bounds for int[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 10 });
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(10);
        java.lang.String str4 = lookupEntityMap0.name(0);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '#');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap3.add("hi!", 0);
        arrayEntityMap3.size = (byte) 1;
        int[] intArray9 = new int[] {};
        arrayEntityMap3.values = intArray9;
        int int12 = arrayEntityMap3.value("");
        java.lang.String[] strArray13 = arrayEntityMap3.names;
        binaryEntityMap1.names = strArray13;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray17 = arrayEntityMap16.values;
        int int18 = arrayEntityMap16.growBy;
        arrayEntityMap16.add("", (int) (byte) 10);
        int[] intArray22 = arrayEntityMap16.values;
        int[] intArray23 = arrayEntityMap16.values;
        binaryEntityMap1.values = intArray23;
        int int25 = binaryEntityMap1.size;
        binaryEntityMap1.ensureCapacity((int) (short) -1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        java.lang.String str22 = entities0.unescape("hi!");
        entities0.addEntity("", 2);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap3 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map4 = null;
        hashEntityMap3.mapNameToValue = map4;
        java.lang.String str7 = hashEntityMap3.name((int) '4');
        java.lang.String str9 = hashEntityMap3.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = null;
        hashEntityMap10.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap10.mapNameToValue = map13;
        java.util.Map map15 = null;
        hashEntityMap10.mapNameToValue = map15;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.util.Map map20 = null;
        hashEntityMap17.mapNameToValue = map20;
        java.util.Map map22 = null;
        hashEntityMap17.mapNameToValue = map22;
        java.util.Map map24 = hashEntityMap17.mapValueToName;
        hashEntityMap10.mapNameToValue = map24;
        hashEntityMap3.mapValueToName = map24;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = null;
        hashEntityMap27.mapNameToValue = map28;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        java.lang.String str35 = hashEntityMap31.name((int) '4');
        java.util.Map map36 = hashEntityMap31.mapValueToName;
        hashEntityMap30.mapValueToName = map36;
        hashEntityMap27.mapValueToName = map36;
        hashEntityMap3.mapNameToValue = map36;
        hashEntityMap0.mapNameToValue = map36;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = binaryEntityMap0.values;
        int[] intArray2 = binaryEntityMap0.values;
        int[] intArray3 = binaryEntityMap0.values;
        int[] intArray4 = binaryEntityMap0.values;
        binaryEntityMap0.add("hi!", 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        int int6 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray9 = arrayEntityMap8.values;
        int int10 = arrayEntityMap8.growBy;
        arrayEntityMap8.add("", (int) (byte) 10);
        int[] intArray14 = arrayEntityMap8.values;
        arrayEntityMap1.values = intArray14;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 10 });
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(52);
        int int10 = lookupEntityMap0.value("");
        java.lang.String str12 = lookupEntityMap0.name((int) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray9 = arrayEntityMap8.values;
        int int10 = arrayEntityMap8.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap12.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray19 = new int[] { ' ', '4' };
        binaryEntityMap16.values = intArray19;
        arrayEntityMap12.values = intArray19;
        arrayEntityMap8.values = intArray19;
        arrayEntityMap8.add("hi!", (int) (byte) 0);
        arrayEntityMap8.ensureCapacity(1);
        arrayEntityMap8.add("hi!", (int) (byte) 10);
        org.apache.commons.lang.Entities entities31 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str33 = entities31.entityName((int) '#');
        entities31.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap37 = entities31.map;
        java.io.Writer writer38 = null;
        entities31.escape(writer38, "");
        java.lang.String str42 = entities31.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap43 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray44 = null;
        binaryEntityMap43.values = intArray44;
        java.lang.String str47 = binaryEntityMap43.name((-1));
        entities31.map = binaryEntityMap43;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap50 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int52 = arrayEntityMap50.value("hi!");
        int int53 = arrayEntityMap50.growBy;
        int int54 = arrayEntityMap50.size;
        java.lang.String[] strArray55 = null;
        arrayEntityMap50.names = strArray55;
        int[] intArray57 = arrayEntityMap50.values;
        binaryEntityMap43.values = intArray57;
        java.lang.String[] strArray59 = binaryEntityMap43.names;
        arrayEntityMap8.names = strArray59;
        binaryEntityMap1.names = strArray59;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, 52 });
        org.junit.Assert.assertNotNull(entities31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(entityMap37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(intArray57);
// flaky "2) test2114(org.apache.commons.lang.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray57, new int[] { 32 });
        org.junit.Assert.assertNotNull(strArray59);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        arrayEntityMap1.add("", (int) (byte) 10);
        int[] intArray7 = arrayEntityMap1.values;
        arrayEntityMap1.size = (byte) -1;
        int int11 = arrayEntityMap1.value("");
        int[] intArray12 = arrayEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 10 });
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        binaryEntityMap1.add("", (int) (byte) 1);
        int[] intArray12 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap1.values = intArray12;
        binaryEntityMap1.add("", 0);
        java.lang.String[] strArray17 = binaryEntityMap1.names;
        int int18 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 1, 32 });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("hi!", (int) (byte) 1);
        java.lang.String str19 = lookupEntityMap0.name((int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name(100);
        binaryEntityMap0.growBy = (byte) -1;
        int int5 = binaryEntityMap0.growBy;
        java.lang.String[] strArray6 = binaryEntityMap0.names;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        java.lang.String str13 = lookupEntityMap0.name((int) ' ');
        int int15 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        int int10 = binaryEntityMap1.value("");
        binaryEntityMap1.ensureCapacity(100);
        java.lang.String str14 = binaryEntityMap1.name((-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        entities0.addEntity("hi!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 1);
        binaryEntityMap1.ensureCapacity((int) 'a');
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        int int82 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer84 = null;
        entities0.escape(writer84, "");
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
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 35 + "'", int82 == 35);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        binaryEntityMap1.growBy = 100;
        java.lang.String[] strArray17 = binaryEntityMap1.names;
        binaryEntityMap1.ensureCapacity((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) '4');
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap6 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str8 = lookupEntityMap6.name(0);
        java.lang.String str10 = lookupEntityMap6.name(0);
        int int12 = lookupEntityMap6.value("");
        entities0.map = lookupEntityMap6;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap14 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str16 = lookupEntityMap14.name(0);
        java.lang.String str18 = lookupEntityMap14.name((int) (byte) 100);
        java.lang.String str20 = lookupEntityMap14.name(100);
        int int22 = lookupEntityMap14.value("hi!");
        java.lang.String str24 = lookupEntityMap14.name((int) (byte) 1);
        java.lang.String str26 = lookupEntityMap14.name(35);
        int int28 = lookupEntityMap14.value("hi!");
        entities0.map = lookupEntityMap14;
        java.lang.String str31 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        int int30 = arrayEntityMap1.growBy;
        int[] intArray31 = arrayEntityMap1.values;
        int[] intArray32 = arrayEntityMap1.values;
        int int33 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int27 = arrayEntityMap25.value("");
        java.lang.String[] strArray28 = arrayEntityMap25.names;
        int[] intArray29 = arrayEntityMap25.values;
        binaryEntityMap1.values = intArray29;
        java.lang.String str32 = binaryEntityMap1.name((int) (short) -1);
        java.lang.String str34 = binaryEntityMap1.name(35);
        binaryEntityMap1.add("", (int) (short) -1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1) });
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int7 = arrayEntityMap5.value("");
        java.lang.String[] strArray8 = arrayEntityMap5.names;
        entities0.map = arrayEntityMap5;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str12 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "quot" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        java.lang.String str22 = hashEntityMap0.name((int) (byte) 10);
        java.lang.String str24 = hashEntityMap0.name(0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        int int9 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", 35);
        int int13 = binaryEntityMap1.size;
        binaryEntityMap1.add("hi!", 2);
        java.lang.String str18 = binaryEntityMap1.name((-1));
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap20.ensureCapacity(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray27 = new int[] { ' ', '4' };
        binaryEntityMap24.values = intArray27;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap30 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray31 = arrayEntityMap30.values;
        java.lang.String str33 = arrayEntityMap30.name((int) (short) 100);
        int[] intArray36 = new int[] { (short) -1, 10 };
        arrayEntityMap30.values = intArray36;
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        arrayEntityMap30.names = strArray39;
        binaryEntityMap24.names = strArray39;
        java.lang.String[] strArray42 = binaryEntityMap24.names;
        binaryEntityMap24.add("", 10);
        binaryEntityMap24.ensureCapacity(10);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "" };
        binaryEntityMap24.names = strArray50;
        binaryEntityMap20.names = strArray50;
        binaryEntityMap1.names = strArray50;
        binaryEntityMap1.add("", 52);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 2, 35 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 0 });
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        int[] intArray4 = binaryEntityMap1.values;
        int int6 = binaryEntityMap1.value("");
        int int7 = binaryEntityMap1.size;
        int int9 = binaryEntityMap1.value("hi!");
        java.lang.String str11 = binaryEntityMap1.name((int) 'a');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        int int4 = binaryEntityMap1.growBy;
        binaryEntityMap1.growBy = 0;
        java.lang.String str8 = binaryEntityMap1.name((int) '#');
        java.lang.String[] strArray9 = binaryEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map17 = null;
        hashEntityMap16.mapNameToValue = map17;
        java.lang.String str20 = hashEntityMap16.name((int) '4');
        java.lang.String str22 = hashEntityMap16.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = null;
        hashEntityMap23.mapNameToValue = map24;
        java.util.Map map26 = null;
        hashEntityMap23.mapNameToValue = map26;
        java.util.Map map28 = null;
        hashEntityMap23.mapNameToValue = map28;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = null;
        hashEntityMap30.mapNameToValue = map31;
        java.util.Map map33 = null;
        hashEntityMap30.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap30.mapNameToValue = map35;
        java.util.Map map37 = hashEntityMap30.mapValueToName;
        hashEntityMap23.mapNameToValue = map37;
        hashEntityMap16.mapValueToName = map37;
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
        hashEntityMap16.mapValueToName = map61;
        hashEntityMap0.mapNameToValue = map61;
        hashEntityMap0.add("", 0);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("");
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        arrayEntityMap1.add("", (int) (byte) 10);
        int[] intArray7 = arrayEntityMap1.values;
        int[] intArray8 = arrayEntityMap1.values;
        arrayEntityMap1.growBy = 0;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 10 });
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap0 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map1 = treeEntityMap0.mapValueToName;
        java.lang.Class<?> wildcardClass2 = treeEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        int int10 = entities0.entityValue("hi!");
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.entityName(0);
        java.lang.String str16 = entities0.unescape("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        int int9 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", 35);
        int int13 = binaryEntityMap1.size;
        binaryEntityMap1.add("hi!", 2);
        java.lang.String str18 = binaryEntityMap1.name((-1));
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap20.ensureCapacity(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray27 = new int[] { ' ', '4' };
        binaryEntityMap24.values = intArray27;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap30 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray31 = arrayEntityMap30.values;
        java.lang.String str33 = arrayEntityMap30.name((int) (short) 100);
        int[] intArray36 = new int[] { (short) -1, 10 };
        arrayEntityMap30.values = intArray36;
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        arrayEntityMap30.names = strArray39;
        binaryEntityMap24.names = strArray39;
        java.lang.String[] strArray42 = binaryEntityMap24.names;
        binaryEntityMap24.add("", 10);
        binaryEntityMap24.ensureCapacity(10);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "" };
        binaryEntityMap24.names = strArray50;
        binaryEntityMap20.names = strArray50;
        binaryEntityMap1.names = strArray50;
        int int54 = binaryEntityMap1.size;
        int int55 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 2, 35 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 0 });
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
// flaky "3) test2139(org.apache.commons.lang.RegressionTest4)":         entities0.addEntities(strArray3);
// flaky "1) test2139(org.apache.commons.lang.RegressionTest4)":         org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.entityName(2);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray10 = arrayEntityMap9.values;
        java.lang.String str12 = arrayEntityMap9.name((int) (short) 100);
        int int14 = arrayEntityMap9.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap16.add("hi!", 0);
        arrayEntityMap16.size = (byte) 1;
        int[] intArray22 = new int[] {};
        arrayEntityMap16.values = intArray22;
        arrayEntityMap9.values = intArray22;
        arrayEntityMap9.ensureCapacity((int) (short) 0);
        entities0.map = arrayEntityMap9;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
// flaky "1) test2139(org.apache.commons.lang.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] {});
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        java.lang.String str7 = entities0.unescape("");
        org.apache.commons.lang.Entities entities8 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities8.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap11.add("hi!", 0);
        arrayEntityMap11.size = (byte) 1;
        arrayEntityMap11.size = (-1);
        arrayEntityMap11.size = (byte) 10;
        entities8.map = arrayEntityMap11;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = null;
        hashEntityMap22.mapNameToValue = map23;
        java.lang.String str26 = hashEntityMap22.name((int) '4');
        java.util.Map map27 = hashEntityMap22.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapValueToName;
        java.util.Map map30 = null;
        hashEntityMap28.mapNameToValue = map30;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = null;
        hashEntityMap33.mapNameToValue = map34;
        java.lang.String str37 = hashEntityMap33.name((int) '4');
        java.util.Map map38 = hashEntityMap33.mapValueToName;
        hashEntityMap32.mapValueToName = map38;
        hashEntityMap28.mapNameToValue = map38;
        hashEntityMap22.mapNameToValue = map38;
        java.lang.String str43 = hashEntityMap22.name(2);
        java.lang.String str45 = hashEntityMap22.name((int) (byte) 10);
        entities8.map = hashEntityMap22;
        java.util.Map map47 = hashEntityMap22.mapValueToName;
        entities0.map = hashEntityMap22;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        int int11 = arrayEntityMap1.growBy;
        java.lang.String[] strArray12 = arrayEntityMap1.names;
        arrayEntityMap1.growBy = 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int17 = arrayEntityMap16.size;
        int int18 = arrayEntityMap16.growBy;
        java.lang.String str20 = arrayEntityMap16.name((int) (short) 100);
        int int21 = arrayEntityMap16.growBy;
        java.lang.String[] strArray22 = arrayEntityMap16.names;
        java.lang.String[] strArray23 = arrayEntityMap16.names;
        arrayEntityMap1.names = strArray23;
        int int26 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = 100;
        java.lang.String str10 = arrayEntityMap1.name((int) (byte) 1);
        arrayEntityMap1.add("", 32);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.growBy = (byte) -1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap9.add("hi!", 0);
        arrayEntityMap9.size = (byte) 1;
        arrayEntityMap9.size = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray21 = new int[] { ' ', '4' };
        binaryEntityMap18.values = intArray21;
        arrayEntityMap9.values = intArray21;
        binaryEntityMap1.values = intArray21;
        binaryEntityMap1.add("", (int) (short) -1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap29 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int31 = arrayEntityMap29.value("");
        arrayEntityMap29.size = (byte) 100;
        arrayEntityMap29.size = 100;
        arrayEntityMap29.ensureCapacity((int) (short) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray40 = arrayEntityMap39.values;
        int int41 = arrayEntityMap39.growBy;
        arrayEntityMap39.add("", (int) (byte) 10);
        int[] intArray45 = arrayEntityMap39.values;
        int[] intArray46 = arrayEntityMap39.values;
        arrayEntityMap29.values = intArray46;
        binaryEntityMap1.values = intArray46;
        int int50 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 52 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        int int4 = entities0.entityValue("hi!");
        java.lang.String str6 = entities0.escape("hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        java.util.Map map34 = hashEntityMap0.mapValueToName;
        java.lang.String str36 = hashEntityMap0.name((int) (byte) 100);
        java.util.Map map37 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = (byte) -1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap10.growBy = (-1);
        int[] intArray13 = arrayEntityMap10.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap15.add("hi!", 0);
        arrayEntityMap15.size = (byte) 1;
        arrayEntityMap15.growBy = 100;
        java.lang.String[] strArray23 = arrayEntityMap15.names;
        arrayEntityMap10.names = strArray23;
        arrayEntityMap1.names = strArray23;
        int int26 = arrayEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        arrayEntityMap1.add("hi!", (int) (byte) 10);
        java.lang.String str7 = arrayEntityMap1.name(100);
        java.lang.String[] strArray8 = arrayEntityMap1.names;
        arrayEntityMap1.growBy = (short) 100;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        java.lang.String str3 = arrayEntityMap1.name(10);
        java.lang.String str5 = arrayEntityMap1.name(100);
        arrayEntityMap1.ensureCapacity((int) 'a');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(10);
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str14 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("hi!", 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = lookupEntityMap0.name((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        int int32 = arrayEntityMap1.size;
        arrayEntityMap1.growBy = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.unescape("hi!");
        int int9 = entities0.entityValue("hi!");
        java.io.Writer writer10 = null;
        entities0.escape(writer10, "");
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(entityMap13);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name(100);
        binaryEntityMap0.growBy = (byte) -1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int8 = arrayEntityMap6.value("hi!");
        int int9 = arrayEntityMap6.growBy;
        int[] intArray10 = arrayEntityMap6.values;
        binaryEntityMap0.values = intArray10;
        int int13 = binaryEntityMap0.value("");
        binaryEntityMap0.add("hi!", 97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 97 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name(10);
        java.lang.String str12 = lookupEntityMap0.name(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        java.lang.String[] strArray4 = arrayEntityMap1.names;
        int[] intArray5 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap7.add("hi!", 0);
        java.lang.String str12 = arrayEntityMap7.name(0);
        int[] intArray13 = arrayEntityMap7.values;
        arrayEntityMap1.values = intArray13;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int18 = binaryEntityMap16.value("hi!");
        binaryEntityMap16.add("", 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int25 = binaryEntityMap23.value("hi!");
        binaryEntityMap23.add("", 0);
        java.lang.String str30 = binaryEntityMap23.name((int) '#');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray35 = new int[] { ' ', '4' };
        binaryEntityMap32.values = intArray35;
        binaryEntityMap23.values = intArray35;
        binaryEntityMap16.values = intArray35;
        arrayEntityMap1.values = intArray35;
        arrayEntityMap1.growBy = 10;
        java.lang.String[] strArray42 = arrayEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { null });
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        int int7 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 0);
        int int15 = binaryEntityMap1.size;
        int int17 = binaryEntityMap1.value("hi!");
        java.lang.String[] strArray18 = binaryEntityMap1.names;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = null;
        hashEntityMap32.mapNameToValue = map33;
        java.lang.String str36 = hashEntityMap32.name((int) '4');
        java.util.Map map37 = hashEntityMap32.mapValueToName;
        hashEntityMap31.mapValueToName = map37;
        java.util.Map map39 = hashEntityMap31.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = null;
        hashEntityMap41.mapNameToValue = map42;
        java.lang.String str45 = hashEntityMap41.name((int) '4');
        java.util.Map map46 = hashEntityMap41.mapValueToName;
        hashEntityMap40.mapValueToName = map46;
        java.util.Map map48 = hashEntityMap40.mapValueToName;
        hashEntityMap31.mapNameToValue = map48;
        java.util.Map map50 = hashEntityMap31.mapValueToName;
        hashEntityMap0.mapNameToValue = map50;
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = hashEntityMap46.mapValueToName;
        java.util.Map map48 = hashEntityMap46.mapNameToValue;
        int int50 = hashEntityMap46.value("");
        int int52 = hashEntityMap46.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = null;
        hashEntityMap53.mapNameToValue = map54;
        java.lang.String str57 = hashEntityMap53.name((int) '4');
        java.lang.String str59 = hashEntityMap53.name((int) (short) 100);
        java.util.Map map60 = hashEntityMap53.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map62 = null;
        hashEntityMap61.mapNameToValue = map62;
        java.util.Map map64 = null;
        hashEntityMap61.mapNameToValue = map64;
        java.util.Map map66 = null;
        hashEntityMap61.mapNameToValue = map66;
        java.util.Map map68 = hashEntityMap61.mapValueToName;
        hashEntityMap53.mapNameToValue = map68;
        hashEntityMap46.mapNameToValue = map68;
        hashEntityMap46.add("", (int) '#');
        hashEntityMap46.add("", (int) (byte) -1);
        java.util.Map map77 = hashEntityMap46.mapValueToName;
        hashEntityMap0.mapValueToName = map77;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(map60);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        entities0.addEntity("", (int) (short) 1);
        java.lang.String str7 = entities0.entityName((int) '#');
        int int9 = entities0.entityValue("hi!");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", 100);
        java.lang.String str7 = entities0.entityName((int) (byte) 100);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(10);
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str14 = lookupEntityMap0.name((int) '#');
        java.lang.String str16 = lookupEntityMap0.name(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        java.lang.String str5 = entities0.entityName(0);
        entities0.addEntity("hi!", 35);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.growBy = (byte) -1;
        binaryEntityMap1.add("hi!", (int) '4');
        binaryEntityMap1.add("", (int) (byte) 1);
        java.lang.String str15 = binaryEntityMap1.name((int) (byte) 100);
        int int16 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 52 });
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = (short) -1;
        binaryEntityMap1.add("hi!", 100);
        java.lang.String str15 = binaryEntityMap1.name((int) (byte) 10);
        int[] intArray16 = binaryEntityMap1.values;
        binaryEntityMap1.add("hi!", (int) 'a');
        binaryEntityMap1.add("hi!", 52);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '#');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap26.add("hi!", 0);
        arrayEntityMap26.size = (byte) 1;
        int[] intArray32 = new int[] {};
        arrayEntityMap26.values = intArray32;
        int int35 = arrayEntityMap26.value("");
        java.lang.String[] strArray36 = arrayEntityMap26.names;
        binaryEntityMap24.names = strArray36;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray40 = arrayEntityMap39.values;
        int int41 = arrayEntityMap39.growBy;
        arrayEntityMap39.add("", (int) (byte) 10);
        int[] intArray45 = arrayEntityMap39.values;
        int[] intArray46 = arrayEntityMap39.values;
        binaryEntityMap24.values = intArray46;
        binaryEntityMap1.values = intArray46;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 10 });
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap2 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        entities0.addEntity("", (int) (byte) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertNotNull(entityMap4);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        java.util.Map map32 = hashEntityMap0.mapValueToName;
        java.util.Map map33 = hashEntityMap0.mapNameToValue;
        java.lang.String str35 = hashEntityMap0.name(10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(map33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        java.lang.String str26 = binaryEntityMap1.name(1);
        int[] intArray27 = binaryEntityMap1.values;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        binaryEntityMap5.size = '#';
        int[] intArray12 = binaryEntityMap5.values;
        binaryEntityMap1.values = intArray12;
        binaryEntityMap1.add("hi!", (int) (short) 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 52 });
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        int int9 = hashEntityMap0.value("hi!");
        java.lang.String str11 = hashEntityMap0.name(1);
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap12 = new org.apache.commons.lang.Entities.TreeEntityMap();
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
        treeEntityMap12.mapValueToName = map27;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = null;
        hashEntityMap30.mapNameToValue = map31;
        java.lang.String str34 = hashEntityMap30.name((int) '4');
        java.lang.String str36 = hashEntityMap30.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = null;
        hashEntityMap37.mapNameToValue = map38;
        java.util.Map map40 = null;
        hashEntityMap37.mapNameToValue = map40;
        java.util.Map map42 = null;
        hashEntityMap37.mapNameToValue = map42;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map45 = null;
        hashEntityMap44.mapNameToValue = map45;
        java.util.Map map47 = null;
        hashEntityMap44.mapNameToValue = map47;
        java.util.Map map49 = null;
        hashEntityMap44.mapNameToValue = map49;
        java.util.Map map51 = hashEntityMap44.mapValueToName;
        hashEntityMap37.mapNameToValue = map51;
        hashEntityMap30.mapValueToName = map51;
        treeEntityMap12.mapNameToValue = map51;
        java.util.Map map55 = treeEntityMap12.mapNameToValue;
        int int57 = treeEntityMap12.value("");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap58 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = null;
        hashEntityMap59.mapNameToValue = map60;
        java.util.Map map62 = null;
        hashEntityMap59.mapNameToValue = map62;
        java.util.Map map64 = null;
        hashEntityMap59.mapNameToValue = map64;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap66 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map67 = null;
        hashEntityMap66.mapNameToValue = map67;
        java.util.Map map69 = null;
        hashEntityMap66.mapNameToValue = map69;
        java.util.Map map71 = null;
        hashEntityMap66.mapNameToValue = map71;
        java.util.Map map73 = hashEntityMap66.mapValueToName;
        hashEntityMap59.mapNameToValue = map73;
        treeEntityMap58.mapValueToName = map73;
        treeEntityMap12.mapValueToName = map73;
        java.util.Map map77 = treeEntityMap12.mapNameToValue;
        hashEntityMap0.mapValueToName = map77;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        java.lang.String str51 = hashEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        hashEntityMap0.add("", (int) (byte) 0);
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = null;
        hashEntityMap35.mapNameToValue = map36;
        java.lang.String str39 = hashEntityMap35.name((int) '4');
        java.lang.String str41 = hashEntityMap35.name((int) (short) 100);
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
        hashEntityMap35.mapValueToName = map56;
        hashEntityMap11.mapValueToName = map56;
        java.util.Map map60 = hashEntityMap11.mapNameToValue;
        java.util.Map map61 = hashEntityMap11.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map63 = hashEntityMap62.mapValueToName;
        hashEntityMap11.mapValueToName = map63;
        hashEntityMap0.mapValueToName = map63;
        java.lang.String str67 = hashEntityMap0.name((-1));
        int int69 = hashEntityMap0.value("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(map60);
        org.junit.Assert.assertNull(map61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray11 = new int[] { ' ', '4' };
        binaryEntityMap8.values = intArray11;
        java.lang.String str14 = binaryEntityMap8.name((int) (byte) 100);
        binaryEntityMap8.add("hi!", (-1));
        java.lang.String[] strArray18 = binaryEntityMap8.names;
        binaryEntityMap8.add("", (int) (byte) 0);
        entities0.map = binaryEntityMap8;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap24 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray25 = arrayEntityMap24.values;
        int int26 = arrayEntityMap24.growBy;
        arrayEntityMap24.size = 100;
        arrayEntityMap24.growBy = (byte) 100;
        arrayEntityMap24.growBy = (short) 1;
        int[] intArray33 = arrayEntityMap24.values;
        java.lang.String[] strArray34 = arrayEntityMap24.names;
        binaryEntityMap8.names = strArray34;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { null });
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        java.lang.String str7 = entities0.entityName((int) (short) 0);
        java.lang.String str9 = entities0.unescape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        entities0.addEntity("hi!", (-1));
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap60 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap60.add("", (int) ' ');
        int int64 = binaryEntityMap60.growBy;
        binaryEntityMap60.add("hi!", (int) (byte) 1);
        entities0.map = binaryEntityMap60;
        java.lang.String str70 = binaryEntityMap60.name(0);
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 32 + "'", int64 == 32);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        int int18 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray9 = arrayEntityMap8.values;
        int int10 = arrayEntityMap8.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap12.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray19 = new int[] { ' ', '4' };
        binaryEntityMap16.values = intArray19;
        arrayEntityMap12.values = intArray19;
        arrayEntityMap8.values = intArray19;
        arrayEntityMap1.values = intArray19;
        arrayEntityMap1.add("", 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap28 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray29 = arrayEntityMap28.values;
        java.lang.String str31 = arrayEntityMap28.name((int) (short) 100);
        int int33 = arrayEntityMap28.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap35 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray36 = arrayEntityMap35.values;
        int int37 = arrayEntityMap35.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap39.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap43 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray46 = new int[] { ' ', '4' };
        binaryEntityMap43.values = intArray46;
        arrayEntityMap39.values = intArray46;
        arrayEntityMap35.values = intArray46;
        arrayEntityMap28.values = intArray46;
        arrayEntityMap1.values = intArray46;
        java.lang.String[] strArray52 = arrayEntityMap1.names;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, 52 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 0 });
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "" });
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        java.lang.String str16 = binaryEntityMap1.name((int) 'a');
        binaryEntityMap1.add("", 0);
        int int21 = binaryEntityMap1.value("");
        int[] intArray22 = binaryEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 0 });
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        int int5 = hashEntityMap0.value("");
        java.lang.String str7 = hashEntityMap0.name((int) '4');
        int int9 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("hi!", 32);
        int int14 = hashEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        int int9 = binaryEntityMap1.growBy;
        java.lang.String str11 = binaryEntityMap1.name((int) (short) -1);
        binaryEntityMap1.add("hi!", (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        java.io.Writer writer34 = null;
        entities0.escape(writer34, "");
        org.apache.commons.lang.Entities entities37 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap38 = entities37.map;
        org.apache.commons.lang.Entities.EntityMap entityMap39 = entities37.map;
        org.apache.commons.lang.Entities.EntityMap entityMap40 = entities37.map;
        org.apache.commons.lang.Entities entities41 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap42 = entities41.map;
        java.io.Writer writer43 = null;
        entities41.escape(writer43, "");
        entities41.addEntity("", (int) (short) 0);
        java.lang.String str50 = entities41.unescape("");
        java.lang.String str52 = entities41.unescape("");
        java.lang.String str54 = entities41.unescape("hi!");
        int int56 = entities41.entityValue("");
        org.apache.commons.lang.Entities entities57 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray58 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities57.addEntities(strArray58);
        entities41.addEntities(strArray58);
        entities37.addEntities(strArray58);
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntities(strArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(entities37);
        org.junit.Assert.assertNotNull(entityMap38);
        org.junit.Assert.assertNotNull(entityMap39);
        org.junit.Assert.assertNotNull(entityMap40);
        org.junit.Assert.assertNotNull(entities41);
        org.junit.Assert.assertNotNull(entityMap42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(entities57);
        org.junit.Assert.assertNotNull(strArray58);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        java.lang.String str7 = entities0.escape("");
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        java.lang.String str10 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str13 = entities0.entityName((int) (byte) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) ' ');
        java.lang.String str13 = lookupEntityMap0.name(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        int int46 = treeEntityMap0.value("hi!");
        int int48 = treeEntityMap0.value("hi!");
        java.lang.String str50 = treeEntityMap0.name(0);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(10);
        java.lang.String[] strArray2 = binaryEntityMap1.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap4.growBy = (-1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int10 = arrayEntityMap8.value("hi!");
        int int11 = arrayEntityMap8.growBy;
        arrayEntityMap8.growBy = 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray18 = new int[] { ' ', '4' };
        binaryEntityMap15.values = intArray18;
        binaryEntityMap15.size = '#';
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray24 = arrayEntityMap23.values;
        java.lang.String str26 = arrayEntityMap23.name((int) (short) 100);
        int int28 = arrayEntityMap23.value("hi!");
        arrayEntityMap23.size = (byte) 0;
        int int31 = arrayEntityMap23.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap33 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap33.add("hi!", 0);
        arrayEntityMap33.size = (byte) 1;
        int[] intArray39 = new int[] {};
        arrayEntityMap33.values = intArray39;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap42 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int44 = arrayEntityMap42.value("");
        java.lang.String[] strArray45 = arrayEntityMap42.names;
        arrayEntityMap33.names = strArray45;
        arrayEntityMap23.names = strArray45;
        binaryEntityMap15.names = strArray45;
        arrayEntityMap8.names = strArray45;
        arrayEntityMap4.names = strArray45;
        binaryEntityMap1.names = strArray45;
        binaryEntityMap1.add("hi!", (int) (byte) 0);
        binaryEntityMap1.size = (short) -1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap58 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap58.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap62 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray65 = new int[] { ' ', '4' };
        binaryEntityMap62.values = intArray65;
        arrayEntityMap58.values = intArray65;
        arrayEntityMap58.size = (byte) 1;
        arrayEntityMap58.growBy = 0;
        int[] intArray72 = arrayEntityMap58.values;
        binaryEntityMap1.values = intArray72;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0 });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 32, 52 });
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.size = 0;
        binaryEntityMap1.add("", (int) ' ');
        int int12 = binaryEntityMap1.size;
        binaryEntityMap1.add("hi!", 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        hashEntityMap0.add("", (int) (byte) 100);
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
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        java.util.Map map22 = treeEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = null;
        hashEntityMap23.mapNameToValue = map24;
        java.util.Map map26 = hashEntityMap23.mapValueToName;
        treeEntityMap0.mapNameToValue = map26;
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        java.lang.String str22 = hashEntityMap0.name((int) (byte) 0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        java.lang.String[] strArray38 = binaryEntityMap20.names;
        binaryEntityMap1.names = strArray38;
        java.lang.String[] strArray40 = binaryEntityMap1.names;
        int int41 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 0 });
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(10);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str6 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int27 = arrayEntityMap25.value("");
        java.lang.String[] strArray28 = arrayEntityMap25.names;
        int[] intArray29 = arrayEntityMap25.values;
        binaryEntityMap1.values = intArray29;
        binaryEntityMap1.add("", (int) (short) 0);
        java.lang.String str35 = binaryEntityMap1.name((int) '4');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 0 });
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        java.io.Writer writer11 = null;
        entities0.escape(writer11, "");
        org.apache.commons.lang.Entities entities14 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.lang.String str19 = hashEntityMap15.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.lang.String str24 = hashEntityMap20.name((int) '4');
        java.lang.String str26 = hashEntityMap20.name((int) (short) 100);
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
        hashEntityMap20.mapValueToName = map41;
        hashEntityMap15.mapValueToName = map41;
        entities14.map = hashEntityMap15;
        java.lang.String str47 = entities14.escape("hi!");
        java.lang.String str49 = entities14.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap51 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities14.map = arrayEntityMap51;
        java.io.Writer writer53 = null;
        entities14.escape(writer53, "");
        java.lang.String str57 = entities14.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities14);
        org.apache.commons.lang.Entities entities59 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap60 = entities59.map;
        java.lang.String str62 = entities59.unescape("hi!");
        org.apache.commons.lang.Entities entities63 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap64 = entities63.map;
        org.apache.commons.lang.Entities.EntityMap entityMap65 = entities63.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap67 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap67.add("hi!", 0);
        arrayEntityMap67.size = (byte) 1;
        arrayEntityMap67.growBy = 100;
        java.lang.String str76 = arrayEntityMap67.name((int) (byte) 1);
        entities63.map = arrayEntityMap67;
        entities59.map = arrayEntityMap67;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities59);
        org.apache.commons.lang.Entities entities80 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray81 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities80.addEntities(strArray81);
        entities59.addEntities(strArray81);
        entities14.addEntities(strArray81);
        entities0.addEntities(strArray81);
        java.io.Writer writer86 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer86, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 160, 10 });
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(entities59);
        org.junit.Assert.assertNotNull(entityMap60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(entities63);
        org.junit.Assert.assertNotNull(entityMap64);
        org.junit.Assert.assertNotNull(entityMap65);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(entities80);
        org.junit.Assert.assertNotNull(strArray81);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) (byte) 100);
        int int7 = hashEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = hashEntityMap0.name((int) (short) -1);
        java.lang.String str10 = hashEntityMap0.name((-1));
        java.util.Map map11 = null;
        hashEntityMap0.mapNameToValue = map11;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapValueToName;
        java.util.Map map15 = hashEntityMap13.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap16 = new org.apache.commons.lang.Entities.TreeEntityMap();
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
        treeEntityMap16.mapValueToName = map31;
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
        treeEntityMap16.mapNameToValue = map55;
        java.util.Map map59 = treeEntityMap16.mapNameToValue;
        hashEntityMap13.mapValueToName = map59;
        java.util.Map map61 = hashEntityMap13.mapValueToName;
        hashEntityMap0.mapNameToValue = map61;
        java.util.Map map63 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String[] strArray11 = binaryEntityMap1.names;
        java.lang.String str13 = binaryEntityMap1.name((int) (byte) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap15.growBy = 0;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray20 = arrayEntityMap19.values;
        int int21 = arrayEntityMap19.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap23.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray30 = new int[] { ' ', '4' };
        binaryEntityMap27.values = intArray30;
        arrayEntityMap23.values = intArray30;
        arrayEntityMap19.values = intArray30;
        java.lang.String str35 = arrayEntityMap19.name(1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap37 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap37.ensureCapacity((-1));
        binaryEntityMap37.growBy = 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap43 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str45 = binaryEntityMap43.name((-1));
        int[] intArray46 = binaryEntityMap43.values;
        binaryEntityMap37.values = intArray46;
        arrayEntityMap19.values = intArray46;
        arrayEntityMap15.values = intArray46;
        binaryEntityMap1.values = intArray46;
        binaryEntityMap1.add("", 1);
        int int55 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        binaryEntityMap1.growBy = 100;
        int int18 = binaryEntityMap1.value("");
        java.lang.String str20 = binaryEntityMap1.name((int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        java.lang.String str13 = lookupEntityMap0.name((int) ' ');
        lookupEntityMap0.add("hi!", (int) ' ');
        int int18 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        int int49 = hashEntityMap0.value("");
        java.lang.String str51 = hashEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        binaryEntityMap1.add("", (int) (byte) 1);
        int[] intArray12 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap1.values = intArray12;
        binaryEntityMap1.add("", 0);
        java.lang.String str18 = binaryEntityMap1.name((int) '4');
        int[] intArray19 = binaryEntityMap1.values;
        int[] intArray20 = binaryEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 1, 32 });
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, 1, 32 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 1, 32 });
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", 100);
        java.lang.String str7 = entities0.entityName((int) (byte) 100);
        java.lang.String str9 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        java.lang.Class<?> wildcardClass11 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(entityMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        java.lang.String str3 = binaryEntityMap1.name((int) ' ');
        binaryEntityMap1.growBy = ' ';
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = 100;
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.growBy = (short) 1;
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.size = '4';
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        java.lang.String[] strArray28 = binaryEntityMap12.names;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str32 = binaryEntityMap30.name((int) '#');
        binaryEntityMap30.add("", (int) (byte) -1);
        int int36 = binaryEntityMap30.size;
        int int37 = binaryEntityMap30.growBy;
        int[] intArray38 = binaryEntityMap30.values;
        int[] intArray39 = binaryEntityMap30.values;
        binaryEntityMap12.values = intArray39;
        binaryEntityMap12.growBy = 0;
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
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-1) });
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        int int9 = arrayEntityMap1.value("");
        java.lang.String str11 = arrayEntityMap1.name((int) (short) 0);
        java.lang.String str13 = arrayEntityMap1.name((int) '#');
        arrayEntityMap1.size = 100;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for object array[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int27 = arrayEntityMap25.value("");
        java.lang.String[] strArray28 = arrayEntityMap25.names;
        int[] intArray29 = arrayEntityMap25.values;
        binaryEntityMap1.values = intArray29;
        java.lang.String str32 = binaryEntityMap1.name((int) ' ');
        binaryEntityMap1.add("hi!", 2);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 2 });
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(35);
        java.lang.String str3 = binaryEntityMap1.name(0);
        int[] intArray4 = binaryEntityMap1.values;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        arrayEntityMap1.add("hi!", (int) (byte) 10);
        java.lang.String str7 = arrayEntityMap1.name(100);
        java.lang.String[] strArray8 = arrayEntityMap1.names;
        java.lang.String[] strArray9 = arrayEntityMap1.names;
        java.lang.String str11 = arrayEntityMap1.name(97);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("", (int) (short) 10);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities entities8 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray11 = arrayEntityMap10.values;
        java.lang.String str13 = arrayEntityMap10.name((int) (short) 100);
        int[] intArray16 = new int[] { (short) -1, 10 };
        arrayEntityMap10.values = intArray16;
        entities8.map = arrayEntityMap10;
        int int20 = entities8.entityValue("");
        org.apache.commons.lang.Entities entities21 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap22 = entities21.map;
        java.lang.String str24 = entities21.unescape("hi!");
        org.apache.commons.lang.Entities entities25 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap26 = entities25.map;
        org.apache.commons.lang.Entities.EntityMap entityMap27 = entities25.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap29 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap29.add("hi!", 0);
        arrayEntityMap29.size = (byte) 1;
        arrayEntityMap29.growBy = 100;
        java.lang.String str38 = arrayEntityMap29.name((int) (byte) 1);
        entities25.map = arrayEntityMap29;
        entities21.map = arrayEntityMap29;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities21);
        org.apache.commons.lang.Entities entities42 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray43 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities42.addEntities(strArray43);
        entities21.addEntities(strArray43);
        entities8.addEntities(strArray43);
        entities0.addEntities(strArray43);
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap48 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int50 = lookupEntityMap48.value("");
        lookupEntityMap48.add("hi!", 100);
        java.lang.String str55 = lookupEntityMap48.name((int) (short) 1);
        java.lang.String str57 = lookupEntityMap48.name(0);
        entities0.map = lookupEntityMap48;
        org.apache.commons.lang.Entities.EntityMap entityMap59 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 160, 10 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(entities21);
        org.junit.Assert.assertNotNull(entityMap22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(entities25);
        org.junit.Assert.assertNotNull(entityMap26);
        org.junit.Assert.assertNotNull(entityMap27);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(entities42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(entityMap59);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", 35);
        int int16 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap17 = new org.apache.commons.lang.Entities.TreeEntityMap();
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
        treeEntityMap17.mapValueToName = map32;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = null;
        hashEntityMap35.mapNameToValue = map36;
        java.lang.String str39 = hashEntityMap35.name((int) '4');
        java.lang.String str41 = hashEntityMap35.name((int) (short) 100);
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
        hashEntityMap35.mapValueToName = map56;
        treeEntityMap17.mapNameToValue = map56;
        treeEntityMap17.add("hi!", (int) (byte) 0);
        java.util.Map map63 = treeEntityMap17.mapValueToName;
        hashEntityMap0.mapNameToValue = map63;
        java.util.Map map65 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.add("hi!", (int) (byte) 0);
        int int11 = arrayEntityMap1.value("");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        int int4 = binaryEntityMap1.growBy;
        java.lang.String[] strArray5 = binaryEntityMap1.names;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap7.ensureCapacity(0);
        binaryEntityMap7.ensureCapacity(100);
        binaryEntityMap7.add("", (int) (byte) 1);
        int[] intArray18 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap7.values = intArray18;
        binaryEntityMap1.values = intArray18;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 1, 32 });
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        java.lang.String[] strArray4 = arrayEntityMap1.names;
        int[] intArray5 = arrayEntityMap1.values;
        arrayEntityMap1.growBy = (-1);
        int int8 = arrayEntityMap1.size;
        java.lang.String str10 = arrayEntityMap1.name(100);
        int int11 = arrayEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap2 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap4.add("hi!", 0);
        arrayEntityMap4.size = (byte) 1;
        arrayEntityMap4.growBy = 100;
        java.lang.String str13 = arrayEntityMap4.name((int) (byte) 1);
        entities0.map = arrayEntityMap4;
        org.apache.commons.lang.Entities entities15 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer16 = null;
        entities15.escape(writer16, "");
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities15.map;
        org.apache.commons.lang.Entities entities20 = org.apache.commons.lang.Entities.HTML32;
        int int22 = entities20.entityValue("");
        entities20.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities entities26 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str28 = entities26.entityName((int) '#');
        entities26.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap32 = entities26.map;
        java.io.Writer writer33 = null;
        entities26.escape(writer33, "");
        java.lang.String str37 = entities26.unescape("hi!");
        org.apache.commons.lang.Entities entities38 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap39 = entities38.map;
        java.lang.String str41 = entities38.unescape("hi!");
        org.apache.commons.lang.Entities entities42 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap43 = entities42.map;
        org.apache.commons.lang.Entities.EntityMap entityMap44 = entities42.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap46 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap46.add("hi!", 0);
        arrayEntityMap46.size = (byte) 1;
        arrayEntityMap46.growBy = 100;
        java.lang.String str55 = arrayEntityMap46.name((int) (byte) 1);
        entities42.map = arrayEntityMap46;
        entities38.map = arrayEntityMap46;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities38);
        org.apache.commons.lang.Entities entities59 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray60 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities59.addEntities(strArray60);
        entities38.addEntities(strArray60);
        entities26.addEntities(strArray60);
        entities20.addEntities(strArray60);
        entities15.addEntities(strArray60);
        entities0.addEntities(strArray60);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(entities15);
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertNotNull(entities20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(entities26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(entityMap32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(entities38);
        org.junit.Assert.assertNotNull(entityMap39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(entities42);
        org.junit.Assert.assertNotNull(entityMap43);
        org.junit.Assert.assertNotNull(entityMap44);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(entities59);
        org.junit.Assert.assertNotNull(strArray60);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) '4');
        java.lang.String str7 = entities0.entityName((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        java.lang.String str4 = entities0.escape("hi!");
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
        int int49 = treeEntityMap5.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map52 = null;
        hashEntityMap51.mapNameToValue = map52;
        java.lang.String str55 = hashEntityMap51.name((int) '4');
        java.util.Map map56 = hashEntityMap51.mapValueToName;
        hashEntityMap50.mapValueToName = map56;
        java.util.Map map58 = hashEntityMap50.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map61 = null;
        hashEntityMap60.mapNameToValue = map61;
        java.lang.String str64 = hashEntityMap60.name((int) '4');
        java.util.Map map65 = hashEntityMap60.mapValueToName;
        hashEntityMap59.mapValueToName = map65;
        java.util.Map map67 = hashEntityMap59.mapValueToName;
        hashEntityMap50.mapNameToValue = map67;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap69 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map70 = null;
        hashEntityMap69.mapNameToValue = map70;
        java.util.Map map72 = null;
        hashEntityMap69.mapNameToValue = map72;
        java.util.Map map74 = null;
        hashEntityMap69.mapNameToValue = map74;
        java.util.Map map76 = hashEntityMap69.mapValueToName;
        hashEntityMap50.mapNameToValue = map76;
        java.util.Map map78 = hashEntityMap50.mapValueToName;
        treeEntityMap5.mapNameToValue = map78;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap80 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map81 = null;
        hashEntityMap80.mapNameToValue = map81;
        java.lang.String str84 = hashEntityMap80.name((int) '4');
        java.lang.String str86 = hashEntityMap80.name((int) (short) 100);
        java.util.Map map87 = hashEntityMap80.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap88 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map89 = null;
        hashEntityMap88.mapNameToValue = map89;
        java.util.Map map91 = null;
        hashEntityMap88.mapNameToValue = map91;
        java.util.Map map93 = null;
        hashEntityMap88.mapNameToValue = map93;
        java.util.Map map95 = hashEntityMap88.mapValueToName;
        hashEntityMap80.mapNameToValue = map95;
        treeEntityMap5.mapValueToName = map95;
        entities0.map = treeEntityMap5;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNull(map87);
        org.junit.Assert.assertNotNull(map95);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 0);
        java.lang.String[] strArray15 = binaryEntityMap1.names;
        binaryEntityMap1.size = 0;
        int int19 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.add("", 0);
        java.lang.String str24 = binaryEntityMap1.name((-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        java.lang.String str11 = binaryEntityMap1.name((int) (byte) 10);
        java.lang.String str13 = binaryEntityMap1.name((int) (byte) -1);
        java.lang.String str15 = binaryEntityMap1.name(1);
        int[] intArray16 = binaryEntityMap1.values;
        java.lang.String[] strArray17 = binaryEntityMap1.names;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray23 = arrayEntityMap22.values;
        java.lang.String str25 = arrayEntityMap22.name((int) (short) 100);
        int[] intArray28 = new int[] { (short) -1, 10 };
        arrayEntityMap22.values = intArray28;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        arrayEntityMap22.names = strArray31;
        binaryEntityMap16.names = strArray31;
        java.lang.String[] strArray34 = binaryEntityMap16.names;
        binaryEntityMap1.names = strArray34;
        binaryEntityMap1.add("hi!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 0 });
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        java.lang.String str37 = entities0.entityName((int) (byte) 100);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        int[] intArray23 = binaryEntityMap1.values;
        int[] intArray24 = binaryEntityMap1.values;
        binaryEntityMap1.ensureCapacity(32);
        binaryEntityMap1.growBy = (short) 10;
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 97, 52 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 97, 52 });
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name((int) (short) 100);
        int int14 = binaryEntityMap1.value("hi!");
        java.lang.String str16 = binaryEntityMap1.name((int) ' ');
        binaryEntityMap1.add("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 32 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        int[] intArray7 = new int[] {};
        arrayEntityMap1.values = intArray7;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int12 = arrayEntityMap10.value("");
        java.lang.String[] strArray13 = arrayEntityMap10.names;
        arrayEntityMap1.names = strArray13;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '4');
        java.lang.String[] strArray17 = binaryEntityMap16.names;
        arrayEntityMap1.names = strArray17;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        java.lang.String str7 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        java.lang.String str10 = entities0.entityName((int) 'a');
        java.lang.String str12 = entities0.escape("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("", 32);
        java.lang.String str19 = lookupEntityMap0.name((int) '#');
        java.lang.Class<?> wildcardClass20 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        org.apache.commons.lang.Entities entities50 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap51 = entities50.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap53 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap53.add("hi!", 0);
        arrayEntityMap53.size = (byte) 1;
        arrayEntityMap53.size = (-1);
        arrayEntityMap53.size = (byte) 10;
        entities50.map = arrayEntityMap53;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map65 = null;
        hashEntityMap64.mapNameToValue = map65;
        java.lang.String str68 = hashEntityMap64.name((int) '4');
        java.util.Map map69 = hashEntityMap64.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap70 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map71 = hashEntityMap70.mapValueToName;
        java.util.Map map72 = null;
        hashEntityMap70.mapNameToValue = map72;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap74 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map76 = null;
        hashEntityMap75.mapNameToValue = map76;
        java.lang.String str79 = hashEntityMap75.name((int) '4');
        java.util.Map map80 = hashEntityMap75.mapValueToName;
        hashEntityMap74.mapValueToName = map80;
        hashEntityMap70.mapNameToValue = map80;
        hashEntityMap64.mapNameToValue = map80;
        java.lang.String str85 = hashEntityMap64.name(2);
        java.lang.String str87 = hashEntityMap64.name((int) (byte) 10);
        entities50.map = hashEntityMap64;
        java.util.Map map89 = hashEntityMap64.mapNameToValue;
        hashEntityMap0.mapNameToValue = map89;
        hashEntityMap0.add("", 35);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(entities50);
        org.junit.Assert.assertNotNull(entityMap51);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        java.lang.String str27 = binaryEntityMap1.name((-1));
        java.lang.String str29 = binaryEntityMap1.name((int) (short) 0);
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        int int9 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap10.add("", (int) (byte) 100);
        java.util.Map map14 = null;
        hashEntityMap10.mapValueToName = map14;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map17 = null;
        hashEntityMap16.mapNameToValue = map17;
        java.lang.String str20 = hashEntityMap16.name((int) '4');
        java.lang.String str22 = hashEntityMap16.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = null;
        hashEntityMap23.mapNameToValue = map24;
        java.util.Map map26 = null;
        hashEntityMap23.mapNameToValue = map26;
        java.util.Map map28 = null;
        hashEntityMap23.mapNameToValue = map28;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = null;
        hashEntityMap30.mapNameToValue = map31;
        java.util.Map map33 = null;
        hashEntityMap30.mapNameToValue = map33;
        java.util.Map map35 = null;
        hashEntityMap30.mapNameToValue = map35;
        java.util.Map map37 = hashEntityMap30.mapValueToName;
        hashEntityMap23.mapNameToValue = map37;
        hashEntityMap16.mapValueToName = map37;
        hashEntityMap10.mapNameToValue = map37;
        hashEntityMap0.mapNameToValue = map37;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int7 = arrayEntityMap5.value("");
        java.lang.String[] strArray8 = arrayEntityMap5.names;
        entities0.map = arrayEntityMap5;
        entities0.addEntity("", (int) (short) -1);
        entities0.addEntity("", (int) (byte) 0);
        entities0.addEntity("hi!", 2);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        int int17 = binaryEntityMap1.size;
        binaryEntityMap1.add("", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        arrayEntityMap1.add("hi!", (int) (byte) 10);
        int[] intArray6 = arrayEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10 });
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("", (int) (short) 10);
        java.lang.String str7 = entities0.escape("hi!");
        java.lang.String str9 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(entityMap10);
        org.junit.Assert.assertNotNull(entityMap11);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        java.util.Map map4 = null;
        hashEntityMap0.mapValueToName = map4;
        int int7 = hashEntityMap0.value("");
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapValueToName;
        java.util.Map map11 = hashEntityMap9.mapNameToValue;
        int int13 = hashEntityMap9.value("");
        int int15 = hashEntityMap9.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map17 = null;
        hashEntityMap16.mapNameToValue = map17;
        java.lang.String str20 = hashEntityMap16.name((int) '4');
        java.lang.String str22 = hashEntityMap16.name((int) (short) 100);
        java.util.Map map23 = hashEntityMap16.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.util.Map map27 = null;
        hashEntityMap24.mapNameToValue = map27;
        java.util.Map map29 = null;
        hashEntityMap24.mapNameToValue = map29;
        java.util.Map map31 = hashEntityMap24.mapValueToName;
        hashEntityMap16.mapNameToValue = map31;
        hashEntityMap9.mapNameToValue = map31;
        hashEntityMap9.add("", (int) '#');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapValueToName;
        java.util.Map map39 = null;
        hashEntityMap37.mapNameToValue = map39;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = null;
        hashEntityMap42.mapNameToValue = map43;
        java.lang.String str46 = hashEntityMap42.name((int) '4');
        java.util.Map map47 = hashEntityMap42.mapValueToName;
        hashEntityMap41.mapValueToName = map47;
        hashEntityMap37.mapNameToValue = map47;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map51 = null;
        hashEntityMap50.mapNameToValue = map51;
        java.lang.String str54 = hashEntityMap50.name((int) '4');
        java.util.Map map55 = hashEntityMap50.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map57 = hashEntityMap56.mapValueToName;
        java.util.Map map58 = null;
        hashEntityMap56.mapNameToValue = map58;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map62 = null;
        hashEntityMap61.mapNameToValue = map62;
        java.lang.String str65 = hashEntityMap61.name((int) '4');
        java.util.Map map66 = hashEntityMap61.mapValueToName;
        hashEntityMap60.mapValueToName = map66;
        hashEntityMap56.mapNameToValue = map66;
        hashEntityMap50.mapNameToValue = map66;
        java.lang.String str71 = hashEntityMap50.name(2);
        java.util.Map map72 = hashEntityMap50.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap73 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap74 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map75 = null;
        hashEntityMap74.mapNameToValue = map75;
        java.lang.String str78 = hashEntityMap74.name((int) '4');
        java.util.Map map79 = hashEntityMap74.mapValueToName;
        hashEntityMap73.mapValueToName = map79;
        java.util.Map map81 = hashEntityMap73.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap82 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap83 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map84 = null;
        hashEntityMap83.mapNameToValue = map84;
        java.lang.String str87 = hashEntityMap83.name((int) '4');
        java.util.Map map88 = hashEntityMap83.mapValueToName;
        hashEntityMap82.mapValueToName = map88;
        java.util.Map map90 = hashEntityMap82.mapValueToName;
        hashEntityMap73.mapNameToValue = map90;
        java.util.Map map92 = hashEntityMap73.mapValueToName;
        hashEntityMap50.mapValueToName = map92;
        hashEntityMap37.mapValueToName = map92;
        hashEntityMap9.mapValueToName = map92;
        hashEntityMap0.mapValueToName = map92;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = 1;
        int int5 = arrayEntityMap1.value("");
        int int6 = arrayEntityMap1.size;
        java.lang.String str8 = arrayEntityMap1.name((int) (short) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int12 = binaryEntityMap10.value("hi!");
        binaryEntityMap10.growBy = (byte) 0;
        int int16 = binaryEntityMap10.value("");
        int[] intArray17 = binaryEntityMap10.values;
        arrayEntityMap1.values = intArray17;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = 100;
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.growBy = (short) 1;
        int int10 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = 100;
        java.lang.String[] strArray9 = arrayEntityMap1.names;
        java.lang.Class<?> wildcardClass10 = arrayEntityMap1.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        java.lang.String str16 = binaryEntityMap1.name((int) 'a');
        binaryEntityMap1.add("hi!", 97);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        java.lang.String str23 = binaryEntityMap21.name((int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray28 = new int[] { ' ', '4' };
        binaryEntityMap25.values = intArray28;
        binaryEntityMap25.size = '#';
        int[] intArray32 = binaryEntityMap25.values;
        binaryEntityMap21.values = intArray32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap35 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int37 = arrayEntityMap35.value("");
        java.lang.String[] strArray38 = arrayEntityMap35.names;
        int[] intArray39 = arrayEntityMap35.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap41 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap41.add("hi!", 0);
        java.lang.String str46 = arrayEntityMap41.name(0);
        int[] intArray47 = arrayEntityMap41.values;
        arrayEntityMap35.values = intArray47;
        binaryEntityMap21.values = intArray47;
        binaryEntityMap1.values = intArray47;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 97 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(intArray47);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        int int9 = binaryEntityMap1.growBy;
        int int11 = binaryEntityMap1.value("hi!");
        int int13 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '4');
        java.lang.String[] strArray2 = binaryEntityMap1.names;
        java.lang.String str4 = binaryEntityMap1.name((int) (short) 100);
        int int5 = binaryEntityMap1.growBy;
        java.lang.String str7 = binaryEntityMap1.name(32);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) '4');
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap6 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str8 = lookupEntityMap6.name(0);
        java.lang.String str10 = lookupEntityMap6.name(0);
        int int12 = lookupEntityMap6.value("");
        entities0.map = lookupEntityMap6;
        java.lang.String str15 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        java.lang.String str5 = entities0.entityName((int) (short) 1);
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray7 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities6.addEntities(strArray7);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str12 = binaryEntityMap10.name((-1));
        entities6.map = binaryEntityMap10;
        entities6.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer18 = null;
        entities17.escape(writer18, "");
        java.lang.String str22 = entities17.unescape("");
        org.apache.commons.lang.Entities entities23 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap24 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap24.add("hi!", (int) (short) 1);
        int int29 = lookupEntityMap24.value("hi!");
        int int31 = lookupEntityMap24.value("");
        java.lang.String str33 = lookupEntityMap24.name((int) (byte) 1);
        lookupEntityMap24.add("hi!", 10);
        entities23.map = lookupEntityMap24;
        org.apache.commons.lang.Entities entities38 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap39 = entities38.map;
        java.lang.String str41 = entities38.unescape("");
        org.apache.commons.lang.Entities entities42 = org.apache.commons.lang.Entities.HTML32;
        int int44 = entities42.entityValue("");
        entities42.addEntity("hi!", (int) '4');
        java.lang.String str49 = entities42.entityName((int) (short) 1);
        int int51 = entities42.entityValue("");
        entities42.addEntity("hi!", (int) (byte) 100);
        java.lang.String[][] strArray55 = new java.lang.String[][] {};
        entities42.addEntities(strArray55);
        entities38.addEntities(strArray55);
        entities23.addEntities(strArray55);
        entities17.addEntities(strArray55);
        entities6.addEntities(strArray55);
        entities0.addEntities(strArray55);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(entities23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(entities38);
        org.junit.Assert.assertNotNull(entityMap39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(entities42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[][] {});
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapValueToName;
        java.util.Map map6 = hashEntityMap4.mapNameToValue;
        entities0.map = hashEntityMap4;
        int int9 = hashEntityMap4.value("");
        int int11 = hashEntityMap4.value("hi!");
        java.util.Map map12 = hashEntityMap4.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.lang.String str17 = hashEntityMap13.name((int) '4');
        java.lang.String str19 = hashEntityMap13.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = null;
        hashEntityMap20.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap20.mapNameToValue = map25;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = null;
        hashEntityMap27.mapNameToValue = map28;
        java.util.Map map30 = null;
        hashEntityMap27.mapNameToValue = map30;
        java.util.Map map32 = null;
        hashEntityMap27.mapNameToValue = map32;
        java.util.Map map34 = hashEntityMap27.mapValueToName;
        hashEntityMap20.mapNameToValue = map34;
        hashEntityMap13.mapValueToName = map34;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = null;
        hashEntityMap37.mapNameToValue = map38;
        java.lang.String str41 = hashEntityMap37.name((int) '4');
        java.lang.String str43 = hashEntityMap37.name((int) (short) 100);
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
        hashEntityMap37.mapValueToName = map58;
        hashEntityMap13.mapValueToName = map58;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map63 = null;
        hashEntityMap62.mapNameToValue = map63;
        java.util.Map map65 = null;
        hashEntityMap62.mapNameToValue = map65;
        java.util.Map map67 = null;
        hashEntityMap62.mapNameToValue = map67;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap69 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map70 = null;
        hashEntityMap69.mapNameToValue = map70;
        java.util.Map map72 = null;
        hashEntityMap69.mapNameToValue = map72;
        java.util.Map map74 = null;
        hashEntityMap69.mapNameToValue = map74;
        java.util.Map map76 = hashEntityMap69.mapValueToName;
        hashEntityMap62.mapNameToValue = map76;
        hashEntityMap13.mapValueToName = map76;
        java.util.Map map79 = hashEntityMap13.mapValueToName;
        hashEntityMap4.mapNameToValue = map79;
        int int82 = hashEntityMap4.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name((-1));
        int int4 = binaryEntityMap1.size;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities6.map;
        java.io.Writer writer8 = null;
        entities6.escape(writer8, "");
        entities6.addEntity("", (int) (short) 0);
        java.lang.String str15 = entities6.unescape("");
        java.lang.String str17 = entities6.unescape("");
        java.lang.String str19 = entities6.unescape("hi!");
        int int21 = entities6.entityValue("");
        org.apache.commons.lang.Entities entities22 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray23 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities22.addEntities(strArray23);
        entities6.addEntities(strArray23);
        entities0.addEntities(strArray23);
        org.junit.Assert.assertNotNull(entities0);
// flaky "4) test2247(org.apache.commons.lang.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(52);
        java.lang.String str10 = lookupEntityMap0.name(1);
        java.lang.String str12 = lookupEntityMap0.name((int) '#');
        java.lang.String str14 = lookupEntityMap0.name(10);
        java.lang.String str16 = lookupEntityMap0.name(1);
        int int18 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        int int7 = binaryEntityMap1.size;
        int int8 = binaryEntityMap1.growBy;
        int[] intArray9 = binaryEntityMap1.values;
        binaryEntityMap1.size = 'a';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = binaryEntityMap1.name((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        entities0.addEntity("", (int) (short) 1);
        java.lang.String str7 = entities0.entityName((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = entities0.entityName((-1));
// flaky "5) test2250(org.apache.commons.lang.RegressionTest4)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        int int7 = binaryEntityMap1.size;
        int int8 = binaryEntityMap1.growBy;
        int[] intArray9 = binaryEntityMap1.values;
        int int11 = binaryEntityMap1.value("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(52);
        int int10 = lookupEntityMap0.value("");
        java.lang.String str12 = lookupEntityMap0.name(100);
        int int14 = lookupEntityMap0.value("hi!");
        java.lang.String str16 = lookupEntityMap0.name(32);
        java.lang.String str18 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str20 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("");
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        java.io.Writer writer12 = null;
        entities0.escape(writer12, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("hi!");
        java.lang.String str12 = entities0.escape("");
        java.lang.String str14 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) '4');
        java.lang.String str7 = entities0.entityName((int) (short) 1);
        int int9 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) (byte) 100);
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        entities0.addEntities(strArray13);
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities0.map;
        java.lang.String str17 = entities0.entityName(100);
        entities0.addEntity("hi!", (-1));
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.lang.String str2 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray7 = new int[] { ' ', '4' };
        binaryEntityMap4.values = intArray7;
        java.lang.String str10 = binaryEntityMap4.name((int) (byte) 100);
        binaryEntityMap4.add("hi!", (-1));
        java.lang.String str15 = binaryEntityMap4.name(0);
        entities0.map = binaryEntityMap4;
        binaryEntityMap4.add("", (int) (short) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap21.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray28 = new int[] { ' ', '4' };
        binaryEntityMap25.values = intArray28;
        arrayEntityMap21.values = intArray28;
        int int31 = arrayEntityMap21.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap33 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray34 = arrayEntityMap33.values;
        arrayEntityMap33.add("hi!", (int) (byte) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray40 = arrayEntityMap39.values;
        int int41 = arrayEntityMap39.growBy;
        arrayEntityMap39.add("", (int) (byte) 10);
        int[] intArray45 = arrayEntityMap39.values;
        arrayEntityMap33.values = intArray45;
        arrayEntityMap21.values = intArray45;
        binaryEntityMap4.values = intArray45;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap4.add("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2 out of bounds for int[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 1 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 10 });
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        arrayEntityMap1.ensureCapacity((int) (byte) 1);
        java.lang.String str7 = arrayEntityMap1.name(0);
        arrayEntityMap1.ensureCapacity(97);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.io.Writer writer2 = null;
        entities0.escape(writer2, "");
        entities0.addEntity("", (int) (short) 0);
        java.lang.String str9 = entities0.unescape("");
        int int11 = entities0.entityValue("");
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("", 32);
        lookupEntityMap0.add("hi!", 52);
        int int19 = lookupEntityMap0.value("");
        int int21 = lookupEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        binaryEntityMap1.add("", (int) (byte) 1);
        int[] intArray12 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap1.values = intArray12;
        binaryEntityMap1.add("", 0);
        java.lang.String str18 = binaryEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap20 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap20.growBy = (-1);
        int[] intArray23 = arrayEntityMap20.values;
        binaryEntityMap1.values = intArray23;
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 1, 32 });
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 0 });
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        lookupEntityMap0.add("hi!", 35);
        java.lang.String str14 = lookupEntityMap0.name((int) (byte) 0);
        lookupEntityMap0.add("", 1);
        java.lang.String str19 = lookupEntityMap0.name(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = (-1);
        int[] intArray9 = arrayEntityMap1.values;
        int int11 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.ensureCapacity(0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("hi!", (int) (byte) 100);
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        java.lang.String str12 = entities0.escape("hi!");
        java.lang.String str14 = entities0.unescape("");
        int int16 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
// flaky "6) test2265(org.apache.commons.lang.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray8, new int[] { 402, 10 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.HTML32;
        int int11 = entities9.entityValue("");
        java.lang.String[][] strArray12 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities9.addEntities(strArray12);
        entities0.addEntities(strArray12);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer16 = null;
        entities0.escape(writer16, "");
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities0.map;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(entityMap19);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int2 = arrayEntityMap1.growBy;
        int int3 = arrayEntityMap1.size;
        int[] intArray4 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str8 = binaryEntityMap6.name((int) '#');
        binaryEntityMap6.add("", (int) (byte) -1);
        int int12 = binaryEntityMap6.size;
        int int13 = binaryEntityMap6.growBy;
        int[] intArray14 = binaryEntityMap6.values;
        int[] intArray15 = binaryEntityMap6.values;
        java.lang.String[] strArray16 = binaryEntityMap6.names;
        arrayEntityMap1.names = strArray16;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1) });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str9 = entities7.unescape("hi!");
        java.io.Writer writer10 = null;
        entities7.escape(writer10, "");
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities7.map;
        org.apache.commons.lang.Entities entities14 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities14.map;
        java.lang.String str17 = entities14.unescape("hi!");
        org.apache.commons.lang.Entities entities18 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities18.map;
        org.apache.commons.lang.Entities.EntityMap entityMap20 = entities18.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap22.add("hi!", 0);
        arrayEntityMap22.size = (byte) 1;
        arrayEntityMap22.growBy = 100;
        java.lang.String str31 = arrayEntityMap22.name((int) (byte) 1);
        entities18.map = arrayEntityMap22;
        entities14.map = arrayEntityMap22;
        entities7.map = arrayEntityMap22;
        java.lang.String[] strArray35 = arrayEntityMap22.names;
        arrayEntityMap1.names = strArray35;
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 0;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNotNull(entities14);
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(entities18);
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertNotNull(entityMap20);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.lang.String str5 = hashEntityMap0.name((int) 'a');
        java.lang.String str7 = hashEntityMap0.name((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) '4');
        java.lang.String str7 = entities0.entityName((int) (short) 1);
        int int9 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) (byte) 100);
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        entities0.addEntities(strArray13);
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities0.map;
        java.lang.String str17 = entities0.entityName(100);
        java.lang.String str19 = entities0.unescape("");
        org.apache.commons.lang.Entities entities20 = org.apache.commons.lang.Entities.HTML32;
        int int22 = entities20.entityValue("hi!");
        org.apache.commons.lang.Entities entities23 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray26 = arrayEntityMap25.values;
        java.lang.String str28 = arrayEntityMap25.name((int) (short) 100);
        int[] intArray31 = new int[] { (short) -1, 10 };
        arrayEntityMap25.values = intArray31;
        entities23.map = arrayEntityMap25;
        int int35 = entities23.entityValue("");
        java.lang.String str37 = entities23.entityName(10);
        entities23.addEntity("", 52);
        org.apache.commons.lang.Entities entities41 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = null;
        hashEntityMap42.mapNameToValue = map43;
        java.lang.String str46 = hashEntityMap42.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map48 = null;
        hashEntityMap47.mapNameToValue = map48;
        java.lang.String str51 = hashEntityMap47.name((int) '4');
        java.lang.String str53 = hashEntityMap47.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map55 = null;
        hashEntityMap54.mapNameToValue = map55;
        java.util.Map map57 = null;
        hashEntityMap54.mapNameToValue = map57;
        java.util.Map map59 = null;
        hashEntityMap54.mapNameToValue = map59;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map62 = null;
        hashEntityMap61.mapNameToValue = map62;
        java.util.Map map64 = null;
        hashEntityMap61.mapNameToValue = map64;
        java.util.Map map66 = null;
        hashEntityMap61.mapNameToValue = map66;
        java.util.Map map68 = hashEntityMap61.mapValueToName;
        hashEntityMap54.mapNameToValue = map68;
        hashEntityMap47.mapValueToName = map68;
        hashEntityMap42.mapValueToName = map68;
        entities41.map = hashEntityMap42;
        java.lang.String str74 = entities41.escape("hi!");
        java.lang.String str76 = entities41.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap78 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities41.map = arrayEntityMap78;
        java.lang.String[][] strArray80 = new java.lang.String[][] {};
        entities41.addEntities(strArray80);
        entities23.addEntities(strArray80);
        entities20.addEntities(strArray80);
        entities0.addEntities(strArray80);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(entities20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(entities23);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0 });
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 52, 10 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[][] {});
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities12 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.lang.String str17 = hashEntityMap13.name((int) '4');
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
        hashEntityMap13.mapValueToName = map39;
        entities12.map = hashEntityMap13;
        java.lang.String str45 = entities12.escape("hi!");
        java.lang.String str47 = entities12.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap49 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities12.map = arrayEntityMap49;
        java.io.Writer writer51 = null;
        entities12.escape(writer51, "");
        java.lang.String str55 = entities12.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities12);
        org.apache.commons.lang.Entities entities57 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap58 = entities57.map;
        java.lang.String str60 = entities57.unescape("hi!");
        org.apache.commons.lang.Entities entities61 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap62 = entities61.map;
        org.apache.commons.lang.Entities.EntityMap entityMap63 = entities61.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap65 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap65.add("hi!", 0);
        arrayEntityMap65.size = (byte) 1;
        arrayEntityMap65.growBy = 100;
        java.lang.String str74 = arrayEntityMap65.name((int) (byte) 1);
        entities61.map = arrayEntityMap65;
        entities57.map = arrayEntityMap65;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities57);
        org.apache.commons.lang.Entities entities78 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray79 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities78.addEntities(strArray79);
        entities57.addEntities(strArray79);
        entities12.addEntities(strArray79);
        entities0.addEntities(strArray79);
        java.lang.String str85 = entities0.escape("");
        java.lang.String str87 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(entities57);
        org.junit.Assert.assertNotNull(entityMap58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(entities61);
        org.junit.Assert.assertNotNull(entityMap62);
        org.junit.Assert.assertNotNull(entityMap63);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(entities78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        java.lang.String str46 = treeEntityMap0.name((int) 'a');
        treeEntityMap0.add("hi!", 35);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map52 = null;
        hashEntityMap51.mapNameToValue = map52;
        java.lang.String str55 = hashEntityMap51.name((int) '4');
        java.util.Map map56 = hashEntityMap51.mapValueToName;
        hashEntityMap50.mapValueToName = map56;
        java.util.Map map58 = hashEntityMap50.mapValueToName;
        java.util.Map map59 = hashEntityMap50.mapValueToName;
        treeEntityMap0.mapNameToValue = map59;
        java.lang.String str62 = treeEntityMap0.name((int) (short) 0);
        java.util.Map map63 = treeEntityMap0.mapValueToName;
        treeEntityMap0.add("hi!", (int) (short) 0);
        treeEntityMap0.add("", (int) (byte) -1);
        int int71 = treeEntityMap0.value("");
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities13);
        org.apache.commons.lang.Entities entities34 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray35 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities34.addEntities(strArray35);
        entities13.addEntities(strArray35);
        entities0.addEntities(strArray35);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = null;
        hashEntityMap40.mapNameToValue = map41;
        java.lang.String str44 = hashEntityMap40.name((int) '4');
        java.util.Map map45 = hashEntityMap40.mapValueToName;
        hashEntityMap39.mapValueToName = map45;
        java.util.Map map47 = hashEntityMap39.mapValueToName;
        java.util.Map map48 = hashEntityMap39.mapValueToName;
        java.lang.String str50 = hashEntityMap39.name(35);
        entities0.map = hashEntityMap39;
        java.lang.String str53 = hashEntityMap39.name(100);
        java.util.Map map54 = hashEntityMap39.mapValueToName;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 160, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(entities34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        binaryEntityMap1.add("", (int) (short) 1);
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
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        entities0.addEntity("hi!", 100);
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.escape("hi!");
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(10);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        lookupEntityMap0.add("", 0);
        int int9 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", (int) (short) 0);
        int int14 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        int int19 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray7 = new int[] { (short) -1, 10 };
        arrayEntityMap1.values = intArray7;
        java.lang.String str10 = arrayEntityMap1.name((int) (short) 10);
        arrayEntityMap1.add("", 35);
        int int14 = arrayEntityMap1.size;
        java.lang.String str16 = arrayEntityMap1.name(1);
        arrayEntityMap1.ensureCapacity((-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 35, 10 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        java.lang.String str4 = entities0.escape("hi!");
        int int6 = entities0.entityValue("hi!");
        entities0.addEntity("", (int) 'a');
        java.lang.String str11 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        arrayEntityMap1.ensureCapacity(10);
        int int35 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        java.lang.String str4 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.escape("");
        java.io.Writer writer8 = null;
        entities0.escape(writer8, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.growBy = (byte) -1;
        binaryEntityMap1.growBy = 'a';
        binaryEntityMap1.size = (byte) 0;
        binaryEntityMap1.add("hi!", (int) 'a');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray19 = new int[] { ' ', '4' };
        binaryEntityMap16.values = intArray19;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray23 = arrayEntityMap22.values;
        java.lang.String str25 = arrayEntityMap22.name((int) (short) 100);
        int[] intArray28 = new int[] { (short) -1, 10 };
        arrayEntityMap22.values = intArray28;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        arrayEntityMap22.names = strArray31;
        binaryEntityMap16.names = strArray31;
        java.lang.String[] strArray34 = binaryEntityMap16.names;
        binaryEntityMap16.add("", 10);
        binaryEntityMap16.ensureCapacity(10);
        int int40 = binaryEntityMap16.growBy;
        int int41 = binaryEntityMap16.growBy;
        binaryEntityMap16.add("", 2);
        binaryEntityMap16.add("", 0);
        binaryEntityMap16.size = 35;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap51 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap51.growBy = 0;
        int int54 = arrayEntityMap51.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap56 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str58 = binaryEntityMap56.name((int) '#');
        binaryEntityMap56.add("", (int) (byte) -1);
        java.lang.String str63 = binaryEntityMap56.name((int) (byte) 10);
        int int65 = binaryEntityMap56.value("");
        binaryEntityMap56.ensureCapacity(100);
        int[] intArray68 = binaryEntityMap56.values;
        arrayEntityMap51.values = intArray68;
        binaryEntityMap16.values = intArray68;
        binaryEntityMap1.values = intArray68;
        binaryEntityMap1.add("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 52 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 0 });
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray68);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.io.Writer writer2 = null;
        entities0.escape(writer2, "");
        entities0.addEntity("", (int) (short) 0);
        java.lang.String str9 = entities0.unescape("");
        java.lang.String str11 = entities0.unescape("");
        java.lang.String str13 = entities0.unescape("hi!");
        int int15 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap16 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(entityMap16);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        entities0.addEntity("hi!", 52);
        java.lang.String str49 = entities0.entityName(1);
        java.lang.String str51 = entities0.escape("");
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
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.lang.String str11 = hashEntityMap7.name((int) '4');
        java.util.Map map12 = hashEntityMap7.mapValueToName;
        entities0.map = hashEntityMap7;
        java.util.Map map14 = hashEntityMap7.mapNameToValue;
        java.util.Map map15 = hashEntityMap7.mapNameToValue;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(map15);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap6.add("hi!", 0);
        arrayEntityMap6.size = (byte) 1;
        arrayEntityMap6.growBy = 100;
        java.lang.String[] strArray14 = arrayEntityMap6.names;
        arrayEntityMap1.names = strArray14;
        java.lang.String str17 = arrayEntityMap1.name(52);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        int int5 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
        java.lang.String str35 = lookupEntityMap28.name((int) (byte) 100);
        lookupEntityMap28.add("", 97);
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
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.util.Map map10 = hashEntityMap7.mapNameToValue;
        java.util.Map map11 = hashEntityMap7.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = null;
        hashEntityMap12.mapNameToValue = map13;
        java.lang.String str16 = hashEntityMap12.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.lang.String str21 = hashEntityMap17.name((int) '4');
        java.lang.String str23 = hashEntityMap17.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.util.Map map27 = null;
        hashEntityMap24.mapNameToValue = map27;
        java.util.Map map29 = null;
        hashEntityMap24.mapNameToValue = map29;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap31.mapNameToValue = map34;
        java.util.Map map36 = null;
        hashEntityMap31.mapNameToValue = map36;
        java.util.Map map38 = hashEntityMap31.mapValueToName;
        hashEntityMap24.mapNameToValue = map38;
        hashEntityMap17.mapValueToName = map38;
        hashEntityMap12.mapValueToName = map38;
        hashEntityMap7.mapNameToValue = map38;
        java.util.Map map43 = hashEntityMap7.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map45 = null;
        hashEntityMap44.mapNameToValue = map45;
        java.lang.String str48 = hashEntityMap44.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map50 = null;
        hashEntityMap49.mapNameToValue = map50;
        java.util.Map map52 = null;
        hashEntityMap49.mapNameToValue = map52;
        java.util.Map map54 = null;
        hashEntityMap49.mapNameToValue = map54;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map57 = null;
        hashEntityMap56.mapNameToValue = map57;
        java.util.Map map59 = null;
        hashEntityMap56.mapNameToValue = map59;
        java.util.Map map61 = null;
        hashEntityMap56.mapNameToValue = map61;
        java.util.Map map63 = hashEntityMap56.mapValueToName;
        hashEntityMap49.mapNameToValue = map63;
        hashEntityMap44.mapNameToValue = map63;
        java.util.Map map66 = hashEntityMap44.mapValueToName;
        hashEntityMap7.mapValueToName = map66;
        hashEntityMap0.mapNameToValue = map66;
        java.util.Map map69 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map69);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", (-1));
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(entityMap3);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap4.ensureCapacity(0);
        binaryEntityMap4.ensureCapacity(100);
        binaryEntityMap4.add("", (int) (byte) 1);
        entities0.map = binaryEntityMap4;
        java.lang.String str14 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        entities0.addEntity("", (int) (byte) 10);
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str8 = entities6.entityName((int) '#');
        entities6.addEntity("hi!", 100);
        java.lang.String str13 = entities6.entityName((int) (byte) 100);
        java.lang.String str15 = entities6.entityName((int) (short) 0);
        org.apache.commons.lang.Entities entities16 = new org.apache.commons.lang.Entities();
        java.lang.String str18 = entities16.escape("hi!");
        java.lang.String str20 = entities16.escape("");
        java.lang.String str22 = entities16.unescape("hi!");
        java.lang.String str24 = entities16.unescape("hi!");
        org.apache.commons.lang.Entities entities25 = org.apache.commons.lang.Entities.HTML32;
        int int27 = entities25.entityValue("");
        java.lang.String[][] strArray28 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities25.addEntities(strArray28);
        entities16.addEntities(strArray28);
        entities6.addEntities(strArray28);
        entities0.addEntities(strArray28);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(entities25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        arrayEntityMap1.growBy = 10;
        arrayEntityMap1.add("hi!", 52);
        arrayEntityMap1.growBy = (short) 1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap(2);
        int int15 = binaryEntityMap13.value("");
        java.lang.String str17 = binaryEntityMap13.name((int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 100);
        arrayEntityMap19.size = 52;
        int[] intArray22 = arrayEntityMap19.values;
        binaryEntityMap13.values = intArray22;
        arrayEntityMap1.values = intArray22;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        org.apache.commons.lang.Entities.EntityMap entityMap42 = entities0.map;
        java.lang.String str44 = entities0.escape("");
        java.lang.String str46 = entities0.entityName((int) (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(entityMap42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(52);
        java.lang.String str10 = lookupEntityMap0.name(1);
        lookupEntityMap0.add("", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        int int31 = binaryEntityMap1.value("");
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int6 = binaryEntityMap1.growBy;
        int int8 = binaryEntityMap1.value("hi!");
        java.lang.String str10 = binaryEntityMap1.name(0);
        binaryEntityMap1.add("", 35);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int12 = arrayEntityMap10.value("hi!");
        arrayEntityMap10.size = (byte) 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str18 = binaryEntityMap16.name((int) '#');
        int[] intArray19 = binaryEntityMap16.values;
        arrayEntityMap10.values = intArray19;
        arrayEntityMap8.values = intArray19;
        binaryEntityMap1.values = intArray19;
        int int24 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        int int11 = lookupEntityMap0.value("");
        java.lang.String str13 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", (int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        java.lang.String str4 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap6 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap6.add("hi!", (int) (short) 1);
        int int11 = lookupEntityMap6.value("hi!");
        lookupEntityMap6.add("", 100);
        java.lang.String str16 = lookupEntityMap6.name((int) (short) 100);
        lookupEntityMap6.add("hi!", 32);
        int int21 = lookupEntityMap6.value("hi!");
        lookupEntityMap6.add("hi!", (int) (byte) 100);
        entities0.map = lookupEntityMap6;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        java.lang.String str5 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        org.apache.commons.lang.Entities entities21 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str23 = entities21.entityName((int) '#');
        entities21.addEntity("hi!", 100);
        java.lang.String str28 = entities21.entityName((int) (byte) 100);
        org.apache.commons.lang.Entities.EntityMap entityMap29 = entities21.map;
        org.apache.commons.lang.Entities entities30 = org.apache.commons.lang.Entities.HTML32;
        int int32 = entities30.entityValue("");
        entities30.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities entities36 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str38 = entities36.entityName((int) '#');
        entities36.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap42 = entities36.map;
        java.io.Writer writer43 = null;
        entities36.escape(writer43, "");
        java.lang.String str47 = entities36.unescape("hi!");
        org.apache.commons.lang.Entities entities48 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap49 = entities48.map;
        java.lang.String str51 = entities48.unescape("hi!");
        org.apache.commons.lang.Entities entities52 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap53 = entities52.map;
        org.apache.commons.lang.Entities.EntityMap entityMap54 = entities52.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap56 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap56.add("hi!", 0);
        arrayEntityMap56.size = (byte) 1;
        arrayEntityMap56.growBy = 100;
        java.lang.String str65 = arrayEntityMap56.name((int) (byte) 1);
        entities52.map = arrayEntityMap56;
        entities48.map = arrayEntityMap56;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities48);
        org.apache.commons.lang.Entities entities69 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray70 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities69.addEntities(strArray70);
        entities48.addEntities(strArray70);
        entities36.addEntities(strArray70);
        entities30.addEntities(strArray70);
        entities21.addEntities(strArray70);
        entities0.addEntities(strArray70);
        int int78 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 52, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(entities21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(entityMap29);
        org.junit.Assert.assertNotNull(entities30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(entities36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(entityMap42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(entities48);
        org.junit.Assert.assertNotNull(entityMap49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(entities52);
        org.junit.Assert.assertNotNull(entityMap53);
        org.junit.Assert.assertNotNull(entityMap54);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(entities69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 52 + "'", int78 == 52);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        arrayEntityMap1.growBy = 'a';
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap7.ensureCapacity((-1));
        binaryEntityMap7.growBy = 10;
        java.lang.String str13 = binaryEntityMap7.name((int) (byte) -1);
        java.lang.String[] strArray14 = binaryEntityMap7.names;
        arrayEntityMap1.names = strArray14;
        java.lang.String str17 = arrayEntityMap1.name(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray20 = arrayEntityMap19.values;
        java.lang.String str22 = arrayEntityMap19.name((int) (short) 100);
        int[] intArray25 = new int[] { (short) -1, 10 };
        arrayEntityMap19.values = intArray25;
        java.lang.String str28 = arrayEntityMap19.name((int) (short) 10);
        arrayEntityMap19.add("", 35);
        int int32 = arrayEntityMap19.growBy;
        int int33 = arrayEntityMap19.growBy;
        java.lang.String[] strArray34 = arrayEntityMap19.names;
        arrayEntityMap1.names = strArray34;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0 });
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 35, 10 });
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "" });
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
        entities0.addEntity("hi!", (int) 'a');
        java.lang.String str26 = entities0.entityName((int) (short) 100);
        org.apache.commons.lang.Entities.EntityMap entityMap27 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(entityMap21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(entityMap27);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        binaryEntityMap1.add("hi!", 0);
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
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        int int6 = binaryEntityMap1.size;
        binaryEntityMap1.growBy = (short) 1;
        java.lang.String str10 = binaryEntityMap1.name((int) ' ');
        binaryEntityMap1.ensureCapacity((int) (short) -1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        hashEntityMap0.add("hi!", (int) (short) 0);
        java.lang.String str25 = hashEntityMap0.name((int) (short) 0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.io.Writer writer10 = null;
        entities0.escape(writer10, "");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray17 = new int[] { ' ', '4' };
        binaryEntityMap14.values = intArray17;
        java.lang.String str20 = binaryEntityMap14.name((int) (byte) 100);
        binaryEntityMap14.add("hi!", (-1));
        java.lang.String str25 = binaryEntityMap14.name(0);
        java.lang.String str27 = binaryEntityMap14.name(10);
        java.lang.String str29 = binaryEntityMap14.name((int) 'a');
        binaryEntityMap14.add("", 0);
        entities0.map = binaryEntityMap14;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.growBy = 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str9 = binaryEntityMap7.name((-1));
        int[] intArray10 = binaryEntityMap7.values;
        binaryEntityMap1.values = intArray10;
        int int12 = binaryEntityMap1.growBy;
        binaryEntityMap1.growBy = (short) 1;
        binaryEntityMap1.ensureCapacity((int) (short) -1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        int int4 = binaryEntityMap1.growBy;
        int int5 = binaryEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray7 = new int[] { (short) -1, 10 };
        arrayEntityMap1.values = intArray7;
        java.lang.String str10 = arrayEntityMap1.name((int) (short) 10);
        int int11 = arrayEntityMap1.size;
        arrayEntityMap1.growBy = 2;
        java.lang.Class<?> wildcardClass14 = arrayEntityMap1.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 10 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        int int4 = binaryEntityMap1.size;
        binaryEntityMap1.size = 'a';
        int int7 = binaryEntityMap1.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap9.ensureCapacity((-1));
        binaryEntityMap9.growBy = 10;
        java.lang.String str15 = binaryEntityMap9.name((int) (byte) -1);
        binaryEntityMap9.add("hi!", 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap20.add("", (int) ' ');
        binaryEntityMap20.add("hi!", (int) (short) 1);
        int[] intArray27 = binaryEntityMap20.values;
        int int28 = binaryEntityMap20.growBy;
        java.lang.String[] strArray29 = binaryEntityMap20.names;
        binaryEntityMap9.names = strArray29;
        binaryEntityMap1.names = strArray29;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = binaryEntityMap1.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        java.lang.String str6 = entities0.escape("");
        java.lang.String str8 = entities0.entityName(100);
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.growBy = 52;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int20 = arrayEntityMap18.value("hi!");
        int int21 = arrayEntityMap18.growBy;
        int int23 = arrayEntityMap18.value("hi!");
        int int25 = arrayEntityMap18.value("hi!");
        java.lang.String str27 = arrayEntityMap18.name(10);
        java.lang.String[] strArray28 = arrayEntityMap18.names;
        arrayEntityMap1.names = strArray28;
        arrayEntityMap1.add("", (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { null });
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        java.lang.String str89 = treeEntityMap0.name(0);
        int int91 = treeEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = binaryEntityMap0.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap3 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray6 = new int[] { ' ', '4' };
        binaryEntityMap3.values = intArray6;
        int int9 = binaryEntityMap3.value("");
        java.lang.String[] strArray10 = binaryEntityMap3.names;
        binaryEntityMap0.names = strArray10;
        java.lang.Class<?> wildcardClass12 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 100);
        int int2 = binaryEntityMap1.growBy;
        binaryEntityMap1.ensureCapacity(0);
        int int5 = binaryEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = null;
        binaryEntityMap0.values = intArray1;
        binaryEntityMap0.size = 35;
        int int5 = binaryEntityMap0.size;
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities6.map;
        java.lang.String str9 = entities6.unescape("hi!");
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities10.map;
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities10.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap14.add("hi!", 0);
        arrayEntityMap14.size = (byte) 1;
        arrayEntityMap14.growBy = 100;
        java.lang.String str23 = arrayEntityMap14.name((int) (byte) 1);
        entities10.map = arrayEntityMap14;
        entities6.map = arrayEntityMap14;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str29 = binaryEntityMap27.name(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap31 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray34 = new int[] { ' ', '4' };
        binaryEntityMap31.values = intArray34;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray38 = arrayEntityMap37.values;
        java.lang.String str40 = arrayEntityMap37.name((int) (short) 100);
        int[] intArray43 = new int[] { (short) -1, 10 };
        arrayEntityMap37.values = intArray43;
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        arrayEntityMap37.names = strArray46;
        binaryEntityMap31.names = strArray46;
        binaryEntityMap27.names = strArray46;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap51 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int53 = arrayEntityMap51.value("");
        java.lang.String[] strArray54 = arrayEntityMap51.names;
        int[] intArray55 = arrayEntityMap51.values;
        binaryEntityMap27.values = intArray55;
        java.lang.String str58 = binaryEntityMap27.name((int) (short) -1);
        entities6.map = binaryEntityMap27;
        java.lang.String str61 = entities6.entityName((int) (byte) 10);
        java.lang.String str63 = entities6.escape("hi!");
        entities6.addEntity("", 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap68 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap68.add("hi!", (-1));
        binaryEntityMap68.ensureCapacity((int) 'a');
        entities6.map = binaryEntityMap68;
        java.lang.String[] strArray75 = binaryEntityMap68.names;
        binaryEntityMap0.names = strArray75;
        binaryEntityMap0.growBy = '#';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 0 });
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 0 });
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(strArray75);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        int int17 = arrayEntityMap1.size;
        arrayEntityMap1.size = (short) 1;
        java.lang.String[] strArray20 = arrayEntityMap1.names;
        java.lang.Class<?> wildcardClass21 = arrayEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.growBy = 10;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) -1);
        binaryEntityMap1.add("hi!", 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap12.add("", (int) ' ');
        binaryEntityMap12.add("hi!", (int) (short) 1);
        int[] intArray19 = binaryEntityMap12.values;
        int int20 = binaryEntityMap12.growBy;
        java.lang.String[] strArray21 = binaryEntityMap12.names;
        binaryEntityMap1.names = strArray21;
        java.lang.String str24 = binaryEntityMap1.name(32);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        java.lang.String str6 = arrayEntityMap1.name(32);
        java.lang.String str8 = arrayEntityMap1.name(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int10 = binaryEntityMap1.value("hi!");
        int int12 = binaryEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap14.add("", (int) ' ');
        binaryEntityMap14.add("hi!", (int) (short) 1);
        int[] intArray21 = binaryEntityMap14.values;
        binaryEntityMap1.values = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[32]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str34 = binaryEntityMap32.name((-1));
        int[] intArray35 = binaryEntityMap32.values;
        arrayEntityMap1.values = intArray35;
        java.lang.String str38 = arrayEntityMap1.name((int) (short) -1);
        int[] intArray39 = arrayEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(intArray39);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.lang.String str5 = hashEntityMap0.name((int) 'a');
        java.lang.String str7 = hashEntityMap0.name((int) (short) 0);
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        java.lang.String str10 = hashEntityMap0.name(1);
        java.util.Map map11 = null;
        hashEntityMap0.mapNameToValue = map11;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.lang.String str17 = hashEntityMap13.name((int) '4');
        java.util.Map map18 = hashEntityMap13.mapValueToName;
        java.util.Map map19 = hashEntityMap13.mapValueToName;
        hashEntityMap0.mapNameToValue = map19;
        hashEntityMap0.add("hi!", 10);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        org.apache.commons.lang.Entities entities21 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray24 = arrayEntityMap23.values;
        java.lang.String str26 = arrayEntityMap23.name((int) (short) 100);
        int[] intArray29 = new int[] { (short) -1, 10 };
        arrayEntityMap23.values = intArray29;
        entities21.map = arrayEntityMap23;
        entities0.map = arrayEntityMap23;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 52, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(entities21);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0 });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 34, 10 });
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        arrayEntityMap1.add("", (int) (byte) 10);
        arrayEntityMap1.ensureCapacity(1);
        java.lang.String str10 = arrayEntityMap1.name((int) (byte) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray15 = new int[] { ' ', '4' };
        binaryEntityMap12.values = intArray15;
        binaryEntityMap12.growBy = (byte) -1;
        binaryEntityMap12.growBy = 'a';
        binaryEntityMap12.size = (byte) 0;
        java.lang.String str24 = binaryEntityMap12.name(2);
        java.lang.String[] strArray25 = binaryEntityMap12.names;
        java.lang.String[] strArray26 = binaryEntityMap12.names;
        arrayEntityMap1.names = strArray26;
        java.lang.Class<?> wildcardClass28 = arrayEntityMap1.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        binaryEntityMap1.add("", (int) (byte) 1);
        int[] intArray9 = binaryEntityMap1.values;
        int int10 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap55.add("", (int) (byte) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = null;
        hashEntityMap59.mapNameToValue = map60;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map63 = null;
        hashEntityMap62.mapNameToValue = map63;
        java.lang.String str66 = hashEntityMap62.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map68 = null;
        hashEntityMap67.mapNameToValue = map68;
        java.util.Map map70 = null;
        hashEntityMap67.mapNameToValue = map70;
        java.util.Map map72 = null;
        hashEntityMap67.mapNameToValue = map72;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap74 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map75 = null;
        hashEntityMap74.mapNameToValue = map75;
        java.util.Map map77 = null;
        hashEntityMap74.mapNameToValue = map77;
        java.util.Map map79 = null;
        hashEntityMap74.mapNameToValue = map79;
        java.util.Map map81 = hashEntityMap74.mapValueToName;
        hashEntityMap67.mapNameToValue = map81;
        hashEntityMap62.mapNameToValue = map81;
        hashEntityMap59.mapValueToName = map81;
        hashEntityMap55.mapValueToName = map81;
        hashEntityMap0.mapNameToValue = map81;
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
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap2 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        java.lang.String str5 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        arrayEntityMap1.size = (byte) 1;
        java.lang.String str14 = arrayEntityMap1.name(32);
        arrayEntityMap1.size = 0;
        arrayEntityMap1.add("", (int) (byte) 10);
        int int20 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 10, 52 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        java.lang.String str10 = binaryEntityMap1.name((int) (byte) 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        arrayEntityMap19.size = (byte) 10;
        int int24 = arrayEntityMap19.growBy;
        entities0.map = arrayEntityMap19;
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for object array[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        int int6 = binaryEntityMap1.size;
        binaryEntityMap1.growBy = (short) 1;
        binaryEntityMap1.size = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) '4');
        int int10 = binaryEntityMap1.size;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        java.util.Map map17 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap18.add("", (int) (byte) 100);
        java.util.Map map22 = hashEntityMap18.mapNameToValue;
        hashEntityMap0.mapNameToValue = map22;
        hashEntityMap0.add("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("", (int) (short) 10);
        java.lang.String str7 = entities0.escape("hi!");
        java.lang.String str9 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        int int12 = entityMap10.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(entityMap10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.lang.String str2 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray7 = new int[] { ' ', '4' };
        binaryEntityMap4.values = intArray7;
        java.lang.String str10 = binaryEntityMap4.name((int) (byte) 100);
        binaryEntityMap4.add("hi!", (-1));
        java.lang.String str15 = binaryEntityMap4.name(0);
        entities0.map = binaryEntityMap4;
        java.lang.String[] strArray17 = binaryEntityMap4.names;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        int int4 = binaryEntityMap1.size;
        java.lang.String str6 = binaryEntityMap1.name((int) (byte) -1);
        binaryEntityMap1.size = 32;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = 100;
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.growBy = (short) 1;
        int[] intArray10 = arrayEntityMap1.values;
        java.lang.String[] strArray11 = arrayEntityMap1.names;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = arrayEntityMap1.name((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { null });
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        binaryEntityMap1.add("hi!", 10);
        java.lang.String str13 = binaryEntityMap1.name(52);
        int int14 = binaryEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        binaryEntityMap1.add("", 1);
        binaryEntityMap1.ensureCapacity((int) (byte) 10);
        binaryEntityMap1.add("", 0);
        java.lang.String str18 = binaryEntityMap1.name((int) (byte) 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        arrayEntityMap1.add("hi!", (int) (byte) 10);
        java.lang.String str7 = arrayEntityMap1.name(100);
        arrayEntityMap1.add("", (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '4');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap3 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int5 = binaryEntityMap3.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        java.lang.String str10 = arrayEntityMap7.name((int) (short) 100);
        int[] intArray13 = new int[] { (short) -1, 10 };
        arrayEntityMap7.values = intArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        arrayEntityMap7.names = strArray16;
        binaryEntityMap3.names = strArray16;
        binaryEntityMap1.names = strArray16;
        binaryEntityMap1.add("", 100);
        int[] intArray23 = null;
        binaryEntityMap1.values = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        int int9 = arrayEntityMap1.value("");
        java.lang.String str11 = arrayEntityMap1.name((int) (short) 0);
        java.lang.String str13 = arrayEntityMap1.name((int) '#');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap15.add("hi!", 0);
        arrayEntityMap15.size = (byte) 1;
        arrayEntityMap15.growBy = 100;
        java.lang.String[] strArray23 = arrayEntityMap15.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap25.add("hi!", 0);
        arrayEntityMap25.size = (byte) 1;
        arrayEntityMap25.growBy = 100;
        java.lang.String[] strArray33 = arrayEntityMap25.names;
        arrayEntityMap15.names = strArray33;
        java.lang.String str36 = arrayEntityMap15.name(1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap38 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap38.ensureCapacity(0);
        binaryEntityMap38.ensureCapacity(100);
        binaryEntityMap38.add("", (int) (byte) 1);
        int[] intArray49 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap38.values = intArray49;
        arrayEntityMap15.values = intArray49;
        arrayEntityMap1.values = intArray49;
        arrayEntityMap1.growBy = 52;
        arrayEntityMap1.add("", (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 97, 1, 32 });
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        java.lang.String str12 = binaryEntityMap1.name(10);
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap37 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray40 = new int[] { ' ', '4' };
        binaryEntityMap37.values = intArray40;
        binaryEntityMap37.size = '#';
        int[] intArray44 = binaryEntityMap37.values;
        arrayEntityMap21.values = intArray44;
        binaryEntityMap1.values = intArray44;
        int int48 = binaryEntityMap1.value("");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32 + "'", int48 == 32);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        binaryEntityMap1.size = 97;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10 });
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
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
        java.lang.String str35 = lookupEntityMap28.name((int) (short) 100);
        int int37 = lookupEntityMap28.value("hi!");
        int int39 = lookupEntityMap28.value("hi!");
        java.lang.String str41 = lookupEntityMap28.name((int) (short) 10);
        lookupEntityMap28.add("hi!", (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        java.lang.String str5 = arrayEntityMap1.name((int) (byte) 0);
        java.lang.String[] strArray6 = arrayEntityMap1.names;
        arrayEntityMap1.size = (-1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { null });
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray20 = arrayEntityMap19.values;
        java.lang.String str22 = arrayEntityMap19.name((int) (short) 100);
        int[] intArray25 = new int[] { (short) -1, 10 };
        arrayEntityMap19.values = intArray25;
        binaryEntityMap1.values = intArray25;
        java.lang.String[] strArray28 = binaryEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0 });
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        int int4 = binaryEntityMap1.growBy;
        java.lang.String[] strArray5 = binaryEntityMap1.names;
        binaryEntityMap1.add("hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
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
        java.lang.String str17 = entities0.entityName((int) '4');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int27 = arrayEntityMap25.value("");
        java.lang.String[] strArray28 = arrayEntityMap25.names;
        int[] intArray29 = arrayEntityMap25.values;
        binaryEntityMap1.values = intArray29;
        java.lang.String str32 = binaryEntityMap1.name((int) (short) -1);
        binaryEntityMap1.growBy = 0;
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 0 });
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int12 = arrayEntityMap10.value("");
        java.lang.String[] strArray13 = arrayEntityMap10.names;
        int[] intArray14 = arrayEntityMap10.values;
        binaryEntityMap1.values = intArray14;
        java.lang.String[] strArray16 = binaryEntityMap1.names;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        java.lang.String[] strArray4 = arrayEntityMap1.names;
        int[] intArray5 = arrayEntityMap1.values;
        arrayEntityMap1.growBy = (-1);
        java.lang.String[] strArray8 = arrayEntityMap1.names;
        arrayEntityMap1.growBy = 'a';
        int int12 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray15 = arrayEntityMap14.values;
        java.lang.String str17 = arrayEntityMap14.name((int) (short) 100);
        arrayEntityMap14.size = (byte) 0;
        arrayEntityMap14.ensureCapacity((int) (byte) 1);
        arrayEntityMap14.size = 2;
        java.lang.String[] strArray24 = arrayEntityMap14.names;
        arrayEntityMap1.names = strArray24;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { null });
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        int int9 = arrayEntityMap1.value("");
        java.lang.String str11 = arrayEntityMap1.name((int) (short) 0);
        java.lang.String str13 = arrayEntityMap1.name((int) '#');
        arrayEntityMap1.size = 100;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for object array[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        int[] intArray4 = arrayEntityMap1.values;
        arrayEntityMap1.add("", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities13);
        org.apache.commons.lang.Entities entities34 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray35 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities34.addEntities(strArray35);
        entities13.addEntities(strArray35);
        entities0.addEntities(strArray35);
        java.lang.String str40 = entities0.entityName(10);
        org.apache.commons.lang.Entities.EntityMap entityMap41 = entities0.map;
        java.lang.String str43 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str46 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 160, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(entities34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(entityMap41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        java.util.Map map2 = null;
        hashEntityMap0.mapNameToValue = map2;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hashEntityMap0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", 100);
        java.lang.String str7 = entities0.entityName((int) (byte) 100);
        java.lang.String str9 = entities0.escape("hi!");
        java.io.Writer writer10 = null;
        entities0.escape(writer10, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray15 = arrayEntityMap14.values;
        java.lang.String str17 = arrayEntityMap14.name((int) (short) 100);
        arrayEntityMap14.size = (byte) 0;
        arrayEntityMap14.add("", (int) (short) -1);
        int[] intArray23 = arrayEntityMap14.values;
        int int25 = arrayEntityMap14.value("");
        entities0.map = arrayEntityMap14;
        java.io.Writer writer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer27, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1) });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("hi!", 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = 100;
        java.lang.String[] strArray9 = arrayEntityMap1.names;
        int[] intArray10 = null;
        arrayEntityMap1.values = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = arrayEntityMap1.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) 'a');
        int int4 = lookupEntityMap0.value("hi!");
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = lookupEntityMap0.name((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.size = 0;
        java.lang.String str10 = binaryEntityMap1.name((int) 'a');
        java.lang.String str12 = binaryEntityMap1.name(10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        java.util.Map map80 = hashEntityMap0.mapValueToName;
        java.lang.String str82 = hashEntityMap0.name((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = 100;
        int int9 = arrayEntityMap1.growBy;
        java.lang.Class<?> wildcardClass10 = arrayEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("hi!", (int) (short) 10);
        java.lang.String str19 = lookupEntityMap0.name((int) (byte) 100);
        lookupEntityMap0.add("hi!", (int) (short) -1);
        java.lang.String str24 = lookupEntityMap0.name((int) '#');
        int int26 = lookupEntityMap0.value("hi!");
        java.lang.String str28 = lookupEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        java.lang.String str7 = arrayEntityMap1.name(52);
        int int9 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities10.map;
        java.lang.String str13 = entities10.unescape("hi!");
        org.apache.commons.lang.Entities entities14 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities14.map;
        org.apache.commons.lang.Entities.EntityMap entityMap16 = entities14.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap18.add("hi!", 0);
        arrayEntityMap18.size = (byte) 1;
        arrayEntityMap18.growBy = 100;
        java.lang.String str27 = arrayEntityMap18.name((int) (byte) 1);
        entities14.map = arrayEntityMap18;
        entities10.map = arrayEntityMap18;
        arrayEntityMap18.add("hi!", 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray37 = new int[] { ' ', '4' };
        binaryEntityMap34.values = intArray37;
        binaryEntityMap34.size = '#';
        int[] intArray41 = binaryEntityMap34.values;
        arrayEntityMap18.values = intArray41;
        arrayEntityMap1.values = intArray41;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { null });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(entities14);
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertNotNull(entityMap16);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 32, 52 });
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.growBy = 10;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) -1);
        binaryEntityMap1.add("hi!", 100);
        binaryEntityMap1.add("", 52);
        binaryEntityMap1.ensureCapacity((int) (short) 0);
        int[] intArray16 = binaryEntityMap1.values;
        binaryEntityMap1.ensureCapacity((int) (short) 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 52, 100, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        entities0.addEntity("", (int) (byte) 1);
        int int10 = entities0.entityValue("");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        java.util.Map map55 = null;
        hashEntityMap0.mapValueToName = map55;
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("hi!", 97);
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
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        int int3 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.ensureCapacity(0);
        int[] intArray6 = arrayEntityMap1.values;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) 'a');
        int int4 = lookupEntityMap0.value("hi!");
        int int6 = lookupEntityMap0.value("hi!");
        int int8 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 100);
        java.lang.String str13 = lookupEntityMap0.name((int) (short) 1);
        int int15 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        java.util.Map map50 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(map50);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        java.lang.String str11 = binaryEntityMap1.name((int) (byte) 10);
        java.lang.String str13 = binaryEntityMap1.name((int) (byte) -1);
        java.lang.String str15 = binaryEntityMap1.name(1);
        int[] intArray16 = binaryEntityMap1.values;
        int int17 = binaryEntityMap1.size;
        java.lang.String str19 = binaryEntityMap1.name(10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap49 = new org.apache.commons.lang.Entities.TreeEntityMap();
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
        treeEntityMap49.mapValueToName = map64;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map68 = null;
        hashEntityMap67.mapNameToValue = map68;
        java.lang.String str71 = hashEntityMap67.name((int) '4');
        java.lang.String str73 = hashEntityMap67.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap74 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map75 = null;
        hashEntityMap74.mapNameToValue = map75;
        java.util.Map map77 = null;
        hashEntityMap74.mapNameToValue = map77;
        java.util.Map map79 = null;
        hashEntityMap74.mapNameToValue = map79;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap81 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map82 = null;
        hashEntityMap81.mapNameToValue = map82;
        java.util.Map map84 = null;
        hashEntityMap81.mapNameToValue = map84;
        java.util.Map map86 = null;
        hashEntityMap81.mapNameToValue = map86;
        java.util.Map map88 = hashEntityMap81.mapValueToName;
        hashEntityMap74.mapNameToValue = map88;
        hashEntityMap67.mapValueToName = map88;
        treeEntityMap49.mapNameToValue = map88;
        hashEntityMap0.mapNameToValue = map88;
        hashEntityMap0.add("hi!", (int) '#');
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(map88);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        int int35 = hashEntityMap0.value("hi!");
        java.lang.String str37 = hashEntityMap0.name((int) (byte) -1);
        hashEntityMap0.add("", 10);
        java.lang.String str42 = hashEntityMap0.name(35);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", (int) '#');
        java.lang.String str12 = binaryEntityMap1.name(0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        int int2 = arrayEntityMap1.growBy;
        int int4 = arrayEntityMap1.value("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        arrayEntityMap1.add("hi!", 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 52 });
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap1 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap1.add("hi!", (int) (short) 1);
        int int6 = lookupEntityMap1.value("hi!");
        int int8 = lookupEntityMap1.value("");
        java.lang.String str10 = lookupEntityMap1.name((int) (byte) 1);
        lookupEntityMap1.add("hi!", 10);
        entities0.map = lookupEntityMap1;
        java.lang.String str16 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap18.growBy = (-1);
        int[] intArray21 = arrayEntityMap18.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap23.add("hi!", 0);
        arrayEntityMap23.size = (byte) 1;
        arrayEntityMap23.growBy = 100;
        java.lang.String[] strArray31 = arrayEntityMap23.names;
        arrayEntityMap18.names = strArray31;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray37 = new int[] { ' ', '4' };
        binaryEntityMap34.values = intArray37;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap40 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray41 = arrayEntityMap40.values;
        java.lang.String str43 = arrayEntityMap40.name((int) (short) 100);
        int[] intArray46 = new int[] { (short) -1, 10 };
        arrayEntityMap40.values = intArray46;
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        arrayEntityMap40.names = strArray49;
        binaryEntityMap34.names = strArray49;
        arrayEntityMap18.names = strArray49;
        entities0.map = arrayEntityMap18;
        int int55 = arrayEntityMap18.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(intArray21);
// flaky "7) test2381(org.apache.commons.lang.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray21, new int[] { 160 });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 0 });
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray49);
// flaky "2) test2381(org.apache.commons.lang.RegressionTest4)":         org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "nbsp" });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        java.lang.String str22 = hashEntityMap0.name((int) (short) 10);
        java.util.Map map23 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        java.util.Map map10 = hashEntityMap0.mapValueToName;
        int int12 = hashEntityMap0.value("hi!");
        int int14 = hashEntityMap0.value("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str6 = binaryEntityMap4.name((-1));
        entities0.map = binaryEntityMap4;
        java.lang.String[][] strArray8 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray8);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        arrayEntityMap1.size = 35;
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
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        binaryEntityMap1.add("", 1);
        binaryEntityMap1.ensureCapacity((int) (byte) 10);
        binaryEntityMap1.add("", 0);
        int int18 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("");
        int int7 = arrayEntityMap1.size;
        java.lang.String[] strArray8 = arrayEntityMap1.names;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { null });
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.add("", 0);
        binaryEntityMap1.add("hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        int int13 = lookupEntityMap0.value("");
        int int15 = lookupEntityMap0.value("hi!");
        int int17 = lookupEntityMap0.value("");
        int int19 = lookupEntityMap0.value("");
        java.lang.String str21 = lookupEntityMap0.name(97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.entityName((int) (short) 0);
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        org.apache.commons.lang.Entities entities12 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str14 = entities12.entityName((int) '#');
// flaky "8) test2390(org.apache.commons.lang.RegressionTest4)":         entities12.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap18 = entities12.map;
        java.io.Writer writer19 = null;
        entities12.escape(writer19, "");
        org.apache.commons.lang.Entities entities22 = org.apache.commons.lang.Entities.HTML32;
        int int24 = entities22.entityValue("");
        java.lang.String[][] strArray25 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities22.addEntities(strArray25);
// flaky "3) test2390(org.apache.commons.lang.RegressionTest4)":         entities12.addEntities(strArray25);
        entities0.addEntities(strArray25);
        java.io.Writer writer29 = null;
        entities0.escape(writer29, "");
        java.lang.String str33 = entities0.entityName((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entities12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap29 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str31 = lookupEntityMap29.name(0);
        java.lang.String str33 = lookupEntityMap29.name(0);
        int int35 = lookupEntityMap29.value("");
        lookupEntityMap29.add("hi!", 10);
        java.lang.String str40 = lookupEntityMap29.name((int) '#');
        java.lang.String str42 = lookupEntityMap29.name((int) (short) 1);
        entities0.map = lookupEntityMap29;
        java.lang.String str45 = lookupEntityMap29.name(0);
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.io.Writer writer2 = null;
        entities0.escape(writer2, "");
        entities0.addEntity("", (int) (short) 0);
        java.lang.String str9 = entities0.unescape("");
        java.lang.String str11 = entities0.unescape("");
        java.lang.String str13 = entities0.unescape("hi!");
        int int15 = entities0.entityValue("");
        java.lang.String str17 = entities0.unescape("hi!");
        int int19 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.entityName(10);
        org.apache.commons.lang.Entities entities15 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray16 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities15.addEntities(strArray16);
        entities0.addEntities(strArray16);
        java.lang.String str20 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 160, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(entities15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(10);
        java.lang.String str12 = lookupEntityMap0.name((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
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
        java.util.Map map34 = null;
        hashEntityMap31.mapNameToValue = map34;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = null;
        hashEntityMap37.mapNameToValue = map38;
        java.lang.String str41 = hashEntityMap37.name((int) '4');
        java.util.Map map42 = hashEntityMap37.mapValueToName;
        hashEntityMap36.mapValueToName = map42;
        java.util.Map map44 = hashEntityMap36.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = null;
        hashEntityMap46.mapNameToValue = map47;
        java.lang.String str50 = hashEntityMap46.name((int) '4');
        java.util.Map map51 = hashEntityMap46.mapValueToName;
        hashEntityMap45.mapValueToName = map51;
        java.util.Map map53 = hashEntityMap45.mapValueToName;
        hashEntityMap36.mapNameToValue = map53;
        java.util.Map map55 = hashEntityMap36.mapValueToName;
        hashEntityMap31.mapValueToName = map55;
        hashEntityMap0.mapNameToValue = map55;
        int int59 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        java.util.Map map6 = hashEntityMap0.mapValueToName;
        java.lang.String str8 = hashEntityMap0.name(35);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 2 out of bounds for int[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("hi!");
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 100);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
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
        int int21 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities entities22 = org.apache.commons.lang.Entities.HTML40;
        entities22.addEntity("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = hashEntityMap26.mapValueToName;
        java.util.Map map28 = hashEntityMap26.mapNameToValue;
        entities22.map = hashEntityMap26;
        int int31 = hashEntityMap26.value("");
        int int33 = hashEntityMap26.value("hi!");
        java.util.Map map34 = hashEntityMap26.mapNameToValue;
        hashEntityMap0.mapValueToName = map34;
        hashEntityMap0.add("hi!", 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap2 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map3 = hashEntityMap2.mapValueToName;
        java.util.Map map4 = null;
        hashEntityMap2.mapNameToValue = map4;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap6 = new org.apache.commons.lang.Entities.TreeEntityMap();
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
        treeEntityMap6.mapValueToName = map21;
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
        treeEntityMap6.mapNameToValue = map45;
        hashEntityMap2.mapValueToName = map45;
        java.lang.String str51 = hashEntityMap2.name(100);
        java.util.Map map52 = hashEntityMap2.mapValueToName;
        java.util.Map map53 = hashEntityMap2.mapValueToName;
        hashEntityMap0.mapValueToName = map53;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
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
        java.util.Map map40 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", 2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        int int4 = binaryEntityMap1.growBy;
        binaryEntityMap1.size = (short) 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap3.add("hi!", 0);
        arrayEntityMap3.size = (byte) 1;
        arrayEntityMap3.size = (-1);
        arrayEntityMap3.size = (byte) 10;
        entities0.map = arrayEntityMap3;
        entities0.addEntity("", (int) (short) 0);
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap17);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        int int2 = binaryEntityMap1.size;
        binaryEntityMap1.add("", (int) (short) 1);
        int int6 = binaryEntityMap1.growBy;
        binaryEntityMap1.add("", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str6 = binaryEntityMap4.name((-1));
        entities0.map = binaryEntityMap4;
        entities0.addEntity("", 2);
        java.lang.String str12 = entities0.escape("hi!");
        java.io.Writer writer13 = null;
        entities0.escape(writer13, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.growBy = 10;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) -1);
        java.lang.String[] strArray8 = binaryEntityMap1.names;
        int[] intArray9 = binaryEntityMap1.values;
        binaryEntityMap1.size = (byte) 10;
        binaryEntityMap1.ensureCapacity(2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", (int) (short) 100);
        int[] intArray11 = binaryEntityMap1.values;
        int int12 = binaryEntityMap1.size;
        java.lang.String[] strArray13 = binaryEntityMap1.names;
        java.lang.String str15 = binaryEntityMap1.name((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, 52 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        int int5 = arrayEntityMap1.size;
        java.lang.String[] strArray6 = null;
        arrayEntityMap1.names = strArray6;
        java.lang.String str9 = arrayEntityMap1.name((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        java.lang.String str12 = entities0.escape("hi!");
        entities0.addEntity("hi!", 35);
        java.lang.String str17 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap18 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 35, 10 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(entityMap18);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        java.util.Map map22 = treeEntityMap0.mapNameToValue;
        treeEntityMap0.add("", 97);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.add("", (int) '4');
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) -1);
        java.lang.String[] strArray9 = binaryEntityMap1.names;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", null, null, null, null, null, null, null, null, null });
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(10);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str9 = lookupEntityMap0.name((int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
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
        int int37 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        java.lang.String str5 = lookupEntityMap0.name(0);
        java.lang.String str7 = lookupEntityMap0.name((int) (byte) 10);
        int int9 = lookupEntityMap0.value("");
        int int11 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = 100;
        java.lang.String[] strArray9 = arrayEntityMap1.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap11.add("hi!", 0);
        arrayEntityMap11.size = (byte) 1;
        arrayEntityMap11.growBy = 100;
        java.lang.String[] strArray19 = arrayEntityMap11.names;
        arrayEntityMap1.names = strArray19;
        arrayEntityMap1.size = (short) 0;
        arrayEntityMap1.add("hi!", 0);
        java.lang.String str27 = arrayEntityMap1.name(10);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        java.lang.String str11 = hashEntityMap0.name((int) 'a');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
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
        arrayEntityMap1.growBy = 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
        java.util.Map map34 = hashEntityMap0.mapValueToName;
        java.lang.String str36 = hashEntityMap0.name((int) (byte) 100);
        hashEntityMap0.add("", (int) 'a');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        java.lang.String str28 = binaryEntityMap1.name((int) (short) 1);
        int int29 = binaryEntityMap1.size;
        int int30 = binaryEntityMap1.size;
        java.lang.String str32 = binaryEntityMap1.name(32);
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
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        arrayEntityMap1.growBy = 10;
        int int8 = arrayEntityMap1.size;
        int int10 = arrayEntityMap1.value("");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap2 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap4.add("hi!", 0);
        arrayEntityMap4.size = (byte) 1;
        arrayEntityMap4.growBy = 100;
        java.lang.String str13 = arrayEntityMap4.name((int) (byte) 1);
        entities0.map = arrayEntityMap4;
        java.lang.String str16 = arrayEntityMap4.name(100);
        java.lang.String str18 = arrayEntityMap4.name(97);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) '4');
        java.lang.String str7 = entities0.unescape("");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
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
        java.lang.String str35 = lookupEntityMap28.name((int) (short) 100);
        int int37 = lookupEntityMap28.value("hi!");
        java.lang.String str39 = lookupEntityMap28.name((int) '4');
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("hi!", (int) (byte) 1);
        java.lang.String str19 = lookupEntityMap0.name((int) (byte) 0);
        java.lang.String str21 = lookupEntityMap0.name(35);
        int int23 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        binaryEntityMap1.add("", 1);
        binaryEntityMap1.size = (short) 1;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        int int2 = binaryEntityMap1.size;
        binaryEntityMap1.add("", (int) (short) 1);
        int[] intArray6 = binaryEntityMap1.values;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1 });
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray17 = new int[] { ' ', '4' };
        binaryEntityMap14.values = intArray17;
        binaryEntityMap14.growBy = (byte) -1;
        binaryEntityMap14.growBy = 'a';
        binaryEntityMap14.size = (byte) 0;
        java.lang.String str26 = binaryEntityMap14.name(2);
        java.lang.String[] strArray27 = binaryEntityMap14.names;
        java.lang.String[] strArray28 = binaryEntityMap14.names;
        entities0.map = binaryEntityMap14;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
// flaky "9) test2427(org.apache.commons.lang.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray17, new int[] { 160, 161 });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        int int13 = lookupEntityMap0.value("hi!");
        int int15 = lookupEntityMap0.value("hi!");
        java.lang.String str17 = lookupEntityMap0.name((int) (short) 1);
        int int19 = lookupEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int6 = binaryEntityMap1.growBy;
        int int7 = binaryEntityMap1.growBy;
        int int9 = binaryEntityMap1.value("hi!");
        int[] intArray10 = null;
        binaryEntityMap1.values = intArray10;
        java.lang.String str13 = binaryEntityMap1.name(1);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
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
        org.apache.commons.lang.Entities.EntityMap entityMap23 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(entityMap23);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = binaryEntityMap0.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap3 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray6 = new int[] { ' ', '4' };
        binaryEntityMap3.values = intArray6;
        int int9 = binaryEntityMap3.value("");
        java.lang.String[] strArray10 = binaryEntityMap3.names;
        binaryEntityMap0.names = strArray10;
        int int13 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        java.lang.String str51 = entities0.entityName(0);
        org.apache.commons.lang.Entities.EntityMap entityMap52 = entities0.map;
        entities0.addEntity("hi!", 52);
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
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(entityMap52);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = (short) -1;
        binaryEntityMap1.add("hi!", 100);
        org.apache.commons.lang.Entities entities14 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities14.map;
        java.lang.String str17 = entities14.unescape("hi!");
        org.apache.commons.lang.Entities entities18 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities18.map;
        org.apache.commons.lang.Entities.EntityMap entityMap20 = entities18.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap22.add("hi!", 0);
        arrayEntityMap22.size = (byte) 1;
        arrayEntityMap22.growBy = 100;
        java.lang.String str31 = arrayEntityMap22.name((int) (byte) 1);
        entities18.map = arrayEntityMap22;
        entities14.map = arrayEntityMap22;
        int[] intArray34 = arrayEntityMap22.values;
        int int35 = arrayEntityMap22.size;
        int[] intArray36 = arrayEntityMap22.values;
        binaryEntityMap1.values = intArray36;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(entities14);
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(entities18);
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertNotNull(entityMap20);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        int int4 = binaryEntityMap1.size;
        binaryEntityMap1.add("", (int) (short) 1);
        int int8 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        int[] intArray23 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = (short) -1;
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 97, 52 });
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("");
        int int4 = hashEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap1.name(100);
        int int7 = binaryEntityMap1.growBy;
        binaryEntityMap1.add("hi!", 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(10);
        binaryEntityMap1.size = 2;
        int int4 = binaryEntityMap1.growBy;
        binaryEntityMap1.size = (-1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("", 32);
        int int19 = lookupEntityMap0.value("hi!");
        int int21 = lookupEntityMap0.value("");
        int int23 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.growBy = (byte) -1;
        binaryEntityMap1.growBy = 'a';
        binaryEntityMap1.size = (byte) 0;
        binaryEntityMap1.add("hi!", (int) 'a');
        int[] intArray15 = binaryEntityMap1.values;
        java.lang.String[] strArray16 = binaryEntityMap1.names;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 52 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 97, 52 });
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        java.util.Map map22 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        arrayEntityMap1.growBy = 10;
        arrayEntityMap1.add("hi!", 52);
        arrayEntityMap1.growBy = (short) 1;
        java.lang.String str13 = arrayEntityMap1.name((int) ' ');
        int int15 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        java.lang.String str46 = treeEntityMap0.name((int) 'a');
        treeEntityMap0.add("hi!", 35);
        java.lang.String str51 = treeEntityMap0.name((int) (short) 1);
        java.lang.String str53 = treeEntityMap0.name((int) '4');
        int int55 = treeEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.size = 0;
        java.lang.String str10 = binaryEntityMap1.name(2);
        int int12 = binaryEntityMap1.value("");
        binaryEntityMap1.add("", 2);
        int int17 = binaryEntityMap1.value("");
        java.lang.String[] strArray18 = binaryEntityMap1.names;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        arrayEntityMap1.add("hi!", (int) (byte) 10);
        java.lang.String str7 = arrayEntityMap1.name(100);
        java.lang.String[] strArray8 = arrayEntityMap1.names;
        java.lang.String[] strArray9 = arrayEntityMap1.names;
        int[] intArray10 = arrayEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 10 });
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("hi!", (int) (byte) 1);
        binaryEntityMap1.add("hi!", (int) (byte) 10);
        java.lang.String str11 = binaryEntityMap1.name(32);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name(0);
        java.lang.String str11 = lookupEntityMap0.name(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap1.name(100);
        int int7 = binaryEntityMap1.growBy;
        java.lang.String str9 = binaryEntityMap1.name((int) (short) -1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("");
        java.lang.String str7 = entities0.entityName(0);
        java.io.Writer writer8 = null;
        entities0.escape(writer8, "");
        java.lang.String str12 = entities0.entityName(2);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray9 = arrayEntityMap8.values;
        int int10 = arrayEntityMap8.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap12.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray19 = new int[] { ' ', '4' };
        binaryEntityMap16.values = intArray19;
        arrayEntityMap12.values = intArray19;
        arrayEntityMap8.values = intArray19;
        arrayEntityMap1.values = intArray19;
        arrayEntityMap1.add("", 0);
        java.lang.String str28 = arrayEntityMap1.name(35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        int[] intArray7 = new int[] {};
        arrayEntityMap1.values = intArray7;
        arrayEntityMap1.growBy = (short) 100;
        int[] intArray11 = arrayEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] {});
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.add("", (int) (byte) 1);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        arrayEntityMap1.add("", (int) (byte) 10);
        arrayEntityMap1.ensureCapacity(1);
        java.lang.String str10 = arrayEntityMap1.name((int) (byte) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap(10);
        java.lang.String[] strArray13 = binaryEntityMap12.names;
        arrayEntityMap1.names = strArray13;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name(10);
        java.lang.String str12 = lookupEntityMap0.name(52);
        int int14 = lookupEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(10);
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 1);
        int int14 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 0);
        int int15 = binaryEntityMap1.size;
        int[] intArray16 = binaryEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0, 52 });
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (short) -1);
        int int5 = binaryEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap7.ensureCapacity((-1));
        binaryEntityMap7.growBy = 10;
        java.lang.String str13 = binaryEntityMap7.name((int) (byte) -1);
        java.lang.String[] strArray14 = binaryEntityMap7.names;
        int[] intArray15 = binaryEntityMap7.values;
        binaryEntityMap7.size = (byte) 10;
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
        int[] intArray38 = arrayEntityMap26.values;
        binaryEntityMap7.values = intArray38;
        java.lang.String str41 = binaryEntityMap7.name((int) (byte) -1);
        binaryEntityMap7.add("", 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap46 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray47 = arrayEntityMap46.values;
        int int48 = arrayEntityMap46.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap50 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap50.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap54 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray57 = new int[] { ' ', '4' };
        binaryEntityMap54.values = intArray57;
        arrayEntityMap50.values = intArray57;
        arrayEntityMap46.values = intArray57;
        java.lang.String str62 = arrayEntityMap46.name(1);
        int[] intArray63 = arrayEntityMap46.values;
        binaryEntityMap7.values = intArray63;
        binaryEntityMap1.values = intArray63;
        int int67 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(entities18);
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertNotNull(entityMap23);
        org.junit.Assert.assertNotNull(entityMap24);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        java.io.Writer writer11 = null;
        entities0.escape(writer11, "");
        org.apache.commons.lang.Entities entities14 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.lang.String str19 = hashEntityMap15.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.lang.String str24 = hashEntityMap20.name((int) '4');
        java.lang.String str26 = hashEntityMap20.name((int) (short) 100);
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
        hashEntityMap20.mapValueToName = map41;
        hashEntityMap15.mapValueToName = map41;
        entities14.map = hashEntityMap15;
        java.lang.String str47 = entities14.escape("hi!");
        java.lang.String str49 = entities14.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap51 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities14.map = arrayEntityMap51;
        java.io.Writer writer53 = null;
        entities14.escape(writer53, "");
        java.lang.String str57 = entities14.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities14);
        org.apache.commons.lang.Entities entities59 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap60 = entities59.map;
        java.lang.String str62 = entities59.unescape("hi!");
        org.apache.commons.lang.Entities entities63 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap64 = entities63.map;
        org.apache.commons.lang.Entities.EntityMap entityMap65 = entities63.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap67 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap67.add("hi!", 0);
        arrayEntityMap67.size = (byte) 1;
        arrayEntityMap67.growBy = 100;
        java.lang.String str76 = arrayEntityMap67.name((int) (byte) 1);
        entities63.map = arrayEntityMap67;
        entities59.map = arrayEntityMap67;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities59);
        org.apache.commons.lang.Entities entities80 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray81 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities80.addEntities(strArray81);
        entities59.addEntities(strArray81);
        entities14.addEntities(strArray81);
        entities0.addEntities(strArray81);
        entities0.addEntity("hi!", 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 160, 10 });
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(entities59);
        org.junit.Assert.assertNotNull(entityMap60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(entities63);
        org.junit.Assert.assertNotNull(entityMap64);
        org.junit.Assert.assertNotNull(entityMap65);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(entities80);
        org.junit.Assert.assertNotNull(strArray81);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 0);
        java.lang.String str5 = binaryEntityMap1.name(97);
        binaryEntityMap1.add("", (int) (short) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap9 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap9.add("hi!", (int) (short) 1);
        int int14 = lookupEntityMap9.value("hi!");
        lookupEntityMap9.add("", 100);
        java.lang.String str19 = lookupEntityMap9.name((int) (short) 100);
        lookupEntityMap9.add("hi!", 32);
        entities0.map = lookupEntityMap9;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name((int) '4');
        java.lang.String str12 = lookupEntityMap0.name(35);
        lookupEntityMap0.add("", 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        java.lang.String str6 = entities0.entityName(0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.util.Map map10 = hashEntityMap7.mapNameToValue;
        java.util.Map map11 = hashEntityMap7.mapValueToName;
        java.lang.String str13 = hashEntityMap7.name(10);
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map45 = null;
        hashEntityMap44.mapNameToValue = map45;
        java.util.Map map47 = null;
        hashEntityMap44.mapNameToValue = map47;
        java.util.Map map49 = null;
        hashEntityMap44.mapNameToValue = map49;
        java.util.Map map51 = hashEntityMap44.mapValueToName;
        java.util.Map map52 = hashEntityMap44.mapNameToValue;
        java.util.Map map53 = hashEntityMap44.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int56 = hashEntityMap54.value("");
        java.util.Map map57 = hashEntityMap54.mapValueToName;
        hashEntityMap44.mapValueToName = map57;
        hashEntityMap14.mapNameToValue = map57;
        hashEntityMap7.mapValueToName = map57;
        entities0.map = hashEntityMap7;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
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
        entities0.addEntity("", (int) (byte) 1);
        java.lang.String str22 = entities0.escape("");
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
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        int int6 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.ensureCapacity((int) (byte) 10);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        arrayEntityMap1.add("", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap6.add("hi!", 0);
        arrayEntityMap6.size = (byte) 1;
        arrayEntityMap6.growBy = 100;
        java.lang.String[] strArray14 = arrayEntityMap6.names;
        arrayEntityMap1.names = strArray14;
        int int17 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap19.ensureCapacity((-1));
        binaryEntityMap19.growBy = 10;
        java.lang.String str25 = binaryEntityMap19.name((int) (byte) -1);
        java.lang.String[] strArray26 = binaryEntityMap19.names;
        int[] intArray27 = binaryEntityMap19.values;
        binaryEntityMap19.size = (byte) 10;
        org.apache.commons.lang.Entities entities30 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap31 = entities30.map;
        java.lang.String str33 = entities30.unescape("hi!");
        org.apache.commons.lang.Entities entities34 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap35 = entities34.map;
        org.apache.commons.lang.Entities.EntityMap entityMap36 = entities34.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap38 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap38.add("hi!", 0);
        arrayEntityMap38.size = (byte) 1;
        arrayEntityMap38.growBy = 100;
        java.lang.String str47 = arrayEntityMap38.name((int) (byte) 1);
        entities34.map = arrayEntityMap38;
        entities30.map = arrayEntityMap38;
        int[] intArray50 = arrayEntityMap38.values;
        binaryEntityMap19.values = intArray50;
        java.lang.String[] strArray52 = binaryEntityMap19.names;
        arrayEntityMap1.names = strArray52;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(entities30);
        org.junit.Assert.assertNotNull(entityMap31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(entities34);
        org.junit.Assert.assertNotNull(entityMap35);
        org.junit.Assert.assertNotNull(entityMap36);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.entityName(2);
        java.lang.String str9 = entities0.entityName((int) (byte) 10);
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(entityMap10);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("");
        java.lang.String str5 = entities0.entityName((int) (byte) -1);
        java.lang.String str7 = entities0.entityName(3);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
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
        java.lang.String str26 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((-1));
        int[] intArray5 = arrayEntityMap1.values;
        java.lang.String[] strArray6 = arrayEntityMap1.names;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { null });
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
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
        hashEntityMap0.add("", 1);
        hashEntityMap0.add("", (int) (byte) -1);
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
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray9 = arrayEntityMap8.values;
        int int10 = arrayEntityMap8.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap12.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray19 = new int[] { ' ', '4' };
        binaryEntityMap16.values = intArray19;
        arrayEntityMap12.values = intArray19;
        arrayEntityMap8.values = intArray19;
        arrayEntityMap1.values = intArray19;
        arrayEntityMap1.add("", 0);
        int int27 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = arrayEntityMap1.name(2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, 52 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        org.apache.commons.lang.Entities.EntityMap entityMap61 = entities0.map;
        java.lang.String str63 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNull(entityMap5);
        org.junit.Assert.assertNull(entityMap6);
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
        org.junit.Assert.assertNotNull(entityMap61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.io.Writer writer2 = null;
        entities0.escape(writer2, "");
        java.io.Writer writer5 = null;
        entities0.escape(writer5, "");
        java.lang.String str9 = entities0.entityName((int) (short) 100);
        java.lang.String str11 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = (byte) -1;
        arrayEntityMap1.add("hi!", (int) (byte) 1);
        int int12 = arrayEntityMap1.growBy;
        int int14 = arrayEntityMap1.value("");
        int[] intArray15 = arrayEntityMap1.values;
        arrayEntityMap1.size = ' ';
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
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
        java.lang.String str23 = hashEntityMap0.name((int) (byte) 10);
        hashEntityMap0.add("", (int) (byte) -1);
        java.lang.String str28 = hashEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) 'a');
        int int4 = lookupEntityMap0.value("hi!");
        int int6 = lookupEntityMap0.value("hi!");
        int int8 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 100);
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        java.lang.String str49 = hashEntityMap0.name((-1));
        java.util.Map map50 = hashEntityMap0.mapNameToValue;
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
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(map50);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) '4');
        java.lang.String str7 = entities0.entityName((int) (short) 1);
        int int9 = entities0.entityValue("");
        java.io.Writer writer10 = null;
        entities0.escape(writer10, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        org.apache.commons.lang.Entities.EntityMap entityMap42 = entities0.map;
        java.lang.String str44 = entities0.escape("");
        java.lang.String str46 = entities0.escape("");
        int int48 = entities0.entityValue("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(entityMap42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        arrayEntityMap1.size = (byte) 1;
        java.lang.String str14 = arrayEntityMap1.name(32);
        java.lang.String[] strArray15 = arrayEntityMap1.names;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { null });
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap5.ensureCapacity(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray12 = new int[] { ' ', '4' };
        binaryEntityMap9.values = intArray12;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray16 = arrayEntityMap15.values;
        java.lang.String str18 = arrayEntityMap15.name((int) (short) 100);
        int[] intArray21 = new int[] { (short) -1, 10 };
        arrayEntityMap15.values = intArray21;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        arrayEntityMap15.names = strArray24;
        binaryEntityMap9.names = strArray24;
        java.lang.String[] strArray27 = binaryEntityMap9.names;
        binaryEntityMap9.add("", 10);
        binaryEntityMap9.ensureCapacity(10);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "" };
        binaryEntityMap9.names = strArray35;
        binaryEntityMap5.names = strArray35;
        arrayEntityMap1.names = strArray35;
        int int39 = arrayEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0 });
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
        org.apache.commons.lang.Entities entities21 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray24 = arrayEntityMap23.values;
        java.lang.String str26 = arrayEntityMap23.name((int) (short) 100);
        int[] intArray29 = new int[] { (short) -1, 10 };
        arrayEntityMap23.values = intArray29;
        entities21.map = arrayEntityMap23;
        entities0.map = arrayEntityMap23;
        arrayEntityMap23.size = ' ';
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 52, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(entities21);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0 });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 10 });
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
        arrayEntityMap4.growBy = 3;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 1);
        int[] intArray2 = binaryEntityMap1.values;
        binaryEntityMap1.ensureCapacity((int) '4');
        binaryEntityMap1.add("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.add("hi!", 52);
        binaryEntityMap1.growBy = ' ';
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.entityName(2);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        org.apache.commons.lang.Entities entities12 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.lang.String str17 = hashEntityMap13.name((int) '4');
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
        hashEntityMap13.mapValueToName = map39;
        entities12.map = hashEntityMap13;
        java.lang.String str45 = entities12.escape("hi!");
        java.lang.String str47 = entities12.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap49 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities12.map = arrayEntityMap49;
        java.lang.String[][] strArray51 = new java.lang.String[][] {};
        entities12.addEntities(strArray51);
        entities0.addEntities(strArray51);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[][] {});
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        java.lang.String[] strArray8 = null;
        arrayEntityMap1.names = strArray8;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap11.growBy = (-1);
        int[] intArray14 = arrayEntityMap11.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap16.add("hi!", 0);
        arrayEntityMap16.size = (byte) 1;
        arrayEntityMap16.growBy = 100;
        java.lang.String[] strArray24 = arrayEntityMap16.names;
        arrayEntityMap11.names = strArray24;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int[] intArray27 = arrayEntityMap26.values;
        arrayEntityMap11.values = intArray27;
        arrayEntityMap1.values = intArray27;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        java.lang.String str35 = hashEntityMap0.name(0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = null;
        hashEntityMap36.mapNameToValue = map37;
        java.lang.String str40 = hashEntityMap36.name((int) '4');
        java.lang.String str42 = hashEntityMap36.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = null;
        hashEntityMap43.mapNameToValue = map44;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = null;
        hashEntityMap46.mapNameToValue = map47;
        java.lang.String str50 = hashEntityMap46.name((int) '4');
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
        hashEntityMap46.mapNameToValue = map65;
        hashEntityMap43.mapValueToName = map65;
        hashEntityMap36.mapNameToValue = map65;
        hashEntityMap0.mapNameToValue = map65;
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
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = (short) -1;
        binaryEntityMap1.add("hi!", 100);
        java.lang.String str15 = binaryEntityMap1.name((int) (byte) 10);
        int int17 = binaryEntityMap1.value("");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = null;
        hashEntityMap21.mapNameToValue = map22;
        java.lang.String str25 = hashEntityMap21.name((int) '4');
        java.util.Map map26 = hashEntityMap21.mapValueToName;
        hashEntityMap20.mapValueToName = map26;
        java.util.Map map28 = hashEntityMap20.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = null;
        hashEntityMap30.mapNameToValue = map31;
        java.lang.String str34 = hashEntityMap30.name((int) '4');
        java.util.Map map35 = hashEntityMap30.mapValueToName;
        hashEntityMap29.mapValueToName = map35;
        java.util.Map map37 = hashEntityMap29.mapValueToName;
        hashEntityMap20.mapNameToValue = map37;
        java.util.Map map39 = hashEntityMap20.mapValueToName;
        hashEntityMap0.mapValueToName = map39;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        java.util.Map map31 = null;
        hashEntityMap0.mapNameToValue = map31;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = hashEntityMap0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int2 = arrayEntityMap1.size;
        arrayEntityMap1.size = (short) -1;
        java.lang.Class<?> wildcardClass5 = arrayEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap88 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int90 = hashEntityMap88.value("");
        java.util.Map map91 = hashEntityMap88.mapValueToName;
        treeEntityMap0.mapValueToName = map91;
        java.util.Map map93 = treeEntityMap0.mapValueToName;
        java.lang.String str95 = treeEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.add("hi!", 0);
        int int7 = arrayEntityMap1.size;
        int int8 = arrayEntityMap1.size;
        int[] intArray9 = arrayEntityMap1.values;
        arrayEntityMap1.ensureCapacity((int) (byte) 100);
        int int13 = arrayEntityMap1.value("");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        java.lang.String[] strArray4 = arrayEntityMap1.names;
        int[] intArray5 = arrayEntityMap1.values;
        arrayEntityMap1.growBy = (-1);
        arrayEntityMap1.size = 'a';
        int int10 = arrayEntityMap1.size;
        arrayEntityMap1.size = 35;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        java.lang.String str11 = binaryEntityMap1.name((int) (byte) 10);
        binaryEntityMap1.add("", 97);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        binaryEntityMap1.add("", (int) (short) 1);
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
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
        int int72 = binaryEntityMap1.value("hi!");
        int[] intArray73 = binaryEntityMap1.values;
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 0 });
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap39 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        int int40 = binaryEntityMap39.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap42 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray43 = arrayEntityMap42.values;
        java.lang.String str45 = arrayEntityMap42.name((int) (short) 100);
        int int47 = arrayEntityMap42.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap49 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray50 = arrayEntityMap49.values;
        int int51 = arrayEntityMap49.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap53 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap53.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap57 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray60 = new int[] { ' ', '4' };
        binaryEntityMap57.values = intArray60;
        arrayEntityMap53.values = intArray60;
        arrayEntityMap49.values = intArray60;
        arrayEntityMap42.values = intArray60;
        java.lang.String[] strArray65 = arrayEntityMap42.names;
        binaryEntityMap39.names = strArray65;
        arrayEntityMap1.names = strArray65;
        int int68 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = (-1);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 0 });
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.lang.String str11 = hashEntityMap7.name((int) '4');
        java.util.Map map12 = hashEntityMap7.mapValueToName;
        entities0.map = hashEntityMap7;
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities0.map;
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(entityMap14);
    }
}
