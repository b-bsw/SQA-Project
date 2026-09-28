package org.apache.commons.collections;

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
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        boolean boolean2 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str3 = propertiesTokenizer1.nextToken();
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        java.lang.Object obj5 = propertiesTokenizer1.nextElement();
        boolean boolean6 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        boolean boolean2 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str3 = propertiesTokenizer1.nextToken();
        java.lang.String str5 = propertiesTokenizer1.nextToken("/");
        java.lang.Object obj6 = propertiesTokenizer1.nextElement();
        int int7 = propertiesTokenizer1.countTokens();
        java.lang.Object obj8 = propertiesTokenizer1.nextElement();
        java.lang.Object obj9 = propertiesTokenizer1.nextElement();
        int int10 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        java.lang.String str5 = extendedProperties0.interpolate("");
        extendedProperties0.setInclude(",");
        java.util.ArrayList arrayList8 = extendedProperties0.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties11 = null;
        java.util.Properties properties12 = extendedProperties9.getProperties("", properties11);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties12);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list17 = null;
        java.lang.String str18 = extendedProperties15.interpolateHelper("hi!", list17);
        java.lang.String str20 = extendedProperties15.interpolate("");
        java.lang.Object obj21 = extendedProperties14.remove((java.lang.Object) str20);
        java.lang.Byte byte24 = extendedProperties14.getByte(",", (java.lang.Byte) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties26.file = "hi!";
        java.util.Iterator iterator30 = extendedProperties26.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.file = "hi!";
        java.util.Iterator iterator35 = extendedProperties31.getKeys("");
        extendedProperties26.putAll((java.util.Map) extendedProperties31);
        java.lang.String str39 = extendedProperties31.getString(",", ",");
        java.lang.String[] strArray41 = extendedProperties31.getStringArray(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties43.file = "hi!";
        java.util.Iterator iterator47 = extendedProperties43.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties48.file = "hi!";
        java.util.Iterator iterator52 = extendedProperties48.getKeys("");
        extendedProperties43.putAll((java.util.Map) extendedProperties48);
        java.lang.String str56 = extendedProperties48.getString(",", ",");
        java.lang.String[] strArray58 = extendedProperties48.getStringArray(",");
        short short61 = extendedProperties48.getShort("${", (short) (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties63 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties63.file = "hi!";
        java.util.Iterator iterator67 = extendedProperties63.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties68 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties68.file = "hi!";
        java.util.Iterator iterator72 = extendedProperties68.getKeys("");
        extendedProperties63.putAll((java.util.Map) extendedProperties68);
        java.util.ArrayList arrayList74 = extendedProperties68.keysAsListed;
        java.lang.String str75 = extendedProperties48.interpolateHelper("/", (java.util.List) arrayList74);
        java.lang.String str76 = extendedProperties31.interpolateHelper(",", (java.util.List) arrayList74);
        java.lang.String str77 = extendedProperties14.interpolateHelper("hi!", (java.util.List) arrayList74);
        extendedProperties14.basePath = "/";
        java.util.Iterator iterator80 = extendedProperties14.getKeys();
        java.lang.Object obj81 = extendedProperties0.put((java.lang.Object) extendedProperties13, (java.lang.Object) iterator80);
        java.util.Iterator iterator82 = extendedProperties0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            double double84 = extendedProperties0.getDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(extendedProperties13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 100 + "'", byte24 == (byte) 100);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "," + "'", str39, ",");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "," + "'", str56, ",");
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) -1 + "'", short61 == (short) -1);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertNotNull(arrayList74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "/" + "'", str75, "/");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "," + "'", str76, ",");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(iterator80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(iterator82);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list3 = null;
        java.lang.String str4 = extendedProperties1.interpolateHelper("hi!", list3);
        java.lang.String str6 = extendedProperties1.interpolate("");
        java.lang.Object obj7 = extendedProperties0.remove((java.lang.Object) str6);
        java.lang.Short short10 = extendedProperties0.getShort("/", (java.lang.Short) (short) 100);
        java.lang.String str13 = extendedProperties0.getString("/", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.file = "hi!";
        java.util.Iterator iterator18 = extendedProperties14.getKeys("/");
        java.util.Vector vector20 = null;
        java.util.Vector vector21 = extendedProperties14.getVector("hi!", vector20);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties23.file = "hi!";
        java.util.Iterator iterator27 = extendedProperties23.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties28.file = "hi!";
        java.util.Iterator iterator32 = extendedProperties28.getKeys("");
        extendedProperties23.putAll((java.util.Map) extendedProperties28);
        java.lang.String str36 = extendedProperties28.getString(",", ",");
        java.lang.String[] strArray38 = extendedProperties28.getStringArray(",");
        short short41 = extendedProperties28.getShort("${", (short) (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties43.file = "hi!";
        java.util.Iterator iterator47 = extendedProperties43.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties48.file = "hi!";
        java.util.Iterator iterator52 = extendedProperties48.getKeys("");
        extendedProperties43.putAll((java.util.Map) extendedProperties48);
        java.util.ArrayList arrayList54 = extendedProperties48.keysAsListed;
        java.lang.String str55 = extendedProperties28.interpolateHelper("/", (java.util.List) arrayList54);
        java.util.List list56 = extendedProperties14.getList("", (java.util.List) arrayList54);
        java.lang.Integer int59 = extendedProperties14.getInteger("/", (java.lang.Integer) 52);
        extendedProperties0.putAll((java.util.Map) extendedProperties14);
        extendedProperties14.clearProperty("");
        long long65 = extendedProperties14.getLong("hi!", (long) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties66 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties68 = null;
        java.util.Properties properties69 = extendedProperties66.getProperties("", properties68);
        java.lang.Object obj71 = extendedProperties66.getProperty("");
        extendedProperties66.clearProperty("hi!");
        java.lang.String str76 = extendedProperties66.getString("hi!", "}");
        org.apache.commons.collections.ExtendedProperties extendedProperties78 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties78.file = "hi!";
        java.util.Iterator iterator82 = extendedProperties78.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties83 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties83.file = "hi!";
        java.util.Iterator iterator87 = extendedProperties83.getKeys("");
        extendedProperties78.putAll((java.util.Map) extendedProperties83);
        java.lang.String str89 = extendedProperties78.fileSeparator;
        extendedProperties78.file = "";
        java.io.OutputStream outputStream92 = null;
        extendedProperties78.save(outputStream92, ",");
        java.util.Iterator iterator95 = extendedProperties78.getKeys();
        java.util.ArrayList arrayList96 = extendedProperties78.keysAsListed;
        java.util.List list97 = extendedProperties66.getList("", (java.util.List) arrayList96);
        extendedProperties14.keysAsListed = arrayList96;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "," + "'", str36, ",");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) -1 + "'", short41 == (short) -1);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertNotNull(arrayList54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "/" + "'", str55, "/");
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 52 + "'", int59 == 52);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(properties69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "}" + "'", str76, "}");
        org.junit.Assert.assertNotNull(iterator82);
        org.junit.Assert.assertNotNull(iterator87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "/" + "'", str89, "/");
        org.junit.Assert.assertNotNull(iterator95);
        org.junit.Assert.assertNotNull(arrayList96);
        org.junit.Assert.assertNotNull(list97);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader2 = java.io.Reader.nullReader();
        char[] charArray8 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int9 = reader2.read(charArray8);
        int int10 = propertiesReader1.read(charArray8);
        java.lang.String str11 = propertiesReader1.readProperty();
        int int12 = propertiesReader1.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader13 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        propertiesReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = propertiesReader1.skip((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(reader2);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.lang.String str2 = propertiesReader1.readProperty();
        propertiesReader1.close();
        java.util.stream.Stream<java.lang.String> strStream4 = propertiesReader1.lines();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = propertiesReader1.skip((long) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strStream4);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String[] strArray15 = extendedProperties5.getStringArray(",");
        java.io.Reader reader16 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader16);
        int int18 = propertiesReader17.read();
        int int19 = propertiesReader17.read();
        java.util.stream.Stream<java.lang.String> strStream20 = propertiesReader17.lines();
        java.lang.Object obj21 = extendedProperties5.remove((java.lang.Object) propertiesReader17);
        java.util.stream.Stream<java.lang.String> strStream22 = propertiesReader17.lines();
        int int23 = propertiesReader17.read();
        java.util.stream.Stream<java.lang.String> strStream24 = propertiesReader17.lines();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader17.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strStream20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strStream24);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        java.lang.String str5 = extendedProperties0.interpolate("");
        extendedProperties0.display();
        boolean boolean7 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list11 = null;
        java.lang.String str12 = extendedProperties9.interpolateHelper("hi!", list11);
        float float15 = extendedProperties9.getFloat("${", 0.0f);
        extendedProperties9.display();
        short short19 = extendedProperties9.getShort("${", (short) (byte) 0);
        java.lang.String str20 = extendedProperties9.fileSeparator;
        java.util.Vector vector22 = extendedProperties9.getVector(",");
        java.util.List list23 = extendedProperties0.getList("hi!", (java.util.List) vector22);
        double double26 = extendedProperties0.getDouble("${", (double) (-1));
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list31 = null;
        java.lang.String str32 = extendedProperties29.interpolateHelper("hi!", list31);
        java.lang.String str34 = extendedProperties29.interpolate("");
        java.lang.Object obj35 = extendedProperties28.remove((java.lang.Object) str34);
        java.lang.String str36 = extendedProperties28.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties38.file = "hi!";
        java.util.Iterator iterator42 = extendedProperties38.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties43.file = "hi!";
        java.util.Iterator iterator47 = extendedProperties43.getKeys("");
        extendedProperties38.putAll((java.util.Map) extendedProperties43);
        java.lang.Short short51 = extendedProperties43.getShort("", (java.lang.Short) (short) 10);
        extendedProperties43.fileSeparator = "}";
        java.util.Vector vector55 = extendedProperties43.getVector("${");
        java.util.Vector vector56 = extendedProperties28.getVector("/", vector55);
        java.lang.Integer int59 = extendedProperties28.getInteger("}", (java.lang.Integer) 97);
        java.lang.String str62 = extendedProperties28.getString("}", "hi!");
        java.lang.Long long65 = extendedProperties28.getLong(",", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties67 = extendedProperties28.subset("/");
        java.lang.Short short70 = extendedProperties28.getShort("${", (java.lang.Short) (short) 10);
        extendedProperties0.addProperty("}", (java.lang.Object) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
        org.junit.Assert.assertNotNull(vector22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(obj35);
// flaky "1) test3008(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "/" + "'", str36, "/");
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + short51 + "' != '" + (short) 10 + "'", short51 == (short) 10);
        org.junit.Assert.assertNotNull(vector55);
        org.junit.Assert.assertNotNull(vector56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNull(extendedProperties67);
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) 10 + "'", short70 == (short) 10);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties15.file = "hi!";
        java.util.Iterator iterator19 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.file = "hi!";
        java.util.Iterator iterator24 = extendedProperties20.getKeys("");
        extendedProperties15.putAll((java.util.Map) extendedProperties20);
        java.util.ArrayList arrayList26 = extendedProperties20.keysAsListed;
        java.lang.String str27 = extendedProperties5.interpolateHelper("/", (java.util.List) arrayList26);
        double double30 = extendedProperties5.getDouble(",", (double) (byte) 10);
        java.lang.String str32 = extendedProperties5.testBoolean("/");
        java.lang.String[] strArray34 = extendedProperties5.getStringArray("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = extendedProperties5.subset("${");
        java.lang.String str37 = extendedProperties5.fileSeparator;
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/" + "'", str27, "/");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertNull(extendedProperties36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/" + "'", str37, "/");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader2 = java.io.Reader.nullReader();
        char[] charArray8 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int9 = reader2.read(charArray8);
        int int10 = propertiesReader1.read(charArray8);
        java.lang.String str11 = propertiesReader1.readProperty();
        int int12 = propertiesReader1.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader13 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader14 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader13);
        java.io.Reader reader15 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader16 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader15);
        java.lang.String str17 = propertiesReader16.readProperty();
        propertiesReader16.mark((int) (byte) 100);
        java.util.stream.Stream<java.lang.String> strStream20 = propertiesReader16.lines();
        propertiesReader16.mark((int) (short) 100);
        char[] charArray27 = new char[] { 'a', '#', '4', '#' };
        int int28 = propertiesReader16.read(charArray27);
        int int29 = propertiesReader14.read(charArray27);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader30 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader14);
        int int31 = propertiesReader14.getLineNumber();
        java.lang.String str32 = propertiesReader14.readProperty();
        int int33 = propertiesReader14.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(reader2);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strStream20);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a', '#', '4', '#' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.lang.String str13 = extendedProperties0.getString(",");
        extendedProperties0.isInitialized = true;
        extendedProperties0.file = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties21 = null;
        java.util.Properties properties22 = extendedProperties19.getProperties("", properties21);
        java.lang.Short short25 = extendedProperties19.getShort("", (java.lang.Short) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties29 = null;
        java.util.Properties properties30 = extendedProperties27.getProperties("", properties29);
        java.lang.Short short33 = extendedProperties27.getShort("", (java.lang.Short) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties37 = null;
        java.util.Properties properties38 = extendedProperties35.getProperties("", properties37);
        java.util.Properties properties39 = extendedProperties27.getProperties("", properties37);
        java.util.Properties properties40 = extendedProperties19.getProperties(",", properties39);
        java.util.Properties properties41 = extendedProperties0.getProperties("}", properties39);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = extendedProperties0.getBoolean("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 100 + "'", short25 == (short) 100);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 100 + "'", short33 == (short) 100);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.read();
        long long4 = propertiesReader1.skip((long) (byte) 100);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        int int6 = propertiesReader5.read();
        boolean boolean7 = propertiesReader5.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.util.ArrayList arrayList11 = extendedProperties5.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Byte byte15 = extendedProperties12.getByte("", (java.lang.Byte) (byte) 10);
        java.lang.Boolean boolean18 = extendedProperties12.getBoolean(",", (java.lang.Boolean) false);
        java.lang.Object obj20 = extendedProperties5.put((java.lang.Object) boolean18, (java.lang.Object) "/");
        extendedProperties5.fileSeparator = "";
        extendedProperties5.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list27 = null;
        java.lang.String str28 = extendedProperties25.interpolateHelper("hi!", list27);
        java.lang.String str30 = extendedProperties25.interpolate("");
        java.lang.Object obj31 = extendedProperties24.remove((java.lang.Object) str30);
        java.lang.String str32 = extendedProperties24.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties34.file = "hi!";
        java.util.Iterator iterator38 = extendedProperties34.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties39.file = "hi!";
        java.util.Iterator iterator43 = extendedProperties39.getKeys("");
        extendedProperties34.putAll((java.util.Map) extendedProperties39);
        java.lang.String str45 = extendedProperties34.fileSeparator;
        extendedProperties34.file = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties49.file = "hi!";
        java.util.Iterator iterator53 = extendedProperties49.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties54.file = "hi!";
        java.util.Iterator iterator58 = extendedProperties54.getKeys("");
        extendedProperties49.putAll((java.util.Map) extendedProperties54);
        java.util.ArrayList arrayList60 = extendedProperties54.keysAsListed;
        java.util.List list61 = extendedProperties34.getList("", (java.util.List) arrayList60);
        java.lang.String str62 = extendedProperties24.interpolateHelper("", (java.util.List) arrayList60);
        java.lang.Object obj63 = extendedProperties5.remove((java.lang.Object) str62);
        java.lang.Long long66 = extendedProperties5.getLong("${", (java.lang.Long) 32L);
        org.apache.commons.collections.ExtendedProperties extendedProperties68 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list70 = null;
        java.lang.String str71 = extendedProperties68.interpolateHelper("hi!", list70);
        float float74 = extendedProperties68.getFloat("${", 0.0f);
        extendedProperties68.basePath = "";
        java.lang.Integer int79 = extendedProperties68.getInteger("", (java.lang.Integer) 100);
        byte byte82 = extendedProperties68.getByte("/", (byte) 0);
        double double85 = extendedProperties68.getDouble("hi!", (double) (short) -1);
        java.util.List list87 = null;
        java.lang.String str88 = extendedProperties68.interpolateHelper("${", list87);
        byte byte91 = extendedProperties68.getByte("/", (byte) 100);
        java.util.Vector vector93 = extendedProperties68.getVector("");
        java.util.List list94 = extendedProperties5.getList("", (java.util.List) vector93);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(obj31);
// flaky "2) test3013(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "/" + "'", str32, "/");
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "/" + "'", str45, "/");
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(arrayList60);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 32L + "'", long66 == 32L);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + 0.0f + "'", float74 == 0.0f);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) 0 + "'", byte82 == (byte) 0);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "${" + "'", str88, "${");
        org.junit.Assert.assertTrue("'" + byte91 + "' != '" + (byte) 100 + "'", byte91 == (byte) 100);
        org.junit.Assert.assertNotNull(vector93);
        org.junit.Assert.assertNotNull(list94);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        long long5 = extendedProperties0.getLong("}", (long) (byte) -1);
        double double8 = extendedProperties0.getDouble("/", (double) 97);
        boolean boolean9 = extendedProperties0.isInitialized;
        java.util.Properties properties11 = extendedProperties0.getProperties("hi!");
        java.util.Iterator iterator12 = extendedProperties0.getKeys();
        byte byte15 = extendedProperties0.getByte("", (byte) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = extendedProperties0.getProperties("", properties2);
        java.lang.Short short6 = extendedProperties0.getShort("", (java.lang.Short) (short) 100);
        java.io.OutputStream outputStream7 = null;
        extendedProperties0.save(outputStream7, "/");
        int int12 = extendedProperties0.getInt("", 0);
        long long15 = extendedProperties0.getLong(",", (long) (short) -1);
        extendedProperties0.file = "${";
        // The following exception was thrown during execution in test generation
        try {
            int int19 = extendedProperties0.getInteger(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.lang.String str2 = propertiesReader1.readProperty();
        int int3 = propertiesReader1.getLineNumber();
        java.lang.String str4 = propertiesReader1.readProperty();
        propertiesReader1.setLineNumber(10);
        propertiesReader1.mark((int) (short) 10);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        float float6 = extendedProperties0.getFloat("${", 0.0f);
        float float9 = extendedProperties0.getFloat("/", (float) (byte) -1);
        short short12 = extendedProperties0.getShort(",", (short) 10);
        java.lang.String str14 = extendedProperties0.interpolate("${");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "${" + "'", str14, "${");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = extendedProperties0.getProperties("", properties2);
        extendedProperties0.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties7.file = "hi!";
        java.util.Iterator iterator11 = extendedProperties7.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.file = "hi!";
        java.util.Iterator iterator16 = extendedProperties12.getKeys("");
        extendedProperties7.putAll((java.util.Map) extendedProperties12);
        java.lang.String str19 = extendedProperties12.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties23 = null;
        java.util.Properties properties24 = extendedProperties21.getProperties("", properties23);
        java.lang.Object obj26 = extendedProperties21.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties28.file = "hi!";
        java.util.Iterator iterator32 = extendedProperties28.getKeys("/");
        java.util.Vector vector34 = null;
        java.util.Vector vector35 = extendedProperties28.getVector("hi!", vector34);
        java.util.Vector vector36 = extendedProperties21.getVector("hi!", vector34);
        java.util.Vector vector37 = extendedProperties12.getVector("hi!", vector36);
        java.lang.String str38 = extendedProperties0.interpolateHelper(",", (java.util.List) vector36);
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = extendedProperties0.subset("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short43 = extendedProperties40.getShort("}", (java.lang.Short) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "}" + "'", str19, "}");
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(vector35);
        org.junit.Assert.assertNotNull(vector36);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "," + "'", str38, ",");
        org.junit.Assert.assertNull(extendedProperties40);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader2 = java.io.Reader.nullReader();
        char[] charArray8 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int9 = reader2.read(charArray8);
        int int10 = propertiesReader1.read(charArray8);
        java.lang.String str11 = propertiesReader1.readProperty();
        int int12 = propertiesReader1.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader13 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader14 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader13);
        java.io.Reader reader15 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader16 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader15);
        java.lang.String str17 = propertiesReader16.readProperty();
        propertiesReader16.mark((int) (byte) 100);
        java.util.stream.Stream<java.lang.String> strStream20 = propertiesReader16.lines();
        propertiesReader16.mark((int) (short) 100);
        char[] charArray27 = new char[] { 'a', '#', '4', '#' };
        int int28 = propertiesReader16.read(charArray27);
        int int29 = propertiesReader14.read(charArray27);
        boolean boolean30 = propertiesReader14.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(reader2);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strStream20);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a', '#', '4', '#' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        extendedProperties5.fileSeparator = ",";
        extendedProperties5.setInclude("/");
        byte byte17 = extendedProperties5.getByte("", (byte) -1);
        java.lang.String str18 = extendedProperties5.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.file = "hi!";
        java.util.Iterator iterator24 = extendedProperties20.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties25.file = "hi!";
        java.util.Iterator iterator29 = extendedProperties25.getKeys("");
        extendedProperties20.putAll((java.util.Map) extendedProperties25);
        java.lang.String str33 = extendedProperties25.getString(",", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties35.file = "hi!";
        java.util.Iterator iterator39 = extendedProperties35.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties40.file = "hi!";
        java.util.Iterator iterator44 = extendedProperties40.getKeys("");
        extendedProperties35.putAll((java.util.Map) extendedProperties40);
        java.util.ArrayList arrayList46 = extendedProperties40.keysAsListed;
        java.lang.String str47 = extendedProperties25.interpolateHelper("/", (java.util.List) arrayList46);
        double double50 = extendedProperties25.getDouble(",", (double) (byte) 10);
        java.lang.String str52 = extendedProperties25.testBoolean("/");
        extendedProperties25.clearProperty("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties25.setProperty("hi!", (java.lang.Object) extendedProperties56);
        float float60 = extendedProperties56.getFloat(",", 35.0f);
        extendedProperties5.setProperty("/", (java.lang.Object) float60);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "," + "'", str33, ",");
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(arrayList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "/" + "'", str47, "/");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 35.0f + "'", float60 == 35.0f);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.Short short13 = extendedProperties5.getShort("", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties17 = null;
        java.util.Properties properties18 = extendedProperties15.getProperties("", properties17);
        java.lang.Short short21 = extendedProperties15.getShort("", (java.lang.Short) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties25 = null;
        java.util.Properties properties26 = extendedProperties23.getProperties("", properties25);
        java.lang.Short short29 = extendedProperties23.getShort("", (java.lang.Short) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties33 = null;
        java.util.Properties properties34 = extendedProperties31.getProperties("", properties33);
        java.util.Properties properties35 = extendedProperties23.getProperties("", properties33);
        java.util.Properties properties36 = extendedProperties15.getProperties(",", properties35);
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties35);
        java.util.Properties properties38 = extendedProperties5.getProperties(",", properties35);
        java.util.Properties properties40 = extendedProperties5.getProperties("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties40);
        java.util.List list43 = extendedProperties41.getList("${");
        extendedProperties41.display();
        java.util.Iterator iterator46 = extendedProperties41.getKeys("${");
        int int49 = extendedProperties41.getInteger("hi!", (int) '#');
        boolean boolean52 = extendedProperties41.getBoolean(",", true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 100 + "'", short21 == (short) 100);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 100 + "'", short29 == (short) 100);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNotNull(extendedProperties37);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNotNull(extendedProperties41);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String[] strArray15 = extendedProperties5.getStringArray(",");
        double double18 = extendedProperties5.getDouble("", (double) 35L);
        extendedProperties5.basePath = "";
        extendedProperties5.setInclude(",");
        java.lang.Byte byte25 = extendedProperties5.getByte("${", (java.lang.Byte) (byte) 100);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 100 + "'", byte25 == (byte) 100);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader2 = java.io.Reader.nullReader();
        char[] charArray8 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int9 = reader2.read(charArray8);
        int int10 = propertiesReader1.read(charArray8);
        java.lang.String str11 = propertiesReader1.readProperty();
        int int12 = propertiesReader1.read();
        propertiesReader1.setLineNumber(100);
        int int15 = propertiesReader1.getLineNumber();
        int int16 = propertiesReader1.read();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(reader2);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        long long5 = extendedProperties0.getLong("}", (long) (byte) -1);
        java.lang.String str7 = extendedProperties0.testBoolean("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = extendedProperties0.subset("/");
        extendedProperties0.basePath = "${";
        java.lang.String[] strArray13 = extendedProperties0.getStringArray("");
        java.io.Reader reader15 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader16 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader15);
        java.io.Reader reader17 = java.io.Reader.nullReader();
        char[] charArray23 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int24 = reader17.read(charArray23);
        int int25 = propertiesReader16.read(charArray23);
        java.lang.String str26 = propertiesReader16.readProperty();
        int int27 = propertiesReader16.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader28 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader16);
        extendedProperties0.addProperty("", (java.lang.Object) propertiesReader16);
        java.lang.String str31 = extendedProperties0.getString("hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(extendedProperties9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(reader17);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        float float6 = extendedProperties0.getFloat("${", 0.0f);
        float float9 = extendedProperties0.getFloat("/", (float) (byte) -1);
        short short12 = extendedProperties0.getShort(",", (short) 10);
        java.lang.String str14 = extendedProperties0.getString("hi!");
        java.util.Vector vector16 = extendedProperties0.getVector("/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(vector16);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = extendedProperties0.getProperties("", properties2);
        java.lang.Object obj5 = extendedProperties0.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties7.file = "hi!";
        java.util.Iterator iterator11 = extendedProperties7.getKeys("/");
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector("hi!", vector13);
        java.util.Vector vector15 = extendedProperties0.getVector("hi!", vector13);
        java.lang.String str16 = extendedProperties0.getInclude();
        java.lang.String str17 = extendedProperties0.file;
        java.io.InputStream inputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertNotNull(vector15);
// flaky "3) test3026(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/" + "'", str16, "/");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str11 = extendedProperties0.fileSeparator;
        extendedProperties0.file = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties15.file = "hi!";
        java.util.Iterator iterator19 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.file = "hi!";
        java.util.Iterator iterator24 = extendedProperties20.getKeys("");
        extendedProperties15.putAll((java.util.Map) extendedProperties20);
        java.util.ArrayList arrayList26 = extendedProperties20.keysAsListed;
        java.util.List list27 = extendedProperties0.getList("", (java.util.List) arrayList26);
        extendedProperties0.setInclude("}");
        int int32 = extendedProperties0.getInt("}", 52);
        java.util.Iterator iterator34 = extendedProperties0.getKeys("${");
        java.util.ArrayList arrayList35 = extendedProperties0.keysAsListed;
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(arrayList35);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.file = "hi!";
        java.util.Iterator iterator16 = extendedProperties12.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.file = "hi!";
        java.util.Iterator iterator21 = extendedProperties17.getKeys("");
        extendedProperties12.putAll((java.util.Map) extendedProperties17);
        java.lang.String str25 = extendedProperties17.getString(",", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties27.file = "hi!";
        java.util.Iterator iterator31 = extendedProperties27.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.file = "hi!";
        java.util.Iterator iterator36 = extendedProperties32.getKeys("");
        extendedProperties27.putAll((java.util.Map) extendedProperties32);
        java.util.ArrayList arrayList38 = extendedProperties32.keysAsListed;
        java.lang.String str39 = extendedProperties17.interpolateHelper("/", (java.util.List) arrayList38);
        double double42 = extendedProperties17.getDouble(",", (double) (byte) 10);
        long long45 = extendedProperties17.getLong(",", (long) 0);
        java.util.List list47 = extendedProperties17.getList("${");
        java.util.ArrayList arrayList48 = extendedProperties17.keysAsListed;
        java.util.List list49 = extendedProperties5.getList("", (java.util.List) arrayList48);
        // The following exception was thrown during execution in test generation
        try {
            short short51 = extendedProperties5.getShort("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "," + "'", str25, ",");
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(arrayList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "/" + "'", str39, "/");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(arrayList48);
        org.junit.Assert.assertNotNull(list49);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.Short short13 = extendedProperties5.getShort("", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties17 = null;
        java.util.Properties properties18 = extendedProperties15.getProperties("", properties17);
        java.lang.Short short21 = extendedProperties15.getShort("", (java.lang.Short) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties25 = null;
        java.util.Properties properties26 = extendedProperties23.getProperties("", properties25);
        java.lang.Short short29 = extendedProperties23.getShort("", (java.lang.Short) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties33 = null;
        java.util.Properties properties34 = extendedProperties31.getProperties("", properties33);
        java.util.Properties properties35 = extendedProperties23.getProperties("", properties33);
        java.util.Properties properties36 = extendedProperties15.getProperties(",", properties35);
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties35);
        java.util.Properties properties38 = extendedProperties5.getProperties(",", properties35);
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties35);
        java.lang.String str41 = extendedProperties39.testBoolean("");
        java.lang.String str43 = extendedProperties39.getString("");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 100 + "'", short21 == (short) 100);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 100 + "'", short29 == (short) 100);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNotNull(extendedProperties37);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(extendedProperties39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String[] strArray15 = extendedProperties5.getStringArray(",");
        boolean boolean16 = extendedProperties5.isInitialized;
        extendedProperties5.file = "${";
        java.lang.Byte byte21 = extendedProperties5.getByte("", (java.lang.Byte) (byte) -1);
        extendedProperties5.fileSeparator = "hi!";
        java.lang.Double double26 = extendedProperties5.getDouble("}", (java.lang.Double) 35.0d);
        extendedProperties5.file = ",";
        java.lang.String str30 = extendedProperties5.getString(",");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 35.0d + "'", double26 == 35.0d);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader2 = java.io.Reader.nullReader();
        char[] charArray8 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int9 = reader2.read(charArray8);
        int int10 = propertiesReader1.read(charArray8);
        java.lang.String str11 = propertiesReader1.readProperty();
        propertiesReader1.mark((int) (byte) 1);
        java.lang.String str14 = propertiesReader1.readProperty();
        java.io.Reader reader15 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader16 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader15);
        java.io.Reader reader17 = java.io.Reader.nullReader();
        char[] charArray23 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int24 = reader17.read(charArray23);
        int int25 = propertiesReader16.read(charArray23);
        int int26 = propertiesReader1.read(charArray23);
        int int27 = propertiesReader1.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader28 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        boolean boolean29 = propertiesReader28.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(reader2);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(reader17);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String[] strArray15 = extendedProperties5.getStringArray(",");
        boolean boolean16 = extendedProperties5.isInitialized;
        extendedProperties5.file = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties19.file = "hi!";
        java.util.Iterator iterator23 = extendedProperties19.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties24.file = "hi!";
        java.util.Iterator iterator28 = extendedProperties24.getKeys("");
        extendedProperties19.putAll((java.util.Map) extendedProperties24);
        java.lang.String str30 = extendedProperties19.fileSeparator;
        extendedProperties19.file = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties34.file = "hi!";
        java.util.Iterator iterator38 = extendedProperties34.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties39.file = "hi!";
        java.util.Iterator iterator43 = extendedProperties39.getKeys("");
        extendedProperties34.putAll((java.util.Map) extendedProperties39);
        java.util.ArrayList arrayList45 = extendedProperties39.keysAsListed;
        java.util.List list46 = extendedProperties19.getList("", (java.util.List) arrayList45);
        extendedProperties5.keysAsListed = arrayList45;
        extendedProperties5.basePath = "/";
        extendedProperties5.display();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "/" + "'", str30, "/");
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertNotNull(arrayList45);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.read();
        int int3 = propertiesReader1.read();
        java.lang.String str4 = propertiesReader1.readLine();
        java.lang.String str5 = propertiesReader1.readLine();
        long long7 = propertiesReader1.skip(97L);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader8 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        java.util.stream.Stream<java.lang.String> strStream9 = propertiesReader8.lines();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(strStream9);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.Short short13 = extendedProperties5.getShort("", (java.lang.Short) (short) 10);
        extendedProperties5.fileSeparator = "}";
        java.lang.Boolean boolean18 = extendedProperties5.getBoolean("${", (java.lang.Boolean) false);
        java.lang.String str19 = extendedProperties5.file;
        boolean boolean22 = extendedProperties5.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties23.file = "hi!";
        java.util.Iterator iterator27 = extendedProperties23.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties28.file = "hi!";
        java.util.Iterator iterator32 = extendedProperties28.getKeys("");
        extendedProperties23.putAll((java.util.Map) extendedProperties28);
        extendedProperties28.fileSeparator = ",";
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer37 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        java.lang.Object obj38 = extendedProperties28.remove((java.lang.Object) "");
        double double41 = extendedProperties28.getDouble("/", (double) 1.0f);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties43.file = "hi!";
        java.util.Iterator iterator47 = extendedProperties43.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties48.file = "hi!";
        java.util.Iterator iterator52 = extendedProperties48.getKeys("");
        extendedProperties43.putAll((java.util.Map) extendedProperties48);
        extendedProperties28.addProperty("}", (java.lang.Object) extendedProperties43);
        extendedProperties5.putAll((java.util.Map) extendedProperties28);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = extendedProperties28.getInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNotNull(iterator52);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str11 = extendedProperties0.fileSeparator;
        extendedProperties0.file = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties15.file = "hi!";
        java.util.Iterator iterator19 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.file = "hi!";
        java.util.Iterator iterator24 = extendedProperties20.getKeys("");
        extendedProperties15.putAll((java.util.Map) extendedProperties20);
        java.util.ArrayList arrayList26 = extendedProperties20.keysAsListed;
        java.util.List list27 = extendedProperties0.getList("", (java.util.List) arrayList26);
        extendedProperties0.setInclude("}");
        int int32 = extendedProperties0.getInt("}", 52);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list36 = null;
        java.lang.String str37 = extendedProperties34.interpolateHelper("hi!", list36);
        java.lang.String str39 = extendedProperties34.interpolate("");
        java.lang.Object obj40 = extendedProperties33.remove((java.lang.Object) str39);
        java.lang.Short short43 = extendedProperties33.getShort("/", (java.lang.Short) (short) 100);
        java.lang.String str46 = extendedProperties33.getString("/", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties47.file = "hi!";
        java.util.Iterator iterator51 = extendedProperties47.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties52.file = "hi!";
        java.util.Iterator iterator56 = extendedProperties52.getKeys("");
        extendedProperties47.putAll((java.util.Map) extendedProperties52);
        java.lang.String str60 = extendedProperties52.getString(",", ",");
        java.lang.String[] strArray62 = extendedProperties52.getStringArray(",");
        short short65 = extendedProperties52.getShort("${", (short) (byte) -1);
        java.lang.Short short68 = extendedProperties52.getShort("}", (java.lang.Short) (short) 1);
        java.lang.String[] strArray70 = extendedProperties52.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties71 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties71.file = "hi!";
        byte byte76 = extendedProperties71.getByte("${", (byte) 10);
        boolean boolean77 = extendedProperties71.isInitialized();
        java.lang.Object obj78 = extendedProperties33.put((java.lang.Object) extendedProperties52, (java.lang.Object) boolean77);
        extendedProperties0.combine(extendedProperties52);
        extendedProperties52.fileSeparator = "/";
        extendedProperties52.isInitialized = true;
        extendedProperties52.clearProperty("");
        java.util.Vector vector87 = extendedProperties52.getVector("${");
        int int90 = extendedProperties52.getInteger("${", 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) 100 + "'", short43 == (short) 100);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "," + "'", str46, ",");
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "," + "'", str60, ",");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short65 + "' != '" + (short) -1 + "'", short65 == (short) -1);
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) 1 + "'", short68 == (short) 1);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 10 + "'", byte76 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(vector87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 10 + "'", int90 == 10);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.read();
        java.lang.String str3 = propertiesReader1.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader4 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        java.lang.String str5 = propertiesReader1.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader6 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        java.lang.String str7 = propertiesReader6.readLine();
        propertiesReader6.close();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = propertiesReader6.skip((long) '4');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list3 = null;
        java.lang.String str4 = extendedProperties1.interpolateHelper("hi!", list3);
        java.lang.String str6 = extendedProperties1.interpolate("");
        java.lang.Object obj7 = extendedProperties0.remove((java.lang.Object) str6);
        java.lang.Short short10 = extendedProperties0.getShort("/", (java.lang.Short) (short) 100);
        byte byte13 = extendedProperties0.getByte("}", (byte) -1);
        float float16 = extendedProperties0.getFloat("/", 0.0f);
        java.lang.String str17 = extendedProperties0.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties21 = null;
        java.util.Properties properties22 = extendedProperties19.getProperties("", properties21);
        java.lang.Short short25 = extendedProperties19.getShort("", (java.lang.Short) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties29 = null;
        java.util.Properties properties30 = extendedProperties27.getProperties("", properties29);
        java.util.Properties properties31 = extendedProperties19.getProperties("", properties29);
        java.util.Properties properties32 = extendedProperties0.getProperties("/", properties31);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties32);
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 100 + "'", short25 == (short) 100);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(extendedProperties33);
        org.junit.Assert.assertNotNull(extendedProperties34);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = extendedProperties0.getProperties("", properties2);
        java.lang.Short short6 = extendedProperties0.getShort("", (java.lang.Short) (short) 100);
        java.lang.String str8 = extendedProperties0.getString("/");
        java.lang.String str9 = extendedProperties0.getInclude();
        java.lang.Integer int12 = extendedProperties0.getInteger("/", (java.lang.Integer) 32);
        java.lang.String str13 = extendedProperties0.basePath;
        // The following exception was thrown during execution in test generation
        try {
            byte byte15 = extendedProperties0.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(str8);
// flaky "4) test3038(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        float float6 = extendedProperties0.getFloat("${", 0.0f);
        float float9 = extendedProperties0.getFloat("/", (float) 1L);
        java.lang.String str12 = extendedProperties0.getString("hi!", "/");
        java.lang.Float float15 = extendedProperties0.getFloat("/", (java.lang.Float) 52.0f);
        java.lang.String str18 = extendedProperties0.getString("", ",");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 52.0f + "'", float15 == 52.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "," + "'", str18, ",");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.String str7 = extendedProperties0.getInclude();
        java.util.Iterator iterator9 = extendedProperties0.getKeys(",");
        java.lang.Long long12 = extendedProperties0.getLong("}", (java.lang.Long) 97L);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.file = "hi!";
        byte byte19 = extendedProperties14.getByte("${", (byte) 10);
        extendedProperties14.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.file = "hi!";
        java.util.Iterator iterator26 = extendedProperties22.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties27.file = "hi!";
        java.util.Iterator iterator31 = extendedProperties27.getKeys("");
        extendedProperties22.putAll((java.util.Map) extendedProperties27);
        java.lang.Short short35 = extendedProperties27.getShort("", (java.lang.Short) (short) 10);
        extendedProperties27.fileSeparator = "}";
        java.util.Vector vector39 = extendedProperties27.getVector("${");
        java.util.Vector vector40 = extendedProperties14.getVector("", vector39);
        java.util.List list41 = extendedProperties0.getList(",", (java.util.List) vector39);
        int int44 = extendedProperties0.getInt(",", (int) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = extendedProperties0.subset("}");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "5) test3040(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 10 + "'", byte19 == (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 10 + "'", short35 == (short) 10);
        org.junit.Assert.assertNotNull(vector39);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNull(extendedProperties46);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.getLineNumber();
        propertiesReader1.mark((int) (short) 0);
        int int5 = propertiesReader1.getLineNumber();
        propertiesReader1.mark(0);
        long long9 = propertiesReader1.skip(100L);
        java.util.stream.Stream<java.lang.String> strStream10 = propertiesReader1.lines();
        java.lang.String str11 = propertiesReader1.readLine();
        boolean boolean12 = propertiesReader1.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list3 = null;
        java.lang.String str4 = extendedProperties1.interpolateHelper("hi!", list3);
        java.lang.String str6 = extendedProperties1.interpolate("");
        java.lang.Object obj7 = extendedProperties0.remove((java.lang.Object) str6);
        java.lang.Short short10 = extendedProperties0.getShort("/", (java.lang.Short) (short) 100);
        java.lang.String str12 = extendedProperties0.testBoolean("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties13.file = "hi!";
        java.util.Iterator iterator17 = extendedProperties13.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.file = "hi!";
        java.util.Iterator iterator22 = extendedProperties18.getKeys("");
        extendedProperties13.putAll((java.util.Map) extendedProperties18);
        java.lang.Short short26 = extendedProperties18.getShort("", (java.lang.Short) (short) 10);
        extendedProperties18.fileSeparator = "}";
        java.lang.Boolean boolean31 = extendedProperties18.getBoolean("${", (java.lang.Boolean) false);
        extendedProperties0.combine(extendedProperties18);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties33.file = "hi!";
        byte byte38 = extendedProperties33.getByte("${", (byte) 10);
        extendedProperties33.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties42 = null;
        java.util.Properties properties43 = extendedProperties40.getProperties("", properties42);
        java.lang.Short short46 = extendedProperties40.getShort("", (java.lang.Short) (short) 100);
        long long49 = extendedProperties40.getLong("${", (long) '#');
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list54 = null;
        java.lang.String str55 = extendedProperties52.interpolateHelper("hi!", list54);
        java.lang.String str57 = extendedProperties52.interpolate("");
        java.lang.Object obj58 = extendedProperties51.remove((java.lang.Object) str57);
        java.lang.String str59 = extendedProperties51.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties61 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties61.file = "hi!";
        java.util.Iterator iterator65 = extendedProperties61.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties66 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties66.file = "hi!";
        java.util.Iterator iterator70 = extendedProperties66.getKeys("");
        extendedProperties61.putAll((java.util.Map) extendedProperties66);
        java.lang.Short short74 = extendedProperties66.getShort("", (java.lang.Short) (short) 10);
        extendedProperties66.fileSeparator = "}";
        java.util.Vector vector78 = extendedProperties66.getVector("${");
        java.util.Vector vector79 = extendedProperties51.getVector("/", vector78);
        java.util.List list80 = extendedProperties40.getList("hi!", (java.util.List) vector79);
        java.lang.Object obj81 = extendedProperties33.remove((java.lang.Object) extendedProperties40);
        extendedProperties0.combine(extendedProperties40);
        java.lang.String[] strArray84 = extendedProperties40.getStringArray("/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 10 + "'", short26 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 10 + "'", byte38 == (byte) 10);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 100 + "'", short46 == (short) 100);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 35L + "'", long49 == 35L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(obj58);
// flaky "6) test3042(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "/" + "'", str59, "/");
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + short74 + "' != '" + (short) 10 + "'", short74 == (short) 10);
        org.junit.Assert.assertNotNull(vector78);
        org.junit.Assert.assertNotNull(vector79);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] {});
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        java.lang.String str5 = extendedProperties0.basePath;
        java.lang.Byte byte8 = extendedProperties0.getByte("hi!", (java.lang.Byte) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list11 = null;
        java.lang.String str12 = extendedProperties9.interpolateHelper("hi!", list11);
        float float15 = extendedProperties9.getFloat("${", 0.0f);
        java.lang.Byte byte18 = extendedProperties9.getByte(",", (java.lang.Byte) (byte) 10);
        java.lang.String str21 = extendedProperties9.getString("}", "hi!");
        java.io.OutputStream outputStream22 = null;
        extendedProperties9.save(outputStream22, "}");
        java.lang.Object obj26 = extendedProperties9.getProperty("hi!");
        java.lang.String str27 = extendedProperties9.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties28.file = "hi!";
        java.util.Iterator iterator32 = extendedProperties28.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties33.file = "hi!";
        java.util.Iterator iterator37 = extendedProperties33.getKeys("");
        extendedProperties28.putAll((java.util.Map) extendedProperties33);
        java.lang.String str41 = extendedProperties33.getString(",", ",");
        java.lang.String[] strArray43 = extendedProperties33.getStringArray(",");
        short short46 = extendedProperties33.getShort("${", (short) (byte) -1);
        short short49 = extendedProperties33.getShort("hi!", (short) 0);
        java.util.ArrayList arrayList50 = extendedProperties33.keysAsListed;
        extendedProperties9.putAll((java.util.Map) extendedProperties33);
        org.apache.commons.collections.ExtendedProperties extendedProperties53 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties53.file = "hi!";
        java.util.Iterator iterator57 = extendedProperties53.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties58.file = "hi!";
        java.util.Iterator iterator62 = extendedProperties58.getKeys("");
        extendedProperties53.putAll((java.util.Map) extendedProperties58);
        java.lang.String str64 = extendedProperties53.fileSeparator;
        extendedProperties53.display();
        java.lang.Long long68 = extendedProperties53.getLong("", (java.lang.Long) (-1L));
        java.util.Vector vector70 = extendedProperties53.getVector("}");
        java.lang.Long long73 = extendedProperties53.getLong("/", (java.lang.Long) 1L);
        java.util.ArrayList arrayList74 = extendedProperties53.keysAsListed;
        java.util.List list75 = extendedProperties9.getList("hi!", (java.util.List) arrayList74);
        extendedProperties0.keysAsListed = arrayList74;
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 10 + "'", byte18 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "," + "'", str41, ",");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) -1 + "'", short46 == (short) -1);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 0 + "'", short49 == (short) 0);
        org.junit.Assert.assertNotNull(arrayList50);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "/" + "'", str64, "/");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
        org.junit.Assert.assertNotNull(vector70);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertNotNull(arrayList74);
        org.junit.Assert.assertNotNull(list75);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.read();
        java.lang.String str3 = propertiesReader1.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader4 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        java.lang.String str5 = propertiesReader1.readProperty();
        propertiesReader1.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = extendedProperties0.getProperties("", properties2);
        java.lang.Object obj5 = extendedProperties0.getProperty("");
        java.util.Properties properties7 = extendedProperties0.getProperties("}");
        boolean boolean10 = extendedProperties0.getBoolean(",", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.file = "hi!";
        java.util.Iterator iterator16 = extendedProperties12.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.file = "hi!";
        java.util.Iterator iterator21 = extendedProperties17.getKeys("");
        extendedProperties12.putAll((java.util.Map) extendedProperties17);
        java.lang.String str23 = extendedProperties12.fileSeparator;
        extendedProperties12.file = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties27.file = "hi!";
        java.util.Iterator iterator31 = extendedProperties27.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.file = "hi!";
        java.util.Iterator iterator36 = extendedProperties32.getKeys("");
        extendedProperties27.putAll((java.util.Map) extendedProperties32);
        java.util.ArrayList arrayList38 = extendedProperties32.keysAsListed;
        java.util.List list39 = extendedProperties12.getList("", (java.util.List) arrayList38);
        java.util.List list40 = extendedProperties0.getList("${", list39);
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties41.file = "hi!";
        java.util.Iterator iterator45 = extendedProperties41.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties46.file = "hi!";
        java.util.Iterator iterator50 = extendedProperties46.getKeys("");
        extendedProperties41.putAll((java.util.Map) extendedProperties46);
        java.lang.Short short54 = extendedProperties46.getShort("", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties58 = null;
        java.util.Properties properties59 = extendedProperties56.getProperties("", properties58);
        java.lang.Short short62 = extendedProperties56.getShort("", (java.lang.Short) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties64 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties66 = null;
        java.util.Properties properties67 = extendedProperties64.getProperties("", properties66);
        java.lang.Short short70 = extendedProperties64.getShort("", (java.lang.Short) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties72 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties74 = null;
        java.util.Properties properties75 = extendedProperties72.getProperties("", properties74);
        java.util.Properties properties76 = extendedProperties64.getProperties("", properties74);
        java.util.Properties properties77 = extendedProperties56.getProperties(",", properties76);
        org.apache.commons.collections.ExtendedProperties extendedProperties78 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties76);
        java.util.Properties properties79 = extendedProperties46.getProperties(",", properties76);
        java.util.Properties properties81 = extendedProperties46.getProperties("hi!");
        java.util.Iterator iterator83 = extendedProperties46.getKeys(",");
        extendedProperties0.combine(extendedProperties46);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/" + "'", str23, "/");
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(arrayList38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 10 + "'", short54 == (short) 10);
        org.junit.Assert.assertNotNull(properties59);
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) 100 + "'", short62 == (short) 100);
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) 100 + "'", short70 == (short) 100);
        org.junit.Assert.assertNotNull(properties75);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertNotNull(properties77);
        org.junit.Assert.assertNotNull(extendedProperties78);
        org.junit.Assert.assertNotNull(properties79);
        org.junit.Assert.assertNotNull(properties81);
        org.junit.Assert.assertNotNull(iterator83);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        float float6 = extendedProperties0.getFloat("${", 0.0f);
        extendedProperties0.display();
        short short10 = extendedProperties0.getShort("${", (short) (byte) 0);
        long long13 = extendedProperties0.getLong(",", (long) (byte) 1);
        java.lang.Float float16 = extendedProperties0.getFloat(",", (java.lang.Float) 32.0f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 32.0f + "'", float16 == 32.0f);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.Short short13 = extendedProperties5.getShort("", (java.lang.Short) (short) 10);
        extendedProperties5.fileSeparator = "}";
        java.lang.Boolean boolean18 = extendedProperties5.getBoolean("${", (java.lang.Boolean) false);
        int int21 = extendedProperties5.getInteger("${", 32);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken("/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = extendedProperties0.getProperties("", properties2);
        java.lang.Short short6 = extendedProperties0.getShort("", (java.lang.Short) (short) 100);
        extendedProperties0.isInitialized = false;
        java.lang.Byte byte11 = extendedProperties0.getByte(",", (java.lang.Byte) (byte) 10);
        java.lang.Boolean boolean14 = extendedProperties0.getBoolean(",", (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = extendedProperties0.getDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.lang.String str2 = propertiesReader1.readProperty();
        java.util.stream.Stream<java.lang.String> strStream3 = propertiesReader1.lines();
        java.io.Reader reader4 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader4);
        int int6 = propertiesReader5.read();
        java.lang.String str7 = propertiesReader5.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader8 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader5);
        java.io.Reader reader9 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader10 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader9);
        java.lang.String str11 = propertiesReader10.readProperty();
        propertiesReader10.mark((int) (byte) 100);
        java.util.stream.Stream<java.lang.String> strStream14 = propertiesReader10.lines();
        propertiesReader10.mark((int) (short) 100);
        char[] charArray21 = new char[] { 'a', '#', '4', '#' };
        int int22 = propertiesReader10.read(charArray21);
        int int23 = propertiesReader5.read(charArray21);
        int int24 = propertiesReader1.read(charArray21);
        propertiesReader1.setLineNumber((int) (byte) 100);
        int int27 = propertiesReader1.read();
        java.io.Reader reader28 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader29 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader28);
        int int30 = propertiesReader29.read();
        java.lang.String str31 = propertiesReader29.readProperty();
        propertiesReader29.mark(10);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader34 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader29);
        java.io.Reader reader35 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader36 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader35);
        java.lang.String str37 = propertiesReader36.readProperty();
        int int38 = propertiesReader36.getLineNumber();
        java.lang.String str39 = propertiesReader36.readProperty();
        java.io.Reader reader40 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader41 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader40);
        int int42 = propertiesReader41.read();
        java.lang.String str43 = propertiesReader41.readProperty();
        propertiesReader41.setLineNumber((int) '4');
        char[] charArray47 = new char[] { 'a' };
        int int48 = propertiesReader41.read(charArray47);
        int int51 = propertiesReader36.read(charArray47, 0, 0);
        int int52 = propertiesReader34.read(charArray47);
        int int53 = propertiesReader1.read(charArray47);
        propertiesReader1.mark(10);
        java.io.Reader reader56 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader57 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader56);
        java.io.Reader reader58 = java.io.Reader.nullReader();
        char[] charArray64 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int65 = reader58.read(charArray64);
        int int66 = propertiesReader57.read(charArray64);
        java.lang.String str67 = propertiesReader57.readProperty();
        propertiesReader57.mark((int) (byte) 1);
        java.lang.String str70 = propertiesReader57.readProperty();
        java.io.Reader reader71 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader72 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader71);
        int int73 = propertiesReader72.getLineNumber();
        propertiesReader72.mark((int) (short) 0);
        propertiesReader72.reset();
        java.util.stream.Stream<java.lang.String> strStream77 = propertiesReader72.lines();
        java.io.Reader reader78 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader79 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader78);
        int int80 = propertiesReader79.read();
        java.lang.String str81 = propertiesReader79.readProperty();
        propertiesReader79.setLineNumber((int) '4');
        char[] charArray85 = new char[] { 'a' };
        int int86 = propertiesReader79.read(charArray85);
        int int87 = propertiesReader72.read(charArray85);
        int int88 = propertiesReader57.read(charArray85);
        int int89 = propertiesReader1.read(charArray85);
        java.io.Writer writer90 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long91 = propertiesReader1.transferTo(writer90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strStream3);
        org.junit.Assert.assertNotNull(reader4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { 'a', '#', '4', '#' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(reader28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(reader35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(reader40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(reader56);
        org.junit.Assert.assertNotNull(reader58);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(reader71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(strStream77);
        org.junit.Assert.assertNotNull(reader78);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertArrayEquals(charArray85, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        java.lang.String str5 = extendedProperties0.interpolate("");
        extendedProperties0.setInclude(",");
        long long10 = extendedProperties0.getLong("}", (-1L));
        extendedProperties0.display();
        java.lang.String[] strArray13 = extendedProperties0.getStringArray(",");
        extendedProperties0.basePath = "/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Byte byte3 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 10);
        java.lang.Boolean boolean6 = extendedProperties0.getBoolean(",", (java.lang.Boolean) false);
        double double9 = extendedProperties0.getDouble("hi!", 0.0d);
        java.lang.Integer int12 = extendedProperties0.getInteger(",", (java.lang.Integer) 1);
        double double15 = extendedProperties0.getDouble("/", (double) 97);
        boolean boolean16 = extendedProperties0.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.file = "hi!";
        java.util.Iterator iterator22 = extendedProperties18.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties23.file = "hi!";
        java.util.Iterator iterator27 = extendedProperties23.getKeys("");
        extendedProperties18.putAll((java.util.Map) extendedProperties23);
        java.lang.String str30 = extendedProperties23.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties34 = null;
        java.util.Properties properties35 = extendedProperties32.getProperties("", properties34);
        java.lang.Object obj37 = extendedProperties32.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties39.file = "hi!";
        java.util.Iterator iterator43 = extendedProperties39.getKeys("/");
        java.util.Vector vector45 = null;
        java.util.Vector vector46 = extendedProperties39.getVector("hi!", vector45);
        java.util.Vector vector47 = extendedProperties32.getVector("hi!", vector45);
        java.util.Vector vector48 = extendedProperties23.getVector("hi!", vector47);
        java.util.Vector vector49 = extendedProperties0.getVector("", vector48);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "}" + "'", str30, "}");
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertNotNull(vector46);
        org.junit.Assert.assertNotNull(vector47);
        org.junit.Assert.assertNotNull(vector48);
        org.junit.Assert.assertNotNull(vector49);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        double double16 = extendedProperties5.getDouble("${", (double) (short) -1);
        float float19 = extendedProperties5.getFloat(",", (float) (short) 100);
        java.lang.String str20 = extendedProperties5.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str23 = extendedProperties22.file;
        java.util.Vector vector25 = extendedProperties22.getVector("");
        extendedProperties5.setProperty("", (java.lang.Object) vector25);
        java.lang.Boolean boolean29 = extendedProperties5.getBoolean("hi!", (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(vector25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.util.ArrayList arrayList11 = extendedProperties5.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Byte byte15 = extendedProperties12.getByte("", (java.lang.Byte) (byte) 10);
        java.lang.Boolean boolean18 = extendedProperties12.getBoolean(",", (java.lang.Boolean) false);
        java.lang.Object obj20 = extendedProperties5.put((java.lang.Object) boolean18, (java.lang.Object) "/");
        java.lang.String str22 = extendedProperties5.interpolate(",");
        java.lang.Long long25 = extendedProperties5.getLong("", (java.lang.Long) 10L);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object obj27 = extendedProperties5.remove(obj26);
        extendedProperties5.isInitialized = true;
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "," + "'", str22, ",");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = extendedProperties0.getProperties("", properties2);
        java.lang.Object obj5 = extendedProperties0.getProperty("");
        java.util.Properties properties7 = extendedProperties0.getProperties("}");
        boolean boolean10 = extendedProperties0.getBoolean(",", true);
        extendedProperties0.file = "/";
        extendedProperties0.basePath = "${";
        java.lang.String str16 = extendedProperties0.testBoolean("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = extendedProperties0.getBoolean("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties15.file = "hi!";
        java.util.Iterator iterator19 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.file = "hi!";
        java.util.Iterator iterator24 = extendedProperties20.getKeys("");
        extendedProperties15.putAll((java.util.Map) extendedProperties20);
        java.util.ArrayList arrayList26 = extendedProperties20.keysAsListed;
        java.lang.String str27 = extendedProperties5.interpolateHelper("/", (java.util.List) arrayList26);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties30 = null;
        java.util.Properties properties31 = extendedProperties28.getProperties("", properties30);
        java.lang.Object obj32 = extendedProperties5.remove((java.lang.Object) properties31);
        java.util.Properties properties34 = extendedProperties5.getProperties("");
        int int37 = extendedProperties5.getInt("}", (int) (byte) 1);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/" + "'", str27, "/");
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        byte byte5 = extendedProperties0.getByte("${", (byte) 10);
        extendedProperties0.display();
        java.util.Properties properties8 = extendedProperties0.getProperties("}");
        java.lang.Float float11 = extendedProperties0.getFloat("${", (java.lang.Float) 100.0f);
        java.util.Iterator iterator13 = extendedProperties0.getKeys("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list17 = null;
        java.lang.String str18 = extendedProperties15.interpolateHelper("hi!", list17);
        java.lang.String str20 = extendedProperties15.interpolate("");
        extendedProperties15.setInclude(",");
        long long25 = extendedProperties15.getLong("}", (-1L));
        extendedProperties15.display();
        java.lang.String[] strArray28 = extendedProperties15.getStringArray(",");
        extendedProperties0.setProperty("hi!", (java.lang.Object) extendedProperties15);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties15.file = "hi!";
        java.util.Iterator iterator19 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.file = "hi!";
        java.util.Iterator iterator24 = extendedProperties20.getKeys("");
        extendedProperties15.putAll((java.util.Map) extendedProperties20);
        java.util.ArrayList arrayList26 = extendedProperties20.keysAsListed;
        java.lang.String str27 = extendedProperties5.interpolateHelper("/", (java.util.List) arrayList26);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties30 = null;
        java.util.Properties properties31 = extendedProperties28.getProperties("", properties30);
        java.lang.Object obj32 = extendedProperties5.remove((java.lang.Object) properties31);
        java.lang.String str33 = extendedProperties5.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list37 = null;
        java.lang.String str38 = extendedProperties35.interpolateHelper("hi!", list37);
        java.lang.String str40 = extendedProperties35.interpolate("");
        java.lang.Object obj41 = extendedProperties34.remove((java.lang.Object) str40);
        java.lang.String str42 = extendedProperties34.getInclude();
        java.lang.String str45 = extendedProperties34.getString("", "");
        java.lang.String[] strArray47 = extendedProperties34.getStringArray("");
        java.util.List list49 = extendedProperties34.getList("");
        java.util.Vector vector51 = extendedProperties34.getVector("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties52.file = "hi!";
        java.util.Iterator iterator56 = extendedProperties52.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties57 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties57.file = "hi!";
        java.util.Iterator iterator61 = extendedProperties57.getKeys("");
        extendedProperties52.putAll((java.util.Map) extendedProperties57);
        java.lang.String str65 = extendedProperties57.getString(",", ",");
        double double68 = extendedProperties57.getDouble("${", (double) (short) -1);
        java.util.List list70 = extendedProperties57.getList("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties71 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties71.file = "hi!";
        java.util.Iterator iterator75 = extendedProperties71.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties76 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties76.file = "hi!";
        java.util.Iterator iterator80 = extendedProperties76.getKeys("");
        extendedProperties71.putAll((java.util.Map) extendedProperties76);
        java.lang.String str84 = extendedProperties76.getString(",", ",");
        java.lang.String[] strArray86 = extendedProperties76.getStringArray(",");
        boolean boolean87 = extendedProperties76.isInitialized;
        extendedProperties76.file = "${";
        extendedProperties57.combine(extendedProperties76);
        java.lang.String str91 = extendedProperties76.file;
        java.lang.Object obj92 = extendedProperties5.put((java.lang.Object) vector51, (java.lang.Object) str91);
        boolean boolean95 = extendedProperties5.getBoolean("}", true);
        java.lang.String str96 = extendedProperties5.fileSeparator;
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/" + "'", str27, "/");
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(obj41);
// flaky "7) test3058(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "/" + "'", str42, "/");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(vector51);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "," + "'", str65, ",");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertNotNull(iterator80);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "," + "'", str84, ",");
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "${" + "'", str91, "${");
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "/" + "'", str96, "/");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = extendedProperties0.getProperties("", properties2);
        java.lang.Short short6 = extendedProperties0.getShort("", (java.lang.Short) (short) 100);
        java.lang.String str8 = extendedProperties0.getString("/");
        java.lang.String str9 = extendedProperties0.getInclude();
        java.lang.Integer int12 = extendedProperties0.getInteger("/", (java.lang.Integer) 32);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties16 = null;
        java.util.Properties properties17 = extendedProperties14.getProperties("", properties16);
        java.util.Properties properties18 = extendedProperties0.getProperties("/", properties17);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties0.subset("}");
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties20.display();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(str8);
// flaky "8) test3059(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(extendedProperties20);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.lang.String str2 = propertiesReader1.readProperty();
        java.lang.String str3 = propertiesReader1.readProperty();
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties4.file = "hi!";
        java.util.Iterator iterator8 = extendedProperties4.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties9.file = "hi!";
        java.util.Iterator iterator13 = extendedProperties9.getKeys("");
        extendedProperties4.putAll((java.util.Map) extendedProperties9);
        java.lang.String str17 = extendedProperties9.getString(",", ",");
        java.lang.String[] strArray19 = extendedProperties9.getStringArray(",");
        short short22 = extendedProperties9.getShort("${", (short) (byte) -1);
        java.lang.Short short25 = extendedProperties9.getShort("}", (java.lang.Short) (short) 1);
        java.lang.String[] strArray27 = extendedProperties9.getStringArray("");
        java.io.Reader reader29 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader30 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader29);
        int int31 = propertiesReader30.read();
        long long33 = propertiesReader30.skip((long) (byte) 100);
        extendedProperties9.setProperty("/", (java.lang.Object) propertiesReader30);
        java.io.Reader reader35 = java.io.Reader.nullReader();
        char[] charArray41 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int42 = reader35.read(charArray41);
        int int43 = propertiesReader30.read(charArray41);
        int int44 = propertiesReader1.read(charArray41);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader45 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        java.util.stream.Stream<java.lang.String> strStream46 = propertiesReader1.lines();
        propertiesReader1.setLineNumber(10);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "," + "'", str17, ",");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 1 + "'", short25 == (short) 1);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(reader29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(reader35);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strStream46);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        double double16 = extendedProperties5.getDouble("${", (double) (short) -1);
        java.util.List list18 = extendedProperties5.getList("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties19.file = "hi!";
        java.util.Iterator iterator23 = extendedProperties19.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties24.file = "hi!";
        java.util.Iterator iterator28 = extendedProperties24.getKeys("");
        extendedProperties19.putAll((java.util.Map) extendedProperties24);
        java.lang.String str32 = extendedProperties24.getString(",", ",");
        java.lang.String[] strArray34 = extendedProperties24.getStringArray(",");
        boolean boolean35 = extendedProperties24.isInitialized;
        extendedProperties24.file = "${";
        extendedProperties5.combine(extendedProperties24);
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list41 = null;
        java.lang.String str42 = extendedProperties39.interpolateHelper("hi!", list41);
        java.lang.String str44 = extendedProperties39.interpolate("");
        boolean boolean47 = extendedProperties39.getBoolean("", false);
        extendedProperties39.file = "hi!";
        java.util.ArrayList arrayList50 = extendedProperties39.keysAsListed;
        java.lang.Double double53 = extendedProperties39.getDouble("hi!", (java.lang.Double) 100.0d);
        extendedProperties39.display();
        extendedProperties39.display();
        java.lang.Double double58 = extendedProperties39.getDouble(",", (java.lang.Double) 0.0d);
        extendedProperties24.putAll((java.util.Map) extendedProperties39);
        java.lang.String str62 = extendedProperties24.getString("}", "${");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "," + "'", str32, ",");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(arrayList50);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "${" + "'", str62, "${");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.lang.String[] strArray4 = extendedProperties0.getStringArray("}");
        java.lang.String str6 = extendedProperties0.getString("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.file = "hi!";
        java.util.Iterator iterator12 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties13.file = "hi!";
        java.util.Iterator iterator17 = extendedProperties13.getKeys("");
        extendedProperties8.putAll((java.util.Map) extendedProperties13);
        java.lang.String str21 = extendedProperties13.getString(",", ",");
        double double24 = extendedProperties13.getDouble("${", (double) (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties28 = null;
        java.util.Properties properties29 = extendedProperties26.getProperties("", properties28);
        java.util.Properties properties30 = extendedProperties13.getProperties("}", properties28);
        java.util.Properties properties31 = extendedProperties0.getProperties(",", properties30);
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties30);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties33.file = "hi!";
        java.util.Iterator iterator37 = extendedProperties33.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties38.file = "hi!";
        java.util.Iterator iterator42 = extendedProperties38.getKeys("");
        extendedProperties33.putAll((java.util.Map) extendedProperties38);
        java.lang.String str46 = extendedProperties38.getString(",", ",");
        java.lang.String[] strArray48 = extendedProperties38.getStringArray(",");
        boolean boolean49 = extendedProperties38.isInitialized;
        extendedProperties38.file = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties52.file = "hi!";
        java.util.Iterator iterator56 = extendedProperties52.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties57 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties57.file = "hi!";
        java.util.Iterator iterator61 = extendedProperties57.getKeys("");
        extendedProperties52.putAll((java.util.Map) extendedProperties57);
        java.lang.String str63 = extendedProperties52.fileSeparator;
        extendedProperties52.file = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties67 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties67.file = "hi!";
        java.util.Iterator iterator71 = extendedProperties67.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties72 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties72.file = "hi!";
        java.util.Iterator iterator76 = extendedProperties72.getKeys("");
        extendedProperties67.putAll((java.util.Map) extendedProperties72);
        java.util.ArrayList arrayList78 = extendedProperties72.keysAsListed;
        java.util.List list79 = extendedProperties52.getList("", (java.util.List) arrayList78);
        extendedProperties38.keysAsListed = arrayList78;
        extendedProperties32.keysAsListed = arrayList78;
        int int84 = extendedProperties32.getInt("${", (int) 'a');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "," + "'", str21, ",");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(extendedProperties32);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "," + "'", str46, ",");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "/" + "'", str63, "/");
        org.junit.Assert.assertNotNull(iterator71);
        org.junit.Assert.assertNotNull(iterator76);
        org.junit.Assert.assertNotNull(arrayList78);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 97 + "'", int84 == 97);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String str14 = extendedProperties5.file;
        // The following exception was thrown during execution in test generation
        try {
            float float16 = extendedProperties5.getFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.file;
        java.lang.Short short4 = extendedProperties0.getShort(",", (java.lang.Short) (short) 0);
        double double7 = extendedProperties0.getDouble("${", (double) (byte) 1);
        boolean boolean8 = extendedProperties0.isInitialized();
        java.lang.String str9 = extendedProperties0.basePath;
        extendedProperties0.fileSeparator = "/";
        short short14 = extendedProperties0.getShort("", (short) -1);
        java.util.List list16 = extendedProperties0.getList("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = extendedProperties0.getProperties("", properties2);
        extendedProperties0.setInclude("hi!");
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedProperties0.getLong("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties3);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.read();
        java.lang.String str3 = propertiesReader1.readProperty();
        propertiesReader1.mark(10);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader6 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        int int8 = propertiesReader1.read();
        propertiesReader1.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list3 = null;
        java.lang.String str4 = extendedProperties1.interpolateHelper("hi!", list3);
        java.lang.String str6 = extendedProperties1.interpolate("");
        java.lang.Object obj7 = extendedProperties0.remove((java.lang.Object) str6);
        java.lang.String str8 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties10.file = "hi!";
        java.util.Iterator iterator14 = extendedProperties10.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties15.file = "hi!";
        java.util.Iterator iterator19 = extendedProperties15.getKeys("");
        extendedProperties10.putAll((java.util.Map) extendedProperties15);
        java.lang.String str21 = extendedProperties10.fileSeparator;
        extendedProperties10.file = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties25.file = "hi!";
        java.util.Iterator iterator29 = extendedProperties25.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties30.file = "hi!";
        java.util.Iterator iterator34 = extendedProperties30.getKeys("");
        extendedProperties25.putAll((java.util.Map) extendedProperties30);
        java.util.ArrayList arrayList36 = extendedProperties30.keysAsListed;
        java.util.List list37 = extendedProperties10.getList("", (java.util.List) arrayList36);
        java.lang.String str38 = extendedProperties0.interpolateHelper("", (java.util.List) arrayList36);
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties40.file = "hi!";
        java.util.Iterator iterator44 = extendedProperties40.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties45.file = "hi!";
        java.util.Iterator iterator49 = extendedProperties45.getKeys("");
        extendedProperties40.putAll((java.util.Map) extendedProperties45);
        java.lang.String str53 = extendedProperties45.getString(",", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties55 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties55.file = "hi!";
        java.util.Iterator iterator59 = extendedProperties55.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties60 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties60.file = "hi!";
        java.util.Iterator iterator64 = extendedProperties60.getKeys("");
        extendedProperties55.putAll((java.util.Map) extendedProperties60);
        java.util.ArrayList arrayList66 = extendedProperties60.keysAsListed;
        java.lang.String str67 = extendedProperties45.interpolateHelper("/", (java.util.List) arrayList66);
        org.apache.commons.collections.ExtendedProperties extendedProperties68 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties70 = null;
        java.util.Properties properties71 = extendedProperties68.getProperties("", properties70);
        java.lang.Object obj72 = extendedProperties45.remove((java.lang.Object) properties71);
        java.util.Properties properties73 = extendedProperties0.getProperties("hi!", properties71);
        org.apache.commons.collections.ExtendedProperties extendedProperties74 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties73);
        double double77 = extendedProperties74.getDouble("}", (double) 1.0f);
        extendedProperties74.setInclude("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = extendedProperties74.getBoolean("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj7);
// flaky "9) test3067(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/" + "'", str21, "/");
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(arrayList36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "," + "'", str53, ",");
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertNotNull(arrayList66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "/" + "'", str67, "/");
        org.junit.Assert.assertNotNull(properties71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(properties73);
        org.junit.Assert.assertNotNull(extendedProperties74);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        long long5 = extendedProperties0.getLong("}", (long) (byte) -1);
        double double8 = extendedProperties0.getDouble("/", (double) 97);
        float float11 = extendedProperties0.getFloat("${", (float) 10L);
        java.lang.Byte byte14 = extendedProperties0.getByte("", (java.lang.Byte) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = extendedProperties0.getBoolean("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = extendedProperties0.getProperties("", properties2);
        java.lang.Short short6 = extendedProperties0.getShort("", (java.lang.Short) (short) 100);
        long long9 = extendedProperties0.getLong("${", (long) '#');
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list14 = null;
        java.lang.String str15 = extendedProperties12.interpolateHelper("hi!", list14);
        java.lang.String str17 = extendedProperties12.interpolate("");
        java.lang.Object obj18 = extendedProperties11.remove((java.lang.Object) str17);
        java.lang.String str19 = extendedProperties11.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties21.file = "hi!";
        java.util.Iterator iterator25 = extendedProperties21.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties26.file = "hi!";
        java.util.Iterator iterator30 = extendedProperties26.getKeys("");
        extendedProperties21.putAll((java.util.Map) extendedProperties26);
        java.lang.Short short34 = extendedProperties26.getShort("", (java.lang.Short) (short) 10);
        extendedProperties26.fileSeparator = "}";
        java.util.Vector vector38 = extendedProperties26.getVector("${");
        java.util.Vector vector39 = extendedProperties11.getVector("/", vector38);
        java.util.List list40 = extendedProperties0.getList("hi!", (java.util.List) vector39);
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties42.file = "hi!";
        java.util.Iterator iterator46 = extendedProperties42.getKeys("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list51 = null;
        java.lang.String str52 = extendedProperties49.interpolateHelper("hi!", list51);
        java.lang.String str54 = extendedProperties49.interpolate("");
        java.lang.Object obj55 = extendedProperties48.remove((java.lang.Object) str54);
        java.lang.Short short58 = extendedProperties48.getShort("/", (java.lang.Short) (short) 100);
        java.lang.String str60 = extendedProperties48.testBoolean("hi!");
        java.lang.String str61 = extendedProperties48.file;
        java.util.Vector vector63 = extendedProperties48.getVector(",");
        java.util.Vector vector64 = extendedProperties42.getVector("hi!", vector63);
        java.util.List list65 = extendedProperties0.getList("}", (java.util.List) vector63);
        boolean boolean66 = extendedProperties0.isInitialized;
        int int69 = extendedProperties0.getInt(",", 52);
        // The following exception was thrown during execution in test generation
        try {
            byte byte71 = extendedProperties0.getByte(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ', doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj18);
// flaky "10) test3069(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/" + "'", str19, "/");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 10 + "'", short34 == (short) 10);
        org.junit.Assert.assertNotNull(vector38);
        org.junit.Assert.assertNotNull(vector39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 100 + "'", short58 == (short) 100);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(vector63);
        org.junit.Assert.assertNotNull(vector64);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 52 + "'", int69 == 52);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        boolean boolean2 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str3 = propertiesTokenizer1.nextToken();
        java.lang.String str5 = propertiesTokenizer1.nextToken("/");
        java.util.Iterator<java.lang.Object> objItor6 = propertiesTokenizer1.asIterator();
        int int7 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        float float6 = extendedProperties0.getFloat("${", 0.0f);
        extendedProperties0.display();
        java.io.OutputStream outputStream8 = null;
        extendedProperties0.save(outputStream8, "");
        long long13 = extendedProperties0.getLong(",", 1L);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = extendedProperties0.subset("hi!");
        java.lang.Byte byte18 = extendedProperties0.getByte(",", (java.lang.Byte) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNull(extendedProperties15);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 10 + "'", byte18 == (byte) 10);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String[] strArray15 = extendedProperties5.getStringArray(",");
        short short18 = extendedProperties5.getShort("${", (short) (byte) -1);
        java.lang.Short short21 = extendedProperties5.getShort("}", (java.lang.Short) (short) 1);
        java.lang.String[] strArray23 = extendedProperties5.getStringArray("");
        java.io.Reader reader25 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader26 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader25);
        int int27 = propertiesReader26.read();
        long long29 = propertiesReader26.skip((long) (byte) 100);
        extendedProperties5.setProperty("/", (java.lang.Object) propertiesReader26);
        java.lang.Double double33 = extendedProperties5.getDouble("", (java.lang.Double) 97.0d);
        extendedProperties5.isInitialized = true;
        extendedProperties5.fileSeparator = "}";
        java.util.Properties properties39 = extendedProperties5.getProperties("}");
        extendedProperties5.setInclude("hi!");
        java.lang.Integer int44 = extendedProperties5.getInteger("", (java.lang.Integer) 52);
        short short47 = extendedProperties5.getShort("hi!", (short) (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = extendedProperties5.subset("}");
        short short52 = extendedProperties5.getShort("hi!", (short) (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 1 + "'", short21 == (short) 1);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) -1 + "'", short47 == (short) -1);
        org.junit.Assert.assertNull(extendedProperties49);
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 10 + "'", short52 == (short) 10);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String[] strArray15 = extendedProperties5.getStringArray(",");
        java.lang.String str17 = extendedProperties5.getString(",");
        java.lang.String str18 = extendedProperties5.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Byte byte23 = extendedProperties20.getByte("", (java.lang.Byte) (byte) 10);
        int int26 = extendedProperties20.getInt("hi!", (int) '4');
        java.util.Vector vector28 = extendedProperties20.getVector("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties30.file = "hi!";
        java.util.Iterator iterator34 = extendedProperties30.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties35.file = "hi!";
        java.util.Iterator iterator39 = extendedProperties35.getKeys("");
        extendedProperties30.putAll((java.util.Map) extendedProperties35);
        java.lang.Short short43 = extendedProperties35.getShort("", (java.lang.Short) (short) 10);
        extendedProperties35.fileSeparator = "}";
        java.util.Vector vector47 = extendedProperties35.getVector("${");
        java.lang.String str48 = extendedProperties20.interpolateHelper("}", (java.util.List) vector47);
        java.util.List list49 = extendedProperties5.getList("", (java.util.List) vector47);
        java.util.List list51 = extendedProperties5.getList("/");
        java.lang.Object obj53 = extendedProperties5.getProperty("${");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNull(str17);
// flaky "11) test3073(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/" + "'", str18, "/");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 10 + "'", byte23 == (byte) 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertNotNull(vector28);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) 10 + "'", short43 == (short) 10);
        org.junit.Assert.assertNotNull(vector47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "}" + "'", str48, "}");
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str11 = extendedProperties0.fileSeparator;
        extendedProperties0.file = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties15.file = "hi!";
        java.util.Iterator iterator19 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.file = "hi!";
        java.util.Iterator iterator24 = extendedProperties20.getKeys("");
        extendedProperties15.putAll((java.util.Map) extendedProperties20);
        java.util.ArrayList arrayList26 = extendedProperties20.keysAsListed;
        java.util.List list27 = extendedProperties0.getList("", (java.util.List) arrayList26);
        extendedProperties0.setInclude("}");
        int int32 = extendedProperties0.getInt("}", 52);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list36 = null;
        java.lang.String str37 = extendedProperties34.interpolateHelper("hi!", list36);
        java.lang.String str39 = extendedProperties34.interpolate("");
        java.lang.Object obj40 = extendedProperties33.remove((java.lang.Object) str39);
        java.lang.Short short43 = extendedProperties33.getShort("/", (java.lang.Short) (short) 100);
        java.lang.String str46 = extendedProperties33.getString("/", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties47.file = "hi!";
        java.util.Iterator iterator51 = extendedProperties47.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties52.file = "hi!";
        java.util.Iterator iterator56 = extendedProperties52.getKeys("");
        extendedProperties47.putAll((java.util.Map) extendedProperties52);
        java.lang.String str60 = extendedProperties52.getString(",", ",");
        java.lang.String[] strArray62 = extendedProperties52.getStringArray(",");
        short short65 = extendedProperties52.getShort("${", (short) (byte) -1);
        java.lang.Short short68 = extendedProperties52.getShort("}", (java.lang.Short) (short) 1);
        java.lang.String[] strArray70 = extendedProperties52.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties71 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties71.file = "hi!";
        byte byte76 = extendedProperties71.getByte("${", (byte) 10);
        boolean boolean77 = extendedProperties71.isInitialized();
        java.lang.Object obj78 = extendedProperties33.put((java.lang.Object) extendedProperties52, (java.lang.Object) boolean77);
        extendedProperties0.combine(extendedProperties52);
        java.lang.Object obj81 = extendedProperties52.getProperty("${");
        long long84 = extendedProperties52.getLong("", (long) 1);
        java.lang.String str86 = extendedProperties52.interpolate("");
        java.lang.Byte byte89 = extendedProperties52.getByte("${", (java.lang.Byte) (byte) 100);
        extendedProperties52.display();
        java.util.Vector vector92 = extendedProperties52.getVector("");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) 100 + "'", short43 == (short) 100);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "," + "'", str46, ",");
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "," + "'", str60, ",");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short65 + "' != '" + (short) -1 + "'", short65 == (short) -1);
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) 1 + "'", short68 == (short) 1);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 10 + "'", byte76 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1L + "'", long84 == 1L);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + byte89 + "' != '" + (byte) 100 + "'", byte89 == (byte) 100);
        org.junit.Assert.assertNotNull(vector92);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.util.ArrayList arrayList11 = extendedProperties5.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Byte byte15 = extendedProperties12.getByte("", (java.lang.Byte) (byte) 10);
        java.lang.Boolean boolean18 = extendedProperties12.getBoolean(",", (java.lang.Boolean) false);
        java.lang.Object obj20 = extendedProperties5.put((java.lang.Object) boolean18, (java.lang.Object) "/");
        int int23 = extendedProperties5.getInt("", (int) 'a');
        java.lang.Float float26 = extendedProperties5.getFloat("/", (java.lang.Float) 100.0f);
        java.lang.Double double29 = extendedProperties5.getDouble(",", (java.lang.Double) 52.0d);
        boolean boolean30 = extendedProperties5.isInitialized();
        byte byte33 = extendedProperties5.getByte("hi!", (byte) 1);
        java.lang.Byte byte36 = extendedProperties5.getByte(",", (java.lang.Byte) (byte) 100);
        java.util.Iterator iterator37 = extendedProperties5.getKeys();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 52.0d + "'", double29 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 1 + "'", byte33 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 100 + "'", byte36 == (byte) 100);
        org.junit.Assert.assertNotNull(iterator37);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String[] strArray15 = extendedProperties5.getStringArray(",");
        short short18 = extendedProperties5.getShort("${", (short) (byte) -1);
        java.lang.Short short21 = extendedProperties5.getShort("}", (java.lang.Short) (short) 1);
        java.lang.String[] strArray23 = extendedProperties5.getStringArray("");
        java.io.Reader reader25 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader26 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader25);
        int int27 = propertiesReader26.read();
        long long29 = propertiesReader26.skip((long) (byte) 100);
        extendedProperties5.setProperty("/", (java.lang.Object) propertiesReader26);
        int int33 = extendedProperties5.getInteger(",", 1);
        extendedProperties5.display();
        float float37 = extendedProperties5.getFloat("${", 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = extendedProperties5.getInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 1 + "'", short21 == (short) 1);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Byte byte3 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 10);
        java.lang.Boolean boolean6 = extendedProperties0.getBoolean(",", (java.lang.Boolean) false);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list11 = null;
        java.lang.String str12 = extendedProperties9.interpolateHelper("hi!", list11);
        java.lang.String str14 = extendedProperties9.interpolate("");
        java.lang.Object obj15 = extendedProperties8.remove((java.lang.Object) str14);
        java.lang.String str16 = extendedProperties8.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.file = "hi!";
        java.util.Iterator iterator22 = extendedProperties18.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties23.file = "hi!";
        java.util.Iterator iterator27 = extendedProperties23.getKeys("");
        extendedProperties18.putAll((java.util.Map) extendedProperties23);
        java.lang.Short short31 = extendedProperties23.getShort("", (java.lang.Short) (short) 10);
        extendedProperties23.fileSeparator = "}";
        java.util.Vector vector35 = extendedProperties23.getVector("${");
        java.util.Vector vector36 = extendedProperties8.getVector("/", vector35);
        java.lang.Integer int39 = extendedProperties8.getInteger("}", (java.lang.Integer) 97);
        java.lang.String str42 = extendedProperties8.getString("}", "hi!");
        java.lang.Long long45 = extendedProperties8.getLong(",", (java.lang.Long) 0L);
        java.lang.String[] strArray47 = extendedProperties8.getStringArray(",");
        extendedProperties0.setProperty("}", (java.lang.Object) extendedProperties8);
        java.lang.Object obj50 = extendedProperties8.getProperty("/");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj15);
