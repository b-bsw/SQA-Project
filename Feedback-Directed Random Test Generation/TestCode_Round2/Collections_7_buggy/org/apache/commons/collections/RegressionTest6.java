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
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("}");
        short short7 = extendedProperties0.getShort("", (short) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = extendedProperties0.subset("}");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int12 = extendedProperties9.getInteger("/", (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertNull(extendedProperties9);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.fileSeparator = "";
        boolean boolean11 = extendedProperties6.getBoolean("/", true);
        java.util.ArrayList arrayList12 = extendedProperties6.keysAsListed;
        java.util.Properties properties14 = null;
        java.util.Properties properties15 = extendedProperties6.getProperties("}", properties14);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties15);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.fileSeparator = "";
        boolean boolean25 = extendedProperties20.getBoolean("/", true);
        java.util.ArrayList arrayList26 = extendedProperties20.keysAsListed;
        java.util.List list27 = extendedProperties18.getList("/", (java.util.List) arrayList26);
        java.lang.String str28 = extendedProperties16.interpolateHelper("}", (java.util.List) arrayList26);
        java.util.Vector vector30 = null;
        java.util.Vector vector31 = extendedProperties16.getVector("hi!", vector30);
        java.util.Vector vector32 = extendedProperties0.getVector("/", vector30);
        java.lang.Double double35 = extendedProperties0.getDouble(",", (java.lang.Double) 1.0d);
        extendedProperties0.file = "/";
        byte byte40 = extendedProperties0.getByte("hi!", (byte) 0);
        boolean boolean41 = extendedProperties0.isInitialized;
        java.lang.String str43 = extendedProperties0.interpolate("}");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "}" + "'", str28, "}");
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 0 + "'", byte40 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "}" + "'", str43, "}");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str11 = extendedProperties10.fileSeparator;
        java.lang.String str13 = extendedProperties10.testBoolean("${");
        extendedProperties0.combine(extendedProperties10);
        double double17 = extendedProperties10.getDouble("", (double) 1.0f);
        java.lang.Object obj19 = extendedProperties10.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str21 = extendedProperties20.fileSeparator;
        java.lang.String str23 = extendedProperties20.testBoolean("${");
        java.lang.String str24 = extendedProperties20.getInclude();
        java.lang.Integer int27 = extendedProperties20.getInteger(",", (java.lang.Integer) 100);
        java.lang.Float float30 = extendedProperties20.getFloat("include", (java.lang.Float) 100.0f);
        extendedProperties10.putAll((java.util.Map) extendedProperties20);
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer34 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        java.lang.String str35 = propertiesTokenizer34.nextToken();
        java.util.Iterator<java.lang.Object> objItor36 = propertiesTokenizer34.asIterator();
        int int37 = propertiesTokenizer34.countTokens();
        java.util.Iterator<java.lang.Object> objItor38 = propertiesTokenizer34.asIterator();
        java.lang.String str40 = propertiesTokenizer34.nextToken("}");
        boolean boolean41 = propertiesTokenizer34.hasMoreTokens();
        extendedProperties10.setProperty("include", (java.lang.Object) boolean41);
        double double45 = extendedProperties10.getDouble("", (double) (byte) 0);
        java.lang.String str47 = extendedProperties10.interpolate("}");
        boolean boolean48 = extendedProperties10.isInitialized;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/" + "'", str21, "/");
        org.junit.Assert.assertNull(str23);
