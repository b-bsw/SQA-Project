package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        arrayEntityMap1.add("hi!", (int) (byte) 10);
        arrayEntityMap1.size = (byte) 1;
        int int8 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = 0;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        int int9 = binaryEntityMap1.growBy;
        java.lang.String[] strArray10 = binaryEntityMap1.names;
        java.lang.String str12 = binaryEntityMap1.name(52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        int int9 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", 35);
        int int13 = binaryEntityMap1.size;
        binaryEntityMap1.add("hi!", 2);
        java.lang.String str18 = binaryEntityMap1.name((int) (byte) 0);
        binaryEntityMap1.add("hi!", (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 2, 35 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.growBy = (byte) -1;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 0);
        int int15 = binaryEntityMap1.size;
        binaryEntityMap1.add("hi!", 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 100 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        java.lang.String[] strArray28 = arrayEntityMap15.names;
        java.lang.Class<?> wildcardClass29 = strArray28.getClass();
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
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        java.lang.String[] strArray33 = binaryEntityMap1.names;
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
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        int int2 = binaryEntityMap1.size;
        binaryEntityMap1.add("", (int) (short) 1);
        binaryEntityMap1.add("hi!", (int) (byte) 100);
        binaryEntityMap1.add("", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = (-1);
        int int9 = arrayEntityMap1.growBy;
        java.lang.String str11 = arrayEntityMap1.name((int) (short) 1);
        int int13 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        int int13 = lookupEntityMap0.value("hi!");
        int int15 = lookupEntityMap0.value("hi!");
        int int17 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        int int48 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities entities49 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str51 = entities49.unescape("hi!");
        java.io.Writer writer52 = null;
        entities49.escape(writer52, "");
        org.apache.commons.lang.Entities.EntityMap entityMap55 = entities49.map;
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
        entities49.map = arrayEntityMap64;
        org.apache.commons.lang.Entities entities77 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray78 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities77.addEntities(strArray78);
        entities49.addEntities(strArray78);
        entities0.addEntities(strArray78);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(entities49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(entityMap55);
        org.junit.Assert.assertNotNull(entities56);
        org.junit.Assert.assertNotNull(entityMap57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(entities60);
        org.junit.Assert.assertNotNull(entityMap61);
        org.junit.Assert.assertNotNull(entityMap62);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(entities77);
        org.junit.Assert.assertNotNull(strArray78);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        java.util.Map map15 = hashEntityMap14.mapValueToName;
        java.util.Map map16 = hashEntityMap14.mapNameToValue;
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
        java.util.Map map60 = treeEntityMap17.mapNameToValue;
        hashEntityMap14.mapValueToName = map60;
        hashEntityMap0.mapValueToName = map60;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap63.add("", (int) (byte) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map68 = null;
        hashEntityMap67.mapNameToValue = map68;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap70 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map71 = null;
        hashEntityMap70.mapNameToValue = map71;
        java.lang.String str74 = hashEntityMap70.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map76 = null;
        hashEntityMap75.mapNameToValue = map76;
        java.util.Map map78 = null;
        hashEntityMap75.mapNameToValue = map78;
        java.util.Map map80 = null;
        hashEntityMap75.mapNameToValue = map80;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap82 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map83 = null;
        hashEntityMap82.mapNameToValue = map83;
        java.util.Map map85 = null;
        hashEntityMap82.mapNameToValue = map85;
        java.util.Map map87 = null;
        hashEntityMap82.mapNameToValue = map87;
        java.util.Map map89 = hashEntityMap82.mapValueToName;
        hashEntityMap75.mapNameToValue = map89;
        hashEntityMap70.mapNameToValue = map89;
        hashEntityMap67.mapValueToName = map89;
        hashEntityMap63.mapValueToName = map89;
        hashEntityMap0.mapValueToName = map89;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        int int18 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.io.Writer writer4 = null;
        entities0.escape(writer4, "");
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str9 = entities7.entityName((int) '#');
        entities7.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities7.map;
        java.io.Writer writer14 = null;
        entities7.escape(writer14, "");
        java.lang.String str18 = entities7.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray20 = null;
        binaryEntityMap19.values = intArray20;
        java.lang.String str23 = binaryEntityMap19.name((-1));
        entities7.map = binaryEntityMap19;
        binaryEntityMap19.size = (short) 1;
        entities0.map = binaryEntityMap19;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = lookupEntityMap0.name((int) (short) -1);
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
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(32);
        java.lang.String str12 = lookupEntityMap0.name((int) (byte) 10);
        int int14 = lookupEntityMap0.value("hi!");
        java.lang.String str16 = lookupEntityMap0.name(52);
        int int18 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        java.lang.String str7 = arrayEntityMap1.name(52);
        arrayEntityMap1.size = (byte) 100;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { null });
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        int int74 = treeEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(100);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", 1);
        java.lang.String str16 = lookupEntityMap0.name((int) (short) 10);
        java.lang.String str18 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int2 = arrayEntityMap1.size;
        int int3 = arrayEntityMap1.growBy;
        int int4 = arrayEntityMap1.size;
        java.lang.String str6 = arrayEntityMap1.name((int) '#');
        java.lang.String str8 = arrayEntityMap1.name((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.size = 0;
        java.lang.String str10 = binaryEntityMap1.name(2);
        binaryEntityMap1.add("", (int) (short) 1);
        int[] intArray14 = binaryEntityMap1.values;
        int int15 = binaryEntityMap1.growBy;
        binaryEntityMap1.size = (byte) 0;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap23.add("hi!", 0);
        arrayEntityMap23.size = (byte) 1;
        int[] intArray29 = new int[] {};
        arrayEntityMap23.values = intArray29;
        arrayEntityMap8.values = intArray29;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] {});
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", 52);
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
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        int int7 = binaryEntityMap1.size;
        int int8 = binaryEntityMap1.growBy;
        java.lang.String[] strArray9 = binaryEntityMap1.names;
        java.lang.String str11 = binaryEntityMap1.name((int) (byte) 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        int int39 = binaryEntityMap1.growBy;
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray7 = arrayEntityMap6.values;
        java.lang.String str9 = arrayEntityMap6.name((int) (short) 100);
        int[] intArray12 = new int[] { (short) -1, 10 };
        arrayEntityMap6.values = intArray12;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        arrayEntityMap6.names = strArray15;
        int[] intArray17 = arrayEntityMap6.values;
        java.lang.String str19 = arrayEntityMap6.name(0);
        java.lang.String[] strArray20 = arrayEntityMap6.names;
        arrayEntityMap6.add("hi!", (-1));
        entities0.map = arrayEntityMap6;
        int int25 = arrayEntityMap6.size;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 10 });
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        int int64 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
// flaky "1) test1531(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        int int4 = binaryEntityMap1.growBy;
        binaryEntityMap1.add("hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.entityName(2);
        java.lang.String str9 = entities0.entityName((int) (byte) 10);
        java.lang.String str11 = entities0.entityName((int) 'a');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities entities8 = org.apache.commons.lang.Entities.HTML40;
        int int10 = entities8.entityValue("hi!");
        java.lang.String[][] strArray11 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities8.addEntities(strArray11);
        entities0.addEntities(strArray11);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.add("hi!", 0);
        int int7 = arrayEntityMap1.size;
        int int8 = arrayEntityMap1.size;
        int[] intArray9 = arrayEntityMap1.values;
        arrayEntityMap1.ensureCapacity((int) (byte) 10);
        arrayEntityMap1.add("hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0 });
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        org.apache.commons.lang.Entities entities3 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities3.map;
        entities0.map = entityMap4;
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        java.lang.String str10 = entities0.entityName((int) (short) 100);
        entities0.addEntity("", (int) (short) 10);
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap14 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int16 = lookupEntityMap14.value("");
        lookupEntityMap14.add("hi!", 100);
        lookupEntityMap14.add("hi!", 100);
        entities0.map = lookupEntityMap14;
        lookupEntityMap14.add("", 52);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(entities3);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        binaryEntityMap1.add("hi!", (int) (byte) 10);
        int[] intArray36 = binaryEntityMap1.values;
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
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.entityName((int) (byte) 1);
        java.io.Writer writer12 = null;
        entities0.escape(writer12, "");
        java.lang.String str16 = entities0.entityName((int) (byte) 1);
        entities0.addEntity("hi!", 2);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", 10);
        lookupEntityMap0.add("", (int) (short) 1);
        lookupEntityMap0.add("", 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapValueToName;
        java.util.Map map6 = hashEntityMap4.mapNameToValue;
        entities0.map = hashEntityMap4;
        int int9 = hashEntityMap4.value("");
        hashEntityMap4.add("hi!", (int) (byte) 10);
        java.util.Map map13 = hashEntityMap4.mapValueToName;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.size = 0;
        java.lang.String str10 = binaryEntityMap1.name((int) 'a');
        binaryEntityMap1.add("", (-1));
        java.lang.String[] strArray14 = binaryEntityMap1.names;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        java.util.Map map37 = hashEntityMap0.mapValueToName;
        java.lang.Class<?> wildcardClass38 = hashEntityMap0.getClass();
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
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        java.util.Map map37 = hashEntityMap0.mapValueToName;
        java.lang.String str39 = hashEntityMap0.name(97);
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
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name(10);
        java.lang.String str12 = lookupEntityMap0.name(52);
        java.lang.String str14 = lookupEntityMap0.name((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hashEntityMap0.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("hi!", (int) '#');
        java.lang.String str16 = lookupEntityMap0.name(32);
        java.lang.String str18 = lookupEntityMap0.name((int) 'a');
        java.lang.String str20 = lookupEntityMap0.name(0);
        int int22 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = null;
        binaryEntityMap0.values = intArray1;
        binaryEntityMap0.growBy = 100;
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str15 = lookupEntityMap0.name((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str9 = binaryEntityMap7.name((int) '#');
        binaryEntityMap7.add("", (int) (byte) -1);
        java.lang.String str14 = binaryEntityMap7.name((int) (byte) 10);
        entities0.map = binaryEntityMap7;
        java.lang.String str17 = entities0.unescape("");
        java.lang.String str19 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        java.lang.String str11 = binaryEntityMap1.name((int) (byte) 10);
        java.lang.String str13 = binaryEntityMap1.name((int) (byte) -1);
        int int14 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        int int9 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", 35);
        int int13 = binaryEntityMap1.size;
        binaryEntityMap1.add("hi!", 2);
        java.lang.String str18 = binaryEntityMap1.name((-1));
        binaryEntityMap1.growBy = 10;
        binaryEntityMap1.growBy = (byte) -1;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 2, 35 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entityMap1.name(10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        java.lang.String str4 = entities0.escape("hi!");
        int int6 = entities0.entityValue("hi!");
        entities0.addEntity("", (int) 'a');
        java.io.Writer writer10 = null;
        entities0.escape(writer10, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        int int4 = entities0.entityValue("hi!");
        int int6 = entities0.entityValue("");
        entities0.addEntity("", (-1));
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        lookupEntityMap0.add("", (int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        java.lang.String str16 = binaryEntityMap1.name((int) 'a');
        binaryEntityMap1.add("hi!", 97);
        int int21 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 97 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str6 = binaryEntityMap1.name(52);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap34.ensureCapacity(0);
        binaryEntityMap34.ensureCapacity(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap40 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray43 = new int[] { ' ', '4' };
        binaryEntityMap40.values = intArray43;
        int int46 = binaryEntityMap40.value("");
        java.lang.String[] strArray47 = binaryEntityMap40.names;
        binaryEntityMap34.names = strArray47;
        binaryEntityMap1.names = strArray47;
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
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strArray47);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        binaryEntityMap31.add("", (int) 'a');
        java.lang.String[] strArray53 = binaryEntityMap31.names;
        binaryEntityMap1.names = strArray53;
        int int55 = binaryEntityMap1.growBy;
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
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 97, 52 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 0 });
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.io.Writer writer2 = null;
        entities0.escape(writer2, "");
        entities0.addEntity("", (int) (short) 0);
        java.lang.String str9 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(entityMap10);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        int int36 = lookupEntityMap14.value("");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        java.lang.String str73 = binaryEntityMap1.name((int) (short) -1);
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
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        binaryEntityMap1.add("", (int) (byte) 1);
        int[] intArray12 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap1.values = intArray12;
        binaryEntityMap1.add("", 0);
        binaryEntityMap1.size = (short) 0;
        binaryEntityMap1.add("hi!", 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 1, 32 });
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        java.lang.String str13 = lookupEntityMap0.name(32);
        java.lang.String str15 = lookupEntityMap0.name(52);
        int int17 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        java.lang.String[] strArray41 = binaryEntityMap1.names;
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
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        binaryEntityMap1.add("hi!", 0);
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
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        binaryEntityMap1.add("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1 });
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        arrayEntityMap1.values = intArray8;
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = 0;
        int[] intArray15 = arrayEntityMap1.values;
        arrayEntityMap1.growBy = 100;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 32, 52 });
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        hashEntityMap0.add("", (int) (byte) 0);
        hashEntityMap0.add("", 52);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        java.lang.String str8 = binaryEntityMap1.name((int) ' ');
        int int9 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        int[] intArray55 = binaryEntityMap1.values;
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
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 0 });
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        lookupEntityMap0.add("hi!", 1);
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        java.lang.String str22 = entities0.entityName((int) (short) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 52, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap33 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap33.growBy = (-1);
        arrayEntityMap33.ensureCapacity((int) (byte) 1);
        int[] intArray38 = arrayEntityMap33.values;
        binaryEntityMap1.values = intArray38;
        binaryEntityMap1.growBy = (-1);
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
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 0 });
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.lang.String str2 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray7 = new int[] { ' ', '4' };
        binaryEntityMap4.values = intArray7;
        java.lang.String str10 = binaryEntityMap4.name((int) (byte) 100);
        binaryEntityMap4.add("hi!", (-1));
        java.lang.String str15 = binaryEntityMap4.name(0);
        entities0.map = binaryEntityMap4;
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
// flaky "2) test1581(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 32 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        hashEntityMap0.add("", 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        int int11 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        lookupEntityMap0.add("hi!", (int) ' ');
        java.lang.String str19 = lookupEntityMap0.name(97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        entities0.addEntity("hi!", 100);
        int int10 = entities0.entityValue("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.escape("");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.entityName((int) (short) 0);
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        java.util.Map map38 = hashEntityMap0.mapNameToValue;
        int int40 = hashEntityMap0.value("hi!");
        int int42 = hashEntityMap0.value("");
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        int int29 = binaryEntityMap1.size;
        binaryEntityMap1.growBy = (byte) 100;
        java.lang.String str33 = binaryEntityMap1.name((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        binaryEntityMap1.add("", (int) (byte) 1);
        int[] intArray12 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap1.values = intArray12;
        java.lang.String str15 = binaryEntityMap1.name((int) (short) 100);
        java.lang.String str17 = binaryEntityMap1.name(1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1, 1, 32 });
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        org.apache.commons.lang.Entities entities3 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities3.map;
        entities0.map = entityMap4;
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        java.lang.String str10 = entities0.entityName((int) (short) 100);
        entities0.addEntity("", (int) (short) 10);
        java.lang.String str15 = entities0.entityName((int) (short) 100);
        java.lang.String str17 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(entities3);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) '4');
        java.lang.String str7 = entities0.escape("");
        entities0.addEntity("hi!", (int) ' ');
        java.lang.String str12 = entities0.unescape("");
        java.lang.String str14 = entities0.escape("");
        int int16 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        int int10 = binaryEntityMap1.growBy;
        binaryEntityMap1.add("hi!", (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.size = '#';
        binaryEntityMap1.growBy = (short) 10;
        binaryEntityMap1.ensureCapacity((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapValueToName;
        java.util.Map map6 = hashEntityMap4.mapNameToValue;
        entities0.map = hashEntityMap4;
        java.lang.String str9 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap11.add("hi!", 0);
        arrayEntityMap11.size = (byte) 1;
        arrayEntityMap11.size = (-1);
        arrayEntityMap11.size = (byte) 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int24 = arrayEntityMap22.value("");
        arrayEntityMap22.size = (byte) 100;
        arrayEntityMap22.size = 100;
        arrayEntityMap22.ensureCapacity((int) (short) 1);
        int[] intArray31 = arrayEntityMap22.values;
        arrayEntityMap11.values = intArray31;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap34 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int36 = arrayEntityMap34.value("hi!");
        int int37 = arrayEntityMap34.growBy;
        int int38 = arrayEntityMap34.size;
        java.lang.String[] strArray39 = null;
        arrayEntityMap34.names = strArray39;
        int[] intArray41 = arrayEntityMap34.values;
        arrayEntityMap11.values = intArray41;
        entities0.map = arrayEntityMap11;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap45 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray46 = arrayEntityMap45.values;
        arrayEntityMap45.add("hi!", (int) (byte) 10);
        java.lang.String str51 = arrayEntityMap45.name(100);
        java.lang.String[] strArray52 = arrayEntityMap45.names;
        entities0.map = arrayEntityMap45;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 10 });
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        int int3 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        java.lang.String str24 = lookupEntityMap0.name((int) (short) 100);
        java.lang.String str26 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        java.lang.String str33 = entities0.escape("");
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
        org.junit.Assert.assertNotNull(entityMap28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(entityMap34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap3 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray6 = new int[] { ' ', '4' };
        binaryEntityMap3.values = intArray6;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray10 = arrayEntityMap9.values;
        java.lang.String str12 = arrayEntityMap9.name((int) (short) 100);
        int[] intArray15 = new int[] { (short) -1, 10 };
        arrayEntityMap9.values = intArray15;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        arrayEntityMap9.names = strArray18;
        binaryEntityMap3.names = strArray18;
        java.lang.String[] strArray21 = binaryEntityMap3.names;
        binaryEntityMap3.add("", 10);
        binaryEntityMap3.ensureCapacity(10);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        binaryEntityMap3.names = strArray29;
        arrayEntityMap1.names = strArray29;
        java.lang.String str33 = arrayEntityMap1.name((int) '#');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.ensureCapacity(2);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 52 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        int int23 = hashEntityMap0.value("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        java.lang.String str22 = arrayEntityMap1.name(1);
        java.lang.String[] strArray23 = arrayEntityMap1.names;
        int int25 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        org.apache.commons.lang.Entities.EntityMap entityMap35 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(entityMap35);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        int[] intArray4 = arrayEntityMap1.values;
        arrayEntityMap1.growBy = 'a';
        arrayEntityMap1.size = (-1);
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("hi!", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        int int9 = arrayEntityMap1.value("");
        java.lang.String str11 = arrayEntityMap1.name((int) (short) 0);
        arrayEntityMap1.add("", 32);
        arrayEntityMap1.size = 2;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 32 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        int[] intArray4 = arrayEntityMap1.values;
        int int6 = arrayEntityMap1.value("");
        arrayEntityMap1.growBy = (byte) 100;
        java.lang.String[] strArray9 = arrayEntityMap1.names;
        int[] intArray10 = arrayEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str6 = lookupEntityMap0.name(100);
        int int8 = lookupEntityMap0.value("hi!");
        java.lang.String str10 = lookupEntityMap0.name((int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        java.lang.String str18 = entities0.entityName((int) 'a');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entities10);
// flaky "3) test1608(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        binaryEntityMap1.growBy = 100;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", 0);
        java.lang.String str15 = lookupEntityMap0.name((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hashEntityMap0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(map8);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.ensureCapacity((int) (byte) 1);
        binaryEntityMap1.add("hi!", (int) (byte) 0);
        java.lang.String[] strArray9 = binaryEntityMap1.names;
        int int10 = binaryEntityMap1.size;
        java.lang.String[] strArray11 = binaryEntityMap1.names;
        java.lang.String str13 = binaryEntityMap1.name((int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", 35);
        java.lang.String str16 = lookupEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = (byte) -1;
        arrayEntityMap1.add("hi!", (int) (byte) 1);
        int int12 = arrayEntityMap1.growBy;
        int[] intArray13 = arrayEntityMap1.values;
        java.lang.String str15 = arrayEntityMap1.name((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        int int13 = lookupEntityMap0.value("");
        java.lang.String str15 = lookupEntityMap0.name((int) '#');
        int int17 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        arrayEntityMap1.growBy = 0;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 10, 52 });
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        java.lang.String[][] strArray63 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntities(strArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
// flaky "4) test1618(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
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
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        arrayEntityMap1.add("hi!", (int) (byte) 10);
        arrayEntityMap1.size = (byte) 1;
        int int9 = arrayEntityMap1.value("");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        int int6 = lookupEntityMap0.value("hi!");
        java.lang.String str8 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str10 = lookupEntityMap0.name((int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        hashEntityMap0.add("hi!", 32);
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
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        int int5 = hashEntityMap0.value("");
        java.util.Map map6 = hashEntityMap0.mapValueToName;
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", (int) '4');
        int int12 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        java.util.Map map58 = hashEntityMap22.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int61 = hashEntityMap59.value("");
        java.util.Map map62 = hashEntityMap59.mapValueToName;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap63 = new org.apache.commons.lang.Entities.TreeEntityMap();
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
        treeEntityMap63.mapValueToName = map78;
        hashEntityMap59.mapValueToName = map78;
        java.util.Map map82 = hashEntityMap59.mapValueToName;
        hashEntityMap22.mapNameToValue = map82;
        hashEntityMap0.mapValueToName = map82;
        java.util.Map map85 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        int int87 = hashEntityMap0.value("hi!");
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
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.entityName((int) (byte) 1);
        java.io.Writer writer12 = null;
        entities0.escape(writer12, "");
        entities0.addEntity("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.entityName((int) (short) 0);
        int int10 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str13 = entities0.entityName(1);
        java.lang.String str15 = entities0.unescape("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("", 52);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(10);
        java.lang.String[] strArray2 = binaryEntityMap1.names;
        int int4 = binaryEntityMap1.value("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        java.lang.String str7 = entities0.entityName((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = entities0.entityName((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        // The following exception was thrown during execution in test generation
        try {
            int int60 = hashEntityMap4.value("hi!");
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
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name((-1));
        int[] intArray4 = binaryEntityMap1.values;
        java.lang.String str6 = binaryEntityMap1.name((int) (byte) 100);
        int int7 = binaryEntityMap1.size;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = 1;
        int int5 = arrayEntityMap1.value("");
        int int6 = arrayEntityMap1.size;
        java.lang.String[] strArray7 = arrayEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { null });
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("hi!", (int) (byte) 10);
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
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("", 10);
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
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { null });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        binaryEntityMap1.add("hi!", 32);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 0 });
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1), 32 });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 32 });
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        arrayEntityMap1.growBy = 100;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap22.add("hi!", 0);
        arrayEntityMap22.size = (byte) 1;
        int[] intArray28 = new int[] {};
        arrayEntityMap22.values = intArray28;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap31 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int33 = arrayEntityMap31.value("");
        java.lang.String[] strArray34 = arrayEntityMap31.names;
        arrayEntityMap22.names = strArray34;
        arrayEntityMap1.names = strArray34;
        java.lang.String[] strArray37 = arrayEntityMap1.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray40 = arrayEntityMap39.values;
        java.lang.String str42 = arrayEntityMap39.name((-1));
        int[] intArray43 = arrayEntityMap39.values;
        arrayEntityMap1.values = intArray43;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 52 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 0 });
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 0 });
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = binaryEntityMap0.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap3 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray6 = new int[] { ' ', '4' };
        binaryEntityMap3.values = intArray6;
        int int9 = binaryEntityMap3.value("");
        java.lang.String[] strArray10 = binaryEntityMap3.names;
        binaryEntityMap0.names = strArray10;
        java.lang.String str13 = binaryEntityMap0.name((int) 'a');
        int int15 = binaryEntityMap0.value("");
        java.lang.String str17 = binaryEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
            java.lang.String str53 = hashEntityMap0.name(97);
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
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        java.lang.String str13 = lookupEntityMap0.name(32);
        int int15 = lookupEntityMap0.value("");
        int int17 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name((int) (short) 100);
        int int14 = binaryEntityMap1.value("hi!");
        java.lang.String str16 = binaryEntityMap1.name(97);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        arrayEntityMap1.size = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for object array[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        java.io.Writer writer41 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer41, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(32);
        lookupEntityMap0.add("hi!", 2);
        java.lang.String str15 = lookupEntityMap0.name(10);
        java.lang.String str17 = lookupEntityMap0.name((int) '4');
        java.lang.String str19 = lookupEntityMap0.name(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int10 = arrayEntityMap8.value("hi!");
        int int11 = arrayEntityMap8.growBy;
        int int13 = arrayEntityMap8.value("hi!");
        int int15 = arrayEntityMap8.value("hi!");
        java.lang.String str17 = arrayEntityMap8.name(10);
        java.lang.String[] strArray18 = arrayEntityMap8.names;
        binaryEntityMap1.names = strArray18;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { null });
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        entities0.addEntity("", (int) (byte) 1);
        java.lang.String str10 = entities0.escape("");
        int int12 = entities0.entityValue("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str9 = binaryEntityMap7.name((int) '#');
        binaryEntityMap7.add("", (int) (byte) -1);
        java.lang.String str14 = binaryEntityMap7.name((int) (byte) 10);
        entities0.map = binaryEntityMap7;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str19 = binaryEntityMap17.name(100);
        java.lang.String str21 = binaryEntityMap17.name((-1));
        binaryEntityMap17.add("", (int) (short) 100);
        entities0.map = binaryEntityMap17;
        int int26 = binaryEntityMap17.size;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(32);
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 100);
        lookupEntityMap0.add("hi!", 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", 10);
        lookupEntityMap0.add("", (int) (short) 1);
        lookupEntityMap0.add("", (-1));
        java.lang.String str21 = lookupEntityMap0.name((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        treeEntityMap0.add("hi!", 100);
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
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = null;
        binaryEntityMap0.values = intArray1;
        int[] intArray3 = binaryEntityMap0.values;
        java.lang.String str5 = binaryEntityMap0.name(32);
        int int6 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(intArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.lang.String str5 = hashEntityMap0.name((-1));
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
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        java.util.Map map44 = hashEntityMap0.mapNameToValue;
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
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        arrayEntityMap1.add("", 1);
        arrayEntityMap1.ensureCapacity(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) 'a');
        int int4 = lookupEntityMap0.value("hi!");
        int int6 = lookupEntityMap0.value("hi!");
        int int8 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 100);
        java.lang.String str13 = lookupEntityMap0.name((int) '#');
        int int15 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        int int5 = hashEntityMap0.value("");
        java.util.Map map6 = hashEntityMap0.mapValueToName;
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int2 = arrayEntityMap1.size;
        int int3 = arrayEntityMap1.growBy;
        java.lang.String str5 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap8.add("hi!", 0);
        arrayEntityMap8.size = (byte) 1;
        arrayEntityMap8.growBy = 100;
        java.lang.String[] strArray16 = arrayEntityMap8.names;
        arrayEntityMap1.names = strArray16;
        int int19 = arrayEntityMap1.value("hi!");
        int[] intArray20 = arrayEntityMap1.values;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("");
        entities0.addEntity("", (int) (byte) 0);
        java.io.Writer writer16 = null;
        entities0.escape(writer16, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("hi!");
        java.lang.String str12 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.ensureCapacity((int) (byte) 1);
        binaryEntityMap1.add("hi!", (int) (byte) 0);
        java.lang.String[] strArray9 = binaryEntityMap1.names;
        int int10 = binaryEntityMap1.size;
        java.lang.String[] strArray11 = binaryEntityMap1.names;
        int int13 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        binaryEntityMap1.add("hi!", (int) (short) 10);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.escape("");
        java.io.Writer writer8 = null;
        entities0.escape(writer8, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(32);
        java.lang.String str12 = lookupEntityMap0.name((int) (byte) 10);
        lookupEntityMap0.add("hi!", 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.entityName(2);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        org.apache.commons.lang.Entities entities9 = new org.apache.commons.lang.Entities();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = null;
        hashEntityMap10.mapNameToValue = map11;
        java.lang.String str14 = hashEntityMap10.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.lang.String str19 = hashEntityMap15.name((int) '4');
        java.lang.String str21 = hashEntityMap15.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = null;
        hashEntityMap22.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap22.mapNameToValue = map25;
        java.util.Map map27 = null;
        hashEntityMap22.mapNameToValue = map27;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = null;
        hashEntityMap29.mapNameToValue = map30;
        java.util.Map map32 = null;
        hashEntityMap29.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap29.mapNameToValue = map34;
        java.util.Map map36 = hashEntityMap29.mapValueToName;
        hashEntityMap22.mapNameToValue = map36;
        hashEntityMap15.mapValueToName = map36;
        hashEntityMap10.mapValueToName = map36;
        entities9.map = hashEntityMap10;
        java.lang.String str42 = entities9.escape("hi!");
        java.lang.String str44 = entities9.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap46 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities9.map = arrayEntityMap46;
        java.lang.String[][] strArray48 = new java.lang.String[][] {};
        entities9.addEntities(strArray48);
        entities0.addEntities(strArray48);
        org.junit.Assert.assertNotNull(entities0);
// flaky "5) test1663(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(strArray3);
// flaky "1) test1663(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[][] {});
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
            binaryEntityMap1.add("hi!", (int) '4');
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
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        int int5 = arrayEntityMap1.size;
        java.lang.String[] strArray6 = null;
        arrayEntityMap1.names = strArray6;
        int[] intArray8 = arrayEntityMap1.values;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        java.lang.String[] strArray31 = binaryEntityMap1.names;
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
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        java.lang.String str48 = entities0.escape("");
        int int50 = entities0.entityValue("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        lookupEntityMap0.add("hi!", 35);
        java.lang.String str14 = lookupEntityMap0.name(0);
        java.lang.String str16 = lookupEntityMap0.name((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        binaryEntityMap7.size = 97;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = binaryEntityMap0.values;
        int[] intArray2 = binaryEntityMap0.values;
        int[] intArray3 = binaryEntityMap0.values;
        int[] intArray4 = binaryEntityMap0.values;
        binaryEntityMap0.size = (short) 10;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("", (int) ' ');
        binaryEntityMap1.add("hi!", (int) (short) 1);
        int[] intArray8 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = (short) -1;
        binaryEntityMap1.ensureCapacity((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map2 = null;
        hashEntityMap1.mapNameToValue = map2;
        java.lang.String str5 = hashEntityMap1.name((int) '4');
        java.util.Map map6 = hashEntityMap1.mapValueToName;
        hashEntityMap0.mapValueToName = map6;
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        int int10 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = hashEntityMap11.mapValueToName;
        java.util.Map map13 = null;
        hashEntityMap11.mapNameToValue = map13;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map17 = null;
        hashEntityMap16.mapNameToValue = map17;
        java.lang.String str20 = hashEntityMap16.name((int) '4');
        java.util.Map map21 = hashEntityMap16.mapValueToName;
        hashEntityMap15.mapValueToName = map21;
        hashEntityMap11.mapNameToValue = map21;
        java.util.Map map24 = hashEntityMap11.mapNameToValue;
        hashEntityMap11.add("hi!", 35);
        hashEntityMap11.add("", 100);
        java.util.Map map31 = hashEntityMap11.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = null;
        hashEntityMap32.mapNameToValue = map33;
        java.lang.String str36 = hashEntityMap32.name((int) '4');
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
        hashEntityMap32.mapValueToName = map58;
        java.util.Map map62 = hashEntityMap32.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map64 = null;
        hashEntityMap63.mapNameToValue = map64;
        java.util.Map map66 = null;
        hashEntityMap63.mapNameToValue = map66;
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
        hashEntityMap63.mapValueToName = map87;
        hashEntityMap32.mapNameToValue = map87;
        hashEntityMap11.mapNameToValue = map87;
        hashEntityMap0.mapNameToValue = map87;
        java.util.Map map92 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(map62);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        binaryEntityMap1.size = 0;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer5 = null;
        entities0.escape(writer5, "");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[][] strArray33 = new java.lang.String[][] { strArray12, strArray17, strArray22, strArray27, strArray32 };
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntities(strArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.lang.String str2 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray7 = new int[] { ' ', '4' };
        binaryEntityMap4.values = intArray7;
        java.lang.String str10 = binaryEntityMap4.name((int) (byte) 100);
        binaryEntityMap4.add("hi!", (-1));
        java.lang.String str15 = binaryEntityMap4.name(0);
        entities0.map = binaryEntityMap4;
        java.lang.String str18 = binaryEntityMap4.name((int) (byte) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        lookupEntityMap0.add("", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("hi!", 100);
        lookupEntityMap0.add("", (int) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        int int6 = lookupEntityMap0.value("hi!");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (int) (short) 1);
        lookupEntityMap0.add("hi!", (int) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        java.util.Map map39 = hashEntityMap14.mapValueToName;
        java.lang.Class<?> wildcardClass40 = hashEntityMap14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        java.util.Map map41 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        int int85 = entities0.entityValue("hi!");
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
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        int int6 = hashEntityMap0.value("");
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
        java.util.Map map27 = hashEntityMap24.mapNameToValue;
        java.lang.String str29 = hashEntityMap24.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = null;
        hashEntityMap30.mapNameToValue = map31;
        java.util.Map map33 = hashEntityMap30.mapNameToValue;
        java.util.Map map34 = hashEntityMap30.mapValueToName;
        java.lang.String str36 = hashEntityMap30.name(10);
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap37 = new org.apache.commons.lang.Entities.TreeEntityMap();
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
        treeEntityMap37.mapValueToName = map52;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = null;
        hashEntityMap55.mapNameToValue = map56;
        java.lang.String str59 = hashEntityMap55.name((int) '4');
        java.lang.String str61 = hashEntityMap55.name((int) (short) 100);
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
        hashEntityMap55.mapValueToName = map76;
        treeEntityMap37.mapNameToValue = map76;
        int int81 = treeEntityMap37.value("hi!");
        int int83 = treeEntityMap37.value("");
        java.util.Map map84 = treeEntityMap37.mapValueToName;
        java.util.Map map85 = treeEntityMap37.mapValueToName;
        hashEntityMap30.mapValueToName = map85;
        hashEntityMap24.mapValueToName = map85;
        hashEntityMap0.mapValueToName = map85;
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        int int2 = binaryEntityMap1.size;
        binaryEntityMap1.add("", (int) (short) 1);
        int int6 = binaryEntityMap1.growBy;
        java.lang.String str8 = binaryEntityMap1.name(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        int int7 = binaryEntityMap1.size;
        int int8 = binaryEntityMap1.growBy;
        int[] intArray9 = binaryEntityMap1.values;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[2]");
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
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("hi!", (int) (byte) 1);
        lookupEntityMap0.add("hi!", 0);
        java.lang.Class<?> wildcardClass21 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        int int6 = binaryEntityMap1.size;
        binaryEntityMap1.growBy = (short) 1;
        binaryEntityMap1.add("hi!", (int) 'a');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("hi!");
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 100);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = lookupEntityMap0.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        java.lang.String str36 = entities0.unescape("");
        entities0.addEntity("hi!", (int) ' ');
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
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        binaryEntityMap12.ensureCapacity((int) (short) 0);
        int int21 = binaryEntityMap12.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        int int3 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.growBy = 2;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        java.util.Map map13 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str12 = entities0.entityName(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        int int34 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.growBy;
        arrayEntityMap1.add("", (int) (byte) 10);
        int[] intArray7 = arrayEntityMap1.values;
        int[] intArray8 = arrayEntityMap1.values;
        int int10 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str14 = binaryEntityMap12.name((int) '#');
        binaryEntityMap12.add("", (int) (byte) -1);
        int int18 = binaryEntityMap12.size;
        int int19 = binaryEntityMap12.growBy;
        int[] intArray20 = binaryEntityMap12.values;
        arrayEntityMap1.values = intArray20;
        arrayEntityMap1.add("", (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1) });
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap4.add("", 1);
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
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        treeEntityMap0.add("hi!", (int) (byte) 100);
        int int25 = treeEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray7 = new int[] { (short) -1, 10 };
        arrayEntityMap1.values = intArray7;
        java.lang.String str10 = arrayEntityMap1.name((int) (short) 10);
        arrayEntityMap1.add("", 35);
        int int14 = arrayEntityMap1.growBy;
        int int15 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str19 = binaryEntityMap17.name(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray24 = new int[] { ' ', '4' };
        binaryEntityMap21.values = intArray24;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap27 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray28 = arrayEntityMap27.values;
        java.lang.String str30 = arrayEntityMap27.name((int) (short) 100);
        int[] intArray33 = new int[] { (short) -1, 10 };
        arrayEntityMap27.values = intArray33;
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        arrayEntityMap27.names = strArray36;
        binaryEntityMap21.names = strArray36;
        binaryEntityMap17.names = strArray36;
        arrayEntityMap1.names = strArray36;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 35, 10 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0 });
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 0);
        int int15 = binaryEntityMap1.size;
        binaryEntityMap1.add("", (int) (short) -1);
        int int19 = binaryEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        int int9 = arrayEntityMap1.value("");
        int int10 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str6 = lookupEntityMap0.name(100);
        int int8 = lookupEntityMap0.value("hi!");
        java.lang.String str10 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str12 = lookupEntityMap0.name(35);
        java.lang.String str14 = lookupEntityMap0.name(1);
        java.lang.String str16 = lookupEntityMap0.name(100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 0);
        java.lang.String[] strArray15 = binaryEntityMap1.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap17.growBy = (-1);
        arrayEntityMap17.ensureCapacity((int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray24 = arrayEntityMap23.values;
        java.lang.String str26 = arrayEntityMap23.name((int) (short) 100);
        int[] intArray29 = new int[] { (short) -1, 10 };
        arrayEntityMap23.values = intArray29;
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        arrayEntityMap23.names = strArray32;
        int[] intArray34 = arrayEntityMap23.values;
        arrayEntityMap17.values = intArray34;
        arrayEntityMap17.add("", 35);
        arrayEntityMap17.growBy = 0;
        java.lang.String str42 = arrayEntityMap17.name((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap44 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray45 = arrayEntityMap44.values;
        int int46 = arrayEntityMap44.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap48 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap48.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap52 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray55 = new int[] { ' ', '4' };
        binaryEntityMap52.values = intArray55;
        arrayEntityMap48.values = intArray55;
        arrayEntityMap44.values = intArray55;
        java.lang.String str60 = arrayEntityMap44.name(1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap62 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap62.ensureCapacity((-1));
        binaryEntityMap62.growBy = 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap68 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str70 = binaryEntityMap68.name((-1));
        int[] intArray71 = binaryEntityMap68.values;
        binaryEntityMap62.values = intArray71;
        arrayEntityMap44.values = intArray71;
        arrayEntityMap17.values = intArray71;
        binaryEntityMap1.values = intArray71;
        int int76 = binaryEntityMap1.growBy;
        int int77 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0 });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 35, 10 });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 35, 10 });
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 32 + "'", int76 == 32);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 32 + "'", int77 == 32);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        int[] intArray4 = arrayEntityMap1.values;
        java.lang.String str6 = arrayEntityMap1.name((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = arrayEntityMap1.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap1 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap1.add("hi!", (int) (short) 1);
        int int6 = lookupEntityMap1.value("hi!");
        int int8 = lookupEntityMap1.value("");
        java.lang.String str10 = lookupEntityMap1.name((int) (byte) 1);
        lookupEntityMap1.add("hi!", 10);
        entities0.map = lookupEntityMap1;
        java.lang.String str16 = entities0.escape("hi!");
        java.lang.String str18 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("");
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        int int5 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 52 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.growBy = 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        java.lang.String str21 = hashEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap22.add("", (int) (byte) 100);
        java.util.Map map26 = null;
        hashEntityMap22.mapValueToName = map26;
        int int29 = hashEntityMap22.value("");
        java.util.Map map30 = hashEntityMap22.mapValueToName;
        java.util.Map map31 = hashEntityMap22.mapValueToName;
        int int33 = hashEntityMap22.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = hashEntityMap34.mapValueToName;
        java.util.Map map36 = hashEntityMap34.mapNameToValue;
        int int38 = hashEntityMap34.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map40 = hashEntityMap39.mapValueToName;
        java.util.Map map41 = hashEntityMap39.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap42 = new org.apache.commons.lang.Entities.TreeEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = null;
        hashEntityMap43.mapNameToValue = map44;
        java.util.Map map46 = null;
        hashEntityMap43.mapNameToValue = map46;
        java.util.Map map48 = null;
        hashEntityMap43.mapNameToValue = map48;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map51 = null;
        hashEntityMap50.mapNameToValue = map51;
        java.util.Map map53 = null;
        hashEntityMap50.mapNameToValue = map53;
        java.util.Map map55 = null;
        hashEntityMap50.mapNameToValue = map55;
        java.util.Map map57 = hashEntityMap50.mapValueToName;
        hashEntityMap43.mapNameToValue = map57;
        treeEntityMap42.mapValueToName = map57;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map61 = null;
        hashEntityMap60.mapNameToValue = map61;
        java.lang.String str64 = hashEntityMap60.name((int) '4');
        java.lang.String str66 = hashEntityMap60.name((int) (short) 100);
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
        hashEntityMap60.mapValueToName = map81;
        treeEntityMap42.mapNameToValue = map81;
        java.util.Map map85 = treeEntityMap42.mapNameToValue;
        hashEntityMap39.mapValueToName = map85;
        java.util.Map map87 = hashEntityMap39.mapValueToName;
        java.util.Map map88 = hashEntityMap39.mapValueToName;
        hashEntityMap34.mapNameToValue = map88;
        hashEntityMap22.mapValueToName = map88;
        java.util.Map map91 = hashEntityMap22.mapNameToValue;
        hashEntityMap0.mapValueToName = map91;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        int int40 = arrayEntityMap1.growBy;
        int int41 = arrayEntityMap1.growBy;
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities entities3 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray6 = arrayEntityMap5.values;
        java.lang.String str8 = arrayEntityMap5.name((int) (short) 100);
        int[] intArray11 = new int[] { (short) -1, 10 };
        arrayEntityMap5.values = intArray11;
        entities3.map = arrayEntityMap5;
        int int15 = entities3.entityValue("");
        java.lang.String str17 = entities3.entityName(10);
        entities3.addEntity("", 52);
        org.apache.commons.lang.Entities entities21 = new org.apache.commons.lang.Entities();
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
        entities21.map = hashEntityMap22;
        java.lang.String str54 = entities21.escape("hi!");
        java.lang.String str56 = entities21.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap58 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        entities21.map = arrayEntityMap58;
        java.lang.String[][] strArray60 = new java.lang.String[][] {};
        entities21.addEntities(strArray60);
        entities3.addEntities(strArray60);
        entities0.addEntities(strArray60);
        org.apache.commons.lang.Entities.EntityMap entityMap64 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
// flaky "6) test1716(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(entities3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 52, 10 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(entityMap64);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        java.lang.String str13 = lookupEntityMap0.name((int) (short) 1);
        lookupEntityMap0.add("", 32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        java.lang.String str42 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities43 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer44 = null;
        entities43.escape(writer44, "");
        org.apache.commons.lang.Entities.EntityMap entityMap47 = entities43.map;
        org.apache.commons.lang.Entities entities48 = org.apache.commons.lang.Entities.HTML32;
        int int50 = entities48.entityValue("");
        entities48.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities entities54 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str56 = entities54.entityName((int) '#');
        entities54.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap60 = entities54.map;
        java.io.Writer writer61 = null;
        entities54.escape(writer61, "");
        java.lang.String str65 = entities54.unescape("hi!");
        org.apache.commons.lang.Entities entities66 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap67 = entities66.map;
        java.lang.String str69 = entities66.unescape("hi!");
        org.apache.commons.lang.Entities entities70 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap71 = entities70.map;
        org.apache.commons.lang.Entities.EntityMap entityMap72 = entities70.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap74 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap74.add("hi!", 0);
        arrayEntityMap74.size = (byte) 1;
        arrayEntityMap74.growBy = 100;
        java.lang.String str83 = arrayEntityMap74.name((int) (byte) 1);
        entities70.map = arrayEntityMap74;
        entities66.map = arrayEntityMap74;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities66);
        org.apache.commons.lang.Entities entities87 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray88 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities87.addEntities(strArray88);
        entities66.addEntities(strArray88);
        entities54.addEntities(strArray88);
        entities48.addEntities(strArray88);
        entities43.addEntities(strArray88);
        entities0.addEntities(strArray88);
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(entities43);
        org.junit.Assert.assertNotNull(entityMap47);
        org.junit.Assert.assertNotNull(entities48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 52 + "'", int50 == 52);
        org.junit.Assert.assertNotNull(entities54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(entityMap60);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(entities66);
        org.junit.Assert.assertNotNull(entityMap67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(entities70);
        org.junit.Assert.assertNotNull(entityMap71);
        org.junit.Assert.assertNotNull(entityMap72);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(entities87);
        org.junit.Assert.assertNotNull(strArray88);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (short) 10);
        primitiveEntityMap0.add("hi!", 10);
        int int7 = primitiveEntityMap0.value("hi!");
        int int9 = primitiveEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.entityName(2);
        java.lang.String str9 = entities0.entityName((int) (byte) 10);
        java.lang.String str11 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        java.lang.String str6 = binaryEntityMap1.name((int) (short) 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(32);
        java.lang.String str12 = lookupEntityMap0.name((int) (byte) 10);
        int int14 = lookupEntityMap0.value("hi!");
        java.lang.String str16 = lookupEntityMap0.name(52);
        int int18 = lookupEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        org.apache.commons.lang.Entities entities5 = org.apache.commons.lang.Entities.HTML32;
        int int7 = entities5.entityValue("");
        entities5.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str13 = entities11.entityName((int) '#');
        entities11.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities11.map;
        java.io.Writer writer18 = null;
        entities11.escape(writer18, "");
        java.lang.String str22 = entities11.unescape("hi!");
        org.apache.commons.lang.Entities entities23 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap24 = entities23.map;
        java.lang.String str26 = entities23.unescape("hi!");
        org.apache.commons.lang.Entities entities27 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap28 = entities27.map;
        org.apache.commons.lang.Entities.EntityMap entityMap29 = entities27.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap31 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap31.add("hi!", 0);
        arrayEntityMap31.size = (byte) 1;
        arrayEntityMap31.growBy = 100;
        java.lang.String str40 = arrayEntityMap31.name((int) (byte) 1);
        entities27.map = arrayEntityMap31;
        entities23.map = arrayEntityMap31;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities23);
        org.apache.commons.lang.Entities entities44 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray45 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities44.addEntities(strArray45);
        entities23.addEntities(strArray45);
        entities11.addEntities(strArray45);
        entities5.addEntities(strArray45);
        entities0.addEntities(strArray45);
        java.lang.String str52 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNotNull(entities5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(entityMap17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(entities23);
        org.junit.Assert.assertNotNull(entityMap24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(entities27);
        org.junit.Assert.assertNotNull(entityMap28);
        org.junit.Assert.assertNotNull(entityMap29);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(entities44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = entities0.entityName((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        int int9 = arrayEntityMap1.value("");
        java.lang.String str11 = arrayEntityMap1.name((int) (short) 0);
        arrayEntityMap1.add("", 32);
        arrayEntityMap1.add("", 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 32 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) 100);
        int int5 = hashEntityMap0.value("");
        java.util.Map map6 = hashEntityMap0.mapValueToName;
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        int int9 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        java.lang.String str63 = hashEntityMap0.name(2);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        int int23 = entities21.entityValue("");
        entities21.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities entities27 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str29 = entities27.entityName((int) '#');
        entities27.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap33 = entities27.map;
        java.io.Writer writer34 = null;
        entities27.escape(writer34, "");
        java.lang.String str38 = entities27.unescape("hi!");
        org.apache.commons.lang.Entities entities39 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap40 = entities39.map;
        java.lang.String str42 = entities39.unescape("hi!");
        org.apache.commons.lang.Entities entities43 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap44 = entities43.map;
        org.apache.commons.lang.Entities.EntityMap entityMap45 = entities43.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap47 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap47.add("hi!", 0);
        arrayEntityMap47.size = (byte) 1;
        arrayEntityMap47.growBy = 100;
        java.lang.String str56 = arrayEntityMap47.name((int) (byte) 1);
        entities43.map = arrayEntityMap47;
        entities39.map = arrayEntityMap47;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities39);
        org.apache.commons.lang.Entities entities60 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray61 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities60.addEntities(strArray61);
        entities39.addEntities(strArray61);
        entities27.addEntities(strArray61);
        entities21.addEntities(strArray61);
        entities0.addEntities(strArray61);
        java.lang.String str68 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 52, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(entities21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(entities27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(entityMap33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(entities39);
        org.junit.Assert.assertNotNull(entityMap40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(entities43);
        org.junit.Assert.assertNotNull(entityMap44);
        org.junit.Assert.assertNotNull(entityMap45);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(entities60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("hi!");
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 100);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 0);
        int int8 = lookupEntityMap0.value("");
        java.lang.String str10 = lookupEntityMap0.name(100);
        java.lang.String str12 = lookupEntityMap0.name(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        java.lang.String str3 = binaryEntityMap1.name((int) ' ');
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        int int5 = binaryEntityMap1.size;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        java.util.Map map15 = hashEntityMap0.mapValueToName;
        java.util.Map map16 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(map16);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int12 = hashEntityMap10.value("");
        java.util.Map map13 = hashEntityMap10.mapValueToName;
        hashEntityMap0.mapValueToName = map13;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap15.mapNameToValue = map18;
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
        hashEntityMap15.mapValueToName = map39;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = null;
        hashEntityMap41.mapNameToValue = map42;
        java.lang.String str45 = hashEntityMap41.name((int) '4');
        java.util.Map map46 = hashEntityMap41.mapValueToName;
        hashEntityMap15.mapValueToName = map46;
        hashEntityMap0.mapNameToValue = map46;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map50 = null;
        hashEntityMap49.mapNameToValue = map50;
        java.util.Map map52 = null;
        hashEntityMap49.mapNameToValue = map52;
        java.util.Map map54 = null;
        hashEntityMap49.mapNameToValue = map54;
        java.util.Map map56 = hashEntityMap49.mapValueToName;
        hashEntityMap0.mapValueToName = map56;
        hashEntityMap0.add("hi!", (int) (short) 100);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map56);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str6 = binaryEntityMap4.name((-1));
        entities0.map = binaryEntityMap4;
        java.lang.Class<?> wildcardClass8 = binaryEntityMap4.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.entityName((int) (byte) 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap0 = new org.apache.commons.lang.Entities.TreeEntityMap();
        treeEntityMap0.add("", (int) (short) 10);
        java.util.Map map4 = treeEntityMap0.mapValueToName;
        java.util.Map map5 = treeEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        org.apache.commons.lang.Entities entities3 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities3.addEntities(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntities(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[128]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(entities3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        java.io.Writer writer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer23, "hi!");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(52);
        java.lang.String str10 = lookupEntityMap0.name(32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        int int42 = hashEntityMap0.value("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.size = (byte) 0;
        int int9 = arrayEntityMap1.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap11.add("hi!", 0);
        arrayEntityMap11.size = (byte) 1;
        int[] intArray17 = new int[] {};
        arrayEntityMap11.values = intArray17;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap20 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int22 = arrayEntityMap20.value("");
        java.lang.String[] strArray23 = arrayEntityMap20.names;
        arrayEntityMap11.names = strArray23;
        arrayEntityMap1.names = strArray23;
        java.lang.String str27 = arrayEntityMap1.name(1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap29 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str31 = binaryEntityMap29.name(100);
        java.lang.String str33 = binaryEntityMap29.name((-1));
        int int34 = binaryEntityMap29.size;
        binaryEntityMap29.growBy = (short) 1;
        int[] intArray37 = binaryEntityMap29.values;
        arrayEntityMap1.values = intArray37;
        int int39 = arrayEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { null });
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        arrayEntityMap1.growBy = 100;
        java.lang.String str22 = arrayEntityMap1.name(0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 52 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
            hashEntityMap0.add("hi!", 0);
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
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        java.io.Writer writer47 = null;
        entities0.escape(writer47, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        int int4 = binaryEntityMap1.size;
        java.lang.String str6 = binaryEntityMap1.name((int) (byte) -1);
        int int7 = binaryEntityMap1.size;
        java.lang.String[] strArray8 = null;
        binaryEntityMap1.names = strArray8;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        binaryEntityMap1.growBy = 32;
        int[] intArray41 = binaryEntityMap1.values;
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
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        int int2 = binaryEntityMap1.size;
        binaryEntityMap1.add("", (int) (short) 1);
        binaryEntityMap1.add("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        java.lang.String str11 = binaryEntityMap1.name((int) (byte) 10);
        int int13 = binaryEntityMap1.value("hi!");
        java.lang.String[] strArray14 = binaryEntityMap1.names;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        int int6 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.growBy = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        hashEntityMap14.add("", 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap42.add("", (int) (byte) 100);
        int int47 = hashEntityMap42.value("");
        java.util.Map map48 = hashEntityMap42.mapValueToName;
        hashEntityMap14.mapValueToName = map48;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        arrayEntityMap1.add("hi!", (-1));
        arrayEntityMap1.ensureCapacity((int) (byte) 0);
        int int21 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1), 10 });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        arrayEntityMap1.growBy = (byte) 100;
        int int26 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 0);
        int int15 = binaryEntityMap1.size;
        int int17 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.add("hi!", 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 10 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        int int22 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int24 = binaryEntityMap23.size;
        binaryEntityMap23.size = 'a';
        int[] intArray27 = binaryEntityMap23.values;
        arrayEntityMap1.values = intArray27;
        arrayEntityMap1.add("", (int) '4');
        int int32 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, 52 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 100, 52 });
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) '#');
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str13 = entities0.escape("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 100);
        lookupEntityMap0.add("hi!", 100);
        lookupEntityMap0.add("", (-1));
        java.lang.String str13 = lookupEntityMap0.name(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        java.lang.String[] strArray8 = binaryEntityMap1.names;
        binaryEntityMap1.growBy = (byte) -1;
        binaryEntityMap1.size = 100;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray7 = new int[] { (short) -1, 10 };
        arrayEntityMap1.values = intArray7;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        arrayEntityMap1.names = strArray10;
        int[] intArray12 = arrayEntityMap1.values;
        java.lang.String str14 = arrayEntityMap1.name(2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1), 10 });
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.growBy = 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str9 = binaryEntityMap7.name((-1));
        int[] intArray10 = binaryEntityMap7.values;
        binaryEntityMap1.values = intArray10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap13 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        java.lang.String str15 = arrayEntityMap13.name(32);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap17.ensureCapacity(0);
        binaryEntityMap17.ensureCapacity(100);
        binaryEntityMap17.add("", (int) (byte) 1);
        int[] intArray28 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap17.values = intArray28;
        arrayEntityMap13.values = intArray28;
        binaryEntityMap1.values = intArray28;
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 1, 32 });
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = (byte) -1;
        arrayEntityMap1.add("hi!", (int) (byte) 1);
        int[] intArray12 = arrayEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap2 = entities0.map;
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNotNull(entityMap6);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray2 = binaryEntityMap1.values;
        java.lang.String[] strArray3 = null;
        binaryEntityMap1.names = strArray3;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        java.util.Map map2 = hashEntityMap0.mapNameToValue;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.lang.String str11 = hashEntityMap7.name((int) '4');
        java.lang.String str13 = hashEntityMap7.name((int) (short) 100);
        java.util.Map map14 = hashEntityMap7.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap15.mapNameToValue = map18;
        java.util.Map map20 = null;
        hashEntityMap15.mapNameToValue = map20;
        java.util.Map map22 = hashEntityMap15.mapValueToName;
        hashEntityMap7.mapNameToValue = map22;
        hashEntityMap0.mapNameToValue = map22;
        java.util.Map map25 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.size = '#';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = binaryEntityMap1.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (short) 10);
        java.lang.String str4 = primitiveEntityMap0.name((int) (byte) 100);
        java.lang.String str6 = primitiveEntityMap0.name((int) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name((int) (short) 100);
        int int12 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name(52);
        int int10 = lookupEntityMap0.value("");
        java.lang.String str12 = lookupEntityMap0.name(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = lookupEntityMap0.name((int) (byte) -1);
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
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("hi!", (-1));
        binaryEntityMap1.ensureCapacity((int) 'a');
        binaryEntityMap1.add("hi!", (int) (byte) 1);
        java.lang.String str11 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("hi!", 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
// flaky "7) test1770(org.apache.commons.lang.RegressionTest3)":         entities0.addEntities(strArray1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str6 = binaryEntityMap4.name((-1));
        entities0.map = binaryEntityMap4;
        java.lang.String str9 = entities0.escape("hi!");
        java.lang.String str11 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        int int41 = hashEntityMap0.value("");
        hashEntityMap0.add("", (int) '#');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.entityName((int) (byte) 1);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer12, "");
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
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.size = (byte) 0;
        int int9 = arrayEntityMap1.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap11.add("hi!", 0);
        arrayEntityMap11.size = (byte) 1;
        int[] intArray17 = new int[] {};
        arrayEntityMap11.values = intArray17;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap20 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int22 = arrayEntityMap20.value("");
        java.lang.String[] strArray23 = arrayEntityMap20.names;
        arrayEntityMap11.names = strArray23;
        arrayEntityMap1.names = strArray23;
        java.lang.String str27 = arrayEntityMap1.name(1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap29 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap29.growBy = 0;
        arrayEntityMap29.add("hi!", 0);
        arrayEntityMap29.add("hi!", (int) (byte) 0);
        java.lang.String[] strArray38 = arrayEntityMap29.names;
        arrayEntityMap1.names = strArray38;
        int[] intArray40 = arrayEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { null });
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 0 });
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '4');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int5 = arrayEntityMap3.value("");
        java.lang.String[] strArray6 = arrayEntityMap3.names;
        int[] intArray7 = arrayEntityMap3.values;
        binaryEntityMap1.values = intArray7;
        int int9 = binaryEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str6 = lookupEntityMap0.name(100);
        int int8 = lookupEntityMap0.value("hi!");
        java.lang.String str10 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str12 = lookupEntityMap0.name(35);
        java.lang.String str14 = lookupEntityMap0.name(1);
        int int16 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", (int) (byte) 100);
        lookupEntityMap0.add("", (int) (byte) 0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        java.util.Map map31 = hashEntityMap0.mapValueToName;
        java.util.Map map32 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = null;
        hashEntityMap35.mapNameToValue = map36;
        java.lang.String str39 = hashEntityMap35.name((int) '4');
        java.util.Map map40 = hashEntityMap35.mapValueToName;
        hashEntityMap34.mapValueToName = map40;
        java.util.Map map42 = hashEntityMap34.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map45 = null;
        hashEntityMap44.mapNameToValue = map45;
        java.lang.String str48 = hashEntityMap44.name((int) '4');
        java.util.Map map49 = hashEntityMap44.mapValueToName;
        hashEntityMap43.mapValueToName = map49;
        java.util.Map map51 = hashEntityMap43.mapValueToName;
        hashEntityMap34.mapNameToValue = map51;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = null;
        hashEntityMap53.mapNameToValue = map54;
        java.util.Map map56 = hashEntityMap53.mapNameToValue;
        java.util.Map map57 = hashEntityMap53.mapValueToName;
        java.lang.String str59 = hashEntityMap53.name(10);
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
        hashEntityMap53.mapNameToValue = map74;
        hashEntityMap34.mapValueToName = map74;
        hashEntityMap33.mapNameToValue = map74;
        hashEntityMap0.mapValueToName = map74;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.size = 0;
        java.lang.String str10 = binaryEntityMap1.name(2);
        binaryEntityMap1.add("", (int) (short) 1);
        int[] intArray14 = binaryEntityMap1.values;
        binaryEntityMap1.growBy = 0;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap2 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap4.add("hi!", 0);
        arrayEntityMap4.size = (byte) 1;
        arrayEntityMap4.growBy = 100;
        java.lang.String str13 = arrayEntityMap4.name((int) (byte) 1);
        entities0.map = arrayEntityMap4;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray17 = arrayEntityMap16.values;
        java.lang.String str19 = arrayEntityMap16.name((int) (short) 100);
        int int21 = arrayEntityMap16.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap23.add("hi!", 0);
        arrayEntityMap23.size = (byte) 1;
        int[] intArray29 = new int[] {};
        arrayEntityMap23.values = intArray29;
        arrayEntityMap16.values = intArray29;
        arrayEntityMap4.values = intArray29;
        arrayEntityMap4.size = 2;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = arrayEntityMap4.name(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0 });
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] {});
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        int int6 = arrayEntityMap1.value("hi!");
        int int8 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.ensureCapacity(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        binaryEntityMap45.growBy = (byte) 100;
        binaryEntityMap45.add("", 52);
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
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(32);
        int int2 = binaryEntityMap1.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap4.add("hi!", 0);
        arrayEntityMap4.size = (byte) 1;
        int[] intArray10 = new int[] {};
        arrayEntityMap4.values = intArray10;
        int int13 = arrayEntityMap4.value("");
        java.lang.String[] strArray14 = arrayEntityMap4.names;
        binaryEntityMap1.names = strArray14;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("", 32);
        int int19 = lookupEntityMap0.value("hi!");
        java.lang.String str21 = lookupEntityMap0.name(100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("hi!", (int) (byte) 1);
        lookupEntityMap0.add("hi!", (int) (short) 10);
        java.lang.String str22 = lookupEntityMap0.name(10);
        java.lang.Class<?> wildcardClass23 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        int int38 = hashEntityMap0.value("hi!");
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
        java.util.Map map55 = hashEntityMap39.mapValueToName;
        java.util.Map map56 = hashEntityMap39.mapNameToValue;
        hashEntityMap0.mapNameToValue = map56;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap58 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map59 = hashEntityMap58.mapValueToName;
        java.util.Map map60 = hashEntityMap58.mapNameToValue;
        int int62 = hashEntityMap58.value("");
        int int64 = hashEntityMap58.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = null;
        hashEntityMap65.mapNameToValue = map66;
        java.lang.String str69 = hashEntityMap65.name((int) '4');
        java.lang.String str71 = hashEntityMap65.name((int) (short) 100);
        java.util.Map map72 = hashEntityMap65.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap73 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map74 = null;
        hashEntityMap73.mapNameToValue = map74;
        java.util.Map map76 = null;
        hashEntityMap73.mapNameToValue = map76;
        java.util.Map map78 = null;
        hashEntityMap73.mapNameToValue = map78;
        java.util.Map map80 = hashEntityMap73.mapValueToName;
        hashEntityMap65.mapNameToValue = map80;
        hashEntityMap58.mapNameToValue = map80;
        hashEntityMap0.mapNameToValue = map80;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(map72);
        org.junit.Assert.assertNotNull(map80);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.growBy = (byte) -1;
        binaryEntityMap1.growBy = 'a';
        binaryEntityMap1.size = (byte) 0;
        java.lang.String str13 = binaryEntityMap1.name(2);
        java.lang.String str15 = binaryEntityMap1.name(97);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
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
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(10);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name((int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        binaryEntityMap1.growBy = (short) 10;
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
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = null;
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.add("hi!", 0);
        int int8 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.add("hi!", 10);
        int int13 = arrayEntityMap1.value("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.size;
        binaryEntityMap0.ensureCapacity(2);
        binaryEntityMap0.size = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", (int) (short) 100);
        int[] intArray11 = binaryEntityMap1.values;
        binaryEntityMap1.add("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 100 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 100 });
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        int int18 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        java.util.Map map93 = treeEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map93);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.size = (-1);
        int[] intArray9 = arrayEntityMap1.values;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        java.lang.String str5 = lookupEntityMap0.name(0);
        java.lang.String str7 = lookupEntityMap0.name((int) (byte) 10);
        int int9 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", (int) '#');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        java.lang.String str10 = entities0.entityName((int) (short) 0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str14 = entities0.entityName((int) '4');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
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
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("hi!", 100);
        int int16 = lookupEntityMap0.value("hi!");
        java.lang.String str18 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str20 = lookupEntityMap0.name(10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        java.util.Map map6 = hashEntityMap0.mapValueToName;
        java.lang.String str8 = hashEntityMap0.name((int) (byte) 1);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        org.apache.commons.lang.Entities.EntityMap entityMap21 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
// flaky "8) test1806(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(entityMap21);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.entityName(2);
        java.lang.String str9 = entities0.entityName((int) (byte) 10);
        java.io.Writer writer10 = null;
        entities0.escape(writer10, "");
        java.lang.String str14 = entities0.escape("hi!");
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = null;
        hashEntityMap5.mapNameToValue = map6;
        java.util.Map map8 = hashEntityMap5.mapNameToValue;
        java.util.Map map9 = hashEntityMap5.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = null;
        hashEntityMap10.mapNameToValue = map11;
        java.lang.String str14 = hashEntityMap10.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.lang.String str19 = hashEntityMap15.name((int) '4');
        java.lang.String str21 = hashEntityMap15.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = null;
        hashEntityMap22.mapNameToValue = map23;
        java.util.Map map25 = null;
        hashEntityMap22.mapNameToValue = map25;
        java.util.Map map27 = null;
        hashEntityMap22.mapNameToValue = map27;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = null;
        hashEntityMap29.mapNameToValue = map30;
        java.util.Map map32 = null;
        hashEntityMap29.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap29.mapNameToValue = map34;
        java.util.Map map36 = hashEntityMap29.mapValueToName;
        hashEntityMap22.mapNameToValue = map36;
        hashEntityMap15.mapValueToName = map36;
        hashEntityMap10.mapValueToName = map36;
        hashEntityMap5.mapNameToValue = map36;
        java.lang.String str42 = hashEntityMap5.name((-1));
        int int44 = hashEntityMap5.value("hi!");
        java.lang.String str46 = hashEntityMap5.name((-1));
        java.util.Map map47 = hashEntityMap5.mapValueToName;
        hashEntityMap0.mapValueToName = map47;
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name((-1));
        binaryEntityMap1.ensureCapacity((-1));
        int int7 = binaryEntityMap1.value("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        entities0.addEntity("", (int) (byte) 10);
        java.lang.String str7 = entities0.escape("hi!");
        java.lang.String str9 = entities0.escape("");
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
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
        java.io.Writer writer42 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer42, "hi!");
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
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        lookupEntityMap0.add("", 32);
        java.lang.String str13 = lookupEntityMap0.name((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 10);
        binaryEntityMap1.size = 32;
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        entities0.addEntity("hi!", (int) (short) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        hashEntityMap0.add("hi!", (int) (byte) 1);
        java.util.Map map27 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        java.lang.Class<?> wildcardClass30 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
// flaky "9) test1816(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str9 = entities0.unescape("");
        java.lang.String str11 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        java.lang.Class<?> wildcardClass41 = intArray39.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        arrayEntityMap1.add("hi!", (int) (byte) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray8 = arrayEntityMap7.values;
        int int9 = arrayEntityMap7.growBy;
        arrayEntityMap7.add("", (int) (byte) 10);
        int[] intArray13 = arrayEntityMap7.values;
        arrayEntityMap1.values = intArray13;
        arrayEntityMap1.size = 10;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10 });
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        java.lang.String str22 = arrayEntityMap8.name((int) (byte) 100);
        int int23 = arrayEntityMap8.growBy;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray8 = new int[] { ' ', '4' };
        binaryEntityMap5.values = intArray8;
        binaryEntityMap5.size = '#';
        int[] intArray12 = binaryEntityMap5.values;
        binaryEntityMap1.values = intArray12;
        int[] intArray14 = binaryEntityMap1.values;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 32, 52 });
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) ' ');
        java.lang.String str13 = lookupEntityMap0.name((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        java.io.Writer writer48 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer48, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.ensureCapacity((int) (byte) -1);
        binaryEntityMap1.ensureCapacity((int) (byte) 0);
        binaryEntityMap1.growBy = 2;
        binaryEntityMap1.add("hi!", (int) (byte) 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        lookupEntityMap0.add("", 1);
        java.lang.String str29 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        binaryEntityMap1.add("", 1);
        binaryEntityMap1.ensureCapacity((int) (byte) 10);
        binaryEntityMap1.add("", 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap18.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray25 = new int[] { ' ', '4' };
        binaryEntityMap22.values = intArray25;
        arrayEntityMap18.values = intArray25;
        int int28 = arrayEntityMap18.growBy;
        java.lang.String[] strArray29 = arrayEntityMap18.names;
        binaryEntityMap1.names = strArray29;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { null });
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap1 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap1.add("hi!", (int) (short) 1);
        int int6 = lookupEntityMap1.value("hi!");
        int int8 = lookupEntityMap1.value("");
        java.lang.String str10 = lookupEntityMap1.name((int) (byte) 1);
        lookupEntityMap1.add("hi!", 10);
        entities0.map = lookupEntityMap1;
        org.apache.commons.lang.Entities entities15 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap16 = entities15.map;
        java.lang.String str18 = entities15.unescape("");
        org.apache.commons.lang.Entities entities19 = org.apache.commons.lang.Entities.HTML32;
        int int21 = entities19.entityValue("");
        entities19.addEntity("hi!", (int) '4');
        java.lang.String str26 = entities19.entityName((int) (short) 1);
        int int28 = entities19.entityValue("");
        entities19.addEntity("hi!", (int) (byte) 100);
        java.lang.String[][] strArray32 = new java.lang.String[][] {};
        entities19.addEntities(strArray32);
        entities15.addEntities(strArray32);
        entities0.addEntities(strArray32);
        org.apache.commons.lang.Entities.EntityMap entityMap36 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(entities15);
        org.junit.Assert.assertNotNull(entityMap16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(entities19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(entityMap36);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("", 32);
        java.lang.String str19 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str21 = lookupEntityMap0.name((int) (byte) 1);
        int int23 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        java.io.Writer writer4 = null;
        entities0.escape(writer4, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(entityMap3);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        int int13 = lookupEntityMap0.value("hi!");
        int int15 = lookupEntityMap0.value("hi!");
        java.lang.String str17 = lookupEntityMap0.name((int) (short) 1);
        lookupEntityMap0.add("hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        int[] intArray35 = binaryEntityMap1.values;
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
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 0 });
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        java.lang.Class<?> wildcardClass1 = arrayEntityMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("");
        java.lang.String[] strArray4 = arrayEntityMap1.names;
        int[] intArray5 = arrayEntityMap1.values;
        java.lang.String str7 = arrayEntityMap1.name(2);
        arrayEntityMap1.ensureCapacity((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
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
        hashEntityMap0.add("hi!", 0);
        hashEntityMap0.add("hi!", 2);
        int int88 = hashEntityMap0.value("hi!");
        int int90 = hashEntityMap0.value("hi!");
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
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2 + "'", int88 == 2);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 100);
        arrayEntityMap1.size = 52;
        int[] intArray4 = arrayEntityMap1.values;
        arrayEntityMap1.size = 97;
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
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
        int int97 = hashEntityMap0.value("");
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
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = binaryEntityMap0.values;
        int[] intArray2 = binaryEntityMap0.values;
        binaryEntityMap0.add("", (int) '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
            int int34 = hashEntityMap0.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        entities0.addEntity("", (int) (short) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
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
        java.lang.String str29 = binaryEntityMap1.name((int) '#');
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
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap1 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap1.add("hi!", (int) (short) 1);
        int int6 = lookupEntityMap1.value("hi!");
        int int8 = lookupEntityMap1.value("");
        java.lang.String str10 = lookupEntityMap1.name((int) (byte) 1);
        lookupEntityMap1.add("hi!", 10);
        entities0.map = lookupEntityMap1;
        int int16 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("hi!", (int) '#');
        java.lang.String str16 = lookupEntityMap0.name(32);
        int int18 = lookupEntityMap0.value("hi!");
        java.lang.String str20 = lookupEntityMap0.name((int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(32);
        java.lang.String str12 = lookupEntityMap0.name(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.entityName((int) '#');
        int int13 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap1.growBy = 0;
        arrayEntityMap1.add("hi!", 0);
        int int7 = arrayEntityMap1.size;
        arrayEntityMap1.growBy = 0;
        int int10 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray13 = arrayEntityMap12.values;
        int int14 = arrayEntityMap12.growBy;
        arrayEntityMap12.size = 100;
        arrayEntityMap12.growBy = (byte) 100;
        arrayEntityMap12.growBy = (short) 1;
        int[] intArray21 = arrayEntityMap12.values;
        arrayEntityMap1.values = intArray21;
        int int23 = arrayEntityMap1.size;
        arrayEntityMap1.ensureCapacity(100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        java.lang.String[] strArray8 = null;
        arrayEntityMap1.names = strArray8;
        int int11 = arrayEntityMap1.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.ensureCapacity((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        java.lang.String str9 = hashEntityMap0.name((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String str5 = binaryEntityMap1.name((-1));
        binaryEntityMap1.add("", (int) (short) 100);
        int int9 = binaryEntityMap1.size;
        java.lang.String str11 = binaryEntityMap1.name((int) (byte) 10);
        java.lang.String str13 = binaryEntityMap1.name((int) (byte) -1);
        java.lang.String str15 = binaryEntityMap1.name(1);
        int[] intArray16 = binaryEntityMap1.values;
        binaryEntityMap1.add("hi!", (int) (byte) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        int int6 = arrayEntityMap1.value("hi!");
        java.lang.String str8 = arrayEntityMap1.name(0);
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.XML;
        java.lang.String str11 = entities9.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray16 = new int[] { ' ', '4' };
        binaryEntityMap13.values = intArray16;
        java.lang.String str19 = binaryEntityMap13.name((int) (byte) 100);
        binaryEntityMap13.add("hi!", (-1));
        java.lang.String str24 = binaryEntityMap13.name(0);
        entities9.map = binaryEntityMap13;
        binaryEntityMap13.add("", (int) (short) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str32 = binaryEntityMap30.name((int) '#');
        binaryEntityMap30.add("", (int) (byte) -1);
        int int36 = binaryEntityMap30.size;
        int int37 = binaryEntityMap30.growBy;
        java.lang.String[] strArray38 = binaryEntityMap30.names;
        binaryEntityMap13.names = strArray38;
        arrayEntityMap1.names = strArray38;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1 });
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        arrayEntityMap1.add("hi!", (int) (byte) 10);
        arrayEntityMap1.add("", (int) (short) -1);
        int int9 = arrayEntityMap1.size;
        java.lang.String str11 = arrayEntityMap1.name((int) (short) -1);
        arrayEntityMap1.size = (short) 100;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        java.lang.String str7 = entities0.escape("");
        java.lang.String str9 = entities0.escape("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (byte) 0;
        arrayEntityMap1.growBy = (short) 1;
        java.lang.String str7 = arrayEntityMap1.name((-1));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        java.lang.String str4 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.entityName(100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        java.lang.String str5 = binaryEntityMap1.name((int) (byte) 1);
        java.lang.String str7 = binaryEntityMap1.name((int) (short) 0);
        int[] intArray8 = binaryEntityMap1.values;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] {});
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer8 = null;
        entities7.escape(writer8, "");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities7.map;
        org.apache.commons.lang.Entities entities12 = org.apache.commons.lang.Entities.HTML32;
        int int14 = entities12.entityValue("");
        entities12.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities entities18 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str20 = entities18.entityName((int) '#');
        entities18.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap24 = entities18.map;
        java.io.Writer writer25 = null;
        entities18.escape(writer25, "");
        java.lang.String str29 = entities18.unescape("hi!");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities30);
        org.apache.commons.lang.Entities entities51 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray52 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities51.addEntities(strArray52);
        entities30.addEntities(strArray52);
        entities18.addEntities(strArray52);
        entities12.addEntities(strArray52);
        entities7.addEntities(strArray52);
        entities0.addEntities(strArray52);
        org.apache.commons.lang.Entities entities59 = org.apache.commons.lang.Entities.HTML32;
        int int61 = entities59.entityValue("");
        java.lang.String[][] strArray62 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities59.addEntities(strArray62);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities59);
        org.apache.commons.lang.Entities entities65 = org.apache.commons.lang.Entities.HTML32;
        int int67 = entities65.entityValue("");
        java.lang.String[][] strArray68 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities65.addEntities(strArray68);
        entities59.addEntities(strArray68);
        entities0.addEntities(strArray68);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertNotNull(entities12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(entities18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(entityMap24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(entities30);
        org.junit.Assert.assertNotNull(entityMap31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(entities34);
        org.junit.Assert.assertNotNull(entityMap35);
        org.junit.Assert.assertNotNull(entityMap36);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(entities51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(entities59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(entities65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(strArray68);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = null;
        binaryEntityMap0.values = intArray1;
        int[] intArray3 = binaryEntityMap0.values;
        int int5 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNull(intArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        java.lang.Class<?> wildcardClass6 = map5.getClass();
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        int int40 = arrayEntityMap1.size;
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.lang.String str8 = entities0.escape("hi!");
        java.lang.String str10 = entities0.unescape("hi!");
        int int12 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.size = (byte) 0;
        int int9 = arrayEntityMap1.size;
        int int11 = arrayEntityMap1.value("");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        int int6 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", 52);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        int int2 = entities0.entityValue("hi!");
        java.lang.String[][] strArray3 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.entityName(2);
        java.lang.String str9 = entities0.entityName(10);
        int int11 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.unescape("hi!");
        java.lang.String str13 = entities0.entityName((int) '4');
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer14, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("hi!", (int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int6 = binaryEntityMap1.growBy;
        int int7 = binaryEntityMap1.growBy;
        binaryEntityMap1.add("", 1);
        binaryEntityMap1.add("", (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("hi!", (int) (short) 0);
        int int8 = binaryEntityMap1.value("");
        binaryEntityMap1.growBy = (short) 10;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        int int33 = binaryEntityMap1.growBy;
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("");
        java.lang.String str5 = entities0.escape("");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        java.lang.String[] strArray8 = binaryEntityMap1.names;
        binaryEntityMap1.growBy = (byte) -1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray15 = new int[] { ' ', '4' };
        binaryEntityMap12.values = intArray15;
        java.lang.String str18 = binaryEntityMap12.name((int) (byte) 100);
        binaryEntityMap12.add("hi!", (-1));
        java.lang.String str23 = binaryEntityMap12.name(0);
        java.lang.String str25 = binaryEntityMap12.name(10);
        java.lang.String str27 = binaryEntityMap12.name((int) 'a');
        binaryEntityMap12.add("", 0);
        java.lang.String[] strArray31 = binaryEntityMap12.names;
        binaryEntityMap1.names = strArray31;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("", (int) (short) 10);
        java.lang.String str7 = entities0.escape("hi!");
        java.lang.String str9 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        java.lang.String str12 = entities0.escape("hi!");
        java.io.Writer writer13 = null;
        entities0.escape(writer13, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(entityMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 52 });
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str15 = binaryEntityMap13.name(100);
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
        binaryEntityMap13.names = strArray32;
        entities0.map = binaryEntityMap13;
        java.lang.String str38 = binaryEntityMap13.name((int) (short) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0 });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = (byte) -1;
        arrayEntityMap1.add("hi!", (int) (byte) 1);
        int int12 = arrayEntityMap1.growBy;
        int[] intArray13 = arrayEntityMap1.values;
        java.lang.Class<?> wildcardClass14 = arrayEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        treeEntityMap0.add("hi!", (int) (byte) 10);
        int int26 = treeEntityMap0.value("hi!");
        java.lang.Class<?> wildcardClass27 = treeEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("");
        java.lang.String str4 = lookupEntityMap0.name(1);
        int int6 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", (int) '#');
        java.lang.String str11 = lookupEntityMap0.name(0);
        java.lang.String str13 = lookupEntityMap0.name((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        java.lang.String str57 = entities0.entityName((int) (byte) 10);
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
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        java.lang.String str36 = entities0.unescape("");
        java.io.Writer writer37 = null;
        entities0.escape(writer37, "");
        org.apache.commons.lang.Entities.EntityMap entityMap40 = entities0.map;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(entityMap40);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int7 = binaryEntityMap1.value("");
        binaryEntityMap1.add("hi!", (int) '#');
        binaryEntityMap1.ensureCapacity((int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.escape("hi!");
        int int16 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
// flaky "10) test1885(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray8, new int[] { 10, 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.lang.String str4 = hashEntityMap0.name((int) '4');
        java.lang.String str6 = hashEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = hashEntityMap0.name(100);
        java.lang.String str10 = hashEntityMap0.name(2);
        java.util.Map map11 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.ensureCapacity((int) (byte) 1);
        binaryEntityMap1.add("hi!", (int) (byte) 0);
        java.lang.String[] strArray9 = binaryEntityMap1.names;
        int int10 = binaryEntityMap1.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        int[] intArray13 = new int[] {};
        arrayEntityMap12.values = intArray13;
        binaryEntityMap1.values = intArray13;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap17.ensureCapacity((-1));
        binaryEntityMap17.growBy = 10;
        java.lang.String str23 = binaryEntityMap17.name((int) (byte) -1);
        java.lang.String[] strArray24 = binaryEntityMap17.names;
        int[] intArray25 = binaryEntityMap17.values;
        java.lang.String[] strArray26 = binaryEntityMap17.names;
        binaryEntityMap1.names = strArray26;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] {});
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        java.lang.String str3 = arrayEntityMap1.name(10);
        java.lang.Class<?> wildcardClass4 = arrayEntityMap1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.Class<?> wildcardClass7 = entities0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("");
        entities0.addEntity("", (int) (short) 10);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str9 = entities0.unescape("");
        int int11 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(entityMap12);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        binaryEntityMap1.ensureCapacity((int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
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
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        arrayEntityMap1.ensureCapacity((int) (byte) 1);
        arrayEntityMap1.size = 2;
        java.lang.String[] strArray11 = arrayEntityMap1.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap13 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap13.add("hi!", 0);
        arrayEntityMap13.size = (byte) 1;
        arrayEntityMap13.growBy = (byte) -1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap22.growBy = (-1);
        int[] intArray25 = arrayEntityMap22.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap27 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap27.add("hi!", 0);
        arrayEntityMap27.size = (byte) 1;
        arrayEntityMap27.growBy = 100;
        java.lang.String[] strArray35 = arrayEntityMap27.names;
        arrayEntityMap22.names = strArray35;
        arrayEntityMap13.names = strArray35;
        arrayEntityMap1.names = strArray35;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int2 = arrayEntityMap1.size;
        int int3 = arrayEntityMap1.growBy;
        java.lang.String str5 = arrayEntityMap1.name((int) (short) 100);
        int int6 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap8.ensureCapacity((-1));
        binaryEntityMap8.growBy = 10;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int16 = arrayEntityMap14.value("");
        arrayEntityMap14.size = (byte) 100;
        arrayEntityMap14.size = 100;
        arrayEntityMap14.ensureCapacity((int) (short) 1);
        int[] intArray23 = arrayEntityMap14.values;
        binaryEntityMap8.values = intArray23;
        binaryEntityMap8.add("", (int) (short) 10);
        int[] intArray28 = binaryEntityMap8.values;
        arrayEntityMap1.values = intArray28;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 10 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 10 });
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
            hashEntityMap0.add("", (int) ' ');
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
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        java.lang.String str78 = hashEntityMap0.name(35);
        // The following exception was thrown during execution in test generation
        try {
            int int80 = hashEntityMap0.value("hi!");
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
        org.junit.Assert.assertNull(str78);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str6 = binaryEntityMap4.name((-1));
        entities0.map = binaryEntityMap4;
        entities0.addEntity("", 2);
        java.lang.String str12 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(entityMap13);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 100);
        int int2 = binaryEntityMap1.growBy;
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.add("", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(32);
        java.lang.String str12 = lookupEntityMap0.name(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        arrayEntityMap1.add("hi!", 0);
        java.lang.String[] strArray22 = arrayEntityMap1.names;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 52 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        java.util.Map map2 = hashEntityMap0.mapNameToValue;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = null;
        hashEntityMap7.mapNameToValue = map8;
        java.lang.String str11 = hashEntityMap7.name((int) '4');
        java.lang.String str13 = hashEntityMap7.name((int) (short) 100);
        java.util.Map map14 = hashEntityMap7.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = null;
        hashEntityMap15.mapNameToValue = map16;
        java.util.Map map18 = null;
        hashEntityMap15.mapNameToValue = map18;
        java.util.Map map20 = null;
        hashEntityMap15.mapNameToValue = map20;
        java.util.Map map22 = hashEntityMap15.mapValueToName;
        hashEntityMap7.mapNameToValue = map22;
        hashEntityMap0.mapNameToValue = map22;
        hashEntityMap0.add("", (int) '#');
        java.lang.String str29 = hashEntityMap0.name(2);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name((int) (byte) 1);
        binaryEntityMap1.size = (short) 0;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        java.lang.String str44 = entities0.escape("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", 35);
        java.lang.String str16 = lookupEntityMap0.name(100);
        lookupEntityMap0.add("hi!", (int) (short) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = 100;
        int int9 = arrayEntityMap1.growBy;
        arrayEntityMap1.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray15 = arrayEntityMap14.values;
        java.lang.String str17 = arrayEntityMap14.name((int) (short) 100);
        int[] intArray20 = new int[] { (short) -1, 10 };
        arrayEntityMap14.values = intArray20;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        arrayEntityMap14.names = strArray23;
        int[] intArray25 = arrayEntityMap14.values;
        java.lang.String str27 = arrayEntityMap14.name(0);
        java.lang.String[] strArray28 = arrayEntityMap14.names;
        arrayEntityMap1.names = strArray28;
        java.lang.String str31 = arrayEntityMap1.name((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2 out of bounds for object array[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 10 });
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        java.lang.String str31 = lookupEntityMap14.name((int) ' ');
        java.lang.String str33 = lookupEntityMap14.name(2);
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap52 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray53 = arrayEntityMap52.values;
        java.lang.String str55 = arrayEntityMap52.name((int) (short) 100);
        int int57 = arrayEntityMap52.value("hi!");
        int int58 = arrayEntityMap52.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap60 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray63 = new int[] { ' ', '4' };
        binaryEntityMap60.values = intArray63;
        arrayEntityMap52.values = intArray63;
        int int66 = arrayEntityMap52.growBy;
        int[] intArray67 = arrayEntityMap52.values;
        binaryEntityMap1.values = intArray67;
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
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 0 });
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 32, 52 });
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.io.Writer writer2 = null;
        entities0.escape(writer2, "");
        java.io.Writer writer5 = null;
        entities0.escape(writer5, "");
        java.lang.String str9 = entities0.entityName((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = null;
        hashEntityMap10.mapNameToValue = map11;
        java.util.Map map13 = hashEntityMap10.mapNameToValue;
        java.lang.String str15 = hashEntityMap10.name((-1));
        java.util.Map map16 = hashEntityMap10.mapNameToValue;
        entities0.map = hashEntityMap10;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(map16);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = 1;
        int int5 = arrayEntityMap1.value("");
        arrayEntityMap1.growBy = 0;
        int int8 = arrayEntityMap1.size;
        arrayEntityMap1.size = (byte) 100;
        int int11 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int6 = binaryEntityMap1.growBy;
        int int8 = binaryEntityMap1.value("hi!");
        java.lang.String str10 = binaryEntityMap1.name(32);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        int int9 = arrayEntityMap1.value("");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.ensureCapacity(0);
        binaryEntityMap1.ensureCapacity(100);
        binaryEntityMap1.add("", (int) (byte) 1);
        int[] intArray12 = new int[] { 1, (short) 1, ' ' };
        binaryEntityMap1.values = intArray12;
        binaryEntityMap1.add("", 0);
        binaryEntityMap1.add("", (int) (short) -1);
        binaryEntityMap1.ensureCapacity((int) '4');
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1), 0, 1 });
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.entityName((int) '#');
        java.lang.String str13 = entities0.unescape("hi!");
        java.lang.String str15 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 0);
        int int6 = lookupEntityMap0.value("hi!");
        int int8 = lookupEntityMap0.value("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = lookupEntityMap0.name((int) (short) -1);
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
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        java.util.Map map38 = null;
        hashEntityMap37.mapNameToValue = map38;
        java.lang.String str41 = hashEntityMap37.name((int) '4');
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
        hashEntityMap37.mapNameToValue = map56;
        java.util.Map map59 = hashEntityMap37.mapValueToName;
        hashEntityMap0.mapValueToName = map59;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map62 = null;
        hashEntityMap61.mapNameToValue = map62;
        java.util.Map map64 = null;
        hashEntityMap61.mapNameToValue = map64;
        java.util.Map map66 = null;
        hashEntityMap61.mapNameToValue = map66;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap68 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map69 = null;
        hashEntityMap68.mapNameToValue = map69;
        java.util.Map map71 = null;
        hashEntityMap68.mapNameToValue = map71;
        java.util.Map map73 = null;
        hashEntityMap68.mapNameToValue = map73;
        java.util.Map map75 = hashEntityMap68.mapValueToName;
        hashEntityMap61.mapNameToValue = map75;
        java.util.Map map77 = hashEntityMap61.mapValueToName;
        java.util.Map map78 = hashEntityMap61.mapValueToName;
        hashEntityMap0.mapNameToValue = map78;
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) 'a');
        int int4 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 10);
        int int9 = lookupEntityMap0.value("hi!");
        int int11 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (-1));
        lookupEntityMap0.add("", 1);
        lookupEntityMap0.add("", 2);
        java.lang.String str19 = lookupEntityMap0.name(10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        java.lang.String str12 = entities0.escape("hi!");
        java.lang.String str14 = entities0.unescape("");
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
// flaky "11) test1920(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray8, new int[] { 160, 10 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        arrayEntityMap1.ensureCapacity(10);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap52 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray55 = new int[] { ' ', '4' };
        binaryEntityMap52.values = intArray55;
        int int58 = binaryEntityMap52.value("");
        int int60 = binaryEntityMap52.value("");
        binaryEntityMap52.add("hi!", 35);
        int int64 = binaryEntityMap52.size;
        binaryEntityMap52.add("hi!", 2);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap69 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int71 = binaryEntityMap69.value("hi!");
        int int72 = binaryEntityMap69.growBy;
        java.lang.String[] strArray73 = binaryEntityMap69.names;
        binaryEntityMap52.names = strArray73;
        binaryEntityMap1.names = strArray73;
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
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 2, 35 });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 32 + "'", int72 == 32);
        org.junit.Assert.assertNotNull(strArray73);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        java.util.Map map32 = null;
        hashEntityMap31.mapNameToValue = map32;
        java.util.Map map34 = null;
        hashEntityMap31.mapNameToValue = map34;
        java.util.Map map36 = null;
        hashEntityMap31.mapNameToValue = map36;
        java.util.Map map38 = hashEntityMap31.mapValueToName;
        java.util.Map map39 = hashEntityMap31.mapNameToValue;
        java.util.Map map40 = hashEntityMap31.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int43 = hashEntityMap41.value("");
        java.util.Map map44 = hashEntityMap41.mapValueToName;
        hashEntityMap31.mapValueToName = map44;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = null;
        hashEntityMap46.mapNameToValue = map47;
        java.util.Map map49 = null;
        hashEntityMap46.mapNameToValue = map49;
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
        java.util.Map map70 = hashEntityMap51.mapValueToName;
        hashEntityMap46.mapValueToName = map70;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map73 = null;
        hashEntityMap72.mapNameToValue = map73;
        java.lang.String str76 = hashEntityMap72.name((int) '4');
        java.util.Map map77 = hashEntityMap72.mapValueToName;
        hashEntityMap46.mapValueToName = map77;
        hashEntityMap31.mapNameToValue = map77;
        int int81 = hashEntityMap31.value("hi!");
        java.util.Map map82 = hashEntityMap31.mapNameToValue;
        hashEntityMap0.mapNameToValue = map82;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int9 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        int int6 = binaryEntityMap1.growBy;
        int int8 = binaryEntityMap1.value("hi!");
        int int10 = binaryEntityMap1.value("hi!");
        int[] intArray11 = binaryEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 52 });
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        int int13 = lookupEntityMap0.value("hi!");
        java.lang.String str15 = lookupEntityMap0.name(35);
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        java.lang.String str20 = lookupEntityMap0.name((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) 'a');
        int int4 = lookupEntityMap0.value("hi!");
        int int6 = lookupEntityMap0.value("hi!");
        int int8 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (byte) 100);
        java.lang.String str13 = lookupEntityMap0.name((int) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("hi!", (int) (short) 0);
        int[] intArray7 = binaryEntityMap1.values;
        int int9 = binaryEntityMap1.value("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        entities0.map = binaryEntityMap20;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(intArray23);
// flaky "12) test1929(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray23, new int[] { 160, 52 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 0 });
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray35);
// flaky "2) test1929(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "nbsp" });
        org.junit.Assert.assertNotNull(strArray38);
// flaky "1) test1929(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "nbsp" });
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
            arrayEntityMap1.add("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for object array[1]");
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
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("", 32);
        lookupEntityMap0.add("hi!", 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int2 = arrayEntityMap1.size;
        int int3 = arrayEntityMap1.growBy;
        int int4 = arrayEntityMap1.size;
        int int5 = arrayEntityMap1.growBy;
        arrayEntityMap1.add("hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str15 = lookupEntityMap0.name((int) (byte) 100);
        int int17 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.growBy = 10;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) -1);
        java.lang.String[] strArray8 = binaryEntityMap1.names;
        int[] intArray9 = binaryEntityMap1.values;
        binaryEntityMap1.add("", 32);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        java.lang.String[][] strArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntities(strArray19);
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
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        java.util.Map map47 = null;
        hashEntityMap46.mapNameToValue = map47;
        java.lang.String str50 = hashEntityMap46.name((int) '4');
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
        hashEntityMap46.mapValueToName = map72;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap76 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map77 = null;
        hashEntityMap76.mapNameToValue = map77;
        java.util.Map map79 = null;
        hashEntityMap76.mapNameToValue = map79;
        java.util.Map map81 = null;
        hashEntityMap76.mapNameToValue = map81;
        java.util.Map map83 = hashEntityMap76.mapValueToName;
        java.util.Map map84 = hashEntityMap76.mapNameToValue;
        java.util.Map map85 = hashEntityMap76.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap86 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int88 = hashEntityMap86.value("");
        java.util.Map map89 = hashEntityMap86.mapValueToName;
        hashEntityMap76.mapValueToName = map89;
        hashEntityMap46.mapNameToValue = map89;
        hashEntityMap0.mapValueToName = map89;
        hashEntityMap0.add("", 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        arrayEntityMap1.growBy = (short) 10;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.size = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray13 = new int[] { ' ', '4' };
        binaryEntityMap10.values = intArray13;
        arrayEntityMap1.values = intArray13;
        int int17 = arrayEntityMap1.value("hi!");
        java.lang.String[] strArray18 = arrayEntityMap1.names;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 10);
        binaryEntityMap1.ensureCapacity((-1));
        int[] intArray4 = binaryEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap1.growBy = (-1);
        java.lang.String str5 = arrayEntityMap1.name((int) (byte) 0);
        java.lang.String[] strArray6 = arrayEntityMap1.names;
        java.lang.String[] strArray7 = null;
        arrayEntityMap1.names = strArray7;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { null });
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        binaryEntityMap1.growBy = (byte) -1;
        binaryEntityMap1.growBy = 'a';
        binaryEntityMap1.add("hi!", 35);
        java.lang.String str14 = binaryEntityMap1.name((int) (short) 1);
        binaryEntityMap1.size = (byte) 100;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52 });
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        java.lang.String str44 = binaryEntityMap1.name((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[33]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        java.lang.String str22 = arrayEntityMap1.name(1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap24 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int26 = arrayEntityMap24.value("");
        arrayEntityMap24.growBy = 'a';
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap30.ensureCapacity((-1));
        binaryEntityMap30.growBy = 10;
        java.lang.String str36 = binaryEntityMap30.name((int) (byte) -1);
        java.lang.String[] strArray37 = binaryEntityMap30.names;
        arrayEntityMap24.names = strArray37;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap40 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray41 = arrayEntityMap40.values;
        java.lang.String str43 = arrayEntityMap40.name((int) (short) 100);
        int int45 = arrayEntityMap40.value("hi!");
        int int46 = arrayEntityMap40.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap48 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray51 = new int[] { ' ', '4' };
        binaryEntityMap48.values = intArray51;
        arrayEntityMap40.values = intArray51;
        int int54 = arrayEntityMap40.growBy;
        int[] intArray55 = arrayEntityMap40.values;
        arrayEntityMap24.values = intArray55;
        arrayEntityMap1.values = intArray55;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 0 });
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 32, 52 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 32, 52 });
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        java.lang.String str21 = lookupEntityMap0.name((int) (short) 0);
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
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        binaryEntityMap1.size = (short) -1;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 0 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(1);
        java.lang.String str3 = binaryEntityMap1.name((int) (short) 100);
        java.lang.String str5 = binaryEntityMap1.name((int) (byte) 0);
        binaryEntityMap1.ensureCapacity((-1));
        int[] intArray8 = binaryEntityMap1.values;
        int int9 = binaryEntityMap1.size;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 34, 10 });
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String str12 = binaryEntityMap1.name(0);
        java.lang.String str14 = binaryEntityMap1.name(10);
        int int15 = binaryEntityMap1.size;
        binaryEntityMap1.size = 35;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 35 out of bounds for object array[32]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        java.io.Writer writer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer20, "hi!");
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
        org.junit.Assert.assertNotNull(entityMap19);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap1.add("hi!", 0);
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.growBy = (byte) -1;
        arrayEntityMap1.add("hi!", (int) (byte) 1);
        arrayEntityMap1.ensureCapacity((-1));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (byte) -1);
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        java.lang.String[] strArray9 = binaryEntityMap1.names;
        binaryEntityMap1.growBy = 1;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.lang.String str2 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray7 = new int[] { ' ', '4' };
        binaryEntityMap4.values = intArray7;
        java.lang.String str10 = binaryEntityMap4.name((int) (byte) 100);
        binaryEntityMap4.add("hi!", (-1));
        java.lang.String str15 = binaryEntityMap4.name(0);
        entities0.map = binaryEntityMap4;
        java.io.Writer writer17 = null;
        entities0.escape(writer17, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.growBy = (byte) 0;
        int int7 = binaryEntityMap1.value("");
        java.lang.String str9 = binaryEntityMap1.name((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.add("", 0);
        java.lang.String str8 = binaryEntityMap1.name((int) '#');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray13 = new int[] { ' ', '4' };
        binaryEntityMap10.values = intArray13;
        binaryEntityMap1.values = intArray13;
        binaryEntityMap1.add("hi!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 100 });
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String str3 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.ensureCapacity((int) (byte) -1);
        binaryEntityMap1.ensureCapacity((int) (byte) 0);
        int[] intArray8 = binaryEntityMap1.values;
        int int10 = binaryEntityMap1.value("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
            entities0.unescape(writer69, "");
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
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        binaryEntityMap1.size = 0;
        java.lang.String[] strArray9 = null;
        binaryEntityMap1.names = strArray9;
        int[] intArray11 = binaryEntityMap1.values;
        java.lang.Class<?> wildcardClass12 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.add("hi!", (-1));
        java.lang.String[] strArray5 = binaryEntityMap1.names;
        java.lang.String str7 = binaryEntityMap1.name(32);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        java.io.Writer writer24 = null;
        entities0.escape(writer24, "");
        java.lang.String str28 = entities0.unescape("hi!");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str14 = entities0.entityName((int) (byte) 10);
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        int int2 = arrayEntityMap1.growBy;
        java.lang.String[] strArray3 = arrayEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap2 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap4.add("hi!", 0);
        arrayEntityMap4.size = (byte) 1;
        arrayEntityMap4.growBy = 100;
        java.lang.String str13 = arrayEntityMap4.name((int) (byte) 1);
        entities0.map = arrayEntityMap4;
        int int16 = arrayEntityMap4.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.escape("hi!");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.entityName((int) (short) 0);
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        int int13 = entities0.entityValue("hi!");
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        java.lang.String str10 = lookupEntityMap0.name((int) (short) 100);
        lookupEntityMap0.add("hi!", 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.io.Writer writer2 = null;
        entities0.escape(writer2, "");
        java.lang.String str6 = entities0.escape("hi!");
        int int8 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("");
        java.lang.String str5 = entities0.escape("");
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = null;
        hashEntityMap48.mapNameToValue = map49;
        java.lang.String str52 = hashEntityMap48.name((int) '4');
        java.lang.String str54 = hashEntityMap48.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = null;
        hashEntityMap55.mapNameToValue = map56;
        java.util.Map map58 = null;
        hashEntityMap55.mapNameToValue = map58;
        java.util.Map map60 = null;
        hashEntityMap55.mapNameToValue = map60;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map63 = null;
        hashEntityMap62.mapNameToValue = map63;
        java.util.Map map65 = null;
        hashEntityMap62.mapNameToValue = map65;
        java.util.Map map67 = null;
        hashEntityMap62.mapNameToValue = map67;
        java.util.Map map69 = hashEntityMap62.mapValueToName;
        hashEntityMap55.mapNameToValue = map69;
        hashEntityMap48.mapValueToName = map69;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map73 = null;
        hashEntityMap72.mapNameToValue = map73;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap76 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map77 = null;
        hashEntityMap76.mapNameToValue = map77;
        java.lang.String str80 = hashEntityMap76.name((int) '4');
        java.util.Map map81 = hashEntityMap76.mapValueToName;
        hashEntityMap75.mapValueToName = map81;
        hashEntityMap72.mapValueToName = map81;
        hashEntityMap48.mapNameToValue = map81;
        hashEntityMap48.add("hi!", (int) (short) 1);
        java.util.Map map88 = hashEntityMap48.mapNameToValue;
        treeEntityMap0.mapValueToName = map88;
        java.lang.String str91 = treeEntityMap0.name((int) (byte) 1);
        treeEntityMap0.add("hi!", 1);
        treeEntityMap0.add("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNull(str91);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap29 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray30 = arrayEntityMap29.values;
        int int31 = arrayEntityMap29.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap33 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap33.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap37 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray40 = new int[] { ' ', '4' };
        binaryEntityMap37.values = intArray40;
        arrayEntityMap33.values = intArray40;
        arrayEntityMap29.values = intArray40;
        arrayEntityMap29.add("hi!", (int) (byte) 0);
        arrayEntityMap29.growBy = 100;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap50 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
        arrayEntityMap50.add("hi!", 0);
        arrayEntityMap50.size = (byte) 1;
        int[] intArray56 = new int[] {};
        arrayEntityMap50.values = intArray56;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap59 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int61 = arrayEntityMap59.value("");
        java.lang.String[] strArray62 = arrayEntityMap59.names;
        arrayEntityMap50.names = strArray62;
        arrayEntityMap29.names = strArray62;
        java.lang.String[] strArray65 = arrayEntityMap29.names;
        binaryEntityMap1.names = strArray65;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0 });
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 0, 52 });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] {});
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { null });
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.ensureCapacity((-1));
        binaryEntityMap1.ensureCapacity((int) (byte) 10);
        binaryEntityMap1.add("hi!", (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        arrayEntityMap1.ensureCapacity((int) (byte) 1);
        arrayEntityMap1.size = 2;
        int[] intArray11 = arrayEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        entities0.addEntity("", 1);
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
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '4');
        java.lang.String[] strArray2 = binaryEntityMap1.names;
        java.lang.String str4 = binaryEntityMap1.name((int) (short) 100);
        binaryEntityMap1.add("", 52);
        binaryEntityMap1.add("", (int) (byte) 100);
        binaryEntityMap1.add("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        binaryEntityMap1.add("", (int) 'a');
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) 10);
        binaryEntityMap1.add("", 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.lang.Entities entities0 = new org.apache.commons.lang.Entities();
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        java.lang.String str7 = entities0.unescape("");
        java.lang.String str9 = entities0.entityName((int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        int int18 = arrayEntityMap4.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entityMap2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(0);
        int int6 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 10);
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        int int13 = lookupEntityMap0.value("");
        java.lang.String str15 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("hi!", (int) (short) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str6 = lookupEntityMap0.name(100);
        int int8 = lookupEntityMap0.value("hi!");
        java.lang.String str10 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str12 = lookupEntityMap0.name(35);
        int int14 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", (int) (byte) 100);
        java.lang.String str19 = lookupEntityMap0.name(32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        binaryEntityMap1.add("", 35);
        int[] intArray8 = binaryEntityMap1.values;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("hi!", (int) (byte) 0);
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
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        java.lang.String[] strArray11 = arrayEntityMap2.names;
        int int12 = arrayEntityMap2.growBy;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
        int[] intArray36 = binaryEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 52 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1), 52 });
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.add("hi!", 32);
        int int7 = binaryEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        java.lang.Class<?> wildcardClass35 = entities0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = arrayEntityMap2.value("hi!");
        arrayEntityMap2.add("", (-1));
        arrayEntityMap2.growBy = (byte) 1;
        java.lang.String str19 = arrayEntityMap2.name(0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        java.util.Map map81 = hashEntityMap4.mapValueToName;
        java.lang.String str83 = hashEntityMap4.name((int) (short) 1);
        int int85 = hashEntityMap4.value("hi!");
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
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
        java.lang.String str65 = binaryEntityMap1.name(32);
        binaryEntityMap1.add("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 1 });
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
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        java.lang.String str3 = arrayEntityMap1.name((int) (byte) 0);
        arrayEntityMap1.size = (short) 100;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap2 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray3 = arrayEntityMap2.values;
        java.lang.String str5 = arrayEntityMap2.name((int) (short) 100);
        int[] intArray8 = new int[] { (short) -1, 10 };
        arrayEntityMap2.values = intArray8;
        entities0.map = arrayEntityMap2;
        int int12 = arrayEntityMap2.value("hi!");
        arrayEntityMap2.add("", (-1));
        arrayEntityMap2.growBy = (byte) 1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray22 = new int[] { ' ', '4' };
        binaryEntityMap19.values = intArray22;
        java.lang.String str25 = binaryEntityMap19.name((int) (byte) 100);
        binaryEntityMap19.add("hi!", (-1));
        java.lang.String[] strArray29 = binaryEntityMap19.names;
        java.lang.String str31 = binaryEntityMap19.name((int) (byte) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap33 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        arrayEntityMap33.growBy = 0;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray38 = arrayEntityMap37.values;
        int int39 = arrayEntityMap37.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap41 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        arrayEntityMap41.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap45 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray48 = new int[] { ' ', '4' };
        binaryEntityMap45.values = intArray48;
        arrayEntityMap41.values = intArray48;
        arrayEntityMap37.values = intArray48;
        java.lang.String str53 = arrayEntityMap37.name(1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap55 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap55.ensureCapacity((-1));
        binaryEntityMap55.growBy = 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap61 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str63 = binaryEntityMap61.name((-1));
        int[] intArray64 = binaryEntityMap61.values;
        binaryEntityMap55.values = intArray64;
        arrayEntityMap37.values = intArray64;
        arrayEntityMap33.values = intArray64;
        binaryEntityMap19.values = intArray64;
        binaryEntityMap19.add("", 1);
        java.lang.String[] strArray72 = binaryEntityMap19.names;
        arrayEntityMap2.names = strArray72;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray8);
// flaky "13) test1991(org.apache.commons.lang.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 160 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 52 });
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 32, 52 });
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertNotNull(strArray72);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = null;
        hashEntityMap0.mapNameToValue = map1;
        java.util.Map map3 = null;
        hashEntityMap0.mapNameToValue = map3;
        java.util.Map map5 = null;
        hashEntityMap0.mapNameToValue = map5;
        java.lang.String str8 = hashEntityMap0.name(100);
        java.lang.Class<?> wildcardClass9 = hashEntityMap0.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        java.util.Map map2 = hashEntityMap0.mapNameToValue;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        java.lang.String str8 = hashEntityMap0.name((int) (byte) -1);
        hashEntityMap0.add("hi!", (int) (short) 10);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) '#');
        java.lang.String str4 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str7 = entities0.unescape("hi!");
        java.lang.String str9 = entities0.entityName((int) 'a');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int[] intArray4 = new int[] { ' ', '4' };
        binaryEntityMap1.values = intArray4;
        java.lang.String str7 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("", (int) (byte) 0);
        int int12 = binaryEntityMap1.value("");
        int int14 = binaryEntityMap1.value("");
        java.lang.String str16 = binaryEntityMap1.name((int) 'a');
        binaryEntityMap1.add("hi!", 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 100 });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int[] intArray2 = arrayEntityMap1.values;
        java.lang.String str4 = arrayEntityMap1.name((int) (short) 100);
        arrayEntityMap1.size = (byte) 0;
        int int7 = arrayEntityMap1.size;
        int int9 = arrayEntityMap1.value("");
        int[] intArray10 = arrayEntityMap1.values;
        java.lang.String[] strArray11 = arrayEntityMap1.names;
        arrayEntityMap1.size = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.ensureCapacity((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { null });
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.size;
        binaryEntityMap0.ensureCapacity(2);
        binaryEntityMap0.add("", (int) (byte) -1);
        java.lang.String str8 = binaryEntityMap0.name((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        treeEntityMap0.add("hi!", (int) (byte) 100);
        java.util.Map map24 = treeEntityMap0.mapValueToName;
        java.lang.String str26 = treeEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
        int int21 = hashEntityMap0.value("");
        java.lang.Class<?> wildcardClass22 = hashEntityMap0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (short) 1);
        int int5 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", (int) (short) 0);
        java.lang.String str10 = lookupEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
    }
}