// flaky "12) test3077(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/" + "'", str16, "/");
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 10 + "'", short31 == (short) 10);
        org.junit.Assert.assertNotNull(vector35);
        org.junit.Assert.assertNotNull(vector36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        extendedProperties5.fileSeparator = ",";
        int int15 = extendedProperties5.getInteger("hi!", (-1));
        extendedProperties5.setInclude("");
        java.lang.Float float20 = extendedProperties5.getFloat("hi!", (java.lang.Float) 0.0f);
        boolean boolean21 = extendedProperties5.isInitialized;
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str12 = extendedProperties5.interpolate("}");
        java.lang.String str14 = extendedProperties5.interpolate("}");
        java.lang.String str16 = extendedProperties5.testBoolean("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedProperties5.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "}" + "'", str14, "}");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        boolean boolean2 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str3 = propertiesTokenizer1.nextToken();
        java.lang.String str5 = propertiesTokenizer1.nextToken("/");
        java.lang.Object obj6 = propertiesTokenizer1.nextElement();
        boolean boolean7 = propertiesTokenizer1.hasMoreTokens();
        java.lang.Object obj8 = propertiesTokenizer1.nextElement();
        java.lang.String str10 = propertiesTokenizer1.nextToken("/");
        boolean boolean11 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean12 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str14 = propertiesTokenizer1.nextToken("${");
        boolean boolean15 = propertiesTokenizer1.hasMoreElements();
        boolean boolean16 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.getLineNumber();
        propertiesReader1.mark((int) (short) 0);
        propertiesReader1.reset();
        java.lang.String str6 = propertiesReader1.readLine();
        propertiesReader1.setLineNumber((int) (short) 10);
        java.lang.String str9 = propertiesReader1.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties15.file = "hi!";
        java.util.Iterator iterator19 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.file = "hi!";
        java.util.Iterator iterator24 = extendedProperties20.getKeys("");
        extendedProperties15.putAll((java.util.Map) extendedProperties20);
        java.util.ArrayList arrayList26 = extendedProperties20.keysAsListed;
        java.lang.String str27 = extendedProperties5.interpolateHelper("/", (java.util.List) arrayList26);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties30 = null;
        java.util.Properties properties31 = extendedProperties28.getProperties("", properties30);
        java.lang.Object obj32 = extendedProperties5.remove((java.lang.Object) properties31);
        java.lang.String str33 = extendedProperties5.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties34.file = "hi!";
        java.util.Iterator iterator38 = extendedProperties34.getKeys("");
        long long41 = extendedProperties34.getLong("${", (long) (byte) -1);
        java.lang.Boolean boolean44 = extendedProperties34.getBoolean("/", (java.lang.Boolean) true);
        extendedProperties34.setInclude("}");
        java.lang.Byte byte49 = extendedProperties34.getByte("hi!", (java.lang.Byte) (byte) -1);
        boolean boolean52 = extendedProperties34.getBoolean("}", true);
        extendedProperties5.combine(extendedProperties34);
        java.util.List list55 = extendedProperties34.getList("hi!");
        java.lang.String str56 = extendedProperties34.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties57 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties57.file = "hi!";
        java.util.Iterator iterator61 = extendedProperties57.getKeys("");
        java.lang.String str62 = extendedProperties57.basePath;
        java.lang.String str63 = extendedProperties57.basePath;
        extendedProperties57.basePath = "}";
        short short68 = extendedProperties57.getShort("/", (short) 0);
        java.lang.Object obj70 = extendedProperties57.getProperty("");
        java.lang.Object obj72 = extendedProperties57.getProperty("");
        extendedProperties57.display();
        java.lang.Boolean boolean76 = extendedProperties57.getBoolean("}", (java.lang.Boolean) true);
        org.apache.commons.collections.ExtendedProperties extendedProperties78 = extendedProperties57.subset("}");
        extendedProperties34.combine(extendedProperties57);
        java.lang.Short short82 = extendedProperties34.getShort(",", (java.lang.Short) (short) 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/" + "'", str27, "/");
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) -1 + "'", byte49 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) 0 + "'", short68 == (short) 0);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(extendedProperties78);
        org.junit.Assert.assertTrue("'" + short82 + "' != '" + (short) 0 + "'", short82 == (short) 0);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        extendedProperties5.fileSeparator = ",";
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.file = "hi!";
        java.util.Iterator iterator18 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties19.file = "hi!";
        java.util.Iterator iterator23 = extendedProperties19.getKeys("");
        extendedProperties14.putAll((java.util.Map) extendedProperties19);
        java.lang.String str27 = extendedProperties19.getString(",", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties29.file = "hi!";
        java.util.Iterator iterator33 = extendedProperties29.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties34.file = "hi!";
        java.util.Iterator iterator38 = extendedProperties34.getKeys("");
        extendedProperties29.putAll((java.util.Map) extendedProperties34);
        java.util.ArrayList arrayList40 = extendedProperties34.keysAsListed;
        java.lang.String str41 = extendedProperties19.interpolateHelper("/", (java.util.List) arrayList40);
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties44 = null;
        java.util.Properties properties45 = extendedProperties42.getProperties("", properties44);
        java.lang.Object obj46 = extendedProperties19.remove((java.lang.Object) properties45);
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties45);
        java.util.Properties properties48 = extendedProperties5.getProperties("${", properties45);
        java.io.OutputStream outputStream49 = null;
        extendedProperties5.save(outputStream49, "${");
        java.lang.String str52 = extendedProperties5.fileSeparator;
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "," + "'", str27, ",");
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(arrayList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "/" + "'", str41, "/");
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(extendedProperties47);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "," + "'", str52, ",");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.file;
        java.lang.Short short4 = extendedProperties0.getShort(",", (java.lang.Short) (short) 0);
        double double7 = extendedProperties0.getDouble("${", (double) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties11 = null;
        java.util.Properties properties12 = extendedProperties9.getProperties("", properties11);
        java.lang.Short short15 = extendedProperties9.getShort("", (java.lang.Short) (short) 100);
        long long18 = extendedProperties9.getLong("${", (long) '#');
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list23 = null;
        java.lang.String str24 = extendedProperties21.interpolateHelper("hi!", list23);
        java.lang.String str26 = extendedProperties21.interpolate("");
        java.lang.Object obj27 = extendedProperties20.remove((java.lang.Object) str26);
        java.lang.String str28 = extendedProperties20.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties30.file = "hi!";
        java.util.Iterator iterator34 = extendedProperties30.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties35.file = "hi!";
        java.util.Iterator iterator39 = extendedProperties35.getKeys("");
        extendedProperties30.putAll((java.util.Map) extendedProperties35);
        java.lang.Short short43 = extendedProperties35.getShort("", (java.lang.Short) (short) 10);
        extendedProperties35.fileSeparator = "}";
        java.util.Vector vector47 = extendedProperties35.getVector("${");
        java.util.Vector vector48 = extendedProperties20.getVector("/", vector47);
        java.util.List list49 = extendedProperties9.getList("hi!", (java.util.List) vector48);
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties51.file = "hi!";
        java.util.Iterator iterator55 = extendedProperties51.getKeys("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties57 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list60 = null;
        java.lang.String str61 = extendedProperties58.interpolateHelper("hi!", list60);
        java.lang.String str63 = extendedProperties58.interpolate("");
        java.lang.Object obj64 = extendedProperties57.remove((java.lang.Object) str63);
        java.lang.Short short67 = extendedProperties57.getShort("/", (java.lang.Short) (short) 100);
        java.lang.String str69 = extendedProperties57.testBoolean("hi!");
        java.lang.String str70 = extendedProperties57.file;
        java.util.Vector vector72 = extendedProperties57.getVector(",");
        java.util.Vector vector73 = extendedProperties51.getVector("hi!", vector72);
        java.util.List list74 = extendedProperties9.getList("}", (java.util.List) vector72);
        java.util.List list75 = extendedProperties0.getList("}", (java.util.List) vector72);
        extendedProperties0.basePath = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties79 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties80 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list82 = null;
        java.lang.String str83 = extendedProperties80.interpolateHelper("hi!", list82);
        java.lang.String str85 = extendedProperties80.interpolate("");
        java.lang.Object obj86 = extendedProperties79.remove((java.lang.Object) str85);
        java.lang.Short short89 = extendedProperties79.getShort("/", (java.lang.Short) (short) 100);
        java.lang.String str91 = extendedProperties79.testBoolean("hi!");
        java.lang.String str92 = extendedProperties79.file;
        java.util.Vector vector94 = extendedProperties79.getVector(",");
        java.util.Vector vector95 = extendedProperties0.getVector("hi!", vector94);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(obj27);
// flaky "13) test3084(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/" + "'", str28, "/");
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) 10 + "'", short43 == (short) 10);
        org.junit.Assert.assertNotNull(vector47);
        org.junit.Assert.assertNotNull(vector48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + short67 + "' != '" + (short) 100 + "'", short67 == (short) 100);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(vector72);
        org.junit.Assert.assertNotNull(vector73);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + short89 + "' != '" + (short) 100 + "'", short89 == (short) 100);
        org.junit.Assert.assertNull(str91);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNotNull(vector94);
        org.junit.Assert.assertNotNull(vector95);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.file;
        java.lang.Short short4 = extendedProperties0.getShort(",", (java.lang.Short) (short) 0);
        extendedProperties0.clearProperty("hi!");
        extendedProperties0.clearProperty("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list3 = null;
        java.lang.String str4 = extendedProperties1.interpolateHelper("hi!", list3);
        java.lang.String str6 = extendedProperties1.interpolate("");
        java.lang.Object obj7 = extendedProperties0.remove((java.lang.Object) str6);
        java.lang.String str8 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties10.file = "hi!";
        java.util.Iterator iterator14 = extendedProperties10.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties15.file = "hi!";
        java.util.Iterator iterator19 = extendedProperties15.getKeys("");
        extendedProperties10.putAll((java.util.Map) extendedProperties15);
        java.lang.Short short23 = extendedProperties15.getShort("", (java.lang.Short) (short) 10);
        extendedProperties15.fileSeparator = "}";
        java.util.Vector vector27 = extendedProperties15.getVector("${");
        java.util.Vector vector28 = extendedProperties0.getVector("/", vector27);
        byte byte31 = extendedProperties0.getByte("", (byte) 1);
        float float34 = extendedProperties0.getFloat(",", (float) (byte) -1);
        int int37 = extendedProperties0.getInt("hi!", (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj7);
// flaky "14) test3086(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 10 + "'", short23 == (short) 10);
        org.junit.Assert.assertNotNull(vector27);
        org.junit.Assert.assertNotNull(vector28);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 1 + "'", byte31 == (byte) 1);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-1.0f) + "'", float34 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String[] strArray15 = extendedProperties5.getStringArray(",");
        java.lang.Long long18 = extendedProperties5.getLong("/", (java.lang.Long) (-1L));
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties19.file = "hi!";
        java.util.Iterator iterator23 = extendedProperties19.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties24.file = "hi!";
        java.util.Iterator iterator28 = extendedProperties24.getKeys("");
        extendedProperties19.putAll((java.util.Map) extendedProperties24);
        java.lang.String str31 = extendedProperties24.interpolate("}");
        extendedProperties24.clearProperty("hi!");
        short short36 = extendedProperties24.getShort("", (short) (byte) 0);
        java.lang.Double double39 = extendedProperties24.getDouble("}", (java.lang.Double) 97.0d);
        java.lang.String str41 = extendedProperties24.interpolate("hi!");
        boolean boolean42 = extendedProperties24.isInitialized;
        java.lang.Boolean boolean45 = extendedProperties24.getBoolean("}", (java.lang.Boolean) true);
        extendedProperties5.combine(extendedProperties24);
        // The following exception was thrown during execution in test generation
        try {
            long long48 = extendedProperties5.getLong("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "}" + "'", str31, "}");
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 0 + "'", short36 == (short) 0);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.getLineNumber();
        propertiesReader1.mark((int) (short) 0);
        propertiesReader1.reset();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader1.lines();
        java.io.Reader reader7 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader8 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader7);
        int int9 = propertiesReader8.read();
        java.lang.String str10 = propertiesReader8.readProperty();
        propertiesReader8.setLineNumber((int) '4');
        char[] charArray14 = new char[] { 'a' };
        int int15 = propertiesReader8.read(charArray14);
        int int16 = propertiesReader1.read(charArray14);
        java.lang.String str17 = propertiesReader1.readLine();
        int int18 = propertiesReader1.read();
        boolean boolean19 = propertiesReader1.markSupported();
        java.lang.String str20 = propertiesReader1.readProperty();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        java.lang.String str5 = extendedProperties0.basePath;
        java.lang.Byte byte8 = extendedProperties0.getByte("hi!", (java.lang.Byte) (byte) 1);
        extendedProperties0.fileSeparator = "}";
        boolean boolean13 = extendedProperties0.getBoolean("}", false);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list18 = null;
        java.lang.String str19 = extendedProperties16.interpolateHelper("hi!", list18);
        java.lang.String str21 = extendedProperties16.interpolate("");
        java.lang.Object obj22 = extendedProperties15.remove((java.lang.Object) str21);
        java.lang.Short short25 = extendedProperties15.getShort("/", (java.lang.Short) (short) 100);
        java.lang.String str27 = extendedProperties15.testBoolean("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties28.file = "hi!";
        java.util.Iterator iterator32 = extendedProperties28.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties33.file = "hi!";
        java.util.Iterator iterator37 = extendedProperties33.getKeys("");
        extendedProperties28.putAll((java.util.Map) extendedProperties33);
        java.lang.Short short41 = extendedProperties33.getShort("", (java.lang.Short) (short) 10);
        extendedProperties33.fileSeparator = "}";
        java.lang.Boolean boolean46 = extendedProperties33.getBoolean("${", (java.lang.Boolean) false);
        extendedProperties15.combine(extendedProperties33);
        java.util.List list49 = extendedProperties15.getList("${");
        java.lang.String str50 = extendedProperties0.interpolateHelper("/", list49);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 100 + "'", short25 == (short) 100);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) 10 + "'", short41 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "/" + "'", str50, "/");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list3 = null;
        java.lang.String str4 = extendedProperties1.interpolateHelper("hi!", list3);
        java.lang.String str6 = extendedProperties1.interpolate("");
        java.lang.Object obj7 = extendedProperties0.remove((java.lang.Object) str6);
        java.lang.String str8 = extendedProperties0.getInclude();
        extendedProperties0.fileSeparator = "${";
        java.io.Reader reader12 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader13 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader12);
        int int14 = propertiesReader13.read();
        long long16 = propertiesReader13.skip((long) (byte) 100);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader13);
        extendedProperties0.setProperty("}", (java.lang.Object) propertiesReader13);
        java.lang.String str20 = extendedProperties0.testBoolean(",");
        boolean boolean23 = extendedProperties0.getBoolean("hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj7);
// flaky "15) test3090(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        double double16 = extendedProperties5.getDouble("${", (double) (short) -1);
        float float19 = extendedProperties5.getFloat(",", (float) '4');
        java.lang.String str22 = extendedProperties5.getString("${", "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list27 = null;
        java.lang.String str28 = extendedProperties25.interpolateHelper("hi!", list27);
        java.lang.String str30 = extendedProperties25.interpolate("");
        java.lang.Object obj31 = extendedProperties24.remove((java.lang.Object) str30);
        java.lang.String str32 = extendedProperties24.getInclude();
        java.lang.String str35 = extendedProperties24.getString("", "");
        java.util.ArrayList arrayList36 = extendedProperties24.keysAsListed;
        java.util.List list37 = extendedProperties5.getList("/", (java.util.List) arrayList36);
        java.io.Reader reader39 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader40 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader39);
        java.io.Reader reader41 = java.io.Reader.nullReader();
        char[] charArray47 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int48 = reader41.read(charArray47);
        int int49 = propertiesReader40.read(charArray47);
        extendedProperties5.addProperty("}", (java.lang.Object) propertiesReader40);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader51 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader40);
        boolean boolean52 = propertiesReader40.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader53 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader40);
        int int54 = propertiesReader40.getLineNumber();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 52.0f + "'", float19 == 52.0f);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(obj31);
