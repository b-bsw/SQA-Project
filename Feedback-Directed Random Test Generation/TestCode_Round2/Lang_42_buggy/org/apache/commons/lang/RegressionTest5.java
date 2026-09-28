package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        binaryEntityMap1.growBy = 100;
        int int7 = binaryEntityMap1.size;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int7 = arrayEntityMap5.value("");
        java.lang.String[] strArray8 = arrayEntityMap5.names;
        entities0.map = arrayEntityMap5;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int12 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "quot" });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.io.Writer writer2 = null;
        entities0.escape(writer2, "");
        entities0.addEntity("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int11 = arrayEntityMap9.value("");
        int int12 = arrayEntityMap9.growBy;
        entities0.map = arrayEntityMap9;
        int int15 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(10);
        binaryEntityMap1.size = 2;
        int int4 = binaryEntityMap1.growBy;
        binaryEntityMap1.growBy = (-1);
        java.lang.String str8 = binaryEntityMap1.name((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray7 = new int[] { (short) -1, 10 };
        arrayEntityMap1.values = intArray7;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        arrayEntityMap1.names = strArray10;
        int[] intArray12 = arrayEntityMap1.values;
        java.lang.String str14 = arrayEntityMap1.name(0);
        java.lang.String[] strArray15 = arrayEntityMap1.names;
        arrayEntityMap1.add("", 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, 10 });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 10 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        java.lang.String str64 = entities0.entityName(35);
        org.junit.Assert.assertNotNull(entities0);
// flaky "1) test2506(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
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
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String str4 = entities0.unescape("hi!");
        entities0.addEntity("hi!", 35);
        int int9 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        int int85 = hashEntityMap0.value("hi!");
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
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
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
        int int50 = treeEntityMap5.value("");
        java.util.Map map51 = treeEntityMap5.mapValueToName;
        hashEntityMap0.mapNameToValue = map51;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        binaryEntityMap1.add("", 35);
        int[] intArray8 = binaryEntityMap1.values;
        java.lang.String str10 = binaryEntityMap1.name(2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        java.util.Map map2 = hashEntityMap0.mapNameToValue;
        int int4 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapValueToName;
        java.util.Map map7 = hashEntityMap5.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap8 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = null;
        hashEntityMap9.mapNameToValue = map10;
        java.util.Map map12 = null;
        hashEntityMap9.mapNameToValue = map12;
        java.util.Map map14 = null;
        hashEntityMap9.mapNameToValue = map14;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map17 = null;
        hashEntityMap16.mapNameToValue = map17;
        java.util.Map map19 = null;
        hashEntityMap16.mapNameToValue = map19;
        java.util.Map map21 = null;
        hashEntityMap16.mapNameToValue = map21;
        java.util.Map map23 = hashEntityMap16.mapValueToName;
        hashEntityMap9.mapNameToValue = map23;
        treeEntityMap8.mapValueToName = map23;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = null;
        hashEntityMap26.mapNameToValue = map27;
        java.lang.String str30 = hashEntityMap26.name((int) '4');
        java.lang.String str32 = hashEntityMap26.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = null;
        hashEntityMap33.mapNameToValue = map34;
        java.util.Map map36 = null;
        hashEntityMap33.mapNameToValue = map36;
        java.util.Map map38 = null;
        hashEntityMap33.mapNameToValue = map38;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = null;
        hashEntityMap40.mapNameToValue = map41;
        java.util.Map map43 = null;
        hashEntityMap40.mapNameToValue = map43;
        java.util.Map map45 = null;
        hashEntityMap40.mapNameToValue = map45;
        java.util.Map map47 = hashEntityMap40.mapValueToName;
        hashEntityMap33.mapNameToValue = map47;
        hashEntityMap26.mapValueToName = map47;
        treeEntityMap8.mapNameToValue = map47;
        java.util.Map map51 = treeEntityMap8.mapNameToValue;
        hashEntityMap5.mapValueToName = map51;
        java.util.Map map53 = hashEntityMap5.mapValueToName;
        java.util.Map map54 = hashEntityMap5.mapValueToName;
        hashEntityMap0.mapNameToValue = map54;
        hashEntityMap0.add("hi!", 2);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        java.lang.String str55 = treeEntityMap0.name((int) (byte) -1);
        java.lang.String str57 = treeEntityMap0.name((int) '4');
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        int int10 = binaryEntityMap1.value("");
        java.lang.String str12 = binaryEntityMap1.name((int) (short) 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        entities0.addEntity("", (int) (short) 1);
        java.lang.String str7 = entities0.entityName((int) '#');
        int int9 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = hashEntityMap10.mapValueToName;
        java.util.Map map12 = null;
        hashEntityMap10.mapNameToValue = map12;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.lang.String str19 = hashEntityMap15.name((int) '4');
        java.util.Map map20 = hashEntityMap15.mapValueToName;
        hashEntityMap14.mapValueToName = map20;
        hashEntityMap10.mapNameToValue = map20;
        java.util.Map map23 = hashEntityMap10.mapNameToValue;
        hashEntityMap10.add("", (int) '#');
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap27 = new org.apache.commons.lang.Entities.TreeEntityMap();
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
        treeEntityMap27.mapValueToName = map42;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = null;
        hashEntityMap45.mapNameToValue = map46;
        java.lang.String str49 = hashEntityMap45.name((int) '4');
        java.lang.String str51 = hashEntityMap45.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = null;
        hashEntityMap52.mapNameToValue = map53;
        java.util.Map map55 = null;
        hashEntityMap52.mapNameToValue = map55;
        java.util.Map map57 = null;
        hashEntityMap52.mapNameToValue = map57;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = null;
        hashEntityMap59.mapNameToValue = map60;
        java.util.Map map62 = null;
        hashEntityMap59.mapNameToValue = map62;
        java.util.Map map64 = null;
        hashEntityMap59.mapNameToValue = map64;
        java.util.Map map66 = hashEntityMap59.mapValueToName;
        hashEntityMap52.mapNameToValue = map66;
        hashEntityMap45.mapValueToName = map66;
        treeEntityMap27.mapNameToValue = map66;
        treeEntityMap27.add("hi!", (int) (byte) 0);
        java.util.Map map73 = treeEntityMap27.mapValueToName;
        hashEntityMap10.mapNameToValue = map73;
        entities0.map = hashEntityMap10;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = hashEntityMap0.name((int) (short) -1);
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        java.util.Map map50 = hashEntityMap0.mapValueToName;
        int int52 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap53 = new org.apache.commons.lang.Entities.TreeEntityMap();
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
        treeEntityMap53.mapValueToName = map68;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap71 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map72 = null;
        hashEntityMap71.mapNameToValue = map72;
        java.lang.String str75 = hashEntityMap71.name((int) '4');
        java.lang.String str77 = hashEntityMap71.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap78 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map79 = null;
        hashEntityMap78.mapNameToValue = map79;
        java.util.Map map81 = null;
        hashEntityMap78.mapNameToValue = map81;
        java.util.Map map83 = null;
        hashEntityMap78.mapNameToValue = map83;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap85 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map86 = null;
        hashEntityMap85.mapNameToValue = map86;
        java.util.Map map88 = null;
        hashEntityMap85.mapNameToValue = map88;
        java.util.Map map90 = null;
        hashEntityMap85.mapNameToValue = map90;
        java.util.Map map92 = hashEntityMap85.mapValueToName;
        hashEntityMap78.mapNameToValue = map92;
        hashEntityMap71.mapValueToName = map92;
        treeEntityMap53.mapNameToValue = map92;
        java.util.Map map96 = treeEntityMap53.mapNameToValue;
        hashEntityMap0.mapValueToName = map96;
        java.lang.String str99 = hashEntityMap0.name(97);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNull(str99);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
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
        org.apache.commons.lang.Entities.EntityMap entityMap28 = entities0.map;
        java.io.Writer writer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer29, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] {});
        org.junit.Assert.assertNotNull(entityMap28);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        arrayEntityMap1.growBy = 10;
        arrayEntityMap1.add("", 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        int int11 = arrayEntityMap1.growBy;
        java.lang.String[] strArray12 = arrayEntityMap1.names;
        int[] intArray13 = arrayEntityMap1.values;
        arrayEntityMap1.size = (byte) 0;
        int int17 = arrayEntityMap1.value("");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(52);
        java.lang.String str10 = lookupEntityMap0.name(1);
        lookupEntityMap0.add("", 0);
        java.lang.String str15 = lookupEntityMap0.name(100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String[] strArray11 = binaryEntityMap1.names;
        binaryEntityMap1.add("", (int) (byte) 0);
        java.lang.String[] strArray15 = binaryEntityMap1.names;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        java.util.Map map57 = hashEntityMap11.mapValueToName;
        hashEntityMap0.mapNameToValue = map57;
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(map8);
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
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        java.lang.String str48 = entities0.escape("");
        java.lang.String str50 = entities0.unescape("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int2 = arrayEntityMap1.size;
        int int3 = arrayEntityMap1.growBy;
        arrayEntityMap1.add("hi!", (int) (short) -1);
        int int7 = arrayEntityMap1.size;
        java.lang.String[] strArray8 = arrayEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.lang.String str19 = hashEntityMap15.name((int) '4');
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
        hashEntityMap15.mapValueToName = map37;
        hashEntityMap0.mapValueToName = map37;
        java.lang.String str42 = hashEntityMap0.name((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        int int7 = binaryEntityMap1.size;
        int int8 = binaryEntityMap1.growBy;
        int[] intArray9 = binaryEntityMap1.values;
        int[] intArray10 = binaryEntityMap1.values;
        int[] intArray11 = null;
        binaryEntityMap1.values = intArray11;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1) });
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.size = 0;
        java.lang.String str10 = binaryEntityMap1.name((int) 'a');
        java.lang.String str12 = binaryEntityMap1.name((int) ' ');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("hi!", (int) (byte) 100);
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", (-1));
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.lang.String str12 = hashEntityMap8.name((int) '4');
        java.lang.String str14 = hashEntityMap8.name((int) (byte) 1);
        java.lang.String str16 = hashEntityMap8.name(100);
        java.util.Map map17 = hashEntityMap8.mapNameToValue;
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
        hashEntityMap8.mapValueToName = map39;
        hashEntityMap0.mapValueToName = map39;
        int int45 = hashEntityMap0.value("hi!");
        java.util.Map map46 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        java.lang.Class<?> wildcardClass3 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        int int9 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", 35);
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap16.growBy = (-1);
        arrayEntityMap16.ensureCapacity((int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray23 = arrayEntityMap22.values;
        java.lang.String str25 = arrayEntityMap22.name((int) (short) 100);
        int[] intArray28 = new int[] { (short) -1, 10 };
        arrayEntityMap22.values = intArray28;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        arrayEntityMap22.names = strArray31;
        int[] intArray33 = arrayEntityMap22.values;
        arrayEntityMap16.values = intArray33;
        binaryEntityMap1.values = intArray33;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap37 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap37.ensureCapacity((-1));
        binaryEntityMap37.growBy = 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap43 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int45 = arrayEntityMap43.value("");
        arrayEntityMap43.size = (byte) 100;
        arrayEntityMap43.size = 100;
        arrayEntityMap43.ensureCapacity((int) (short) 1);
        int[] intArray52 = arrayEntityMap43.values;
        binaryEntityMap37.values = intArray52;
        binaryEntityMap37.add("", (int) (short) 10);
        int[] intArray57 = binaryEntityMap37.values;
        binaryEntityMap1.values = intArray57;
        binaryEntityMap1.ensureCapacity((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 0 });
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 10 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 10 });
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        java.lang.String str5 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(entityMap6);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        java.lang.String str8 = binaryEntityMap1.name(32);
        binaryEntityMap1.growBy = 32;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray15 = new int[] { ' ', '4' };
        binaryEntityMap12.values = intArray15;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray19 = arrayEntityMap18.values;
        java.lang.String str21 = arrayEntityMap18.name((int) (short) 100);
        int[] intArray24 = new int[] { (short) -1, 10 };
        arrayEntityMap18.values = intArray24;
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        arrayEntityMap18.names = strArray27;
        binaryEntityMap12.names = strArray27;
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
        java.lang.String[] strArray49 = binaryEntityMap31.names;
        binaryEntityMap12.names = strArray49;
        binaryEntityMap1.names = strArray49;
        int int52 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0 });
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 0 });
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        int int46 = binaryEntityMap1.value("hi!");
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
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        int int5 = hashEntityMap0.value("");
        java.util.Map map6 = hashEntityMap0.mapValueToName;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        java.lang.String str9 = hashEntityMap0.name(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.entityName((int) '#');
        java.lang.String str13 = entities0.unescape("hi!");
        int int15 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        binaryEntityMap1.add("", 35);
        int int57 = binaryEntityMap1.size;
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        int int6 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.ensureCapacity((int) (byte) 10);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int[] intArray11 = arrayEntityMap1.values;
        int int12 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("hi!", (int) (byte) 100);
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        java.util.Map map6 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("");
        entities0.addEntity("", (int) (byte) 0);
        java.lang.String str17 = entities0.entityName((int) (byte) 1);
        java.lang.String str19 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        java.lang.String str80 = hashEntityMap0.name((int) '#');
        java.lang.String str82 = hashEntityMap0.name(52);
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
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.growBy = 35;
        java.lang.String str8 = arrayEntityMap1.name(32);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap52 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap52.ensureCapacity((-1));
        binaryEntityMap52.growBy = 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap58 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int60 = arrayEntityMap58.value("");
        arrayEntityMap58.size = (byte) 100;
        arrayEntityMap58.size = 100;
        arrayEntityMap58.ensureCapacity((int) (short) 1);
        int[] intArray67 = arrayEntityMap58.values;
        binaryEntityMap52.values = intArray67;
        binaryEntityMap52.add("", (int) (short) 10);
        binaryEntityMap52.ensureCapacity(0);
        binaryEntityMap52.ensureCapacity(2);
        int[] intArray76 = binaryEntityMap52.values;
        binaryEntityMap1.values = intArray76;
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 10 });
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        int[] intArray7 = new int[] {};
        arrayEntityMap1.values = intArray7;
        int int10 = arrayEntityMap1.value("");
        java.lang.String[] strArray11 = arrayEntityMap1.names;
        arrayEntityMap1.size = (byte) -1;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        binaryEntityMap1.size = 0;
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
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        int int57 = arrayEntityMap1.size;
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        binaryEntityMap1.add("", (int) (byte) 1);
        int[] intArray12 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap1.values = intArray12;
        binaryEntityMap1.add("", 0);
        binaryEntityMap1.size = (short) 0;
        binaryEntityMap1.add("hi!", 0);
        binaryEntityMap1.size = '#';
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 1, 32 });
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.size = (byte) 10;
        arrayEntityMap1.ensureCapacity((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        binaryEntityMap1.size = (byte) 0;
        binaryEntityMap1.growBy = 52;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        org.apache.commons.lang.Entities.EntityMap entityMap19 = null;
        entities0.map = entityMap19;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        binaryEntityMap4.ensureCapacity((int) (short) 1);
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
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        arrayEntityMap1.size = (short) 10;
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
            int int85 = hashEntityMap0.value("hi!");
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
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("hi!", (int) (short) 0);
        java.lang.String[] strArray7 = binaryEntityMap1.names;
        binaryEntityMap1.add("hi!", (int) '4');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        java.util.Map map85 = hashEntityMap0.mapNameToValue;
        java.lang.String str87 = hashEntityMap0.name(10);
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
        org.junit.Assert.assertNull(map85);
        org.junit.Assert.assertNull(str87);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer5 = null;
        entities0.escape(writer5, "");
        int int9 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        int int5 = hashEntityMap0.value("");
        java.lang.String str7 = hashEntityMap0.name((int) '4');
        int int9 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("hi!", 32);
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = null;
        hashEntityMap41.mapNameToValue = map42;
        java.lang.String str45 = hashEntityMap41.name((int) '4');
        java.util.Map map46 = hashEntityMap41.mapValueToName;
        hashEntityMap40.mapValueToName = map46;
        hashEntityMap37.mapValueToName = map46;
        hashEntityMap13.mapNameToValue = map46;
        int int51 = hashEntityMap13.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = null;
        hashEntityMap52.mapNameToValue = map53;
        java.util.Map map55 = null;
        hashEntityMap52.mapNameToValue = map55;
        java.util.Map map57 = null;
        hashEntityMap52.mapNameToValue = map57;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = null;
        hashEntityMap59.mapNameToValue = map60;
        java.util.Map map62 = null;
        hashEntityMap59.mapNameToValue = map62;
        java.util.Map map64 = null;
        hashEntityMap59.mapNameToValue = map64;
        java.util.Map map66 = hashEntityMap59.mapValueToName;
        hashEntityMap52.mapNameToValue = map66;
        java.util.Map map68 = hashEntityMap52.mapValueToName;
        java.util.Map map69 = hashEntityMap52.mapNameToValue;
        hashEntityMap13.mapNameToValue = map69;
        hashEntityMap0.mapValueToName = map69;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int20 = arrayEntityMap19.size;
        int int21 = arrayEntityMap19.growBy;
        java.lang.String str23 = arrayEntityMap19.name((int) (short) 100);
        int int25 = arrayEntityMap19.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap27 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap27.add("hi!", 0);
        arrayEntityMap27.size = (byte) 1;
        arrayEntityMap27.growBy = 100;
        java.lang.String[] strArray35 = arrayEntityMap27.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap37.add("hi!", 0);
        arrayEntityMap37.size = (byte) 1;
        arrayEntityMap37.growBy = 100;
        java.lang.String[] strArray45 = arrayEntityMap37.names;
        arrayEntityMap27.names = strArray45;
        arrayEntityMap19.names = strArray45;
        java.lang.String[] strArray48 = arrayEntityMap19.names;
        java.lang.String[] strArray49 = arrayEntityMap19.names;
        arrayEntityMap1.names = strArray49;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        int int5 = hashEntityMap0.value("");
        java.util.Map map6 = hashEntityMap0.mapValueToName;
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = binaryEntityMap0.values;
        int[] intArray2 = binaryEntityMap0.values;
        int[] intArray3 = binaryEntityMap0.values;
        int[] intArray4 = binaryEntityMap0.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray9 = new int[] { ' ', '4' };
        binaryEntityMap6.values = intArray9;
        int int12 = binaryEntityMap6.value("");
        int int14 = binaryEntityMap6.value("");
        binaryEntityMap6.add("hi!", 35);
        int int18 = binaryEntityMap6.size;
        binaryEntityMap6.add("hi!", 2);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int25 = binaryEntityMap23.value("hi!");
        int int26 = binaryEntityMap23.growBy;
        java.lang.String[] strArray27 = binaryEntityMap23.names;
        binaryEntityMap6.names = strArray27;
        binaryEntityMap0.names = strArray27;
        binaryEntityMap0.ensureCapacity(32);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 2, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        int[] intArray57 = arrayEntityMap1.values;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("", 97);
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
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] {});
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap22.growBy = (-1);
        java.lang.String str26 = arrayEntityMap22.name((int) (byte) 0);
        java.lang.String[] strArray27 = arrayEntityMap22.names;
        arrayEntityMap1.names = strArray27;
        int int30 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap32 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray33 = arrayEntityMap32.values;
        java.lang.String str35 = arrayEntityMap32.name((int) (short) 100);
        arrayEntityMap32.size = (byte) 0;
        arrayEntityMap32.ensureCapacity((int) (byte) 1);
        arrayEntityMap32.size = 2;
        int[] intArray42 = arrayEntityMap32.values;
        arrayEntityMap1.values = intArray42;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { null });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 0 });
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 0 });
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap20 = entities0.map;
        int int22 = entities0.entityValue("");
        java.lang.String str24 = entities0.entityName(35);
        java.lang.String str26 = entities0.entityName((int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertNotNull(entityMap20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = 100;
        int int9 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = 35;
        java.lang.String str13 = arrayEntityMap1.name((int) (byte) -1);
        int int15 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        int int13 = lookupEntityMap0.value("");
        java.lang.String str15 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("hi!", (int) (short) -1);
        lookupEntityMap0.add("", (int) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name((-1));
        int[] intArray4 = binaryEntityMap1.values;
        java.lang.String str6 = binaryEntityMap1.name((int) (byte) 100);
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) -1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name(100);
        binaryEntityMap0.growBy = (byte) -1;
        int int5 = binaryEntityMap0.growBy;
        java.lang.String[] strArray6 = binaryEntityMap0.names;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 100);
        binaryEntityMap0.size = (-1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        java.lang.String str73 = hashEntityMap0.name((int) (short) 0);
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
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = 100;
        int int9 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = 35;
        arrayEntityMap1.growBy = '#';
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        java.lang.String str36 = arrayEntityMap1.name((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("");
        java.lang.String str5 = entities0.escape("");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray8 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities7.addEntities(strArray8);
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities10.map;
        entities7.map = entityMap11;
        java.io.Writer writer13 = null;
        entities7.escape(writer13, "");
        java.lang.String str17 = entities7.unescape("hi!");
        org.apache.commons.lang.Entities entities18 = org.apache.commons.lang.Entities.HTML32;
        int int20 = entities18.entityValue("");
        java.lang.String[][] strArray21 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities18.addEntities(strArray21);
        entities7.addEntities(strArray21);
        entities0.addEntities(strArray21);
        java.io.Writer writer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer25, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(entities18);
// flaky "2) test2570(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        lookupEntityMap0.add("hi!", (-1));
        lookupEntityMap0.add("", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        int int18 = arrayEntityMap1.size;
        java.lang.String str20 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.add("hi!", (int) 'a');
        java.lang.String str25 = arrayEntityMap1.name((int) (short) -1);
        int[] intArray26 = arrayEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 52 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 97, 52 });
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        java.lang.String str63 = binaryEntityMap1.name((int) (byte) 10);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "" };
        binaryEntityMap1.names = strArray66;
        java.lang.Class<?> wildcardClass68 = binaryEntityMap1.getClass();
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
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) 'a');
        int int4 = lookupEntityMap0.value("hi!");
        java.lang.String str6 = lookupEntityMap0.name(52);
        java.lang.String str8 = lookupEntityMap0.name(35);
        lookupEntityMap0.add("", 1);
        lookupEntityMap0.add("hi!", 0);
        int int16 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.growBy = (byte) 0;
        int int7 = binaryEntityMap1.value("");
        int int8 = binaryEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = binaryEntityMap0.values;
        binaryEntityMap0.add("", (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        binaryEntityMap12.add("hi!", 2);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 2 });
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.escape("");
        java.io.Writer writer8 = null;
        entities0.escape(writer8, "");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("", 32);
        java.lang.String str16 = lookupEntityMap0.name(52);
        java.lang.String str18 = lookupEntityMap0.name((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        int int10 = entities0.entityValue("hi!");
        entities0.addEntity("hi!", 2);
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap14 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap14.add("hi!", (int) (short) 1);
        int int19 = lookupEntityMap14.value("hi!");
        int int21 = lookupEntityMap14.value("");
        java.lang.String str23 = lookupEntityMap14.name((int) (byte) 1);
        java.lang.String str25 = lookupEntityMap14.name((int) '#');
        int int27 = lookupEntityMap14.value("hi!");
        int int29 = lookupEntityMap14.value("hi!");
        java.lang.String str31 = lookupEntityMap14.name((int) (short) 1);
        int int33 = lookupEntityMap14.value("hi!");
        entities0.map = lookupEntityMap14;
        java.lang.String str36 = lookupEntityMap14.name((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("hi!", (int) '#');
        lookupEntityMap0.add("hi!", 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        hashEntityMap0.mapValueToName = map63;
        java.util.Map map66 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(map66);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        lookupEntityMap0.add("", (int) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        int int34 = hashEntityMap16.value("");
        java.util.Map map35 = null;
        hashEntityMap16.mapNameToValue = map35;
        java.util.Map map37 = hashEntityMap16.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map40 = null;
        hashEntityMap39.mapNameToValue = map40;
        java.lang.String str43 = hashEntityMap39.name((int) '4');
        java.util.Map map44 = hashEntityMap39.mapValueToName;
        hashEntityMap38.mapValueToName = map44;
        java.util.Map map46 = hashEntityMap38.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = null;
        hashEntityMap48.mapNameToValue = map49;
        java.lang.String str52 = hashEntityMap48.name((int) '4');
        java.util.Map map53 = hashEntityMap48.mapValueToName;
        hashEntityMap47.mapValueToName = map53;
        java.util.Map map55 = hashEntityMap47.mapValueToName;
        hashEntityMap38.mapNameToValue = map55;
        hashEntityMap16.mapNameToValue = map55;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap58 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map59 = hashEntityMap58.mapValueToName;
        java.util.Map map60 = null;
        hashEntityMap58.mapNameToValue = map60;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map64 = null;
        hashEntityMap63.mapNameToValue = map64;
        java.lang.String str67 = hashEntityMap63.name((int) '4');
        java.util.Map map68 = hashEntityMap63.mapValueToName;
        hashEntityMap62.mapValueToName = map68;
        hashEntityMap58.mapNameToValue = map68;
        java.util.Map map71 = hashEntityMap58.mapNameToValue;
        hashEntityMap58.add("hi!", 35);
        hashEntityMap58.add("", 100);
        java.util.Map map78 = hashEntityMap58.mapValueToName;
        java.util.Map map79 = hashEntityMap58.mapNameToValue;
        hashEntityMap16.mapNameToValue = map79;
        hashEntityMap0.mapValueToName = map79;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(map37);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("hi!", (-1));
        binaryEntityMap1.add("", 1);
        int int8 = binaryEntityMap1.growBy;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[32]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap0 = new org.apache.commons.lang.Entities.TreeEntityMap();
        treeEntityMap0.add("", (int) (short) 10);
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
        treeEntityMap4.mapNameToValue = map43;
        int int48 = treeEntityMap4.value("hi!");
        int int50 = treeEntityMap4.value("");
        java.util.Map map51 = treeEntityMap4.mapValueToName;
        treeEntityMap0.mapValueToName = map51;
        treeEntityMap0.add("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
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
        hashEntityMap0.mapNameToValue = map19;
        hashEntityMap0.add("", (int) ' ');
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
        treeEntityMap25.add("", 35);
        java.util.Map map46 = treeEntityMap25.mapValueToName;
        java.util.Map map47 = treeEntityMap25.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = null;
        hashEntityMap48.mapNameToValue = map49;
        java.util.Map map51 = hashEntityMap48.mapValueToName;
        treeEntityMap25.mapNameToValue = map51;
        hashEntityMap0.mapNameToValue = map51;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (short) -1);
        int[] intArray4 = null;
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.growBy = (short) 1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap9.growBy = 1;
        int int13 = arrayEntityMap9.value("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray18 = new int[] { ' ', '4' };
        binaryEntityMap15.values = intArray18;
        int int21 = binaryEntityMap15.value("");
        binaryEntityMap15.add("hi!", (int) (short) 100);
        int[] intArray25 = binaryEntityMap15.values;
        arrayEntityMap9.values = intArray25;
        java.lang.String str28 = arrayEntityMap9.name(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray33 = new int[] { ' ', '4' };
        binaryEntityMap30.values = intArray33;
        java.lang.String str36 = binaryEntityMap30.name((int) (byte) 100);
        binaryEntityMap30.add("", (int) (byte) 0);
        java.lang.String str41 = binaryEntityMap30.name(10);
        org.apache.commons.lang.Entities entities42 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap43 = entities42.map;
        java.lang.String str45 = entities42.unescape("hi!");
        org.apache.commons.lang.Entities entities46 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap47 = entities46.map;
        org.apache.commons.lang.Entities.EntityMap entityMap48 = entities46.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap50 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap50.add("hi!", 0);
        arrayEntityMap50.size = (byte) 1;
        arrayEntityMap50.growBy = 100;
        java.lang.String str59 = arrayEntityMap50.name((int) (byte) 1);
        entities46.map = arrayEntityMap50;
        entities42.map = arrayEntityMap50;
        arrayEntityMap50.add("hi!", 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap66 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray69 = new int[] { ' ', '4' };
        binaryEntityMap66.values = intArray69;
        binaryEntityMap66.size = '#';
        int[] intArray73 = binaryEntityMap66.values;
        arrayEntityMap50.values = intArray73;
        binaryEntityMap30.values = intArray73;
        arrayEntityMap9.values = intArray73;
        binaryEntityMap1.values = intArray73;
        binaryEntityMap1.add("hi!", 100);
        binaryEntityMap1.add("", (int) 'a');
        java.lang.String str85 = binaryEntityMap1.name((-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 100, 52 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 52 });
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(entities42);
        org.junit.Assert.assertNotNull(entityMap43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(entities46);
        org.junit.Assert.assertNotNull(entityMap47);
        org.junit.Assert.assertNotNull(entityMap48);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str85);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("hi!", (int) (byte) 100);
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", 35);
        java.lang.String str9 = hashEntityMap0.name(32);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int7 = arrayEntityMap5.value("");
        java.lang.String[] strArray8 = arrayEntityMap5.names;
        entities0.map = arrayEntityMap5;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray12 = arrayEntityMap11.values;
        java.lang.String str14 = arrayEntityMap11.name((int) (short) 100);
        arrayEntityMap11.size = (byte) 0;
        int int17 = arrayEntityMap11.size;
        int int19 = arrayEntityMap11.value("");
        java.lang.String str21 = arrayEntityMap11.name((int) (short) 0);
        java.lang.String str23 = arrayEntityMap11.name((int) '#');
        java.lang.String str25 = arrayEntityMap11.name((int) '4');
        entities0.map = arrayEntityMap11;
        org.apache.commons.lang.Entities.EntityMap entityMap27 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray12);
// flaky "3) test2590(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(entityMap27);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.escape("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = hashEntityMap0.name(100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapValueToName;
        java.util.Map map11 = null;
        hashEntityMap9.mapNameToValue = map11;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.lang.String str18 = hashEntityMap14.name((int) '4');
        java.util.Map map19 = hashEntityMap14.mapValueToName;
        hashEntityMap13.mapValueToName = map19;
        hashEntityMap9.mapNameToValue = map19;
        java.util.Map map22 = hashEntityMap9.mapNameToValue;
        java.util.Map map23 = hashEntityMap9.mapValueToName;
        hashEntityMap0.mapValueToName = map23;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        java.util.Map map20 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        java.util.Map map6 = hashEntityMap0.mapValueToName;
        java.lang.String str8 = hashEntityMap0.name(35);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = null;
        hashEntityMap9.mapNameToValue = map10;
        java.lang.String str13 = hashEntityMap9.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = null;
        hashEntityMap14.mapNameToValue = map15;
        java.lang.String str18 = hashEntityMap14.name((int) '4');
        java.lang.String str20 = hashEntityMap14.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = null;
        hashEntityMap21.mapNameToValue = map22;
        java.util.Map map24 = null;
        hashEntityMap21.mapNameToValue = map24;
        java.util.Map map26 = null;
        hashEntityMap21.mapNameToValue = map26;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = null;
        hashEntityMap28.mapNameToValue = map29;
        java.util.Map map31 = null;
        hashEntityMap28.mapNameToValue = map31;
        java.util.Map map33 = null;
        hashEntityMap28.mapNameToValue = map33;
        java.util.Map map35 = hashEntityMap28.mapValueToName;
        hashEntityMap21.mapNameToValue = map35;
        hashEntityMap14.mapValueToName = map35;
        hashEntityMap9.mapValueToName = map35;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map40 = null;
        hashEntityMap39.mapNameToValue = map40;
        java.util.Map map42 = null;
        hashEntityMap39.mapNameToValue = map42;
        java.util.Map map44 = null;
        hashEntityMap39.mapNameToValue = map44;
        java.util.Map map46 = hashEntityMap39.mapValueToName;
        java.util.Map map47 = hashEntityMap39.mapNameToValue;
        java.util.Map map48 = hashEntityMap39.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int51 = hashEntityMap49.value("");
        java.util.Map map52 = hashEntityMap49.mapValueToName;
        hashEntityMap39.mapValueToName = map52;
        hashEntityMap9.mapNameToValue = map52;
        hashEntityMap0.mapValueToName = map52;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.size = 0;
        java.lang.String str10 = binaryEntityMap1.name((int) 'a');
        java.lang.String str12 = binaryEntityMap1.name(2);
        binaryEntityMap1.add("", 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        java.io.Writer writer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(entityMap17);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("hi!");
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 100);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 0);
        int int8 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray2 = binaryEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap4.growBy = 0;
        int int7 = arrayEntityMap4.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str11 = binaryEntityMap9.name((int) '#');
        binaryEntityMap9.add("", (int) (byte) -1);
        java.lang.String str16 = binaryEntityMap9.name((int) (byte) 10);
        int int18 = binaryEntityMap9.value("");
        binaryEntityMap9.ensureCapacity(100);
        int[] intArray21 = binaryEntityMap9.values;
        arrayEntityMap4.values = intArray21;
        binaryEntityMap1.values = intArray21;
        binaryEntityMap1.add("", 10);
        binaryEntityMap1.add("hi!", (int) (short) 0);
        binaryEntityMap1.add("hi!", 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        org.apache.commons.lang.Entities.EntityMap entityMap29 = entities0.map;
        java.lang.String str31 = entities0.unescape("");
        entities0.addEntity("", (int) (short) 10);
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
        org.junit.Assert.assertNotNull(entityMap29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        org.apache.commons.lang.Entities entities14 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str16 = entities14.entityName((int) '#');
        entities14.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap20 = entities14.map;
        java.io.Writer writer21 = null;
        entities14.escape(writer21, "");
        java.lang.String str25 = entities14.unescape("hi!");
        org.apache.commons.lang.Entities entities26 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap27 = entities26.map;
        java.lang.String str29 = entities26.unescape("hi!");
        org.apache.commons.lang.Entities entities30 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap31 = entities30.map;
        org.apache.commons.lang.Entities.EntityMap entityMap32 = entities30.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap34 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap34.add("hi!", 0);
        arrayEntityMap34.size = (byte) 1;
        arrayEntityMap34.growBy = 100;
        java.lang.String str43 = arrayEntityMap34.name((int) (byte) 1);
        entities30.map = arrayEntityMap34;
        entities26.map = arrayEntityMap34;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities26);
        org.apache.commons.lang.Entities entities47 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray48 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities47.addEntities(strArray48);
        entities26.addEntities(strArray48);
        entities14.addEntities(strArray48);
        entities0.addEntities(strArray48);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(entities14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(entityMap20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(entities26);
        org.junit.Assert.assertNotNull(entityMap27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(entities30);
        org.junit.Assert.assertNotNull(entityMap31);
        org.junit.Assert.assertNotNull(entityMap32);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(entities47);
        org.junit.Assert.assertNotNull(strArray48);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        int int11 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        entities0.addEntity("hi!", (int) (short) 10);
        java.io.Writer writer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer26, "hi!");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        java.util.Map map24 = hashEntityMap0.mapValueToName;
        java.lang.String str26 = hashEntityMap0.name(3);
        hashEntityMap0.add("hi!", 52);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(1);
        int[] intArray2 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = 0;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name((int) (short) 100);
        int int14 = binaryEntityMap1.value("hi!");
        java.lang.String str16 = binaryEntityMap1.name(97);
        int[] intArray17 = binaryEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 52 });
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        java.util.Map map52 = treeEntityMap0.mapNameToValue;
        java.util.Map map53 = treeEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        int int31 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap0 = new org.apache.commons.lang.Entities.TreeEntityMap();
        treeEntityMap0.add("", (int) (short) 10);
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap4 = new org.apache.commons.lang.Entities.TreeEntityMap();
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = null;
        hashEntityMap29.mapNameToValue = map30;
        java.lang.String str33 = hashEntityMap29.name((int) '4');
        java.lang.String str35 = hashEntityMap29.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = null;
        hashEntityMap36.mapNameToValue = map37;
        java.util.Map map39 = null;
        hashEntityMap36.mapNameToValue = map39;
        java.util.Map map41 = null;
        hashEntityMap36.mapNameToValue = map41;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = null;
        hashEntityMap43.mapNameToValue = map44;
        java.util.Map map46 = null;
        hashEntityMap43.mapNameToValue = map46;
        java.util.Map map48 = null;
        hashEntityMap43.mapNameToValue = map48;
        java.util.Map map50 = hashEntityMap43.mapValueToName;
        hashEntityMap36.mapNameToValue = map50;
        hashEntityMap29.mapValueToName = map50;
        hashEntityMap5.mapValueToName = map50;
        treeEntityMap4.mapNameToValue = map50;
        treeEntityMap0.mapValueToName = map50;
        treeEntityMap0.add("", (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        int int6 = arrayEntityMap1.value("hi!");
        int int8 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.size = '#';
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.ensureCapacity((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 35 out of bounds for object array[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        java.lang.String[] strArray35 = binaryEntityMap1.names;
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
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        org.apache.commons.lang.Entities.EntityMap entityMap50 = entities0.map;
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
        org.junit.Assert.assertNotNull(entityMap50);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap17.ensureCapacity((-1));
        binaryEntityMap17.growBy = 10;
        java.lang.String str23 = binaryEntityMap17.name((int) (byte) -1);
        java.lang.String[] strArray24 = binaryEntityMap17.names;
        int[] intArray25 = binaryEntityMap17.values;
        binaryEntityMap17.size = (byte) 10;
        org.apache.commons.lang.Entities entities28 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap29 = entities28.map;
        java.lang.String str31 = entities28.unescape("hi!");
        org.apache.commons.lang.Entities entities32 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap33 = entities32.map;
        org.apache.commons.lang.Entities.EntityMap entityMap34 = entities32.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap36 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap36.add("hi!", 0);
        arrayEntityMap36.size = (byte) 1;
        arrayEntityMap36.growBy = 100;
        java.lang.String str45 = arrayEntityMap36.name((int) (byte) 1);
        entities32.map = arrayEntityMap36;
        entities28.map = arrayEntityMap36;
        int[] intArray48 = arrayEntityMap36.values;
        binaryEntityMap17.values = intArray48;
        java.lang.String str51 = binaryEntityMap17.name((int) (byte) -1);
        binaryEntityMap17.add("", 10);
        binaryEntityMap17.growBy = 32;
        int[] intArray57 = binaryEntityMap17.values;
        arrayEntityMap6.values = intArray57;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(entities28);
        org.junit.Assert.assertNotNull(entityMap29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(entities32);
        org.junit.Assert.assertNotNull(entityMap33);
        org.junit.Assert.assertNotNull(entityMap34);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        entities0.addEntity("", (int) '4');
        org.junit.Assert.assertNotNull(entities0);
// flaky "4) test2613(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(entityMap3);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.entityName(0);
        java.lang.String str7 = entities0.escape("");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap8 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str10 = lookupEntityMap8.name(0);
        java.lang.String str12 = lookupEntityMap8.name(0);
        int int14 = lookupEntityMap8.value("");
        lookupEntityMap8.add("hi!", 10);
        int int19 = lookupEntityMap8.value("");
        int int21 = lookupEntityMap8.value("");
        entities0.map = lookupEntityMap8;
        java.lang.String str24 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        org.apache.commons.lang.Entities entities27 = org.apache.commons.lang.Entities.HTML32;
        int int29 = entities27.entityValue("");
        entities27.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities entities33 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str35 = entities33.entityName((int) '#');
        entities33.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap39 = entities33.map;
        java.io.Writer writer40 = null;
        entities33.escape(writer40, "");
        java.lang.String str44 = entities33.unescape("hi!");
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
        entities33.addEntities(strArray67);
        entities27.addEntities(strArray67);
        entities0.addEntities(strArray67);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(entities27);
// flaky "5) test2615(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(entities33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(entityMap39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
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
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
        treeEntityMap17.add("", 35);
        java.util.Map map38 = treeEntityMap17.mapValueToName;
        treeEntityMap17.add("hi!", (int) (byte) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = null;
        hashEntityMap42.mapNameToValue = map43;
        java.util.Map map45 = hashEntityMap42.mapNameToValue;
        java.util.Map map46 = hashEntityMap42.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map48 = null;
        hashEntityMap47.mapNameToValue = map48;
        java.lang.String str51 = hashEntityMap47.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = null;
        hashEntityMap52.mapNameToValue = map53;
        java.lang.String str56 = hashEntityMap52.name((int) '4');
        java.lang.String str58 = hashEntityMap52.name((int) (short) 100);
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
        hashEntityMap52.mapValueToName = map73;
        hashEntityMap47.mapValueToName = map73;
        hashEntityMap42.mapNameToValue = map73;
        java.util.Map map78 = hashEntityMap42.mapNameToValue;
        hashEntityMap42.add("hi!", 100);
        java.util.Map map82 = hashEntityMap42.mapNameToValue;
        treeEntityMap17.mapNameToValue = map82;
        hashEntityMap0.mapValueToName = map82;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(52);
        java.lang.String str10 = lookupEntityMap0.name(1);
        java.lang.String str12 = lookupEntityMap0.name((int) '#');
        java.lang.String str14 = lookupEntityMap0.name(10);
        java.lang.String str16 = lookupEntityMap0.name(1);
        lookupEntityMap0.add("", (int) ' ');
        java.lang.String str21 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        java.util.Map map43 = treeEntityMap0.mapNameToValue;
        java.lang.String str45 = treeEntityMap0.name((int) (byte) 100);
        java.lang.String str47 = treeEntityMap0.name(0);
        treeEntityMap0.add("hi!", 0);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        int int11 = lookupEntityMap0.value("");
        java.lang.String str13 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", (int) 'a');
        java.lang.String str18 = lookupEntityMap0.name(52);
        java.lang.String str20 = lookupEntityMap0.name(32);
        lookupEntityMap0.add("", (int) (short) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        int int2 = arrayEntityMap1.growBy;
        arrayEntityMap1.growBy = 3;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str6 = binaryEntityMap4.name((-1));
        entities0.map = binaryEntityMap4;
        java.lang.String[][] strArray8 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray8);
        java.lang.String str11 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapValueToName;
        java.util.Map map6 = hashEntityMap4.mapNameToValue;
        entities0.map = hashEntityMap4;
        java.lang.String str9 = hashEntityMap4.name(35);
        hashEntityMap4.add("", (-1));
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(52);
        java.lang.String str10 = lookupEntityMap0.name(1);
        java.lang.String str12 = lookupEntityMap0.name((int) '#');
        java.lang.String str14 = lookupEntityMap0.name(10);
        java.lang.String str16 = lookupEntityMap0.name(1);
        java.lang.String str18 = lookupEntityMap0.name((int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        entities0.addEntity("", (int) (short) 1);
        java.lang.String str7 = entities0.entityName((int) '#');
        int int9 = entities0.entityValue("hi!");
        java.lang.String str11 = entities0.entityName((int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        java.lang.String str11 = binaryEntityMap1.name((-1));
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap13 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap13.growBy = 1;
        int int17 = arrayEntityMap13.value("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray22 = new int[] { ' ', '4' };
        binaryEntityMap19.values = intArray22;
        int int25 = binaryEntityMap19.value("");
        binaryEntityMap19.add("hi!", (int) (short) 100);
        int[] intArray29 = binaryEntityMap19.values;
        arrayEntityMap13.values = intArray29;
        java.lang.String str32 = arrayEntityMap13.name(0);
        int int34 = arrayEntityMap13.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap35 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int36 = binaryEntityMap35.size;
        binaryEntityMap35.size = 'a';
        int[] intArray39 = binaryEntityMap35.values;
        arrayEntityMap13.values = intArray39;
        binaryEntityMap1.values = intArray39;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 100, 52 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 100, 52 });
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(intArray39);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        arrayEntityMap1.size = 1;
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
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 100);
        int int2 = binaryEntityMap1.growBy;
        binaryEntityMap1.ensureCapacity(0);
        java.lang.String str6 = binaryEntityMap1.name((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        int int5 = hashEntityMap0.value("");
        java.lang.String str7 = hashEntityMap0.name((int) '4');
        int int9 = hashEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.add("hi!", (-1));
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap11.ensureCapacity(0);
        binaryEntityMap11.ensureCapacity(100);
        binaryEntityMap11.add("", (int) (byte) 1);
        int[] intArray22 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap11.values = intArray22;
        java.lang.String str25 = binaryEntityMap11.name((int) (short) 100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap27 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray28 = arrayEntityMap27.values;
        java.lang.String str30 = arrayEntityMap27.name((int) (short) 100);
        int int32 = arrayEntityMap27.value("hi!");
        int int33 = arrayEntityMap27.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap35 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray38 = new int[] { ' ', '4' };
        binaryEntityMap35.values = intArray38;
        arrayEntityMap27.values = intArray38;
        binaryEntityMap11.values = intArray38;
        binaryEntityMap1.values = intArray38;
        binaryEntityMap1.ensureCapacity(2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 1, 32 });
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0 });
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 32, 52 });
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("hi!", (int) (short) 0);
        int int7 = binaryEntityMap1.growBy;
        java.lang.String[] strArray8 = binaryEntityMap1.names;
        binaryEntityMap1.add("", (int) 'a');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap0 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.lang.String str7 = hashEntityMap1.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap15.mapNameToValue = map18;
        java.util.Map map20 = null;
        hashEntityMap15.mapNameToValue = map20;
        java.util.Map map22 = hashEntityMap15.mapValueToName;
        hashEntityMap8.mapNameToValue = map22;
        hashEntityMap1.mapValueToName = map22;
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
        hashEntityMap1.mapValueToName = map46;
        treeEntityMap0.mapNameToValue = map46;
        treeEntityMap0.add("", 2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.ensureCapacity((int) (byte) 1);
        binaryEntityMap1.add("hi!", (int) (byte) 0);
        java.lang.String[] strArray9 = binaryEntityMap1.names;
        int int10 = binaryEntityMap1.size;
        java.lang.String[] strArray11 = binaryEntityMap1.names;
        java.lang.String str13 = binaryEntityMap1.name((int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        int int17 = arrayEntityMap15.value("hi!");
        arrayEntityMap15.ensureCapacity(0);
        int[] intArray20 = arrayEntityMap15.values;
        binaryEntityMap1.values = intArray20;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0 });
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        java.lang.String str10 = binaryEntityMap1.name((int) (short) 1);
        binaryEntityMap1.ensureCapacity(35);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        arrayEntityMap1.add("hi!", (int) (byte) 10);
        arrayEntityMap1.size = (byte) 0;
        int int8 = arrayEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 100);
        arrayEntityMap1.size = 52;
        arrayEntityMap1.add("", 1);
        arrayEntityMap1.ensureCapacity(32);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        java.util.Map map2 = null;
        hashEntityMap0.mapNameToValue = map2;
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
        treeEntityMap4.mapNameToValue = map43;
        hashEntityMap0.mapValueToName = map43;
        java.lang.String str49 = hashEntityMap0.name(100);
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = (short) -1;
        binaryEntityMap1.ensureCapacity((int) (short) 100);
        binaryEntityMap1.size = 'a';
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        int int18 = binaryEntityMap1.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap20 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray21 = arrayEntityMap20.values;
        java.lang.String str23 = arrayEntityMap20.name((int) (short) 100);
        int int25 = arrayEntityMap20.value("");
        int int26 = arrayEntityMap20.size;
        java.lang.String[] strArray27 = arrayEntityMap20.names;
        binaryEntityMap1.names = strArray27;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0 });
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { null });
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", 35);
        lookupEntityMap0.add("hi!", (int) (short) -1);
        lookupEntityMap0.add("", 3);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        int int6 = binaryEntityMap1.size;
        binaryEntityMap1.growBy = (-1);
        int int10 = binaryEntityMap1.value("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        java.lang.String[] strArray27 = binaryEntityMap1.names;
        int int29 = binaryEntityMap1.value("");
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
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        java.lang.String str5 = lookupEntityMap0.name(0);
        java.lang.String str7 = lookupEntityMap0.name((int) (byte) 10);
        int int9 = lookupEntityMap0.value("");
        int int11 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        java.util.Map map29 = hashEntityMap24.mapValueToName;
        hashEntityMap0.mapNameToValue = map29;
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
        hashEntityMap0.mapValueToName = map50;
        java.util.Map map52 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        java.lang.String str22 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 52, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        int int6 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        int[] intArray33 = arrayEntityMap1.values;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(intArray33);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        int int11 = arrayEntityMap1.size;
        arrayEntityMap1.ensureCapacity((int) '#');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
        binaryEntityMap1.ensureCapacity(32);
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
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = 100;
        java.lang.String str10 = arrayEntityMap1.name((int) (short) 10);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = (-1);
        int int9 = arrayEntityMap1.growBy;
        java.lang.String str11 = arrayEntityMap1.name((int) (short) 1);
        java.lang.String str13 = arrayEntityMap1.name((int) (byte) 1);
        int int14 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap17.ensureCapacity((-1));
        binaryEntityMap17.growBy = 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int25 = arrayEntityMap23.value("");
        arrayEntityMap23.size = (byte) 100;
        arrayEntityMap23.size = 100;
        arrayEntityMap23.ensureCapacity((int) (short) 1);
        int[] intArray32 = arrayEntityMap23.values;
        binaryEntityMap17.values = intArray32;
        binaryEntityMap17.add("", (int) (short) 10);
        int[] intArray37 = binaryEntityMap17.values;
        entities0.map = binaryEntityMap17;
        java.io.Writer writer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer39, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10 });
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(32);
        lookupEntityMap0.add("hi!", 2);
        java.lang.String str15 = lookupEntityMap0.name(10);
        java.lang.String str17 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("hi!", 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("hi!");
        java.lang.String str12 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str15 = entities0.entityName((int) (byte) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.ensureCapacity((int) (byte) 10);
        int int6 = binaryEntityMap1.size;
        binaryEntityMap1.size = (byte) -1;
        binaryEntityMap1.size = 32;
        java.lang.String[] strArray11 = binaryEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.lang.String str19 = hashEntityMap15.name((int) '4');
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
        hashEntityMap15.mapValueToName = map37;
        hashEntityMap0.mapValueToName = map37;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = hashEntityMap0.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        lookupEntityMap0.add("", (int) (short) 0);
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
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        int[] intArray6 = binaryEntityMap1.values;
        java.lang.String str8 = binaryEntityMap1.name(100);
        int int10 = binaryEntityMap1.value("");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '4');
        int int3 = binaryEntityMap1.value("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        binaryEntityMap1.growBy = 100;
        binaryEntityMap1.add("hi!", (int) (byte) 0);
        binaryEntityMap1.size = (byte) 1;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        int int2 = arrayEntityMap1.size;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) -1);
        int int5 = arrayEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        java.util.Map map34 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str6 = lookupEntityMap0.name(100);
        int int8 = lookupEntityMap0.value("hi!");
        java.lang.String str10 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str12 = lookupEntityMap0.name(35);
        java.lang.String str14 = lookupEntityMap0.name(1);
        int int16 = lookupEntityMap0.value("");
        int int18 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        java.lang.String str12 = entities0.escape("hi!");
        entities0.addEntity("hi!", 35);
        java.lang.String str17 = entities0.entityName(2);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray22 = new int[] { ' ', '4' };
        binaryEntityMap19.values = intArray22;
        int int24 = binaryEntityMap19.growBy;
        int int25 = binaryEntityMap19.growBy;
        int int27 = binaryEntityMap19.value("hi!");
        int[] intArray28 = null;
        binaryEntityMap19.values = intArray28;
        java.lang.String str31 = binaryEntityMap19.name(1);
        entities0.map = binaryEntityMap19;
        java.lang.String str34 = binaryEntityMap19.name((int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 35, 10 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.io.Writer writer2 = null;
        entities0.escape(writer2, "");
        java.lang.String str6 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap8.growBy = (-1);
        int[] intArray11 = arrayEntityMap8.values;
        entities0.map = arrayEntityMap8;
        java.io.Writer writer13 = null;
        entities0.escape(writer13, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(intArray11);
// flaky "6) test2664(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32 });
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        lookupEntityMap0.add("hi!", (int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("");
        entities0.addEntity("", (int) (byte) 0);
        java.lang.String str17 = entities0.entityName((int) (byte) 1);
        org.apache.commons.lang.Entities.EntityMap entityMap18 = entities0.map;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap19 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str21 = lookupEntityMap19.name(0);
        java.lang.String str23 = lookupEntityMap19.name(0);
        int int25 = lookupEntityMap19.value("");
        lookupEntityMap19.add("hi!", 10);
        int int30 = lookupEntityMap19.value("");
        java.lang.String str32 = lookupEntityMap19.name(10);
        lookupEntityMap19.add("hi!", (int) 'a');
        entities0.map = lookupEntityMap19;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        int int10 = binaryEntityMap1.value("");
        binaryEntityMap1.ensureCapacity(100);
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 100);
        binaryEntityMap1.add("hi!", (int) (byte) 1);
        binaryEntityMap1.size = (byte) 0;
        java.lang.String[] strArray20 = null;
        binaryEntityMap1.names = strArray20;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        int int10 = entities0.entityValue("hi!");
        entities0.addEntity("hi!", 2);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities0.map;
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray17 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities16.addEntities(strArray17);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str22 = binaryEntityMap20.name((-1));
        entities16.map = binaryEntityMap20;
        entities16.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities entities27 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer28 = null;
        entities27.escape(writer28, "");
        java.lang.String str32 = entities27.unescape("");
        org.apache.commons.lang.Entities entities33 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap34 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap34.add("hi!", (int) (short) 1);
        int int39 = lookupEntityMap34.value("hi!");
        int int41 = lookupEntityMap34.value("");
        java.lang.String str43 = lookupEntityMap34.name((int) (byte) 1);
        lookupEntityMap34.add("hi!", 10);
        entities33.map = lookupEntityMap34;
        org.apache.commons.lang.Entities entities48 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap49 = entities48.map;
        java.lang.String str51 = entities48.unescape("");
        org.apache.commons.lang.Entities entities52 = org.apache.commons.lang.Entities.HTML32;
        int int54 = entities52.entityValue("");
        entities52.addEntity("hi!", (int) '4');
        java.lang.String str59 = entities52.entityName((int) (short) 1);
        int int61 = entities52.entityValue("");
        entities52.addEntity("hi!", (int) (byte) 100);
        java.lang.String[][] strArray65 = new java.lang.String[][] {};
        entities52.addEntities(strArray65);
        entities48.addEntities(strArray65);
        entities33.addEntities(strArray65);
        entities27.addEntities(strArray65);
        entities16.addEntities(strArray65);
        entities0.addEntities(strArray65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(entities27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(entities33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(entities48);
        org.junit.Assert.assertNotNull(entityMap49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(entities52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[][] {});
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        int int43 = lookupEntityMap28.value("");
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        int int9 = binaryEntityMap1.growBy;
        int int11 = binaryEntityMap1.value("hi!");
        int int13 = binaryEntityMap1.value("hi!");
        java.lang.String str15 = binaryEntityMap1.name((int) '#');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        hashEntityMap14.add("hi!", 100);
        java.util.Map map42 = hashEntityMap14.mapNameToValue;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("hi!", (int) (short) 0);
        int[] intArray7 = binaryEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int11 = arrayEntityMap9.value("");
        arrayEntityMap9.size = (byte) 100;
        arrayEntityMap9.size = 100;
        arrayEntityMap9.ensureCapacity((int) (short) 1);
        int[] intArray18 = arrayEntityMap9.values;
        binaryEntityMap1.values = intArray18;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0 });
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray7 = new int[] { (short) -1, 10 };
        arrayEntityMap1.values = intArray7;
        java.lang.String str10 = arrayEntityMap1.name((int) (short) 10);
        int int11 = arrayEntityMap1.size;
        java.lang.String str13 = arrayEntityMap1.name((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 10 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        int int27 = arrayEntityMap1.value("");
        java.lang.String str29 = arrayEntityMap1.name((int) (short) 1);
        java.lang.String str31 = arrayEntityMap1.name((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int26 = arrayEntityMap25.size;
        int int27 = arrayEntityMap25.growBy;
        java.lang.String str29 = arrayEntityMap25.name((int) (short) 100);
        int int30 = arrayEntityMap25.growBy;
        java.lang.String str32 = arrayEntityMap25.name((int) ' ');
        arrayEntityMap25.add("", (int) ' ');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int39 = arrayEntityMap37.value("hi!");
        int int40 = arrayEntityMap37.growBy;
        arrayEntityMap37.growBy = 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap44 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray47 = new int[] { ' ', '4' };
        binaryEntityMap44.values = intArray47;
        binaryEntityMap44.size = '#';
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap52 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray53 = arrayEntityMap52.values;
        java.lang.String str55 = arrayEntityMap52.name((int) (short) 100);
        int int57 = arrayEntityMap52.value("hi!");
        arrayEntityMap52.size = (byte) 0;
        int int60 = arrayEntityMap52.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap62 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap62.add("hi!", 0);
        arrayEntityMap62.size = (byte) 1;
        int[] intArray68 = new int[] {};
        arrayEntityMap62.values = intArray68;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap71 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int73 = arrayEntityMap71.value("");
        java.lang.String[] strArray74 = arrayEntityMap71.names;
        arrayEntityMap62.names = strArray74;
        arrayEntityMap52.names = strArray74;
        binaryEntityMap44.names = strArray74;
        arrayEntityMap37.names = strArray74;
        arrayEntityMap25.names = strArray74;
        arrayEntityMap1.names = strArray74;
        arrayEntityMap1.ensureCapacity(2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 0 });
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] {});
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { null });
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = hashEntityMap0.name(100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = null;
        hashEntityMap9.mapNameToValue = map10;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = null;
        hashEntityMap13.mapNameToValue = map14;
        java.lang.String str17 = hashEntityMap13.name((int) '4');
        java.util.Map map18 = hashEntityMap13.mapValueToName;
        hashEntityMap12.mapValueToName = map18;
        hashEntityMap9.mapValueToName = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = null;
        hashEntityMap21.mapNameToValue = map22;
        java.util.Map map24 = hashEntityMap21.mapNameToValue;
        java.util.Map map25 = hashEntityMap21.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = null;
        hashEntityMap26.mapNameToValue = map27;
        java.lang.String str30 = hashEntityMap26.name((int) '4');
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
        hashEntityMap26.mapValueToName = map52;
        hashEntityMap21.mapNameToValue = map52;
        java.util.Map map57 = hashEntityMap21.mapNameToValue;
        hashEntityMap9.mapValueToName = map57;
        hashEntityMap0.mapNameToValue = map57;
        java.util.Map map60 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        int[] intArray4 = binaryEntityMap1.values;
        int int6 = binaryEntityMap1.value("");
        int int7 = binaryEntityMap1.size;
        int int9 = binaryEntityMap1.value("hi!");
        java.lang.String str11 = binaryEntityMap1.name(52);
        binaryEntityMap1.add("", (int) (short) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap2 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map3 = null;
        hashEntityMap2.mapNameToValue = map3;
        java.lang.String str6 = hashEntityMap2.name((int) '4');
        java.util.Map map7 = hashEntityMap2.mapValueToName;
        hashEntityMap1.mapValueToName = map7;
        java.util.Map map9 = hashEntityMap1.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = null;
        hashEntityMap11.mapNameToValue = map12;
        java.lang.String str15 = hashEntityMap11.name((int) '4');
        java.util.Map map16 = hashEntityMap11.mapValueToName;
        hashEntityMap10.mapValueToName = map16;
        java.util.Map map18 = hashEntityMap10.mapValueToName;
        hashEntityMap1.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = null;
        hashEntityMap20.mapNameToValue = map21;
        java.util.Map map23 = hashEntityMap20.mapNameToValue;
        java.util.Map map24 = hashEntityMap20.mapValueToName;
        java.lang.String str26 = hashEntityMap20.name(10);
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
        hashEntityMap20.mapNameToValue = map41;
        hashEntityMap1.mapValueToName = map41;
        hashEntityMap0.mapNameToValue = map41;
        hashEntityMap0.add("hi!", (int) ' ');
        java.lang.String str50 = hashEntityMap0.name(100);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.size = '#';
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray12 = new int[] { ' ', '4' };
        binaryEntityMap9.values = intArray12;
        int int15 = binaryEntityMap9.value("");
        int int17 = binaryEntityMap9.value("");
        binaryEntityMap9.add("hi!", 35);
        int int21 = binaryEntityMap9.size;
        binaryEntityMap9.add("hi!", 2);
        java.lang.String str26 = binaryEntityMap9.name((-1));
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap28.ensureCapacity(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray35 = new int[] { ' ', '4' };
        binaryEntityMap32.values = intArray35;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap38 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray39 = arrayEntityMap38.values;
        java.lang.String str41 = arrayEntityMap38.name((int) (short) 100);
        int[] intArray44 = new int[] { (short) -1, 10 };
        arrayEntityMap38.values = intArray44;
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        arrayEntityMap38.names = strArray47;
        binaryEntityMap32.names = strArray47;
        java.lang.String[] strArray50 = binaryEntityMap32.names;
        binaryEntityMap32.add("", 10);
        binaryEntityMap32.ensureCapacity(10);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "" };
        binaryEntityMap32.names = strArray58;
        binaryEntityMap28.names = strArray58;
        binaryEntityMap9.names = strArray58;
        binaryEntityMap1.names = strArray58;
        binaryEntityMap1.size = 100;
        int int66 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 2, 35 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 0 });
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 32 + "'", int66 == 32);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        int int6 = binaryEntityMap1.size;
        java.lang.String str8 = binaryEntityMap1.name((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("hi!");
        java.lang.String str10 = entities0.escape("hi!");
        java.lang.String str12 = entities0.entityName(32);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str6 = lookupEntityMap0.name(100);
        int int8 = lookupEntityMap0.value("hi!");
        java.lang.String str10 = lookupEntityMap0.name((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = lookupEntityMap0.name((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
        java.util.Map map19 = hashEntityMap0.mapValueToName;
        java.lang.String str21 = hashEntityMap0.name((int) (short) 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(52);
        java.lang.String str10 = lookupEntityMap0.name(1);
        java.lang.String str12 = lookupEntityMap0.name((int) '#');
        java.lang.String str14 = lookupEntityMap0.name(35);
        lookupEntityMap0.add("hi!", 2);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = null;
        hashEntityMap4.mapNameToValue = map5;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.lang.String str11 = hashEntityMap7.name((int) '4');
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
        hashEntityMap7.mapNameToValue = map26;
        hashEntityMap4.mapValueToName = map26;
        hashEntityMap0.mapValueToName = map26;
        int int32 = hashEntityMap0.value("");
        hashEntityMap0.add("", (int) '#');
        int int37 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        int int10 = entities0.entityValue("hi!");
        java.lang.String str12 = entities0.escape("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        int int9 = binaryEntityMap1.growBy;
        binaryEntityMap1.ensureCapacity((int) '4');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(97);
        int int3 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) '4');
        java.lang.String str7 = entities0.escape("");
        entities0.addEntity("hi!", (int) ' ');
        java.lang.String str12 = entities0.unescape("");
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", (-1));
        java.lang.String str9 = entities0.entityName(10);
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap10 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str12 = lookupEntityMap10.name(0);
        java.lang.String str14 = lookupEntityMap10.name(0);
        int int16 = lookupEntityMap10.value("");
        int int18 = lookupEntityMap10.value("");
        lookupEntityMap10.add("", (-1));
        lookupEntityMap10.add("", (int) (short) 10);
        lookupEntityMap10.add("", 32);
        int int29 = lookupEntityMap10.value("hi!");
        entities0.map = lookupEntityMap10;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        java.lang.String str8 = binaryEntityMap1.name((int) ' ');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        java.lang.String str4 = entities0.escape("hi!");
        int int6 = entities0.entityValue("hi!");
        entities0.addEntity("", (int) 'a');
        java.lang.Class<?> wildcardClass10 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        arrayEntityMap1.add("hi!", (int) (byte) 0);
        arrayEntityMap1.ensureCapacity(1);
        arrayEntityMap1.growBy = 1;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 52 });
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("", (int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str7 = binaryEntityMap5.name((-1));
        entities0.map = binaryEntityMap5;
        int int10 = binaryEntityMap5.value("");
        int[] intArray11 = binaryEntityMap5.values;
        java.lang.String str13 = binaryEntityMap5.name(0);
        org.junit.Assert.assertNotNull(entities0);
// flaky "7) test2695(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        int int10 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertNotNull(entityMap12);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", 100);
        java.lang.String str7 = entities0.entityName((int) (byte) 100);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        entities0.addEntity("", 0);
        entities0.addEntity("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap16.growBy = 0;
        arrayEntityMap16.add("hi!", 0);
        int int22 = arrayEntityMap16.size;
        arrayEntityMap16.growBy = 0;
        int int25 = arrayEntityMap16.growBy;
        entities0.map = arrayEntityMap16;
        java.lang.String str28 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap6.add("hi!", 0);
        arrayEntityMap6.size = (byte) 1;
        arrayEntityMap6.growBy = 100;
        entities0.map = arrayEntityMap6;
        arrayEntityMap6.add("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(entities0);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        binaryEntityMap1.add("", (int) (byte) 1);
        int[] intArray12 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap1.values = intArray12;
        binaryEntityMap1.add("", 0);
        java.lang.String str18 = binaryEntityMap1.name((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 1, 32 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (int) ' ');
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
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        java.lang.String str4 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int6 = binaryEntityMap1.growBy;
        int int8 = binaryEntityMap1.value("hi!");
        java.lang.String str10 = binaryEntityMap1.name(0);
        binaryEntityMap1.add("", 35);
        int[] intArray14 = binaryEntityMap1.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int16 = binaryEntityMap15.size;
        binaryEntityMap15.size = 'a';
        binaryEntityMap15.add("", (int) (short) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray24 = arrayEntityMap23.values;
        java.lang.String str26 = arrayEntityMap23.name((int) (short) 100);
        int int28 = arrayEntityMap23.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap30 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap30.add("hi!", 0);
        arrayEntityMap30.size = (byte) 1;
        int[] intArray36 = new int[] {};
        arrayEntityMap30.values = intArray36;
        arrayEntityMap23.values = intArray36;
        arrayEntityMap23.ensureCapacity((int) (short) 0);
        int int41 = arrayEntityMap23.growBy;
        java.lang.String[] strArray42 = arrayEntityMap23.names;
        binaryEntityMap15.names = strArray42;
        binaryEntityMap1.names = strArray42;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0 });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { null });
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        int int13 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", (int) '#');
        java.lang.String str18 = lookupEntityMap0.name(100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        int int10 = binaryEntityMap1.value("");
        binaryEntityMap1.ensureCapacity(100);
        java.lang.String str14 = binaryEntityMap1.name((-1));
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int18 = arrayEntityMap16.value("");
        java.lang.String[] strArray19 = arrayEntityMap16.names;
        int[] intArray20 = arrayEntityMap16.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap22.add("hi!", 0);
        java.lang.String str27 = arrayEntityMap22.name(0);
        int[] intArray28 = arrayEntityMap22.values;
        arrayEntityMap16.values = intArray28;
        binaryEntityMap1.values = intArray28;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", 35);
        lookupEntityMap0.add("hi!", (int) (short) -1);
        java.lang.String str19 = lookupEntityMap0.name((int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("hi!");
        java.lang.String str10 = entities0.escape("hi!");
        org.apache.commons.lang.Entities entities11 = new org.apache.commons.lang.Entities();
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
        entities11.map = hashEntityMap12;
        java.lang.String str44 = entities11.escape("hi!");
        java.lang.String str46 = entities11.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap48 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities11.map = arrayEntityMap48;
        java.io.Writer writer50 = null;
        entities11.escape(writer50, "");
        java.lang.String str54 = entities11.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities11);
        org.apache.commons.lang.Entities entities56 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap57 = entities56.map;
        java.lang.String str59 = entities56.unescape("hi!");
        org.apache.commons.lang.Entities entities60 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap61 = entities60.map;
        org.apache.commons.lang.Entities.EntityMap entityMap62 = entities60.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap64 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap64.add("hi!", 0);
        arrayEntityMap64.size = (byte) 1;
        arrayEntityMap64.growBy = 100;
        java.lang.String str73 = arrayEntityMap64.name((int) (byte) 1);
        entities60.map = arrayEntityMap64;
        entities56.map = arrayEntityMap64;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities56);
        org.apache.commons.lang.Entities entities77 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray78 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
// flaky "8) test2706(org.apache.commons.lang.RegressionTest5)":         entities77.addEntities(strArray78);
        entities56.addEntities(strArray78);
        entities11.addEntities(strArray78);
// flaky "1) test2706(org.apache.commons.lang.RegressionTest5)":         entities0.addEntities(strArray78);
        java.lang.String str84 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(entities56);
        org.junit.Assert.assertNotNull(entityMap57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(entities60);
        org.junit.Assert.assertNotNull(entityMap61);
        org.junit.Assert.assertNotNull(entityMap62);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(entities77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        arrayEntityMap1.add("", (int) (byte) 10);
        int[] intArray7 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str11 = binaryEntityMap9.name((int) '#');
        int[] intArray12 = binaryEntityMap9.values;
        int int14 = binaryEntityMap9.value("");
        java.lang.String[] strArray15 = binaryEntityMap9.names;
        arrayEntityMap1.names = strArray15;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = arrayEntityMap1.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 10 });
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int6 = binaryEntityMap1.growBy;
        int int7 = binaryEntityMap1.growBy;
        int int9 = binaryEntityMap1.value("hi!");
        int int11 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.add("", 2);
        int int15 = binaryEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 2, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap3.add("hi!", 0);
        arrayEntityMap3.size = (byte) 1;
        arrayEntityMap3.size = (-1);
        arrayEntityMap3.size = (byte) 10;
        entities0.map = arrayEntityMap3;
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str17 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.size = '#';
        binaryEntityMap1.growBy = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = binaryEntityMap1.name(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
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
        int int22 = hashEntityMap5.value("hi!");
        hashEntityMap5.add("", 52);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = hashEntityMap26.mapValueToName;
        java.util.Map map28 = null;
        hashEntityMap26.mapNameToValue = map28;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        java.lang.String str35 = hashEntityMap31.name((int) '4');
        java.util.Map map36 = hashEntityMap31.mapValueToName;
        hashEntityMap30.mapValueToName = map36;
        hashEntityMap26.mapNameToValue = map36;
        java.util.Map map39 = hashEntityMap26.mapNameToValue;
        hashEntityMap26.add("hi!", 35);
        int int44 = hashEntityMap26.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = null;
        hashEntityMap45.mapNameToValue = map46;
        java.lang.String str49 = hashEntityMap45.name((int) '4');
        java.util.Map map50 = hashEntityMap45.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map52 = hashEntityMap51.mapValueToName;
        java.util.Map map53 = null;
        hashEntityMap51.mapNameToValue = map53;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map57 = null;
        hashEntityMap56.mapNameToValue = map57;
        java.lang.String str60 = hashEntityMap56.name((int) '4');
        java.util.Map map61 = hashEntityMap56.mapValueToName;
        hashEntityMap55.mapValueToName = map61;
        hashEntityMap51.mapNameToValue = map61;
        hashEntityMap45.mapNameToValue = map61;
        java.lang.String str66 = hashEntityMap45.name(2);
        java.util.Map map67 = hashEntityMap45.mapNameToValue;
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
        java.util.Map map87 = hashEntityMap68.mapValueToName;
        hashEntityMap45.mapValueToName = map87;
        java.util.Map map89 = hashEntityMap45.mapNameToValue;
        hashEntityMap26.mapValueToName = map89;
        hashEntityMap5.mapNameToValue = map89;
        hashEntityMap0.mapNameToValue = map89;
        java.util.Map map93 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", (int) (byte) 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map93);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(52);
        java.lang.String str10 = lookupEntityMap0.name(1);
        java.lang.String str12 = lookupEntityMap0.name((int) '#');
        java.lang.String str14 = lookupEntityMap0.name(35);
        java.lang.String str16 = lookupEntityMap0.name((int) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("");
        java.lang.String str7 = entities0.entityName(0);
        java.lang.Class<?> wildcardClass8 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        binaryEntityMap1.add("", 1);
        binaryEntityMap1.ensureCapacity((int) (byte) 10);
        binaryEntityMap1.add("", 0);
        int int18 = binaryEntityMap1.value("hi!");
        java.lang.String[] strArray19 = binaryEntityMap1.names;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(entityMap19);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
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
        java.lang.String[] strArray23 = binaryEntityMap5.names;
        binaryEntityMap5.add("", 10);
        binaryEntityMap5.ensureCapacity(10);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "" };
        binaryEntityMap5.names = strArray31;
        binaryEntityMap1.names = strArray31;
        binaryEntityMap1.add("hi!", (int) (short) 1);
        java.lang.String str38 = binaryEntityMap1.name((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        int int10 = entities0.entityValue("hi!");
        entities0.addEntity("hi!", 2);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        int int18 = binaryEntityMap17.size;
        binaryEntityMap17.add("", (int) (short) 1);
        java.lang.String str23 = binaryEntityMap17.name((int) (short) 1);
        entities0.map = binaryEntityMap17;
        org.apache.commons.lang.Entities.EntityMap entityMap25 = null;
        entities0.map = entityMap25;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        java.util.Map map14 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.ensureCapacity((int) (byte) 1);
        java.lang.String[] strArray6 = null;
        binaryEntityMap1.names = strArray6;
        binaryEntityMap1.growBy = '4';
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        java.util.Map map12 = hashEntityMap0.mapNameToValue;
        java.lang.String str14 = hashEntityMap0.name((int) (short) 1);
        java.lang.String str16 = hashEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        int int13 = lookupEntityMap0.value("");
        java.lang.String str15 = lookupEntityMap0.name((int) '#');
        int int17 = lookupEntityMap0.value("hi!");
        java.lang.String str19 = lookupEntityMap0.name((int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        java.util.Map map51 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.add("hi!", (int) (byte) 0);
        java.lang.String[] strArray10 = arrayEntityMap1.names;
        arrayEntityMap1.ensureCapacity(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap14.add("hi!", 0);
        arrayEntityMap14.size = (byte) 1;
        arrayEntityMap14.size = (-1);
        int[] intArray22 = arrayEntityMap14.values;
        arrayEntityMap1.values = intArray22;
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        java.lang.String str43 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap44 = null;
        entities0.map = entityMap44;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        java.lang.String str11 = binaryEntityMap1.name((int) (byte) 10);
        binaryEntityMap1.add("", 52);
        binaryEntityMap1.growBy = 'a';
        int int18 = binaryEntityMap1.value("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapValueToName;
        java.util.Map map6 = hashEntityMap4.mapNameToValue;
        entities0.map = hashEntityMap4;
        java.lang.String str9 = entities0.unescape("");
        java.io.Writer writer10 = null;
        entities0.escape(writer10, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        int int4 = entities0.entityValue("hi!");
        int int6 = entities0.entityValue("hi!");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = null;
        entities0.map = entityMap9;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        java.lang.String str40 = hashEntityMap14.name((int) (byte) 10);
        java.lang.Class<?> wildcardClass41 = hashEntityMap14.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        arrayEntityMap1.size = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
        java.lang.String str63 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(1);
        int[] intArray2 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = '4';
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray9 = new int[] { ' ', '4' };
        binaryEntityMap6.values = intArray9;
        binaryEntityMap6.growBy = (byte) -1;
        binaryEntityMap6.growBy = 'a';
        binaryEntityMap6.size = (byte) 0;
        java.lang.String str18 = binaryEntityMap6.name(2);
        java.lang.String[] strArray19 = binaryEntityMap6.names;
        java.lang.String[] strArray20 = binaryEntityMap6.names;
        binaryEntityMap1.names = strArray20;
        binaryEntityMap1.add("hi!", 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 52 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        entities0.addEntity("hi!", 32);
        java.lang.String str15 = entities0.entityName((int) (byte) 0);
        java.lang.String str17 = entities0.entityName((int) (short) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 10 });
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("");
        java.lang.String str4 = lookupEntityMap0.name(1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        int int13 = lookupEntityMap0.value("hi!");
        int int15 = lookupEntityMap0.value("hi!");
        java.lang.String str17 = lookupEntityMap0.name((int) (short) 1);
        lookupEntityMap0.add("hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("");
        java.lang.String str4 = lookupEntityMap0.name(1);
        int int6 = lookupEntityMap0.value("hi!");
        int int8 = lookupEntityMap0.value("hi!");
        java.lang.String str10 = lookupEntityMap0.name(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        java.lang.String str13 = lookupEntityMap0.name((int) ' ');
        java.lang.String str15 = lookupEntityMap0.name(100);
        lookupEntityMap0.add("", 97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        hashEntityMap0.add("hi!", (-1));
        hashEntityMap0.add("hi!", 0);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name(100);
        binaryEntityMap0.growBy = (byte) -1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap8.growBy = (-1);
        arrayEntityMap8.ensureCapacity((int) (byte) 1);
        int[] intArray13 = arrayEntityMap8.values;
        arrayEntityMap6.values = intArray13;
        binaryEntityMap0.values = intArray13;
        int int16 = binaryEntityMap0.growBy;
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.add("hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 2 out of bounds for int[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        org.apache.commons.lang.Entities.EntityMap entityMap86 = entities0.map;
        entities0.addEntity("hi!", 97);
        int int91 = entities0.entityValue("");
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
        org.junit.Assert.assertNotNull(entityMap86);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        java.lang.String str3 = arrayEntityMap1.name(32);
        java.lang.String str5 = arrayEntityMap1.name((int) (byte) 100);
        arrayEntityMap1.add("hi!", (int) (short) 100);
        arrayEntityMap1.ensureCapacity(52);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        java.lang.String str23 = hashEntityMap0.name(1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) '4');
        java.lang.String str7 = entities0.entityName((int) (short) 1);
        int int9 = entities0.entityValue("");
        java.lang.String str11 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.entityName((int) (byte) 0);
        java.lang.String str16 = entities0.unescape("");
        java.lang.String str18 = entities0.escape("");
        java.lang.String str20 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
// flaky "9) test2743(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertArrayEquals(intArray8, new int[] { 160, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        java.lang.String str63 = binaryEntityMap1.name((int) '4');
        binaryEntityMap1.growBy = '4';
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap67 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int69 = arrayEntityMap67.value("");
        arrayEntityMap67.growBy = 'a';
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap73 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap73.ensureCapacity((-1));
        binaryEntityMap73.growBy = 10;
        java.lang.String str79 = binaryEntityMap73.name((int) (byte) -1);
        java.lang.String[] strArray80 = binaryEntityMap73.names;
        arrayEntityMap67.names = strArray80;
        binaryEntityMap1.names = strArray80;
        binaryEntityMap1.add("", (int) (short) 10);
        binaryEntityMap1.size = (-1);
        binaryEntityMap1.ensureCapacity((int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 10 });
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
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { null, "", null, null, null, null, null, null, null, null });
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int21 = entities0.entityValue("");
        java.lang.String str23 = entities0.unescape("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        int int9 = arrayEntityMap1.value("");
        int int11 = arrayEntityMap1.value("");
        int int12 = arrayEntityMap1.growBy;
        int[] intArray13 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        int[] intArray16 = new int[] {};
        arrayEntityMap15.values = intArray16;
        arrayEntityMap1.values = intArray16;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] {});
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        binaryEntityMap1.add("", (int) (byte) 1);
        java.lang.String str13 = binaryEntityMap1.name((int) (byte) 0);
        binaryEntityMap1.add("hi!", (int) (short) 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
        java.lang.String str35 = binaryEntityMap1.name((int) (byte) 1);
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
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name((-1));
        binaryEntityMap1.ensureCapacity((-1));
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        java.lang.String str12 = binaryEntityMap1.name((int) (short) -1);
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 0);
        binaryEntityMap1.size = (short) 0;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        int int23 = arrayEntityMap1.size;
        arrayEntityMap1.growBy = 0;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.add("hi!", 32);
        int int7 = binaryEntityMap1.growBy;
        binaryEntityMap1.size = (short) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 10);
        binaryEntityMap1.growBy = (short) -1;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(32);
        java.lang.String str12 = lookupEntityMap0.name((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = null;
        binaryEntityMap0.values = intArray1;
        int[] intArray3 = binaryEntityMap0.values;
        java.lang.String str5 = binaryEntityMap0.name(32);
        binaryEntityMap0.ensureCapacity((int) (short) 1);
        int int8 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(intArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.ensureCapacity((int) (byte) -1);
        binaryEntityMap1.ensureCapacity((int) (byte) 0);
        binaryEntityMap1.size = 3;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.io.Writer writer2 = null;
        entities0.escape(writer2, "");
        java.io.Writer writer5 = null;
        entities0.escape(writer5, "");
        java.lang.String str9 = entities0.entityName((int) (short) 100);
        java.lang.String str11 = entities0.unescape("hi!");
        java.lang.String str13 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.add("hi!", 52);
        binaryEntityMap1.add("", 10);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        entities0.addEntity("hi!", 100);
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.escape("hi!");
        entities0.addEntity("hi!", 1);
        entities0.addEntity("", (int) (byte) 1);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        int int4 = binaryEntityMap1.size;
        binaryEntityMap1.size = 'a';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = binaryEntityMap1.name(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        binaryEntityMap1.add("", (int) (byte) 1);
        int[] intArray12 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap1.values = intArray12;
        java.lang.String str15 = binaryEntityMap1.name((int) (byte) 0);
        binaryEntityMap1.ensureCapacity(52);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1, 1, 32 });
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapValueToName;
        java.util.Map map6 = hashEntityMap4.mapNameToValue;
        entities0.map = hashEntityMap4;
        int int9 = hashEntityMap4.value("");
        int int11 = hashEntityMap4.value("hi!");
        java.util.Map map12 = hashEntityMap4.mapValueToName;
        java.util.Map map13 = hashEntityMap4.mapValueToName;
        int int15 = hashEntityMap4.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        binaryEntityMap1.growBy = (byte) -1;
        binaryEntityMap1.size = ' ';
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) (byte) 10);
        java.lang.String str7 = entities0.unescape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        hashEntityMap0.add("", (int) (byte) 0);
        java.lang.String str12 = hashEntityMap0.name((int) (short) 10);
        java.lang.String str14 = hashEntityMap0.name((-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (short) -1);
        int[] intArray4 = null;
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.growBy = (short) 1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap9.growBy = 1;
        int int13 = arrayEntityMap9.value("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray18 = new int[] { ' ', '4' };
        binaryEntityMap15.values = intArray18;
        int int21 = binaryEntityMap15.value("");
        binaryEntityMap15.add("hi!", (int) (short) 100);
        int[] intArray25 = binaryEntityMap15.values;
        arrayEntityMap9.values = intArray25;
        java.lang.String str28 = arrayEntityMap9.name(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray33 = new int[] { ' ', '4' };
        binaryEntityMap30.values = intArray33;
        java.lang.String str36 = binaryEntityMap30.name((int) (byte) 100);
        binaryEntityMap30.add("", (int) (byte) 0);
        java.lang.String str41 = binaryEntityMap30.name(10);
        org.apache.commons.lang.Entities entities42 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap43 = entities42.map;
        java.lang.String str45 = entities42.unescape("hi!");
        org.apache.commons.lang.Entities entities46 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap47 = entities46.map;
        org.apache.commons.lang.Entities.EntityMap entityMap48 = entities46.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap50 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap50.add("hi!", 0);
        arrayEntityMap50.size = (byte) 1;
        arrayEntityMap50.growBy = 100;
        java.lang.String str59 = arrayEntityMap50.name((int) (byte) 1);
        entities46.map = arrayEntityMap50;
        entities42.map = arrayEntityMap50;
        arrayEntityMap50.add("hi!", 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap66 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray69 = new int[] { ' ', '4' };
        binaryEntityMap66.values = intArray69;
        binaryEntityMap66.size = '#';
        int[] intArray73 = binaryEntityMap66.values;
        arrayEntityMap50.values = intArray73;
        binaryEntityMap30.values = intArray73;
        arrayEntityMap9.values = intArray73;
        binaryEntityMap1.values = intArray73;
        binaryEntityMap1.add("hi!", 100);
        java.lang.Class<?> wildcardClass81 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 100, 52 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, 52 });
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(entities42);
        org.junit.Assert.assertNotNull(entityMap43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(entities46);
        org.junit.Assert.assertNotNull(entityMap47);
        org.junit.Assert.assertNotNull(entityMap48);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
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
        hashEntityMap0.add("", (-1));
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
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.size = 0;
        java.lang.String str10 = binaryEntityMap1.name(2);
        binaryEntityMap1.add("", (int) (short) 1);
        binaryEntityMap1.add("hi!", 97);
        java.lang.String str18 = binaryEntityMap1.name((int) (byte) 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str8 = entities6.unescape("hi!");
        java.io.Writer writer9 = null;
        entities6.escape(writer9, "");
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities6.map;
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
        entities6.map = arrayEntityMap21;
        org.apache.commons.lang.Entities.EntityMap entityMap34 = entities6.map;
        entities6.addEntity("hi!", (int) (short) -1);
        java.lang.String str39 = entities6.escape("");
        org.apache.commons.lang.Entities entities40 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap41 = entities40.map;
        java.lang.String str43 = entities40.unescape("hi!");
        org.apache.commons.lang.Entities entities44 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap45 = entities44.map;
        org.apache.commons.lang.Entities.EntityMap entityMap46 = entities44.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap48 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap48.add("hi!", 0);
        arrayEntityMap48.size = (byte) 1;
        arrayEntityMap48.growBy = 100;
        java.lang.String str57 = arrayEntityMap48.name((int) (byte) 1);
        entities44.map = arrayEntityMap48;
        entities40.map = arrayEntityMap48;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities40);
        org.apache.commons.lang.Entities entities61 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray62 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities61.addEntities(strArray62);
        entities40.addEntities(strArray62);
        entities6.addEntities(strArray62);
        entities0.addEntities(strArray62);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(entityMap34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(entities40);
        org.junit.Assert.assertNotNull(entityMap41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(entities44);
        org.junit.Assert.assertNotNull(entityMap45);
        org.junit.Assert.assertNotNull(entityMap46);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(entities61);
        org.junit.Assert.assertNotNull(strArray62);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.size = (-1);
        arrayEntityMap1.growBy = '4';
        int int12 = arrayEntityMap1.value("");
        arrayEntityMap1.size = (byte) 10;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.ensureCapacity((int) (byte) -1);
        binaryEntityMap1.ensureCapacity((int) (byte) 0);
        binaryEntityMap1.growBy = 2;
        binaryEntityMap1.ensureCapacity((int) 'a');
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        int int3 = entities0.entityValue("hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = (short) -1;
        binaryEntityMap1.add("hi!", 100);
        java.lang.String str15 = binaryEntityMap1.name((int) (byte) 10);
        int int17 = binaryEntityMap1.value("");
        int int19 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        int[] intArray21 = binaryEntityMap1.values;
        int int23 = binaryEntityMap1.value("hi!");
        int int25 = binaryEntityMap1.value("");
        java.lang.String str27 = binaryEntityMap1.name(2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
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
        java.lang.String str32 = arrayEntityMap1.name((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
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
        // The following exception was thrown during execution in test generation
        try {
            int int53 = hashEntityMap0.value("hi!");
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
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        java.util.Map map48 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", 0);
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
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
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
        entities0.addEntity("hi!", 0);
        java.io.Writer writer45 = null;
        entities0.escape(writer45, "");
        entities0.addEntity("hi!", (int) (byte) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        binaryEntityMap1.size = (short) 10;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 100, 52 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, 52 });
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        int int5 = hashEntityMap0.value("");
        java.util.Map map6 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap7 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.util.Map map11 = null;
        hashEntityMap8.mapNameToValue = map11;
        java.util.Map map13 = null;
        hashEntityMap8.mapNameToValue = map13;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap15.mapNameToValue = map18;
        java.util.Map map20 = null;
        hashEntityMap15.mapNameToValue = map20;
        java.util.Map map22 = hashEntityMap15.mapValueToName;
        hashEntityMap8.mapNameToValue = map22;
        treeEntityMap7.mapValueToName = map22;
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
        treeEntityMap7.mapNameToValue = map46;
        int int51 = treeEntityMap7.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = null;
        hashEntityMap53.mapNameToValue = map54;
        java.lang.String str57 = hashEntityMap53.name((int) '4');
        java.util.Map map58 = hashEntityMap53.mapValueToName;
        hashEntityMap52.mapValueToName = map58;
        java.util.Map map60 = hashEntityMap52.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map63 = null;
        hashEntityMap62.mapNameToValue = map63;
        java.lang.String str66 = hashEntityMap62.name((int) '4');
        java.util.Map map67 = hashEntityMap62.mapValueToName;
        hashEntityMap61.mapValueToName = map67;
        java.util.Map map69 = hashEntityMap61.mapValueToName;
        hashEntityMap52.mapNameToValue = map69;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap71 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map72 = null;
        hashEntityMap71.mapNameToValue = map72;
        java.util.Map map74 = null;
        hashEntityMap71.mapNameToValue = map74;
        java.util.Map map76 = null;
        hashEntityMap71.mapNameToValue = map76;
        java.util.Map map78 = hashEntityMap71.mapValueToName;
        hashEntityMap52.mapNameToValue = map78;
        java.util.Map map80 = hashEntityMap52.mapValueToName;
        treeEntityMap7.mapNameToValue = map80;
        hashEntityMap0.mapValueToName = map80;
        int int84 = hashEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 100 + "'", int84 == 100);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name((int) (short) 100);
        lookupEntityMap0.add("hi!", 32);
        lookupEntityMap0.add("", 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(32);
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 100);
        lookupEntityMap0.add("hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.ensureCapacity((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2 out of bounds for int[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.entityName((int) '#');
        int int13 = entities0.entityValue("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray18 = new int[] { ' ', '4' };
        binaryEntityMap15.values = intArray18;
        java.lang.String str21 = binaryEntityMap15.name((int) (byte) 100);
        binaryEntityMap15.add("hi!", (-1));
        java.lang.String str26 = binaryEntityMap15.name(0);
        java.lang.String str28 = binaryEntityMap15.name(10);
        java.lang.String str30 = binaryEntityMap15.name((int) 'a');
        java.lang.String str32 = binaryEntityMap15.name((int) '#');
        entities0.map = binaryEntityMap15;
        java.io.Writer writer34 = null;
        entities0.escape(writer34, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        java.util.Map map87 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map87);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        int int4 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = 2;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray7 = new int[] { (short) -1, 10 };
        arrayEntityMap1.values = intArray7;
        java.lang.String str10 = arrayEntityMap1.name((int) (short) 10);
        arrayEntityMap1.add("", 35);
        int int14 = arrayEntityMap1.growBy;
        arrayEntityMap1.growBy = 52;
        int int18 = arrayEntityMap1.value("");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 35, 10 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
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
        binaryEntityMap1.add("", 0);
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
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        int int9 = hashEntityMap0.value("hi!");
        java.lang.String str11 = hashEntityMap0.name(1);
        java.util.Map map12 = hashEntityMap0.mapValueToName;
        java.util.Map map13 = hashEntityMap0.mapNameToValue;
        int int15 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        lookupEntityMap0.add("hi!", 35);
        java.lang.String str14 = lookupEntityMap0.name((int) (byte) 0);
        lookupEntityMap0.add("", 1);
        int int19 = lookupEntityMap0.value("hi!");
        java.lang.String str21 = lookupEntityMap0.name((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
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
        java.io.Writer writer18 = null;
        entities0.escape(writer18, "");
        int int22 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        java.lang.String str36 = arrayEntityMap1.name((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        java.lang.String str22 = binaryEntityMap1.name((int) (byte) 100);
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
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray10 = new int[] { ' ', '4' };
        binaryEntityMap7.values = intArray10;
        int int13 = binaryEntityMap7.value("");
        java.lang.String[] strArray14 = binaryEntityMap7.names;
        binaryEntityMap1.names = strArray14;
        java.lang.String[] strArray16 = binaryEntityMap1.names;
        binaryEntityMap1.growBy = 10;
        java.lang.String str20 = binaryEntityMap1.name((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
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
        org.apache.commons.lang.Entities.EntityMap entityMap20 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(entityMap20);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
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
        java.util.Map map43 = treeEntityMap0.mapNameToValue;
        java.util.Map map44 = treeEntityMap0.mapNameToValue;
        java.lang.String str46 = treeEntityMap0.name((int) '4');
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hashEntityMap0.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        java.lang.String str11 = binaryEntityMap1.name((int) (byte) 10);
        binaryEntityMap1.add("", 52);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[32]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '4');
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 10);
        int int5 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
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
        hashEntityMap0.add("", (int) '4');
        int int21 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        entities0.addEntity("", (int) (short) 1);
        java.lang.String str7 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = entities0.entityValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(entityMap8);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.growBy = 10;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) -1);
        java.lang.String[] strArray8 = binaryEntityMap1.names;
        int[] intArray9 = binaryEntityMap1.values;
        binaryEntityMap1.size = (byte) 10;
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
        int[] intArray32 = arrayEntityMap20.values;
        binaryEntityMap1.values = intArray32;
        java.lang.String str35 = binaryEntityMap1.name((int) (byte) -1);
        binaryEntityMap1.add("", 10);
        int int39 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(entities12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertNotNull(entityMap17);
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
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
        java.lang.String str29 = binaryEntityMap1.name((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0 });
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 10 });
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) 'a');
        int int4 = lookupEntityMap0.value("hi!");
        int int6 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap48 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap48.growBy = (-1);
        arrayEntityMap48.ensureCapacity((int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap54 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray55 = arrayEntityMap54.values;
        java.lang.String str57 = arrayEntityMap54.name((int) (short) 100);
        int[] intArray60 = new int[] { (short) -1, 10 };
        arrayEntityMap54.values = intArray60;
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        arrayEntityMap54.names = strArray63;
        int[] intArray65 = arrayEntityMap54.values;
        arrayEntityMap48.values = intArray65;
        arrayEntityMap48.add("", 35);
        int[] intArray70 = arrayEntityMap48.values;
        arrayEntityMap1.values = intArray70;
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
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 0 });
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 35, 10 });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 35, 10 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 35, 10 });
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String[] strArray5 = binaryEntityMap1.names;
        binaryEntityMap1.add("", (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        int int17 = arrayEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(32);
        java.lang.String str12 = lookupEntityMap0.name((int) (byte) 10);
        int int14 = lookupEntityMap0.value("hi!");
        java.lang.String str16 = lookupEntityMap0.name(52);
        int int18 = lookupEntityMap0.value("hi!");
        int int20 = lookupEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
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
        int int37 = lookupEntityMap28.value("hi!");
        java.lang.String str39 = lookupEntityMap28.name(3);
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
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        int int22 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 52, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.size = '#';
        int[] intArray8 = binaryEntityMap1.values;
        binaryEntityMap1.ensureCapacity(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = binaryEntityMap1.name((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
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
        java.lang.String str19 = hashEntityMap0.name((int) 'a');
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("hi!", (int) (byte) 100);
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", (-1));
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = null;
        hashEntityMap8.mapNameToValue = map9;
        java.lang.String str12 = hashEntityMap8.name((int) '4');
        java.lang.String str14 = hashEntityMap8.name((int) (byte) 1);
        java.lang.String str16 = hashEntityMap8.name(100);
        java.util.Map map17 = hashEntityMap8.mapNameToValue;
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
        hashEntityMap8.mapValueToName = map39;
        hashEntityMap0.mapValueToName = map39;
        hashEntityMap0.add("hi!", (int) (short) 10);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
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
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap22 = new org.apache.commons.lang.Entities.TreeEntityMap();
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
        treeEntityMap22.mapValueToName = map37;
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
        treeEntityMap22.mapNameToValue = map61;
        int int66 = treeEntityMap22.value("hi!");
        java.lang.String str68 = treeEntityMap22.name((int) 'a');
        treeEntityMap22.add("hi!", 35);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap73 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map74 = null;
        hashEntityMap73.mapNameToValue = map74;
        java.lang.String str77 = hashEntityMap73.name((int) '4');
        java.util.Map map78 = hashEntityMap73.mapValueToName;
        hashEntityMap72.mapValueToName = map78;
        java.util.Map map80 = hashEntityMap72.mapValueToName;
        java.util.Map map81 = hashEntityMap72.mapValueToName;
        treeEntityMap22.mapNameToValue = map81;
        hashEntityMap0.mapValueToName = map81;
        java.lang.String str85 = hashEntityMap0.name((int) (byte) 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(str85);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        lookupEntityMap0.add("hi!", 35);
        lookupEntityMap0.add("hi!", (int) (short) 10);
        int int17 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
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
        hashEntityMap0.add("hi!", (int) '4');
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
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) '4');
        java.lang.String str7 = entities0.entityName((int) (short) 1);
        int int9 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) (byte) 100);
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        entities0.addEntities(strArray13);
        org.apache.commons.lang.Entities entities15 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray16 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities15.addEntities(strArray16);
        org.apache.commons.lang.Entities entities18 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities18.map;
        entities15.map = entityMap19;
        java.io.Writer writer21 = null;
        entities15.escape(writer21, "");
        java.lang.String str25 = entities15.unescape("hi!");
        org.apache.commons.lang.Entities entities26 = org.apache.commons.lang.Entities.HTML32;
        int int28 = entities26.entityValue("");
        java.lang.String[][] strArray29 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities26.addEntities(strArray29);
        entities15.addEntities(strArray29);
        entities0.addEntities(strArray29);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap34 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray35 = arrayEntityMap34.values;
        java.lang.String str37 = arrayEntityMap34.name((int) (short) 100);
        arrayEntityMap34.size = (byte) 0;
        int int40 = arrayEntityMap34.size;
        int int42 = arrayEntityMap34.value("");
        entities0.map = arrayEntityMap34;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(entities15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(entities18);
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(entities26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(intArray35);
// flaky "10) test2820(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertArrayEquals(intArray35, new int[] { 52 });
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) '4');
        java.lang.String str7 = entities0.unescape("");
        java.lang.String str9 = entities0.escape("hi!");
        entities0.addEntity("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
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
        java.lang.String str19 = arrayEntityMap1.name((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        int int7 = binaryEntityMap1.size;
        binaryEntityMap1.add("hi!", 0);
        binaryEntityMap1.growBy = 0;
        int int13 = binaryEntityMap1.growBy;
        java.lang.String str15 = binaryEntityMap1.name((int) (byte) 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str15 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str17 = lookupEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
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
        java.util.Map map33 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap34.add("", (int) (byte) 100);
        java.util.Map map38 = hashEntityMap34.mapNameToValue;
        hashEntityMap0.mapValueToName = map38;
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", 35);
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
        org.junit.Assert.assertNull(map33);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        hashEntityMap0.add("", (int) (byte) 0);
        hashEntityMap0.add("", 52);
        hashEntityMap0.add("hi!", 32);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        java.lang.String str52 = hashEntityMap0.name(10);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        org.apache.commons.lang.Entities.EntityMap entityMap29 = entities0.map;
        java.lang.String str31 = entities0.unescape("");
        java.io.Writer writer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer32, "hi!");
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
        org.junit.Assert.assertNotNull(entityMap29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        java.lang.String[] strArray4 = arrayEntityMap1.names;
        int[] intArray5 = arrayEntityMap1.values;
        java.lang.String str7 = arrayEntityMap1.name(2);
        int int8 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) '4');
        entities0.addEntity("hi!", (int) '#');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(2);
        binaryEntityMap1.growBy = 100;
        binaryEntityMap1.growBy = 32;
        java.lang.String[] strArray6 = binaryEntityMap1.names;
        java.lang.String str8 = binaryEntityMap1.name(10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { null, null });
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        entities0.addEntity("hi!", 32);
        java.lang.String str15 = entities0.entityName((int) (byte) 0);
        entities0.addEntity("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 10 });
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
        int int17 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int21 = arrayEntityMap19.value("");
        java.lang.String[] strArray22 = arrayEntityMap19.names;
        int[] intArray23 = arrayEntityMap19.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap25.add("hi!", 0);
        java.lang.String str30 = arrayEntityMap25.name(0);
        int[] intArray31 = arrayEntityMap25.values;
        arrayEntityMap19.values = intArray31;
        arrayEntityMap19.growBy = 2;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap36 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap36.add("hi!", 0);
        arrayEntityMap36.size = (byte) 1;
        arrayEntityMap36.size = (-1);
        int[] intArray44 = arrayEntityMap36.values;
        arrayEntityMap19.values = intArray44;
        arrayEntityMap1.values = intArray44;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray44);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
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
        java.util.Map map34 = hashEntityMap0.mapNameToValue;
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
        org.junit.Assert.assertNull(map34);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
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
        org.apache.commons.lang.Entities.EntityMap entityMap27 = null;
        entities0.map = entityMap27;
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("", 32);
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
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
        java.io.Writer writer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer21, "hi!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        int int10 = binaryEntityMap1.growBy;
        java.lang.String str12 = binaryEntityMap1.name(0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
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
        java.lang.String str38 = entities0.entityName((int) (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
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
        int int35 = binaryEntityMap1.size;
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("");
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap7 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap7.add("hi!", (int) (short) 1);
        int int12 = lookupEntityMap7.value("hi!");
        int int14 = lookupEntityMap7.value("");
        java.lang.String str16 = lookupEntityMap7.name((int) (byte) 1);
        lookupEntityMap7.add("hi!", 10);
        entities6.map = lookupEntityMap7;
        org.apache.commons.lang.Entities entities21 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap22 = entities21.map;
        java.lang.String str24 = entities21.unescape("");
        org.apache.commons.lang.Entities entities25 = org.apache.commons.lang.Entities.HTML32;
        int int27 = entities25.entityValue("");
        entities25.addEntity("hi!", (int) '4');
        java.lang.String str32 = entities25.entityName((int) (short) 1);
        int int34 = entities25.entityValue("");
        entities25.addEntity("hi!", (int) (byte) 100);
        java.lang.String[][] strArray38 = new java.lang.String[][] {};
        entities25.addEntities(strArray38);
        entities21.addEntities(strArray38);
        entities6.addEntities(strArray38);
        entities0.addEntities(strArray38);
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(entities21);
        org.junit.Assert.assertNull(entityMap22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(entities25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[][] {});
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        int int7 = binaryEntityMap1.size;
        binaryEntityMap1.add("hi!", 0);
        java.lang.String str12 = binaryEntityMap1.name(3);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        int int10 = entities0.entityValue("hi!");
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.entityName(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int17 = arrayEntityMap16.size;
        int int18 = arrayEntityMap16.growBy;
        java.lang.String str20 = arrayEntityMap16.name((int) (short) 100);
        int int22 = arrayEntityMap16.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap24 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap24.add("hi!", 0);
        arrayEntityMap24.size = (byte) 1;
        arrayEntityMap24.growBy = 100;
        java.lang.String[] strArray32 = arrayEntityMap24.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap34 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap34.add("hi!", 0);
        arrayEntityMap34.size = (byte) 1;
        arrayEntityMap34.growBy = 100;
        java.lang.String[] strArray42 = arrayEntityMap34.names;
        arrayEntityMap24.names = strArray42;
        arrayEntityMap16.names = strArray42;
        arrayEntityMap16.growBy = (byte) 1;
        entities0.map = arrayEntityMap16;
        int int49 = arrayEntityMap16.value("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map50 = null;
        hashEntityMap49.mapNameToValue = map50;
        java.util.Map map52 = null;
        hashEntityMap49.mapNameToValue = map52;
        java.util.Map map54 = null;
        hashEntityMap49.mapNameToValue = map54;
        java.util.Map map56 = hashEntityMap49.mapValueToName;
        java.util.Map map57 = hashEntityMap49.mapNameToValue;
        java.util.Map map58 = hashEntityMap49.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int61 = hashEntityMap59.value("");
        java.util.Map map62 = hashEntityMap59.mapValueToName;
        hashEntityMap49.mapValueToName = map62;
        hashEntityMap19.mapNameToValue = map62;
        hashEntityMap0.mapNameToValue = map62;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
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
        java.lang.String str28 = binaryEntityMap1.name((int) (short) 100);
        java.lang.Class<?> wildcardClass29 = binaryEntityMap1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
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
        entities0.addEntity("", 32);
        java.lang.String str48 = entities0.escape("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
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
        java.io.Writer writer55 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer55, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("");
        entities0.addEntity("", (int) (byte) 0);
        java.lang.String str17 = entities0.entityName((int) (byte) 1);
        org.apache.commons.lang.Entities.EntityMap entityMap18 = entities0.map;
        java.lang.String str20 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        java.lang.String str7 = entities0.entityName((int) (short) 0);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entityMap8);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        int int11 = arrayEntityMap1.growBy;
        java.lang.String[] strArray12 = arrayEntityMap1.names;
        int[] intArray13 = arrayEntityMap1.values;
        arrayEntityMap1.size = (byte) -1;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 52 });
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(10);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        lookupEntityMap0.add("", 0);
        int int9 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", (int) (short) 0);
        int int14 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        binaryEntityMap1.add("hi!", 52);
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
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        // The following exception was thrown during execution in test generation
        try {
            entityMap6.add("hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(entityMap6);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        java.util.Map map44 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", 1);
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
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.size = (-1);
        arrayEntityMap1.size = (byte) 10;
        int[] intArray11 = arrayEntityMap1.values;
        arrayEntityMap1.size = 2;
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        entities0.addEntity("", (int) (byte) 1);
        int int10 = entities0.entityValue("");
        int int12 = entities0.entityValue("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        java.lang.String[] strArray4 = arrayEntityMap1.names;
        int[] intArray5 = arrayEntityMap1.values;
        java.lang.String str7 = arrayEntityMap1.name(2);
        arrayEntityMap1.add("hi!", (int) (short) 100);
        int int12 = arrayEntityMap1.value("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(10);
        java.lang.String[] strArray2 = binaryEntityMap1.names;
        java.lang.String str4 = binaryEntityMap1.name(100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
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
        java.lang.String str52 = binaryEntityMap1.name(32);
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
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        int int13 = lookupEntityMap0.value("hi!");
        java.lang.String str15 = lookupEntityMap0.name(35);
        lookupEntityMap0.add("hi!", 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(35);
        java.lang.String str3 = binaryEntityMap1.name((int) '4');
        java.lang.Class<?> wildcardClass4 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
        java.lang.String str63 = binaryEntityMap1.name((int) '4');
        binaryEntityMap1.growBy = '4';
        binaryEntityMap1.ensureCapacity(3);
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
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
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
        java.lang.String[] strArray23 = binaryEntityMap8.names;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap25.add("", (int) ' ');
        binaryEntityMap25.add("hi!", (int) (short) 1);
        int[] intArray32 = binaryEntityMap25.values;
        binaryEntityMap25.growBy = (short) -1;
        binaryEntityMap25.add("hi!", 100);
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
        int[] intArray58 = arrayEntityMap46.values;
        int int59 = arrayEntityMap46.size;
        int[] intArray60 = arrayEntityMap46.values;
        binaryEntityMap25.values = intArray60;
        binaryEntityMap8.values = intArray60;
        java.lang.String str64 = binaryEntityMap8.name(0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(entityMap6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(entities38);
        org.junit.Assert.assertNotNull(entityMap39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(entities42);
        org.junit.Assert.assertNotNull(entityMap43);
        org.junit.Assert.assertNotNull(entityMap44);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
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
        hashEntityMap0.add("", (int) (byte) 0);
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
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap24.ensureCapacity(0);
        binaryEntityMap24.ensureCapacity(100);
        binaryEntityMap24.add("", (int) (byte) 1);
        int int33 = binaryEntityMap24.value("hi!");
        entities0.map = binaryEntityMap24;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        java.lang.String str20 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = hashEntityMap0.name((int) (short) -1);
        java.lang.String str10 = hashEntityMap0.name((-1));
        java.util.Map map11 = null;
        hashEntityMap0.mapNameToValue = map11;
        java.util.Map map13 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapValueToName;
        java.util.Map map16 = hashEntityMap14.mapNameToValue;
        int int18 = hashEntityMap14.value("");
        int int20 = hashEntityMap14.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = null;
        hashEntityMap21.mapNameToValue = map22;
        java.lang.String str25 = hashEntityMap21.name((int) '4');
        java.lang.String str27 = hashEntityMap21.name((int) (short) 100);
        java.util.Map map28 = hashEntityMap21.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = null;
        hashEntityMap29.mapNameToValue = map30;
        java.util.Map map32 = null;
        hashEntityMap29.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap29.mapNameToValue = map34;
        java.util.Map map36 = hashEntityMap29.mapValueToName;
        hashEntityMap21.mapNameToValue = map36;
        hashEntityMap14.mapNameToValue = map36;
        hashEntityMap0.mapValueToName = map36;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String str4 = entities0.unescape("hi!");
        java.lang.String str6 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        arrayEntityMap1.size = 0;
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
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 1, 1, 32 });
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) '4');
        int int10 = binaryEntityMap1.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int13 = arrayEntityMap12.size;
        int int14 = arrayEntityMap12.growBy;
        java.lang.String str16 = arrayEntityMap12.name((int) (short) 100);
        int int18 = arrayEntityMap12.value("");
        int int19 = arrayEntityMap12.size;
        arrayEntityMap12.size = (byte) 1;
        int[] intArray22 = arrayEntityMap12.values;
        binaryEntityMap1.values = intArray22;
        int int24 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int10 = binaryEntityMap1.value("hi!");
        int int12 = binaryEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap14.add("hi!", (-1));
        binaryEntityMap14.ensureCapacity((int) 'a');
        int[] intArray20 = binaryEntityMap14.values;
        binaryEntityMap1.values = intArray20;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int10 = binaryEntityMap1.value("hi!");
        int int12 = binaryEntityMap1.value("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
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
        java.util.Map map50 = hashEntityMap37.mapNameToValue;
        hashEntityMap37.add("hi!", 35);
        hashEntityMap37.add("", 100);
        java.util.Map map57 = hashEntityMap37.mapValueToName;
        hashEntityMap0.mapNameToValue = map57;
        hashEntityMap0.add("hi!", (int) (byte) 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap17.ensureCapacity((-1));
        binaryEntityMap17.growBy = 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int25 = arrayEntityMap23.value("");
        arrayEntityMap23.size = (byte) 100;
        arrayEntityMap23.size = 100;
        arrayEntityMap23.ensureCapacity((int) (short) 1);
        int[] intArray32 = arrayEntityMap23.values;
        binaryEntityMap17.values = intArray32;
        binaryEntityMap17.add("", (int) (short) 10);
        int[] intArray37 = binaryEntityMap17.values;
        entities0.map = binaryEntityMap17;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap40 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str42 = binaryEntityMap40.name((int) '#');
        binaryEntityMap40.add("", (int) (byte) -1);
        int int46 = binaryEntityMap40.size;
        int int47 = binaryEntityMap40.growBy;
        int[] intArray48 = binaryEntityMap40.values;
        int[] intArray49 = binaryEntityMap40.values;
        java.lang.String[] strArray50 = binaryEntityMap40.names;
        binaryEntityMap17.names = strArray50;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10 });
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1) });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "" });
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
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
        java.util.Map map83 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map83);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        int int10 = entities0.entityValue("hi!");
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.entityName(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int17 = arrayEntityMap16.size;
        int int18 = arrayEntityMap16.growBy;
        java.lang.String str20 = arrayEntityMap16.name((int) (short) 100);
        int int22 = arrayEntityMap16.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap24 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap24.add("hi!", 0);
        arrayEntityMap24.size = (byte) 1;
        arrayEntityMap24.growBy = 100;
        java.lang.String[] strArray32 = arrayEntityMap24.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap34 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap34.add("hi!", 0);
        arrayEntityMap34.size = (byte) 1;
        arrayEntityMap34.growBy = 100;
        java.lang.String[] strArray42 = arrayEntityMap34.names;
        arrayEntityMap24.names = strArray42;
        arrayEntityMap16.names = strArray42;
        arrayEntityMap16.growBy = (byte) 1;
        entities0.map = arrayEntityMap16;
        arrayEntityMap16.growBy = 32;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray42);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
        int int26 = binaryEntityMap1.value("hi!");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        int int11 = arrayEntityMap1.growBy;
        java.lang.String[] strArray12 = arrayEntityMap1.names;
        int[] intArray13 = arrayEntityMap1.values;
        java.lang.String[] strArray14 = null;
        arrayEntityMap1.names = strArray14;
        arrayEntityMap1.growBy = 3;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 52 });
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) (short) 100);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(entityMap6);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = 100;
        java.lang.String str10 = arrayEntityMap1.name((int) (byte) 1);
        arrayEntityMap1.add("", 52);
        arrayEntityMap1.growBy = 10;
        arrayEntityMap1.add("", 35);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
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
        java.io.Writer writer45 = null;
        entities0.escape(writer45, "");
        entities0.addEntity("", 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(entityMap42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.growBy = (byte) -1;
        binaryEntityMap1.growBy = 'a';
        binaryEntityMap1.size = (byte) 0;
        java.lang.String str13 = binaryEntityMap1.name(2);
        java.lang.String str15 = binaryEntityMap1.name(97);
        java.lang.String str17 = binaryEntityMap1.name((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.size;
        binaryEntityMap0.ensureCapacity(2);
        binaryEntityMap0.ensureCapacity((int) (short) 1);
        int int6 = binaryEntityMap0.size;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
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
        binaryEntityMap1.growBy = (byte) -1;
        int int21 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        int int13 = lookupEntityMap0.value("hi!");
        int int15 = lookupEntityMap0.value("hi!");
        java.lang.String str17 = lookupEntityMap0.name((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
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
        hashEntityMap0.add("hi!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        java.lang.String str10 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
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
        arrayEntityMap1.growBy = 0;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str22 = binaryEntityMap20.name((int) '#');
        binaryEntityMap20.add("", (int) (byte) -1);
        java.lang.String str27 = binaryEntityMap20.name((int) (byte) 10);
        int int29 = binaryEntityMap20.value("");
        int[] intArray30 = binaryEntityMap20.values;
        arrayEntityMap1.values = intArray30;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1) });
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
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
        int int60 = arrayEntityMap3.value("");
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        int int6 = arrayEntityMap1.value("hi!");
        int int8 = arrayEntityMap1.value("hi!");
        java.lang.String str10 = arrayEntityMap1.name(10);
        java.lang.String[] strArray11 = arrayEntityMap1.names;
        int int13 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        int int10 = entities0.entityValue("hi!");
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.entityName(0);
        java.lang.String str16 = entities0.entityName((int) (short) 0);
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities0.map;
        java.lang.String str19 = entities0.escape("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(entityMap17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        entities0.addEntity("", (int) (byte) 1);
        int int10 = entities0.entityValue("");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = null;
        hashEntityMap34.mapNameToValue = map35;
        java.lang.String str38 = hashEntityMap34.name((int) '4');
        java.util.Map map39 = hashEntityMap34.mapValueToName;
        hashEntityMap33.mapValueToName = map39;
        hashEntityMap30.mapValueToName = map39;
        hashEntityMap0.mapValueToName = map39;
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
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
        arrayEntityMap8.growBy = (-1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.add("hi!", (-1));
        int int10 = binaryEntityMap1.growBy;
        binaryEntityMap1.ensureCapacity((int) (byte) 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.lang.String str5 = hashEntityMap0.name((int) 'a');
        java.lang.String str7 = hashEntityMap0.name((int) (short) 0);
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        java.lang.String str10 = hashEntityMap0.name(1);
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML40;
        int int13 = entities11.entityValue("hi!");
        java.lang.String[][] strArray14 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities11.addEntities(strArray14);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities11);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = null;
        hashEntityMap17.mapNameToValue = map18;
        java.lang.String str21 = hashEntityMap17.name((int) '4');
        java.util.Map map22 = hashEntityMap17.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapValueToName;
        java.util.Map map25 = null;
        hashEntityMap23.mapNameToValue = map25;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = null;
        hashEntityMap28.mapNameToValue = map29;
        java.lang.String str32 = hashEntityMap28.name((int) '4');
        java.util.Map map33 = hashEntityMap28.mapValueToName;
        hashEntityMap27.mapValueToName = map33;
        hashEntityMap23.mapNameToValue = map33;
        hashEntityMap17.mapNameToValue = map33;
        java.lang.String str38 = hashEntityMap17.name(2);
        java.util.Map map39 = hashEntityMap17.mapNameToValue;
        entities11.map = hashEntityMap17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int43 = hashEntityMap41.value("");
        java.util.Map map44 = hashEntityMap41.mapValueToName;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap45 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = null;
        hashEntityMap46.mapNameToValue = map47;
        java.util.Map map49 = null;
        hashEntityMap46.mapNameToValue = map49;
        java.util.Map map51 = null;
        hashEntityMap46.mapNameToValue = map51;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = null;
        hashEntityMap53.mapNameToValue = map54;
        java.util.Map map56 = null;
        hashEntityMap53.mapNameToValue = map56;
        java.util.Map map58 = null;
        hashEntityMap53.mapNameToValue = map58;
        java.util.Map map60 = hashEntityMap53.mapValueToName;
        hashEntityMap46.mapNameToValue = map60;
        treeEntityMap45.mapValueToName = map60;
        hashEntityMap41.mapValueToName = map60;
        java.util.Map map64 = hashEntityMap41.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = null;
        hashEntityMap65.mapNameToValue = map66;
        java.util.Map map68 = null;
        hashEntityMap65.mapNameToValue = map68;
        java.util.Map map70 = hashEntityMap65.mapValueToName;
        hashEntityMap41.mapNameToValue = map70;
        hashEntityMap17.mapValueToName = map70;
        hashEntityMap0.mapValueToName = map70;
        java.util.Map map74 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
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
        binaryEntityMap1.growBy = 1;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapValueToName;
        java.util.Map map6 = hashEntityMap4.mapNameToValue;
        entities0.map = hashEntityMap4;
        java.lang.String str9 = hashEntityMap4.name((int) (short) 100);
        hashEntityMap4.add("hi!", 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
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
        java.lang.String str88 = entities0.unescape("");
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
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = null;
        binaryEntityMap0.values = intArray1;
        int[] intArray3 = binaryEntityMap0.values;
        java.lang.String str5 = binaryEntityMap0.name(32);
        binaryEntityMap0.ensureCapacity((int) (short) 1);
        int int9 = binaryEntityMap0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(intArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name(100);
        binaryEntityMap0.growBy = (byte) -1;
        java.lang.String[] strArray5 = binaryEntityMap0.names;
        int int6 = binaryEntityMap0.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str9 = binaryEntityMap7.name(100);
        binaryEntityMap7.growBy = (byte) -1;
        java.lang.String[] strArray12 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray12;
        int int14 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        int int6 = binaryEntityMap1.size;
        binaryEntityMap1.ensureCapacity(0);
        int int10 = binaryEntityMap1.value("");
        int int12 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
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
        java.util.Map map12 = hashEntityMap0.mapNameToValue;
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(map12);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hashEntityMap0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        java.lang.String str12 = entities0.escape("hi!");
        java.lang.String str14 = entities0.unescape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 34, 10 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        int int9 = arrayEntityMap1.value("");
        int int11 = arrayEntityMap1.value("");
        int int12 = arrayEntityMap1.growBy;
        int[] intArray13 = arrayEntityMap1.values;
        arrayEntityMap1.add("hi!", (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1) });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1) });
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
        java.io.Writer writer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer30, "hi!");
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
        org.junit.Assert.assertNotNull(intArray17);
// flaky "11) test2906(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertArrayEquals(intArray17, new int[] { 52, 100 });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = null;
        hashEntityMap18.mapNameToValue = map19;
        java.lang.String str22 = hashEntityMap18.name((int) '4');
        java.util.Map map23 = hashEntityMap18.mapValueToName;
        hashEntityMap17.mapValueToName = map23;
        java.util.Map map25 = hashEntityMap17.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = null;
        hashEntityMap27.mapNameToValue = map28;
        java.lang.String str31 = hashEntityMap27.name((int) '4');
        java.util.Map map32 = hashEntityMap27.mapValueToName;
        hashEntityMap26.mapValueToName = map32;
        java.util.Map map34 = hashEntityMap26.mapValueToName;
        hashEntityMap17.mapNameToValue = map34;
        hashEntityMap0.mapValueToName = map34;
        int int38 = hashEntityMap0.value("");
        java.util.Map map39 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("hi!", 97);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.ensureCapacity((int) (byte) 10);
        binaryEntityMap1.add("hi!", (int) (byte) 0);
        binaryEntityMap1.add("hi!", 32);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
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
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int6 = binaryEntityMap1.growBy;
        java.lang.String[] strArray7 = binaryEntityMap1.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap9.add("hi!", 0);
        arrayEntityMap9.size = (byte) 1;
        arrayEntityMap9.growBy = 100;
        java.lang.String[] strArray17 = arrayEntityMap9.names;
        int[] intArray18 = arrayEntityMap9.values;
        binaryEntityMap1.values = intArray18;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
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
        java.lang.String str63 = entities0.unescape("hi!");
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
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
        binaryEntityMap1.growBy = 0;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap39 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap39.add("", (int) ' ');
        binaryEntityMap39.add("hi!", (int) (short) 1);
        int[] intArray46 = binaryEntityMap39.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap48 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int50 = arrayEntityMap48.value("");
        java.lang.String[] strArray51 = arrayEntityMap48.names;
        int[] intArray52 = arrayEntityMap48.values;
        binaryEntityMap39.values = intArray52;
        binaryEntityMap1.values = intArray52;
        binaryEntityMap1.ensureCapacity((int) (short) 0);
        binaryEntityMap1.ensureCapacity((int) (short) 10);
        binaryEntityMap1.add("", (int) 'a');
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
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 0 });
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
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
        int int28 = arrayEntityMap1.value("hi!");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
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
        int int41 = hashEntityMap14.value("");
        hashEntityMap14.add("hi!", (int) (byte) -1);
        hashEntityMap14.add("", 32);
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int7 = arrayEntityMap5.value("hi!");
        int int8 = arrayEntityMap5.growBy;
        arrayEntityMap5.growBy = 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray15 = new int[] { ' ', '4' };
        binaryEntityMap12.values = intArray15;
        binaryEntityMap12.size = '#';
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap20 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray21 = arrayEntityMap20.values;
        java.lang.String str23 = arrayEntityMap20.name((int) (short) 100);
        int int25 = arrayEntityMap20.value("hi!");
        arrayEntityMap20.size = (byte) 0;
        int int28 = arrayEntityMap20.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap30 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap30.add("hi!", 0);
        arrayEntityMap30.size = (byte) 1;
        int[] intArray36 = new int[] {};
        arrayEntityMap30.values = intArray36;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int41 = arrayEntityMap39.value("");
        java.lang.String[] strArray42 = arrayEntityMap39.names;
        arrayEntityMap30.names = strArray42;
        arrayEntityMap20.names = strArray42;
        binaryEntityMap12.names = strArray42;
        arrayEntityMap5.names = strArray42;
        arrayEntityMap1.names = strArray42;
        int[] intArray48 = arrayEntityMap1.values;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0 });
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 0 });
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
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
        java.util.Map map22 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapValueToName;
        java.util.Map map25 = null;
        hashEntityMap23.mapNameToValue = map25;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = null;
        hashEntityMap28.mapNameToValue = map29;
        java.lang.String str32 = hashEntityMap28.name((int) '4');
        java.util.Map map33 = hashEntityMap28.mapValueToName;
        hashEntityMap27.mapValueToName = map33;
        hashEntityMap23.mapNameToValue = map33;
        java.util.Map map36 = hashEntityMap23.mapNameToValue;
        hashEntityMap23.add("hi!", 35);
        hashEntityMap23.add("", 100);
        java.util.Map map43 = hashEntityMap23.mapValueToName;
        hashEntityMap0.mapNameToValue = map43;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = null;
        hashEntityMap24.mapNameToValue = map25;
        java.lang.String str28 = hashEntityMap24.name((int) '4');
        java.util.Map map29 = hashEntityMap24.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapValueToName;
        java.util.Map map32 = null;
        hashEntityMap30.mapNameToValue = map32;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = null;
        hashEntityMap35.mapNameToValue = map36;
        java.lang.String str39 = hashEntityMap35.name((int) '4');
        java.util.Map map40 = hashEntityMap35.mapValueToName;
        hashEntityMap34.mapValueToName = map40;
        hashEntityMap30.mapNameToValue = map40;
        hashEntityMap24.mapNameToValue = map40;
        java.lang.String str45 = hashEntityMap24.name(2);
        java.util.Map map46 = hashEntityMap24.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = null;
        hashEntityMap48.mapNameToValue = map49;
        java.lang.String str52 = hashEntityMap48.name((int) '4');
        java.util.Map map53 = hashEntityMap48.mapValueToName;
        hashEntityMap47.mapValueToName = map53;
        java.util.Map map55 = hashEntityMap47.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map58 = null;
        hashEntityMap57.mapNameToValue = map58;
        java.lang.String str61 = hashEntityMap57.name((int) '4');
        java.util.Map map62 = hashEntityMap57.mapValueToName;
        hashEntityMap56.mapValueToName = map62;
        java.util.Map map64 = hashEntityMap56.mapValueToName;
        hashEntityMap47.mapNameToValue = map64;
        java.util.Map map66 = hashEntityMap47.mapValueToName;
        hashEntityMap24.mapValueToName = map66;
        hashEntityMap0.mapValueToName = map66;
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        int int4 = entities0.entityValue("hi!");
        java.lang.String str6 = entities0.unescape("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        java.lang.String str8 = hashEntityMap0.name((int) (short) 0);
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        java.lang.String str11 = hashEntityMap0.name(100);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
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
        java.lang.Class<?> wildcardClass26 = binaryEntityMap1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
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
        java.io.Writer writer56 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer56, "hi!");
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
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 0 });
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        int int12 = binaryEntityMap1.value("");
        java.lang.String str14 = binaryEntityMap1.name((int) '4');
        java.lang.String str16 = binaryEntityMap1.name((int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.entityName((int) (short) 0);
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        java.io.Writer writer12 = null;
        entities0.escape(writer12, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int2 = arrayEntityMap1.growBy;
        int int3 = arrayEntityMap1.size;
        arrayEntityMap1.add("hi!", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray2 = binaryEntityMap1.values;
        binaryEntityMap1.add("", (int) (short) 0);
        int int6 = binaryEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(32);
        java.lang.String str12 = lookupEntityMap0.name((int) (byte) 10);
        int int14 = lookupEntityMap0.value("hi!");
        java.lang.String str16 = lookupEntityMap0.name((int) (byte) 10);
        java.lang.String str18 = lookupEntityMap0.name((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("hi!", (int) (short) 0);
        java.lang.String str5 = entities0.unescape("");
        java.lang.String[][] strArray6 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray6);
        java.lang.String str9 = entities0.entityName((int) (byte) 10);
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        java.lang.String str12 = entities0.entityName((int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(entityMap10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        int int15 = binaryEntityMap1.size;
        java.lang.String[] strArray16 = binaryEntityMap1.names;
        binaryEntityMap1.add("hi!", 0);
        java.lang.String str21 = binaryEntityMap1.name((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap2 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap5 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int7 = lookupEntityMap5.value("");
        lookupEntityMap5.add("hi!", 100);
        lookupEntityMap5.add("hi!", 100);
        lookupEntityMap5.add("", (-1));
        entities0.map = lookupEntityMap5;
        org.apache.commons.lang.Entities entities18 = new org.apache.commons.lang.Entities();
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
        entities18.map = hashEntityMap19;
        java.lang.String str51 = entities18.escape("hi!");
        java.lang.String str53 = entities18.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap55 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities18.map = arrayEntityMap55;
        java.lang.String[][] strArray57 = new java.lang.String[][] {};
        entities18.addEntities(strArray57);
        entities0.addEntities(strArray57);
        org.apache.commons.lang.Entities entities60 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap61 = entities60.map;
        java.lang.String str63 = entities60.unescape("hi!");
        org.apache.commons.lang.Entities entities64 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap65 = entities64.map;
        org.apache.commons.lang.Entities.EntityMap entityMap66 = entities64.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap68 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap68.add("hi!", 0);
        arrayEntityMap68.size = (byte) 1;
        arrayEntityMap68.growBy = 100;
        java.lang.String str77 = arrayEntityMap68.name((int) (byte) 1);
        entities64.map = arrayEntityMap68;
        entities60.map = arrayEntityMap68;
        arrayEntityMap68.add("hi!", 100);
        arrayEntityMap68.growBy = (short) -1;
        entities0.map = arrayEntityMap68;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(entities60);
        org.junit.Assert.assertNotNull(entityMap61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(entities64);
        org.junit.Assert.assertNotNull(entityMap65);
        org.junit.Assert.assertNotNull(entityMap66);
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        int int6 = lookupEntityMap0.value("hi!");
        int int8 = lookupEntityMap0.value("");
        int int10 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        java.lang.String str12 = entities0.escape("hi!");
        java.lang.String str14 = entities0.unescape("");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap15 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str17 = lookupEntityMap15.name(0);
        java.lang.String str19 = lookupEntityMap15.name((int) (byte) 100);
        java.lang.String str21 = lookupEntityMap15.name(100);
        int int23 = lookupEntityMap15.value("hi!");
        java.lang.String str25 = lookupEntityMap15.name((int) '#');
        entities0.map = lookupEntityMap15;
        java.lang.String str28 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 10 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
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
        java.lang.String str26 = binaryEntityMap1.name((int) '4');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str30 = binaryEntityMap28.name(100);
        java.lang.String[] strArray31 = binaryEntityMap28.names;
        binaryEntityMap1.names = strArray31;
        binaryEntityMap1.add("", (-1));
        binaryEntityMap1.size = (byte) 100;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 10);
        java.lang.String str3 = arrayEntityMap1.name(0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = 100;
        int int9 = arrayEntityMap1.growBy;
        int int10 = arrayEntityMap1.size;
        int int12 = arrayEntityMap1.value("");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap24 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray25 = arrayEntityMap24.values;
        java.lang.String str27 = arrayEntityMap24.name((int) (short) 100);
        arrayEntityMap24.size = (byte) 0;
        int int30 = arrayEntityMap24.size;
        int int32 = arrayEntityMap24.value("");
        int int34 = arrayEntityMap24.value("");
        int int35 = arrayEntityMap24.growBy;
        int[] intArray36 = arrayEntityMap24.values;
        binaryEntityMap1.values = intArray36;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0 });
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0 });
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(entityMap3);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.size = 0;
        java.lang.String str10 = binaryEntityMap1.name(2);
        int int12 = binaryEntityMap1.value("");
        java.lang.String[] strArray13 = binaryEntityMap1.names;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int15 = binaryEntityMap14.size;
        binaryEntityMap14.size = 'a';
        int[] intArray18 = binaryEntityMap14.values;
        binaryEntityMap14.add("", (int) 'a');
        java.lang.String str23 = binaryEntityMap14.name((int) (short) -1);
        java.lang.String str25 = binaryEntityMap14.name(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str29 = binaryEntityMap27.name((int) '#');
        binaryEntityMap27.add("hi!", (int) (short) 1);
        java.lang.String str34 = binaryEntityMap27.name(32);
        binaryEntityMap27.growBy = 32;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap38 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray41 = new int[] { ' ', '4' };
        binaryEntityMap38.values = intArray41;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap44 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray45 = arrayEntityMap44.values;
        java.lang.String str47 = arrayEntityMap44.name((int) (short) 100);
        int[] intArray50 = new int[] { (short) -1, 10 };
        arrayEntityMap44.values = intArray50;
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!" };
        arrayEntityMap44.names = strArray53;
        binaryEntityMap38.names = strArray53;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap57 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray60 = new int[] { ' ', '4' };
        binaryEntityMap57.values = intArray60;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap63 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray64 = arrayEntityMap63.values;
        java.lang.String str66 = arrayEntityMap63.name((int) (short) 100);
        int[] intArray69 = new int[] { (short) -1, 10 };
        arrayEntityMap63.values = intArray69;
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!" };
        arrayEntityMap63.names = strArray72;
        binaryEntityMap57.names = strArray72;
        java.lang.String[] strArray75 = binaryEntityMap57.names;
        binaryEntityMap38.names = strArray75;
        binaryEntityMap27.names = strArray75;
        binaryEntityMap14.names = strArray75;
        binaryEntityMap1.names = strArray75;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 0 });
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 0 });
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.entityName((int) '#');
        int int13 = entities0.entityValue("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray18 = new int[] { ' ', '4' };
        binaryEntityMap15.values = intArray18;
        java.lang.String str21 = binaryEntityMap15.name((int) (byte) 100);
        binaryEntityMap15.add("hi!", (-1));
        java.lang.String str26 = binaryEntityMap15.name(0);
        java.lang.String str28 = binaryEntityMap15.name(10);
        java.lang.String str30 = binaryEntityMap15.name((int) 'a');
        java.lang.String str32 = binaryEntityMap15.name((int) '#');
        entities0.map = binaryEntityMap15;
        binaryEntityMap15.add("", (int) (short) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1), 10 });
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
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
        java.lang.String[] strArray13 = binaryEntityMap0.names;
        java.lang.String str15 = binaryEntityMap0.name((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0 });
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.entityName((int) (short) 0);
        int int10 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int13 = entities0.entityValue("");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap14 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str16 = primitiveEntityMap14.name((int) (short) 10);
        entities0.map = primitiveEntityMap14;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = null;
        hashEntityMap34.mapNameToValue = map35;
        java.lang.String str38 = hashEntityMap34.name((int) '4');
        java.util.Map map39 = hashEntityMap34.mapValueToName;
        hashEntityMap33.mapValueToName = map39;
        hashEntityMap30.mapValueToName = map39;
        hashEntityMap0.mapValueToName = map39;
        java.lang.String str44 = hashEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
        int int15 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
        int int69 = hashEntityMap0.value("hi!");
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
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray10 = binaryEntityMap9.values;
        int[] intArray11 = binaryEntityMap9.values;
        int[] intArray12 = binaryEntityMap9.values;
        int[] intArray13 = binaryEntityMap9.values;
        binaryEntityMap9.add("hi!", 100);
        entities0.map = binaryEntityMap9;
        java.lang.String str19 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(3);
        binaryEntityMap1.size = '#';
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name(100);
        binaryEntityMap0.growBy = (byte) -1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int8 = arrayEntityMap6.value("hi!");
        int int9 = arrayEntityMap6.growBy;
        int[] intArray10 = arrayEntityMap6.values;
        binaryEntityMap0.values = intArray10;
        binaryEntityMap0.add("", 100);
        int int15 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(35);
        java.lang.String[] strArray2 = arrayEntityMap1.names;
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
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
        java.lang.String str52 = hashEntityMap0.name((int) (byte) 1);
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
        hashEntityMap0.mapNameToValue = map74;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
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
        java.lang.String str19 = entities0.entityName(97);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 34, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        java.lang.String str5 = binaryEntityMap1.name((int) (byte) 0);
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap9.add("hi!", 0);
        arrayEntityMap9.size = (byte) 1;
        arrayEntityMap9.growBy = (byte) -1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap18.growBy = (-1);
        int[] intArray21 = arrayEntityMap18.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap23.add("hi!", 0);
        arrayEntityMap23.size = (byte) 1;
        arrayEntityMap23.growBy = 100;
        java.lang.String[] strArray31 = arrayEntityMap23.names;
        arrayEntityMap18.names = strArray31;
        arrayEntityMap9.names = strArray31;
        binaryEntityMap1.names = strArray31;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
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
        int int20 = binaryEntityMap7.value("hi!");
        int int22 = binaryEntityMap7.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.io.Writer writer2 = null;
        entities0.escape(writer2, "");
        entities0.addEntity("", (int) (short) 0);
        java.lang.String str9 = entities0.unescape("hi!");
        java.lang.String str11 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
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
        java.lang.String str70 = binaryEntityMap62.name((int) (byte) 0);
        int int72 = binaryEntityMap62.value("");
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
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name(100);
        binaryEntityMap0.growBy = (byte) -1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int8 = arrayEntityMap6.value("hi!");
        int int9 = arrayEntityMap6.growBy;
        int[] intArray10 = arrayEntityMap6.values;
        binaryEntityMap0.values = intArray10;
        int int13 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        int int9 = binaryEntityMap1.growBy;
        java.lang.String[] strArray10 = binaryEntityMap1.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int13 = arrayEntityMap12.size;
        int int14 = arrayEntityMap12.growBy;
        java.lang.String str16 = arrayEntityMap12.name((int) (short) 100);
        int int17 = arrayEntityMap12.growBy;
        java.lang.String[] strArray18 = arrayEntityMap12.names;
        java.lang.String[] strArray19 = arrayEntityMap12.names;
        binaryEntityMap1.names = strArray19;
        binaryEntityMap1.add("", 3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap85 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map86 = null;
        hashEntityMap85.mapNameToValue = map86;
        java.util.Map map88 = null;
        hashEntityMap85.mapNameToValue = map88;
        java.util.Map map90 = hashEntityMap85.mapValueToName;
        hashEntityMap0.mapNameToValue = map90;
        java.util.Map map92 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", 10);
        lookupEntityMap0.add("", (int) (short) 1);
        lookupEntityMap0.add("", (-1));
        java.lang.String str21 = lookupEntityMap0.name((int) 'a');
        lookupEntityMap0.add("", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = null;
        hashEntityMap19.mapNameToValue = map20;
        java.util.Map map22 = hashEntityMap19.mapNameToValue;
        java.util.Map map23 = hashEntityMap19.mapValueToName;
        java.lang.String str25 = hashEntityMap19.name(10);
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
        hashEntityMap19.mapNameToValue = map40;
        hashEntityMap0.mapValueToName = map40;
        java.util.Map map44 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        int int6 = lookupEntityMap0.value("hi!");
        java.lang.String str8 = lookupEntityMap0.name(10);
        int int10 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", (int) (byte) 1);
        int int15 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (int) (short) -1);
        lookupEntityMap0.add("hi!", 100);
        java.lang.String str14 = lookupEntityMap0.name((int) (short) 100);
        lookupEntityMap0.add("", 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.add("hi!", 0);
        int int8 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.ensureCapacity(32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.entityName(2);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        entities0.addEntity("", (int) '#');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = null;
        hashEntityMap53.mapNameToValue = map54;
        java.util.Map map56 = null;
        hashEntityMap53.mapNameToValue = map56;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap58 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = null;
        hashEntityMap59.mapNameToValue = map60;
        java.lang.String str63 = hashEntityMap59.name((int) '4');
        java.util.Map map64 = hashEntityMap59.mapValueToName;
        hashEntityMap58.mapValueToName = map64;
        java.util.Map map66 = hashEntityMap58.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap68 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map69 = null;
        hashEntityMap68.mapNameToValue = map69;
        java.lang.String str72 = hashEntityMap68.name((int) '4');
        java.util.Map map73 = hashEntityMap68.mapValueToName;
        hashEntityMap67.mapValueToName = map73;
        java.util.Map map75 = hashEntityMap67.mapValueToName;
        hashEntityMap58.mapNameToValue = map75;
        java.util.Map map77 = hashEntityMap58.mapValueToName;
        hashEntityMap53.mapValueToName = map77;
        hashEntityMap0.mapNameToValue = map77;
        java.util.Map map80 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) '#');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNull(map50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map80);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        java.util.Map map2 = hashEntityMap0.mapNameToValue;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        java.lang.String str8 = hashEntityMap0.name((int) (byte) -1);
        hashEntityMap0.add("hi!", (int) (short) 10);
        java.util.Map map12 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = binaryEntityMap0.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap3 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray6 = new int[] { ' ', '4' };
        binaryEntityMap3.values = intArray6;
        int int9 = binaryEntityMap3.value("");
        java.lang.String[] strArray10 = binaryEntityMap3.names;
        binaryEntityMap0.names = strArray10;
        java.lang.String str13 = binaryEntityMap0.name((int) 'a');
        java.lang.String str15 = binaryEntityMap0.name(97);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        java.lang.String str13 = lookupEntityMap0.name((int) (byte) 0);
        int int15 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        binaryEntityMap1.size = 100;
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
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
        binaryEntityMap1.size = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[33]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        entities0.addEntity("", (int) (byte) 10);
        java.lang.String str7 = entities0.escape("hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
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
        int int66 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str6 = binaryEntityMap4.name((-1));
        entities0.map = binaryEntityMap4;
        entities0.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer12 = null;
        entities11.escape(writer12, "");
        java.lang.String str16 = entities11.unescape("");
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap18 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap18.add("hi!", (int) (short) 1);
        int int23 = lookupEntityMap18.value("hi!");
        int int25 = lookupEntityMap18.value("");
        java.lang.String str27 = lookupEntityMap18.name((int) (byte) 1);
        lookupEntityMap18.add("hi!", 10);
        entities17.map = lookupEntityMap18;
        org.apache.commons.lang.Entities entities32 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap33 = entities32.map;
        java.lang.String str35 = entities32.unescape("");
        org.apache.commons.lang.Entities entities36 = org.apache.commons.lang.Entities.HTML32;
        int int38 = entities36.entityValue("");
        entities36.addEntity("hi!", (int) '4');
        java.lang.String str43 = entities36.entityName((int) (short) 1);
        int int45 = entities36.entityValue("");
        entities36.addEntity("hi!", (int) (byte) 100);
        java.lang.String[][] strArray49 = new java.lang.String[][] {};
        entities36.addEntities(strArray49);
        entities32.addEntities(strArray49);
        entities17.addEntities(strArray49);
        entities11.addEntities(strArray49);
        entities0.addEntities(strArray49);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(entities32);
        org.junit.Assert.assertNotNull(entityMap33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(entities36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[][] {});
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("");
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
        java.util.Map map58 = hashEntityMap4.mapNameToValue;
        java.lang.String str60 = hashEntityMap4.name(1);
        java.util.Map map61 = hashEntityMap4.mapNameToValue;
        entities0.map = hashEntityMap4;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(map53);
        org.junit.Assert.assertNull(map54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(map58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(map61);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.entityName(0);
        java.lang.String str7 = entities0.escape("");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap8 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str10 = lookupEntityMap8.name(0);
        java.lang.String str12 = lookupEntityMap8.name(0);
        int int14 = lookupEntityMap8.value("");
        lookupEntityMap8.add("hi!", 10);
        int int19 = lookupEntityMap8.value("");
        int int21 = lookupEntityMap8.value("");
        entities0.map = lookupEntityMap8;
        java.lang.String str24 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
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
        java.lang.String str17 = lookupEntityMap6.name((int) '#');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
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
        java.util.Map map58 = hashEntityMap0.mapValueToName;
        java.lang.String str60 = hashEntityMap0.name((int) (short) 1);
        java.util.Map map61 = hashEntityMap0.mapNameToValue;
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
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(10);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name((int) (byte) 10);
        java.lang.String str10 = lookupEntityMap0.name((int) ' ');
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 1);
        lookupEntityMap0.add("hi!", 97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
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
        java.lang.String str63 = entities0.unescape("");
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
        org.junit.Assert.assertNotNull(entityMap61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
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
        entities0.addEntity("hi!", (int) (short) 1);
        int int25 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 1 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        java.lang.String str13 = lookupEntityMap0.name((int) ' ');
        lookupEntityMap0.add("hi!", 97);
        int int18 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        int int6 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str11 = lookupEntityMap0.name(2);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray7 = new int[] { (short) -1, 10 };
        arrayEntityMap1.values = intArray7;
        java.lang.String str10 = arrayEntityMap1.name((int) (short) 10);
        arrayEntityMap1.add("", 35);
        int int14 = arrayEntityMap1.growBy;
        int[] intArray15 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str18 = binaryEntityMap16.name(100);
        binaryEntityMap16.growBy = (byte) -1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap24 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap24.growBy = (-1);
        arrayEntityMap24.ensureCapacity((int) (byte) 1);
        int[] intArray29 = arrayEntityMap24.values;
        arrayEntityMap22.values = intArray29;
        binaryEntityMap16.values = intArray29;
        arrayEntityMap1.values = intArray29;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 35, 10 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 35, 10 });
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 0 });
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
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
        java.util.Map map18 = hashEntityMap0.mapNameToValue;
        java.lang.Class<?> wildcardClass19 = map18.getClass();
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap24 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(entityMap24);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int4 = arrayEntityMap2.value("hi!");
        int int5 = arrayEntityMap2.growBy;
        int int6 = arrayEntityMap2.size;
        java.lang.String[] strArray7 = null;
        arrayEntityMap2.names = strArray7;
        int[] intArray9 = arrayEntityMap2.values;
        binaryEntityMap0.values = intArray9;
        int[] intArray11 = binaryEntityMap0.values;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str6 = binaryEntityMap4.name((-1));
        entities0.map = binaryEntityMap4;
        entities0.addEntity("", 2);
        java.lang.String str12 = entities0.escape("hi!");
        entities0.addEntity("", (int) (short) -1);
        java.io.Writer writer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer16, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
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
        java.lang.Class<?> wildcardClass67 = treeEntityMap0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        arrayEntityMap1.add("hi!", (int) (byte) 10);
        arrayEntityMap1.add("", (int) (short) -1);
        int int9 = arrayEntityMap1.size;
        java.lang.String str11 = arrayEntityMap1.name((int) (short) -1);
        arrayEntityMap1.ensureCapacity(2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
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
        java.util.Map map43 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str14 = entities0.entityName(1);
        int int16 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 34, 10 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(entityMap3);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
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
        java.lang.String str82 = entities0.escape("");
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
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        int int6 = binaryEntityMap1.size;
        binaryEntityMap1.growBy = (short) 1;
        java.lang.String str10 = binaryEntityMap1.name((int) ' ');
        binaryEntityMap1.ensureCapacity((int) (short) -1);
        int int13 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = null;
        hashEntityMap18.mapNameToValue = map19;
        java.lang.String str22 = hashEntityMap18.name((int) '4');
        java.util.Map map23 = hashEntityMap18.mapValueToName;
        hashEntityMap17.mapValueToName = map23;
        java.util.Map map25 = hashEntityMap17.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = null;
        hashEntityMap27.mapNameToValue = map28;
        java.lang.String str31 = hashEntityMap27.name((int) '4');
        java.util.Map map32 = hashEntityMap27.mapValueToName;
        hashEntityMap26.mapValueToName = map32;
        java.util.Map map34 = hashEntityMap26.mapValueToName;
        hashEntityMap17.mapNameToValue = map34;
        hashEntityMap0.mapValueToName = map34;
        hashEntityMap0.add("hi!", (int) 'a');
        hashEntityMap0.add("", (int) (byte) 100);
        java.lang.String str44 = hashEntityMap0.name((int) (short) 10);
        hashEntityMap0.add("hi!", (int) (byte) 100);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
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
        int int27 = arrayEntityMap1.value("");
        arrayEntityMap1.add("", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 52, 52 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
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
        entities0.addEntity("hi!", 97);
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
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        int int10 = binaryEntityMap1.value("");
        binaryEntityMap1.ensureCapacity(100);
        binaryEntityMap1.growBy = 32;
        int int16 = binaryEntityMap1.value("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 100);
        int int2 = binaryEntityMap1.size;
        binaryEntityMap1.growBy = 'a';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        int int11 = arrayEntityMap1.growBy;
        java.lang.String[] strArray12 = arrayEntityMap1.names;
        int[] intArray13 = arrayEntityMap1.values;
        java.lang.String[] strArray14 = arrayEntityMap1.names;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { null });
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        java.lang.String str7 = entities0.entityName((int) (short) 0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str7);
    }
}