// flaky "1) test3003(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/" + "'", str24, "/");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(objItor36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objItor38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "}" + "'", str47, "}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.ArrayList arrayList1 = null;
        extendedProperties0.keysAsListed = arrayList1;
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties4.fileSeparator = "";
        boolean boolean9 = extendedProperties4.getBoolean("/", true);
        java.util.ArrayList arrayList10 = extendedProperties4.keysAsListed;
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties4.getProperties("}", properties12);
        java.util.Properties properties14 = extendedProperties0.getProperties("include", properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.fileSeparator = "";
        boolean boolean21 = extendedProperties16.getBoolean("/", true);
        java.util.ArrayList arrayList22 = extendedProperties16.keysAsListed;
        java.util.Properties properties24 = null;
        java.util.Properties properties25 = extendedProperties16.getProperties("}", properties24);
        double double28 = extendedProperties16.getDouble("include", 100.0d);
        java.lang.Double double31 = extendedProperties16.getDouble("/", (java.lang.Double) (-1.0d));
        extendedProperties15.putAll((java.util.Map) extendedProperties16);
        extendedProperties15.basePath = ",";
        java.lang.Long long37 = extendedProperties15.getLong("include", (java.lang.Long) 1L);
        java.lang.String str39 = extendedProperties15.testBoolean("}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(extendedProperties15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(arrayList22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader18 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int25 = reader18.read(charArray24);
        java.io.Reader reader26 = java.io.Reader.nullReader();
        char[] charArray32 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int33 = reader26.read(charArray32);
        int int34 = reader18.read(charArray32);
        int int37 = propertiesReader17.read(charArray32, (int) (byte) 1, (int) (short) 0);
        boolean boolean38 = propertiesReader17.markSupported();
        long long40 = propertiesReader17.skip((long) 'a');
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader41 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader42 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader41);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(reader26);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.ArrayList arrayList7 = extendedProperties0.keysAsListed;
        java.lang.Double double10 = extendedProperties0.getDouble("}", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.fileSeparator = "";
        boolean boolean16 = extendedProperties11.getBoolean("/", true);
        java.util.ArrayList arrayList17 = extendedProperties11.keysAsListed;
        java.util.Properties properties19 = null;
        java.util.Properties properties20 = extendedProperties11.getProperties("}", properties19);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties20);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties25.fileSeparator = "";
        boolean boolean30 = extendedProperties25.getBoolean("/", true);
        java.util.ArrayList arrayList31 = extendedProperties25.keysAsListed;
        java.util.List list32 = extendedProperties23.getList("/", (java.util.List) arrayList31);
        java.lang.String str33 = extendedProperties21.interpolateHelper("}", (java.util.List) arrayList31);
        java.util.List list35 = extendedProperties21.getList(",");
        java.lang.String str36 = extendedProperties21.getInclude();
        java.lang.String str37 = extendedProperties21.fileSeparator;
        extendedProperties0.putAll((java.util.Map) extendedProperties21);
        java.util.List list40 = null;
        java.util.List list41 = extendedProperties21.getList("", list40);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties43.fileSeparator = "";
        boolean boolean48 = extendedProperties43.getBoolean("/", true);
        float float51 = extendedProperties43.getFloat("/", (float) '4');
        java.lang.Double double54 = extendedProperties43.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties56.fileSeparator = "";
        boolean boolean61 = extendedProperties56.getBoolean("/", true);
        java.util.ArrayList arrayList62 = extendedProperties56.keysAsListed;
        java.util.Properties properties64 = null;
        java.util.Properties properties65 = extendedProperties56.getProperties("}", properties64);
        java.util.Properties properties66 = extendedProperties43.getProperties(",", properties65);
        org.apache.commons.collections.ExtendedProperties extendedProperties67 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties66);
        extendedProperties67.basePath = "include";
        boolean boolean72 = extendedProperties67.getBoolean("include", true);
        boolean boolean73 = extendedProperties67.isInitialized();
        java.lang.Boolean boolean76 = extendedProperties67.getBoolean("}", (java.lang.Boolean) false);
        double double79 = extendedProperties67.getDouble("include", (double) (-1L));
        java.io.OutputStream outputStream80 = null;
        extendedProperties67.save(outputStream80, "");
        boolean boolean85 = extendedProperties67.getBoolean("", true);
        extendedProperties21.addProperty("}", (java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(arrayList17);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(extendedProperties21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(arrayList31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "}" + "'", str33, "}");
        org.junit.Assert.assertNotNull(list35);
// flaky "2) test3006(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "/" + "'", str36, "/");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/" + "'", str37, "/");
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 52.0f + "'", float51 == 52.0f);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(arrayList62);
        org.junit.Assert.assertNotNull(properties65);
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertNotNull(extendedProperties67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.String str3 = extendedProperties0.testBoolean("${");
        java.lang.String str4 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.fileSeparator = "";
        boolean boolean10 = extendedProperties5.getBoolean("/", true);
        float float13 = extendedProperties5.getFloat("/", (float) '4');
        java.lang.Double double16 = extendedProperties5.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.fileSeparator = "";
        boolean boolean22 = extendedProperties17.getBoolean("/", true);
        java.util.ArrayList arrayList23 = extendedProperties17.keysAsListed;
        java.util.Properties properties25 = null;
        java.util.Properties properties26 = extendedProperties17.getProperties("}", properties25);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties26);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.fileSeparator = "";
        boolean boolean36 = extendedProperties31.getBoolean("/", true);
        java.util.ArrayList arrayList37 = extendedProperties31.keysAsListed;
        java.util.List list38 = extendedProperties29.getList("/", (java.util.List) arrayList37);
        java.lang.String str39 = extendedProperties27.interpolateHelper("}", (java.util.List) arrayList37);
        extendedProperties5.keysAsListed = arrayList37;
        java.lang.String str43 = extendedProperties5.getString("/", "include");
        extendedProperties0.combine(extendedProperties5);
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties45.fileSeparator = "";
        boolean boolean50 = extendedProperties45.getBoolean("/", true);
        java.util.ArrayList arrayList51 = extendedProperties45.keysAsListed;
        extendedProperties5.combine(extendedProperties45);
        java.lang.Long long55 = extendedProperties45.getLong(",", (java.lang.Long) 100L);
        java.lang.Long long58 = extendedProperties45.getLong("include", (java.lang.Long) 1L);
        java.io.OutputStream outputStream59 = null;
        extendedProperties45.save(outputStream59, "include");
        java.lang.String str62 = extendedProperties45.getInclude();
        java.util.Vector vector64 = extendedProperties45.getVector("hi!");
        extendedProperties45.isInitialized = true;
        java.lang.String str67 = extendedProperties45.file;
        boolean boolean68 = extendedProperties45.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties69 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties69.fileSeparator = "";
        boolean boolean74 = extendedProperties69.getBoolean("/", true);
        java.util.ArrayList arrayList75 = extendedProperties69.keysAsListed;
        java.util.Properties properties77 = null;
        java.util.Properties properties78 = extendedProperties69.getProperties("}", properties77);
        double double81 = extendedProperties69.getDouble("include", 100.0d);
        java.lang.Double double84 = extendedProperties69.getDouble("/", (java.lang.Double) (-1.0d));
        boolean boolean87 = extendedProperties69.getBoolean("include", false);
        short short90 = extendedProperties69.getShort("hi!", (short) (byte) 100);
        extendedProperties45.combine(extendedProperties69);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str3);
// flaky "3) test3007(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 52.0f + "'", float13 == 52.0f);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(extendedProperties27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "}" + "'", str39, "}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "include" + "'", str43, "include");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(arrayList51);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 100L + "'", long55 == 100L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
// flaky "1) test3007(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "/" + "'", str62, "/");
        org.junit.Assert.assertNotNull(vector64);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(arrayList75);
        org.junit.Assert.assertNotNull(properties78);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 100.0d + "'", double81 == 100.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + short90 + "' != '" + (short) 100 + "'", short90 == (short) 100);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties9);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.fileSeparator = "";
        boolean boolean19 = extendedProperties14.getBoolean("/", true);
        java.util.ArrayList arrayList20 = extendedProperties14.keysAsListed;
        java.util.List list21 = extendedProperties12.getList("/", (java.util.List) arrayList20);
        java.lang.String str22 = extendedProperties10.interpolateHelper("}", (java.util.List) arrayList20);
        java.util.List list24 = extendedProperties10.getList(",");
        java.lang.String str25 = extendedProperties10.getInclude();
        java.lang.Long long28 = extendedProperties10.getLong("hi!", (java.lang.Long) 0L);
        java.lang.Boolean boolean31 = extendedProperties10.getBoolean("${", (java.lang.Boolean) false);
        extendedProperties10.fileSeparator = "${";
        extendedProperties10.file = "}";
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties38.fileSeparator = "";
        boolean boolean43 = extendedProperties38.getBoolean("/", true);
        java.util.ArrayList arrayList44 = extendedProperties38.keysAsListed;
        java.util.List list45 = extendedProperties36.getList("/", (java.util.List) arrayList44);
        extendedProperties36.basePath = "hi!";
        short short50 = extendedProperties36.getShort("include", (short) 1);
        java.lang.String str53 = extendedProperties36.getString("hi!", ",");
        extendedProperties10.combine(extendedProperties36);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = extendedProperties36.getInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(arrayList20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
        org.junit.Assert.assertNotNull(list24);
// flaky "4) test3008(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "/" + "'", str25, "/");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(arrayList44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) 1 + "'", short50 == (short) 1);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "," + "'", str53, ",");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties9);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.fileSeparator = "";
        boolean boolean19 = extendedProperties14.getBoolean("/", true);
        java.util.ArrayList arrayList20 = extendedProperties14.keysAsListed;
        java.util.List list21 = extendedProperties12.getList("/", (java.util.List) arrayList20);
        java.lang.String str22 = extendedProperties10.interpolateHelper("}", (java.util.List) arrayList20);
        java.util.List list24 = extendedProperties10.getList(",");
        java.lang.String str25 = extendedProperties10.getInclude();
        java.lang.Long long28 = extendedProperties10.getLong("hi!", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Float float32 = extendedProperties29.getFloat("include", (java.lang.Float) 10.0f);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties33.fileSeparator = "";
        boolean boolean38 = extendedProperties33.getBoolean("/", true);
        java.util.ArrayList arrayList39 = extendedProperties33.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties40.fileSeparator = "";
        boolean boolean45 = extendedProperties40.getBoolean("/", true);
        java.util.ArrayList arrayList46 = extendedProperties40.keysAsListed;
        java.util.ArrayList arrayList47 = extendedProperties40.keysAsListed;
        extendedProperties33.keysAsListed = arrayList47;
        extendedProperties29.keysAsListed = arrayList47;
        extendedProperties10.keysAsListed = arrayList47;
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties51.fileSeparator = "";
        boolean boolean56 = extendedProperties51.getBoolean("/", true);
        java.util.ArrayList arrayList57 = extendedProperties51.keysAsListed;
        java.lang.Long long60 = extendedProperties51.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties51.basePath = "include";
        org.apache.commons.collections.ExtendedProperties extendedProperties63 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties63.fileSeparator = "";
        java.lang.String str67 = extendedProperties63.testBoolean("}");
        java.lang.String str69 = extendedProperties63.interpolate("}");
        extendedProperties63.basePath = "/";
        extendedProperties51.putAll((java.util.Map) extendedProperties63);
        extendedProperties63.file = "include";
        long long77 = extendedProperties63.getLong("/", 0L);
        extendedProperties10.combine(extendedProperties63);
        java.util.List list80 = extendedProperties63.getList(",");
        byte byte83 = extendedProperties63.getByte("${", (byte) -1);
        short short86 = extendedProperties63.getShort("${", (short) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties88 = extendedProperties63.subset("");
        int int91 = extendedProperties63.getInt("/", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(arrayList20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
        org.junit.Assert.assertNotNull(list24);
// flaky "5) test3009(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "/" + "'", str25, "/");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(arrayList39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(arrayList46);
        org.junit.Assert.assertNotNull(arrayList47);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(arrayList57);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "}" + "'", str69, "}");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertTrue("'" + byte83 + "' != '" + (byte) -1 + "'", byte83 == (byte) -1);
        org.junit.Assert.assertTrue("'" + short86 + "' != '" + (short) 0 + "'", short86 == (short) 0);
        org.junit.Assert.assertNull(extendedProperties88);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader18 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int25 = reader18.read(charArray24);
        java.io.Reader reader26 = java.io.Reader.nullReader();
        char[] charArray32 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int33 = reader26.read(charArray32);
        int int34 = reader18.read(charArray32);
        int int37 = propertiesReader17.read(charArray32, (int) (byte) 1, (int) (short) 0);
        boolean boolean38 = propertiesReader17.markSupported();
        int int39 = propertiesReader17.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader40 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        int int41 = propertiesReader17.read();
        propertiesReader17.mark((int) '4');
        boolean boolean44 = propertiesReader17.markSupported();
        char[] charArray45 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int46 = propertiesReader17.read(charArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(reader26);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.ArrayList arrayList1 = null;
        extendedProperties0.keysAsListed = arrayList1;
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties4.fileSeparator = "";
        boolean boolean9 = extendedProperties4.getBoolean("/", true);
        java.util.ArrayList arrayList10 = extendedProperties4.keysAsListed;
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties4.getProperties("}", properties12);
        java.util.Properties properties14 = extendedProperties0.getProperties("include", properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.fileSeparator = "";
        boolean boolean21 = extendedProperties16.getBoolean("/", true);
        java.util.ArrayList arrayList22 = extendedProperties16.keysAsListed;
        java.util.Properties properties24 = null;
        java.util.Properties properties25 = extendedProperties16.getProperties("}", properties24);
        double double28 = extendedProperties16.getDouble("include", 100.0d);
        java.lang.Double double31 = extendedProperties16.getDouble("/", (java.lang.Double) (-1.0d));
        extendedProperties15.putAll((java.util.Map) extendedProperties16);
        java.lang.Double double35 = extendedProperties16.getDouble("/", (java.lang.Double) 10.0d);
        float float38 = extendedProperties16.getFloat("", (float) 100);
        java.lang.Object obj40 = extendedProperties16.getProperty("");
        // The following exception was thrown during execution in test generation
        try {
            long long42 = extendedProperties16.getLong("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(extendedProperties15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(arrayList22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 100.0f + "'", float38 == 100.0f);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties9);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.fileSeparator = "";
        boolean boolean19 = extendedProperties14.getBoolean("/", true);
        java.util.ArrayList arrayList20 = extendedProperties14.keysAsListed;
        java.util.List list21 = extendedProperties12.getList("/", (java.util.List) arrayList20);
        java.lang.String str22 = extendedProperties10.interpolateHelper("}", (java.util.List) arrayList20);
        java.util.Vector vector24 = null;
        java.util.Vector vector25 = extendedProperties10.getVector("hi!", vector24);
        java.lang.Short short28 = extendedProperties10.getShort("", (java.lang.Short) (short) 1);
        short short31 = extendedProperties10.getShort("hi!", (short) (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties33.fileSeparator = "";
        java.lang.String str37 = extendedProperties33.testBoolean("/");
        java.lang.Boolean boolean40 = extendedProperties33.getBoolean("}", (java.lang.Boolean) true);
        extendedProperties33.setInclude("/");
        int int45 = extendedProperties33.getInteger("${", (int) '#');
        extendedProperties10.addProperty("hi!", (java.lang.Object) "${");
        java.lang.Short short49 = extendedProperties10.getShort("}", (java.lang.Short) (short) 100);
        java.lang.String str51 = extendedProperties10.interpolate("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte byte54 = extendedProperties10.getByte("hi!", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"${\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(arrayList20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
        org.junit.Assert.assertNotNull(vector25);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 1 + "'", short28 == (short) 1);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 100 + "'", short49 == (short) 100);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        boolean boolean12 = extendedProperties0.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str14 = extendedProperties13.fileSeparator;
        java.lang.String str16 = extendedProperties13.testBoolean("${");
        java.lang.String str17 = extendedProperties13.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.fileSeparator = "";
        boolean boolean23 = extendedProperties18.getBoolean("/", true);
        float float26 = extendedProperties18.getFloat("/", (float) '4');
        java.lang.Double double29 = extendedProperties18.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties30.fileSeparator = "";
        boolean boolean35 = extendedProperties30.getBoolean("/", true);
        java.util.ArrayList arrayList36 = extendedProperties30.keysAsListed;
        java.util.Properties properties38 = null;
        java.util.Properties properties39 = extendedProperties30.getProperties("}", properties38);
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties39);
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties44.fileSeparator = "";
        boolean boolean49 = extendedProperties44.getBoolean("/", true);
        java.util.ArrayList arrayList50 = extendedProperties44.keysAsListed;
        java.util.List list51 = extendedProperties42.getList("/", (java.util.List) arrayList50);
        java.lang.String str52 = extendedProperties40.interpolateHelper("}", (java.util.List) arrayList50);
        extendedProperties18.keysAsListed = arrayList50;
        java.lang.String str56 = extendedProperties18.getString("/", "include");
        extendedProperties13.combine(extendedProperties18);
        extendedProperties0.putAll((java.util.Map) extendedProperties18);
        org.apache.commons.collections.ExtendedProperties extendedProperties60 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties60.fileSeparator = "";
        boolean boolean65 = extendedProperties60.getBoolean("/", true);
        float float68 = extendedProperties60.getFloat("/", (float) '4');
        extendedProperties60.file = "/";
        org.apache.commons.collections.ExtendedProperties extendedProperties72 = extendedProperties60.subset("hi!");
        extendedProperties18.setProperty(",", (java.lang.Object) extendedProperties60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertNull(str16);
// flaky "6) test3013(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/" + "'", str17, "/");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 52.0f + "'", float26 == 52.0f);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(arrayList36);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(extendedProperties40);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(arrayList50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "}" + "'", str52, "}");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "include" + "'", str56, "include");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 52.0f + "'", float68 == 52.0f);
        org.junit.Assert.assertNull(extendedProperties72);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.String str3 = extendedProperties0.testBoolean("${");
        boolean boolean6 = extendedProperties0.getBoolean("}", true);
        extendedProperties0.fileSeparator = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties9.fileSeparator = "";
        boolean boolean14 = extendedProperties9.getBoolean("/", true);
        java.util.ArrayList arrayList15 = extendedProperties9.keysAsListed;
        java.util.ArrayList arrayList16 = extendedProperties9.keysAsListed;
        java.lang.Double double19 = extendedProperties9.getDouble("}", (java.lang.Double) 0.0d);
        java.util.Properties properties21 = extendedProperties9.getProperties("}");
        java.lang.String[] strArray23 = extendedProperties9.getStringArray("hi!");
        java.util.ArrayList arrayList24 = extendedProperties9.keysAsListed;
        extendedProperties0.keysAsListed = arrayList24;
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties27.fileSeparator = "";
        java.lang.String str31 = extendedProperties27.testBoolean("}");
        java.lang.String str33 = extendedProperties27.interpolate("}");
        byte byte36 = extendedProperties27.getByte("}", (byte) 100);
        java.lang.String str39 = extendedProperties27.getString("}", "}");
        java.util.Properties properties41 = extendedProperties27.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties41);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties41);
        java.util.Properties properties44 = extendedProperties0.getProperties("}", properties41);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertNotNull(arrayList16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "}" + "'", str33, "}");
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 100 + "'", byte36 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "}" + "'", str39, "}");
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(extendedProperties42);
        org.junit.Assert.assertNotNull(extendedProperties43);
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader18 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int25 = reader18.read(charArray24);
        java.io.Reader reader26 = java.io.Reader.nullReader();
        char[] charArray32 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int33 = reader26.read(charArray32);
        int int34 = reader18.read(charArray32);
        int int37 = propertiesReader17.read(charArray32, (int) (byte) 1, (int) (short) 0);
        boolean boolean38 = propertiesReader17.markSupported();
        int int39 = propertiesReader17.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader40 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader41 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        java.io.Reader reader42 = java.io.Reader.nullReader();
        char[] charArray48 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int49 = reader42.read(charArray48);
        java.io.Reader reader50 = java.io.Reader.nullReader();
        char[] charArray56 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int57 = reader50.read(charArray56);
        int int58 = reader42.read(charArray56);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader59 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader42);
        propertiesReader59.setLineNumber((int) (byte) 100);
        int int62 = propertiesReader59.read();
        char[] charArray65 = new char[] { 'a', '#' };
        int int66 = propertiesReader59.read(charArray65);
        int int67 = propertiesReader17.read(charArray65);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader68 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        propertiesReader17.close();
        propertiesReader17.setLineNumber(100);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(reader26);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(reader42);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(reader50);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { 'a', '#' });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties7.fileSeparator = "";
        boolean boolean12 = extendedProperties7.getBoolean("/", true);
        java.util.ArrayList arrayList13 = extendedProperties7.keysAsListed;
        java.util.ArrayList arrayList14 = extendedProperties7.keysAsListed;
        extendedProperties0.keysAsListed = arrayList14;
        java.lang.Short short18 = extendedProperties0.getShort("}", (java.lang.Short) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.fileSeparator = "";
        boolean boolean25 = extendedProperties20.getBoolean("/", true);
        java.util.ArrayList arrayList26 = extendedProperties20.keysAsListed;
        java.util.ArrayList arrayList27 = extendedProperties20.keysAsListed;
        java.lang.Double double30 = extendedProperties20.getDouble("}", (java.lang.Double) 0.0d);
        java.util.Properties properties32 = extendedProperties20.getProperties("}");
        java.lang.String[] strArray34 = extendedProperties20.getStringArray("hi!");
        extendedProperties0.setProperty("${", (java.lang.Object) "hi!");
        java.lang.String[] strArray37 = extendedProperties0.getStringArray(",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(arrayList13);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertNotNull(arrayList27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] {});
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.fileSeparator = "";
        java.lang.String str16 = extendedProperties12.testBoolean("}");
        java.lang.String str18 = extendedProperties12.interpolate("}");
        extendedProperties12.basePath = "/";
        extendedProperties0.putAll((java.util.Map) extendedProperties12);
        int int24 = extendedProperties0.getInteger("", 32);
        java.lang.Boolean boolean27 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        byte byte30 = extendedProperties0.getByte("hi!", (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "}" + "'", str18, "}");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.fileSeparator = "";
        boolean boolean11 = extendedProperties6.getBoolean("/", true);
        java.util.ArrayList arrayList12 = extendedProperties6.keysAsListed;
        java.util.Properties properties14 = null;
        java.util.Properties properties15 = extendedProperties6.getProperties("}", properties14);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties15);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.fileSeparator = "";
        boolean boolean25 = extendedProperties20.getBoolean("/", true);
        java.util.ArrayList arrayList26 = extendedProperties20.keysAsListed;
        java.util.List list27 = extendedProperties18.getList("/", (java.util.List) arrayList26);
        java.lang.String str28 = extendedProperties16.interpolateHelper("}", (java.util.List) arrayList26);
        java.util.Vector vector30 = null;
        java.util.Vector vector31 = extendedProperties16.getVector("hi!", vector30);
        java.util.Vector vector32 = extendedProperties0.getVector("/", vector30);
        java.lang.Double double35 = extendedProperties0.getDouble(",", (java.lang.Double) 1.0d);
        extendedProperties0.file = "/";
        byte byte40 = extendedProperties0.getByte("hi!", (byte) 0);
        int int43 = extendedProperties0.getInt("include", 52);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "}" + "'", str28, "}");
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 0 + "'", byte40 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
        int int2 = propertiesTokenizer1.countTokens();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        boolean boolean5 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "}" + "'", obj3, "}");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties7.fileSeparator = "";
        boolean boolean12 = extendedProperties7.getBoolean("/", true);
        java.util.ArrayList arrayList13 = extendedProperties7.keysAsListed;
        java.util.ArrayList arrayList14 = extendedProperties7.keysAsListed;
        extendedProperties0.keysAsListed = arrayList14;
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.fileSeparator = "";
        java.lang.String str21 = extendedProperties17.testBoolean("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties23.fileSeparator = "";
        boolean boolean28 = extendedProperties23.getBoolean("/", true);
        java.util.ArrayList arrayList29 = extendedProperties23.keysAsListed;
        java.util.Properties properties31 = null;
        java.util.Properties properties32 = extendedProperties23.getProperties("}", properties31);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties32);
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties37.fileSeparator = "";
        boolean boolean42 = extendedProperties37.getBoolean("/", true);
        java.util.ArrayList arrayList43 = extendedProperties37.keysAsListed;
        java.util.List list44 = extendedProperties35.getList("/", (java.util.List) arrayList43);
        java.lang.String str45 = extendedProperties33.interpolateHelper("}", (java.util.List) arrayList43);
        java.util.Vector vector47 = null;
        java.util.Vector vector48 = extendedProperties33.getVector("hi!", vector47);
        java.util.Vector vector49 = extendedProperties17.getVector("/", vector47);
        java.util.Vector vector51 = extendedProperties17.getVector("");
        java.lang.String str52 = extendedProperties0.interpolateHelper("include", (java.util.List) vector51);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(arrayList13);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(arrayList29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(extendedProperties33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(arrayList43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "}" + "'", str45, "}");
        org.junit.Assert.assertNotNull(vector48);
        org.junit.Assert.assertNotNull(vector49);
        org.junit.Assert.assertNotNull(vector51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "include" + "'", str52, "include");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader18 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int25 = reader18.read(charArray24);
        java.io.Reader reader26 = java.io.Reader.nullReader();
        char[] charArray32 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int33 = reader26.read(charArray32);
        int int34 = reader18.read(charArray32);
        int int37 = propertiesReader17.read(charArray32, (int) (byte) 1, (int) (short) 0);
        boolean boolean38 = propertiesReader17.markSupported();
        int int39 = propertiesReader17.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader40 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader41 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        java.io.Reader reader42 = java.io.Reader.nullReader();
        char[] charArray48 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int49 = reader42.read(charArray48);
        java.io.Reader reader50 = java.io.Reader.nullReader();
        char[] charArray56 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int57 = reader50.read(charArray56);
        int int58 = reader42.read(charArray56);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader59 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader42);
        propertiesReader59.setLineNumber((int) (byte) 100);
        int int62 = propertiesReader59.read();
        char[] charArray65 = new char[] { 'a', '#' };
        int int66 = propertiesReader59.read(charArray65);
        int int67 = propertiesReader17.read(charArray65);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader68 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        propertiesReader17.close();
        java.io.Writer writer70 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long71 = propertiesReader17.transferTo(writer70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(reader26);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(reader42);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(reader50);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { 'a', '#' });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        float float8 = extendedProperties0.getFloat("/", (float) '4');
        java.lang.Double double11 = extendedProperties0.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.fileSeparator = "";
        boolean boolean17 = extendedProperties12.getBoolean("/", true);
        java.util.ArrayList arrayList18 = extendedProperties12.keysAsListed;
        java.util.Properties properties20 = null;
        java.util.Properties properties21 = extendedProperties12.getProperties("}", properties20);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties21);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties26.fileSeparator = "";
        boolean boolean31 = extendedProperties26.getBoolean("/", true);
        java.util.ArrayList arrayList32 = extendedProperties26.keysAsListed;
        java.util.List list33 = extendedProperties24.getList("/", (java.util.List) arrayList32);
        java.lang.String str34 = extendedProperties22.interpolateHelper("}", (java.util.List) arrayList32);
        extendedProperties0.keysAsListed = arrayList32;
        java.lang.String str38 = extendedProperties0.getString("/", "include");
        java.lang.String[] strArray40 = extendedProperties0.getStringArray("${");
        java.lang.Float float43 = extendedProperties0.getFloat("hi!", (java.lang.Float) 52.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 52.0f + "'", float8 == 52.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(arrayList18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(extendedProperties22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(arrayList32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "}" + "'", str34, "}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "include" + "'", str38, "include");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 52.0f + "'", float43 == 52.0f);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.fileSeparator = "";
        java.lang.String str16 = extendedProperties12.testBoolean("}");
        java.lang.String str18 = extendedProperties12.interpolate("}");
        extendedProperties12.basePath = "/";
        extendedProperties0.putAll((java.util.Map) extendedProperties12);
        int int24 = extendedProperties0.getInteger("", 32);
        java.lang.Boolean boolean27 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String str28 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.util.ArrayList arrayList31 = null;
        extendedProperties30.keysAsListed = arrayList31;
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties34.fileSeparator = "";
        boolean boolean39 = extendedProperties34.getBoolean("/", true);
        java.util.ArrayList arrayList40 = extendedProperties34.keysAsListed;
        java.util.Properties properties42 = null;
        java.util.Properties properties43 = extendedProperties34.getProperties("}", properties42);
        java.util.Properties properties44 = extendedProperties30.getProperties("include", properties43);
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties43);
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties43);
        extendedProperties46.isInitialized = true;
        java.lang.String str49 = extendedProperties46.fileSeparator;
        java.util.Vector vector51 = extendedProperties46.getVector("");
        extendedProperties0.addProperty("}", (java.lang.Object) "");
        boolean boolean53 = extendedProperties0.isInitialized;
        // The following exception was thrown during execution in test generation
        try {
            byte byte55 = extendedProperties0.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "}" + "'", str18, "}");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky "7) test3023(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/" + "'", str28, "/");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(arrayList40);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNotNull(extendedProperties45);
        org.junit.Assert.assertNotNull(extendedProperties46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "/" + "'", str49, "/");
        org.junit.Assert.assertNotNull(vector51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        boolean boolean12 = extendedProperties0.isInitialized();
        java.lang.Integer int15 = extendedProperties0.getInteger(",", (java.lang.Integer) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.fileSeparator = "";
        java.lang.String str20 = extendedProperties16.testBoolean("}");
        extendedProperties0.putAll((java.util.Map) extendedProperties16);
        java.lang.Integer int24 = extendedProperties16.getInteger("/", (java.lang.Integer) 0);
        java.util.Properties properties26 = extendedProperties16.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties26);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties29.fileSeparator = "";
        boolean boolean34 = extendedProperties29.getBoolean("/", true);
        java.util.ArrayList arrayList35 = extendedProperties29.keysAsListed;
        java.util.Properties properties37 = null;
        java.util.Properties properties38 = extendedProperties29.getProperties("}", properties37);
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties38);
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties43.fileSeparator = "";
        boolean boolean48 = extendedProperties43.getBoolean("/", true);
        java.util.ArrayList arrayList49 = extendedProperties43.keysAsListed;
        java.util.List list50 = extendedProperties41.getList("/", (java.util.List) arrayList49);
        java.lang.String str51 = extendedProperties39.interpolateHelper("}", (java.util.List) arrayList49);
        java.util.List list53 = extendedProperties39.getList(",");
        java.lang.String str54 = extendedProperties39.getInclude();
        java.lang.String str55 = extendedProperties39.fileSeparator;
        java.util.List list57 = extendedProperties39.getList("/");
        java.lang.Long long60 = extendedProperties39.getLong("", (java.lang.Long) 100L);
        int int63 = extendedProperties39.getInt(",", 1);
        extendedProperties39.setInclude("include");
        extendedProperties27.setProperty("", (java.lang.Object) extendedProperties39);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(extendedProperties27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(arrayList35);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(extendedProperties39);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(arrayList49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "}" + "'", str51, "}");
        org.junit.Assert.assertNotNull(list53);
// flaky "8) test3024(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "/" + "'", str54, "/");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "/" + "'", str55, "/");
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 100L + "'", long60 == 100L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties9);
        extendedProperties10.clearProperty("");
        int int15 = extendedProperties10.getInt("${", (int) (byte) -1);
        int int18 = extendedProperties10.getInteger("${", 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.fileSeparator = "";
        java.lang.String str24 = extendedProperties20.testBoolean("/");
        java.lang.Boolean boolean27 = extendedProperties20.getBoolean("}", (java.lang.Boolean) true);
        java.lang.Integer int30 = extendedProperties20.getInteger("/", (java.lang.Integer) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = extendedProperties20.subset("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties33.fileSeparator = "";
        boolean boolean38 = extendedProperties33.getBoolean("/", true);
        float float41 = extendedProperties33.getFloat("/", (float) '4');
        java.lang.Double double44 = extendedProperties33.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties46.fileSeparator = "";
        boolean boolean51 = extendedProperties46.getBoolean("/", true);
        java.util.ArrayList arrayList52 = extendedProperties46.keysAsListed;
        java.util.Properties properties54 = null;
        java.util.Properties properties55 = extendedProperties46.getProperties("}", properties54);
        java.util.Properties properties56 = extendedProperties33.getProperties(",", properties55);
        org.apache.commons.collections.ExtendedProperties extendedProperties57 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties56);
        extendedProperties57.basePath = "include";
        boolean boolean62 = extendedProperties57.getBoolean("include", true);
        boolean boolean63 = extendedProperties57.isInitialized();
        java.lang.Boolean boolean66 = extendedProperties57.getBoolean("}", (java.lang.Boolean) false);
        double double69 = extendedProperties57.getDouble("include", (double) (-1L));
        extendedProperties20.combine(extendedProperties57);
        org.apache.commons.collections.ExtendedProperties extendedProperties72 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties72.fileSeparator = "";
        java.lang.String str76 = extendedProperties72.testBoolean("}");
        java.lang.String str78 = extendedProperties72.interpolate("}");
        byte byte81 = extendedProperties72.getByte("}", (byte) 100);
        java.lang.String str84 = extendedProperties72.getString("}", "}");
        java.util.Properties properties86 = extendedProperties72.getProperties("");
        java.util.Properties properties87 = extendedProperties20.getProperties("include", properties86);
        java.util.Properties properties88 = extendedProperties10.getProperties("", properties86);
        org.apache.commons.collections.ExtendedProperties extendedProperties89 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties88);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(extendedProperties32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 52.0f + "'", float41 == 52.0f);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(arrayList52);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertNotNull(extendedProperties57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "}" + "'", str78, "}");
        org.junit.Assert.assertTrue("'" + byte81 + "' != '" + (byte) 100 + "'", byte81 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "}" + "'", str84, "}");
        org.junit.Assert.assertNotNull(properties86);
        org.junit.Assert.assertNotNull(properties87);
        org.junit.Assert.assertNotNull(properties88);
        org.junit.Assert.assertNotNull(extendedProperties89);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("}");
        java.lang.String str6 = extendedProperties0.interpolate("}");
        extendedProperties0.basePath = "/";
        java.util.Properties properties10 = extendedProperties0.getProperties("${");
        extendedProperties0.setInclude("}");
        int int15 = extendedProperties0.getInteger("hi!", 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties17.fileSeparator;
        java.lang.String str20 = extendedProperties17.testBoolean("${");
        float float23 = extendedProperties17.getFloat("${", (float) 1);
        java.lang.String str25 = extendedProperties17.testBoolean(",");
        java.util.Iterator iterator26 = extendedProperties17.getKeys();
        short short29 = extendedProperties17.getShort("${", (short) 0);
        java.lang.Short short32 = extendedProperties17.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties34.fileSeparator = "";
        java.lang.String str38 = extendedProperties34.testBoolean("}");
        java.lang.String str39 = extendedProperties34.basePath;
        byte byte42 = extendedProperties34.getByte("", (byte) -1);
        extendedProperties34.clearProperty("include");
        java.util.Properties properties46 = extendedProperties34.getProperties("");
        java.util.Vector vector48 = extendedProperties34.getVector("/");
        java.util.List list49 = extendedProperties17.getList("${", (java.util.List) vector48);
        java.util.Vector vector50 = extendedProperties0.getVector("include", vector48);
        java.io.InputStream inputStream51 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/" + "'", str18, "/");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 0 + "'", short29 == (short) 0);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 10 + "'", short32 == (short) 10);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) -1 + "'", byte42 == (byte) -1);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(vector48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(vector50);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("}");
        java.lang.String str5 = extendedProperties0.basePath;
        byte byte8 = extendedProperties0.getByte("", (byte) -1);
        extendedProperties0.clearProperty("include");
        java.util.Properties properties12 = extendedProperties0.getProperties("");
        java.util.List list14 = extendedProperties0.getList("/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties9);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.fileSeparator = "";
        boolean boolean19 = extendedProperties14.getBoolean("/", true);
        java.util.ArrayList arrayList20 = extendedProperties14.keysAsListed;
        java.util.List list21 = extendedProperties12.getList("/", (java.util.List) arrayList20);
        java.lang.String str22 = extendedProperties10.interpolateHelper("}", (java.util.List) arrayList20);
        java.util.Vector vector24 = null;
        java.util.Vector vector25 = extendedProperties10.getVector("hi!", vector24);
        java.lang.Short short28 = extendedProperties10.getShort("", (java.lang.Short) (short) 1);
        java.lang.String str30 = extendedProperties10.testBoolean("include");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.fileSeparator = "";
        boolean boolean36 = extendedProperties31.getBoolean("/", true);
        float float39 = extendedProperties31.getFloat("/", (float) '4');
        java.lang.Double double42 = extendedProperties31.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties44.fileSeparator = "";
        boolean boolean49 = extendedProperties44.getBoolean("/", true);
        java.util.ArrayList arrayList50 = extendedProperties44.keysAsListed;
        java.util.Properties properties52 = null;
        java.util.Properties properties53 = extendedProperties44.getProperties("}", properties52);
        java.util.Properties properties54 = extendedProperties31.getProperties(",", properties53);
        org.apache.commons.collections.ExtendedProperties extendedProperties55 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties54);
        extendedProperties10.putAll((java.util.Map) extendedProperties55);
        extendedProperties10.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties60 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties60.fileSeparator = "";
        boolean boolean65 = extendedProperties60.getBoolean("/", true);
        float float68 = extendedProperties60.getFloat("/", (float) '4');
        java.lang.Double double71 = extendedProperties60.getDouble("include", (java.lang.Double) 10.0d);
        java.lang.Double double74 = extendedProperties60.getDouble("/", (java.lang.Double) (-1.0d));
        java.lang.Integer int77 = extendedProperties60.getInteger("/", (java.lang.Integer) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties79 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties79.fileSeparator = "";
        java.lang.String str83 = extendedProperties79.testBoolean("}");
        java.lang.String str85 = extendedProperties79.interpolate("}");
        extendedProperties79.basePath = "/";
        java.util.Properties properties89 = extendedProperties79.getProperties("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties90 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties89);
        java.util.Properties properties91 = extendedProperties60.getProperties("hi!", properties89);
        java.util.Properties properties92 = extendedProperties10.getProperties("", properties91);
        org.apache.commons.collections.ExtendedProperties extendedProperties93 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties92);
        java.lang.Float float96 = extendedProperties93.getFloat(",", (java.lang.Float) 0.0f);
        java.lang.String[] strArray98 = extendedProperties93.getStringArray("}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(arrayList20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
        org.junit.Assert.assertNotNull(vector25);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 1 + "'", short28 == (short) 1);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 52.0f + "'", float39 == 52.0f);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(arrayList50);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNotNull(extendedProperties55);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 52.0f + "'", float68 == 52.0f);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "}" + "'", str85, "}");
        org.junit.Assert.assertNotNull(properties89);
        org.junit.Assert.assertNotNull(extendedProperties90);
        org.junit.Assert.assertNotNull(properties91);
        org.junit.Assert.assertNotNull(properties92);
        org.junit.Assert.assertNotNull(extendedProperties93);
        org.junit.Assert.assertTrue("'" + float96 + "' != '" + 0.0f + "'", float96 == 0.0f);
        org.junit.Assert.assertNotNull(strArray98);
        org.junit.Assert.assertArrayEquals(strArray98, new java.lang.String[] {});
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        float float8 = extendedProperties0.getFloat("/", (float) '4');
        java.lang.Double double11 = extendedProperties0.getDouble("include", (java.lang.Double) 10.0d);
        java.lang.Double double14 = extendedProperties0.getDouble("/", (java.lang.Double) (-1.0d));
        java.lang.Integer int17 = extendedProperties0.getInteger("/", (java.lang.Integer) 10);
        java.lang.String str20 = extendedProperties0.getString(",", "hi!");
        java.lang.String[] strArray22 = extendedProperties0.getStringArray(",");
        java.lang.String[] strArray24 = extendedProperties0.getStringArray("include");
        java.lang.String str25 = extendedProperties0.basePath;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 52.0f + "'", float8 == 52.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        double double12 = extendedProperties0.getDouble("include", 100.0d);
        java.lang.Double double15 = extendedProperties0.getDouble("/", (java.lang.Double) (-1.0d));
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties17.fileSeparator;
        java.lang.String str20 = extendedProperties17.testBoolean("${");
        java.util.Vector vector22 = extendedProperties17.getVector("hi!");
        java.util.Vector vector23 = extendedProperties0.getVector("${", vector22);
        boolean boolean26 = extendedProperties0.getBoolean("", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.util.ArrayList arrayList28 = null;
        extendedProperties27.keysAsListed = arrayList28;
        long long32 = extendedProperties27.getLong("}", 10L);
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties34.fileSeparator = "";
        boolean boolean39 = extendedProperties34.getBoolean("/", true);
        java.util.ArrayList arrayList40 = extendedProperties34.keysAsListed;
        java.util.ArrayList arrayList41 = extendedProperties34.keysAsListed;
        java.util.List list43 = extendedProperties34.getList("}");
        java.util.List list44 = extendedProperties27.getList("", list43);
        float float47 = extendedProperties27.getFloat("/", (float) 'a');
        long long50 = extendedProperties27.getLong("hi!", (long) (short) -1);
        java.lang.String str52 = extendedProperties27.interpolate("/");
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.combine(extendedProperties27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/" + "'", str18, "/");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(vector22);
        org.junit.Assert.assertNotNull(vector23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(arrayList40);
        org.junit.Assert.assertNotNull(arrayList41);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 97.0f + "'", float47 == 97.0f);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "/" + "'", str52, "/");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader17.setLineNumber((int) (byte) 100);
        int int20 = propertiesReader17.read();
        char[] charArray27 = new char[] { '4', '#', 'a', 'a', 'a', ' ' };
        int int28 = propertiesReader17.read(charArray27);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader29 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        propertiesReader17.setLineNumber((-1));
        propertiesReader17.mark((int) (byte) 100);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', '#', 'a', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.ArrayList arrayList7 = extendedProperties0.keysAsListed;
        java.lang.Double double10 = extendedProperties0.getDouble("}", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.fileSeparator = "";
        boolean boolean16 = extendedProperties11.getBoolean("/", true);
        java.util.ArrayList arrayList17 = extendedProperties11.keysAsListed;
        java.util.Properties properties19 = null;
        java.util.Properties properties20 = extendedProperties11.getProperties("}", properties19);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties20);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties25.fileSeparator = "";
        boolean boolean30 = extendedProperties25.getBoolean("/", true);
        java.util.ArrayList arrayList31 = extendedProperties25.keysAsListed;
        java.util.List list32 = extendedProperties23.getList("/", (java.util.List) arrayList31);
        java.lang.String str33 = extendedProperties21.interpolateHelper("}", (java.util.List) arrayList31);
        java.util.List list35 = extendedProperties21.getList(",");
        java.lang.String str36 = extendedProperties21.getInclude();
        java.lang.String str37 = extendedProperties21.fileSeparator;
        extendedProperties0.putAll((java.util.Map) extendedProperties21);
        java.lang.String str41 = extendedProperties0.getString("hi!", "");
        java.lang.Boolean boolean44 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.util.ArrayList arrayList45 = extendedProperties0.keysAsListed;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(arrayList17);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(extendedProperties21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(arrayList31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "}" + "'", str33, "}");
        org.junit.Assert.assertNotNull(list35);
// flaky "9) test3032(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "/" + "'", str36, "/");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/" + "'", str37, "/");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(arrayList45);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.String str3 = extendedProperties0.testBoolean("${");
        boolean boolean6 = extendedProperties0.getBoolean("}", true);
        java.lang.String str8 = extendedProperties0.interpolate("${");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "${" + "'", str8, "${");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("/");
        java.lang.Boolean boolean7 = extendedProperties0.getBoolean("}", (java.lang.Boolean) true);
        java.lang.String str8 = extendedProperties0.basePath;
        java.lang.String str10 = extendedProperties0.interpolate("hi!");
        long long13 = extendedProperties0.getLong("${", (long) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.fileSeparator = "";
        java.util.List list18 = extendedProperties14.getList("include");
        extendedProperties0.combine(extendedProperties14);
        extendedProperties14.clearProperty("");
        boolean boolean24 = extendedProperties14.getBoolean("include", false);
        java.io.OutputStream outputStream25 = null;
        extendedProperties14.save(outputStream25, "/");
        java.lang.String str30 = extendedProperties14.getString("hi!", ",");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "," + "'", str30, ",");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.String str3 = extendedProperties0.testBoolean("${");
        boolean boolean6 = extendedProperties0.getBoolean("}", true);
        java.lang.Object obj8 = extendedProperties0.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties10.fileSeparator = "";
        boolean boolean15 = extendedProperties10.getBoolean("/", true);
        java.util.ArrayList arrayList16 = extendedProperties10.keysAsListed;
        java.lang.Long long19 = extendedProperties10.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties10.basePath = "include";
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.fileSeparator = "";
        java.lang.String str26 = extendedProperties22.testBoolean("}");
        java.lang.String str28 = extendedProperties22.interpolate("}");
        extendedProperties22.basePath = "/";
        extendedProperties10.putAll((java.util.Map) extendedProperties22);
        int int34 = extendedProperties10.getInteger("", 32);
        java.lang.Boolean boolean37 = extendedProperties10.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String str38 = extendedProperties10.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties40.fileSeparator = "";
        boolean boolean45 = extendedProperties40.getBoolean("/", true);
        java.util.ArrayList arrayList46 = extendedProperties40.keysAsListed;
        java.util.Properties properties48 = null;
        java.util.Properties properties49 = extendedProperties40.getProperties("}", properties48);
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties49);
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties52.fileSeparator = "";
        boolean boolean57 = extendedProperties52.getBoolean("/", true);
        java.util.ArrayList arrayList58 = extendedProperties52.keysAsListed;
        java.lang.Long long61 = extendedProperties52.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties52.basePath = "include";
        org.apache.commons.collections.ExtendedProperties extendedProperties64 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties64.fileSeparator = "";
        java.lang.String str68 = extendedProperties64.testBoolean("}");
        java.lang.String str70 = extendedProperties64.interpolate("}");
        extendedProperties64.basePath = "/";
        extendedProperties52.putAll((java.util.Map) extendedProperties64);
        int int76 = extendedProperties52.getInteger("", 32);
        java.util.Properties properties78 = extendedProperties52.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties79 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties78);
        java.util.Properties properties80 = extendedProperties50.getProperties("", properties78);
        java.util.Properties properties81 = extendedProperties10.getProperties("${", properties80);
        java.util.Properties properties82 = extendedProperties0.getProperties("${", properties80);
        org.apache.commons.collections.ExtendedProperties extendedProperties83 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties80);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(arrayList16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "}" + "'", str28, "}");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky "10) test3035(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "/" + "'", str38, "/");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(arrayList46);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertNotNull(extendedProperties50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(arrayList58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "}" + "'", str70, "}");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 32 + "'", int76 == 32);
        org.junit.Assert.assertNotNull(properties78);
        org.junit.Assert.assertNotNull(extendedProperties79);
        org.junit.Assert.assertNotNull(properties80);
        org.junit.Assert.assertNotNull(properties81);
        org.junit.Assert.assertNotNull(properties82);
        org.junit.Assert.assertNotNull(extendedProperties83);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.ArrayList arrayList1 = null;
        extendedProperties0.keysAsListed = arrayList1;
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties4.fileSeparator = "";
        boolean boolean9 = extendedProperties4.getBoolean("/", true);
        java.util.ArrayList arrayList10 = extendedProperties4.keysAsListed;
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties4.getProperties("}", properties12);
        java.util.Properties properties14 = extendedProperties0.getProperties("include", properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(extendedProperties15);
        org.junit.Assert.assertNotNull(extendedProperties16);
        org.junit.Assert.assertNotNull(extendedProperties17);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        boolean boolean12 = extendedProperties0.isInitialized();
        java.lang.Integer int15 = extendedProperties0.getInteger(",", (java.lang.Integer) 0);
        java.lang.String[] strArray17 = extendedProperties0.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.fileSeparator = "";
        boolean boolean23 = extendedProperties18.getBoolean("/", true);
        java.util.ArrayList arrayList24 = extendedProperties18.keysAsListed;
        java.util.Properties properties26 = null;
        java.util.Properties properties27 = extendedProperties18.getProperties("}", properties26);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties27);
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.fileSeparator = "";
        boolean boolean37 = extendedProperties32.getBoolean("/", true);
        java.util.ArrayList arrayList38 = extendedProperties32.keysAsListed;
        java.util.List list39 = extendedProperties30.getList("/", (java.util.List) arrayList38);
        java.lang.String str40 = extendedProperties28.interpolateHelper("}", (java.util.List) arrayList38);
        extendedProperties0.keysAsListed = arrayList38;
        extendedProperties0.file = "/";
        float float46 = extendedProperties0.getFloat(",", 32.0f);
        java.io.InputStream inputStream47 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream47, "${");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(extendedProperties28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(arrayList38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "}" + "'", str40, "}");
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 32.0f + "'", float46 == 32.0f);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.ArrayList arrayList1 = null;
        extendedProperties0.keysAsListed = arrayList1;
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties4.fileSeparator = "";
        boolean boolean9 = extendedProperties4.getBoolean("/", true);
        java.util.ArrayList arrayList10 = extendedProperties4.keysAsListed;
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties4.getProperties("}", properties12);
        java.util.Properties properties14 = extendedProperties0.getProperties("include", properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        java.lang.Double double19 = extendedProperties16.getDouble("${", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = extendedProperties16.subset("include");
        boolean boolean24 = extendedProperties16.getBoolean("/", false);
        long long27 = extendedProperties16.getLong(",", 10L);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties29.fileSeparator = "";
        java.io.OutputStream outputStream32 = null;
        extendedProperties29.save(outputStream32, "include");
        int int37 = extendedProperties29.getInt("/", 100);
        java.io.Reader reader39 = java.io.Reader.nullReader();
        char[] charArray45 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int46 = reader39.read(charArray45);
        java.io.Reader reader47 = java.io.Reader.nullReader();
        char[] charArray53 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int54 = reader47.read(charArray53);
        int int55 = reader39.read(charArray53);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader56 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader39);
        propertiesReader56.mark((int) (byte) 1);
        int int59 = propertiesReader56.read();
        int int60 = propertiesReader56.getLineNumber();
        java.lang.String str61 = propertiesReader56.readLine();
        propertiesReader56.mark((int) (short) 100);
        boolean boolean64 = propertiesReader56.markSupported();
        extendedProperties29.addProperty("include", (java.lang.Object) propertiesReader56);
        extendedProperties16.addProperty("/", (java.lang.Object) propertiesReader56);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(extendedProperties15);
        org.junit.Assert.assertNotNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(extendedProperties21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(reader39);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(reader47);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.fileSeparator = "";
        java.lang.String str16 = extendedProperties12.testBoolean("}");
        java.lang.String str18 = extendedProperties12.interpolate("}");
        extendedProperties12.basePath = "/";
        extendedProperties0.putAll((java.util.Map) extendedProperties12);
        extendedProperties12.file = "include";
        long long26 = extendedProperties12.getLong("/", 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties27.fileSeparator = "";
        boolean boolean32 = extendedProperties27.getBoolean("/", true);
        java.util.ArrayList arrayList33 = extendedProperties27.keysAsListed;
        java.util.Properties properties35 = null;
        java.util.Properties properties36 = extendedProperties27.getProperties("}", properties35);
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties36);
        extendedProperties12.combine(extendedProperties37);
        short short41 = extendedProperties37.getShort("hi!", (short) (byte) -1);
        java.lang.String str42 = extendedProperties37.fileSeparator;
        java.util.ArrayList arrayList43 = extendedProperties37.keysAsListed;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "}" + "'", str18, "}");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(arrayList33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNotNull(extendedProperties37);
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) -1 + "'", short41 == (short) -1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "/" + "'", str42, "/");
        org.junit.Assert.assertNotNull(arrayList43);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("/");
        java.lang.Boolean boolean7 = extendedProperties0.getBoolean("}", (java.lang.Boolean) true);
        java.lang.String str8 = extendedProperties0.basePath;
        java.lang.String str10 = extendedProperties0.testBoolean("${");
        java.lang.String str12 = extendedProperties0.testBoolean("/");
        extendedProperties0.fileSeparator = "";
        java.io.OutputStream outputStream15 = null;
        extendedProperties0.save(outputStream15, "");
        java.lang.Double double20 = extendedProperties0.getDouble("/", (java.lang.Double) 0.0d);
        extendedProperties0.basePath = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties9);
        extendedProperties10.clearProperty("");
        extendedProperties10.clearProperty("hi!");
        java.lang.String str16 = extendedProperties10.testBoolean(",");
        double double19 = extendedProperties10.getDouble("/", (double) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str22 = extendedProperties21.fileSeparator;
        java.lang.String str24 = extendedProperties21.testBoolean("${");
        java.util.Iterator iterator25 = extendedProperties21.getKeys();
        java.util.ArrayList arrayList26 = extendedProperties21.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties28.fileSeparator = "";
        java.lang.String str32 = extendedProperties28.testBoolean("}");
        java.lang.String str34 = extendedProperties28.interpolate("/");
        java.util.Properties properties36 = extendedProperties28.getProperties("");
        java.util.Properties properties37 = extendedProperties21.getProperties("hi!", properties36);
        java.lang.String str38 = extendedProperties21.file;
        java.util.Properties properties40 = extendedProperties21.getProperties("include");
        extendedProperties10.addProperty("/", (java.lang.Object) "include");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/" + "'", str22, "/");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "/" + "'", str34, "/");
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        boolean boolean12 = extendedProperties0.isInitialized();
        java.lang.Integer int15 = extendedProperties0.getInteger(",", (java.lang.Integer) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.fileSeparator = "";
        boolean boolean21 = extendedProperties16.getBoolean("/", true);
        java.util.ArrayList arrayList22 = extendedProperties16.keysAsListed;
        java.util.Properties properties24 = null;
        java.util.Properties properties25 = extendedProperties16.getProperties("}", properties24);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties25);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties30.fileSeparator = "";
        boolean boolean35 = extendedProperties30.getBoolean("/", true);
        java.util.ArrayList arrayList36 = extendedProperties30.keysAsListed;
        java.util.List list37 = extendedProperties28.getList("/", (java.util.List) arrayList36);
        java.lang.String str38 = extendedProperties26.interpolateHelper("}", (java.util.List) arrayList36);
        java.util.List list40 = extendedProperties26.getList(",");
        java.lang.Double double43 = extendedProperties26.getDouble("hi!", (java.lang.Double) 100.0d);
        extendedProperties0.putAll((java.util.Map) extendedProperties26);
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties45.fileSeparator = "";
        boolean boolean50 = extendedProperties45.getBoolean("/", true);
        java.util.ArrayList arrayList51 = extendedProperties45.keysAsListed;
        java.lang.Long long54 = extendedProperties45.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties45.basePath = "include";
        boolean boolean57 = extendedProperties45.isInitialized();
        java.lang.Integer int60 = extendedProperties45.getInteger(",", (java.lang.Integer) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties61 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties61.fileSeparator = "";
        java.lang.String str65 = extendedProperties61.testBoolean("}");
        extendedProperties45.putAll((java.util.Map) extendedProperties61);
        java.lang.Integer int69 = extendedProperties61.getInteger("/", (java.lang.Integer) 0);
        short short72 = extendedProperties61.getShort("include", (short) -1);
        extendedProperties0.putAll((java.util.Map) extendedProperties61);
        org.apache.commons.collections.ExtendedProperties extendedProperties74 = new org.apache.commons.collections.ExtendedProperties();
        java.util.ArrayList arrayList75 = null;
        extendedProperties74.keysAsListed = arrayList75;
        org.apache.commons.collections.ExtendedProperties extendedProperties78 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties78.fileSeparator = "";
        boolean boolean83 = extendedProperties78.getBoolean("/", true);
        java.util.ArrayList arrayList84 = extendedProperties78.keysAsListed;
        java.util.Properties properties86 = null;
        java.util.Properties properties87 = extendedProperties78.getProperties("}", properties86);
        java.util.Properties properties88 = extendedProperties74.getProperties("include", properties87);
        org.apache.commons.collections.ExtendedProperties extendedProperties89 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties87);
        org.apache.commons.collections.ExtendedProperties extendedProperties90 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties87);
        extendedProperties90.isInitialized = true;
        boolean boolean95 = extendedProperties90.getBoolean("", false);
        extendedProperties61.combine(extendedProperties90);
        java.lang.String str99 = extendedProperties61.getString("", "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(arrayList22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(extendedProperties26);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(arrayList36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "}" + "'", str38, "}");
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(arrayList51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) -1 + "'", short72 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(arrayList84);
        org.junit.Assert.assertNotNull(properties87);
        org.junit.Assert.assertNotNull(properties88);
        org.junit.Assert.assertNotNull(extendedProperties89);
        org.junit.Assert.assertNotNull(extendedProperties90);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        float float8 = extendedProperties0.getFloat("/", (float) '4');
        java.util.Properties properties10 = extendedProperties0.getProperties("}");
        byte byte13 = extendedProperties0.getByte("/", (byte) 1);
        java.lang.Byte byte16 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        java.lang.String str17 = extendedProperties0.getInclude();
        extendedProperties0.setInclude("}");
        java.io.Reader reader21 = java.io.Reader.nullReader();
        char[] charArray27 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int28 = reader21.read(charArray27);
        java.io.Reader reader29 = java.io.Reader.nullReader();
        char[] charArray35 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int36 = reader29.read(charArray35);
        int int37 = reader21.read(charArray35);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader38 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader21);
        java.io.Reader reader39 = java.io.Reader.nullReader();
        char[] charArray45 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int46 = reader39.read(charArray45);
        java.io.Reader reader47 = java.io.Reader.nullReader();
        char[] charArray53 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int54 = reader47.read(charArray53);
        int int55 = reader39.read(charArray53);
        int int58 = propertiesReader38.read(charArray53, (int) (byte) 1, (int) (short) 0);
        boolean boolean59 = propertiesReader38.markSupported();
        long long61 = propertiesReader38.skip(0L);
        boolean boolean62 = propertiesReader38.markSupported();
        java.io.Reader reader63 = java.io.Reader.nullReader();
        char[] charArray69 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int70 = reader63.read(charArray69);
        java.io.Reader reader71 = java.io.Reader.nullReader();
        char[] charArray77 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int78 = reader71.read(charArray77);
        int int79 = reader63.read(charArray77);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader80 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader63);
        propertiesReader80.setLineNumber((int) (byte) 100);
        int int83 = propertiesReader80.read();
        char[] charArray90 = new char[] { '4', '#', 'a', 'a', 'a', ' ' };
        int int91 = propertiesReader80.read(charArray90);
        int int92 = propertiesReader38.read(charArray90);
        extendedProperties0.addProperty("/", (java.lang.Object) charArray90);
        java.lang.Boolean boolean96 = extendedProperties0.getBoolean("hi!", (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 52.0f + "'", float8 == 52.0f);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
// flaky "11) test3043(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/" + "'", str17, "/");
        org.junit.Assert.assertNotNull(reader21);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(reader29);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(reader39);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(reader47);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(reader63);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(reader71);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertArrayEquals(charArray77, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertArrayEquals(charArray90, new char[] { '4', '#', 'a', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("/");
        java.lang.Boolean boolean7 = extendedProperties0.getBoolean("}", (java.lang.Boolean) true);
        java.lang.Integer int10 = extendedProperties0.getInteger("/", (java.lang.Integer) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = extendedProperties0.subset("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties13.fileSeparator = "";
        boolean boolean18 = extendedProperties13.getBoolean("/", true);
        float float21 = extendedProperties13.getFloat("/", (float) '4');
        java.lang.Double double24 = extendedProperties13.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties26.fileSeparator = "";
        boolean boolean31 = extendedProperties26.getBoolean("/", true);
        java.util.ArrayList arrayList32 = extendedProperties26.keysAsListed;
        java.util.Properties properties34 = null;
        java.util.Properties properties35 = extendedProperties26.getProperties("}", properties34);
        java.util.Properties properties36 = extendedProperties13.getProperties(",", properties35);
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties36);
        extendedProperties37.basePath = "include";
        boolean boolean42 = extendedProperties37.getBoolean("include", true);
        boolean boolean43 = extendedProperties37.isInitialized();
        java.lang.Boolean boolean46 = extendedProperties37.getBoolean("}", (java.lang.Boolean) false);
        double double49 = extendedProperties37.getDouble("include", (double) (-1L));
        extendedProperties0.combine(extendedProperties37);
        java.lang.Object obj52 = extendedProperties0.getProperty("${");
        java.lang.Float float55 = extendedProperties0.getFloat("}", (java.lang.Float) 97.0f);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(extendedProperties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 52.0f + "'", float21 == 52.0f);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(arrayList32);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNotNull(extendedProperties37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 97.0f + "'", float55 == 97.0f);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader17.setLineNumber((int) (byte) 100);
        int int20 = propertiesReader17.read();
        propertiesReader17.mark((int) (short) 10);
        long long24 = propertiesReader17.skip((long) 'a');
        java.io.Reader reader25 = java.io.Reader.nullReader();
        char[] charArray31 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int32 = reader25.read(charArray31);
        java.io.Reader reader33 = java.io.Reader.nullReader();
        char[] charArray39 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int40 = reader33.read(charArray39);
        int int41 = reader25.read(charArray39);
        int int42 = propertiesReader17.read(charArray39);
        java.lang.String str43 = propertiesReader17.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader44 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        int int45 = propertiesReader17.getLineNumber();
        int int46 = propertiesReader17.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(reader33);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader18 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int25 = reader18.read(charArray24);
        java.io.Reader reader26 = java.io.Reader.nullReader();
        char[] charArray32 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int33 = reader26.read(charArray32);
        int int34 = reader18.read(charArray32);
        int int37 = propertiesReader17.read(charArray32, (int) (byte) 1, (int) (short) 0);
        boolean boolean38 = propertiesReader17.markSupported();
        int int39 = propertiesReader17.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader40 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader41 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        java.io.Reader reader42 = java.io.Reader.nullReader();
        char[] charArray48 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int49 = reader42.read(charArray48);
        java.io.Reader reader50 = java.io.Reader.nullReader();
        char[] charArray56 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int57 = reader50.read(charArray56);
        int int58 = reader42.read(charArray56);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader59 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader42);
        propertiesReader59.setLineNumber((int) (byte) 100);
        int int62 = propertiesReader59.read();
        char[] charArray65 = new char[] { 'a', '#' };
        int int66 = propertiesReader59.read(charArray65);
        int int67 = propertiesReader17.read(charArray65);
        int int68 = propertiesReader17.read();
        boolean boolean69 = propertiesReader17.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(reader26);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(reader42);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(reader50);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { 'a', '#' });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("}");
        java.lang.String str5 = extendedProperties0.basePath;
        byte byte8 = extendedProperties0.getByte("", (byte) -1);
        extendedProperties0.clearProperty("include");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.fileSeparator = "";
        java.lang.String str16 = extendedProperties12.testBoolean("/");
        java.lang.Float float19 = extendedProperties12.getFloat("}", (java.lang.Float) (-1.0f));
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str22 = extendedProperties21.fileSeparator;
        java.lang.String str24 = extendedProperties21.testBoolean("${");
        java.util.Iterator iterator25 = extendedProperties21.getKeys();
        java.util.ArrayList arrayList26 = extendedProperties21.keysAsListed;
        java.util.List list27 = extendedProperties12.getList(",", (java.util.List) arrayList26);
        java.lang.String str28 = extendedProperties0.interpolateHelper("${", list27);
        boolean boolean31 = extendedProperties0.getBoolean("", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.fileSeparator = "";
        boolean boolean37 = extendedProperties32.getBoolean("/", true);
        java.util.ArrayList arrayList38 = extendedProperties32.keysAsListed;
        java.lang.Long long41 = extendedProperties32.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties32.basePath = "include";
        boolean boolean44 = extendedProperties32.isInitialized();
        java.lang.Integer int47 = extendedProperties32.getInteger(",", (java.lang.Integer) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties48.fileSeparator = "";
        java.lang.String str52 = extendedProperties48.testBoolean("}");
        extendedProperties32.putAll((java.util.Map) extendedProperties48);
        java.lang.Integer int56 = extendedProperties48.getInteger("/", (java.lang.Integer) 0);
        float float59 = extendedProperties48.getFloat("/", (float) 100L);
        java.lang.Short short62 = extendedProperties48.getShort("hi!", (java.lang.Short) (short) 10);
        java.util.List list64 = extendedProperties48.getList("/");
        extendedProperties0.putAll((java.util.Map) extendedProperties48);
        java.lang.Float float68 = extendedProperties48.getFloat("hi!", (java.lang.Float) 100.0f);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/" + "'", str22, "/");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "${" + "'", str28, "${");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(arrayList38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 100.0f + "'", float59 == 100.0f);
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) 10 + "'", short62 == (short) 10);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 100.0f + "'", float68 == 100.0f);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader17.setLineNumber((int) (byte) 100);
        int int20 = propertiesReader17.read();
        boolean boolean21 = propertiesReader17.markSupported();
        java.lang.String str22 = propertiesReader17.readProperty();
        java.io.Reader reader23 = java.io.Reader.nullReader();
        char[] charArray29 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int30 = reader23.read(charArray29);
        java.io.Reader reader31 = java.io.Reader.nullReader();
        char[] charArray37 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int38 = reader31.read(charArray37);
        int int39 = reader23.read(charArray37);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader40 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader23);
        propertiesReader40.setLineNumber((int) (byte) 100);
        int int43 = propertiesReader40.read();
        char[] charArray50 = new char[] { '4', '#', 'a', 'a', 'a', ' ' };
        int int51 = propertiesReader40.read(charArray50);
        int int52 = propertiesReader17.read(charArray50);
        java.util.stream.Stream<java.lang.String> strStream53 = propertiesReader17.lines();
        java.lang.String str54 = propertiesReader17.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(reader23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(reader31);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { '4', '#', 'a', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strStream53);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.String str3 = extendedProperties0.testBoolean("${");
        java.lang.String str4 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.fileSeparator = "";
        boolean boolean10 = extendedProperties5.getBoolean("/", true);
        float float13 = extendedProperties5.getFloat("/", (float) '4');
        java.lang.Double double16 = extendedProperties5.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.fileSeparator = "";
        boolean boolean22 = extendedProperties17.getBoolean("/", true);
        java.util.ArrayList arrayList23 = extendedProperties17.keysAsListed;
        java.util.Properties properties25 = null;
        java.util.Properties properties26 = extendedProperties17.getProperties("}", properties25);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties26);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.fileSeparator = "";
        boolean boolean36 = extendedProperties31.getBoolean("/", true);
        java.util.ArrayList arrayList37 = extendedProperties31.keysAsListed;
        java.util.List list38 = extendedProperties29.getList("/", (java.util.List) arrayList37);
        java.lang.String str39 = extendedProperties27.interpolateHelper("}", (java.util.List) arrayList37);
        extendedProperties5.keysAsListed = arrayList37;
        java.lang.String str43 = extendedProperties5.getString("/", "include");
        extendedProperties0.combine(extendedProperties5);
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties45.fileSeparator = "";
        boolean boolean50 = extendedProperties45.getBoolean("/", true);
        java.util.ArrayList arrayList51 = extendedProperties45.keysAsListed;
        extendedProperties5.combine(extendedProperties45);
        extendedProperties45.setInclude("/");
        java.lang.Object obj56 = extendedProperties45.getProperty("/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str3);
// flaky "12) test3049(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 52.0f + "'", float13 == 52.0f);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(extendedProperties27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "}" + "'", str39, "}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "include" + "'", str43, "include");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(arrayList51);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties2.fileSeparator = "";
        boolean boolean7 = extendedProperties2.getBoolean("/", true);
        java.util.ArrayList arrayList8 = extendedProperties2.keysAsListed;
        java.util.List list9 = extendedProperties0.getList("/", (java.util.List) arrayList8);
        boolean boolean10 = extendedProperties0.isInitialized();
        java.lang.String str11 = extendedProperties0.basePath;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        float float8 = extendedProperties0.getFloat("/", (float) '4');
        java.util.Properties properties10 = extendedProperties0.getProperties("}");
        byte byte13 = extendedProperties0.getByte("/", (byte) 1);
        java.lang.Byte byte16 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        java.lang.Double double19 = extendedProperties0.getDouble("}", (java.lang.Double) 0.0d);
        java.lang.String[] strArray21 = extendedProperties0.getStringArray(",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 52.0f + "'", float8 == 52.0f);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str11 = extendedProperties10.fileSeparator;
        java.lang.String str13 = extendedProperties10.testBoolean("${");
        extendedProperties0.combine(extendedProperties10);
        java.lang.String str17 = extendedProperties0.getString("}", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.fileSeparator = "";
        boolean boolean23 = extendedProperties18.getBoolean("/", true);
        java.util.ArrayList arrayList24 = extendedProperties18.keysAsListed;
        java.util.Properties properties26 = null;
        java.util.Properties properties27 = extendedProperties18.getProperties("}", properties26);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties27);
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.fileSeparator = "";
        boolean boolean37 = extendedProperties32.getBoolean("/", true);
        java.util.ArrayList arrayList38 = extendedProperties32.keysAsListed;
        java.util.List list39 = extendedProperties30.getList("/", (java.util.List) arrayList38);
        java.lang.String str40 = extendedProperties28.interpolateHelper("}", (java.util.List) arrayList38);
        java.util.Vector vector42 = null;
        java.util.Vector vector43 = extendedProperties28.getVector("hi!", vector42);
        java.lang.Short short46 = extendedProperties28.getShort("", (java.lang.Short) (short) 1);
        extendedProperties0.putAll((java.util.Map) extendedProperties28);
        java.lang.Integer int50 = extendedProperties0.getInteger("/", (java.lang.Integer) 97);
        // The following exception was thrown during execution in test generation
        try {
            byte byte52 = extendedProperties0.getByte("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '} doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "," + "'", str17, ",");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(extendedProperties28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(arrayList38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "}" + "'", str40, "}");
        org.junit.Assert.assertNotNull(vector43);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 1 + "'", short46 == (short) 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties9);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.fileSeparator = "";
        boolean boolean19 = extendedProperties14.getBoolean("/", true);
        java.util.ArrayList arrayList20 = extendedProperties14.keysAsListed;
        java.util.List list21 = extendedProperties12.getList("/", (java.util.List) arrayList20);
        java.lang.String str22 = extendedProperties10.interpolateHelper("}", (java.util.List) arrayList20);
        java.util.Vector vector24 = null;
        java.util.Vector vector25 = extendedProperties10.getVector("hi!", vector24);
        java.lang.Short short28 = extendedProperties10.getShort("", (java.lang.Short) (short) 1);
        java.lang.String str30 = extendedProperties10.testBoolean("include");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.fileSeparator = "";
        boolean boolean36 = extendedProperties31.getBoolean("/", true);
        float float39 = extendedProperties31.getFloat("/", (float) '4');
        java.lang.Double double42 = extendedProperties31.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties44.fileSeparator = "";
        boolean boolean49 = extendedProperties44.getBoolean("/", true);
        java.util.ArrayList arrayList50 = extendedProperties44.keysAsListed;
        java.util.Properties properties52 = null;
        java.util.Properties properties53 = extendedProperties44.getProperties("}", properties52);
        java.util.Properties properties54 = extendedProperties31.getProperties(",", properties53);
        org.apache.commons.collections.ExtendedProperties extendedProperties55 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties54);
        extendedProperties10.putAll((java.util.Map) extendedProperties55);
        int int59 = extendedProperties55.getInt("/", 100);
        java.lang.String str60 = extendedProperties55.getInclude();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(arrayList20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
        org.junit.Assert.assertNotNull(vector25);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 1 + "'", short28 == (short) 1);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 52.0f + "'", float39 == 52.0f);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(arrayList50);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNotNull(extendedProperties55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
// flaky "13) test3053(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "/" + "'", str60, "/");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader18 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int25 = reader18.read(charArray24);
        java.io.Reader reader26 = java.io.Reader.nullReader();
        char[] charArray32 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int33 = reader26.read(charArray32);
        int int34 = reader18.read(charArray32);
        int int37 = propertiesReader17.read(charArray32, (int) (byte) 1, (int) (short) 0);
        boolean boolean38 = propertiesReader17.markSupported();
        java.util.stream.Stream<java.lang.String> strStream39 = propertiesReader17.lines();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader40 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        java.io.Reader reader41 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader42 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader41);
        propertiesReader42.mark((int) (short) 0);
        java.io.Reader reader45 = java.io.Reader.nullReader();
        char[] charArray51 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int52 = reader45.read(charArray51);
        java.io.Reader reader53 = java.io.Reader.nullReader();
        char[] charArray59 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int60 = reader53.read(charArray59);
        int int61 = reader45.read(charArray59);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader62 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader45);
        propertiesReader62.setLineNumber((int) (byte) 100);
        long long66 = propertiesReader62.skip(0L);
        java.lang.String str67 = propertiesReader62.readLine();
        java.io.Reader reader68 = java.io.Reader.nullReader();
        char[] charArray74 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int75 = reader68.read(charArray74);
        java.io.Reader reader76 = java.io.Reader.nullReader();
        char[] charArray82 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int83 = reader76.read(charArray82);
        int int84 = reader68.read(charArray82);
        int int85 = propertiesReader62.read(charArray82);
        int int86 = propertiesReader42.read(charArray82);
        int int87 = propertiesReader17.read(charArray82);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(reader26);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strStream39);
        org.junit.Assert.assertNotNull(reader41);
        org.junit.Assert.assertNotNull(reader45);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(reader53);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(reader68);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(reader76);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertArrayEquals(charArray82, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        float float8 = extendedProperties0.getFloat("/", (float) '4');
        boolean boolean11 = extendedProperties0.getBoolean("include", false);
        java.lang.String str12 = extendedProperties0.getInclude();
        java.io.OutputStream outputStream13 = null;
        extendedProperties0.save(outputStream13, "include");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.fileSeparator = "";
        boolean boolean22 = extendedProperties17.getBoolean("/", true);
        java.util.ArrayList arrayList23 = extendedProperties17.keysAsListed;
        java.lang.Long long26 = extendedProperties17.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties17.basePath = "include";
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties29.fileSeparator = "";
        java.lang.String str33 = extendedProperties29.testBoolean("}");
        java.lang.String str35 = extendedProperties29.interpolate("}");
        extendedProperties29.basePath = "/";
        extendedProperties17.putAll((java.util.Map) extendedProperties29);
        int int41 = extendedProperties17.getInteger("", 32);
        java.util.Properties properties43 = extendedProperties17.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str46 = extendedProperties45.fileSeparator;
        java.lang.String str48 = extendedProperties45.testBoolean("${");
        java.util.Vector vector50 = extendedProperties45.getVector("hi!");
        java.util.Vector vector51 = extendedProperties17.getVector("", vector50);
        extendedProperties0.setProperty("", (java.lang.Object) "");
        java.lang.Integer int55 = extendedProperties0.getInteger(",", (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 52.0f + "'", float8 == 52.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "14) test3055(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "}" + "'", str35, "}");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "/" + "'", str46, "/");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(vector50);
        org.junit.Assert.assertNotNull(vector51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        boolean boolean12 = extendedProperties0.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str14 = extendedProperties13.fileSeparator;
        java.lang.String str16 = extendedProperties13.testBoolean("${");
        java.lang.String str17 = extendedProperties13.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.fileSeparator = "";
        boolean boolean23 = extendedProperties18.getBoolean("/", true);
        float float26 = extendedProperties18.getFloat("/", (float) '4');
        java.lang.Double double29 = extendedProperties18.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties30.fileSeparator = "";
        boolean boolean35 = extendedProperties30.getBoolean("/", true);
        java.util.ArrayList arrayList36 = extendedProperties30.keysAsListed;
        java.util.Properties properties38 = null;
        java.util.Properties properties39 = extendedProperties30.getProperties("}", properties38);
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties39);
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties44.fileSeparator = "";
        boolean boolean49 = extendedProperties44.getBoolean("/", true);
        java.util.ArrayList arrayList50 = extendedProperties44.keysAsListed;
        java.util.List list51 = extendedProperties42.getList("/", (java.util.List) arrayList50);
        java.lang.String str52 = extendedProperties40.interpolateHelper("}", (java.util.List) arrayList50);
        extendedProperties18.keysAsListed = arrayList50;
        java.lang.String str56 = extendedProperties18.getString("/", "include");
        extendedProperties13.combine(extendedProperties18);
        extendedProperties0.putAll((java.util.Map) extendedProperties18);
        java.util.Iterator iterator60 = extendedProperties18.getKeys(",");
        java.util.Properties properties62 = extendedProperties18.getProperties("");
        java.lang.String str63 = extendedProperties18.file;
        java.lang.String[] strArray65 = extendedProperties18.getStringArray("}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertNull(str16);
// flaky "15) test3056(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/" + "'", str17, "/");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 52.0f + "'", float26 == 52.0f);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(arrayList36);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(extendedProperties40);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(arrayList50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "}" + "'", str52, "}");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "include" + "'", str56, "include");
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(properties62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] {});
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.fileSeparator = "";
        boolean boolean11 = extendedProperties6.getBoolean("/", true);
        java.util.ArrayList arrayList12 = extendedProperties6.keysAsListed;
        java.util.Properties properties14 = null;
        java.util.Properties properties15 = extendedProperties6.getProperties("}", properties14);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties15);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.fileSeparator = "";
        boolean boolean25 = extendedProperties20.getBoolean("/", true);
        java.util.ArrayList arrayList26 = extendedProperties20.keysAsListed;
        java.util.List list27 = extendedProperties18.getList("/", (java.util.List) arrayList26);
        java.lang.String str28 = extendedProperties16.interpolateHelper("}", (java.util.List) arrayList26);
        java.util.Vector vector30 = null;
        java.util.Vector vector31 = extendedProperties16.getVector("hi!", vector30);
        java.util.Vector vector32 = extendedProperties0.getVector("/", vector30);
        java.lang.Double double35 = extendedProperties0.getDouble(",", (java.lang.Double) 1.0d);
        extendedProperties0.file = "/";
        byte byte40 = extendedProperties0.getByte("hi!", (byte) 0);
        boolean boolean41 = extendedProperties0.isInitialized;
        extendedProperties0.display();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "}" + "'", str28, "}");
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 0 + "'", byte40 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        boolean boolean12 = extendedProperties0.isInitialized();
        java.lang.Integer int15 = extendedProperties0.getInteger(",", (java.lang.Integer) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.fileSeparator = "";
        boolean boolean21 = extendedProperties16.getBoolean("/", true);
        java.util.ArrayList arrayList22 = extendedProperties16.keysAsListed;
        java.util.Properties properties24 = null;
        java.util.Properties properties25 = extendedProperties16.getProperties("}", properties24);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties25);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties30.fileSeparator = "";
        boolean boolean35 = extendedProperties30.getBoolean("/", true);
        java.util.ArrayList arrayList36 = extendedProperties30.keysAsListed;
        java.util.List list37 = extendedProperties28.getList("/", (java.util.List) arrayList36);
        java.lang.String str38 = extendedProperties26.interpolateHelper("}", (java.util.List) arrayList36);
        java.util.List list40 = extendedProperties26.getList(",");
        java.lang.Double double43 = extendedProperties26.getDouble("hi!", (java.lang.Double) 100.0d);
        extendedProperties0.putAll((java.util.Map) extendedProperties26);
        java.lang.String[] strArray46 = extendedProperties26.getStringArray("/");
        java.lang.String str47 = extendedProperties26.basePath;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(arrayList22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(extendedProperties26);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(arrayList36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "}" + "'", str38, "}");
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] {});
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("}");
        java.lang.String str6 = extendedProperties0.interpolate("}");
        extendedProperties0.basePath = "/";
        java.lang.String str10 = extendedProperties0.testBoolean(",");
        java.util.Iterator iterator12 = extendedProperties0.getKeys("");
        boolean boolean13 = extendedProperties0.isInitialized;
        java.lang.String[] strArray15 = extendedProperties0.getStringArray("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.fileSeparator = "";
        boolean boolean22 = extendedProperties17.getBoolean("/", true);
        float float25 = extendedProperties17.getFloat("/", (float) '4');
        boolean boolean28 = extendedProperties17.getBoolean("include", false);
        java.lang.Long long31 = extendedProperties17.getLong("include", (java.lang.Long) 0L);
        extendedProperties0.addProperty("}", (java.lang.Object) "include");
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties34.fileSeparator = "";
        boolean boolean39 = extendedProperties34.getBoolean("/", true);
        java.util.ArrayList arrayList40 = extendedProperties34.keysAsListed;
        java.lang.Long long43 = extendedProperties34.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties34.basePath = "include";
        boolean boolean46 = extendedProperties34.isInitialized();
        java.lang.Integer int49 = extendedProperties34.getInteger(",", (java.lang.Integer) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties50.fileSeparator = "";
        java.lang.String str54 = extendedProperties50.testBoolean("}");
        extendedProperties34.putAll((java.util.Map) extendedProperties50);
        java.lang.Integer int58 = extendedProperties50.getInteger("/", (java.lang.Integer) 0);
        java.util.Properties properties60 = extendedProperties50.getProperties(",");
        byte byte63 = extendedProperties50.getByte("", (byte) -1);
        extendedProperties50.file = "include";
        extendedProperties0.setProperty("/", (java.lang.Object) "include");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 52.0f + "'", float25 == 52.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(arrayList40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) -1 + "'", byte63 == (byte) -1);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader17.setLineNumber((int) (byte) 100);
        int int20 = propertiesReader17.read();
        char[] charArray27 = new char[] { '4', '#', 'a', 'a', 'a', ' ' };
        int int28 = propertiesReader17.read(charArray27);
        boolean boolean29 = propertiesReader17.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader30 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        java.lang.String str31 = propertiesReader17.readProperty();
        java.io.Reader reader32 = java.io.Reader.nullReader();
        char[] charArray38 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int39 = reader32.read(charArray38);
        java.io.Reader reader40 = java.io.Reader.nullReader();
        char[] charArray46 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int47 = reader40.read(charArray46);
        int int48 = reader32.read(charArray46);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader49 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader32);
        propertiesReader49.setLineNumber((int) (byte) 100);
        int int52 = propertiesReader49.read();
        char[] charArray59 = new char[] { '4', '#', 'a', 'a', 'a', ' ' };
        int int60 = propertiesReader49.read(charArray59);
        java.lang.String str61 = propertiesReader49.readLine();
        java.io.Reader reader62 = java.io.Reader.nullReader();
        char[] charArray68 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int69 = reader62.read(charArray68);
        java.io.Reader reader70 = java.io.Reader.nullReader();
        char[] charArray76 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int77 = reader70.read(charArray76);
        int int78 = reader62.read(charArray76);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader79 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader62);
        propertiesReader79.setLineNumber((int) (byte) 100);
        int int82 = propertiesReader79.read();
        char[] charArray85 = new char[] { 'a', '#' };
        int int86 = propertiesReader79.read(charArray85);
        int int87 = propertiesReader49.read(charArray85);
        // The following exception was thrown during execution in test generation
        try {
            int int90 = propertiesReader17.read(charArray85, (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', '#', 'a', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(reader32);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(reader40);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { '4', '#', 'a', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(reader62);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(reader70);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertArrayEquals(charArray85, new char[] { 'a', '#' });
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        float float8 = extendedProperties0.getFloat("/", (float) '4');
        java.lang.Double double11 = extendedProperties0.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.fileSeparator = "";
        boolean boolean17 = extendedProperties12.getBoolean("/", true);
        java.util.ArrayList arrayList18 = extendedProperties12.keysAsListed;
        java.util.Properties properties20 = null;
        java.util.Properties properties21 = extendedProperties12.getProperties("}", properties20);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties21);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties26.fileSeparator = "";
        boolean boolean31 = extendedProperties26.getBoolean("/", true);
        java.util.ArrayList arrayList32 = extendedProperties26.keysAsListed;
        java.util.List list33 = extendedProperties24.getList("/", (java.util.List) arrayList32);
        java.lang.String str34 = extendedProperties22.interpolateHelper("}", (java.util.List) arrayList32);
        extendedProperties0.keysAsListed = arrayList32;
        boolean boolean38 = extendedProperties0.getBoolean(",", false);
        java.lang.Long long41 = extendedProperties0.getLong(",", (java.lang.Long) 1L);
        java.io.Reader reader43 = java.io.Reader.nullReader();
        char[] charArray49 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int50 = reader43.read(charArray49);
        java.io.Reader reader51 = java.io.Reader.nullReader();
        char[] charArray57 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int58 = reader51.read(charArray57);
        int int59 = reader43.read(charArray57);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader60 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader43);
        propertiesReader60.setLineNumber((int) (byte) 100);
        int int63 = propertiesReader60.read();
        propertiesReader60.mark((int) (short) 10);
        long long67 = propertiesReader60.skip((long) 'a');
        java.io.Reader reader68 = java.io.Reader.nullReader();
        char[] charArray74 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int75 = reader68.read(charArray74);
        java.io.Reader reader76 = java.io.Reader.nullReader();
        char[] charArray82 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int83 = reader76.read(charArray82);
        int int84 = reader68.read(charArray82);
        int int85 = propertiesReader60.read(charArray82);
        java.lang.String str86 = propertiesReader60.readLine();
        extendedProperties0.addProperty("", (java.lang.Object) propertiesReader60);
        propertiesReader60.setLineNumber((int) '#');
        propertiesReader60.reset();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 52.0f + "'", float8 == 52.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(arrayList18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(extendedProperties22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(arrayList32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "}" + "'", str34, "}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(reader43);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(reader51);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(reader68);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(reader76);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertArrayEquals(charArray82, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int18 = propertiesReader17.getLineNumber();
        long long20 = propertiesReader17.skip((long) (byte) 1);
        int int21 = propertiesReader17.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.ArrayList arrayList7 = extendedProperties0.keysAsListed;
        java.lang.Double double10 = extendedProperties0.getDouble("}", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.fileSeparator = "";
        boolean boolean16 = extendedProperties11.getBoolean("/", true);
        java.util.ArrayList arrayList17 = extendedProperties11.keysAsListed;
        java.util.Properties properties19 = null;
        java.util.Properties properties20 = extendedProperties11.getProperties("}", properties19);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties20);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties25.fileSeparator = "";
        boolean boolean30 = extendedProperties25.getBoolean("/", true);
        java.util.ArrayList arrayList31 = extendedProperties25.keysAsListed;
        java.util.List list32 = extendedProperties23.getList("/", (java.util.List) arrayList31);
        java.lang.String str33 = extendedProperties21.interpolateHelper("}", (java.util.List) arrayList31);
        java.util.List list35 = extendedProperties21.getList(",");
        java.lang.String str36 = extendedProperties21.getInclude();
        java.lang.String str37 = extendedProperties21.fileSeparator;
        extendedProperties0.putAll((java.util.Map) extendedProperties21);
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties40.fileSeparator = "";
        boolean boolean45 = extendedProperties40.getBoolean("/", true);
        java.util.ArrayList arrayList46 = extendedProperties40.keysAsListed;
        java.lang.Long long49 = extendedProperties40.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties40.basePath = "include";
        boolean boolean52 = extendedProperties40.isInitialized();
        java.lang.Integer int55 = extendedProperties40.getInteger(",", (java.lang.Integer) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties56.fileSeparator = "";
        java.lang.String str60 = extendedProperties56.testBoolean("}");
        extendedProperties40.putAll((java.util.Map) extendedProperties56);
        extendedProperties56.display();
        java.lang.Integer int65 = extendedProperties56.getInteger("hi!", (java.lang.Integer) 52);
        extendedProperties0.combine(extendedProperties56);
        org.apache.commons.collections.ExtendedProperties extendedProperties68 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties68.fileSeparator = "";
        boolean boolean73 = extendedProperties68.getBoolean("/", true);
        float float76 = extendedProperties68.getFloat("/", (float) '4');
        java.lang.String str77 = extendedProperties68.getInclude();
        double double80 = extendedProperties68.getDouble("", (double) 10L);
        java.lang.String str81 = extendedProperties68.getInclude();
        java.util.Vector vector83 = extendedProperties68.getVector(",");
        java.lang.String str84 = extendedProperties56.interpolateHelper("${", (java.util.List) vector83);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(arrayList17);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(extendedProperties21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(arrayList31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "}" + "'", str33, "}");
        org.junit.Assert.assertNotNull(list35);
// flaky "16) test3063(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "/" + "'", str36, "/");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/" + "'", str37, "/");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(arrayList46);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 52 + "'", int65 == 52);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 52.0f + "'", float76 == 52.0f);
// flaky "2) test3063(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "/" + "'", str77, "/");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
// flaky "1) test3063(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "/" + "'", str81, "/");
        org.junit.Assert.assertNotNull(vector83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "${" + "'", str84, "${");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("}");
        java.lang.String str6 = extendedProperties0.interpolate("}");
        extendedProperties0.basePath = "/";
        java.util.Properties properties10 = extendedProperties0.getProperties("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties10);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties10);
        java.util.ArrayList arrayList13 = extendedProperties12.keysAsListed;
        java.lang.String str14 = extendedProperties12.fileSeparator;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(extendedProperties11);
        org.junit.Assert.assertNotNull(extendedProperties12);
        org.junit.Assert.assertNotNull(arrayList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader2 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader1);
        char[] charArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = propertiesReader1.read(charArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str2 = propertiesTokenizer1.nextToken();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str6 = propertiesTokenizer1.nextToken("}");
        java.lang.String str8 = propertiesTokenizer1.nextToken(",");
        boolean boolean9 = propertiesTokenizer1.hasMoreElements();
        boolean boolean10 = propertiesTokenizer1.hasMoreTokens();
        java.lang.Object obj11 = propertiesTokenizer1.nextElement();
        boolean boolean12 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.String str3 = extendedProperties0.testBoolean("${");
        java.lang.String str4 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.fileSeparator = "";
        boolean boolean10 = extendedProperties5.getBoolean("/", true);
        float float13 = extendedProperties5.getFloat("/", (float) '4');
        java.lang.Double double16 = extendedProperties5.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.fileSeparator = "";
        boolean boolean22 = extendedProperties17.getBoolean("/", true);
        java.util.ArrayList arrayList23 = extendedProperties17.keysAsListed;
        java.util.Properties properties25 = null;
        java.util.Properties properties26 = extendedProperties17.getProperties("}", properties25);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties26);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.fileSeparator = "";
        boolean boolean36 = extendedProperties31.getBoolean("/", true);
        java.util.ArrayList arrayList37 = extendedProperties31.keysAsListed;
        java.util.List list38 = extendedProperties29.getList("/", (java.util.List) arrayList37);
        java.lang.String str39 = extendedProperties27.interpolateHelper("}", (java.util.List) arrayList37);
        extendedProperties5.keysAsListed = arrayList37;
        java.lang.String str43 = extendedProperties5.getString("/", "include");
        extendedProperties0.combine(extendedProperties5);
        long long47 = extendedProperties5.getLong(",", (long) ' ');
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties48.fileSeparator = "";
        boolean boolean53 = extendedProperties48.getBoolean("/", true);
        java.util.ArrayList arrayList54 = extendedProperties48.keysAsListed;
        java.util.ArrayList arrayList55 = extendedProperties48.keysAsListed;
        java.lang.Double double58 = extendedProperties48.getDouble("}", (java.lang.Double) 0.0d);
        java.util.Properties properties60 = extendedProperties48.getProperties("}");
        extendedProperties5.combine(extendedProperties48);
        extendedProperties48.isInitialized = true;
        byte byte66 = extendedProperties48.getByte("${", (byte) 1);
        boolean boolean67 = extendedProperties48.isInitialized();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str3);
// flaky "17) test3067(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 52.0f + "'", float13 == 52.0f);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(extendedProperties27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "}" + "'", str39, "}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "include" + "'", str43, "include");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 32L + "'", long47 == 32L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(arrayList54);
        org.junit.Assert.assertNotNull(arrayList55);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 1 + "'", byte66 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader17.setLineNumber((int) (byte) 100);
        int int20 = propertiesReader17.read();
        boolean boolean21 = propertiesReader17.markSupported();
        java.lang.String str22 = propertiesReader17.readProperty();
        java.lang.String str23 = propertiesReader17.readProperty();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        java.util.Iterator<java.lang.Object> objItor2 = propertiesTokenizer1.asIterator();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        java.lang.Object obj5 = propertiesTokenizer1.nextElement();
        boolean boolean6 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties9);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.fileSeparator = "";
        boolean boolean19 = extendedProperties14.getBoolean("/", true);
        java.util.ArrayList arrayList20 = extendedProperties14.keysAsListed;
        java.util.List list21 = extendedProperties12.getList("/", (java.util.List) arrayList20);
        java.lang.String str22 = extendedProperties10.interpolateHelper("}", (java.util.List) arrayList20);
        java.io.OutputStream outputStream23 = null;
        extendedProperties10.save(outputStream23, "");
        java.lang.Byte byte28 = extendedProperties10.getByte("${", (java.lang.Byte) (byte) 10);
        extendedProperties10.setInclude(",");
        java.lang.Byte byte33 = extendedProperties10.getByte("", (java.lang.Byte) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(arrayList20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 10 + "'", byte28 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 0 + "'", byte33 == (byte) 0);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties9);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.fileSeparator = "";
        boolean boolean19 = extendedProperties14.getBoolean("/", true);
        java.util.ArrayList arrayList20 = extendedProperties14.keysAsListed;
        java.util.List list21 = extendedProperties12.getList("/", (java.util.List) arrayList20);
        java.lang.String str22 = extendedProperties10.interpolateHelper("}", (java.util.List) arrayList20);
        java.util.List list24 = extendedProperties10.getList(",");
        java.lang.String str25 = extendedProperties10.getInclude();
        java.lang.Long long28 = extendedProperties10.getLong("hi!", (java.lang.Long) 0L);
        java.lang.Boolean boolean31 = extendedProperties10.getBoolean("${", (java.lang.Boolean) false);
        extendedProperties10.fileSeparator = "${";
        extendedProperties10.file = ",";
        extendedProperties10.isInitialized = true;
        extendedProperties10.isInitialized = false;
        int int42 = extendedProperties10.getInteger(",", 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(arrayList20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
        org.junit.Assert.assertNotNull(list24);
// flaky "18) test3071(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "/" + "'", str25, "/");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.String str3 = extendedProperties0.testBoolean("${");
        java.lang.String str4 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.fileSeparator = "";
        boolean boolean10 = extendedProperties5.getBoolean("/", true);
        float float13 = extendedProperties5.getFloat("/", (float) '4');
        java.lang.Double double16 = extendedProperties5.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.fileSeparator = "";
        boolean boolean22 = extendedProperties17.getBoolean("/", true);
        java.util.ArrayList arrayList23 = extendedProperties17.keysAsListed;
        java.util.Properties properties25 = null;
        java.util.Properties properties26 = extendedProperties17.getProperties("}", properties25);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties26);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.fileSeparator = "";
        boolean boolean36 = extendedProperties31.getBoolean("/", true);
        java.util.ArrayList arrayList37 = extendedProperties31.keysAsListed;
        java.util.List list38 = extendedProperties29.getList("/", (java.util.List) arrayList37);
        java.lang.String str39 = extendedProperties27.interpolateHelper("}", (java.util.List) arrayList37);
        extendedProperties5.keysAsListed = arrayList37;
        java.lang.String str43 = extendedProperties5.getString("/", "include");
        extendedProperties0.combine(extendedProperties5);
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties45.fileSeparator = "";
        boolean boolean50 = extendedProperties45.getBoolean("/", true);
        java.util.ArrayList arrayList51 = extendedProperties45.keysAsListed;
        extendedProperties5.combine(extendedProperties45);
        java.lang.Long long55 = extendedProperties45.getLong(",", (java.lang.Long) 100L);
        java.lang.Long long58 = extendedProperties45.getLong("include", (java.lang.Long) 1L);
        java.io.OutputStream outputStream59 = null;
        extendedProperties45.save(outputStream59, "include");
        java.lang.String str62 = extendedProperties45.getInclude();
        java.util.Vector vector64 = extendedProperties45.getVector("hi!");
        java.lang.String str65 = extendedProperties45.fileSeparator;
        java.lang.String str66 = extendedProperties45.basePath;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str3);
// flaky "19) test3072(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 52.0f + "'", float13 == 52.0f);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(extendedProperties27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "}" + "'", str39, "}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "include" + "'", str43, "include");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(arrayList51);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 100L + "'", long55 == 100L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
// flaky "3) test3072(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "/" + "'", str62, "/");
        org.junit.Assert.assertNotNull(vector64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("/");
        java.lang.Float float7 = extendedProperties0.getFloat("}", (java.lang.Float) (-1.0f));
        java.lang.Object obj9 = extendedProperties0.getProperty("hi!");
        java.lang.String str11 = extendedProperties0.interpolate("hi!");
        java.util.Properties properties13 = extendedProperties0.getProperties(",");
        extendedProperties0.isInitialized = true;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        extendedProperties0.setInclude("${");
        java.lang.String[] strArray15 = extendedProperties0.getStringArray("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.fileSeparator = "";
        boolean boolean21 = extendedProperties16.getBoolean("/", true);
        java.util.ArrayList arrayList22 = extendedProperties16.keysAsListed;
        java.lang.Long long25 = extendedProperties16.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties16.basePath = "include";
        boolean boolean28 = extendedProperties16.isInitialized();
        extendedProperties0.putAll((java.util.Map) extendedProperties16);
        java.lang.String str30 = extendedProperties16.getInclude();
        java.lang.String str31 = extendedProperties16.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties33.fileSeparator = "";
        boolean boolean38 = extendedProperties33.getBoolean("/", true);
        java.util.ArrayList arrayList39 = extendedProperties33.keysAsListed;
        java.util.ArrayList arrayList40 = extendedProperties33.keysAsListed;
        java.lang.Double double43 = extendedProperties33.getDouble("}", (java.lang.Double) 0.0d);
        double double46 = extendedProperties33.getDouble("${", (double) 0.0f);
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties48.fileSeparator = "";
        boolean boolean53 = extendedProperties48.getBoolean("/", true);
        java.util.ArrayList arrayList54 = extendedProperties48.keysAsListed;
        java.util.Properties properties56 = null;
        java.util.Properties properties57 = extendedProperties48.getProperties("}", properties56);
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties57);
        org.apache.commons.collections.ExtendedProperties extendedProperties60 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties62 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties62.fileSeparator = "";
        boolean boolean67 = extendedProperties62.getBoolean("/", true);
        java.util.ArrayList arrayList68 = extendedProperties62.keysAsListed;
        java.util.List list69 = extendedProperties60.getList("/", (java.util.List) arrayList68);
        java.lang.String str70 = extendedProperties58.interpolateHelper("}", (java.util.List) arrayList68);
        java.util.List list72 = extendedProperties58.getList(",");
        java.lang.String str73 = extendedProperties58.getInclude();
        java.lang.Long long76 = extendedProperties58.getLong("hi!", (java.lang.Long) 0L);
        java.lang.Boolean boolean79 = extendedProperties58.getBoolean("${", (java.lang.Boolean) false);
        extendedProperties58.basePath = ",";
        java.util.List list83 = extendedProperties58.getList("include");
        java.util.List list84 = extendedProperties33.getList(",", list83);
        java.util.List list85 = extendedProperties16.getList("", list83);
        java.lang.String str87 = extendedProperties16.interpolate("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(arrayList22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "20) test3074(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "/" + "'", str30, "/");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "include" + "'", str31, "include");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(arrayList39);
        org.junit.Assert.assertNotNull(arrayList40);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(arrayList54);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertNotNull(extendedProperties58);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(arrayList68);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "}" + "'", str70, "}");
        org.junit.Assert.assertNotNull(list72);
// flaky "4) test3074(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "/" + "'", str73, "/");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertNotNull(list85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        java.lang.String str2 = propertiesTokenizer1.nextToken();
        java.lang.String str4 = propertiesTokenizer1.nextToken("/");
        boolean boolean5 = propertiesTokenizer1.hasMoreElements();
        java.lang.Object obj6 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.ArrayList arrayList1 = null;
        extendedProperties0.keysAsListed = arrayList1;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.fileSeparator = "";
        boolean boolean8 = extendedProperties3.getBoolean("/", true);
        java.util.ArrayList arrayList9 = extendedProperties3.keysAsListed;
        java.lang.Long long12 = extendedProperties3.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties3.basePath = "include";
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties15.fileSeparator = "";
        java.lang.String str19 = extendedProperties15.testBoolean("}");
        java.lang.String str21 = extendedProperties15.interpolate("}");
        extendedProperties15.basePath = "/";
        extendedProperties3.putAll((java.util.Map) extendedProperties15);
        extendedProperties15.file = "include";
        long long29 = extendedProperties15.getLong("/", 0L);
        extendedProperties0.combine(extendedProperties15);
        java.lang.String str32 = extendedProperties0.testBoolean("}");
        java.util.Vector vector34 = extendedProperties0.getVector("include");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(arrayList9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "}" + "'", str21, "}");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(vector34);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        extendedProperties0.file = "${";
        java.lang.String[] strArray6 = extendedProperties0.getStringArray("/");
        java.lang.String str9 = extendedProperties0.getString("/", "include");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "include" + "'", str9, "include");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties9);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.fileSeparator = "";
        boolean boolean19 = extendedProperties14.getBoolean("/", true);
        java.util.ArrayList arrayList20 = extendedProperties14.keysAsListed;
        java.util.List list21 = extendedProperties12.getList("/", (java.util.List) arrayList20);
        java.lang.String str22 = extendedProperties10.interpolateHelper("}", (java.util.List) arrayList20);
        java.util.Vector vector24 = null;
        java.util.Vector vector25 = extendedProperties10.getVector("hi!", vector24);
        java.lang.Short short28 = extendedProperties10.getShort("", (java.lang.Short) (short) 1);
        java.lang.String str30 = extendedProperties10.testBoolean("include");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.fileSeparator = "";
        boolean boolean36 = extendedProperties31.getBoolean("/", true);
        float float39 = extendedProperties31.getFloat("/", (float) '4');
        java.lang.Double double42 = extendedProperties31.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties44.fileSeparator = "";
        boolean boolean49 = extendedProperties44.getBoolean("/", true);
        java.util.ArrayList arrayList50 = extendedProperties44.keysAsListed;
        java.util.Properties properties52 = null;
        java.util.Properties properties53 = extendedProperties44.getProperties("}", properties52);
        java.util.Properties properties54 = extendedProperties31.getProperties(",", properties53);
        org.apache.commons.collections.ExtendedProperties extendedProperties55 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties54);
        extendedProperties10.putAll((java.util.Map) extendedProperties55);
        int int59 = extendedProperties55.getInt("/", 100);
        java.lang.Object obj61 = extendedProperties55.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(arrayList20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
        org.junit.Assert.assertNotNull(vector25);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 1 + "'", short28 == (short) 1);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 52.0f + "'", float39 == 52.0f);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(arrayList50);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNotNull(extendedProperties55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.ArrayList arrayList4 = null;
        extendedProperties3.keysAsListed = arrayList4;
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties7.fileSeparator = "";
        boolean boolean12 = extendedProperties7.getBoolean("/", true);
        java.util.ArrayList arrayList13 = extendedProperties7.keysAsListed;
        java.util.Properties properties15 = null;
        java.util.Properties properties16 = extendedProperties7.getProperties("}", properties15);
        java.util.Properties properties17 = extendedProperties3.getProperties("include", properties16);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties16);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties19.fileSeparator = "";
        boolean boolean24 = extendedProperties19.getBoolean("/", true);
        java.util.ArrayList arrayList25 = extendedProperties19.keysAsListed;
        java.util.Properties properties27 = null;
        java.util.Properties properties28 = extendedProperties19.getProperties("}", properties27);
        double double31 = extendedProperties19.getDouble("include", 100.0d);
        java.lang.Double double34 = extendedProperties19.getDouble("/", (java.lang.Double) (-1.0d));
        extendedProperties18.putAll((java.util.Map) extendedProperties19);
        float float38 = extendedProperties18.getFloat("hi!", (float) '#');
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties40.fileSeparator = "";
        boolean boolean45 = extendedProperties40.getBoolean("/", true);
        java.util.ArrayList arrayList46 = extendedProperties40.keysAsListed;
        java.util.ArrayList arrayList47 = extendedProperties40.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties49.fileSeparator = "";
        boolean boolean54 = extendedProperties49.getBoolean("/", true);
        float float57 = extendedProperties49.getFloat("/", (float) '4');
        java.lang.Double double60 = extendedProperties49.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties61 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties61.fileSeparator = "";
        boolean boolean66 = extendedProperties61.getBoolean("/", true);
        java.util.ArrayList arrayList67 = extendedProperties61.keysAsListed;
        java.util.Properties properties69 = null;
        java.util.Properties properties70 = extendedProperties61.getProperties("}", properties69);
        org.apache.commons.collections.ExtendedProperties extendedProperties71 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties70);
        org.apache.commons.collections.ExtendedProperties extendedProperties73 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties75 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties75.fileSeparator = "";
        boolean boolean80 = extendedProperties75.getBoolean("/", true);
        java.util.ArrayList arrayList81 = extendedProperties75.keysAsListed;
        java.util.List list82 = extendedProperties73.getList("/", (java.util.List) arrayList81);
        java.lang.String str83 = extendedProperties71.interpolateHelper("}", (java.util.List) arrayList81);
        extendedProperties49.keysAsListed = arrayList81;
        java.util.List list85 = extendedProperties40.getList("", (java.util.List) arrayList81);
        java.util.List list86 = extendedProperties18.getList("hi!", (java.util.List) arrayList81);
        java.lang.String str87 = extendedProperties0.interpolateHelper("/", (java.util.List) arrayList81);
        java.util.Vector vector89 = extendedProperties0.getVector("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(arrayList13);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(extendedProperties18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(arrayList25);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 35.0f + "'", float38 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(arrayList46);
        org.junit.Assert.assertNotNull(arrayList47);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 52.0f + "'", float57 == 52.0f);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(arrayList67);
        org.junit.Assert.assertNotNull(properties70);
        org.junit.Assert.assertNotNull(extendedProperties71);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(arrayList81);
        org.junit.Assert.assertNotNull(list82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "}" + "'", str83, "}");
        org.junit.Assert.assertNotNull(list85);
        org.junit.Assert.assertNotNull(list86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "/" + "'", str87, "/");
        org.junit.Assert.assertNotNull(vector89);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader18 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int25 = reader18.read(charArray24);
        java.io.Reader reader26 = java.io.Reader.nullReader();
        char[] charArray32 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int33 = reader26.read(charArray32);
        int int34 = reader18.read(charArray32);
        int int37 = propertiesReader17.read(charArray32, (int) (byte) 1, (int) (short) 0);
        boolean boolean38 = propertiesReader17.markSupported();
        long long40 = propertiesReader17.skip((long) 'a');
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader41 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        boolean boolean42 = propertiesReader17.markSupported();
        java.lang.String str43 = propertiesReader17.readProperty();
        int int44 = propertiesReader17.read();
        propertiesReader17.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(reader26);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("}");
        java.lang.String str5 = extendedProperties0.basePath;
        byte byte8 = extendedProperties0.getByte("", (byte) -1);
        extendedProperties0.clearProperty("include");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.fileSeparator = "";
        java.lang.String str16 = extendedProperties12.testBoolean("/");
        java.lang.Float float19 = extendedProperties12.getFloat("}", (java.lang.Float) (-1.0f));
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str22 = extendedProperties21.fileSeparator;
        java.lang.String str24 = extendedProperties21.testBoolean("${");
        java.util.Iterator iterator25 = extendedProperties21.getKeys();
        java.util.ArrayList arrayList26 = extendedProperties21.keysAsListed;
        java.util.List list27 = extendedProperties12.getList(",", (java.util.List) arrayList26);
        java.lang.String str28 = extendedProperties0.interpolateHelper("${", list27);
        boolean boolean31 = extendedProperties0.getBoolean("", true);
        java.lang.String str33 = extendedProperties0.getString("${");
        java.util.Iterator iterator35 = extendedProperties0.getKeys("include");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/" + "'", str22, "/");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "${" + "'", str28, "${");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(iterator35);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        java.io.OutputStream outputStream10 = null;
        extendedProperties0.save(outputStream10, "hi!");
        extendedProperties0.isInitialized = true;
        java.lang.String[] strArray16 = extendedProperties0.getStringArray("hi!");
        java.io.OutputStream outputStream17 = null;
        extendedProperties0.save(outputStream17, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        java.lang.String str2 = propertiesTokenizer1.nextToken();
        java.util.Iterator<java.lang.Object> objItor3 = propertiesTokenizer1.asIterator();
        int int4 = propertiesTokenizer1.countTokens();
        java.lang.String str5 = propertiesTokenizer1.nextToken();
        int int6 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.ArrayList arrayList1 = null;
        extendedProperties0.keysAsListed = arrayList1;
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties4.fileSeparator = "";
        boolean boolean9 = extendedProperties4.getBoolean("/", true);
        java.util.ArrayList arrayList10 = extendedProperties4.keysAsListed;
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties4.getProperties("}", properties12);
        java.util.Properties properties14 = extendedProperties0.getProperties("include", properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.fileSeparator = "";
        boolean boolean21 = extendedProperties16.getBoolean("/", true);
        java.util.ArrayList arrayList22 = extendedProperties16.keysAsListed;
        java.util.Properties properties24 = null;
        java.util.Properties properties25 = extendedProperties16.getProperties("}", properties24);
        double double28 = extendedProperties16.getDouble("include", 100.0d);
        java.lang.Double double31 = extendedProperties16.getDouble("/", (java.lang.Double) (-1.0d));
        extendedProperties15.putAll((java.util.Map) extendedProperties16);
        java.lang.Byte byte35 = extendedProperties16.getByte("hi!", (java.lang.Byte) (byte) 0);
        java.lang.String str37 = extendedProperties16.getString("}");
        long long40 = extendedProperties16.getLong("/", (long) (byte) -1);
        boolean boolean41 = extendedProperties16.isInitialized;
        extendedProperties16.file = "include";
        java.lang.Object obj45 = extendedProperties16.getProperty("}");
        byte byte48 = extendedProperties16.getByte("/", (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(extendedProperties15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(arrayList22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 0 + "'", byte35 == (byte) 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) -1 + "'", byte48 == (byte) -1);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("/");
        java.lang.Float float7 = extendedProperties0.getFloat("}", (java.lang.Float) (-1.0f));
        java.io.OutputStream outputStream8 = null;
        extendedProperties0.save(outputStream8, "${");
        java.lang.String str12 = extendedProperties0.testBoolean(",");
        java.lang.String str13 = extendedProperties0.file;
        java.lang.Boolean boolean16 = extendedProperties0.getBoolean("hi!", (java.lang.Boolean) true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        boolean boolean12 = extendedProperties0.isInitialized();
        java.lang.Integer int15 = extendedProperties0.getInteger(",", (java.lang.Integer) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.fileSeparator = "";
        java.lang.String str20 = extendedProperties16.testBoolean("}");
        extendedProperties0.putAll((java.util.Map) extendedProperties16);
        java.lang.Integer int24 = extendedProperties16.getInteger("/", (java.lang.Integer) 0);
        java.lang.String str27 = extendedProperties16.getString("", "${");
        java.lang.Long long30 = extendedProperties16.getLong("${", (java.lang.Long) 97L);
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.fileSeparator = "";
        boolean boolean37 = extendedProperties32.getBoolean("/", true);
        java.util.ArrayList arrayList38 = extendedProperties32.keysAsListed;
        java.util.Properties properties40 = null;
        java.util.Properties properties41 = extendedProperties32.getProperties("}", properties40);
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties41);
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties46.fileSeparator = "";
        boolean boolean51 = extendedProperties46.getBoolean("/", true);
        java.util.ArrayList arrayList52 = extendedProperties46.keysAsListed;
        java.util.List list53 = extendedProperties44.getList("/", (java.util.List) arrayList52);
        java.lang.String str54 = extendedProperties42.interpolateHelper("}", (java.util.List) arrayList52);
        java.util.List list56 = extendedProperties42.getList(",");
        java.lang.String str57 = extendedProperties42.getInclude();
        java.lang.Long long60 = extendedProperties42.getLong("hi!", (java.lang.Long) 0L);
        java.lang.Boolean boolean63 = extendedProperties42.getBoolean("${", (java.lang.Boolean) false);
        extendedProperties42.basePath = ",";
        extendedProperties42.display();
        java.util.Iterator iterator68 = extendedProperties42.getKeys("include");
        extendedProperties16.setProperty("}", (java.lang.Object) extendedProperties42);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "${" + "'", str27, "${");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(arrayList38);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(extendedProperties42);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(arrayList52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "}" + "'", str54, "}");
        org.junit.Assert.assertNotNull(list56);
// flaky "21) test3086(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "/" + "'", str57, "/");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(iterator68);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.String str3 = extendedProperties0.testBoolean("${");
        java.lang.String str4 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.fileSeparator = "";
        boolean boolean10 = extendedProperties5.getBoolean("/", true);
        float float13 = extendedProperties5.getFloat("/", (float) '4');
        java.lang.Double double16 = extendedProperties5.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.fileSeparator = "";
        boolean boolean22 = extendedProperties17.getBoolean("/", true);
        java.util.ArrayList arrayList23 = extendedProperties17.keysAsListed;
        java.util.Properties properties25 = null;
        java.util.Properties properties26 = extendedProperties17.getProperties("}", properties25);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties26);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.fileSeparator = "";
        boolean boolean36 = extendedProperties31.getBoolean("/", true);
        java.util.ArrayList arrayList37 = extendedProperties31.keysAsListed;
        java.util.List list38 = extendedProperties29.getList("/", (java.util.List) arrayList37);
        java.lang.String str39 = extendedProperties27.interpolateHelper("}", (java.util.List) arrayList37);
        extendedProperties5.keysAsListed = arrayList37;
        java.lang.String str43 = extendedProperties5.getString("/", "include");
        extendedProperties0.combine(extendedProperties5);
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties45.fileSeparator = "";
        boolean boolean50 = extendedProperties45.getBoolean("/", true);
        java.util.ArrayList arrayList51 = extendedProperties45.keysAsListed;
        extendedProperties5.combine(extendedProperties45);
        java.lang.Long long55 = extendedProperties45.getLong(",", (java.lang.Long) 100L);
        java.lang.Long long58 = extendedProperties45.getLong("include", (java.lang.Long) 1L);
        java.io.OutputStream outputStream59 = null;
        extendedProperties45.save(outputStream59, "include");
        java.lang.String str62 = extendedProperties45.getInclude();
        java.util.Vector vector64 = extendedProperties45.getVector("hi!");
        java.lang.Byte byte67 = extendedProperties45.getByte("${", (java.lang.Byte) (byte) -1);
        java.lang.Integer int70 = extendedProperties45.getInteger(",", (java.lang.Integer) 1);
        java.lang.String str72 = extendedProperties45.interpolate("hi!");
        java.lang.String str74 = extendedProperties45.testBoolean("${");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str3);
// flaky "22) test3087(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 52.0f + "'", float13 == 52.0f);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(extendedProperties27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "}" + "'", str39, "}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "include" + "'", str43, "include");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(arrayList51);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 100L + "'", long55 == 100L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
// flaky "5) test3087(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "/" + "'", str62, "/");
        org.junit.Assert.assertNotNull(vector64);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) -1 + "'", byte67 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("}");
        java.lang.String str6 = extendedProperties0.interpolate("}");
        byte byte9 = extendedProperties0.getByte("}", (byte) 100);
        java.lang.String str12 = extendedProperties0.getString("}", "}");
        java.lang.String str13 = extendedProperties0.getInclude();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = extendedProperties0.getInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
// flaky "23) test3088(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/" + "'", str13, "/");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.fileSeparator = "";
        java.lang.String str16 = extendedProperties12.testBoolean("}");
        java.lang.String str18 = extendedProperties12.interpolate("}");
        extendedProperties12.basePath = "/";
        extendedProperties0.putAll((java.util.Map) extendedProperties12);
        int int24 = extendedProperties0.getInteger("", 32);
        java.util.Properties properties26 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties26);
        java.lang.Integer int30 = extendedProperties27.getInteger("", (java.lang.Integer) 32);
        extendedProperties27.fileSeparator = ",";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "}" + "'", str18, "}");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(extendedProperties27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str2 = propertiesTokenizer1.nextToken();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str6 = propertiesTokenizer1.nextToken("}");
        java.lang.String str8 = propertiesTokenizer1.nextToken(",");
        boolean boolean9 = propertiesTokenizer1.hasMoreElements();
        boolean boolean10 = propertiesTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor11 = propertiesTokenizer1.asIterator();
        int int12 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.ArrayList arrayList7 = extendedProperties0.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties9.fileSeparator = "";
        boolean boolean14 = extendedProperties9.getBoolean("/", true);
        float float17 = extendedProperties9.getFloat("/", (float) '4');
        java.lang.Double double20 = extendedProperties9.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties21.fileSeparator = "";
        boolean boolean26 = extendedProperties21.getBoolean("/", true);
        java.util.ArrayList arrayList27 = extendedProperties21.keysAsListed;
        java.util.Properties properties29 = null;
        java.util.Properties properties30 = extendedProperties21.getProperties("}", properties29);
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties30);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties35.fileSeparator = "";
        boolean boolean40 = extendedProperties35.getBoolean("/", true);
        java.util.ArrayList arrayList41 = extendedProperties35.keysAsListed;
        java.util.List list42 = extendedProperties33.getList("/", (java.util.List) arrayList41);
        java.lang.String str43 = extendedProperties31.interpolateHelper("}", (java.util.List) arrayList41);
        extendedProperties9.keysAsListed = arrayList41;
        java.util.List list45 = extendedProperties0.getList("", (java.util.List) arrayList41);
        java.lang.Object obj47 = extendedProperties0.getProperty("/");
        boolean boolean48 = extendedProperties0.isInitialized();
        extendedProperties0.fileSeparator = "include";
        double double53 = extendedProperties0.getDouble("include", (double) 1);
        java.io.InputStream inputStream54 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream54, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 52.0f + "'", float17 == 52.0f);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(arrayList27);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(extendedProperties31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(arrayList41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "}" + "'", str43, "}");
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        java.lang.String str2 = propertiesTokenizer1.nextToken();
        java.util.Iterator<java.lang.Object> objItor3 = propertiesTokenizer1.asIterator();
        int int4 = propertiesTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor5 = propertiesTokenizer1.asIterator();
        java.lang.String str7 = propertiesTokenizer1.nextToken("}");
        boolean boolean8 = propertiesTokenizer1.hasMoreTokens();
        java.lang.Object obj9 = propertiesTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor10 = propertiesTokenizer1.asIterator();
        boolean boolean11 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties9);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.fileSeparator = "";
        boolean boolean19 = extendedProperties14.getBoolean("/", true);
        java.util.ArrayList arrayList20 = extendedProperties14.keysAsListed;
        java.util.List list21 = extendedProperties12.getList("/", (java.util.List) arrayList20);
        java.lang.String str22 = extendedProperties10.interpolateHelper("}", (java.util.List) arrayList20);
        java.util.List list24 = extendedProperties10.getList(",");
        java.lang.String str25 = extendedProperties10.getInclude();
        java.lang.String str26 = extendedProperties10.fileSeparator;
        java.util.List list28 = extendedProperties10.getList("/");
        java.lang.Long long31 = extendedProperties10.getLong("", (java.lang.Long) 100L);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties33.fileSeparator = "";
        boolean boolean38 = extendedProperties33.getBoolean("/", true);
        java.util.ArrayList arrayList39 = extendedProperties33.keysAsListed;
        java.util.Properties properties41 = null;
        java.util.Properties properties42 = extendedProperties33.getProperties("}", properties41);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties42);
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties47.fileSeparator = "";
        boolean boolean52 = extendedProperties47.getBoolean("/", true);
        java.util.ArrayList arrayList53 = extendedProperties47.keysAsListed;
        java.util.List list54 = extendedProperties45.getList("/", (java.util.List) arrayList53);
        java.lang.String str55 = extendedProperties43.interpolateHelper("}", (java.util.List) arrayList53);
        java.util.List list57 = extendedProperties43.getList(",");
        java.lang.String str58 = extendedProperties43.getInclude();
        java.lang.String str59 = extendedProperties43.fileSeparator;
        java.lang.String str61 = extendedProperties43.interpolate("");
        java.util.ArrayList arrayList62 = extendedProperties43.keysAsListed;
        java.util.List list63 = extendedProperties10.getList("hi!", (java.util.List) arrayList62);
        int int66 = extendedProperties10.getInteger("${", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(arrayList20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
        org.junit.Assert.assertNotNull(list24);
// flaky "24) test3093(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "/" + "'", str25, "/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/" + "'", str26, "/");
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(arrayList39);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(extendedProperties43);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(arrayList53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "}" + "'", str55, "}");
        org.junit.Assert.assertNotNull(list57);
// flaky "6) test3093(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "/" + "'", str58, "/");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "/" + "'", str59, "/");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(arrayList62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str2 = propertiesTokenizer1.nextToken();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str6 = propertiesTokenizer1.nextToken("}");
        java.lang.String str7 = propertiesTokenizer1.nextToken();
        boolean boolean8 = propertiesTokenizer1.hasMoreTokens();
        java.lang.Object obj9 = propertiesTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor10 = propertiesTokenizer1.asIterator();
        java.lang.Object obj11 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("}");
        long long7 = extendedProperties0.getLong("}", 100L);
        java.util.Iterator iterator8 = extendedProperties0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = extendedProperties0.getDouble(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader17.mark((int) (byte) 1);
        int int20 = propertiesReader17.read();
        int int21 = propertiesReader17.getLineNumber();
        java.lang.String str22 = propertiesReader17.readLine();
        propertiesReader17.mark((int) (short) 100);
        boolean boolean25 = propertiesReader17.markSupported();
        int int26 = propertiesReader17.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader27 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader28 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader27);
        java.lang.String str29 = propertiesReader28.readProperty();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.ArrayList arrayList1 = null;
        extendedProperties0.keysAsListed = arrayList1;
        long long5 = extendedProperties0.getLong("}", 10L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties7.fileSeparator = "";
        boolean boolean12 = extendedProperties7.getBoolean("/", true);
        java.util.ArrayList arrayList13 = extendedProperties7.keysAsListed;
        java.util.ArrayList arrayList14 = extendedProperties7.keysAsListed;
        java.util.List list16 = extendedProperties7.getList("}");
        java.util.List list17 = extendedProperties0.getList("", list16);
        float float20 = extendedProperties0.getFloat("/", (float) 'a');
        long long23 = extendedProperties0.getLong("hi!", (long) (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties24.fileSeparator = "";
        boolean boolean29 = extendedProperties24.getBoolean("/", true);
        java.util.ArrayList arrayList30 = extendedProperties24.keysAsListed;
        java.util.Properties properties32 = null;
        java.util.Properties properties33 = extendedProperties24.getProperties("}", properties32);
        double double36 = extendedProperties24.getDouble("include", 100.0d);
        java.lang.Double double39 = extendedProperties24.getDouble("/", (java.lang.Double) (-1.0d));
        boolean boolean42 = extendedProperties24.getBoolean("include", false);
        extendedProperties0.putAll((java.util.Map) extendedProperties24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = extendedProperties24.getBoolean("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(arrayList13);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 97.0f + "'", float20 == 97.0f);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(arrayList30);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader18 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int25 = reader18.read(charArray24);
        java.io.Reader reader26 = java.io.Reader.nullReader();
        char[] charArray32 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int33 = reader26.read(charArray32);
        int int34 = reader18.read(charArray32);
        int int37 = propertiesReader17.read(charArray32, (int) (byte) 1, (int) (short) 0);
        boolean boolean38 = propertiesReader17.markSupported();
        int int39 = propertiesReader17.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader40 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader41 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        propertiesReader41.mark(35);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(reader26);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.String str3 = extendedProperties0.testBoolean("${");
        java.lang.String str4 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.fileSeparator = "";
        boolean boolean10 = extendedProperties5.getBoolean("/", true);
        float float13 = extendedProperties5.getFloat("/", (float) '4');
        java.lang.Double double16 = extendedProperties5.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.fileSeparator = "";
        boolean boolean22 = extendedProperties17.getBoolean("/", true);
        java.util.ArrayList arrayList23 = extendedProperties17.keysAsListed;
        java.util.Properties properties25 = null;
        java.util.Properties properties26 = extendedProperties17.getProperties("}", properties25);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties26);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.fileSeparator = "";
        boolean boolean36 = extendedProperties31.getBoolean("/", true);
        java.util.ArrayList arrayList37 = extendedProperties31.keysAsListed;
        java.util.List list38 = extendedProperties29.getList("/", (java.util.List) arrayList37);
        java.lang.String str39 = extendedProperties27.interpolateHelper("}", (java.util.List) arrayList37);
        extendedProperties5.keysAsListed = arrayList37;
        java.lang.String str43 = extendedProperties5.getString("/", "include");
        extendedProperties0.combine(extendedProperties5);
        java.lang.String str45 = extendedProperties5.fileSeparator;
        java.lang.String str47 = extendedProperties5.getString("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str3);
// flaky "25) test3099(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 52.0f + "'", float13 == 52.0f);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(extendedProperties27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "}" + "'", str39, "}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "include" + "'", str43, "include");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.fileSeparator = "";
        java.lang.String str16 = extendedProperties12.testBoolean("}");
        java.lang.String str18 = extendedProperties12.interpolate("}");
        extendedProperties12.basePath = "/";
        extendedProperties0.putAll((java.util.Map) extendedProperties12);
        extendedProperties12.file = "include";
        // The following exception was thrown during execution in test generation
        try {
            int int25 = extendedProperties12.getInteger("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "}" + "'", str18, "}");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.getInclude();
        java.lang.String str4 = extendedProperties0.getString("include", "/");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.fileSeparator = "";
        java.lang.String str10 = extendedProperties6.testBoolean("/");
        java.lang.Float float13 = extendedProperties6.getFloat("}", (java.lang.Float) (-1.0f));
        java.io.OutputStream outputStream14 = null;
        extendedProperties6.save(outputStream14, "${");
        java.lang.String str18 = extendedProperties6.testBoolean(",");
        java.lang.String str19 = extendedProperties6.file;
        java.lang.Integer int22 = extendedProperties6.getInteger("/", (java.lang.Integer) 10);
        extendedProperties0.setProperty("", (java.lang.Object) int22);
        extendedProperties0.setInclude("hi!");
// flaky "26) test3101(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str11 = extendedProperties10.fileSeparator;
        java.lang.String str13 = extendedProperties10.testBoolean("${");
        extendedProperties0.combine(extendedProperties10);
        java.lang.String str15 = extendedProperties10.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties17.fileSeparator;
        java.lang.String str20 = extendedProperties17.testBoolean("${");
        java.lang.String str21 = extendedProperties17.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.fileSeparator = "";
        boolean boolean27 = extendedProperties22.getBoolean("/", true);
        float float30 = extendedProperties22.getFloat("/", (float) '4');
        java.lang.Double double33 = extendedProperties22.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties34.fileSeparator = "";
        boolean boolean39 = extendedProperties34.getBoolean("/", true);
        java.util.ArrayList arrayList40 = extendedProperties34.keysAsListed;
        java.util.Properties properties42 = null;
        java.util.Properties properties43 = extendedProperties34.getProperties("}", properties42);
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties43);
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties48.fileSeparator = "";
        boolean boolean53 = extendedProperties48.getBoolean("/", true);
        java.util.ArrayList arrayList54 = extendedProperties48.keysAsListed;
        java.util.List list55 = extendedProperties46.getList("/", (java.util.List) arrayList54);
        java.lang.String str56 = extendedProperties44.interpolateHelper("}", (java.util.List) arrayList54);
        extendedProperties22.keysAsListed = arrayList54;
        java.lang.String str60 = extendedProperties22.getString("/", "include");
        extendedProperties17.combine(extendedProperties22);
        java.lang.String str63 = extendedProperties22.getString("/");
        java.lang.Double double66 = extendedProperties22.getDouble("hi!", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties68 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str69 = extendedProperties68.fileSeparator;
        java.lang.String str71 = extendedProperties68.testBoolean("${");
        java.util.Iterator iterator72 = extendedProperties68.getKeys();
        int int75 = extendedProperties68.getInt("hi!", (int) (byte) -1);
        java.util.Vector vector77 = extendedProperties68.getVector("include");
        java.util.Vector vector78 = extendedProperties22.getVector("include", vector77);
        java.util.Vector vector79 = extendedProperties10.getVector("", vector77);
        java.lang.Short short82 = extendedProperties10.getShort("hi!", (java.lang.Short) (short) -1);
        java.util.ArrayList arrayList83 = extendedProperties10.keysAsListed;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/" + "'", str15, "/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/" + "'", str18, "/");
        org.junit.Assert.assertNull(str20);
// flaky "27) test3102(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/" + "'", str21, "/");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 52.0f + "'", float30 == 52.0f);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(arrayList40);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNotNull(extendedProperties44);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(arrayList54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "}" + "'", str56, "}");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "include" + "'", str60, "include");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "/" + "'", str69, "/");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(vector77);
        org.junit.Assert.assertNotNull(vector78);
        org.junit.Assert.assertNotNull(vector79);
        org.junit.Assert.assertTrue("'" + short82 + "' != '" + (short) -1 + "'", short82 == (short) -1);
        org.junit.Assert.assertNotNull(arrayList83);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties2.fileSeparator = "";
        boolean boolean7 = extendedProperties2.getBoolean("/", true);
        java.util.ArrayList arrayList8 = extendedProperties2.keysAsListed;
        java.util.List list9 = extendedProperties0.getList("/", (java.util.List) arrayList8);
        extendedProperties0.basePath = "hi!";
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties13.fileSeparator = "";
        boolean boolean18 = extendedProperties13.getBoolean("/", true);
        java.util.ArrayList arrayList19 = extendedProperties13.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.fileSeparator = "";
        boolean boolean25 = extendedProperties20.getBoolean("/", true);
        java.util.ArrayList arrayList26 = extendedProperties20.keysAsListed;
        java.util.ArrayList arrayList27 = extendedProperties20.keysAsListed;
        extendedProperties13.keysAsListed = arrayList27;
        java.util.List list29 = extendedProperties0.getList("", (java.util.List) arrayList27);
        java.lang.Short short32 = extendedProperties0.getShort("/", (java.lang.Short) (short) 10);
        extendedProperties0.setInclude("include");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(arrayList19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertNotNull(arrayList27);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 10 + "'", short32 == (short) 10);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str2 = propertiesTokenizer1.nextToken();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str6 = propertiesTokenizer1.nextToken("}");
        java.lang.String str7 = propertiesTokenizer1.nextToken();
        boolean boolean8 = propertiesTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor9 = propertiesTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor10 = propertiesTokenizer1.asIterator();
        java.lang.Object obj11 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.String str3 = extendedProperties0.testBoolean("${");
        boolean boolean6 = extendedProperties0.getBoolean("}", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties7.fileSeparator = "";
        boolean boolean12 = extendedProperties7.getBoolean("/", true);
        java.util.ArrayList arrayList13 = extendedProperties7.keysAsListed;
        java.util.Properties properties15 = null;
        java.util.Properties properties16 = extendedProperties7.getProperties("}", properties15);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties17.fileSeparator;
        java.lang.String str20 = extendedProperties17.testBoolean("${");
        extendedProperties7.combine(extendedProperties17);
        extendedProperties0.putAll((java.util.Map) extendedProperties17);
        extendedProperties17.fileSeparator = "}";
        java.util.ArrayList arrayList25 = extendedProperties17.keysAsListed;
        extendedProperties17.file = "hi!";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(arrayList13);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/" + "'", str18, "/");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(arrayList25);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties9);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.fileSeparator = "";
        boolean boolean19 = extendedProperties14.getBoolean("/", true);
        java.util.ArrayList arrayList20 = extendedProperties14.keysAsListed;
        java.util.List list21 = extendedProperties12.getList("/", (java.util.List) arrayList20);
        java.lang.String str22 = extendedProperties10.interpolateHelper("}", (java.util.List) arrayList20);
        java.util.List list24 = extendedProperties10.getList(",");
        java.lang.String str25 = extendedProperties10.getInclude();
        java.lang.Long long28 = extendedProperties10.getLong("hi!", (java.lang.Long) 0L);
        java.lang.Boolean boolean31 = extendedProperties10.getBoolean("${", (java.lang.Boolean) false);
        extendedProperties10.fileSeparator = "${";
        int int36 = extendedProperties10.getInt("/", (int) (short) -1);
        extendedProperties10.display();
        java.util.Properties properties39 = extendedProperties10.getProperties("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties39);
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties39);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(arrayList20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
        org.junit.Assert.assertNotNull(list24);
// flaky "28) test3106(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "/" + "'", str25, "/");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(extendedProperties40);
        org.junit.Assert.assertNotNull(extendedProperties41);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.io.Reader reader18 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int25 = reader18.read(charArray24);
        java.io.Reader reader26 = java.io.Reader.nullReader();
        char[] charArray32 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int33 = reader26.read(charArray32);
        int int34 = reader18.read(charArray32);
        int int37 = propertiesReader17.read(charArray32, (int) (byte) 1, (int) (short) 0);
        boolean boolean38 = propertiesReader17.markSupported();
        int int39 = propertiesReader17.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader40 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        long long42 = propertiesReader17.skip(0L);
        propertiesReader17.close();
        long long45 = propertiesReader17.skip((long) (byte) 0);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(reader26);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.String str3 = extendedProperties0.testBoolean("${");
        java.util.Iterator iterator4 = extendedProperties0.getKeys();
        java.lang.String str6 = extendedProperties0.interpolate(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.fileSeparator = "";
        boolean boolean13 = extendedProperties8.getBoolean("/", true);
        java.util.ArrayList arrayList14 = extendedProperties8.keysAsListed;
        java.lang.Long long17 = extendedProperties8.getLong("hi!", (java.lang.Long) 1L);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = extendedProperties8.subset("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str22 = extendedProperties21.fileSeparator;
        java.lang.String str24 = extendedProperties21.testBoolean("${");
        java.lang.String str25 = extendedProperties21.getInclude();
        java.lang.Integer int28 = extendedProperties21.getInteger(",", (java.lang.Integer) 100);
        java.lang.Double double31 = extendedProperties21.getDouble("", (java.lang.Double) 100.0d);
        java.util.Vector vector33 = extendedProperties21.getVector("include");
        java.util.Vector vector34 = extendedProperties8.getVector("/", vector33);
        java.util.Vector vector35 = extendedProperties0.getVector("/", vector34);
        boolean boolean36 = extendedProperties0.isInitialized;
        extendedProperties0.clearProperty("${");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNull(extendedProperties19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/" + "'", str22, "/");
        org.junit.Assert.assertNull(str24);
// flaky "29) test3108(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "/" + "'", str25, "/");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(vector33);
        org.junit.Assert.assertNotNull(vector34);
        org.junit.Assert.assertNotNull(vector35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        float float8 = extendedProperties0.getFloat("/", (float) '4');
        java.lang.Double double11 = extendedProperties0.getDouble("include", (java.lang.Double) 10.0d);
        java.lang.Double double14 = extendedProperties0.getDouble("/", (java.lang.Double) (-1.0d));
        java.lang.Integer int17 = extendedProperties0.getInteger("/", (java.lang.Integer) 10);
        extendedProperties0.setInclude("${");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 52.0f + "'", float8 == 52.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.ArrayList arrayList1 = null;
        extendedProperties0.keysAsListed = arrayList1;
        java.lang.String str3 = extendedProperties0.file;
        java.util.Properties properties5 = extendedProperties0.getProperties("include");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties5);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(extendedProperties6);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        boolean boolean12 = extendedProperties0.isInitialized();
        java.lang.Integer int15 = extendedProperties0.getInteger("${", (java.lang.Integer) 32);
        extendedProperties0.file = ",";
        java.lang.Integer int20 = extendedProperties0.getInteger("/", (java.lang.Integer) 35);
        java.util.Vector vector22 = null;
        java.util.Vector vector23 = extendedProperties0.getVector("", vector22);
        long long26 = extendedProperties0.getLong("${", 97L);
        extendedProperties0.file = "${";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(vector23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.String str3 = extendedProperties0.testBoolean("${");
        java.lang.String str4 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.fileSeparator = "";
        boolean boolean10 = extendedProperties5.getBoolean("/", true);
        float float13 = extendedProperties5.getFloat("/", (float) '4');
        java.lang.Double double16 = extendedProperties5.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.fileSeparator = "";
        boolean boolean22 = extendedProperties17.getBoolean("/", true);
        java.util.ArrayList arrayList23 = extendedProperties17.keysAsListed;
        java.util.Properties properties25 = null;
        java.util.Properties properties26 = extendedProperties17.getProperties("}", properties25);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties26);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.fileSeparator = "";
        boolean boolean36 = extendedProperties31.getBoolean("/", true);
        java.util.ArrayList arrayList37 = extendedProperties31.keysAsListed;
        java.util.List list38 = extendedProperties29.getList("/", (java.util.List) arrayList37);
        java.lang.String str39 = extendedProperties27.interpolateHelper("}", (java.util.List) arrayList37);
        extendedProperties5.keysAsListed = arrayList37;
        java.lang.String str43 = extendedProperties5.getString("/", "include");
        extendedProperties0.combine(extendedProperties5);
        long long47 = extendedProperties5.getLong(",", (long) ' ');
        java.lang.String str48 = extendedProperties5.fileSeparator;
        java.lang.Boolean boolean51 = extendedProperties5.getBoolean("/", (java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str3);
// flaky "30) test3112(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 52.0f + "'", float13 == 52.0f);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(extendedProperties27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "}" + "'", str39, "}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "include" + "'", str43, "include");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 32L + "'", long47 == 32L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties2.fileSeparator = "";
        boolean boolean7 = extendedProperties2.getBoolean("/", true);
        java.util.ArrayList arrayList8 = extendedProperties2.keysAsListed;
        java.util.List list9 = extendedProperties0.getList("/", (java.util.List) arrayList8);
        boolean boolean10 = extendedProperties0.isInitialized;
        int int13 = extendedProperties0.getInteger("hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = extendedProperties0.getLong("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        double double12 = extendedProperties0.getDouble("include", 100.0d);
        java.lang.Double double15 = extendedProperties0.getDouble("/", (java.lang.Double) (-1.0d));
        boolean boolean18 = extendedProperties0.getBoolean("include", false);
        java.io.OutputStream outputStream19 = null;
        extendedProperties0.save(outputStream19, "include");
        extendedProperties0.file = ",";
        java.lang.String str24 = extendedProperties0.basePath;
        java.lang.Class<?> wildcardClass25 = extendedProperties0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("/");
        java.lang.Boolean boolean7 = extendedProperties0.getBoolean("}", (java.lang.Boolean) true);
        java.lang.String str8 = extendedProperties0.basePath;
        java.lang.String str10 = extendedProperties0.testBoolean("${");
        java.lang.String str12 = extendedProperties0.testBoolean("/");
        extendedProperties0.fileSeparator = "";
        java.io.OutputStream outputStream15 = null;
        extendedProperties0.save(outputStream15, "");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str20 = extendedProperties19.fileSeparator;
        java.lang.String str22 = extendedProperties19.testBoolean("${");
        float float25 = extendedProperties19.getFloat("${", (float) 1);
        java.util.ArrayList arrayList26 = extendedProperties19.keysAsListed;
        extendedProperties0.setProperty("hi!", (java.lang.Object) extendedProperties19);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(arrayList26);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Properties properties8 = null;
        java.util.Properties properties9 = extendedProperties0.getProperties("}", properties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties9);
        extendedProperties10.clearProperty("");
        int int15 = extendedProperties10.getInt("${", (int) (byte) -1);
        int int18 = extendedProperties10.getInteger("${", 1);
        java.lang.String[] strArray20 = extendedProperties10.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.fileSeparator = "";
        java.lang.String str26 = extendedProperties22.testBoolean("/");
        java.lang.Boolean boolean29 = extendedProperties22.getBoolean("}", (java.lang.Boolean) true);
        extendedProperties22.setInclude("/");
        int int34 = extendedProperties22.getInteger("${", (int) '#');
        java.lang.Object obj36 = extendedProperties22.getProperty("${");
        java.util.Vector vector38 = extendedProperties22.getVector("${");
        java.lang.String str39 = extendedProperties10.interpolateHelper("${", (java.util.List) vector38);
        java.lang.String str41 = extendedProperties10.getString("");
        byte byte44 = extendedProperties10.getByte("include", (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(vector38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "${" + "'", str39, "${");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 0 + "'", byte44 == (byte) 0);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.String str3 = extendedProperties0.testBoolean("${");
        boolean boolean6 = extendedProperties0.getBoolean("}", true);
        java.lang.Object obj8 = extendedProperties0.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties10.fileSeparator = "";
        boolean boolean15 = extendedProperties10.getBoolean("/", true);
        java.util.ArrayList arrayList16 = extendedProperties10.keysAsListed;
        java.lang.Long long19 = extendedProperties10.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties10.basePath = "include";
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.fileSeparator = "";
        java.lang.String str26 = extendedProperties22.testBoolean("}");
        java.lang.String str28 = extendedProperties22.interpolate("}");
        extendedProperties22.basePath = "/";
        extendedProperties10.putAll((java.util.Map) extendedProperties22);
        int int34 = extendedProperties10.getInteger("", 32);
        java.lang.Boolean boolean37 = extendedProperties10.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String str38 = extendedProperties10.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties40.fileSeparator = "";
        boolean boolean45 = extendedProperties40.getBoolean("/", true);
        java.util.ArrayList arrayList46 = extendedProperties40.keysAsListed;
        java.util.Properties properties48 = null;
        java.util.Properties properties49 = extendedProperties40.getProperties("}", properties48);
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties49);
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties52.fileSeparator = "";
        boolean boolean57 = extendedProperties52.getBoolean("/", true);
        java.util.ArrayList arrayList58 = extendedProperties52.keysAsListed;
        java.lang.Long long61 = extendedProperties52.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties52.basePath = "include";
        org.apache.commons.collections.ExtendedProperties extendedProperties64 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties64.fileSeparator = "";
        java.lang.String str68 = extendedProperties64.testBoolean("}");
        java.lang.String str70 = extendedProperties64.interpolate("}");
        extendedProperties64.basePath = "/";
        extendedProperties52.putAll((java.util.Map) extendedProperties64);
        int int76 = extendedProperties52.getInteger("", 32);
        java.util.Properties properties78 = extendedProperties52.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties79 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties78);
        java.util.Properties properties80 = extendedProperties50.getProperties("", properties78);
        java.util.Properties properties81 = extendedProperties10.getProperties("${", properties80);
        java.util.Properties properties82 = extendedProperties0.getProperties("${", properties80);
        int int85 = extendedProperties0.getInteger("", 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(arrayList16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "}" + "'", str28, "}");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky "31) test3117(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "/" + "'", str38, "/");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(arrayList46);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertNotNull(extendedProperties50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(arrayList58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "}" + "'", str70, "}");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 32 + "'", int76 == 32);
        org.junit.Assert.assertNotNull(properties78);
        org.junit.Assert.assertNotNull(extendedProperties79);
        org.junit.Assert.assertNotNull(properties80);
        org.junit.Assert.assertNotNull(properties81);
        org.junit.Assert.assertNotNull(properties82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.fileSeparator = "";
        java.lang.String str16 = extendedProperties12.testBoolean("}");
        java.lang.String str18 = extendedProperties12.interpolate("}");
        extendedProperties12.basePath = "/";
        extendedProperties0.putAll((java.util.Map) extendedProperties12);
        java.io.OutputStream outputStream22 = null;
        extendedProperties12.save(outputStream22, "include");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "}" + "'", str18, "}");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("}");
        java.lang.String str6 = extendedProperties0.interpolate("}");
        extendedProperties0.basePath = "/";
        java.lang.String[] strArray10 = extendedProperties0.getStringArray("}");
        java.util.Iterator iterator12 = extendedProperties0.getKeys("/");
        java.lang.String str13 = extendedProperties0.getInclude();
        java.io.Reader reader15 = java.io.Reader.nullReader();
        char[] charArray21 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int22 = reader15.read(charArray21);
        java.io.Reader reader23 = java.io.Reader.nullReader();
        char[] charArray29 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int30 = reader23.read(charArray29);
        int int31 = reader15.read(charArray29);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader32 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader15);
        propertiesReader32.setLineNumber((int) (byte) 100);
        long long36 = propertiesReader32.skip(0L);
        boolean boolean37 = propertiesReader32.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader38 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader32);
        propertiesReader38.mark((int) (byte) 0);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader41 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader38);
        extendedProperties0.addProperty("", (java.lang.Object) propertiesReader38);
        java.nio.CharBuffer charBuffer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = propertiesReader38.read(charBuffer43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator12);
// flaky "32) test3119(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/" + "'", str13, "/");
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(reader23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        boolean boolean12 = extendedProperties0.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str14 = extendedProperties13.fileSeparator;
        java.lang.String str16 = extendedProperties13.testBoolean("${");
        java.lang.String str17 = extendedProperties13.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.fileSeparator = "";
        boolean boolean23 = extendedProperties18.getBoolean("/", true);
        float float26 = extendedProperties18.getFloat("/", (float) '4');
        java.lang.Double double29 = extendedProperties18.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties30.fileSeparator = "";
        boolean boolean35 = extendedProperties30.getBoolean("/", true);
        java.util.ArrayList arrayList36 = extendedProperties30.keysAsListed;
        java.util.Properties properties38 = null;
        java.util.Properties properties39 = extendedProperties30.getProperties("}", properties38);
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties39);
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties44.fileSeparator = "";
        boolean boolean49 = extendedProperties44.getBoolean("/", true);
        java.util.ArrayList arrayList50 = extendedProperties44.keysAsListed;
        java.util.List list51 = extendedProperties42.getList("/", (java.util.List) arrayList50);
        java.lang.String str52 = extendedProperties40.interpolateHelper("}", (java.util.List) arrayList50);
        extendedProperties18.keysAsListed = arrayList50;
        java.lang.String str56 = extendedProperties18.getString("/", "include");
        extendedProperties13.combine(extendedProperties18);
        extendedProperties0.putAll((java.util.Map) extendedProperties18);
        java.util.Iterator iterator60 = extendedProperties18.getKeys(",");
        byte byte63 = extendedProperties18.getByte("", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties64 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties64.fileSeparator = "";
        boolean boolean69 = extendedProperties64.getBoolean("/", true);
        java.util.ArrayList arrayList70 = extendedProperties64.keysAsListed;
        java.lang.Long long73 = extendedProperties64.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties64.basePath = "include";
        boolean boolean76 = extendedProperties64.isInitialized();
        java.lang.Integer int79 = extendedProperties64.getInteger(",", (java.lang.Integer) 0);
        java.util.Vector vector81 = extendedProperties64.getVector("/");
        java.lang.String[] strArray83 = extendedProperties64.getStringArray("hi!");
        java.lang.Double double86 = extendedProperties64.getDouble("${", (java.lang.Double) 1.0d);
        extendedProperties18.putAll((java.util.Map) extendedProperties64);
        java.lang.Short short90 = extendedProperties64.getShort("", (java.lang.Short) (short) 10);
        java.util.List list92 = extendedProperties64.getList("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertNull(str16);
// flaky "33) test3120(org.apache.commons.collections.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/" + "'", str17, "/");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 52.0f + "'", float26 == 52.0f);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(arrayList36);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(extendedProperties40);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(arrayList50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "}" + "'", str52, "}");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "include" + "'", str56, "include");
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 100 + "'", byte63 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(arrayList70);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(vector81);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 1.0d + "'", double86 == 1.0d);
        org.junit.Assert.assertTrue("'" + short90 + "' != '" + (short) 10 + "'", short90 == (short) 10);
        org.junit.Assert.assertNotNull(list92);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.ArrayList arrayList4 = null;
        extendedProperties3.keysAsListed = arrayList4;
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties7.fileSeparator = "";
        boolean boolean12 = extendedProperties7.getBoolean("/", true);
        java.util.ArrayList arrayList13 = extendedProperties7.keysAsListed;
        java.util.Properties properties15 = null;
        java.util.Properties properties16 = extendedProperties7.getProperties("}", properties15);
        java.util.Properties properties17 = extendedProperties3.getProperties("include", properties16);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties16);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties19.fileSeparator = "";
        boolean boolean24 = extendedProperties19.getBoolean("/", true);
        java.util.ArrayList arrayList25 = extendedProperties19.keysAsListed;
        java.util.Properties properties27 = null;
        java.util.Properties properties28 = extendedProperties19.getProperties("}", properties27);
        double double31 = extendedProperties19.getDouble("include", 100.0d);
        java.lang.Double double34 = extendedProperties19.getDouble("/", (java.lang.Double) (-1.0d));
        extendedProperties18.putAll((java.util.Map) extendedProperties19);
        float float38 = extendedProperties18.getFloat("hi!", (float) '#');
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties40.fileSeparator = "";
        boolean boolean45 = extendedProperties40.getBoolean("/", true);
        java.util.ArrayList arrayList46 = extendedProperties40.keysAsListed;
        java.util.ArrayList arrayList47 = extendedProperties40.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties49.fileSeparator = "";
        boolean boolean54 = extendedProperties49.getBoolean("/", true);
        float float57 = extendedProperties49.getFloat("/", (float) '4');
        java.lang.Double double60 = extendedProperties49.getDouble("include", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties61 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties61.fileSeparator = "";
        boolean boolean66 = extendedProperties61.getBoolean("/", true);
        java.util.ArrayList arrayList67 = extendedProperties61.keysAsListed;
        java.util.Properties properties69 = null;
        java.util.Properties properties70 = extendedProperties61.getProperties("}", properties69);
        org.apache.commons.collections.ExtendedProperties extendedProperties71 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties70);
        org.apache.commons.collections.ExtendedProperties extendedProperties73 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties75 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties75.fileSeparator = "";
        boolean boolean80 = extendedProperties75.getBoolean("/", true);
        java.util.ArrayList arrayList81 = extendedProperties75.keysAsListed;
        java.util.List list82 = extendedProperties73.getList("/", (java.util.List) arrayList81);
        java.lang.String str83 = extendedProperties71.interpolateHelper("}", (java.util.List) arrayList81);
        extendedProperties49.keysAsListed = arrayList81;
        java.util.List list85 = extendedProperties40.getList("", (java.util.List) arrayList81);
        java.util.List list86 = extendedProperties18.getList("hi!", (java.util.List) arrayList81);
        java.lang.String str87 = extendedProperties0.interpolateHelper("/", (java.util.List) arrayList81);
        java.lang.Object obj89 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.addProperty(",", obj89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(arrayList13);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(extendedProperties18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(arrayList25);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 35.0f + "'", float38 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(arrayList46);
        org.junit.Assert.assertNotNull(arrayList47);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 52.0f + "'", float57 == 52.0f);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(arrayList67);
        org.junit.Assert.assertNotNull(properties70);
        org.junit.Assert.assertNotNull(extendedProperties71);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(arrayList81);
        org.junit.Assert.assertNotNull(list82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "}" + "'", str83, "}");
        org.junit.Assert.assertNotNull(list85);
        org.junit.Assert.assertNotNull(list86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "/" + "'", str87, "/");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        java.lang.String str4 = extendedProperties0.testBoolean("}");
        java.lang.String str5 = extendedProperties0.basePath;
        extendedProperties0.setProperty("}", (java.lang.Object) ",");
        java.lang.Double double11 = extendedProperties0.getDouble("include", (java.lang.Double) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            short short13 = extendedProperties0.getShort("}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \",\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Float float3 = extendedProperties0.getFloat("include", (java.lang.Float) 10.0f);
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties4.fileSeparator = "";
        boolean boolean9 = extendedProperties4.getBoolean("/", true);
        java.util.ArrayList arrayList10 = extendedProperties4.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.fileSeparator = "";
        boolean boolean16 = extendedProperties11.getBoolean("/", true);
        java.util.ArrayList arrayList17 = extendedProperties11.keysAsListed;
        java.util.ArrayList arrayList18 = extendedProperties11.keysAsListed;
        extendedProperties4.keysAsListed = arrayList18;
        extendedProperties0.keysAsListed = arrayList18;
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.fileSeparator = "";
        boolean boolean27 = extendedProperties22.getBoolean("/", true);
        java.util.ArrayList arrayList28 = extendedProperties22.keysAsListed;
        java.lang.Long long31 = extendedProperties22.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties22.basePath = "include";
        boolean boolean34 = extendedProperties22.isInitialized();
        java.lang.Integer int37 = extendedProperties22.getInteger(",", (java.lang.Integer) 0);
        java.lang.String[] strArray39 = extendedProperties22.getStringArray("");
        extendedProperties0.setProperty("hi!", (java.lang.Object) strArray39);
        java.util.Vector vector42 = extendedProperties0.getVector(",");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(arrayList17);
        org.junit.Assert.assertNotNull(arrayList18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(arrayList28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(vector42);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader17.mark((int) (byte) 1);
        int int20 = propertiesReader17.read();
        int int21 = propertiesReader17.getLineNumber();
        long long23 = propertiesReader17.skip(1L);
        java.util.stream.Stream<java.lang.String> strStream24 = propertiesReader17.lines();
        propertiesReader17.reset();
        propertiesReader17.mark((int) (byte) 10);
        int int28 = propertiesReader17.read();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader29 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        int int30 = propertiesReader17.read();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(strStream24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.ArrayList arrayList1 = null;
        extendedProperties0.keysAsListed = arrayList1;
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties4.fileSeparator = "";
        boolean boolean9 = extendedProperties4.getBoolean("/", true);
        java.util.ArrayList arrayList10 = extendedProperties4.keysAsListed;
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties4.getProperties("}", properties12);
        java.util.Properties properties14 = extendedProperties0.getProperties("include", properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.fileSeparator = "";
        boolean boolean21 = extendedProperties16.getBoolean("/", true);
        java.util.ArrayList arrayList22 = extendedProperties16.keysAsListed;
        java.util.Properties properties24 = null;
        java.util.Properties properties25 = extendedProperties16.getProperties("}", properties24);
        double double28 = extendedProperties16.getDouble("include", 100.0d);
        java.lang.Double double31 = extendedProperties16.getDouble("/", (java.lang.Double) (-1.0d));
        extendedProperties15.putAll((java.util.Map) extendedProperties16);
        java.lang.Double double35 = extendedProperties16.getDouble("/", (java.lang.Double) 10.0d);
        float float38 = extendedProperties16.getFloat("", (float) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Float float43 = extendedProperties40.getFloat("include", (java.lang.Float) 10.0f);
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties44.fileSeparator = "";
        boolean boolean49 = extendedProperties44.getBoolean("/", true);
        java.util.ArrayList arrayList50 = extendedProperties44.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties51.fileSeparator = "";
        boolean boolean56 = extendedProperties51.getBoolean("/", true);
        java.util.ArrayList arrayList57 = extendedProperties51.keysAsListed;
        java.util.ArrayList arrayList58 = extendedProperties51.keysAsListed;
        extendedProperties44.keysAsListed = arrayList58;
        extendedProperties40.keysAsListed = arrayList58;
        org.apache.commons.collections.ExtendedProperties extendedProperties62 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties62.fileSeparator = "";
        boolean boolean67 = extendedProperties62.getBoolean("/", true);
        java.util.ArrayList arrayList68 = extendedProperties62.keysAsListed;
        java.lang.Long long71 = extendedProperties62.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties62.basePath = "include";
        boolean boolean74 = extendedProperties62.isInitialized();
        java.lang.Integer int77 = extendedProperties62.getInteger(",", (java.lang.Integer) 0);
        java.lang.String[] strArray79 = extendedProperties62.getStringArray("");
        extendedProperties40.setProperty("hi!", (java.lang.Object) strArray79);
        extendedProperties40.clearProperty("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties84 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties84.fileSeparator = "";
        boolean boolean89 = extendedProperties84.getBoolean("/", true);
        java.util.ArrayList arrayList90 = extendedProperties84.keysAsListed;
        java.util.ArrayList arrayList91 = extendedProperties84.keysAsListed;
        java.lang.String str92 = extendedProperties40.interpolateHelper("}", (java.util.List) arrayList91);
        java.util.Vector vector94 = extendedProperties40.getVector("hi!");
        java.util.Vector vector95 = extendedProperties16.getVector("", vector94);
        java.lang.String str96 = extendedProperties16.basePath;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(extendedProperties15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(arrayList22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 100.0f + "'", float38 == 100.0f);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 10.0f + "'", float43 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(arrayList50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(arrayList57);
        org.junit.Assert.assertNotNull(arrayList58);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(arrayList68);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(arrayList90);
        org.junit.Assert.assertNotNull(arrayList91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "}" + "'", str92, "}");
        org.junit.Assert.assertNotNull(vector94);
        org.junit.Assert.assertNotNull(vector95);
        org.junit.Assert.assertNull(str96);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.fileSeparator = "";
        boolean boolean5 = extendedProperties0.getBoolean("/", true);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.Long long9 = extendedProperties0.getLong("hi!", (java.lang.Long) 1L);
        extendedProperties0.basePath = "include";
        boolean boolean12 = extendedProperties0.isInitialized();
        java.lang.Integer int15 = extendedProperties0.getInteger(",", (java.lang.Integer) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.fileSeparator = "";
        java.lang.String str20 = extendedProperties16.testBoolean("}");
        extendedProperties0.putAll((java.util.Map) extendedProperties16);
        java.lang.Integer int24 = extendedProperties16.getInteger("/", (java.lang.Integer) 0);
        float float27 = extendedProperties16.getFloat("/", (float) 100L);
        java.lang.String str29 = extendedProperties16.interpolate("}");
        java.lang.Byte byte32 = extendedProperties16.getByte("/", (java.lang.Byte) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "}" + "'", str29, "}");
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 0 + "'", byte32 == (byte) 0);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader17.setLineNumber((int) (byte) 100);
        int int20 = propertiesReader17.read();
        char[] charArray27 = new char[] { '4', '#', 'a', 'a', 'a', ' ' };
        int int28 = propertiesReader17.read(charArray27);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader29 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        int int30 = propertiesReader29.getLineNumber();
        propertiesReader29.setLineNumber((int) '4');
        boolean boolean33 = propertiesReader29.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', '#', 'a', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int7 = reader0.read(charArray6);
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', 'a', 'a', '#', 'a' };
        int int15 = reader8.read(charArray14);
        int int16 = reader0.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader17.setLineNumber((int) (byte) 100);
        long long21 = propertiesReader17.skip(0L);
        boolean boolean22 = propertiesReader17.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader23 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader17);
        boolean boolean24 = propertiesReader23.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', 'a', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }
}