// flaky "16) test3091(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "/" + "'", str32, "/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(arrayList36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(reader39);
        org.junit.Assert.assertNotNull(reader41);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.file;
        java.lang.Short short4 = extendedProperties0.getShort(",", (java.lang.Short) (short) 0);
        double double7 = extendedProperties0.getDouble("${", (double) (byte) 1);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader8);
        java.lang.String str10 = propertiesReader9.readProperty();
        propertiesReader9.mark((int) (byte) 100);
        java.util.stream.Stream<java.lang.String> strStream13 = propertiesReader9.lines();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader14 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader9);
        java.lang.Object obj15 = extendedProperties0.remove((java.lang.Object) propertiesReader14);
        java.lang.String str16 = propertiesReader14.readLine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.getLineNumber();
        propertiesReader1.mark((int) (short) 0);
        int int5 = propertiesReader1.getLineNumber();
        propertiesReader1.mark(0);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader8 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        java.lang.String str9 = propertiesReader8.readProperty();
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties10.file = "hi!";
        java.util.Iterator iterator14 = extendedProperties10.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties15.file = "hi!";
        java.util.Iterator iterator19 = extendedProperties15.getKeys("");
        extendedProperties10.putAll((java.util.Map) extendedProperties15);
        java.lang.String str23 = extendedProperties15.getString(",", ",");
        java.lang.String[] strArray25 = extendedProperties15.getStringArray(",");
        short short28 = extendedProperties15.getShort("${", (short) (byte) -1);
        java.lang.Short short31 = extendedProperties15.getShort("}", (java.lang.Short) (short) 1);
        java.lang.String[] strArray33 = extendedProperties15.getStringArray("");
        java.io.Reader reader35 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader36 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader35);
        int int37 = propertiesReader36.read();
        long long39 = propertiesReader36.skip((long) (byte) 100);
        extendedProperties15.setProperty("/", (java.lang.Object) propertiesReader36);
        java.io.Reader reader41 = java.io.Reader.nullReader();
        char[] charArray47 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int48 = reader41.read(charArray47);
        int int49 = propertiesReader36.read(charArray47);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = propertiesReader8.read(charArray47, (int) (short) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "," + "'", str23, ",");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) -1 + "'", short28 == (short) -1);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 1 + "'", short31 == (short) 1);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(reader35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(reader41);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.lang.String str2 = propertiesReader1.readProperty();
        java.util.stream.Stream<java.lang.String> strStream3 = propertiesReader1.lines();
        long long5 = propertiesReader1.skip((long) (byte) 0);
        long long7 = propertiesReader1.skip((long) 0);
        propertiesReader1.mark((int) (byte) 100);
        java.io.Reader reader10 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader10);
        java.io.Reader reader12 = java.io.Reader.nullReader();
        char[] charArray18 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int19 = reader12.read(charArray18);
        int int20 = propertiesReader11.read(charArray18);
        java.lang.String str21 = propertiesReader11.readProperty();
        int int22 = propertiesReader11.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader23 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader11);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader24 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader23);
        java.io.Reader reader25 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader26 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader25);
        java.lang.String str27 = propertiesReader26.readProperty();
        propertiesReader26.mark((int) (byte) 100);
        java.util.stream.Stream<java.lang.String> strStream30 = propertiesReader26.lines();
        propertiesReader26.mark((int) (short) 100);
        char[] charArray37 = new char[] { 'a', '#', '4', '#' };
        int int38 = propertiesReader26.read(charArray37);
        int int39 = propertiesReader24.read(charArray37);
        int int40 = propertiesReader1.read(charArray37);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strStream30);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { 'a', '#', '4', '#' });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.lang.String str2 = propertiesReader1.readProperty();
        propertiesReader1.mark((int) (byte) 100);
        java.util.stream.Stream<java.lang.String> strStream5 = propertiesReader1.lines();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader6 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        boolean boolean7 = propertiesReader1.markSupported();
        propertiesReader1.reset();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.lang.String str2 = propertiesReader1.readProperty();
        int int3 = propertiesReader1.getLineNumber();
        propertiesReader1.setLineNumber(32);
        int int6 = propertiesReader1.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        long long5 = extendedProperties0.getLong("}", (long) (byte) -1);
        byte byte8 = extendedProperties0.getByte("${", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties10.file = "hi!";
        java.util.Iterator iterator14 = extendedProperties10.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties15.file = "hi!";
        java.util.Iterator iterator19 = extendedProperties15.getKeys("");
        extendedProperties10.putAll((java.util.Map) extendedProperties15);
        java.util.ArrayList arrayList21 = extendedProperties15.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Byte byte25 = extendedProperties22.getByte("", (java.lang.Byte) (byte) 10);
        java.lang.Boolean boolean28 = extendedProperties22.getBoolean(",", (java.lang.Boolean) false);
        java.lang.Object obj30 = extendedProperties15.put((java.lang.Object) boolean28, (java.lang.Object) "/");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.file = "hi!";
        java.util.Iterator iterator35 = extendedProperties31.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties36.file = "hi!";
        java.util.Iterator iterator40 = extendedProperties36.getKeys("");
        extendedProperties31.putAll((java.util.Map) extendedProperties36);
        java.lang.String str44 = extendedProperties36.getString(",", ",");
        java.lang.String str45 = extendedProperties36.file;
        extendedProperties15.putAll((java.util.Map) extendedProperties36);
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list51 = null;
        java.lang.String str52 = extendedProperties49.interpolateHelper("hi!", list51);
        java.lang.String str54 = extendedProperties49.interpolate("");
        java.lang.Object obj55 = extendedProperties48.remove((java.lang.Object) str54);
        java.lang.String str56 = extendedProperties48.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties58.file = "hi!";
        java.util.Iterator iterator62 = extendedProperties58.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties63 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties63.file = "hi!";
        java.util.Iterator iterator67 = extendedProperties63.getKeys("");
        extendedProperties58.putAll((java.util.Map) extendedProperties63);
        java.lang.Short short71 = extendedProperties63.getShort("", (java.lang.Short) (short) 10);
        extendedProperties63.fileSeparator = "}";
        java.util.Vector vector75 = extendedProperties63.getVector("${");
        java.util.Vector vector76 = extendedProperties48.getVector("/", vector75);
        java.util.List list77 = extendedProperties36.getList(",", (java.util.List) vector76);
        java.util.Vector vector78 = extendedProperties0.getVector("${", vector76);
        extendedProperties0.fileSeparator = "/";
        boolean boolean83 = extendedProperties0.getBoolean(",", true);
        java.io.InputStream inputStream84 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(arrayList21);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 10 + "'", byte25 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "," + "'", str44, ",");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(obj55);
// flaky "17) test3097(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "/" + "'", str56, "/");
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) 10 + "'", short71 == (short) 10);
        org.junit.Assert.assertNotNull(vector75);
        org.junit.Assert.assertNotNull(vector76);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertNotNull(vector78);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.getLineNumber();
        propertiesReader1.mark((int) (short) 0);
        int int5 = propertiesReader1.getLineNumber();
        propertiesReader1.mark(0);
        long long9 = propertiesReader1.skip(100L);
        java.util.stream.Stream<java.lang.String> strStream10 = propertiesReader1.lines();
        java.lang.String str11 = propertiesReader1.readLine();
        java.lang.String str12 = propertiesReader1.readLine();
        int int13 = propertiesReader1.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream14 = propertiesReader1.lines();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strStream14);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.getLineNumber();
        int int3 = propertiesReader1.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream4 = propertiesReader1.lines();
        int int5 = propertiesReader1.read();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        double double16 = extendedProperties5.getDouble("${", (double) (short) -1);
        float float19 = extendedProperties5.getFloat(",", (float) (short) 100);
        java.lang.String str20 = extendedProperties5.fileSeparator;
        boolean boolean21 = extendedProperties5.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list26 = null;
        java.lang.String str27 = extendedProperties24.interpolateHelper("hi!", list26);
        java.lang.String str29 = extendedProperties24.interpolate("");
        java.lang.Object obj30 = extendedProperties23.remove((java.lang.Object) str29);
        java.lang.Short short33 = extendedProperties23.getShort("/", (java.lang.Short) (short) 100);
        byte byte36 = extendedProperties23.getByte("}", (byte) -1);
        java.util.Properties properties38 = extendedProperties23.getProperties("");
        java.util.Properties properties39 = extendedProperties5.getProperties("}", properties38);
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list44 = null;
        java.lang.String str45 = extendedProperties42.interpolateHelper("hi!", list44);
        java.lang.String str47 = extendedProperties42.interpolate("");
        java.lang.Object obj48 = extendedProperties41.remove((java.lang.Object) str47);
        java.lang.String str49 = extendedProperties41.getInclude();
        java.lang.String str52 = extendedProperties41.getString("", "");
        java.util.ArrayList arrayList53 = extendedProperties41.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties41.combine(extendedProperties54);
        int int58 = extendedProperties41.getInteger("hi!", 1);
        java.util.Vector vector60 = extendedProperties41.getVector("");
        extendedProperties5.setProperty("/", (java.lang.Object) vector60);
        org.apache.commons.collections.ExtendedProperties extendedProperties63 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties63.file = "hi!";
        double double68 = extendedProperties63.getDouble("${", (double) 100.0f);
        java.util.Properties properties70 = extendedProperties63.getProperties(",");
        java.util.Properties properties71 = extendedProperties5.getProperties("${", properties70);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 100 + "'", short33 == (short) 100);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) -1 + "'", byte36 == (byte) -1);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(obj48);
// flaky "18) test3100(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "/" + "'", str49, "/");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(arrayList53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(vector60);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
        org.junit.Assert.assertNotNull(properties70);
        org.junit.Assert.assertNotNull(properties71);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        java.lang.String str5 = extendedProperties0.basePath;
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.String str7 = extendedProperties0.basePath;
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties4.file = "hi!";
        byte byte9 = extendedProperties4.getByte("${", (byte) 10);
        extendedProperties4.display();
        extendedProperties0.combine(extendedProperties4);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.file = "hi!";
        java.util.Iterator iterator16 = extendedProperties12.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.file = "hi!";
        java.util.Iterator iterator21 = extendedProperties17.getKeys("");
        extendedProperties12.putAll((java.util.Map) extendedProperties17);
        java.lang.String str23 = extendedProperties12.fileSeparator;
        extendedProperties12.file = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties27.file = "hi!";
        java.util.Iterator iterator31 = extendedProperties27.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.file = "hi!";
        java.util.Iterator iterator36 = extendedProperties32.getKeys("");
        extendedProperties27.putAll((java.util.Map) extendedProperties32);
        java.util.ArrayList arrayList38 = extendedProperties32.keysAsListed;
        java.util.List list39 = extendedProperties12.getList("", (java.util.List) arrayList38);
        extendedProperties0.keysAsListed = arrayList38;
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = extendedProperties0.subset(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties46.file = "hi!";
        java.util.Iterator iterator50 = extendedProperties46.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties51.file = "hi!";
        java.util.Iterator iterator55 = extendedProperties51.getKeys("");
        extendedProperties46.putAll((java.util.Map) extendedProperties51);
        java.lang.String str57 = extendedProperties46.fileSeparator;
        extendedProperties46.display();
        java.lang.Long long61 = extendedProperties46.getLong("", (java.lang.Long) (-1L));
        java.util.Vector vector63 = extendedProperties46.getVector("}");
        java.lang.Long long66 = extendedProperties46.getLong("/", (java.lang.Long) 1L);
        java.util.ArrayList arrayList67 = extendedProperties46.keysAsListed;
        java.util.List list68 = extendedProperties0.getList("}", (java.util.List) arrayList67);
        java.io.InputStream inputStream69 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream69, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/" + "'", str23, "/");
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(arrayList38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNull(extendedProperties44);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "/" + "'", str57, "/");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
        org.junit.Assert.assertNotNull(vector63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertNotNull(arrayList67);
        org.junit.Assert.assertNotNull(list68);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.util.ArrayList arrayList11 = extendedProperties5.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Byte byte15 = extendedProperties12.getByte("", (java.lang.Byte) (byte) 10);
        java.lang.Boolean boolean18 = extendedProperties12.getBoolean(",", (java.lang.Boolean) false);
        java.lang.Object obj20 = extendedProperties5.put((java.lang.Object) boolean18, (java.lang.Object) "/");
        java.lang.String str22 = extendedProperties5.interpolate(",");
        java.lang.Integer int25 = extendedProperties5.getInteger("hi!", (java.lang.Integer) 97);
        boolean boolean28 = extendedProperties5.getBoolean("hi!", true);
        java.io.OutputStream outputStream29 = null;
        extendedProperties5.save(outputStream29, "/");
        java.lang.String str32 = extendedProperties5.file;
        java.lang.Double double35 = extendedProperties5.getDouble(",", (java.lang.Double) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            float float37 = extendedProperties5.getFloat(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "," + "'", str22, ",");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties4.file = "hi!";
        byte byte9 = extendedProperties4.getByte("${", (byte) 10);
        extendedProperties4.display();
        extendedProperties0.combine(extendedProperties4);
        java.lang.String str14 = extendedProperties0.getString("${", "${");
        extendedProperties0.basePath = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.file = "hi!";
        java.util.Iterator iterator21 = extendedProperties17.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.file = "hi!";
        java.util.Iterator iterator26 = extendedProperties22.getKeys("");
        extendedProperties17.putAll((java.util.Map) extendedProperties22);
        java.lang.String str30 = extendedProperties22.getString(",", ",");
        double double33 = extendedProperties22.getDouble("${", (double) (short) -1);
        float float36 = extendedProperties22.getFloat(",", (float) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties38.file = "hi!";
        java.util.Iterator iterator42 = extendedProperties38.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties43.file = "hi!";
        java.util.Iterator iterator47 = extendedProperties43.getKeys("");
        extendedProperties38.putAll((java.util.Map) extendedProperties43);
        java.lang.String str51 = extendedProperties43.getString(",", ",");
        java.lang.String[] strArray53 = extendedProperties43.getStringArray(",");
        short short56 = extendedProperties43.getShort("${", (short) (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties58.file = "hi!";
        java.util.Iterator iterator62 = extendedProperties58.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties63 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties63.file = "hi!";
        java.util.Iterator iterator67 = extendedProperties63.getKeys("");
        extendedProperties58.putAll((java.util.Map) extendedProperties63);
        java.util.ArrayList arrayList69 = extendedProperties63.keysAsListed;
        java.lang.String str70 = extendedProperties43.interpolateHelper("/", (java.util.List) arrayList69);
        java.lang.String str71 = extendedProperties22.interpolateHelper("${", (java.util.List) arrayList69);
        extendedProperties0.keysAsListed = arrayList69;
        java.lang.Short short75 = extendedProperties0.getShort(",", (java.lang.Short) (short) 0);
        java.util.Iterator iterator76 = extendedProperties0.getKeys();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "${" + "'", str14, "${");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "," + "'", str30, ",");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "," + "'", str51, ",");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) -1 + "'", short56 == (short) -1);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertNotNull(arrayList69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "/" + "'", str70, "/");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "${" + "'", str71, "${");
        org.junit.Assert.assertTrue("'" + short75 + "' != '" + (short) 0 + "'", short75 == (short) 0);
        org.junit.Assert.assertNotNull(iterator76);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        double double16 = extendedProperties5.getDouble("${", (double) (short) -1);
        java.util.List list18 = extendedProperties5.getList("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties19.file = "hi!";
        java.util.Iterator iterator23 = extendedProperties19.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties24.file = "hi!";
        java.util.Iterator iterator28 = extendedProperties24.getKeys("");
        extendedProperties19.putAll((java.util.Map) extendedProperties24);
        java.lang.String str32 = extendedProperties24.getString(",", ",");
        java.lang.String[] strArray34 = extendedProperties24.getStringArray(",");
        boolean boolean35 = extendedProperties24.isInitialized;
        extendedProperties24.file = "${";
        extendedProperties5.combine(extendedProperties24);
        extendedProperties24.addProperty("}", (java.lang.Object) ",");
        extendedProperties24.file = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties44.file = "hi!";
        java.util.Iterator iterator48 = extendedProperties44.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties49.file = "hi!";
        java.util.Iterator iterator53 = extendedProperties49.getKeys("");
        extendedProperties44.putAll((java.util.Map) extendedProperties49);
        java.lang.String str55 = extendedProperties44.fileSeparator;
        extendedProperties44.file = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties59 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties59.file = "hi!";
        java.util.Iterator iterator63 = extendedProperties59.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties64 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties64.file = "hi!";
        java.util.Iterator iterator68 = extendedProperties64.getKeys("");
        extendedProperties59.putAll((java.util.Map) extendedProperties64);
        java.util.ArrayList arrayList70 = extendedProperties64.keysAsListed;
        java.util.List list71 = extendedProperties44.getList("}", (java.util.List) arrayList70);
        extendedProperties24.keysAsListed = arrayList70;
        short short75 = extendedProperties24.getShort("/", (short) (byte) 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "," + "'", str32, ",");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "/" + "'", str55, "/");
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertNotNull(arrayList70);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertTrue("'" + short75 + "' != '" + (short) 0 + "'", short75 == (short) 0);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String[] strArray15 = extendedProperties5.getStringArray(",");
        short short18 = extendedProperties5.getShort("${", (short) (byte) -1);
        short short21 = extendedProperties5.getShort("hi!", (short) 0);
        byte byte24 = extendedProperties5.getByte("", (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties26.file = "hi!";
        java.util.Iterator iterator30 = extendedProperties26.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.file = "hi!";
        java.util.Iterator iterator35 = extendedProperties31.getKeys("");
        extendedProperties26.putAll((java.util.Map) extendedProperties31);
        java.lang.String str39 = extendedProperties31.getString(",", ",");
        double double42 = extendedProperties31.getDouble("${", (double) (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties46 = null;
        java.util.Properties properties47 = extendedProperties44.getProperties("", properties46);
        java.util.Properties properties48 = extendedProperties31.getProperties("}", properties46);
        java.util.Properties properties49 = extendedProperties5.getProperties("hi!", properties46);
        java.lang.String str50 = extendedProperties5.file;
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "," + "'", str39, ",");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.util.ArrayList arrayList11 = extendedProperties5.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Byte byte15 = extendedProperties12.getByte("", (java.lang.Byte) (byte) 10);
        java.lang.Boolean boolean18 = extendedProperties12.getBoolean(",", (java.lang.Boolean) false);
        java.lang.Object obj20 = extendedProperties5.put((java.lang.Object) boolean18, (java.lang.Object) "/");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties21.file = "hi!";
        java.util.Iterator iterator25 = extendedProperties21.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties26.file = "hi!";
        java.util.Iterator iterator30 = extendedProperties26.getKeys("");
        extendedProperties21.putAll((java.util.Map) extendedProperties26);
        java.lang.String str34 = extendedProperties26.getString(",", ",");
        java.lang.String str35 = extendedProperties26.file;
        extendedProperties5.putAll((java.util.Map) extendedProperties26);
        byte byte39 = extendedProperties26.getByte("}", (byte) -1);
        java.lang.String str40 = extendedProperties26.fileSeparator;
        boolean boolean41 = extendedProperties26.isInitialized;
        java.util.ArrayList arrayList42 = extendedProperties26.keysAsListed;
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "," + "'", str34, ",");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) -1 + "'", byte39 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "/" + "'", str40, "/");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(arrayList42);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String[] strArray15 = extendedProperties5.getStringArray(",");
        short short18 = extendedProperties5.getShort("${", (short) (byte) -1);
        java.lang.Short short21 = extendedProperties5.getShort("}", (java.lang.Short) (short) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list26 = null;
        java.lang.String str27 = extendedProperties24.interpolateHelper("hi!", list26);
        java.lang.String str29 = extendedProperties24.interpolate("");
        java.lang.Object obj30 = extendedProperties23.remove((java.lang.Object) str29);
        java.lang.Byte byte33 = extendedProperties23.getByte(",", (java.lang.Byte) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties35.file = "hi!";
        java.util.Iterator iterator39 = extendedProperties35.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties40.file = "hi!";
        java.util.Iterator iterator44 = extendedProperties40.getKeys("");
        extendedProperties35.putAll((java.util.Map) extendedProperties40);
        java.lang.String str48 = extendedProperties40.getString(",", ",");
        java.lang.String[] strArray50 = extendedProperties40.getStringArray(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties52.file = "hi!";
        java.util.Iterator iterator56 = extendedProperties52.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties57 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties57.file = "hi!";
        java.util.Iterator iterator61 = extendedProperties57.getKeys("");
        extendedProperties52.putAll((java.util.Map) extendedProperties57);
        java.lang.String str65 = extendedProperties57.getString(",", ",");
        java.lang.String[] strArray67 = extendedProperties57.getStringArray(",");
        short short70 = extendedProperties57.getShort("${", (short) (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties72 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties72.file = "hi!";
        java.util.Iterator iterator76 = extendedProperties72.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties77 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties77.file = "hi!";
        java.util.Iterator iterator81 = extendedProperties77.getKeys("");
        extendedProperties72.putAll((java.util.Map) extendedProperties77);
        java.util.ArrayList arrayList83 = extendedProperties77.keysAsListed;
        java.lang.String str84 = extendedProperties57.interpolateHelper("/", (java.util.List) arrayList83);
        java.lang.String str85 = extendedProperties40.interpolateHelper(",", (java.util.List) arrayList83);
        java.lang.String str86 = extendedProperties23.interpolateHelper("hi!", (java.util.List) arrayList83);
        extendedProperties23.basePath = "/";
        java.util.Iterator iterator89 = extendedProperties23.getKeys();
        extendedProperties5.setProperty("${", (java.lang.Object) iterator89);
        java.lang.Long long93 = extendedProperties5.getLong(",", (java.lang.Long) 35L);
        int int96 = extendedProperties5.getInt(",", (int) (byte) 10);
        extendedProperties5.file = "${";
        boolean boolean99 = extendedProperties5.isInitialized();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 1 + "'", short21 == (short) 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 100 + "'", byte33 == (byte) 100);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "," + "'", str48, ",");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "," + "'", str65, ",");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) -1 + "'", short70 == (short) -1);
        org.junit.Assert.assertNotNull(iterator76);
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertNotNull(arrayList83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "/" + "'", str84, "/");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "," + "'", str85, ",");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(iterator89);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 35L + "'", long93 == 35L);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 10 + "'", int96 == 10);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.util.ArrayList arrayList11 = extendedProperties5.keysAsListed;
        extendedProperties5.clearProperty("");
        java.util.List list15 = extendedProperties5.getList("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.file = "hi!";
        java.util.Iterator iterator20 = extendedProperties16.getKeys("");
        java.lang.String str21 = extendedProperties16.basePath;
        java.lang.Byte byte24 = extendedProperties16.getByte("hi!", (java.lang.Byte) (byte) 1);
        extendedProperties16.fileSeparator = "}";
        java.lang.Boolean boolean29 = extendedProperties16.getBoolean("/", (java.lang.Boolean) true);
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties30.file = "hi!";
        long long35 = extendedProperties30.getLong("}", (long) (byte) -1);
        double double38 = extendedProperties30.getDouble("/", (double) 97);
        java.util.ArrayList arrayList39 = extendedProperties30.keysAsListed;
        java.util.List list41 = extendedProperties30.getList("}");
        java.lang.String str43 = extendedProperties30.interpolate("hi!");
        java.lang.Object obj44 = extendedProperties16.remove((java.lang.Object) str43);
        java.lang.Object obj45 = extendedProperties5.remove((java.lang.Object) extendedProperties16);
        boolean boolean48 = extendedProperties5.getBoolean("/", true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 1 + "'", byte24 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 97.0d + "'", double38 == 97.0d);
        org.junit.Assert.assertNotNull(arrayList39);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = extendedProperties0.getProperties("", properties2);
        java.lang.Short short6 = extendedProperties0.getShort("", (java.lang.Short) (short) 100);
        java.util.Vector vector8 = extendedProperties0.getVector(",");
        long long11 = extendedProperties0.getLong("", (long) 10);
        long long14 = extendedProperties0.getLong("}", (long) 35);
        java.util.Iterator iterator16 = extendedProperties0.getKeys("");
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str12 = extendedProperties5.interpolate("}");
        extendedProperties5.clearProperty("hi!");
        short short17 = extendedProperties5.getShort("", (short) (byte) 0);
        java.lang.Double double20 = extendedProperties5.getDouble("}", (java.lang.Double) 97.0d);
        java.lang.String str22 = extendedProperties5.interpolate("hi!");
        java.lang.Long long25 = extendedProperties5.getLong("hi!", (java.lang.Long) 35L);
        float float28 = extendedProperties5.getFloat("", (float) 0L);
        byte byte31 = extendedProperties5.getByte("hi!", (byte) 100);
        extendedProperties5.basePath = "/";
        extendedProperties5.file = "/";
        // The following exception was thrown during execution in test generation
        try {
            int int37 = extendedProperties5.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 100 + "'", byte31 == (byte) 100);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = extendedProperties0.getProperties("", properties2);
        java.lang.Short short6 = extendedProperties0.getShort("", (java.lang.Short) (short) 100);
        java.lang.String str8 = extendedProperties0.getString("/");
        java.lang.String str9 = extendedProperties0.file;
        java.lang.String str10 = extendedProperties0.basePath;
        java.util.Vector vector12 = extendedProperties0.getVector("");
        // The following exception was thrown during execution in test generation
        try {
            long long14 = extendedProperties0.getLong("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(vector12);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        double double16 = extendedProperties5.getDouble("${", (double) (short) -1);
        java.util.List list18 = extendedProperties5.getList("}");
        int int21 = extendedProperties5.getInt("/", (int) (short) 1);
        java.io.InputStream inputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties5.load(inputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader2 = java.io.Reader.nullReader();
        char[] charArray8 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int9 = reader2.read(charArray8);
        int int10 = propertiesReader1.read(charArray8);
        java.lang.String str11 = propertiesReader1.readProperty();
        int int12 = propertiesReader1.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader13 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        java.lang.String str14 = propertiesReader1.readLine();
        long long16 = propertiesReader1.skip((long) 1);
        long long18 = propertiesReader1.skip((long) (short) 0);
        propertiesReader1.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(reader2);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        int int2 = propertiesTokenizer1.countTokens();
        int int3 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.read();
        long long4 = propertiesReader1.skip((long) (byte) 100);
        propertiesReader1.mark(97);
        java.lang.String str7 = propertiesReader1.readLine();
        int int8 = propertiesReader1.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        long long11 = propertiesReader1.skip((long) 52);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.getLineNumber();
        propertiesReader1.mark((int) (short) 0);
        propertiesReader1.reset();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader1.lines();
        propertiesReader1.mark((int) '#');
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = propertiesReader1.transferTo(writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strStream6);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.util.ArrayList arrayList11 = extendedProperties5.keysAsListed;
        java.lang.String str13 = extendedProperties5.getString("hi!");
        byte byte16 = extendedProperties5.getByte("hi!", (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.file = "hi!";
        java.util.Iterator iterator22 = extendedProperties18.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties23.file = "hi!";
        java.util.Iterator iterator27 = extendedProperties23.getKeys("");
        extendedProperties18.putAll((java.util.Map) extendedProperties23);
        java.lang.String str31 = extendedProperties23.getString(",", ",");
        double double34 = extendedProperties23.getDouble("${", (double) (short) -1);
        java.util.List list36 = extendedProperties23.getList("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties37.file = "hi!";
        java.util.Iterator iterator41 = extendedProperties37.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties42.file = "hi!";
        java.util.Iterator iterator46 = extendedProperties42.getKeys("");
        extendedProperties37.putAll((java.util.Map) extendedProperties42);
        java.lang.String str50 = extendedProperties42.getString(",", ",");
        java.lang.String[] strArray52 = extendedProperties42.getStringArray(",");
        boolean boolean53 = extendedProperties42.isInitialized;
        extendedProperties42.file = "${";
        extendedProperties23.combine(extendedProperties42);
        extendedProperties5.addProperty("hi!", (java.lang.Object) extendedProperties42);
        org.apache.commons.collections.ExtendedProperties extendedProperties59 = extendedProperties5.subset("${");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "," + "'", str31, ",");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "," + "'", str50, ",");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(extendedProperties59);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list3 = null;
        java.lang.String str4 = extendedProperties1.interpolateHelper("hi!", list3);
        java.lang.String str6 = extendedProperties1.interpolate("");
        java.lang.Object obj7 = extendedProperties0.remove((java.lang.Object) str6);
        java.lang.Short short10 = extendedProperties0.getShort("/", (java.lang.Short) (short) 100);
        byte byte13 = extendedProperties0.getByte("}", (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties16 = null;
        java.util.Properties properties17 = extendedProperties14.getProperties("", properties16);
        java.lang.Object obj19 = extendedProperties14.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties21.file = "hi!";
        java.util.Iterator iterator25 = extendedProperties21.getKeys("/");
        java.util.Vector vector27 = null;
        java.util.Vector vector28 = extendedProperties21.getVector("hi!", vector27);
        java.util.Vector vector29 = extendedProperties14.getVector("hi!", vector27);
        java.lang.String str30 = extendedProperties14.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list35 = null;
        java.lang.String str36 = extendedProperties33.interpolateHelper("hi!", list35);
        java.lang.String str38 = extendedProperties33.interpolate("");
        java.lang.Object obj39 = extendedProperties32.remove((java.lang.Object) str38);
        java.lang.Short short42 = extendedProperties32.getShort("/", (java.lang.Short) (short) 100);
        java.util.Vector vector44 = null;
        java.util.Vector vector45 = extendedProperties32.getVector("/", vector44);
        java.util.Vector vector46 = extendedProperties14.getVector("/", vector45);
        java.lang.Object obj47 = extendedProperties0.remove((java.lang.Object) "/");
        java.lang.String str48 = extendedProperties0.file;
        // The following exception was thrown during execution in test generation
        try {
            double double50 = extendedProperties0.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(vector28);
        org.junit.Assert.assertNotNull(vector29);
// flaky "19) test3119(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "/" + "'", str30, "/");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 100 + "'", short42 == (short) 100);
        org.junit.Assert.assertNotNull(vector45);
        org.junit.Assert.assertNotNull(vector46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = extendedProperties0.getProperties("", properties2);
        java.lang.Object obj5 = extendedProperties0.getProperty("");
        java.util.Properties properties7 = extendedProperties0.getProperties("}");
        boolean boolean10 = extendedProperties0.getBoolean(",", true);
        java.util.Iterator iterator11 = extendedProperties0.getKeys();
        int int14 = extendedProperties0.getInt("/", (int) (byte) 100);
        java.lang.String str16 = extendedProperties0.testBoolean("${");
        java.lang.String[] strArray18 = extendedProperties0.getStringArray("/");
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str11 = extendedProperties0.fileSeparator;
        extendedProperties0.file = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties15.file = "hi!";
        java.util.Iterator iterator19 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.file = "hi!";
        java.util.Iterator iterator24 = extendedProperties20.getKeys("");
        extendedProperties15.putAll((java.util.Map) extendedProperties20);
        java.util.ArrayList arrayList26 = extendedProperties20.keysAsListed;
        java.util.List list27 = extendedProperties0.getList("", (java.util.List) arrayList26);
        extendedProperties0.setInclude("}");
        int int32 = extendedProperties0.getInt("}", 52);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list36 = null;
        java.lang.String str37 = extendedProperties34.interpolateHelper("hi!", list36);
        java.lang.String str39 = extendedProperties34.interpolate("");
        java.lang.Object obj40 = extendedProperties33.remove((java.lang.Object) str39);
        java.lang.Short short43 = extendedProperties33.getShort("/", (java.lang.Short) (short) 100);
        java.lang.String str46 = extendedProperties33.getString("/", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties47.file = "hi!";
        java.util.Iterator iterator51 = extendedProperties47.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties52.file = "hi!";
        java.util.Iterator iterator56 = extendedProperties52.getKeys("");
        extendedProperties47.putAll((java.util.Map) extendedProperties52);
        java.lang.String str60 = extendedProperties52.getString(",", ",");
        java.lang.String[] strArray62 = extendedProperties52.getStringArray(",");
        short short65 = extendedProperties52.getShort("${", (short) (byte) -1);
        java.lang.Short short68 = extendedProperties52.getShort("}", (java.lang.Short) (short) 1);
        java.lang.String[] strArray70 = extendedProperties52.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties71 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties71.file = "hi!";
        byte byte76 = extendedProperties71.getByte("${", (byte) 10);
        boolean boolean77 = extendedProperties71.isInitialized();
        java.lang.Object obj78 = extendedProperties33.put((java.lang.Object) extendedProperties52, (java.lang.Object) boolean77);
        extendedProperties0.combine(extendedProperties52);
        extendedProperties52.basePath = "/";
        java.lang.Byte byte84 = extendedProperties52.getByte("hi!", (java.lang.Byte) (byte) 1);
        java.lang.String str87 = extendedProperties52.getString(",", "/");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) 100 + "'", short43 == (short) 100);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "," + "'", str46, ",");
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "," + "'", str60, ",");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short65 + "' != '" + (short) -1 + "'", short65 == (short) -1);
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) 1 + "'", short68 == (short) 1);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 10 + "'", byte76 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) 1 + "'", byte84 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "/" + "'", str87, "/");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor3 = propertiesTokenizer1.asIterator();
        int int4 = propertiesTokenizer1.countTokens();
        java.lang.String str5 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "/" + "'", obj2, "/");
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.util.ArrayList arrayList11 = extendedProperties5.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Byte byte15 = extendedProperties12.getByte("", (java.lang.Byte) (byte) 10);
        java.lang.Boolean boolean18 = extendedProperties12.getBoolean(",", (java.lang.Boolean) false);
        java.lang.Object obj20 = extendedProperties5.put((java.lang.Object) boolean18, (java.lang.Object) "/");
        extendedProperties5.fileSeparator = "";
        java.util.List list24 = extendedProperties5.getList("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list29 = null;
        java.lang.String str30 = extendedProperties27.interpolateHelper("hi!", list29);
        java.lang.String str32 = extendedProperties27.interpolate("");
        java.lang.Object obj33 = extendedProperties26.remove((java.lang.Object) str32);
        java.lang.String str34 = extendedProperties26.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties36.file = "hi!";
        java.util.Iterator iterator40 = extendedProperties36.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties41.file = "hi!";
        java.util.Iterator iterator45 = extendedProperties41.getKeys("");
        extendedProperties36.putAll((java.util.Map) extendedProperties41);
        java.lang.String str47 = extendedProperties36.fileSeparator;
        extendedProperties36.file = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties51.file = "hi!";
        java.util.Iterator iterator55 = extendedProperties51.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties56.file = "hi!";
        java.util.Iterator iterator60 = extendedProperties56.getKeys("");
        extendedProperties51.putAll((java.util.Map) extendedProperties56);
        java.util.ArrayList arrayList62 = extendedProperties56.keysAsListed;
        java.util.List list63 = extendedProperties36.getList("", (java.util.List) arrayList62);
        java.lang.String str64 = extendedProperties26.interpolateHelper("", (java.util.List) arrayList62);
        java.lang.String str65 = extendedProperties5.interpolateHelper("${", (java.util.List) arrayList62);
        java.util.Iterator iterator67 = extendedProperties5.getKeys("${");
        boolean boolean68 = extendedProperties5.isInitialized;
        java.lang.Long long71 = extendedProperties5.getLong("", (java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double73 = extendedProperties5.getDouble(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(obj33);
// flaky "20) test3123(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "/" + "'", str34, "/");
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "/" + "'", str47, "/");
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(arrayList62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "${" + "'", str65, "${");
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L) + "'", long71 == (-1L));
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        long long7 = extendedProperties0.getLong("${", (long) (byte) -1);
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean("/", (java.lang.Boolean) true);
        extendedProperties0.setInclude("}");
        extendedProperties0.fileSeparator = ",";
        java.lang.String str16 = extendedProperties0.testBoolean("");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.read();
        java.lang.String str3 = propertiesReader1.readProperty();
        propertiesReader1.mark(10);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader6 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        java.lang.String str7 = propertiesReader6.readLine();
        java.io.Reader reader8 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader8);
        java.io.Reader reader10 = java.io.Reader.nullReader();
        char[] charArray16 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int17 = reader10.read(charArray16);
        int int18 = propertiesReader9.read(charArray16);
        java.lang.String str19 = propertiesReader9.readProperty();
        propertiesReader9.mark((int) (byte) 1);
        java.lang.String str22 = propertiesReader9.readProperty();
        java.io.Reader reader23 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader24 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader23);
        int int25 = propertiesReader24.getLineNumber();
        propertiesReader24.mark((int) (short) 0);
        propertiesReader24.reset();
        java.util.stream.Stream<java.lang.String> strStream29 = propertiesReader24.lines();
        java.io.Reader reader30 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader31 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader30);
        int int32 = propertiesReader31.read();
        java.lang.String str33 = propertiesReader31.readProperty();
        propertiesReader31.setLineNumber((int) '4');
        char[] charArray37 = new char[] { 'a' };
        int int38 = propertiesReader31.read(charArray37);
        int int39 = propertiesReader24.read(charArray37);
        int int40 = propertiesReader9.read(charArray37);
        int int41 = propertiesReader6.read(charArray37);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(reader23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strStream29);
        org.junit.Assert.assertNotNull(reader30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.file;
        java.util.Vector vector3 = extendedProperties0.getVector("");
        java.lang.String str4 = extendedProperties0.file;
        java.lang.Long long7 = extendedProperties0.getLong("hi!", (java.lang.Long) 32L);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedProperties0.getInteger(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(vector3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        boolean boolean2 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str3 = propertiesTokenizer1.nextToken();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        java.util.Iterator<java.lang.Object> objItor5 = propertiesTokenizer1.asIterator();
        java.lang.String str6 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        long long5 = extendedProperties0.getLong("}", (long) (byte) -1);
        java.lang.String str7 = extendedProperties0.testBoolean("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = extendedProperties0.subset("/");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte12 = extendedProperties9.getByte("", (java.lang.Byte) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(extendedProperties9);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        double double16 = extendedProperties5.getDouble("${", (double) (short) -1);
        float float19 = extendedProperties5.getFloat(",", (float) (short) 100);
        java.lang.String str20 = extendedProperties5.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.file = "hi!";
        java.util.Iterator iterator26 = extendedProperties22.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties27.file = "hi!";
        java.util.Iterator iterator31 = extendedProperties27.getKeys("");
        extendedProperties22.putAll((java.util.Map) extendedProperties27);
        java.lang.String str33 = extendedProperties22.fileSeparator;
        extendedProperties22.display();
        java.lang.Long long37 = extendedProperties22.getLong("", (java.lang.Long) (-1L));
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties41 = null;
        java.util.Properties properties42 = extendedProperties39.getProperties("", properties41);
        java.lang.Short short45 = extendedProperties39.getShort("", (java.lang.Short) (short) 100);
        extendedProperties39.isInitialized = false;
        java.lang.Byte byte50 = extendedProperties39.getByte(",", (java.lang.Byte) (byte) 10);
        extendedProperties22.setProperty("hi!", (java.lang.Object) byte50);
        java.util.ArrayList arrayList52 = extendedProperties22.keysAsListed;
        extendedProperties5.setProperty("hi!", (java.lang.Object) extendedProperties22);
        java.lang.String str54 = extendedProperties5.fileSeparator;
        java.util.Vector vector56 = extendedProperties5.getVector(",");
        // The following exception was thrown during execution in test generation
        try {
            int int58 = extendedProperties5.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "/" + "'", str33, "/");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) 100 + "'", short45 == (short) 100);
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 10 + "'", byte50 == (byte) 10);
        org.junit.Assert.assertNotNull(arrayList52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "/" + "'", str54, "/");
        org.junit.Assert.assertNotNull(vector56);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String[] strArray15 = extendedProperties5.getStringArray(",");
        short short18 = extendedProperties5.getShort("${", (short) (byte) -1);
        java.lang.Short short21 = extendedProperties5.getShort("}", (java.lang.Short) (short) 1);
        java.lang.String[] strArray23 = extendedProperties5.getStringArray("");
        java.io.Reader reader25 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader26 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader25);
        int int27 = propertiesReader26.read();
        long long29 = propertiesReader26.skip((long) (byte) 100);
        extendedProperties5.setProperty("/", (java.lang.Object) propertiesReader26);
        java.io.Reader reader31 = java.io.Reader.nullReader();
        char[] charArray37 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int38 = reader31.read(charArray37);
        int int39 = propertiesReader26.read(charArray37);
        int int40 = propertiesReader26.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader41 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader26);
        java.util.stream.Stream<java.lang.String> strStream42 = propertiesReader41.lines();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 1 + "'", short21 == (short) 1);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(reader31);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(strStream42);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        boolean boolean3 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str5 = propertiesTokenizer1.nextToken("");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "}" + "'", obj2, "}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        boolean boolean2 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str4 = propertiesTokenizer1.nextToken("}");
        int int5 = propertiesTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor6 = propertiesTokenizer1.asIterator();
        java.lang.String str8 = propertiesTokenizer1.nextToken("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.util.Iterator<java.lang.Object> objItor2 = propertiesTokenizer1.asIterator();
        java.lang.String str3 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        double double16 = extendedProperties5.getDouble("${", (double) (short) -1);
        float float19 = extendedProperties5.getFloat(",", (float) '4');
        java.lang.String str22 = extendedProperties5.getString("${", "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list27 = null;
        java.lang.String str28 = extendedProperties25.interpolateHelper("hi!", list27);
        java.lang.String str30 = extendedProperties25.interpolate("");
        java.lang.Object obj31 = extendedProperties24.remove((java.lang.Object) str30);
        java.lang.String str32 = extendedProperties24.getInclude();
        java.lang.String str35 = extendedProperties24.getString("", "");
        java.util.ArrayList arrayList36 = extendedProperties24.keysAsListed;
        java.util.List list37 = extendedProperties5.getList("/", (java.util.List) arrayList36);
        java.io.Reader reader39 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader40 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader39);
        java.io.Reader reader41 = java.io.Reader.nullReader();
        char[] charArray47 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int48 = reader41.read(charArray47);
        int int49 = propertiesReader40.read(charArray47);
        extendedProperties5.addProperty("}", (java.lang.Object) propertiesReader40);
        java.lang.String str51 = propertiesReader40.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader52 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader40);
        int int53 = propertiesReader40.read();
        java.nio.CharBuffer charBuffer54 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int55 = propertiesReader40.read(charBuffer54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 52.0f + "'", float19 == 52.0f);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(obj31);
// flaky "21) test3134(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "/" + "'", str32, "/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(arrayList36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(reader39);
        org.junit.Assert.assertNotNull(reader41);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        java.lang.String str5 = extendedProperties0.interpolate("");
        extendedProperties0.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties0.getStringArray("hi!");
        java.lang.String str10 = extendedProperties0.basePath;
        extendedProperties0.basePath = "/";
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties15 = null;
        java.util.Properties properties16 = extendedProperties13.getProperties("", properties15);
        java.lang.Short short19 = extendedProperties13.getShort("", (java.lang.Short) (short) 100);
        java.lang.String str21 = extendedProperties13.getString("/");
        java.util.Properties properties23 = extendedProperties13.getProperties("/");
        java.util.Iterator iterator25 = extendedProperties13.getKeys("}");
        java.lang.String str26 = extendedProperties13.basePath;
        java.lang.Float float29 = extendedProperties13.getFloat("/", (java.lang.Float) (-1.0f));
        java.lang.Object obj30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = extendedProperties0.put((java.lang.Object) extendedProperties13, obj30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-1.0f) + "'", float29 == (-1.0f));
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list3 = null;
        java.lang.String str4 = extendedProperties1.interpolateHelper("hi!", list3);
        java.lang.String str6 = extendedProperties1.interpolate("");
        java.lang.Object obj7 = extendedProperties0.remove((java.lang.Object) str6);
        java.lang.String str8 = extendedProperties0.getInclude();
        extendedProperties0.fileSeparator = "${";
        java.io.Reader reader12 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader13 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader12);
        int int14 = propertiesReader13.read();
        long long16 = propertiesReader13.skip((long) (byte) 100);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader13);
        extendedProperties0.setProperty("}", (java.lang.Object) propertiesReader13);
        java.util.stream.Stream<java.lang.String> strStream19 = propertiesReader13.lines();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader20 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader13);
        boolean boolean21 = propertiesReader20.markSupported();
        java.io.Reader reader22 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader23 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader22);
        java.io.Reader reader24 = java.io.Reader.nullReader();
        char[] charArray30 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int31 = reader24.read(charArray30);
        int int32 = propertiesReader23.read(charArray30);
        java.lang.String str33 = propertiesReader23.readProperty();
        int int34 = propertiesReader23.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader35 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader23);
        java.lang.String str36 = propertiesReader23.readLine();
        long long38 = propertiesReader23.skip((long) 1);
        long long40 = propertiesReader23.skip((long) (short) 0);
        java.io.Reader reader41 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader42 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader41);
        int int43 = propertiesReader42.read();
        java.lang.String str44 = propertiesReader42.readProperty();
        propertiesReader42.mark(10);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader47 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader42);
        java.io.Reader reader48 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader49 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader48);
        java.lang.String str50 = propertiesReader49.readProperty();
        int int51 = propertiesReader49.getLineNumber();
        java.lang.String str52 = propertiesReader49.readProperty();
        java.io.Reader reader53 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader54 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader53);
        int int55 = propertiesReader54.read();
        java.lang.String str56 = propertiesReader54.readProperty();
        propertiesReader54.setLineNumber((int) '4');
        char[] charArray60 = new char[] { 'a' };
        int int61 = propertiesReader54.read(charArray60);
        int int64 = propertiesReader49.read(charArray60, 0, 0);
        int int65 = propertiesReader47.read(charArray60);
        int int66 = propertiesReader23.read(charArray60);
        int int67 = propertiesReader20.read(charArray60);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj7);
// flaky "22) test3136(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(strStream19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(reader22);
        org.junit.Assert.assertNotNull(reader24);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(reader41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(reader48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(reader53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        float float6 = extendedProperties0.getFloat("${", 0.0f);
        float float9 = extendedProperties0.getFloat("/", (float) (byte) -1);
        short short12 = extendedProperties0.getShort(",", (short) 10);
        boolean boolean15 = extendedProperties0.getBoolean("hi!", false);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list19 = null;
        java.lang.String str20 = extendedProperties17.interpolateHelper("hi!", list19);
        float float23 = extendedProperties17.getFloat("${", 0.0f);
        extendedProperties17.display();
        short short27 = extendedProperties17.getShort("${", (short) (byte) 0);
        java.lang.String str28 = extendedProperties17.fileSeparator;
        extendedProperties0.setProperty("/", (java.lang.Object) str28);
        boolean boolean30 = extendedProperties0.isInitialized;
        java.util.ArrayList arrayList31 = extendedProperties0.keysAsListed;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/" + "'", str28, "/");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(arrayList31);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int2 = propertiesReader1.read();
        int int3 = propertiesReader1.read();
        java.util.stream.Stream<java.lang.String> strStream4 = propertiesReader1.lines();
        java.lang.String str5 = propertiesReader1.readProperty();
        java.lang.String str6 = propertiesReader1.readProperty();
        int int7 = propertiesReader1.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strStream4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        float float6 = extendedProperties0.getFloat("${", 0.0f);
        float float9 = extendedProperties0.getFloat("/", (float) 1L);
        java.lang.Byte byte12 = extendedProperties0.getByte("}", (java.lang.Byte) (byte) 0);
        boolean boolean13 = extendedProperties0.isInitialized();
        extendedProperties0.fileSeparator = "/";
        extendedProperties0.setInclude("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        boolean boolean2 = propertiesTokenizer1.hasMoreElements();
        java.util.Iterator<java.lang.Object> objItor3 = propertiesTokenizer1.asIterator();
        int int4 = propertiesTokenizer1.countTokens();
        boolean boolean5 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean6 = propertiesTokenizer1.hasMoreElements();
        boolean boolean7 = propertiesTokenizer1.hasMoreElements();
        int int8 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = extendedProperties0.getProperties("", properties2);
        java.lang.Object obj5 = extendedProperties0.getProperty("");
        extendedProperties0.clearProperty("hi!");
        java.lang.String str8 = extendedProperties0.fileSeparator;
        java.util.ArrayList arrayList9 = extendedProperties0.keysAsListed;
        java.lang.String str10 = extendedProperties0.getInclude();
        java.util.Iterator iterator12 = extendedProperties0.getKeys("/");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = extendedProperties0.getBoolean("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
        org.junit.Assert.assertNotNull(arrayList9);
// flaky "23) test3141(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String[] strArray15 = extendedProperties5.getStringArray(",");
        short short18 = extendedProperties5.getShort("${", (short) (byte) -1);
        java.lang.Short short21 = extendedProperties5.getShort("}", (java.lang.Short) (short) 1);
        java.lang.String[] strArray23 = extendedProperties5.getStringArray("");
        java.io.Reader reader25 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader26 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader25);
        int int27 = propertiesReader26.read();
        long long29 = propertiesReader26.skip((long) (byte) 100);
        extendedProperties5.setProperty("/", (java.lang.Object) propertiesReader26);
        long long32 = propertiesReader26.skip((long) (byte) 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 1 + "'", short21 == (short) 1);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties4.file = "hi!";
        byte byte9 = extendedProperties4.getByte("${", (byte) 10);
        extendedProperties4.display();
        extendedProperties0.combine(extendedProperties4);
        java.lang.String str14 = extendedProperties0.getString("${", "${");
        extendedProperties0.basePath = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.file = "hi!";
        java.util.Iterator iterator21 = extendedProperties17.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.file = "hi!";
        java.util.Iterator iterator26 = extendedProperties22.getKeys("");
        extendedProperties17.putAll((java.util.Map) extendedProperties22);
        java.lang.String str30 = extendedProperties22.getString(",", ",");
        double double33 = extendedProperties22.getDouble("${", (double) (short) -1);
        float float36 = extendedProperties22.getFloat(",", (float) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties38.file = "hi!";
        java.util.Iterator iterator42 = extendedProperties38.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties43.file = "hi!";
        java.util.Iterator iterator47 = extendedProperties43.getKeys("");
        extendedProperties38.putAll((java.util.Map) extendedProperties43);
        java.lang.String str51 = extendedProperties43.getString(",", ",");
        java.lang.String[] strArray53 = extendedProperties43.getStringArray(",");
        short short56 = extendedProperties43.getShort("${", (short) (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties58.file = "hi!";
        java.util.Iterator iterator62 = extendedProperties58.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties63 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties63.file = "hi!";
        java.util.Iterator iterator67 = extendedProperties63.getKeys("");
        extendedProperties58.putAll((java.util.Map) extendedProperties63);
        java.util.ArrayList arrayList69 = extendedProperties63.keysAsListed;
        java.lang.String str70 = extendedProperties43.interpolateHelper("/", (java.util.List) arrayList69);
        java.lang.String str71 = extendedProperties22.interpolateHelper("${", (java.util.List) arrayList69);
        extendedProperties0.keysAsListed = arrayList69;
        org.apache.commons.collections.ExtendedProperties extendedProperties74 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list76 = null;
        java.lang.String str77 = extendedProperties74.interpolateHelper("hi!", list76);
        java.lang.String str79 = extendedProperties74.interpolate("");
        extendedProperties74.setInclude(",");
        long long84 = extendedProperties74.getLong("}", (-1L));
        java.lang.Boolean boolean87 = extendedProperties74.getBoolean("${", (java.lang.Boolean) true);
        java.util.Properties properties89 = extendedProperties74.getProperties("");
        java.util.Properties properties91 = extendedProperties74.getProperties("");
        java.util.Properties properties92 = extendedProperties0.getProperties("${", properties91);
        org.apache.commons.collections.ExtendedProperties extendedProperties93 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties92);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "${" + "'", str14, "${");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "," + "'", str30, ",");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "," + "'", str51, ",");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) -1 + "'", short56 == (short) -1);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertNotNull(arrayList69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "/" + "'", str70, "/");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "${" + "'", str71, "${");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-1L) + "'", long84 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(properties89);
        org.junit.Assert.assertNotNull(properties91);
        org.junit.Assert.assertNotNull(properties92);
        org.junit.Assert.assertNotNull(extendedProperties93);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list3 = null;
        java.lang.String str4 = extendedProperties1.interpolateHelper("hi!", list3);
        java.lang.String str6 = extendedProperties1.interpolate("");
        java.lang.Object obj7 = extendedProperties0.remove((java.lang.Object) str6);
        java.lang.String str8 = extendedProperties0.getInclude();
        java.lang.String str11 = extendedProperties0.getString("", "");
        java.lang.String[] strArray13 = extendedProperties0.getStringArray("");
        java.util.List list15 = extendedProperties0.getList("");
        java.util.Vector vector17 = extendedProperties0.getVector("/");
        long long20 = extendedProperties0.getLong("/", (long) (-1));
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties24 = null;
        java.util.Properties properties25 = extendedProperties22.getProperties("", properties24);
        java.lang.Object obj27 = extendedProperties22.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties29.file = "hi!";
        java.util.Iterator iterator33 = extendedProperties29.getKeys("/");
        java.util.Vector vector35 = null;
        java.util.Vector vector36 = extendedProperties29.getVector("hi!", vector35);
        java.util.Vector vector37 = extendedProperties22.getVector("hi!", vector35);
        java.lang.String str38 = extendedProperties22.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list43 = null;
        java.lang.String str44 = extendedProperties41.interpolateHelper("hi!", list43);
        java.lang.String str46 = extendedProperties41.interpolate("");
        java.lang.Object obj47 = extendedProperties40.remove((java.lang.Object) str46);
        java.lang.Short short50 = extendedProperties40.getShort("/", (java.lang.Short) (short) 100);
        java.util.Vector vector52 = null;
        java.util.Vector vector53 = extendedProperties40.getVector("/", vector52);
        java.util.Vector vector54 = extendedProperties22.getVector("/", vector53);
        java.util.Vector vector55 = extendedProperties0.getVector("", vector54);
        java.io.Reader reader56 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader57 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader56);
        int int58 = propertiesReader57.read();
        long long60 = propertiesReader57.skip((long) (byte) 100);
        java.util.stream.Stream<java.lang.String> strStream61 = propertiesReader57.lines();
        boolean boolean62 = propertiesReader57.markSupported();
        java.lang.Object obj63 = extendedProperties0.remove((java.lang.Object) propertiesReader57);
        java.io.Reader reader64 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader65 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader64);
        java.io.Reader reader66 = java.io.Reader.nullReader();
        char[] charArray72 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int73 = reader66.read(charArray72);
        int int74 = propertiesReader65.read(charArray72);
        java.lang.String str75 = propertiesReader65.readProperty();
        propertiesReader65.mark((int) (byte) 1);
        java.lang.String str78 = propertiesReader65.readProperty();
        java.io.Reader reader79 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader80 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader79);
        int int81 = propertiesReader80.getLineNumber();
        propertiesReader80.mark((int) (short) 0);
        propertiesReader80.reset();
        java.util.stream.Stream<java.lang.String> strStream85 = propertiesReader80.lines();
        java.io.Reader reader86 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader87 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader86);
        int int88 = propertiesReader87.read();
        java.lang.String str89 = propertiesReader87.readProperty();
        propertiesReader87.setLineNumber((int) '4');
        char[] charArray93 = new char[] { 'a' };
        int int94 = propertiesReader87.read(charArray93);
        int int95 = propertiesReader80.read(charArray93);
        int int96 = propertiesReader65.read(charArray93);
        int int97 = propertiesReader57.read(charArray93);
        int int98 = propertiesReader57.getLineNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj7);
// flaky "24) test3144(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(vector36);
        org.junit.Assert.assertNotNull(vector37);
// flaky "1) test3144(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "/" + "'", str38, "/");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) 100 + "'", short50 == (short) 100);
        org.junit.Assert.assertNotNull(vector53);
        org.junit.Assert.assertNotNull(vector54);
        org.junit.Assert.assertNotNull(vector55);
        org.junit.Assert.assertNotNull(reader56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(strStream61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(reader64);
        org.junit.Assert.assertNotNull(reader66);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(reader79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(strStream85);
        org.junit.Assert.assertNotNull(reader86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(charArray93);
        org.junit.Assert.assertArrayEquals(charArray93, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list3 = null;
        java.lang.String str4 = extendedProperties1.interpolateHelper("hi!", list3);
        java.lang.String str6 = extendedProperties1.interpolate("");
        java.lang.Object obj7 = extendedProperties0.remove((java.lang.Object) str6);
        java.lang.Byte byte10 = extendedProperties0.getByte(",", (java.lang.Byte) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties14 = null;
        java.util.Properties properties15 = extendedProperties12.getProperties("", properties14);
        java.lang.Short short18 = extendedProperties12.getShort("", (java.lang.Short) (short) 100);
        long long21 = extendedProperties12.getLong("${", (long) '#');
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list26 = null;
        java.lang.String str27 = extendedProperties24.interpolateHelper("hi!", list26);
        java.lang.String str29 = extendedProperties24.interpolate("");
        java.lang.Object obj30 = extendedProperties23.remove((java.lang.Object) str29);
        java.lang.String str31 = extendedProperties23.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties33.file = "hi!";
        java.util.Iterator iterator37 = extendedProperties33.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties38.file = "hi!";
        java.util.Iterator iterator42 = extendedProperties38.getKeys("");
        extendedProperties33.putAll((java.util.Map) extendedProperties38);
        java.lang.Short short46 = extendedProperties38.getShort("", (java.lang.Short) (short) 10);
        extendedProperties38.fileSeparator = "}";
        java.util.Vector vector50 = extendedProperties38.getVector("${");
        java.util.Vector vector51 = extendedProperties23.getVector("/", vector50);
        java.util.List list52 = extendedProperties12.getList("hi!", (java.util.List) vector51);
        java.util.List list53 = extendedProperties0.getList("hi!", (java.util.List) vector51);
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties54.file = "hi!";
        java.util.Iterator iterator58 = extendedProperties54.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties59 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties59.file = "hi!";
        java.util.Iterator iterator63 = extendedProperties59.getKeys("");
        extendedProperties54.putAll((java.util.Map) extendedProperties59);
        java.lang.String str67 = extendedProperties59.getString(",", ",");
        java.lang.String[] strArray69 = extendedProperties59.getStringArray(",");
        boolean boolean70 = extendedProperties59.isInitialized;
        extendedProperties59.file = "${";
        java.lang.Object obj73 = extendedProperties0.remove((java.lang.Object) extendedProperties59);
        extendedProperties59.setInclude("/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(obj30);
// flaky "25) test3145(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "/" + "'", str31, "/");
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 10 + "'", short46 == (short) 10);
        org.junit.Assert.assertNotNull(vector50);
        org.junit.Assert.assertNotNull(vector51);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "," + "'", str67, ",");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        java.lang.String str5 = extendedProperties0.basePath;
        java.lang.String str6 = extendedProperties0.basePath;
        extendedProperties0.basePath = "}";
        long long11 = extendedProperties0.getLong(",", 97L);
        java.lang.Boolean boolean14 = extendedProperties0.getBoolean("/", (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list3 = null;
        java.lang.String str4 = extendedProperties1.interpolateHelper("hi!", list3);
        java.lang.String str6 = extendedProperties1.interpolate("");
        java.lang.Object obj7 = extendedProperties0.remove((java.lang.Object) str6);
        java.lang.String str8 = extendedProperties0.getInclude();
        java.lang.String str11 = extendedProperties0.getString("", "");
        java.util.ArrayList arrayList12 = extendedProperties0.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties13);
        int int17 = extendedProperties0.getInteger("hi!", 1);
        extendedProperties0.isInitialized = false;
        byte byte22 = extendedProperties0.getByte("${", (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj7);
// flaky "26) test3147(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) -1 + "'", byte22 == (byte) -1);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Byte byte3 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 10);
        java.lang.Boolean boolean6 = extendedProperties0.getBoolean(",", (java.lang.Boolean) false);
        extendedProperties0.fileSeparator = ",";
        java.io.OutputStream outputStream9 = null;
        extendedProperties0.save(outputStream9, "${");
        java.lang.String str12 = extendedProperties0.getInclude();
        long long15 = extendedProperties0.getLong("${", (long) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "27) test3148(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String[] strArray15 = extendedProperties5.getStringArray(",");
        short short18 = extendedProperties5.getShort("${", (short) (byte) -1);
        java.lang.Short short21 = extendedProperties5.getShort("}", (java.lang.Short) (short) 1);
        java.lang.String[] strArray23 = extendedProperties5.getStringArray("");
        java.io.Reader reader25 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader26 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader25);
        int int27 = propertiesReader26.read();
        long long29 = propertiesReader26.skip((long) (byte) 100);
        extendedProperties5.setProperty("/", (java.lang.Object) propertiesReader26);
        java.lang.Double double33 = extendedProperties5.getDouble("", (java.lang.Double) 97.0d);
        extendedProperties5.isInitialized = true;
        extendedProperties5.fileSeparator = "}";
        java.util.Properties properties39 = extendedProperties5.getProperties("}");
        long long42 = extendedProperties5.getLong("${", (long) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Properties properties46 = null;
        java.util.Properties properties47 = extendedProperties44.getProperties("", properties46);
        java.lang.Short short50 = extendedProperties44.getShort("", (java.lang.Short) (short) 100);
        long long53 = extendedProperties44.getLong("${", (long) '#');
        org.apache.commons.collections.ExtendedProperties extendedProperties55 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list58 = null;
        java.lang.String str59 = extendedProperties56.interpolateHelper("hi!", list58);
        java.lang.String str61 = extendedProperties56.interpolate("");
        java.lang.Object obj62 = extendedProperties55.remove((java.lang.Object) str61);
        java.lang.String str63 = extendedProperties55.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties65 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties65.file = "hi!";
        java.util.Iterator iterator69 = extendedProperties65.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties70 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties70.file = "hi!";
        java.util.Iterator iterator74 = extendedProperties70.getKeys("");
        extendedProperties65.putAll((java.util.Map) extendedProperties70);
        java.lang.Short short78 = extendedProperties70.getShort("", (java.lang.Short) (short) 10);
        extendedProperties70.fileSeparator = "}";
        java.util.Vector vector82 = extendedProperties70.getVector("${");
        java.util.Vector vector83 = extendedProperties55.getVector("/", vector82);
        java.util.List list84 = extendedProperties44.getList("hi!", (java.util.List) vector83);
        short short87 = extendedProperties44.getShort("/", (short) 0);
        extendedProperties44.display();
        java.util.Properties properties90 = extendedProperties44.getProperties("");
        extendedProperties5.setProperty("${", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 1 + "'", short21 == (short) 1);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) 100 + "'", short50 == (short) 100);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 35L + "'", long53 == 35L);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNull(obj62);
// flaky "28) test3149(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "/" + "'", str63, "/");
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertNotNull(iterator74);
        org.junit.Assert.assertTrue("'" + short78 + "' != '" + (short) 10 + "'", short78 == (short) 10);
        org.junit.Assert.assertNotNull(vector82);
        org.junit.Assert.assertNotNull(vector83);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertTrue("'" + short87 + "' != '" + (short) 0 + "'", short87 == (short) 0);
        org.junit.Assert.assertNotNull(properties90);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        java.lang.String str5 = extendedProperties0.interpolate("");
        boolean boolean8 = extendedProperties0.getBoolean("", false);
        extendedProperties0.file = "hi!";
        java.util.ArrayList arrayList11 = extendedProperties0.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.file = "hi!";
        java.util.Iterator iterator16 = extendedProperties12.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.file = "hi!";
        java.util.Iterator iterator21 = extendedProperties17.getKeys("");
        extendedProperties12.putAll((java.util.Map) extendedProperties17);
        java.lang.String str24 = extendedProperties17.interpolate("}");
        extendedProperties17.clearProperty("hi!");
        short short29 = extendedProperties17.getShort("", (short) (byte) 0);
        java.lang.Double double32 = extendedProperties17.getDouble("}", (java.lang.Double) 97.0d);
        java.lang.String str34 = extendedProperties17.interpolate("hi!");
        java.io.OutputStream outputStream35 = null;
        extendedProperties17.save(outputStream35, "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties38.file = "hi!";
        java.util.Iterator iterator42 = extendedProperties38.getKeys("/");
        java.util.Vector vector44 = null;
        java.util.Vector vector45 = extendedProperties38.getVector("hi!", vector44);
        java.util.Iterator iterator47 = extendedProperties38.getKeys("hi!");
        java.lang.Object obj48 = extendedProperties0.put((java.lang.Object) extendedProperties17, (java.lang.Object) extendedProperties38);
        java.lang.Integer int51 = extendedProperties38.getInteger("${", (java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double53 = extendedProperties38.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "}" + "'", str24, "}");
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 0 + "'", short29 == (short) 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(vector45);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        double double16 = extendedProperties5.getDouble("${", (double) (short) -1);
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer18 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        boolean boolean19 = propertiesTokenizer18.hasMoreElements();
        java.lang.String str20 = propertiesTokenizer18.nextToken();
        java.lang.Object obj21 = propertiesTokenizer18.nextElement();
        java.lang.Object obj22 = propertiesTokenizer18.nextElement();
        java.lang.Object obj23 = extendedProperties5.remove((java.lang.Object) propertiesTokenizer18);
        boolean boolean24 = propertiesTokenizer18.hasMoreElements();
        int int25 = propertiesTokenizer18.countTokens();
        java.util.Iterator<java.lang.Object> objItor26 = propertiesTokenizer18.asIterator();
        java.lang.String str28 = propertiesTokenizer18.nextToken("${");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objItor26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.file = "hi!";
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.file = "hi!";
        java.util.Iterator iterator9 = extendedProperties5.getKeys("");
        extendedProperties0.putAll((java.util.Map) extendedProperties5);
        java.lang.String str13 = extendedProperties5.getString(",", ",");
        java.lang.String[] strArray15 = extendedProperties5.getStringArray(",");
        boolean boolean16 = extendedProperties5.isInitialized;
        java.lang.Integer int19 = extendedProperties5.getInteger(",", (java.lang.Integer) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list23 = null;
        java.lang.String str24 = extendedProperties21.interpolateHelper("hi!", list23);
        java.lang.String str26 = extendedProperties21.interpolate("");
        java.lang.Object obj27 = extendedProperties20.remove((java.lang.Object) str26);
        java.lang.String str28 = extendedProperties20.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties30.file = "hi!";
        java.util.Iterator iterator34 = extendedProperties30.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties35.file = "hi!";
        java.util.Iterator iterator39 = extendedProperties35.getKeys("");
        extendedProperties30.putAll((java.util.Map) extendedProperties35);
        java.lang.Short short43 = extendedProperties35.getShort("", (java.lang.Short) (short) 10);
        extendedProperties35.fileSeparator = "}";
        java.util.Vector vector47 = extendedProperties35.getVector("${");
        java.util.Vector vector48 = extendedProperties20.getVector("/", vector47);
        java.lang.Long long51 = extendedProperties20.getLong("}", (java.lang.Long) 10L);
        java.lang.Long long54 = extendedProperties20.getLong(",", (java.lang.Long) 32L);
        java.lang.Object obj55 = extendedProperties5.remove((java.lang.Object) ",");
        java.lang.String str57 = extendedProperties5.testBoolean(",");
        java.lang.String str58 = extendedProperties5.getInclude();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(obj27);
// flaky "29) test3152(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/" + "'", str28, "/");
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) 10 + "'", short43 == (short) 10);
        org.junit.Assert.assertNotNull(vector47);
        org.junit.Assert.assertNotNull(vector48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L + "'", long51 == 10L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 32L + "'", long54 == 32L);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(str57);
// flaky "2) test3152(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "/" + "'", str58, "/");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("hi!", list2);
        java.lang.String str5 = extendedProperties0.interpolate("");
        boolean boolean8 = extendedProperties0.getBoolean("", false);
        extendedProperties0.file = "hi!";
        java.util.ArrayList arrayList11 = extendedProperties0.keysAsListed;
        java.lang.Double double14 = extendedProperties0.getDouble("hi!", (java.lang.Double) 100.0d);
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer16 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        java.lang.Object obj17 = propertiesTokenizer16.nextElement();
        java.lang.String str18 = propertiesTokenizer16.nextToken();
        int int19 = propertiesTokenizer16.countTokens();
        java.io.Reader reader20 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader21 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader20);
        java.lang.String str22 = propertiesReader21.readProperty();
        int int23 = propertiesReader21.getLineNumber();
        java.lang.String str24 = propertiesReader21.readProperty();
        propertiesReader21.mark((int) (byte) 10);
        java.lang.Object obj27 = extendedProperties0.put((java.lang.Object) propertiesTokenizer16, (java.lang.Object) propertiesReader21);
        java.lang.Object obj28 = propertiesTokenizer16.nextElement();
        java.lang.String str30 = propertiesTokenizer16.nextToken("${");
        boolean boolean31 = propertiesTokenizer16.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(reader20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }
}
