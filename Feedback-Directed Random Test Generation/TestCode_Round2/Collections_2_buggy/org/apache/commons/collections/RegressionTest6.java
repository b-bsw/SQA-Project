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
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str3 = propertiesTokenizer1.nextToken(",");
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        boolean boolean5 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str6 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        short short17 = extendedProperties14.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj21 = extendedProperties19.getProperty("");
        java.util.List list23 = extendedProperties19.getList("hi!");
        extendedProperties14.addProperty("", (java.lang.Object) list23);
        java.lang.String str25 = extendedProperties10.interpolateHelper("", list23);
        java.util.List list26 = extendedProperties0.getList("/", list23);
        java.lang.Float float29 = extendedProperties0.getFloat("}", (java.lang.Float) 10.0f);
        java.util.Iterator iterator31 = extendedProperties0.getKeys("/");
        java.io.Reader reader33 = java.io.Reader.nullReader();
        char[] charArray34 = new char[] {};
        int int35 = reader33.read(charArray34);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader36 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader33);
        boolean boolean37 = propertiesReader36.markSupported();
        java.lang.String str38 = propertiesReader36.readLine();
        java.lang.String str39 = propertiesReader36.readProperty();
        boolean boolean40 = propertiesReader36.markSupported();
        java.lang.String str41 = propertiesReader36.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader42 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader36);
        propertiesReader36.mark((int) (byte) 10);
        java.io.Reader reader45 = java.io.Reader.nullReader();
        char[] charArray46 = new char[] {};
        int int47 = reader45.read(charArray46);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader48 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader45);
        char[] charArray55 = new char[] { 'a', ' ', '#', ' ', '#', ' ' };
        int int56 = reader45.read(charArray55);
        int int57 = propertiesReader36.read(charArray55);
        propertiesReader36.setLineNumber(32);
        extendedProperties0.setProperty("/", (java.lang.Object) 32);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(reader33);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(reader45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { 'a', ' ', '#', ' ', '#', ' ' });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        java.util.stream.Stream<java.lang.String> strStream7 = propertiesReader3.lines();
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray9 = new char[] {};
        int int10 = reader8.read(charArray9);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader8);
        boolean boolean12 = propertiesReader11.markSupported();
        java.lang.String str13 = propertiesReader11.readLine();
        java.lang.String str14 = propertiesReader11.readProperty();
        boolean boolean15 = propertiesReader11.markSupported();
        java.lang.String str16 = propertiesReader11.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader11);
        long long19 = propertiesReader17.skip((long) (byte) 100);
        java.io.Reader reader20 = java.io.Reader.nullReader();
        char[] charArray21 = new char[] {};
        int int22 = reader20.read(charArray21);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader23 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader20);
        char[] charArray30 = new char[] { 'a', ' ', '#', ' ', '#', ' ' };
        int int31 = reader20.read(charArray30);
        int int32 = propertiesReader17.read(charArray30);
        java.io.Reader reader33 = java.io.Reader.nullReader();
        char[] charArray34 = new char[] {};
        int int35 = reader33.read(charArray34);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader36 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader33);
        boolean boolean37 = propertiesReader36.markSupported();
        int int38 = propertiesReader36.getLineNumber();
        char[] charArray44 = new char[] { 'a', 'a', '#', '4', 'a' };
        int int45 = propertiesReader36.read(charArray44);
        int int46 = propertiesReader17.read(charArray44);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = propertiesReader3.read(charArray44, (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(reader20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { 'a', ' ', '#', ' ', '#', ' ' });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(reader33);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { 'a', 'a', '#', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        long long11 = propertiesReader3.skip(52L);
        int int12 = propertiesReader3.read();
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] {};
        int int15 = reader13.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader16 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader13);
        propertiesReader16.setLineNumber((int) (short) 10);
        int int19 = propertiesReader16.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader20 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader16);
        propertiesReader20.setLineNumber((int) (short) 1);
        java.lang.String str23 = propertiesReader20.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader24 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader20);
        java.io.Reader reader25 = java.io.Reader.nullReader();
        char[] charArray26 = new char[] {};
        int int27 = reader25.read(charArray26);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader28 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader25);
        propertiesReader28.setLineNumber((int) (short) 10);
        int int31 = propertiesReader28.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader32 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader28);
        propertiesReader32.setLineNumber((int) (short) 1);
        java.lang.String str35 = propertiesReader32.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader36 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader32);
        long long38 = propertiesReader32.skip((long) 1);
        java.io.Reader reader39 = java.io.Reader.nullReader();
        char[] charArray40 = new char[] {};
        int int41 = reader39.read(charArray40);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader42 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader39);
        boolean boolean43 = propertiesReader42.markSupported();
        java.lang.String str44 = propertiesReader42.readLine();
        boolean boolean45 = propertiesReader42.markSupported();
        java.io.Reader reader46 = java.io.Reader.nullReader();
        char[] charArray47 = new char[] {};
        int int48 = reader46.read(charArray47);
        int int49 = propertiesReader42.read(charArray47);
        int int50 = propertiesReader32.read(charArray47);
        int int51 = propertiesReader20.read(charArray47);
        int int52 = propertiesReader3.read(charArray47);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(reader39);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(reader46);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        int int6 = propertiesReader3.read();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        int int6 = propertiesReader3.read();
        java.lang.String str7 = propertiesReader3.readProperty();
        java.lang.String str8 = propertiesReader3.readProperty();
        java.lang.String str9 = propertiesReader3.readProperty();
        propertiesReader3.setLineNumber(10);
        java.io.Reader reader12 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] {};
        int int14 = reader12.read(charArray13);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader15 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader12);
        propertiesReader15.setLineNumber((int) (short) 10);
        int int18 = propertiesReader15.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader19 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader15);
        propertiesReader19.setLineNumber((int) (short) 1);
        java.lang.String str22 = propertiesReader19.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader23 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader19);
        boolean boolean24 = propertiesReader19.markSupported();
        java.io.Reader reader25 = java.io.Reader.nullReader();
        char[] charArray26 = new char[] {};
        int int27 = reader25.read(charArray26);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader28 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader25);
        boolean boolean29 = propertiesReader28.markSupported();
        java.lang.String str30 = propertiesReader28.readLine();
        java.lang.String str31 = propertiesReader28.readProperty();
        java.io.Reader reader32 = java.io.Reader.nullReader();
        char[] charArray33 = new char[] {};
        int int34 = reader32.read(charArray33);
        int int35 = propertiesReader28.read(charArray33);
        int int36 = propertiesReader19.read(charArray33);
        int int37 = propertiesReader3.read(charArray33);
        int int38 = propertiesReader3.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(reader32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        extendedProperties0.basePath = "hi!";
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.util.List list17 = extendedProperties13.getList("hi!");
        extendedProperties13.setInclude("hi!");
        java.util.List list21 = extendedProperties13.getList("hi!");
        java.lang.String str22 = extendedProperties0.interpolateHelper("", list21);
        java.lang.Integer int25 = extendedProperties0.getInteger("", (java.lang.Integer) 52);
        java.lang.String str27 = extendedProperties0.interpolate(",");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "," + "'", str27, ",");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        short short7 = extendedProperties0.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        long long14 = extendedProperties9.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList15 = extendedProperties9.keysAsListed;
        java.util.Vector vector17 = extendedProperties9.getVector("");
        java.util.Vector vector18 = extendedProperties0.getVector("}", vector17);
        extendedProperties0.setInclude("}");
        extendedProperties0.setInclude("/");
        long long25 = extendedProperties0.getLong("", (long) 0);
        boolean boolean28 = extendedProperties0.getBoolean("", false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(vector18);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        java.util.stream.Stream<java.lang.String> strStream7 = propertiesReader3.lines();
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray9 = new char[] {};
        int int10 = reader8.read(charArray9);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader8);
        propertiesReader11.setLineNumber((int) (short) 10);
        int int14 = propertiesReader11.getLineNumber();
        java.io.Reader reader15 = java.io.Reader.nullReader();
        char[] charArray16 = new char[] {};
        int int17 = reader15.read(charArray16);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader18 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader15);
        boolean boolean19 = propertiesReader18.markSupported();
        int int20 = propertiesReader18.getLineNumber();
        int int21 = propertiesReader18.read();
        java.lang.String str22 = propertiesReader18.readProperty();
        java.util.stream.Stream<java.lang.String> strStream23 = propertiesReader18.lines();
        java.io.Reader reader24 = java.io.Reader.nullReader();
        char[] charArray25 = new char[] {};
        int int26 = reader24.read(charArray25);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader27 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader24);
        boolean boolean28 = propertiesReader27.markSupported();
        java.lang.String str29 = propertiesReader27.readLine();
        java.lang.String str30 = propertiesReader27.readProperty();
        java.io.Reader reader31 = java.io.Reader.nullReader();
        char[] charArray32 = new char[] {};
        int int33 = reader31.read(charArray32);
        int int34 = propertiesReader27.read(charArray32);
        int int35 = propertiesReader18.read(charArray32);
        int int36 = propertiesReader11.read(charArray32);
        int int37 = propertiesReader3.read(charArray32);
        boolean boolean38 = propertiesReader3.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strStream23);
        org.junit.Assert.assertNotNull(reader24);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(reader31);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        int int6 = propertiesReader5.getLineNumber();
        boolean boolean7 = propertiesReader5.markSupported();
        long long9 = propertiesReader5.skip((long) (byte) 100);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader10 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader5);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader5);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        extendedProperties0.display();
        java.lang.Double double12 = extendedProperties0.getDouble("", (java.lang.Double) 10.0d);
        java.util.Iterator iterator13 = extendedProperties0.getKeys();
        extendedProperties0.display();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = extendedProperties0.getDouble("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        byte byte11 = extendedProperties0.getByte("}", (byte) 10);
        extendedProperties0.fileSeparator = "}";
        java.lang.String str16 = extendedProperties0.getString("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedProperties0.getInteger("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.basePath = ",";
        java.lang.String[] strArray4 = extendedProperties0.getStringArray("hi!");
        extendedProperties0.display();
        extendedProperties0.fileSeparator = "hi!";
        java.util.List list9 = extendedProperties0.getList("");
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedProperties0.getLong("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        java.lang.String[] strArray10 = extendedProperties0.getStringArray("hi!");
        java.util.Vector vector12 = null;
        java.util.Vector vector13 = extendedProperties0.getVector("/", vector12);
        java.lang.Short short16 = extendedProperties0.getShort("${", (java.lang.Short) (short) 0);
        java.lang.Long long19 = extendedProperties0.getLong("}", (java.lang.Long) 52L);
        java.lang.String str20 = extendedProperties0.getInclude();
        java.lang.String str21 = extendedProperties0.file;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        int int6 = propertiesReader5.getLineNumber();
        boolean boolean7 = propertiesReader5.markSupported();
        boolean boolean8 = propertiesReader5.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader5);
        propertiesReader5.close();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader5.mark((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Read-ahead limit < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        short short17 = extendedProperties14.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj21 = extendedProperties19.getProperty("");
        java.util.List list23 = extendedProperties19.getList("hi!");
        extendedProperties14.addProperty("", (java.lang.Object) list23);
        java.lang.String str25 = extendedProperties10.interpolateHelper("", list23);
        java.util.List list26 = extendedProperties0.getList("/", list23);
        java.lang.Float float29 = extendedProperties0.getFloat("}", (java.lang.Float) 10.0f);
        java.lang.String str31 = extendedProperties0.testBoolean(",");
        java.lang.Object obj33 = extendedProperties0.getProperty("/");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        extendedProperties0.file = "/";
        boolean boolean6 = extendedProperties0.isInitialized;
        java.lang.String str9 = extendedProperties0.getString("${", "");
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("/");
        java.util.Iterator iterator12 = extendedProperties0.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj16 = extendedProperties14.getProperty("");
        java.util.List list18 = extendedProperties14.getList("hi!");
        java.lang.Long long21 = extendedProperties14.getLong("}", (java.lang.Long) (-1L));
        int int24 = extendedProperties14.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj27 = extendedProperties25.getProperty("");
        java.util.List list29 = extendedProperties25.getList("hi!");
        java.lang.String str31 = extendedProperties25.interpolate("");
        java.lang.Short short34 = extendedProperties25.getShort("", (java.lang.Short) (short) -1);
        extendedProperties14.combine(extendedProperties25);
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = extendedProperties14.subset("");
        java.lang.String[] strArray39 = extendedProperties14.getStringArray("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj43 = extendedProperties41.getProperty("");
        java.util.List list45 = extendedProperties41.getList("hi!");
        extendedProperties41.setInclude("hi!");
        java.util.List list49 = extendedProperties41.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj53 = extendedProperties51.getProperty("");
        java.util.List list55 = extendedProperties51.getList("hi!");
        java.lang.String str56 = extendedProperties41.interpolateHelper("}", list55);
        long long59 = extendedProperties41.getLong("", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties61 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj63 = extendedProperties61.getProperty("");
        java.util.List list65 = extendedProperties61.getList("hi!");
        short short68 = extendedProperties61.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties70 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj72 = extendedProperties70.getProperty("");
        long long75 = extendedProperties70.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList76 = extendedProperties70.keysAsListed;
        java.util.Vector vector78 = extendedProperties70.getVector("");
        java.util.Vector vector79 = extendedProperties61.getVector("}", vector78);
        java.lang.String str80 = extendedProperties41.interpolateHelper("", (java.util.List) vector78);
        org.apache.commons.collections.ExtendedProperties extendedProperties82 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj84 = extendedProperties82.getProperty("");
        java.lang.String str85 = extendedProperties82.file;
        java.lang.String str87 = extendedProperties82.testBoolean("hi!");
        java.util.Properties properties89 = extendedProperties82.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties90 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties89);
        java.util.Properties properties91 = extendedProperties41.getProperties(",", properties89);
        java.util.Properties properties92 = extendedProperties14.getProperties("", properties89);
        java.util.Properties properties93 = extendedProperties0.getProperties("}", properties89);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) -1 + "'", short34 == (short) -1);
        org.junit.Assert.assertNull(extendedProperties37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "}" + "'", str56, "}");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) 10 + "'", short68 == (short) 10);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 100L + "'", long75 == 100L);
        org.junit.Assert.assertNotNull(arrayList76);
        org.junit.Assert.assertNotNull(vector78);
        org.junit.Assert.assertNotNull(vector79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertNotNull(properties89);
        org.junit.Assert.assertNotNull(extendedProperties90);
        org.junit.Assert.assertNotNull(properties91);
        org.junit.Assert.assertNotNull(properties92);
        org.junit.Assert.assertNotNull(properties93);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        short short7 = extendedProperties0.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        long long14 = extendedProperties9.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList15 = extendedProperties9.keysAsListed;
        java.util.Vector vector17 = extendedProperties9.getVector("");
        java.util.Vector vector18 = extendedProperties0.getVector("}", vector17);
        boolean boolean19 = extendedProperties0.isInitialized;
        boolean boolean22 = extendedProperties0.getBoolean(",", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = extendedProperties0.subset("${");
        boolean boolean25 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj29 = extendedProperties27.getProperty("");
        java.lang.String str30 = extendedProperties27.file;
        java.lang.String str32 = extendedProperties27.testBoolean("hi!");
        java.util.Properties properties34 = extendedProperties27.getProperties("/");
        java.util.Properties properties35 = extendedProperties0.getProperties("", properties34);
        java.lang.String str36 = extendedProperties0.file;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(vector18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(extendedProperties24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        byte byte12 = extendedProperties0.getByte("}", (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list16 = extendedProperties14.getList("");
        extendedProperties14.setInclude("hi!");
        extendedProperties14.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj24 = extendedProperties22.getProperty("");
        java.util.List list26 = extendedProperties22.getList("hi!");
        short short29 = extendedProperties22.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj33 = extendedProperties31.getProperty("");
        long long36 = extendedProperties31.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList37 = extendedProperties31.keysAsListed;
        java.util.Vector vector39 = extendedProperties31.getVector("");
        java.util.Vector vector40 = extendedProperties22.getVector("}", vector39);
        java.util.Vector vector41 = extendedProperties14.getVector("}", vector40);
        java.util.Vector vector42 = extendedProperties0.getVector("/", vector40);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj45 = extendedProperties43.getProperty("");
        long long48 = extendedProperties43.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList49 = extendedProperties43.keysAsListed;
        extendedProperties0.keysAsListed = arrayList49;
        java.lang.String str52 = extendedProperties0.interpolate("}");
        java.lang.Boolean boolean55 = extendedProperties0.getBoolean(",", (java.lang.Boolean) true);
        extendedProperties0.fileSeparator = ",";
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 10 + "'", short29 == (short) 10);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertNotNull(vector39);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertNotNull(vector42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 100L + "'", long48 == 100L);
        org.junit.Assert.assertNotNull(arrayList49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "}" + "'", str52, "}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        extendedProperties0.clearProperty("");
        java.lang.String str6 = extendedProperties0.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj10 = extendedProperties8.getProperty("");
        java.lang.String str11 = extendedProperties8.file;
        java.lang.String str13 = extendedProperties8.testBoolean("hi!");
        java.util.Properties properties15 = extendedProperties8.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties15);
        extendedProperties16.setProperty("}", (java.lang.Object) "}");
        java.lang.Long long22 = extendedProperties16.getLong("/", (java.lang.Long) 1L);
        byte byte25 = extendedProperties16.getByte("hi!", (byte) 100);
        byte byte28 = extendedProperties16.getByte("/", (byte) -1);
        java.util.Vector vector30 = extendedProperties16.getVector("hi!");
        java.util.List list31 = extendedProperties0.getList(",", (java.util.List) vector30);
        extendedProperties0.fileSeparator = "/";
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 100 + "'", byte25 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) -1 + "'", byte28 == (byte) -1);
        org.junit.Assert.assertNotNull(vector30);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        boolean boolean7 = propertiesReader3.markSupported();
        java.util.stream.Stream<java.lang.String> strStream8 = propertiesReader3.lines();
        propertiesReader3.mark((int) (byte) 0);
        java.lang.String str11 = propertiesReader3.readLine();
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = propertiesReader3.transferTo(writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        java.lang.String str15 = extendedProperties12.file;
        java.lang.String str17 = extendedProperties12.testBoolean("hi!");
        java.util.Properties properties19 = extendedProperties12.getProperties("/");
        java.util.Properties properties20 = extendedProperties0.getProperties("", properties19);
        java.util.Vector vector22 = extendedProperties0.getVector(",");
        java.io.InputStream inputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream23, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(vector22);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.io.OutputStream outputStream2 = null;
        extendedProperties0.save(outputStream2, "hi!");
        extendedProperties0.display();
        java.lang.Integer int8 = extendedProperties0.getInteger("${", (java.lang.Integer) 52);
        java.lang.String str10 = extendedProperties0.testBoolean("}");
        extendedProperties0.file = "${";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        extendedProperties0.file = "";
        boolean boolean6 = extendedProperties0.isInitialized();
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = extendedProperties0.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Byte byte13 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        extendedProperties0.isInitialized = false;
        java.io.OutputStream outputStream16 = null;
        extendedProperties0.save(outputStream16, "hi!");
        java.lang.Double double21 = extendedProperties0.getDouble("}", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = extendedProperties0.subset("hi!");
        short short26 = extendedProperties0.getShort("}", (short) 100);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(extendedProperties23);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 100 + "'", short26 == (short) 100);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties4);
        java.util.Properties properties7 = extendedProperties5.getProperties("/");
        java.util.List list9 = extendedProperties5.getList("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        java.lang.String str18 = extendedProperties11.getString("hi!", "");
        java.lang.String str19 = extendedProperties11.file;
        java.lang.String str21 = extendedProperties11.getString(",");
        extendedProperties5.setProperty(",", (java.lang.Object) extendedProperties11);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(extendedProperties5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        double double9 = extendedProperties0.getDouble("/", (double) 1.0f);
        java.lang.Long long12 = extendedProperties0.getLong("/", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = extendedProperties0.subset("/");
        float float17 = extendedProperties0.getFloat(",", (float) 1L);
        java.lang.String str19 = extendedProperties0.testBoolean("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(extendedProperties14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader7.setLineNumber((int) (short) 1);
        java.lang.String str10 = propertiesReader7.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader7);
        long long13 = propertiesReader11.skip((long) 97);
        propertiesReader11.setLineNumber(32);
        java.lang.String str16 = propertiesReader11.readLine();
        java.io.Reader reader17 = java.io.Reader.nullReader();
        char[] charArray18 = new char[] {};
        int int19 = reader17.read(charArray18);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader20 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader17);
        boolean boolean21 = propertiesReader20.markSupported();
        java.lang.String str22 = propertiesReader20.readLine();
        java.lang.String str23 = propertiesReader20.readProperty();
        boolean boolean24 = propertiesReader20.markSupported();
        propertiesReader20.setLineNumber((int) (short) 0);
        java.io.Reader reader27 = java.io.Reader.nullReader();
        char[] charArray28 = new char[] {};
        int int29 = reader27.read(charArray28);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader30 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader27);
        propertiesReader30.setLineNumber((int) (short) 10);
        int int33 = propertiesReader30.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader34 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader30);
        propertiesReader34.setLineNumber((int) (short) 1);
        java.lang.String str37 = propertiesReader34.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader38 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader34);
        boolean boolean39 = propertiesReader34.markSupported();
        java.io.Reader reader40 = java.io.Reader.nullReader();
        char[] charArray41 = new char[] {};
        int int42 = reader40.read(charArray41);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader43 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader40);
        boolean boolean44 = propertiesReader43.markSupported();
        java.lang.String str45 = propertiesReader43.readLine();
        java.lang.String str46 = propertiesReader43.readProperty();
        java.io.Reader reader47 = java.io.Reader.nullReader();
        char[] charArray48 = new char[] {};
        int int49 = reader47.read(charArray48);
        int int50 = propertiesReader43.read(charArray48);
        int int51 = propertiesReader34.read(charArray48);
        int int52 = propertiesReader20.read(charArray48);
        int int53 = propertiesReader11.read(charArray48);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(reader17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(reader27);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(reader40);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(reader47);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        java.lang.String str15 = extendedProperties12.file;
        java.lang.String str17 = extendedProperties12.testBoolean("hi!");
        java.util.Properties properties19 = extendedProperties12.getProperties("/");
        java.util.Properties properties20 = extendedProperties0.getProperties("", properties19);
        java.util.Vector vector22 = extendedProperties0.getVector(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj26 = extendedProperties24.getProperty("");
        long long29 = extendedProperties24.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList30 = extendedProperties24.keysAsListed;
        java.lang.String str31 = extendedProperties24.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list35 = extendedProperties33.getList("");
        java.lang.String str37 = extendedProperties33.testBoolean("");
        double double40 = extendedProperties33.getDouble("/", (double) 10L);
        java.util.List list42 = extendedProperties33.getList("");
        java.lang.String str43 = extendedProperties24.interpolateHelper("${", list42);
        java.lang.String str44 = extendedProperties0.interpolateHelper("${", list42);
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj48 = extendedProperties46.getProperty("");
        long long51 = extendedProperties46.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList52 = extendedProperties46.keysAsListed;
        java.util.Vector vector54 = extendedProperties46.getVector("");
        java.util.Vector vector56 = extendedProperties46.getVector("${");
        java.util.List list57 = extendedProperties0.getList("hi!", (java.util.List) vector56);
        java.lang.String str58 = extendedProperties0.getInclude();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(vector22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertNotNull(arrayList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "/" + "'", str31, "/");
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "${" + "'", str43, "${");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "${" + "'", str44, "${");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertNotNull(arrayList52);
        org.junit.Assert.assertNotNull(vector54);
        org.junit.Assert.assertNotNull(vector56);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.lang.String str8 = extendedProperties0.testBoolean("");
        java.lang.String str11 = extendedProperties0.getString("hi!", "/");
        extendedProperties0.setInclude("${");
        java.lang.String str15 = extendedProperties0.getString("/");
        java.lang.Class<?> wildcardClass16 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        propertiesReader3.setLineNumber(52);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.lang.String str10 = propertiesReader3.readProperty();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Byte byte13 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list17 = extendedProperties15.getList("");
        extendedProperties15.setInclude("hi!");
        extendedProperties15.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj25 = extendedProperties23.getProperty("");
        java.util.List list27 = extendedProperties23.getList("hi!");
        short short30 = extendedProperties23.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj34 = extendedProperties32.getProperty("");
        long long37 = extendedProperties32.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList38 = extendedProperties32.keysAsListed;
        java.util.Vector vector40 = extendedProperties32.getVector("");
        java.util.Vector vector41 = extendedProperties23.getVector("}", vector40);
        java.util.Vector vector42 = extendedProperties15.getVector("}", vector41);
        java.util.Vector vector43 = extendedProperties0.getVector("/", vector41);
        java.lang.Float float46 = extendedProperties0.getFloat("", (java.lang.Float) 100.0f);
        java.lang.Double double49 = extendedProperties0.getDouble("}", (java.lang.Double) 52.0d);
        java.lang.Integer int52 = extendedProperties0.getInteger("}", (java.lang.Integer) 35);
        extendedProperties0.basePath = "${";
        extendedProperties0.file = "/";
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 10 + "'", short30 == (short) 10);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertNotNull(arrayList38);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertNotNull(vector42);
        org.junit.Assert.assertNotNull(vector43);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 100.0f + "'", float46 == 100.0f);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 52.0d + "'", double49 == 52.0d);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        propertiesReader3.setLineNumber(52);
        int int9 = propertiesReader3.read();
        java.util.stream.Stream<java.lang.String> strStream10 = propertiesReader3.lines();
        java.lang.String str11 = propertiesReader3.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader10 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader9);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader10);
        java.lang.String str12 = propertiesReader10.readLine();
        int int13 = propertiesReader10.getLineNumber();
        java.lang.Class<?> wildcardClass14 = propertiesReader10.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.util.List list9 = extendedProperties0.getList("");
        long long12 = extendedProperties0.getLong("", (long) (short) 100);
        java.lang.String str14 = extendedProperties0.testBoolean("");
        int int17 = extendedProperties0.getInt("}", (int) (short) -1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        int int10 = extendedProperties0.getInteger("/", (int) (short) 100);
        java.util.Vector vector12 = extendedProperties0.getVector("}");
        // The following exception was thrown during execution in test generation
        try {
            short short14 = extendedProperties0.getShort("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(vector12);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        boolean boolean3 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.lang.String str9 = extendedProperties0.getString("");
        int int12 = extendedProperties0.getInteger("", (int) (byte) 10);
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj16 = extendedProperties14.getProperty("");
        java.util.List list18 = extendedProperties14.getList("hi!");
        java.lang.String str20 = extendedProperties14.interpolate("");
        java.lang.Short short23 = extendedProperties14.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str25 = extendedProperties14.interpolate("hi!");
        int int28 = extendedProperties14.getInteger(",", (int) '4');
        java.lang.Object obj30 = extendedProperties14.getProperty("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list33 = extendedProperties31.getList("");
        double double36 = extendedProperties31.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = extendedProperties31.subset("${");
        extendedProperties31.basePath = "${";
        java.util.ArrayList arrayList41 = extendedProperties31.keysAsListed;
        extendedProperties14.keysAsListed = arrayList41;
        java.lang.Integer int45 = extendedProperties14.getInteger("", (java.lang.Integer) (-1));
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj48 = extendedProperties46.getProperty("");
        long long51 = extendedProperties46.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList52 = extendedProperties46.keysAsListed;
        boolean boolean55 = extendedProperties46.getBoolean("", false);
        boolean boolean58 = extendedProperties46.getBoolean("/", true);
        boolean boolean59 = extendedProperties46.isInitialized;
        java.lang.Long long62 = extendedProperties46.getLong("/", (java.lang.Long) 10L);
        java.util.ArrayList arrayList63 = extendedProperties46.keysAsListed;
        extendedProperties14.keysAsListed = arrayList63;
        extendedProperties0.keysAsListed = arrayList63;
        extendedProperties0.fileSeparator = ",";
        java.lang.Byte byte70 = extendedProperties0.getByte(",", (java.lang.Byte) (byte) 10);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -1 + "'", short23 == (short) -1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties38);
        org.junit.Assert.assertNotNull(arrayList41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertNotNull(arrayList52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L + "'", long62 == 10L);
        org.junit.Assert.assertNotNull(arrayList63);
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) 10 + "'", byte70 == (byte) 10);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        int int8 = extendedProperties0.getInteger("", 0);
        java.lang.String str10 = extendedProperties0.testBoolean("}");
        extendedProperties0.display();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader3.mark((int) (byte) 10);
        boolean boolean12 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader13 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(10);
        boolean boolean9 = propertiesReader3.markSupported();
        propertiesReader3.mark((int) (short) 1);
        java.lang.String str12 = propertiesReader3.readProperty();
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] {};
        int int15 = reader13.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader16 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader13);
        propertiesReader16.setLineNumber((int) (short) 10);
        int int19 = propertiesReader16.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader20 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader16);
        propertiesReader20.setLineNumber((int) (short) 1);
        java.lang.String str23 = propertiesReader20.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader24 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader20);
        long long26 = propertiesReader24.skip((long) 97);
        propertiesReader24.setLineNumber(32);
        java.io.Reader reader29 = java.io.Reader.nullReader();
        char[] charArray30 = new char[] {};
        int int31 = reader29.read(charArray30);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader32 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader29);
        boolean boolean33 = propertiesReader32.markSupported();
        propertiesReader32.setLineNumber((-1));
        java.io.Reader reader36 = java.io.Reader.nullReader();
        char[] charArray37 = new char[] {};
        int int38 = reader36.read(charArray37);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader39 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader36);
        boolean boolean40 = propertiesReader39.markSupported();
        java.lang.String str41 = propertiesReader39.readLine();
        java.lang.String str42 = propertiesReader39.readLine();
        java.util.stream.Stream<java.lang.String> strStream43 = propertiesReader39.lines();
        java.io.Reader reader44 = java.io.Reader.nullReader();
        char[] charArray45 = new char[] {};
        int int46 = reader44.read(charArray45);
        int int47 = propertiesReader39.read(charArray45);
        int int48 = propertiesReader32.read(charArray45);
        int int49 = propertiesReader24.read(charArray45);
        int int50 = propertiesReader3.read(charArray45);
        int int51 = propertiesReader3.getLineNumber();
        java.lang.String str52 = propertiesReader3.readLine();
        propertiesReader3.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(reader29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(reader36);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strStream43);
        org.junit.Assert.assertNotNull(reader44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        int int6 = propertiesReader5.getLineNumber();
        boolean boolean7 = propertiesReader5.markSupported();
        long long9 = propertiesReader5.skip((long) (byte) 100);
        propertiesReader5.close();
        boolean boolean11 = propertiesReader5.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader5.mark((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        java.util.stream.Stream<java.lang.String> strStream7 = propertiesReader3.lines();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader8 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.lang.String str9 = propertiesReader3.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        boolean boolean7 = extendedProperties0.isInitialized;
        java.lang.String str9 = extendedProperties0.getString("hi!");
        java.lang.String str11 = extendedProperties0.getString("/");
        java.lang.String str12 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list15 = extendedProperties13.getList("");
        double double18 = extendedProperties13.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties13.subset("${");
        double double23 = extendedProperties13.getDouble("}", (double) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj27 = extendedProperties25.getProperty("");
        java.lang.String str28 = extendedProperties25.file;
        java.lang.String str30 = extendedProperties25.testBoolean("hi!");
        java.util.Properties properties32 = extendedProperties25.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties32);
        extendedProperties33.display();
        int int37 = extendedProperties33.getInteger("${", (int) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj41 = extendedProperties39.getProperty("");
        java.util.List list43 = extendedProperties39.getList("hi!");
        java.lang.String str45 = extendedProperties39.interpolate("");
        java.lang.Short short48 = extendedProperties39.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator49 = extendedProperties39.getKeys();
        java.lang.Byte byte52 = extendedProperties39.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list56 = extendedProperties54.getList("");
        extendedProperties54.setInclude("hi!");
        extendedProperties54.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties62 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj64 = extendedProperties62.getProperty("");
        java.util.List list66 = extendedProperties62.getList("hi!");
        short short69 = extendedProperties62.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties71 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj73 = extendedProperties71.getProperty("");
        long long76 = extendedProperties71.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList77 = extendedProperties71.keysAsListed;
        java.util.Vector vector79 = extendedProperties71.getVector("");
        java.util.Vector vector80 = extendedProperties62.getVector("}", vector79);
        java.util.Vector vector81 = extendedProperties54.getVector("}", vector80);
        java.util.Vector vector82 = extendedProperties39.getVector("/", vector80);
        java.util.List list83 = extendedProperties33.getList("${", (java.util.List) vector82);
        java.util.List list84 = extendedProperties13.getList("", (java.util.List) vector82);
        java.lang.Object obj86 = extendedProperties13.getProperty("");
        extendedProperties13.file = "";
        extendedProperties0.combine(extendedProperties13);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties20);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(extendedProperties33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) -1 + "'", short48 == (short) -1);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 0 + "'", byte52 == (byte) 0);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertTrue("'" + short69 + "' != '" + (short) 10 + "'", short69 == (short) 10);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 100L + "'", long76 == 100L);
        org.junit.Assert.assertNotNull(arrayList77);
        org.junit.Assert.assertNotNull(vector79);
        org.junit.Assert.assertNotNull(vector80);
        org.junit.Assert.assertNotNull(vector81);
        org.junit.Assert.assertNotNull(vector82);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        long long8 = propertiesReader3.skip(0L);
        propertiesReader3.setLineNumber((int) (byte) 100);
        boolean boolean11 = propertiesReader3.markSupported();
        int int12 = propertiesReader3.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        java.lang.String str6 = extendedProperties0.testBoolean("hi!");
        byte byte9 = extendedProperties0.getByte("${", (byte) 100);
        extendedProperties0.setInclude("");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.lang.String str8 = extendedProperties0.testBoolean("");
        java.lang.String str11 = extendedProperties0.getString("hi!", "/");
        java.lang.Object obj13 = extendedProperties0.getProperty("}");
        java.lang.Integer int16 = extendedProperties0.getInteger("", (java.lang.Integer) 52);
        boolean boolean17 = extendedProperties0.isInitialized;
        java.util.ArrayList arrayList18 = extendedProperties0.keysAsListed;
        extendedProperties0.basePath = "/";
        boolean boolean21 = extendedProperties0.isInitialized;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(arrayList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.lang.String str15 = extendedProperties11.interpolate("}");
        java.lang.String str17 = extendedProperties11.interpolate("");
        extendedProperties0.addProperty("/", (java.lang.Object) extendedProperties11);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj22 = extendedProperties20.getProperty("");
        java.lang.String str23 = extendedProperties20.file;
        java.lang.String str25 = extendedProperties20.testBoolean("hi!");
        java.util.Properties properties27 = extendedProperties20.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties27);
        extendedProperties28.display();
        int int32 = extendedProperties28.getInteger("${", (int) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj36 = extendedProperties34.getProperty("");
        java.util.List list38 = extendedProperties34.getList("hi!");
        java.lang.String str40 = extendedProperties34.interpolate("");
        java.lang.Short short43 = extendedProperties34.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator44 = extendedProperties34.getKeys();
        java.lang.Byte byte47 = extendedProperties34.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list51 = extendedProperties49.getList("");
        extendedProperties49.setInclude("hi!");
        extendedProperties49.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties57 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj59 = extendedProperties57.getProperty("");
        java.util.List list61 = extendedProperties57.getList("hi!");
        short short64 = extendedProperties57.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties66 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj68 = extendedProperties66.getProperty("");
        long long71 = extendedProperties66.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList72 = extendedProperties66.keysAsListed;
        java.util.Vector vector74 = extendedProperties66.getVector("");
        java.util.Vector vector75 = extendedProperties57.getVector("}", vector74);
        java.util.Vector vector76 = extendedProperties49.getVector("}", vector75);
        java.util.Vector vector77 = extendedProperties34.getVector("/", vector75);
        java.util.List list78 = extendedProperties28.getList("${", (java.util.List) vector77);
        java.util.Vector vector79 = extendedProperties0.getVector("", vector77);
        extendedProperties0.setInclude("${");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(extendedProperties28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) -1 + "'", short43 == (short) -1);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) 0 + "'", byte47 == (byte) 0);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertTrue("'" + short64 + "' != '" + (short) 10 + "'", short64 == (short) 10);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 100L + "'", long71 == 100L);
        org.junit.Assert.assertNotNull(arrayList72);
        org.junit.Assert.assertNotNull(vector74);
        org.junit.Assert.assertNotNull(vector75);
        org.junit.Assert.assertNotNull(vector76);
        org.junit.Assert.assertNotNull(vector77);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(vector79);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        java.util.Iterator<java.lang.Object> objItor2 = propertiesTokenizer1.asIterator();
        boolean boolean3 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list10 = extendedProperties8.getList("");
        double double13 = extendedProperties8.getDouble("hi!", 100.0d);
        extendedProperties0.setProperty("", (java.lang.Object) 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj17 = extendedProperties15.getProperty("");
        java.lang.String str18 = extendedProperties15.file;
        java.lang.String str20 = extendedProperties15.testBoolean("hi!");
        java.util.Properties properties22 = extendedProperties15.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties22);
        extendedProperties23.display();
        java.util.ArrayList arrayList25 = extendedProperties23.keysAsListed;
        extendedProperties0.keysAsListed = arrayList25;
        extendedProperties0.clearProperty(",");
        java.lang.Float float31 = extendedProperties0.getFloat("hi!", (java.lang.Float) 35.0f);
        extendedProperties0.basePath = "";
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNotNull(extendedProperties23);
        org.junit.Assert.assertNotNull(arrayList25);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 35.0f + "'", float31 == 35.0f);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.lang.String str9 = extendedProperties0.getString("");
        java.lang.String str11 = extendedProperties0.interpolate("}");
        java.lang.Object obj13 = extendedProperties0.getProperty("${");
        java.util.Iterator iterator15 = extendedProperties0.getKeys("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj18 = extendedProperties16.getProperty("");
        long long21 = extendedProperties16.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList22 = extendedProperties16.keysAsListed;
        java.util.Vector vector24 = extendedProperties16.getVector("");
        extendedProperties16.display();
        java.lang.Double double28 = extendedProperties16.getDouble("", (java.lang.Double) 10.0d);
        extendedProperties0.combine(extendedProperties16);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(arrayList22);
        org.junit.Assert.assertNotNull(vector24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader7.setLineNumber((int) (short) 1);
        java.lang.String str10 = propertiesReader7.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader7);
        long long13 = propertiesReader11.skip((long) 97);
        propertiesReader11.setLineNumber(32);
        long long17 = propertiesReader11.skip(0L);
        propertiesReader11.mark((int) (short) 100);
        java.lang.String str20 = propertiesReader11.readLine();
        long long22 = propertiesReader11.skip((long) (byte) 0);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties4);
        java.util.Properties properties7 = extendedProperties5.getProperties("/");
        java.io.OutputStream outputStream8 = null;
        extendedProperties5.save(outputStream8, "hi!");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer13 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        boolean boolean14 = propertiesTokenizer13.hasMoreTokens();
        extendedProperties5.setProperty("hi!", (java.lang.Object) boolean14);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list19 = extendedProperties17.getList("");
        double double22 = extendedProperties17.getDouble("hi!", 100.0d);
        java.lang.Object obj24 = extendedProperties17.getProperty("hi!");
        boolean boolean25 = extendedProperties17.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj28 = extendedProperties26.getProperty("");
        java.util.List list30 = extendedProperties26.getList("hi!");
        extendedProperties26.setInclude("hi!");
        java.util.List list34 = extendedProperties26.getList("hi!");
        java.lang.String str35 = extendedProperties26.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = extendedProperties26.subset("/");
        java.util.ArrayList arrayList38 = extendedProperties26.keysAsListed;
        extendedProperties17.keysAsListed = arrayList38;
        extendedProperties5.addProperty("", (java.lang.Object) arrayList38);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(extendedProperties5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(extendedProperties37);
        org.junit.Assert.assertNotNull(arrayList38);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        long long7 = propertiesReader3.skip(100L);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader8 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.lang.String str9 = propertiesReader8.readLine();
        java.io.Reader reader10 = java.io.Reader.nullReader();
        char[] charArray11 = new char[] {};
        int int12 = reader10.read(charArray11);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader13 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader10);
        boolean boolean14 = propertiesReader13.markSupported();
        java.lang.String str15 = propertiesReader13.readLine();
        java.lang.String str16 = propertiesReader13.readProperty();
        boolean boolean17 = propertiesReader13.markSupported();
        java.lang.String str18 = propertiesReader13.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader19 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader13);
        long long21 = propertiesReader19.skip((long) (byte) 100);
        java.io.Reader reader22 = java.io.Reader.nullReader();
        char[] charArray23 = new char[] {};
        int int24 = reader22.read(charArray23);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader25 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader22);
        char[] charArray32 = new char[] { 'a', ' ', '#', ' ', '#', ' ' };
        int int33 = reader22.read(charArray32);
        int int34 = propertiesReader19.read(charArray32);
        int int37 = propertiesReader8.read(charArray32, 1, 0);
        java.nio.CharBuffer charBuffer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int39 = propertiesReader8.read(charBuffer38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(reader22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', ' ', '#', ' ', '#', ' ' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        java.util.List list14 = extendedProperties10.getList("hi!");
        java.lang.String str15 = extendedProperties0.interpolateHelper("}", list14);
        long long18 = extendedProperties0.getLong("", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj22 = extendedProperties20.getProperty("");
        java.util.List list24 = extendedProperties20.getList("hi!");
        short short27 = extendedProperties20.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj31 = extendedProperties29.getProperty("");
        long long34 = extendedProperties29.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList35 = extendedProperties29.keysAsListed;
        java.util.Vector vector37 = extendedProperties29.getVector("");
        java.util.Vector vector38 = extendedProperties20.getVector("}", vector37);
        java.lang.String str39 = extendedProperties0.interpolateHelper("", (java.util.List) vector37);
        extendedProperties0.isInitialized = true;
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj45 = extendedProperties43.getProperty("");
        java.util.List list47 = extendedProperties43.getList("hi!");
        extendedProperties43.setInclude("hi!");
        java.util.List list51 = extendedProperties43.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties53 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj55 = extendedProperties53.getProperty("");
        java.util.List list57 = extendedProperties53.getList("hi!");
        java.lang.String str58 = extendedProperties43.interpolateHelper("}", list57);
        java.util.Iterator iterator59 = extendedProperties43.getKeys();
        java.lang.Double double62 = extendedProperties43.getDouble("${", (java.lang.Double) 100.0d);
        boolean boolean63 = extendedProperties43.isInitialized();
        java.lang.Boolean boolean66 = extendedProperties43.getBoolean("", (java.lang.Boolean) true);
        java.util.Iterator iterator67 = extendedProperties43.getKeys();
        extendedProperties0.addProperty("", (java.lang.Object) extendedProperties43);
        extendedProperties43.display();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 10 + "'", short27 == (short) 10);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(arrayList35);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(vector38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "}" + "'", str58, "}");
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(iterator67);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        extendedProperties0.file = "/";
        java.util.Iterator iterator7 = extendedProperties0.getKeys("}");
        extendedProperties0.setInclude(",");
        boolean boolean10 = extendedProperties0.isInitialized();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        java.lang.String str17 = extendedProperties11.interpolate("");
        java.lang.Short short20 = extendedProperties11.getShort("", (java.lang.Short) (short) -1);
        extendedProperties0.combine(extendedProperties11);
        long long24 = extendedProperties0.getLong(",", (long) 'a');
        double double27 = extendedProperties0.getDouble("/", (-1.0d));
        extendedProperties0.basePath = ",";
        java.io.OutputStream outputStream30 = null;
        extendedProperties0.save(outputStream30, "${");
        boolean boolean35 = extendedProperties0.getBoolean("}", false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer12 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        java.lang.Object obj13 = propertiesTokenizer12.nextElement();
        java.lang.String str15 = propertiesTokenizer12.nextToken("${");
        java.util.Iterator<java.lang.Object> objItor16 = propertiesTokenizer12.asIterator();
        extendedProperties9.setProperty("/", (java.lang.Object) objItor16);
        java.lang.String str18 = extendedProperties9.getInclude();
        extendedProperties9.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        short short24 = extendedProperties21.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj28 = extendedProperties26.getProperty("");
        java.util.List list30 = extendedProperties26.getList("hi!");
        extendedProperties21.addProperty("", (java.lang.Object) list30);
        java.lang.String str32 = extendedProperties21.getInclude();
        extendedProperties21.isInitialized = true;
        java.util.Iterator iterator35 = extendedProperties21.getKeys();
        java.lang.String str36 = extendedProperties21.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj40 = extendedProperties38.getProperty("");
        java.lang.String str41 = extendedProperties38.file;
        java.lang.String str43 = extendedProperties38.testBoolean("hi!");
        java.util.Properties properties45 = extendedProperties38.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties45);
        extendedProperties46.setProperty("}", (java.lang.Object) "}");
        java.lang.Long long52 = extendedProperties46.getLong("/", (java.lang.Long) 1L);
        java.lang.Long long55 = extendedProperties46.getLong("${", (java.lang.Long) 0L);
        java.util.Vector vector57 = extendedProperties46.getVector("");
        java.util.Vector vector58 = extendedProperties21.getVector("${", vector57);
        java.util.List list59 = extendedProperties9.getList("}", (java.util.List) vector57);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "/" + "'", obj13, "/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "," + "'", str18, ",");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 10 + "'", short24 == (short) 10);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "," + "'", str32, ",");
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "," + "'", str36, ",");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNotNull(extendedProperties46);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(vector57);
        org.junit.Assert.assertNotNull(vector58);
        org.junit.Assert.assertNotNull(list59);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.file = "}";
        java.lang.String str7 = extendedProperties0.getString("}", "hi!");
        java.lang.Double double10 = extendedProperties0.getDouble("hi!", (java.lang.Double) (-1.0d));
        boolean boolean11 = extendedProperties0.isInitialized();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        int int5 = extendedProperties0.getInt("", (int) ' ');
        java.util.Vector vector7 = extendedProperties0.getVector(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj10 = extendedProperties8.getProperty("");
        int int13 = extendedProperties8.getInt("hi!", (int) (short) 1);
        java.lang.Boolean boolean16 = extendedProperties8.getBoolean("}", (java.lang.Boolean) true);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list19 = extendedProperties17.getList("");
        java.lang.String str21 = extendedProperties17.testBoolean("");
        double double24 = extendedProperties17.getDouble("/", (double) 10L);
        java.lang.String str26 = extendedProperties17.getString("");
        int int29 = extendedProperties17.getInteger("", (int) (byte) 10);
        extendedProperties17.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list33 = extendedProperties31.getList("");
        extendedProperties31.setInclude("hi!");
        java.util.Properties properties37 = null;
        java.util.Properties properties38 = extendedProperties31.getProperties("", properties37);
        int int41 = extendedProperties31.getInt("hi!", (int) (short) -1);
        int int44 = extendedProperties31.getInt("${", (int) (short) 0);
        int int47 = extendedProperties31.getInteger("/", 52);
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj50 = extendedProperties48.getProperty("");
        java.lang.String str51 = extendedProperties48.file;
        java.lang.String str53 = extendedProperties48.testBoolean("hi!");
        java.util.Properties properties55 = extendedProperties48.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties55);
        extendedProperties56.setProperty("}", (java.lang.Object) "}");
        java.lang.Long long62 = extendedProperties56.getLong("/", (java.lang.Long) 1L);
        boolean boolean65 = extendedProperties56.getBoolean("", true);
        java.util.ArrayList arrayList66 = extendedProperties56.keysAsListed;
        extendedProperties31.keysAsListed = arrayList66;
        extendedProperties17.keysAsListed = arrayList66;
        extendedProperties8.keysAsListed = arrayList66;
        extendedProperties0.keysAsListed = arrayList66;
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(vector7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNotNull(extendedProperties56);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(arrayList66);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        long long3 = extendedProperties0.getLong("hi!", (long) 1);
        long long6 = extendedProperties0.getLong("/", (long) '4');
        short short9 = extendedProperties0.getShort("/", (short) -1);
        byte byte12 = extendedProperties0.getByte("", (byte) 10);
        extendedProperties0.addProperty(",", (java.lang.Object) 1);
        extendedProperties0.clearProperty("/");
        // The following exception was thrown during execution in test generation
        try {
            byte byte19 = extendedProperties0.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        java.util.Iterator<java.lang.Object> objItor2 = propertiesTokenizer1.asIterator();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str5 = propertiesTokenizer1.nextToken("");
        boolean boolean6 = propertiesTokenizer1.hasMoreElements();
        int int7 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/" + "'", str5, "/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str5 = extendedProperties0.file;
        extendedProperties0.isInitialized = false;
        java.lang.String str8 = extendedProperties0.file;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedProperties0.getInteger("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Long long14 = extendedProperties8.getLong("/", (java.lang.Long) 1L);
        java.lang.String str16 = extendedProperties8.getString("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        extendedProperties0.clearProperty("");
        java.lang.String str8 = extendedProperties0.getString("}", "");
        java.util.Properties properties10 = extendedProperties0.getProperties("/");
        extendedProperties0.setInclude(",");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        double double7 = extendedProperties0.getDouble("", 0.0d);
        short short10 = extendedProperties0.getShort("${", (short) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float12 = extendedProperties0.getFloat("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.util.List list9 = extendedProperties0.getList("");
        long long12 = extendedProperties0.getLong("", (long) (short) 100);
        java.lang.String str14 = extendedProperties0.testBoolean("");
        java.util.Iterator iterator16 = extendedProperties0.getKeys("/");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        java.lang.Object obj9 = extendedProperties0.getProperty("${");
        java.lang.String str10 = extendedProperties0.file;
        float float13 = extendedProperties0.getFloat("", (float) 100L);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj16 = extendedProperties14.getProperty("");
        java.util.List list18 = extendedProperties14.getList("hi!");
        java.lang.Long long21 = extendedProperties14.getLong("}", (java.lang.Long) (-1L));
        int int24 = extendedProperties14.getInt("${", (int) (byte) 100);
        extendedProperties14.isInitialized = false;
        java.util.Vector vector28 = extendedProperties14.getVector("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj32 = extendedProperties30.getProperty("");
        java.util.List list34 = extendedProperties30.getList("hi!");
        java.lang.String str36 = extendedProperties30.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj40 = extendedProperties38.getProperty("");
        java.util.List list42 = extendedProperties38.getList("hi!");
        java.lang.Long long45 = extendedProperties38.getLong("}", (java.lang.Long) (-1L));
        int int48 = extendedProperties38.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj51 = extendedProperties49.getProperty("");
        java.util.List list53 = extendedProperties49.getList("hi!");
        java.lang.String str55 = extendedProperties49.interpolate("");
        java.lang.Short short58 = extendedProperties49.getShort("", (java.lang.Short) (short) -1);
        extendedProperties38.combine(extendedProperties49);
        org.apache.commons.collections.ExtendedProperties extendedProperties61 = extendedProperties38.subset("");
        java.lang.String[] strArray63 = extendedProperties38.getStringArray("}");
        java.util.Vector vector65 = extendedProperties38.getVector("}");
        java.util.Vector vector66 = extendedProperties30.getVector(",", vector65);
        java.util.Vector vector67 = extendedProperties14.getVector("hi!", vector66);
        org.apache.commons.collections.ExtendedProperties extendedProperties69 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj71 = extendedProperties69.getProperty("");
        java.util.List list73 = extendedProperties69.getList("hi!");
        java.lang.Long long76 = extendedProperties69.getLong("}", (java.lang.Long) (-1L));
        short short79 = extendedProperties69.getShort("", (short) -1);
        extendedProperties69.setInclude("/");
        java.util.ArrayList arrayList82 = extendedProperties69.keysAsListed;
        java.util.List list83 = extendedProperties14.getList("}", (java.util.List) arrayList82);
        extendedProperties0.keysAsListed = arrayList82;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(vector28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) -1 + "'", short58 == (short) -1);
        org.junit.Assert.assertNull(extendedProperties61);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(vector65);
        org.junit.Assert.assertNotNull(vector66);
        org.junit.Assert.assertNotNull(vector67);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L) + "'", long76 == (-1L));
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) -1 + "'", short79 == (short) -1);
        org.junit.Assert.assertNotNull(arrayList82);
        org.junit.Assert.assertNotNull(list83);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.lang.String str5 = extendedProperties0.getInclude();
        java.lang.Double double8 = extendedProperties0.getDouble("hi!", (java.lang.Double) 100.0d);
        java.lang.Long long11 = extendedProperties0.getLong("}", (java.lang.Long) 97L);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        long long18 = extendedProperties13.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList19 = extendedProperties13.keysAsListed;
        java.util.Vector vector21 = extendedProperties13.getVector("");
        java.util.Vector vector22 = extendedProperties0.getVector("", vector21);
        java.io.OutputStream outputStream23 = null;
        extendedProperties0.save(outputStream23, "");
        java.lang.String[] strArray27 = extendedProperties0.getStringArray("${");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(arrayList19);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertNotNull(vector22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        boolean boolean6 = propertiesReader3.markSupported();
        int int7 = propertiesReader3.getLineNumber();
        propertiesReader3.close();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = propertiesReader3.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.Object obj7 = extendedProperties0.getProperty("hi!");
        boolean boolean8 = extendedProperties0.isInitialized();
        java.lang.Object obj10 = extendedProperties0.getProperty("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        long long17 = extendedProperties12.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList18 = extendedProperties12.keysAsListed;
        java.lang.String str19 = extendedProperties12.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list23 = extendedProperties21.getList("");
        java.lang.String str25 = extendedProperties21.testBoolean("");
        double double28 = extendedProperties21.getDouble("/", (double) 10L);
        java.util.List list30 = extendedProperties21.getList("");
        java.lang.String str31 = extendedProperties12.interpolateHelper("${", list30);
        java.util.Iterator iterator32 = extendedProperties12.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj35 = extendedProperties33.getProperty("");
        long long38 = extendedProperties33.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList39 = extendedProperties33.keysAsListed;
        java.util.Vector vector41 = extendedProperties33.getVector("");
        extendedProperties33.display();
        java.lang.Double double45 = extendedProperties33.getDouble("", (java.lang.Double) 10.0d);
        java.lang.Boolean boolean48 = extendedProperties33.getBoolean("${", (java.lang.Boolean) false);
        extendedProperties12.combine(extendedProperties33);
        java.lang.Short short52 = extendedProperties33.getShort("/", (java.lang.Short) (short) 10);
        java.util.Properties properties54 = extendedProperties33.getProperties("${");
        java.util.Properties properties55 = extendedProperties0.getProperties("", properties54);
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties54);
        org.apache.commons.collections.ExtendedProperties extendedProperties57 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties54);
        java.lang.String str59 = extendedProperties57.testBoolean(",");
        extendedProperties57.display();
        byte byte63 = extendedProperties57.getByte(",", (byte) 1);
        extendedProperties57.isInitialized = true;
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(arrayList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/" + "'", str19, "/");
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "${" + "'", str31, "${");
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(arrayList39);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 10 + "'", short52 == (short) 10);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNotNull(extendedProperties56);
        org.junit.Assert.assertNotNull(extendedProperties57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 1 + "'", byte63 == (byte) 1);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("");
        long long8 = extendedProperties0.getLong("/", (long) (short) 0);
        float float11 = extendedProperties0.getFloat("/", 10.0f);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list15 = extendedProperties13.getList("");
        extendedProperties13.setInclude("hi!");
        java.lang.String str18 = extendedProperties13.getInclude();
        java.lang.Double double21 = extendedProperties13.getDouble("hi!", (java.lang.Double) 100.0d);
        java.lang.Long long24 = extendedProperties13.getLong("}", (java.lang.Long) 97L);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj28 = extendedProperties26.getProperty("");
        java.util.List list30 = extendedProperties26.getList("hi!");
        java.lang.String str32 = extendedProperties26.interpolate("");
        java.lang.Short short35 = extendedProperties26.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator36 = extendedProperties26.getKeys();
        java.lang.Byte byte39 = extendedProperties26.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list43 = extendedProperties41.getList("");
        extendedProperties41.setInclude("hi!");
        extendedProperties41.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj51 = extendedProperties49.getProperty("");
        java.util.List list53 = extendedProperties49.getList("hi!");
        short short56 = extendedProperties49.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj60 = extendedProperties58.getProperty("");
        long long63 = extendedProperties58.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList64 = extendedProperties58.keysAsListed;
        java.util.Vector vector66 = extendedProperties58.getVector("");
        java.util.Vector vector67 = extendedProperties49.getVector("}", vector66);
        java.util.Vector vector68 = extendedProperties41.getVector("}", vector67);
        java.util.Vector vector69 = extendedProperties26.getVector("/", vector67);
        java.util.List list70 = extendedProperties13.getList("hi!", (java.util.List) vector69);
        java.lang.String str71 = extendedProperties0.interpolateHelper("hi!", (java.util.List) vector69);
        java.lang.String str73 = extendedProperties0.testBoolean("/");
        byte byte76 = extendedProperties0.getByte("/", (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties78 = extendedProperties0.subset("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray80 = extendedProperties78.getStringArray(",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) -1 + "'", short35 == (short) -1);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 10 + "'", short56 == (short) 10);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 100L + "'", long63 == 100L);
        org.junit.Assert.assertNotNull(arrayList64);
        org.junit.Assert.assertNotNull(vector66);
        org.junit.Assert.assertNotNull(vector67);
        org.junit.Assert.assertNotNull(vector68);
        org.junit.Assert.assertNotNull(vector69);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) -1 + "'", byte76 == (byte) -1);
        org.junit.Assert.assertNull(extendedProperties78);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.lang.String str5 = extendedProperties0.getInclude();
        java.lang.Double double8 = extendedProperties0.getDouble("hi!", (java.lang.Double) 100.0d);
        java.lang.String str10 = extendedProperties0.testBoolean(",");
        int int13 = extendedProperties0.getInt("hi!", 0);
        java.lang.String str14 = extendedProperties0.file;
        java.util.Iterator iterator15 = extendedProperties0.getKeys();
        extendedProperties0.basePath = ",";
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        int int6 = propertiesReader3.read();
        java.lang.String str7 = propertiesReader3.readProperty();
        java.util.stream.Stream<java.lang.String> strStream8 = propertiesReader3.lines();
        java.lang.String str9 = propertiesReader3.readLine();
        int int10 = propertiesReader3.read();
        boolean boolean11 = propertiesReader3.markSupported();
        propertiesReader3.mark((int) (short) 100);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        short short10 = extendedProperties0.getShort("", (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        short short14 = extendedProperties11.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = extendedProperties11.subset("");
        long long19 = extendedProperties11.getLong("/", (long) (short) 0);
        extendedProperties0.combine(extendedProperties11);
        int int23 = extendedProperties11.getInteger(",", 52);
        float float26 = extendedProperties11.getFloat("", (float) 0L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        java.util.List list14 = extendedProperties10.getList("hi!");
        java.lang.String str15 = extendedProperties0.interpolateHelper("}", list14);
        long long18 = extendedProperties0.getLong("", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj22 = extendedProperties20.getProperty("");
        java.util.List list24 = extendedProperties20.getList("hi!");
        short short27 = extendedProperties20.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj31 = extendedProperties29.getProperty("");
        long long34 = extendedProperties29.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList35 = extendedProperties29.keysAsListed;
        java.util.Vector vector37 = extendedProperties29.getVector("");
        java.util.Vector vector38 = extendedProperties20.getVector("}", vector37);
        java.lang.String str39 = extendedProperties0.interpolateHelper("", (java.util.List) vector37);
        extendedProperties0.isInitialized = true;
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj45 = extendedProperties43.getProperty("");
        java.util.List list47 = extendedProperties43.getList("hi!");
        extendedProperties43.setInclude("hi!");
        java.util.List list51 = extendedProperties43.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties53 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj55 = extendedProperties53.getProperty("");
        java.util.List list57 = extendedProperties53.getList("hi!");
        java.lang.String str58 = extendedProperties43.interpolateHelper("}", list57);
        java.util.Iterator iterator59 = extendedProperties43.getKeys();
        java.lang.Double double62 = extendedProperties43.getDouble("${", (java.lang.Double) 100.0d);
        boolean boolean63 = extendedProperties43.isInitialized();
        java.lang.Boolean boolean66 = extendedProperties43.getBoolean("", (java.lang.Boolean) true);
        java.util.Iterator iterator67 = extendedProperties43.getKeys();
        extendedProperties0.addProperty("", (java.lang.Object) extendedProperties43);
        java.io.OutputStream outputStream69 = null;
        extendedProperties43.save(outputStream69, "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 10 + "'", short27 == (short) 10);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(arrayList35);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(vector38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "}" + "'", str58, "}");
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(iterator67);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        java.io.OutputStream outputStream9 = null;
        extendedProperties0.save(outputStream9, "${");
        java.lang.String str12 = extendedProperties0.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list16 = extendedProperties14.getList("");
        extendedProperties14.setInclude("hi!");
        java.util.Properties properties20 = null;
        java.util.Properties properties21 = extendedProperties14.getProperties("", properties20);
        java.util.Properties properties22 = extendedProperties0.getProperties("${", properties21);
        extendedProperties0.basePath = "${";
        java.lang.String str25 = extendedProperties0.getInclude();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        boolean boolean5 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str7 = propertiesTokenizer1.nextToken("}");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj10 = extendedProperties8.getProperty("");
        java.util.List list12 = extendedProperties8.getList("hi!");
        java.lang.Long long15 = extendedProperties8.getLong("}", (java.lang.Long) (-1L));
        int int18 = extendedProperties8.getInt("${", (int) (byte) 100);
        extendedProperties8.isInitialized = false;
        extendedProperties0.combine(extendedProperties8);
        java.util.Vector vector23 = extendedProperties8.getVector(",");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = extendedProperties8.getBoolean("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(vector23);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader3.mark((int) (byte) 10);
        long long13 = propertiesReader3.skip(1L);
        java.util.stream.Stream<java.lang.String> strStream14 = propertiesReader3.lines();
        propertiesReader3.reset();
        int int16 = propertiesReader3.read();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        java.lang.String str11 = extendedProperties0.file;
        java.lang.Long long14 = extendedProperties0.getLong("/", (java.lang.Long) 1L);
        java.lang.Double double17 = extendedProperties0.getDouble("${", (java.lang.Double) 0.0d);
        boolean boolean20 = extendedProperties0.getBoolean("/", false);
        java.lang.String[] strArray22 = extendedProperties0.getStringArray("${");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        java.util.Iterator<java.lang.Object> objItor5 = propertiesTokenizer1.asIterator();
        java.lang.String str6 = propertiesTokenizer1.nextToken();
        java.lang.String str8 = propertiesTokenizer1.nextToken("");
        boolean boolean9 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str11 = propertiesTokenizer1.nextToken(",");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "}" + "'", obj2, "}");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        java.lang.String str3 = propertiesTokenizer1.nextToken("${");
        java.lang.String str5 = propertiesTokenizer1.nextToken("");
        java.lang.String str7 = propertiesTokenizer1.nextToken("${");
        boolean boolean8 = propertiesTokenizer1.hasMoreElements();
        int int9 = propertiesTokenizer1.countTokens();
        java.lang.String str10 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        extendedProperties0.isInitialized = true;
        java.lang.Long long16 = extendedProperties0.getLong("hi!", (java.lang.Long) (-1L));
        java.lang.String str17 = extendedProperties0.basePath;
        extendedProperties0.clearProperty("}");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        boolean boolean13 = extendedProperties0.isInitialized;
        java.lang.Long long16 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.util.ArrayList arrayList17 = extendedProperties0.keysAsListed;
        java.lang.String str18 = extendedProperties0.getInclude();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(arrayList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.lang.String str9 = extendedProperties0.getString("");
        java.lang.String str11 = extendedProperties0.interpolate("}");
        java.lang.String str12 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean15 = extendedProperties0.getBoolean("", (java.lang.Boolean) false);
        java.lang.Boolean boolean18 = extendedProperties0.getBoolean("}", (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Object obj13 = extendedProperties8.getProperty("hi!");
        int int16 = extendedProperties8.getInt("", (int) (short) 0);
        java.io.OutputStream outputStream17 = null;
        extendedProperties8.save(outputStream17, "");
        // The following exception was thrown during execution in test generation
        try {
            byte byte21 = extendedProperties8.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.lang.String str8 = extendedProperties0.testBoolean("");
        java.lang.Double double11 = extendedProperties0.getDouble("/", (java.lang.Double) (-1.0d));
        boolean boolean12 = extendedProperties0.isInitialized;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        byte byte9 = extendedProperties0.getByte("", (byte) 10);
        java.lang.String str10 = extendedProperties0.file;
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.lang.String str9 = extendedProperties0.getString("");
        int int12 = extendedProperties0.getInteger("", (int) (byte) 10);
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj16 = extendedProperties14.getProperty("");
        java.util.List list18 = extendedProperties14.getList("hi!");
        java.lang.String str20 = extendedProperties14.interpolate("");
        java.lang.Short short23 = extendedProperties14.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str25 = extendedProperties14.interpolate("hi!");
        int int28 = extendedProperties14.getInteger(",", (int) '4');
        java.lang.Object obj30 = extendedProperties14.getProperty("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list33 = extendedProperties31.getList("");
        double double36 = extendedProperties31.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = extendedProperties31.subset("${");
        extendedProperties31.basePath = "${";
        java.util.ArrayList arrayList41 = extendedProperties31.keysAsListed;
        extendedProperties14.keysAsListed = arrayList41;
        java.lang.Integer int45 = extendedProperties14.getInteger("", (java.lang.Integer) (-1));
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj48 = extendedProperties46.getProperty("");
        long long51 = extendedProperties46.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList52 = extendedProperties46.keysAsListed;
        boolean boolean55 = extendedProperties46.getBoolean("", false);
        boolean boolean58 = extendedProperties46.getBoolean("/", true);
        boolean boolean59 = extendedProperties46.isInitialized;
        java.lang.Long long62 = extendedProperties46.getLong("/", (java.lang.Long) 10L);
        java.util.ArrayList arrayList63 = extendedProperties46.keysAsListed;
        extendedProperties14.keysAsListed = arrayList63;
        extendedProperties0.keysAsListed = arrayList63;
        extendedProperties0.fileSeparator = ",";
        java.util.List list69 = extendedProperties0.getList("}");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -1 + "'", short23 == (short) -1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties38);
        org.junit.Assert.assertNotNull(arrayList41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertNotNull(arrayList52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L + "'", long62 == 10L);
        org.junit.Assert.assertNotNull(arrayList63);
        org.junit.Assert.assertNotNull(list69);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        short short17 = extendedProperties14.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj21 = extendedProperties19.getProperty("");
        java.util.List list23 = extendedProperties19.getList("hi!");
        extendedProperties14.addProperty("", (java.lang.Object) list23);
        java.lang.String str25 = extendedProperties10.interpolateHelper("", list23);
        java.util.List list26 = extendedProperties0.getList("/", list23);
        extendedProperties0.fileSeparator = "${";
        int int31 = extendedProperties0.getInteger("hi!", 100);
        extendedProperties0.basePath = "}";
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj37 = extendedProperties35.getProperty("");
        int int40 = extendedProperties35.getInt("hi!", (int) (short) 1);
        java.lang.Boolean boolean43 = extendedProperties35.getBoolean("}", (java.lang.Boolean) true);
        extendedProperties0.setProperty("", (java.lang.Object) extendedProperties35);
        java.lang.Long long47 = extendedProperties35.getLong(",", (java.lang.Long) 97L);
        int int50 = extendedProperties35.getInt("/", (int) (byte) 1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 97L + "'", long47 == 97L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str3 = propertiesTokenizer1.nextToken(",");
        int int4 = propertiesTokenizer1.countTokens();
        int int5 = propertiesTokenizer1.countTokens();
        java.lang.Object obj6 = propertiesTokenizer1.nextElement();
        java.lang.Object obj7 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader5.setLineNumber((int) (short) 10);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        boolean boolean4 = propertiesTokenizer1.hasMoreElements();
        int int5 = propertiesTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor6 = propertiesTokenizer1.asIterator();
        boolean boolean7 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "}" + "'", obj2, "}");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties4);
        java.util.Iterator iterator7 = extendedProperties5.getKeys(",");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(extendedProperties5);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.lang.String str8 = extendedProperties0.testBoolean("");
        java.util.Iterator iterator9 = extendedProperties0.getKeys();
        long long12 = extendedProperties0.getLong(",", 10L);
        extendedProperties0.basePath = "";
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        java.lang.String[] strArray10 = extendedProperties0.getStringArray("hi!");
        java.util.Vector vector12 = null;
        java.util.Vector vector13 = extendedProperties0.getVector("/", vector12);
        java.lang.String str16 = extendedProperties0.getString("/", "${");
        extendedProperties0.display();
        long long20 = extendedProperties0.getLong(",", 52L);
        extendedProperties0.clearProperty("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = extendedProperties0.subset("/");
        // The following exception was thrown during execution in test generation
        try {
            byte byte26 = extendedProperties24.getByte("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "${" + "'", str16, "${");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertNull(extendedProperties24);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        long long3 = extendedProperties0.getLong("hi!", (long) 1);
        long long6 = extendedProperties0.getLong("/", (long) '4');
        short short9 = extendedProperties0.getShort("/", (short) -1);
        java.lang.String str10 = extendedProperties0.fileSeparator;
        java.lang.String str12 = extendedProperties0.getString(",");
        extendedProperties0.setInclude("/");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        long long8 = propertiesReader3.skip(0L);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        boolean boolean10 = propertiesReader9.markSupported();
        java.io.Reader reader11 = java.io.Reader.nullReader();
        char[] charArray12 = new char[] {};
        int int13 = reader11.read(charArray12);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader14 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader11);
        propertiesReader14.setLineNumber((int) (short) 10);
        int int17 = propertiesReader14.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader18 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader14);
        int int19 = propertiesReader14.read();
        java.lang.String str20 = propertiesReader14.readProperty();
        java.io.Reader reader21 = java.io.Reader.nullReader();
        char[] charArray22 = new char[] {};
        int int23 = reader21.read(charArray22);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader24 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader21);
        boolean boolean25 = propertiesReader24.markSupported();
        propertiesReader24.setLineNumber((-1));
        java.io.Reader reader28 = java.io.Reader.nullReader();
        char[] charArray29 = new char[] {};
        int int30 = reader28.read(charArray29);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader31 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader28);
        boolean boolean32 = propertiesReader31.markSupported();
        java.lang.String str33 = propertiesReader31.readLine();
        java.lang.String str34 = propertiesReader31.readLine();
        java.util.stream.Stream<java.lang.String> strStream35 = propertiesReader31.lines();
        java.io.Reader reader36 = java.io.Reader.nullReader();
        char[] charArray37 = new char[] {};
        int int38 = reader36.read(charArray37);
        int int39 = propertiesReader31.read(charArray37);
        int int40 = propertiesReader24.read(charArray37);
        java.util.stream.Stream<java.lang.String> strStream41 = propertiesReader24.lines();
        int int42 = propertiesReader24.getLineNumber();
        boolean boolean43 = propertiesReader24.markSupported();
        java.io.Reader reader44 = java.io.Reader.nullReader();
        char[] charArray45 = new char[] {};
        int int46 = reader44.read(charArray45);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader47 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader44);
        boolean boolean48 = propertiesReader47.markSupported();
        java.lang.String str49 = propertiesReader47.readLine();
        boolean boolean50 = propertiesReader47.markSupported();
        java.io.Reader reader51 = java.io.Reader.nullReader();
        char[] charArray52 = new char[] {};
        int int53 = reader51.read(charArray52);
        int int54 = propertiesReader47.read(charArray52);
        int int55 = propertiesReader24.read(charArray52);
        int int56 = propertiesReader14.read(charArray52);
        int int57 = propertiesReader9.read(charArray52);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(reader21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(reader28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strStream35);
        org.junit.Assert.assertNotNull(reader36);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(strStream41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(reader44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(reader51);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] {});
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.util.stream.Stream<java.lang.String> strStream8 = propertiesReader7.lines();
        propertiesReader7.mark(35);
        propertiesReader7.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(strStream8);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader7.setLineNumber((int) (short) 1);
        java.lang.String str10 = propertiesReader7.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader7);
        long long13 = propertiesReader11.skip((long) 97);
        propertiesReader11.setLineNumber(32);
        java.lang.String str16 = propertiesReader11.readLine();
        propertiesReader11.setLineNumber(10);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        int int11 = extendedProperties8.getInteger("", 32);
        short short14 = extendedProperties8.getShort("hi!", (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list18 = extendedProperties16.getList("");
        java.util.Properties properties20 = extendedProperties16.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties20);
        java.util.Properties properties23 = extendedProperties21.getProperties("/");
        java.util.Properties properties25 = extendedProperties21.getProperties("/");
        java.util.Properties properties26 = extendedProperties8.getProperties("hi!", properties25);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list30 = extendedProperties28.getList("");
        java.util.Properties properties32 = extendedProperties28.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties32);
        java.util.Properties properties35 = extendedProperties33.getProperties("/");
        java.util.List list37 = extendedProperties33.getList("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list41 = extendedProperties39.getList("");
        double double44 = extendedProperties39.getDouble("hi!", 100.0d);
        java.lang.String str45 = extendedProperties39.basePath;
        java.lang.String str46 = extendedProperties39.fileSeparator;
        java.lang.Boolean boolean49 = extendedProperties39.getBoolean("", (java.lang.Boolean) true);
        java.lang.String str50 = extendedProperties39.fileSeparator;
        java.util.Vector vector52 = extendedProperties39.getVector("}");
        java.util.Vector vector53 = extendedProperties33.getVector("hi!", vector52);
        java.util.Vector vector54 = extendedProperties8.getVector("", vector53);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = extendedProperties8.getBoolean("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(extendedProperties21);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(extendedProperties33);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "/" + "'", str46, "/");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "/" + "'", str50, "/");
        org.junit.Assert.assertNotNull(vector52);
        org.junit.Assert.assertNotNull(vector53);
        org.junit.Assert.assertNotNull(vector54);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(10);
        propertiesReader3.close();
        java.util.stream.Stream<java.lang.String> strStream10 = propertiesReader3.lines();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertNotNull(strStream10);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.display();
        int int12 = extendedProperties8.getInteger("${", (int) (byte) 10);
        java.util.Properties properties14 = extendedProperties8.getProperties(",");
        java.util.Iterator iterator15 = extendedProperties8.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj18 = extendedProperties16.getProperty("");
        long long21 = extendedProperties16.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList22 = extendedProperties16.keysAsListed;
        java.util.Vector vector24 = extendedProperties16.getVector("");
        extendedProperties16.display();
        java.lang.Double double28 = extendedProperties16.getDouble("", (java.lang.Double) 10.0d);
        java.lang.Boolean boolean31 = extendedProperties16.getBoolean("${", (java.lang.Boolean) false);
        long long34 = extendedProperties16.getLong("${", (long) 'a');
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj37 = extendedProperties35.getProperty("");
        long long40 = extendedProperties35.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList41 = extendedProperties35.keysAsListed;
        boolean boolean44 = extendedProperties35.getBoolean("", false);
        byte byte47 = extendedProperties35.getByte("}", (byte) 0);
        extendedProperties35.setInclude("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj52 = extendedProperties50.getProperty("");
        java.util.List list54 = extendedProperties50.getList("hi!");
        extendedProperties50.setInclude("hi!");
        java.util.List list58 = extendedProperties50.getList("hi!");
        java.lang.String str59 = extendedProperties50.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties61 = extendedProperties50.subset("/");
        java.util.ArrayList arrayList62 = extendedProperties50.keysAsListed;
        extendedProperties35.keysAsListed = arrayList62;
        extendedProperties16.keysAsListed = arrayList62;
        extendedProperties8.keysAsListed = arrayList62;
        java.util.ArrayList arrayList66 = extendedProperties8.keysAsListed;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(arrayList22);
        org.junit.Assert.assertNotNull(vector24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertNotNull(arrayList41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) 0 + "'", byte47 == (byte) 0);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNull(extendedProperties61);
        org.junit.Assert.assertNotNull(arrayList62);
        org.junit.Assert.assertNotNull(arrayList66);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str8 = extendedProperties0.getString("${", "}");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        short short12 = extendedProperties9.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list16 = extendedProperties14.getList("");
        extendedProperties14.setInclude("hi!");
        java.util.Properties properties20 = null;
        java.util.Properties properties21 = extendedProperties14.getProperties("", properties20);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj25 = extendedProperties23.getProperty("");
        java.util.List list27 = extendedProperties23.getList("hi!");
        extendedProperties23.setInclude("hi!");
        java.util.List list31 = extendedProperties23.getList("hi!");
        java.lang.String str32 = extendedProperties23.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = extendedProperties23.subset("/");
        java.util.ArrayList arrayList35 = extendedProperties23.keysAsListed;
        java.util.List list36 = extendedProperties14.getList("", (java.util.List) arrayList35);
        java.lang.String str37 = extendedProperties9.interpolateHelper("/", list36);
        java.io.OutputStream outputStream38 = null;
        extendedProperties9.save(outputStream38, "");
        extendedProperties0.combine(extendedProperties9);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        short short46 = extendedProperties43.getShort("", (short) (byte) 10);
        int int49 = extendedProperties43.getInt("/", (int) (byte) 100);
        java.util.Iterator iterator51 = extendedProperties43.getKeys("");
        java.util.Iterator iterator53 = extendedProperties43.getKeys("${");
        extendedProperties43.basePath = "/";
        java.lang.String str56 = extendedProperties43.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list60 = extendedProperties58.getList("");
        java.util.Properties properties62 = extendedProperties58.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties63 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties62);
        org.apache.commons.collections.ExtendedProperties extendedProperties65 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list67 = extendedProperties65.getList("");
        extendedProperties65.file = "}";
        java.lang.String str72 = extendedProperties65.getString("}", "hi!");
        java.lang.Boolean boolean75 = extendedProperties65.getBoolean("hi!", (java.lang.Boolean) false);
        extendedProperties65.basePath = "hi!";
        java.util.Vector vector79 = extendedProperties65.getVector(",");
        java.util.List list80 = extendedProperties63.getList("${", (java.util.List) vector79);
        java.lang.String str81 = extendedProperties43.interpolateHelper("", list80);
        extendedProperties9.addProperty("", (java.lang.Object) extendedProperties43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte85 = extendedProperties9.getByte("", (java.lang.Byte) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '' doesn't map to a Byte object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "}" + "'", str8, "}");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(extendedProperties34);
        org.junit.Assert.assertNotNull(arrayList35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/" + "'", str37, "/");
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 10 + "'", short46 == (short) 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "/" + "'", str56, "/");
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(properties62);
        org.junit.Assert.assertNotNull(extendedProperties63);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(vector79);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.lang.String str11 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        java.lang.String str18 = extendedProperties13.testBoolean("hi!");
        java.util.Properties properties20 = extendedProperties13.getProperties("/");
        java.util.Properties properties21 = extendedProperties0.getProperties(",", properties20);
        extendedProperties0.clearProperty("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj26 = extendedProperties24.getProperty("");
        java.util.List list28 = extendedProperties24.getList("hi!");
        java.lang.Long long31 = extendedProperties24.getLong("}", (java.lang.Long) (-1L));
        short short34 = extendedProperties24.getShort("", (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        short short38 = extendedProperties35.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = extendedProperties35.subset("");
        long long43 = extendedProperties35.getLong("/", (long) (short) 0);
        extendedProperties24.combine(extendedProperties35);
        extendedProperties24.setInclude("}");
        extendedProperties0.combine(extendedProperties24);
        // The following exception was thrown during execution in test generation
        try {
            float float49 = extendedProperties24.getFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) -1 + "'", short34 == (short) -1);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 10 + "'", short38 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        java.util.stream.Stream<java.lang.String> strStream7 = propertiesReader3.lines();
        boolean boolean8 = propertiesReader3.markSupported();
        java.lang.String str9 = propertiesReader3.readProperty();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        long long3 = extendedProperties0.getLong("hi!", (long) 1);
        long long6 = extendedProperties0.getLong("/", (long) '4');
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("}", (java.lang.Boolean) true);
        java.lang.Integer int12 = extendedProperties0.getInteger("${", (java.lang.Integer) 52);
        java.lang.Long long15 = extendedProperties0.getLong("", (java.lang.Long) 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.getString("}");
        java.lang.String str7 = extendedProperties0.getString("/", "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        long long14 = extendedProperties9.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList15 = extendedProperties9.keysAsListed;
        boolean boolean18 = extendedProperties9.getBoolean("", false);
        byte byte21 = extendedProperties9.getByte("}", (byte) 0);
        extendedProperties9.setInclude("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj26 = extendedProperties24.getProperty("");
        java.util.List list28 = extendedProperties24.getList("hi!");
        extendedProperties24.setInclude("hi!");
        java.util.List list32 = extendedProperties24.getList("hi!");
        java.lang.String str33 = extendedProperties24.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = extendedProperties24.subset("/");
        java.util.ArrayList arrayList36 = extendedProperties24.keysAsListed;
        extendedProperties9.keysAsListed = arrayList36;
        java.util.List list38 = extendedProperties0.getList(",", (java.util.List) arrayList36);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(extendedProperties35);
        org.junit.Assert.assertNotNull(arrayList36);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        int int10 = extendedProperties0.getInt("hi!", (int) (short) -1);
        int int13 = extendedProperties0.getInt("${", (int) (short) 0);
        extendedProperties0.display();
        java.util.Properties properties16 = extendedProperties0.getProperties("hi!");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.lang.String str11 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        java.lang.String str18 = extendedProperties13.testBoolean("hi!");
        java.util.Properties properties20 = extendedProperties13.getProperties("/");
        java.util.Properties properties21 = extendedProperties0.getProperties(",", properties20);
        extendedProperties0.clearProperty("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj26 = extendedProperties24.getProperty("");
        java.util.List list28 = extendedProperties24.getList("hi!");
        java.lang.Long long31 = extendedProperties24.getLong("}", (java.lang.Long) (-1L));
        short short34 = extendedProperties24.getShort("", (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        short short38 = extendedProperties35.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = extendedProperties35.subset("");
        long long43 = extendedProperties35.getLong("/", (long) (short) 0);
        extendedProperties24.combine(extendedProperties35);
        extendedProperties24.setInclude("}");
        extendedProperties0.combine(extendedProperties24);
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj50 = extendedProperties48.getProperty("");
        java.util.List list52 = extendedProperties48.getList("hi!");
        java.lang.Long long55 = extendedProperties48.getLong("}", (java.lang.Long) (-1L));
        int int58 = extendedProperties48.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties59 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj61 = extendedProperties59.getProperty("");
        java.util.List list63 = extendedProperties59.getList("hi!");
        java.lang.String str65 = extendedProperties59.interpolate("");
        java.lang.Short short68 = extendedProperties59.getShort("", (java.lang.Short) (short) -1);
        extendedProperties48.combine(extendedProperties59);
        extendedProperties48.basePath = "";
        java.lang.String str73 = extendedProperties48.interpolate(",");
        extendedProperties24.combine(extendedProperties48);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean76 = extendedProperties24.getBoolean("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) -1 + "'", short34 == (short) -1);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 10 + "'", short38 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) -1 + "'", short68 == (short) -1);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "," + "'", str73, ",");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        propertiesReader3.setLineNumber((-1));
        propertiesReader3.close();
        long long9 = propertiesReader3.skip((long) (byte) 0);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.Object obj7 = extendedProperties0.getProperty("hi!");
        boolean boolean8 = extendedProperties0.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        java.util.List list13 = extendedProperties9.getList("hi!");
        extendedProperties9.setInclude("hi!");
        java.util.List list17 = extendedProperties9.getList("hi!");
        java.lang.String str18 = extendedProperties9.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties9.subset("/");
        java.util.ArrayList arrayList21 = extendedProperties9.keysAsListed;
        extendedProperties0.keysAsListed = arrayList21;
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list26 = extendedProperties24.getList("");
        extendedProperties24.setInclude("hi!");
        java.util.Properties properties30 = null;
        java.util.Properties properties31 = extendedProperties24.getProperties("", properties30);
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties31);
        int int35 = extendedProperties32.getInteger("", 32);
        short short38 = extendedProperties32.getShort("hi!", (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list42 = extendedProperties40.getList("");
        java.util.Properties properties44 = extendedProperties40.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties44);
        java.util.Properties properties47 = extendedProperties45.getProperties("/");
        java.util.Properties properties49 = extendedProperties45.getProperties("/");
        java.util.Properties properties50 = extendedProperties32.getProperties("hi!", properties49);
        java.util.Properties properties51 = extendedProperties0.getProperties("}", properties50);
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties51);
        org.apache.commons.collections.ExtendedProperties extendedProperties53 = new org.apache.commons.collections.ExtendedProperties();
        short short56 = extendedProperties53.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = extendedProperties53.subset("");
        long long61 = extendedProperties53.getLong("/", (long) (short) 0);
        extendedProperties53.basePath = "${";
        extendedProperties52.combine(extendedProperties53);
        float float67 = extendedProperties52.getFloat("/", (float) 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(extendedProperties20);
        org.junit.Assert.assertNotNull(arrayList21);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(extendedProperties32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) -1 + "'", short38 == (short) -1);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNotNull(extendedProperties45);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertNotNull(extendedProperties52);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 10 + "'", short56 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        int int7 = propertiesReader3.read();
        boolean boolean8 = propertiesReader3.markSupported();
        int int9 = propertiesReader3.read();
        java.io.Reader reader10 = java.io.Reader.nullReader();
        char[] charArray11 = new char[] {};
        int int12 = reader10.read(charArray11);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader13 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader10);
        propertiesReader13.setLineNumber((int) (byte) 10);
        java.lang.String str16 = propertiesReader13.readProperty();
        java.io.Reader reader17 = java.io.Reader.nullReader();
        char[] charArray18 = new char[] {};
        int int19 = reader17.read(charArray18);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader20 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader17);
        propertiesReader20.setLineNumber((int) (short) 10);
        int int23 = propertiesReader20.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader24 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader20);
        propertiesReader24.setLineNumber((int) (short) 1);
        java.lang.String str27 = propertiesReader24.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader28 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader24);
        boolean boolean29 = propertiesReader24.markSupported();
        java.io.Reader reader30 = java.io.Reader.nullReader();
        char[] charArray31 = new char[] {};
        int int32 = reader30.read(charArray31);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader33 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader30);
        boolean boolean34 = propertiesReader33.markSupported();
        java.lang.String str35 = propertiesReader33.readLine();
        java.lang.String str36 = propertiesReader33.readProperty();
        java.io.Reader reader37 = java.io.Reader.nullReader();
        char[] charArray38 = new char[] {};
        int int39 = reader37.read(charArray38);
        int int40 = propertiesReader33.read(charArray38);
        int int41 = propertiesReader24.read(charArray38);
        int int42 = propertiesReader13.read(charArray38);
        int int43 = propertiesReader3.read(charArray38);
        java.lang.String str44 = propertiesReader3.readProperty();
        propertiesReader3.setLineNumber((int) (short) 10);
        propertiesReader3.setLineNumber((int) (short) 10);
        java.lang.String str49 = propertiesReader3.readProperty();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(reader17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(reader30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(reader37);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        java.lang.String str9 = extendedProperties0.getString("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        extendedProperties11.setInclude("hi!");
        java.lang.String str19 = extendedProperties11.testBoolean("");
        java.util.Iterator iterator20 = extendedProperties11.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list24 = extendedProperties22.getList("");
        double double27 = extendedProperties22.getDouble("hi!", 100.0d);
        java.lang.String str28 = extendedProperties22.basePath;
        java.util.Vector vector30 = extendedProperties22.getVector("}");
        java.util.Vector vector31 = extendedProperties11.getVector(",", vector30);
        java.util.List list32 = extendedProperties0.getList(",", (java.util.List) vector31);
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = extendedProperties0.subset("");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(vector30);
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNull(extendedProperties34);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Short short14 = extendedProperties8.getShort("hi!", (java.lang.Short) (short) 100);
        java.io.OutputStream outputStream15 = null;
        extendedProperties8.save(outputStream15, "");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj21 = extendedProperties19.getProperty("");
        java.util.List list23 = extendedProperties19.getList("hi!");
        short short26 = extendedProperties19.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj30 = extendedProperties28.getProperty("");
        long long33 = extendedProperties28.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList34 = extendedProperties28.keysAsListed;
        java.util.Vector vector36 = extendedProperties28.getVector("");
        java.util.Vector vector37 = extendedProperties19.getVector("}", vector36);
        java.util.List list38 = extendedProperties8.getList("hi!", (java.util.List) vector36);
        java.lang.Boolean boolean41 = extendedProperties8.getBoolean(",", (java.lang.Boolean) false);
        java.io.InputStream inputStream42 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties8.load(inputStream42, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 10 + "'", short26 == (short) 10);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNotNull(arrayList34);
        org.junit.Assert.assertNotNull(vector36);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        int int6 = extendedProperties0.getInt("/", (int) (byte) 100);
        java.io.OutputStream outputStream7 = null;
        extendedProperties0.save(outputStream7, "");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        short short7 = extendedProperties0.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        long long14 = extendedProperties9.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList15 = extendedProperties9.keysAsListed;
        java.util.Vector vector17 = extendedProperties9.getVector("");
        java.util.Vector vector18 = extendedProperties0.getVector("}", vector17);
        boolean boolean19 = extendedProperties0.isInitialized;
        boolean boolean22 = extendedProperties0.getBoolean(",", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = extendedProperties0.subset("${");
        boolean boolean25 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj29 = extendedProperties27.getProperty("");
        java.lang.String str30 = extendedProperties27.file;
        java.lang.String str32 = extendedProperties27.testBoolean("hi!");
        java.util.Properties properties34 = extendedProperties27.getProperties("/");
        java.util.Properties properties35 = extendedProperties0.getProperties("", properties34);
        java.lang.String[] strArray37 = extendedProperties0.getStringArray("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(vector18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(extendedProperties24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] {});
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str11 = extendedProperties0.interpolate("hi!");
        java.lang.String str13 = extendedProperties0.interpolate("}");
        java.lang.String str16 = extendedProperties0.getString("${", "/");
        extendedProperties0.basePath = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties0.subset("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/" + "'", str16, "/");
        org.junit.Assert.assertNull(extendedProperties20);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj8 = extendedProperties6.getProperty("");
        java.util.List list10 = extendedProperties6.getList("hi!");
        java.lang.String str12 = extendedProperties6.interpolate("");
        java.lang.Short short15 = extendedProperties6.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator16 = extendedProperties6.getKeys();
        java.lang.Byte byte19 = extendedProperties6.getByte("", (java.lang.Byte) (byte) 0);
        extendedProperties6.isInitialized = false;
        java.io.OutputStream outputStream22 = null;
        extendedProperties6.save(outputStream22, "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list28 = extendedProperties26.getList("");
        extendedProperties26.setInclude("hi!");
        java.lang.String str31 = extendedProperties26.getInclude();
        java.lang.Double double34 = extendedProperties26.getDouble("hi!", (java.lang.Double) 100.0d);
        java.lang.Long long37 = extendedProperties26.getLong("}", (java.lang.Long) 97L);
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj41 = extendedProperties39.getProperty("");
        java.util.List list43 = extendedProperties39.getList("hi!");
        java.lang.String str45 = extendedProperties39.interpolate("");
        java.lang.Short short48 = extendedProperties39.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator49 = extendedProperties39.getKeys();
        java.lang.Byte byte52 = extendedProperties39.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list56 = extendedProperties54.getList("");
        extendedProperties54.setInclude("hi!");
        extendedProperties54.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties62 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj64 = extendedProperties62.getProperty("");
        java.util.List list66 = extendedProperties62.getList("hi!");
        short short69 = extendedProperties62.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties71 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj73 = extendedProperties71.getProperty("");
        long long76 = extendedProperties71.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList77 = extendedProperties71.keysAsListed;
        java.util.Vector vector79 = extendedProperties71.getVector("");
        java.util.Vector vector80 = extendedProperties62.getVector("}", vector79);
        java.util.Vector vector81 = extendedProperties54.getVector("}", vector80);
        java.util.Vector vector82 = extendedProperties39.getVector("/", vector80);
        java.util.List list83 = extendedProperties26.getList("hi!", (java.util.List) vector82);
        java.util.Vector vector84 = extendedProperties6.getVector("${", vector82);
        java.util.Vector vector85 = extendedProperties0.getVector("}", vector82);
        extendedProperties0.clearProperty("hi!");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 97L + "'", long37 == 97L);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) -1 + "'", short48 == (short) -1);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 0 + "'", byte52 == (byte) 0);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertTrue("'" + short69 + "' != '" + (short) 10 + "'", short69 == (short) 10);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 100L + "'", long76 == 100L);
        org.junit.Assert.assertNotNull(arrayList77);
        org.junit.Assert.assertNotNull(vector79);
        org.junit.Assert.assertNotNull(vector80);
        org.junit.Assert.assertNotNull(vector81);
        org.junit.Assert.assertNotNull(vector82);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNotNull(vector84);
        org.junit.Assert.assertNotNull(vector85);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        java.util.Properties properties11 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties11);
        java.lang.String str15 = extendedProperties12.getString("${", "}");
        extendedProperties12.display();
        extendedProperties12.display();
        java.lang.Float float20 = extendedProperties12.getFloat("", (java.lang.Float) 100.0f);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(extendedProperties12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        int int6 = propertiesReader3.read();
        propertiesReader3.mark(0);
        propertiesReader3.mark(10);
        java.util.stream.Stream<java.lang.String> strStream11 = propertiesReader3.lines();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strStream11);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        java.lang.String str13 = extendedProperties0.interpolate("hi!");
        java.lang.Boolean boolean16 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.Byte byte19 = extendedProperties0.getByte("hi!", (java.lang.Byte) (byte) 1);
        java.lang.String str21 = extendedProperties0.interpolate("}");
        short short24 = extendedProperties0.getShort(",", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "}" + "'", str21, "}");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 10 + "'", short24 == (short) 10);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        extendedProperties0.display();
        java.lang.Double double12 = extendedProperties0.getDouble("", (java.lang.Double) 10.0d);
        java.lang.String str13 = extendedProperties0.getInclude();
        extendedProperties0.setInclude("}");
        java.lang.String str17 = extendedProperties0.interpolate("/");
        extendedProperties0.fileSeparator = "}";
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/" + "'", str17, "/");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.util.Properties properties5 = extendedProperties0.getProperties("/");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedProperties0.getInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        java.lang.String str17 = extendedProperties11.interpolate("");
        java.lang.Short short20 = extendedProperties11.getShort("", (java.lang.Short) (short) -1);
        extendedProperties0.combine(extendedProperties11);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj25 = extendedProperties23.getProperty("");
        java.lang.String str26 = extendedProperties23.file;
        byte byte29 = extendedProperties23.getByte("", (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list33 = extendedProperties31.getList("");
        java.util.Properties properties35 = extendedProperties31.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties35);
        java.util.Properties properties38 = extendedProperties36.getProperties("/");
        java.util.Properties properties39 = extendedProperties23.getProperties("${", properties38);
        java.util.Properties properties40 = extendedProperties0.getProperties("hi!", properties38);
        java.lang.String str41 = extendedProperties0.getInclude();
        short short44 = extendedProperties0.getShort(",", (short) 100);
        extendedProperties0.isInitialized = false;
        extendedProperties0.basePath = "}";
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 1 + "'", byte29 == (byte) 1);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(extendedProperties36);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "}" + "'", str41, "}");
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 100 + "'", short44 == (short) 100);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        byte byte12 = extendedProperties0.getByte("}", (byte) 0);
        extendedProperties0.setInclude("${");
        java.io.Reader reader16 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] {};
        int int18 = reader16.read(charArray17);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader19 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader16);
        extendedProperties0.addProperty("hi!", (java.lang.Object) reader16);
        extendedProperties0.file = ",";
        extendedProperties0.file = "";
        java.util.Iterator iterator26 = extendedProperties0.getKeys("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj29 = extendedProperties27.getProperty("");
        java.util.List list31 = extendedProperties27.getList("hi!");
        java.lang.String str33 = extendedProperties27.interpolate("");
        java.lang.Short short36 = extendedProperties27.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str38 = extendedProperties27.interpolate("hi!");
        java.lang.String str40 = extendedProperties27.interpolate("}");
        java.lang.String str41 = extendedProperties27.basePath;
        byte byte44 = extendedProperties27.getByte("/", (byte) 0);
        extendedProperties0.combine(extendedProperties27);
        java.util.List list47 = extendedProperties27.getList("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj51 = extendedProperties49.getProperty("");
        java.lang.String str53 = extendedProperties49.interpolate("}");
        extendedProperties49.fileSeparator = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties57 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list59 = extendedProperties57.getList("");
        int int62 = extendedProperties57.getInt("", (int) ' ');
        java.util.Vector vector64 = extendedProperties57.getVector(",");
        java.util.List list65 = extendedProperties49.getList("${", (java.util.List) vector64);
        java.lang.String str66 = extendedProperties27.interpolateHelper("", (java.util.List) vector64);
        java.lang.Short short69 = extendedProperties27.getShort("}", (java.lang.Short) (short) 10);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) -1 + "'", short36 == (short) -1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "}" + "'", str40, "}");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 0 + "'", byte44 == (byte) 0);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "}" + "'", str53, "}");
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 32 + "'", int62 == 32);
        org.junit.Assert.assertNotNull(vector64);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + short69 + "' != '" + (short) 10 + "'", short69 == (short) 10);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        extendedProperties0.display();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.io.OutputStream outputStream2 = null;
        extendedProperties0.save(outputStream2, "hi!");
        extendedProperties0.isInitialized = false;
        java.lang.String str7 = extendedProperties0.getInclude();
        java.lang.String str8 = extendedProperties0.file;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "${" + "'", str7, "${");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.file = "}";
        java.lang.String str7 = extendedProperties0.getString("}", "hi!");
        java.lang.String str10 = extendedProperties0.getString(",", "}");
        extendedProperties0.isInitialized = true;
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "}" + "'", str10, "}");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.String str8 = extendedProperties0.getString("/");
        java.util.Vector vector10 = extendedProperties0.getVector("hi!");
        extendedProperties0.setInclude("${");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = extendedProperties0.getInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(vector10);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        byte byte12 = extendedProperties0.getByte("}", (byte) 0);
        extendedProperties0.setInclude("${");
        java.io.Reader reader16 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] {};
        int int18 = reader16.read(charArray17);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader19 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader16);
        extendedProperties0.addProperty("hi!", (java.lang.Object) reader16);
        extendedProperties0.file = ",";
        extendedProperties0.file = "";
        java.util.Iterator iterator26 = extendedProperties0.getKeys("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj29 = extendedProperties27.getProperty("");
        java.util.List list31 = extendedProperties27.getList("hi!");
        java.lang.String str33 = extendedProperties27.interpolate("");
        java.lang.Short short36 = extendedProperties27.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str38 = extendedProperties27.interpolate("hi!");
        java.lang.String str40 = extendedProperties27.interpolate("}");
        java.lang.String str41 = extendedProperties27.basePath;
        byte byte44 = extendedProperties27.getByte("/", (byte) 0);
        extendedProperties0.combine(extendedProperties27);
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer48 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        java.lang.Object obj49 = propertiesTokenizer48.nextElement();
        extendedProperties0.setProperty("", obj49);
        extendedProperties0.basePath = "/";
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) -1 + "'", short36 == (short) -1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "}" + "'", str40, "}");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 0 + "'", byte44 == (byte) 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "/" + "'", obj49, "/");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        java.lang.String str15 = extendedProperties12.file;
        java.lang.String str17 = extendedProperties12.testBoolean("hi!");
        java.util.Properties properties19 = extendedProperties12.getProperties("/");
        java.util.Properties properties20 = extendedProperties0.getProperties("", properties19);
        extendedProperties0.clearProperty(",");
        java.lang.Float float25 = extendedProperties0.getFloat("${", (java.lang.Float) (-1.0f));
        java.lang.Long long28 = extendedProperties0.getLong(",", (java.lang.Long) 52L);
        long long31 = extendedProperties0.getLong("", 0L);
        java.lang.String str33 = extendedProperties0.testBoolean("/");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        java.util.Iterator<java.lang.Object> objItor5 = propertiesTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor6 = propertiesTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "}" + "'", obj2, "}");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        java.util.Properties properties12 = extendedProperties10.getProperties("");
        boolean boolean13 = extendedProperties10.isInitialized();
        // The following exception was thrown during execution in test generation
        try {
            float float15 = extendedProperties10.getFloat("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        java.util.Iterator iterator11 = extendedProperties0.getKeys("${");
        java.lang.Double double14 = extendedProperties0.getDouble("hi!", (java.lang.Double) 0.0d);
        extendedProperties0.clearProperty("}");
        short short19 = extendedProperties0.getShort(",", (short) 1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        extendedProperties13.file = "";
        extendedProperties13.setProperty("/", (java.lang.Object) false);
        extendedProperties0.combine(extendedProperties13);
        java.lang.String str25 = extendedProperties13.getString("}", "hi!");
        long long28 = extendedProperties13.getLong(",", (-1L));
        boolean boolean31 = extendedProperties13.getBoolean("hi!", false);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj35 = extendedProperties33.getProperty("");
        java.util.List list37 = extendedProperties33.getList("hi!");
        java.lang.String str39 = extendedProperties33.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list43 = extendedProperties41.getList("");
        double double46 = extendedProperties41.getDouble("hi!", 100.0d);
        extendedProperties33.setProperty("", (java.lang.Object) 100.0d);
        float float50 = extendedProperties33.getFloat("${", 0.0f);
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list54 = extendedProperties52.getList("");
        java.lang.String str56 = extendedProperties52.testBoolean("");
        extendedProperties52.file = ",";
        java.util.Iterator iterator59 = extendedProperties52.getKeys();
        extendedProperties33.setProperty(",", (java.lang.Object) extendedProperties52);
        extendedProperties13.setProperty(",", (java.lang.Object) ",");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.0f + "'", float50 == 0.0f);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(iterator59);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list7 = extendedProperties5.getList("");
        extendedProperties5.setInclude("hi!");
        java.util.Properties properties11 = null;
        java.util.Properties properties12 = extendedProperties5.getProperties("", properties11);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj16 = extendedProperties14.getProperty("");
        java.util.List list18 = extendedProperties14.getList("hi!");
        extendedProperties14.setInclude("hi!");
        java.util.List list22 = extendedProperties14.getList("hi!");
        java.lang.String str23 = extendedProperties14.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = extendedProperties14.subset("/");
        java.util.ArrayList arrayList26 = extendedProperties14.keysAsListed;
        java.util.List list27 = extendedProperties5.getList("", (java.util.List) arrayList26);
        java.lang.String str28 = extendedProperties0.interpolateHelper("/", list27);
        java.lang.String str30 = extendedProperties0.interpolate("${");
        java.lang.Double double33 = extendedProperties0.getDouble("}", (java.lang.Double) 32.0d);
        java.util.List list35 = extendedProperties0.getList(",");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(extendedProperties25);
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/" + "'", str28, "/");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "${" + "'", str30, "${");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 32.0d + "'", double33 == 32.0d);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.setLineNumber((int) (byte) 0);
        long long10 = propertiesReader3.skip((long) (byte) 100);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(10);
        boolean boolean9 = propertiesReader3.markSupported();
        propertiesReader3.mark((int) (short) 1);
        propertiesReader3.reset();
        propertiesReader3.reset();
        java.io.Reader reader14 = java.io.Reader.nullReader();
        char[] charArray15 = new char[] {};
        int int16 = reader14.read(charArray15);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader14);
        boolean boolean18 = propertiesReader17.markSupported();
        java.lang.String str19 = propertiesReader17.readLine();
        java.util.stream.Stream<java.lang.String> strStream20 = propertiesReader17.lines();
        java.util.stream.Stream<java.lang.String> strStream21 = propertiesReader17.lines();
        boolean boolean22 = propertiesReader17.markSupported();
        java.io.Reader reader23 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] {};
        int int25 = reader23.read(charArray24);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader26 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader23);
        propertiesReader26.setLineNumber((int) (short) 10);
        int int29 = propertiesReader26.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader30 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader26);
        propertiesReader30.setLineNumber((int) (short) 1);
        java.lang.String str33 = propertiesReader30.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader34 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader30);
        long long36 = propertiesReader30.skip((long) 1);
        java.io.Reader reader37 = java.io.Reader.nullReader();
        char[] charArray38 = new char[] {};
        int int39 = reader37.read(charArray38);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader40 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader37);
        boolean boolean41 = propertiesReader40.markSupported();
        java.lang.String str42 = propertiesReader40.readLine();
        boolean boolean43 = propertiesReader40.markSupported();
        java.io.Reader reader44 = java.io.Reader.nullReader();
        char[] charArray45 = new char[] {};
        int int46 = reader44.read(charArray45);
        int int47 = propertiesReader40.read(charArray45);
        int int48 = propertiesReader30.read(charArray45);
        int int49 = propertiesReader17.read(charArray45);
        int int52 = propertiesReader3.read(charArray45, 0, (int) (short) 0);
        java.lang.String str53 = propertiesReader3.readProperty();
        int int54 = propertiesReader3.read();
        propertiesReader3.reset();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strStream20);
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reader23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(reader37);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(reader44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader7.setLineNumber((int) (short) 1);
        java.lang.String str10 = propertiesReader7.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader7);
        long long13 = propertiesReader11.skip((long) 97);
        propertiesReader11.setLineNumber(32);
        long long17 = propertiesReader11.skip(0L);
        propertiesReader11.mark((int) (short) 100);
        java.lang.String str20 = propertiesReader11.readLine();
        int int21 = propertiesReader11.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int4 = propertiesReader3.getLineNumber();
        java.lang.String str5 = propertiesReader3.readProperty();
        java.lang.String str6 = propertiesReader3.readProperty();
        propertiesReader3.close();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.mark((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        java.util.List list14 = extendedProperties10.getList("hi!");
        java.lang.String str15 = extendedProperties0.interpolateHelper("}", list14);
        java.util.Iterator iterator16 = extendedProperties0.getKeys();
        java.lang.Double double19 = extendedProperties0.getDouble("${", (java.lang.Double) 100.0d);
        boolean boolean20 = extendedProperties0.isInitialized();
        java.lang.Boolean boolean23 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.util.Iterator iterator24 = extendedProperties0.getKeys();
        java.lang.String str26 = extendedProperties0.getString("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        int int6 = extendedProperties0.getInt("/", (int) (byte) 100);
        java.lang.String str7 = extendedProperties0.file;
        java.io.OutputStream outputStream8 = null;
        extendedProperties0.save(outputStream8, "");
        int int13 = extendedProperties0.getInteger("${", 10);
        float float16 = extendedProperties0.getFloat("}", (float) 10L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        int int8 = extendedProperties0.getInteger("", 0);
        java.lang.String str10 = extendedProperties0.testBoolean("}");
        java.lang.Integer int13 = extendedProperties0.getInteger(",", (java.lang.Integer) 52);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        long long3 = extendedProperties0.getLong("hi!", (long) 1);
        long long6 = extendedProperties0.getLong("/", (long) '4');
        java.lang.String[] strArray8 = extendedProperties0.getStringArray("");
        extendedProperties0.clearProperty("/");
        java.lang.Short short13 = extendedProperties0.getShort("/", (java.lang.Short) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        java.lang.String str9 = extendedProperties0.interpolate("${");
        extendedProperties0.clearProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list14 = extendedProperties12.getList("");
        int int17 = extendedProperties12.getInt("", (int) ' ');
        long long20 = extendedProperties12.getLong("${", (long) (short) 0);
        java.util.Properties properties22 = null;
        java.util.Properties properties23 = extendedProperties12.getProperties("}", properties22);
        java.util.ArrayList arrayList24 = extendedProperties12.keysAsListed;
        extendedProperties0.keysAsListed = arrayList24;
        byte byte28 = extendedProperties0.getByte("${", (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list31 = extendedProperties29.getList("");
        extendedProperties29.setInclude("hi!");
        java.util.Properties properties35 = null;
        java.util.Properties properties36 = extendedProperties29.getProperties("", properties35);
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties36);
        int int40 = extendedProperties37.getInteger("", 32);
        short short43 = extendedProperties37.getShort("hi!", (short) -1);
        java.util.ArrayList arrayList44 = extendedProperties37.keysAsListed;
        extendedProperties0.keysAsListed = arrayList44;
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj49 = extendedProperties47.getProperty("");
        java.util.List list51 = extendedProperties47.getList("hi!");
        short short54 = extendedProperties47.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj58 = extendedProperties56.getProperty("");
        long long61 = extendedProperties56.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList62 = extendedProperties56.keysAsListed;
        java.util.Vector vector64 = extendedProperties56.getVector("");
        java.util.Vector vector65 = extendedProperties47.getVector("}", vector64);
        boolean boolean66 = extendedProperties47.isInitialized;
        boolean boolean69 = extendedProperties47.getBoolean(",", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties71 = extendedProperties47.subset("${");
        boolean boolean72 = extendedProperties47.isInitialized;
        extendedProperties0.setProperty("", (java.lang.Object) extendedProperties47);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "${" + "'", str9, "${");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 0 + "'", byte28 == (byte) 0);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNotNull(extendedProperties37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) -1 + "'", short43 == (short) -1);
        org.junit.Assert.assertNotNull(arrayList44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 10 + "'", short54 == (short) 10);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L + "'", long61 == 100L);
        org.junit.Assert.assertNotNull(arrayList62);
        org.junit.Assert.assertNotNull(vector64);
        org.junit.Assert.assertNotNull(vector65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(extendedProperties71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        java.util.List list14 = extendedProperties10.getList("hi!");
        java.lang.String str16 = extendedProperties10.interpolate("");
        java.lang.Short short19 = extendedProperties10.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str21 = extendedProperties10.interpolate("hi!");
        extendedProperties9.combine(extendedProperties10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = extendedProperties10.getInt("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str4 = extendedProperties0.basePath;
        java.util.List list6 = extendedProperties0.getList("");
        java.lang.String str8 = extendedProperties0.getString("hi!");
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        long long9 = propertiesReader7.skip((long) (byte) 100);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = propertiesReader7.transferTo(writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        extendedProperties0.isInitialized = true;
        long long12 = extendedProperties0.getLong("", (long) 32);
        extendedProperties0.clearProperty("hi!");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        boolean boolean7 = propertiesReader3.markSupported();
        java.util.stream.Stream<java.lang.String> strStream8 = propertiesReader3.lines();
        boolean boolean9 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        byte byte12 = extendedProperties0.getByte("}", (byte) 0);
        extendedProperties0.setInclude("${");
        java.io.Reader reader16 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] {};
        int int18 = reader16.read(charArray17);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader19 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader16);
        extendedProperties0.addProperty("hi!", (java.lang.Object) reader16);
        extendedProperties0.file = ",";
        extendedProperties0.file = "";
        java.lang.String str26 = extendedProperties0.testBoolean(",");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.setInclude("");
        extendedProperties0.basePath = "}";
        java.lang.Double double15 = extendedProperties0.getDouble("/", (java.lang.Double) 35.0d);
        int int18 = extendedProperties0.getInt("}", 0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list11 = extendedProperties9.getList("");
        java.lang.String str13 = extendedProperties9.testBoolean("");
        double double16 = extendedProperties9.getDouble("/", (double) 10L);
        java.util.List list18 = extendedProperties9.getList("");
        java.lang.String str19 = extendedProperties0.interpolateHelper("${", list18);
        java.util.Iterator iterator20 = extendedProperties0.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj23 = extendedProperties21.getProperty("");
        long long26 = extendedProperties21.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList27 = extendedProperties21.keysAsListed;
        java.util.Vector vector29 = extendedProperties21.getVector("");
        extendedProperties21.display();
        java.lang.Double double33 = extendedProperties21.getDouble("", (java.lang.Double) 10.0d);
        java.lang.Boolean boolean36 = extendedProperties21.getBoolean("${", (java.lang.Boolean) false);
        extendedProperties0.combine(extendedProperties21);
        boolean boolean38 = extendedProperties21.isInitialized;
        boolean boolean39 = extendedProperties21.isInitialized;
        boolean boolean40 = extendedProperties21.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        long long45 = extendedProperties42.getLong("hi!", (long) 1);
        long long48 = extendedProperties42.getLong("/", (long) '4');
        java.lang.Boolean boolean51 = extendedProperties42.getBoolean("}", (java.lang.Boolean) true);
        extendedProperties42.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj56 = extendedProperties54.getProperty("");
        long long59 = extendedProperties54.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream60 = null;
        extendedProperties54.save(outputStream60, "${");
        extendedProperties54.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties65 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj67 = extendedProperties65.getProperty("");
        java.lang.String str69 = extendedProperties65.interpolate("}");
        java.lang.String str71 = extendedProperties65.interpolate("");
        extendedProperties54.addProperty("/", (java.lang.Object) extendedProperties65);
        java.util.Properties properties74 = extendedProperties65.getProperties("");
        java.util.Properties properties75 = extendedProperties42.getProperties("${", properties74);
        java.util.Properties properties76 = extendedProperties21.getProperties("", properties75);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "${" + "'", str19, "${");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNotNull(arrayList27);
        org.junit.Assert.assertNotNull(vector29);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 52L + "'", long48 == 52L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 100L + "'", long59 == 100L);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "}" + "'", str69, "}");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(properties74);
        org.junit.Assert.assertNotNull(properties75);
        org.junit.Assert.assertNotNull(properties76);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        extendedProperties0.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj10 = extendedProperties8.getProperty("");
        java.util.List list12 = extendedProperties8.getList("hi!");
        short short15 = extendedProperties8.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj19 = extendedProperties17.getProperty("");
        long long22 = extendedProperties17.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList23 = extendedProperties17.keysAsListed;
        java.util.Vector vector25 = extendedProperties17.getVector("");
        java.util.Vector vector26 = extendedProperties8.getVector("}", vector25);
        java.util.Vector vector27 = extendedProperties0.getVector("}", vector26);
        boolean boolean28 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        short short32 = extendedProperties29.getShort("", (short) (byte) 10);
        extendedProperties29.file = "/";
        boolean boolean35 = extendedProperties29.isInitialized;
        java.lang.String str38 = extendedProperties29.getString("${", "");
        extendedProperties29.setInclude("}");
        java.util.ArrayList arrayList41 = extendedProperties29.keysAsListed;
        extendedProperties0.keysAsListed = arrayList41;
        int int45 = extendedProperties0.getInteger("/", 0);
        extendedProperties0.setInclude("hi!");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertNotNull(vector25);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertNotNull(vector27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 10 + "'", short32 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(arrayList41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        java.lang.String str5 = propertiesTokenizer1.nextToken();
        java.lang.String str6 = propertiesTokenizer1.nextToken();
        java.lang.String str7 = propertiesTokenizer1.nextToken();
        java.lang.Object obj8 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "}" + "'", obj2, "}");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list10 = extendedProperties8.getList("");
        double double13 = extendedProperties8.getDouble("hi!", 100.0d);
        extendedProperties0.setProperty("", (java.lang.Object) 100.0d);
        float float17 = extendedProperties0.getFloat("${", 0.0f);
        java.lang.String str19 = extendedProperties0.testBoolean(",");
        boolean boolean22 = extendedProperties0.getBoolean("/", true);
        extendedProperties0.isInitialized = true;
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list28 = extendedProperties26.getList("");
        double double31 = extendedProperties26.getDouble("hi!", 100.0d);
        extendedProperties26.setInclude("hi!");
        java.lang.String str34 = extendedProperties26.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list38 = extendedProperties36.getList("");
        java.lang.String str40 = extendedProperties36.testBoolean("");
        double double43 = extendedProperties36.getDouble("/", (double) 10L);
        java.util.List list45 = extendedProperties36.getList("");
        long long48 = extendedProperties36.getLong("", (long) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj52 = extendedProperties50.getProperty("");
        long long55 = extendedProperties50.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList56 = extendedProperties50.keysAsListed;
        boolean boolean59 = extendedProperties50.getBoolean("", false);
        byte byte62 = extendedProperties50.getByte("}", (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties64 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list66 = extendedProperties64.getList("");
        extendedProperties64.setInclude("hi!");
        extendedProperties64.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties72 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj74 = extendedProperties72.getProperty("");
        java.util.List list76 = extendedProperties72.getList("hi!");
        short short79 = extendedProperties72.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties81 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj83 = extendedProperties81.getProperty("");
        long long86 = extendedProperties81.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList87 = extendedProperties81.keysAsListed;
        java.util.Vector vector89 = extendedProperties81.getVector("");
        java.util.Vector vector90 = extendedProperties72.getVector("}", vector89);
        java.util.Vector vector91 = extendedProperties64.getVector("}", vector90);
        java.util.Vector vector92 = extendedProperties50.getVector("/", vector90);
        java.util.List list93 = extendedProperties36.getList("/", (java.util.List) vector90);
        java.util.Vector vector94 = extendedProperties26.getVector("/", vector90);
        java.util.Vector vector95 = extendedProperties0.getVector("hi!", vector94);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 100L + "'", long48 == 100L);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 100L + "'", long55 == 100L);
        org.junit.Assert.assertNotNull(arrayList56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) 0 + "'", byte62 == (byte) 0);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) 10 + "'", short79 == (short) 10);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 100L + "'", long86 == 100L);
        org.junit.Assert.assertNotNull(arrayList87);
        org.junit.Assert.assertNotNull(vector89);
        org.junit.Assert.assertNotNull(vector90);
        org.junit.Assert.assertNotNull(vector91);
        org.junit.Assert.assertNotNull(vector92);
        org.junit.Assert.assertNotNull(list93);
        org.junit.Assert.assertNotNull(vector94);
        org.junit.Assert.assertNotNull(vector95);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.basePath = ",";
        java.lang.String[] strArray4 = extendedProperties0.getStringArray("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj8 = extendedProperties6.getProperty("");
        java.lang.String str9 = extendedProperties6.file;
        java.lang.String str11 = extendedProperties6.testBoolean("hi!");
        java.util.Properties properties13 = extendedProperties6.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        extendedProperties14.display();
        int int18 = extendedProperties14.getInteger("${", (int) (byte) 10);
        java.lang.String[] strArray20 = extendedProperties14.getStringArray("/");
        int int23 = extendedProperties14.getInt(",", (int) (byte) 10);
        extendedProperties0.addProperty("/", (java.lang.Object) extendedProperties14);
        java.lang.String str25 = extendedProperties0.basePath;
        java.lang.Float float28 = extendedProperties0.getFloat("${", (java.lang.Float) (-1.0f));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(extendedProperties14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "," + "'", str25, ",");
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.basePath = ",";
        java.lang.String[] strArray4 = extendedProperties0.getStringArray("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj8 = extendedProperties6.getProperty("");
        java.lang.String str9 = extendedProperties6.file;
        java.lang.String str11 = extendedProperties6.testBoolean("hi!");
        java.util.Properties properties13 = extendedProperties6.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        extendedProperties14.display();
        int int18 = extendedProperties14.getInteger("${", (int) (byte) 10);
        java.lang.String[] strArray20 = extendedProperties14.getStringArray("/");
        int int23 = extendedProperties14.getInt(",", (int) (byte) 10);
        extendedProperties0.addProperty("/", (java.lang.Object) extendedProperties14);
        extendedProperties0.display();
        extendedProperties0.isInitialized = true;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(extendedProperties14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.util.Properties properties8 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties8);
        java.util.Iterator iterator10 = extendedProperties9.getKeys();
        java.lang.Object obj12 = extendedProperties9.getProperty("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        java.util.List list14 = extendedProperties10.getList("hi!");
        java.lang.String str15 = extendedProperties0.interpolateHelper("}", list14);
        java.lang.Short short18 = extendedProperties0.getShort("", (java.lang.Short) (short) 10);
        int int21 = extendedProperties0.getInteger("}", (int) (byte) 1);
        java.lang.String str22 = extendedProperties0.fileSeparator;
        java.lang.String str24 = extendedProperties0.interpolate("${");
        boolean boolean25 = extendedProperties0.isInitialized();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/" + "'", str22, "/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "${" + "'", str24, "${");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        extendedProperties0.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj10 = extendedProperties8.getProperty("");
        java.util.List list12 = extendedProperties8.getList("hi!");
        short short15 = extendedProperties8.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj19 = extendedProperties17.getProperty("");
        long long22 = extendedProperties17.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList23 = extendedProperties17.keysAsListed;
        java.util.Vector vector25 = extendedProperties17.getVector("");
        java.util.Vector vector26 = extendedProperties8.getVector("}", vector25);
        java.util.Vector vector27 = extendedProperties0.getVector("}", vector26);
        boolean boolean28 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        short short32 = extendedProperties29.getShort("", (short) (byte) 10);
        extendedProperties29.file = "/";
        boolean boolean35 = extendedProperties29.isInitialized;
        java.lang.String str38 = extendedProperties29.getString("${", "");
        extendedProperties29.setInclude("}");
        java.util.ArrayList arrayList41 = extendedProperties29.keysAsListed;
        extendedProperties0.keysAsListed = arrayList41;
        int int45 = extendedProperties0.getInteger("/", 0);
        java.lang.String str46 = extendedProperties0.basePath;
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertNotNull(vector25);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertNotNull(vector27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 10 + "'", short32 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(arrayList41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        long long11 = propertiesReader3.skip(52L);
        java.lang.String str12 = propertiesReader3.readProperty();
        boolean boolean13 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        propertiesReader3.setLineNumber((int) (short) 0);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader10 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader10.close();
        int int12 = propertiesReader10.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        propertiesReader3.setLineNumber((-1));
        java.io.Reader reader7 = java.io.Reader.nullReader();
        char[] charArray8 = new char[] {};
        int int9 = reader7.read(charArray8);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader10 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader7);
        boolean boolean11 = propertiesReader10.markSupported();
        java.lang.String str12 = propertiesReader10.readLine();
        java.lang.String str13 = propertiesReader10.readLine();
        java.util.stream.Stream<java.lang.String> strStream14 = propertiesReader10.lines();
        java.io.Reader reader15 = java.io.Reader.nullReader();
        char[] charArray16 = new char[] {};
        int int17 = reader15.read(charArray16);
        int int18 = propertiesReader10.read(charArray16);
        int int19 = propertiesReader3.read(charArray16);
        java.util.stream.Stream<java.lang.String> strStream20 = propertiesReader3.lines();
        int int21 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader22 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        int int23 = propertiesReader3.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.lang.String str5 = extendedProperties0.getInclude();
        extendedProperties0.clearProperty("${");
        extendedProperties0.isInitialized = false;
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        java.lang.Long long18 = extendedProperties11.getLong("}", (java.lang.Long) (-1L));
        int int21 = extendedProperties11.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj24 = extendedProperties22.getProperty("");
        java.util.List list26 = extendedProperties22.getList("hi!");
        java.lang.String str28 = extendedProperties22.interpolate("");
        java.lang.Short short31 = extendedProperties22.getShort("", (java.lang.Short) (short) -1);
        extendedProperties11.combine(extendedProperties22);
        long long35 = extendedProperties11.getLong(",", (long) 'a');
        java.lang.String str37 = extendedProperties11.getString("");
        boolean boolean40 = extendedProperties11.getBoolean("}", false);
        java.lang.Byte byte43 = extendedProperties11.getByte("/", (java.lang.Byte) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list47 = extendedProperties45.getList("");
        extendedProperties45.setInclude("hi!");
        java.util.Properties properties51 = null;
        java.util.Properties properties52 = extendedProperties45.getProperties("", properties51);
        java.lang.String str54 = extendedProperties45.getString("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj58 = extendedProperties56.getProperty("");
        java.util.List list60 = extendedProperties56.getList("hi!");
        java.lang.String str62 = extendedProperties56.interpolate("");
        java.lang.Short short65 = extendedProperties56.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator66 = extendedProperties56.getKeys();
        java.lang.String str69 = extendedProperties56.getString("hi!", "");
        java.lang.String str70 = extendedProperties56.file;
        java.util.Properties properties72 = extendedProperties56.getProperties("hi!");
        java.util.Properties properties73 = extendedProperties45.getProperties("", properties72);
        java.util.Properties properties74 = extendedProperties11.getProperties("", properties72);
        org.apache.commons.collections.ExtendedProperties extendedProperties75 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties72);
        java.util.Properties properties76 = extendedProperties0.getProperties("", properties72);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 97L + "'", long35 == 97L);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + short65 + "' != '" + (short) -1 + "'", short65 == (short) -1);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(properties72);
        org.junit.Assert.assertNotNull(properties73);
        org.junit.Assert.assertNotNull(properties74);
        org.junit.Assert.assertNotNull(extendedProperties75);
        org.junit.Assert.assertNotNull(properties76);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties4);
        java.util.Properties properties7 = extendedProperties5.getProperties("/");
        java.io.OutputStream outputStream8 = null;
        extendedProperties5.save(outputStream8, "hi!");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer13 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        boolean boolean14 = propertiesTokenizer13.hasMoreTokens();
        extendedProperties5.setProperty("hi!", (java.lang.Object) boolean14);
        boolean boolean16 = extendedProperties5.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj19 = extendedProperties17.getProperty("");
        long long22 = extendedProperties17.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList23 = extendedProperties17.keysAsListed;
        boolean boolean26 = extendedProperties17.getBoolean("", false);
        boolean boolean29 = extendedProperties17.getBoolean("/", true);
        extendedProperties5.combine(extendedProperties17);
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj34 = extendedProperties32.getProperty("");
        java.lang.String str35 = extendedProperties32.file;
        java.lang.String str37 = extendedProperties32.testBoolean("hi!");
        java.util.Properties properties39 = extendedProperties32.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties39);
        java.util.Vector vector42 = extendedProperties40.getVector("}");
        java.lang.String str43 = extendedProperties40.fileSeparator;
        java.lang.Boolean boolean46 = extendedProperties40.getBoolean("${", (java.lang.Boolean) false);
        java.util.List list48 = extendedProperties40.getList("");
        java.lang.String str50 = extendedProperties40.getString("/");
        java.lang.String str51 = extendedProperties40.file;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties17.setProperty("", (java.lang.Object) str51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(extendedProperties5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(extendedProperties40);
        org.junit.Assert.assertNotNull(vector42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "/" + "'", str43, "/");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        double double7 = extendedProperties0.getDouble("/", (double) (short) 100);
        int int10 = extendedProperties0.getInt("/", (int) (byte) 0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        java.lang.String str9 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = extendedProperties0.subset("/");
        java.util.ArrayList arrayList12 = extendedProperties0.keysAsListed;
        java.lang.String str15 = extendedProperties0.getString("/", "${");
        java.lang.String str16 = extendedProperties0.basePath;
        int int19 = extendedProperties0.getInteger("", 35);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(extendedProperties11);
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "${" + "'", str15, "${");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        byte byte12 = extendedProperties0.getByte("}", (byte) 0);
        extendedProperties0.setInclude("${");
        java.io.Reader reader16 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] {};
        int int18 = reader16.read(charArray17);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader19 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader16);
        extendedProperties0.addProperty("hi!", (java.lang.Object) reader16);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator23 = extendedProperties0.getKeys();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        java.util.Iterator<java.lang.Object> objItor5 = propertiesTokenizer1.asIterator();
        java.lang.String str6 = propertiesTokenizer1.nextToken();
        java.lang.String str8 = propertiesTokenizer1.nextToken("");
        boolean boolean9 = propertiesTokenizer1.hasMoreTokens();
        java.lang.Object obj10 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "}" + "'", obj2, "}");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        propertiesReader3.setLineNumber((-1));
        java.io.Reader reader7 = java.io.Reader.nullReader();
        char[] charArray8 = new char[] {};
        int int9 = reader7.read(charArray8);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader10 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader7);
        boolean boolean11 = propertiesReader10.markSupported();
        java.lang.String str12 = propertiesReader10.readLine();
        java.lang.String str13 = propertiesReader10.readLine();
        java.util.stream.Stream<java.lang.String> strStream14 = propertiesReader10.lines();
        java.io.Reader reader15 = java.io.Reader.nullReader();
        char[] charArray16 = new char[] {};
        int int17 = reader15.read(charArray16);
        int int18 = propertiesReader10.read(charArray16);
        int int19 = propertiesReader3.read(charArray16);
        java.util.stream.Stream<java.lang.String> strStream20 = propertiesReader3.lines();
        int int21 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader22 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.lang.String str23 = propertiesReader3.readProperty();
        boolean boolean24 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str5 = extendedProperties0.file;
        boolean boolean6 = extendedProperties0.isInitialized;
        extendedProperties0.file = "${";
        java.util.Iterator iterator9 = extendedProperties0.getKeys();
        java.lang.Byte byte12 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 10);
        java.util.Iterator iterator14 = extendedProperties0.getKeys("${");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.lang.String str9 = extendedProperties0.getString("");
        int int12 = extendedProperties0.getInteger("", (int) (byte) 10);
        extendedProperties0.display();
        java.lang.String str14 = extendedProperties0.file;
        java.lang.String str16 = extendedProperties0.getString("}");
        extendedProperties0.clearProperty("${");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Byte byte13 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        extendedProperties0.isInitialized = false;
        java.io.OutputStream outputStream16 = null;
        extendedProperties0.save(outputStream16, "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list22 = extendedProperties20.getList("");
        extendedProperties20.setInclude("hi!");
        java.lang.String str25 = extendedProperties20.getInclude();
        java.lang.Double double28 = extendedProperties20.getDouble("hi!", (java.lang.Double) 100.0d);
        java.lang.Long long31 = extendedProperties20.getLong("}", (java.lang.Long) 97L);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj35 = extendedProperties33.getProperty("");
        java.util.List list37 = extendedProperties33.getList("hi!");
        java.lang.String str39 = extendedProperties33.interpolate("");
        java.lang.Short short42 = extendedProperties33.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator43 = extendedProperties33.getKeys();
        java.lang.Byte byte46 = extendedProperties33.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list50 = extendedProperties48.getList("");
        extendedProperties48.setInclude("hi!");
        extendedProperties48.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj58 = extendedProperties56.getProperty("");
        java.util.List list60 = extendedProperties56.getList("hi!");
        short short63 = extendedProperties56.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties65 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj67 = extendedProperties65.getProperty("");
        long long70 = extendedProperties65.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList71 = extendedProperties65.keysAsListed;
        java.util.Vector vector73 = extendedProperties65.getVector("");
        java.util.Vector vector74 = extendedProperties56.getVector("}", vector73);
        java.util.Vector vector75 = extendedProperties48.getVector("}", vector74);
        java.util.Vector vector76 = extendedProperties33.getVector("/", vector74);
        java.util.List list77 = extendedProperties20.getList("hi!", (java.util.List) vector76);
        java.util.Vector vector78 = extendedProperties0.getVector("${", vector76);
        byte byte81 = extendedProperties0.getByte("${", (byte) 1);
        java.lang.String str82 = extendedProperties0.basePath;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) -1 + "'", short42 == (short) -1);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 0 + "'", byte46 == (byte) 0);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + short63 + "' != '" + (short) 10 + "'", short63 == (short) 10);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 100L + "'", long70 == 100L);
        org.junit.Assert.assertNotNull(arrayList71);
        org.junit.Assert.assertNotNull(vector73);
        org.junit.Assert.assertNotNull(vector74);
        org.junit.Assert.assertNotNull(vector75);
        org.junit.Assert.assertNotNull(vector76);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertNotNull(vector78);
        org.junit.Assert.assertTrue("'" + byte81 + "' != '" + (byte) 1 + "'", byte81 == (byte) 1);
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        byte byte12 = extendedProperties0.getByte("}", (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list16 = extendedProperties14.getList("");
        extendedProperties14.setInclude("hi!");
        extendedProperties14.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj24 = extendedProperties22.getProperty("");
        java.util.List list26 = extendedProperties22.getList("hi!");
        short short29 = extendedProperties22.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj33 = extendedProperties31.getProperty("");
        long long36 = extendedProperties31.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList37 = extendedProperties31.keysAsListed;
        java.util.Vector vector39 = extendedProperties31.getVector("");
        java.util.Vector vector40 = extendedProperties22.getVector("}", vector39);
        java.util.Vector vector41 = extendedProperties14.getVector("}", vector40);
        java.util.Vector vector42 = extendedProperties0.getVector("/", vector40);
        // The following exception was thrown during execution in test generation
        try {
            double double44 = extendedProperties0.getDouble("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 10 + "'", short29 == (short) 10);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertNotNull(vector39);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertNotNull(vector42);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        extendedProperties0.setInclude("hi!");
        java.lang.String str8 = extendedProperties0.testBoolean("hi!");
        float float11 = extendedProperties0.getFloat("${", (float) 0);
        java.lang.String str12 = extendedProperties0.fileSeparator;
        java.lang.String str14 = extendedProperties0.interpolate("hi!");
        java.util.ArrayList arrayList15 = null;
        extendedProperties0.keysAsListed = arrayList15;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedProperties0.getInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        java.lang.String[] strArray9 = extendedProperties0.getStringArray("${");
        java.lang.Integer int12 = extendedProperties0.getInteger(",", (java.lang.Integer) (-1));
        java.lang.String str14 = extendedProperties0.getString("hi!");
        java.util.Iterator iterator16 = extendedProperties0.getKeys("hi!");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        double double9 = extendedProperties0.getDouble("/", (double) 1.0f);
        extendedProperties0.display();
        extendedProperties0.fileSeparator = "";
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list11 = extendedProperties9.getList("");
        java.lang.String str13 = extendedProperties9.testBoolean("");
        double double16 = extendedProperties9.getDouble("/", (double) 10L);
        java.util.List list18 = extendedProperties9.getList("");
        java.lang.String str19 = extendedProperties0.interpolateHelper("${", list18);
        java.util.Iterator iterator20 = extendedProperties0.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj23 = extendedProperties21.getProperty("");
        long long26 = extendedProperties21.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList27 = extendedProperties21.keysAsListed;
        java.util.Vector vector29 = extendedProperties21.getVector("");
        extendedProperties21.display();
        java.lang.Double double33 = extendedProperties21.getDouble("", (java.lang.Double) 10.0d);
        java.lang.Boolean boolean36 = extendedProperties21.getBoolean("${", (java.lang.Boolean) false);
        extendedProperties0.combine(extendedProperties21);
        boolean boolean38 = extendedProperties21.isInitialized;
        boolean boolean39 = extendedProperties21.isInitialized;
        java.lang.Integer int42 = extendedProperties21.getInteger("", (java.lang.Integer) 32);
        double double45 = extendedProperties21.getDouble("", (double) (short) -1);
        java.lang.String str46 = extendedProperties21.getInclude();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "${" + "'", str19, "${");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNotNull(arrayList27);
        org.junit.Assert.assertNotNull(vector29);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        int int6 = propertiesReader3.read();
        propertiesReader3.mark(0);
        propertiesReader3.mark(10);
        propertiesReader3.mark(97);
        boolean boolean13 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        boolean boolean4 = extendedProperties0.isInitialized;
        java.lang.String[] strArray6 = extendedProperties0.getStringArray("}");
        java.lang.Short short9 = extendedProperties0.getShort("}", (java.lang.Short) (short) 0);
        double double12 = extendedProperties0.getDouble("hi!", 0.0d);
        float float15 = extendedProperties0.getFloat("", (float) 52);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 52.0f + "'", float15 == 52.0f);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        java.lang.String str11 = extendedProperties0.file;
        java.lang.Long long14 = extendedProperties0.getLong("/", (java.lang.Long) 1L);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj17 = extendedProperties15.getProperty("");
        java.util.List list19 = extendedProperties15.getList("hi!");
        extendedProperties15.setInclude("hi!");
        java.lang.String str23 = extendedProperties15.testBoolean("");
        java.lang.String str26 = extendedProperties15.getString("hi!", "/");
        java.lang.Object obj28 = extendedProperties15.getProperty("}");
        java.lang.Integer int31 = extendedProperties15.getInteger("", (java.lang.Integer) 52);
        boolean boolean32 = extendedProperties15.isInitialized;
        java.util.ArrayList arrayList33 = extendedProperties15.keysAsListed;
        extendedProperties0.keysAsListed = arrayList33;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/" + "'", str26, "/");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(arrayList33);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        java.lang.String str7 = propertiesReader3.readProperty();
        java.lang.String str8 = propertiesReader3.readProperty();
        propertiesReader3.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("");
        long long8 = extendedProperties0.getLong("/", (long) (short) 0);
        float float11 = extendedProperties0.getFloat("/", 10.0f);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.util.List list17 = extendedProperties13.getList("hi!");
        short short20 = extendedProperties13.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj24 = extendedProperties22.getProperty("");
        long long27 = extendedProperties22.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList28 = extendedProperties22.keysAsListed;
        java.util.Vector vector30 = extendedProperties22.getVector("");
        java.util.Vector vector31 = extendedProperties13.getVector("}", vector30);
        boolean boolean32 = extendedProperties13.isInitialized;
        boolean boolean35 = extendedProperties13.getBoolean(",", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = extendedProperties13.subset("${");
        extendedProperties0.setProperty("${", (java.lang.Object) extendedProperties13);
        // The following exception was thrown during execution in test generation
        try {
            double double40 = extendedProperties13.getDouble("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(arrayList28);
        org.junit.Assert.assertNotNull(vector30);
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(extendedProperties37);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.lang.String str15 = extendedProperties11.interpolate("}");
        java.lang.String str17 = extendedProperties11.interpolate("");
        extendedProperties0.addProperty("/", (java.lang.Object) extendedProperties11);
        java.util.Properties properties20 = extendedProperties11.getProperties("");
        boolean boolean21 = extendedProperties11.isInitialized();
        java.util.Properties properties23 = extendedProperties11.getProperties("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties23);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(extendedProperties24);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        java.lang.String str4 = propertiesTokenizer1.nextToken("${");
        java.lang.String str6 = propertiesTokenizer1.nextToken(",");
        java.lang.String str8 = propertiesTokenizer1.nextToken(",");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "/" + "'", obj2, "/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        java.lang.String[] strArray10 = extendedProperties0.getStringArray("hi!");
        java.lang.Integer int13 = extendedProperties0.getInteger("", (java.lang.Integer) 97);
        java.util.Properties properties15 = extendedProperties0.getProperties("hi!");
        java.lang.String str16 = extendedProperties0.getInclude();
        java.lang.Integer int19 = extendedProperties0.getInteger("${", (java.lang.Integer) 52);
        java.util.Iterator iterator21 = extendedProperties0.getKeys("${");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties4);
        java.lang.Byte byte8 = extendedProperties5.getByte("${", (java.lang.Byte) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = extendedProperties5.getDouble("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties4);
        java.util.Properties properties7 = extendedProperties5.getProperties("/");
        java.util.List list9 = extendedProperties5.getList("}");
        java.util.Iterator iterator10 = extendedProperties5.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        java.util.List list16 = extendedProperties12.getList("hi!");
        extendedProperties12.setInclude("hi!");
        java.util.List list20 = extendedProperties12.getList("hi!");
        java.lang.String str21 = extendedProperties12.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = extendedProperties12.subset("/");
        extendedProperties12.setInclude(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str28 = extendedProperties27.fileSeparator;
        java.util.Vector vector30 = extendedProperties27.getVector("${");
        byte byte33 = extendedProperties27.getByte("${", (byte) -1);
        java.lang.String str34 = extendedProperties27.fileSeparator;
        java.util.Vector vector36 = extendedProperties27.getVector(",");
        java.util.List list37 = extendedProperties12.getList(",", (java.util.List) vector36);
        int int40 = extendedProperties12.getInteger("}", (int) (byte) 100);
        extendedProperties5.setProperty("", (java.lang.Object) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj45 = extendedProperties43.getProperty("");
        java.lang.String str46 = extendedProperties43.file;
        extendedProperties43.clearProperty("");
        java.lang.String str51 = extendedProperties43.getString("}", "");
        java.util.Properties properties53 = extendedProperties43.getProperties("/");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Properties properties54 = extendedProperties5.getProperties("", properties53);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '' doesn't map to a String/List object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(extendedProperties5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(extendedProperties23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/" + "'", str28, "/");
        org.junit.Assert.assertNotNull(vector30);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) -1 + "'", byte33 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "/" + "'", str34, "/");
        org.junit.Assert.assertNotNull(vector36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(properties53);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.util.Vector vector3 = extendedProperties0.getVector("${");
        java.lang.String str5 = extendedProperties0.interpolate("");
        extendedProperties0.setInclude(",");
        java.lang.String str9 = extendedProperties0.testBoolean("");
        // The following exception was thrown during execution in test generation
        try {
            byte byte11 = extendedProperties0.getByte("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/ doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNotNull(vector3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        byte byte12 = extendedProperties0.getByte("}", (byte) 0);
        extendedProperties0.setInclude("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj17 = extendedProperties15.getProperty("");
        java.util.List list19 = extendedProperties15.getList("hi!");
        extendedProperties15.setInclude("hi!");
        java.util.List list23 = extendedProperties15.getList("hi!");
        java.lang.String str24 = extendedProperties15.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = extendedProperties15.subset("/");
        java.util.ArrayList arrayList27 = extendedProperties15.keysAsListed;
        extendedProperties0.keysAsListed = arrayList27;
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj32 = extendedProperties30.getProperty("");
        java.util.List list34 = extendedProperties30.getList("hi!");
        java.lang.Long long37 = extendedProperties30.getLong("}", (java.lang.Long) (-1L));
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj41 = extendedProperties39.getProperty("");
        java.util.List list43 = extendedProperties39.getList("hi!");
        short short46 = extendedProperties39.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj50 = extendedProperties48.getProperty("");
        long long53 = extendedProperties48.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList54 = extendedProperties48.keysAsListed;
        java.util.Vector vector56 = extendedProperties48.getVector("");
        java.util.Vector vector57 = extendedProperties39.getVector("}", vector56);
        java.lang.String str58 = extendedProperties30.interpolateHelper("", (java.util.List) vector57);
        java.util.Vector vector59 = extendedProperties0.getVector(",", vector57);
        java.lang.Boolean boolean62 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        byte byte65 = extendedProperties0.getByte("${", (byte) 100);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(extendedProperties26);
        org.junit.Assert.assertNotNull(arrayList27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 10 + "'", short46 == (short) 10);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 100L + "'", long53 == 100L);
        org.junit.Assert.assertNotNull(arrayList54);
        org.junit.Assert.assertNotNull(vector56);
        org.junit.Assert.assertNotNull(vector57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(vector59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) 100 + "'", byte65 == (byte) 100);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        long long7 = propertiesReader3.skip(100L);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader8 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.lang.String str9 = propertiesReader8.readLine();
        java.io.Reader reader10 = java.io.Reader.nullReader();
        char[] charArray11 = new char[] {};
        int int12 = reader10.read(charArray11);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader13 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader10);
        boolean boolean14 = propertiesReader13.markSupported();
        java.lang.String str15 = propertiesReader13.readLine();
        java.lang.String str16 = propertiesReader13.readProperty();
        boolean boolean17 = propertiesReader13.markSupported();
        java.lang.String str18 = propertiesReader13.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader19 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader13);
        long long21 = propertiesReader19.skip((long) (byte) 100);
        java.io.Reader reader22 = java.io.Reader.nullReader();
        char[] charArray23 = new char[] {};
        int int24 = reader22.read(charArray23);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader25 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader22);
        char[] charArray32 = new char[] { 'a', ' ', '#', ' ', '#', ' ' };
        int int33 = reader22.read(charArray32);
        int int34 = propertiesReader19.read(charArray32);
        int int37 = propertiesReader8.read(charArray32, 1, 0);
        propertiesReader8.close();
        propertiesReader8.setLineNumber((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = propertiesReader8.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(reader22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', ' ', '#', ' ', '#', ' ' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str11 = extendedProperties0.interpolate("hi!");
        java.lang.String str13 = extendedProperties0.interpolate("}");
        java.lang.String str14 = extendedProperties0.basePath;
        byte byte17 = extendedProperties0.getByte("/", (byte) 0);
        long long20 = extendedProperties0.getLong("${", (long) ' ');
        java.lang.String[] strArray22 = extendedProperties0.getStringArray("${");
        extendedProperties0.fileSeparator = "";
        // The following exception was thrown during execution in test generation
        try {
            long long26 = extendedProperties0.getLong("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        int int6 = propertiesReader3.read();
        propertiesReader3.mark(0);
        int int9 = propertiesReader3.read();
        int int10 = propertiesReader3.read();
        boolean boolean11 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader12 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.util.stream.Stream<java.lang.String> strStream13 = propertiesReader3.lines();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strStream13);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        int int7 = propertiesReader3.read();
        propertiesReader3.setLineNumber(32);
        propertiesReader3.setLineNumber((int) (short) 1);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Byte byte14 = extendedProperties8.getByte("/", (java.lang.Byte) (byte) 10);
        java.lang.String str16 = extendedProperties8.interpolate("/");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/" + "'", str16, "/");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        extendedProperties0.isInitialized = true;
        java.util.Iterator iterator14 = extendedProperties0.getKeys();
        java.lang.String str15 = extendedProperties0.getInclude();
        java.lang.Double double18 = extendedProperties0.getDouble("/", (java.lang.Double) 97.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj21 = extendedProperties19.getProperty("");
        java.lang.String str22 = extendedProperties19.file;
        java.lang.String str24 = extendedProperties19.testBoolean("hi!");
        java.util.Properties properties26 = extendedProperties19.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties26);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties26);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties26);
        java.lang.Long long32 = extendedProperties29.getLong(",", (java.lang.Long) 35L);
        float float35 = extendedProperties29.getFloat("hi!", 100.0f);
        extendedProperties0.combine(extendedProperties29);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(extendedProperties27);
        org.junit.Assert.assertNotNull(extendedProperties28);
        org.junit.Assert.assertNotNull(extendedProperties29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 35L + "'", long32 == 35L);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        float float12 = extendedProperties9.getFloat("}", (float) 0);
        java.lang.String str15 = extendedProperties9.getString(",", "/");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/" + "'", str15, "/");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        int int2 = propertiesTokenizer1.countTokens();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.lang.String str11 = extendedProperties0.getInclude();
        byte byte14 = extendedProperties0.getByte("/", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list18 = extendedProperties16.getList("");
        extendedProperties16.setInclude("hi!");
        java.util.Properties properties22 = null;
        java.util.Properties properties23 = extendedProperties16.getProperties("", properties22);
        int int26 = extendedProperties16.getInt("hi!", (int) (short) -1);
        java.lang.Byte byte29 = extendedProperties16.getByte("hi!", (java.lang.Byte) (byte) 10);
        java.lang.Boolean boolean32 = extendedProperties16.getBoolean("/", (java.lang.Boolean) false);
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list36 = extendedProperties34.getList("");
        java.lang.String str38 = extendedProperties34.testBoolean("");
        double double41 = extendedProperties34.getDouble("/", (double) 10L);
        java.lang.String str43 = extendedProperties34.getString("");
        int int46 = extendedProperties34.getInteger("", (int) (byte) 10);
        double double49 = extendedProperties34.getDouble(",", 32.0d);
        java.util.List list51 = extendedProperties34.getList("${");
        java.lang.String str52 = extendedProperties16.interpolateHelper("}", list51);
        java.lang.String str53 = extendedProperties0.interpolateHelper("/", list51);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 10 + "'", byte29 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 32.0d + "'", double49 == 32.0d);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "}" + "'", str52, "}");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "/" + "'", str53, "/");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        float float12 = extendedProperties9.getFloat("}", (float) 0);
        java.util.Iterator iterator14 = extendedProperties9.getKeys("");
        byte byte17 = extendedProperties9.getByte("", (byte) 0);
        java.util.Iterator iterator19 = extendedProperties9.getKeys("hi!");
        java.io.InputStream inputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties9.load(inputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.lang.String str15 = extendedProperties11.interpolate("}");
        java.lang.String str17 = extendedProperties11.interpolate("");
        extendedProperties0.addProperty("/", (java.lang.Object) extendedProperties11);
        java.util.Properties properties20 = extendedProperties11.getProperties("");
        // The following exception was thrown during execution in test generation
        try {
            double double22 = extendedProperties11.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.io.OutputStream outputStream2 = null;
        extendedProperties0.save(outputStream2, "hi!");
        extendedProperties0.display();
        extendedProperties0.setInclude(",");
        java.lang.String str9 = extendedProperties0.getString("${");
        java.lang.Boolean boolean12 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass13 = extendedProperties0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        java.lang.Long long10 = extendedProperties0.getLong("hi!", (java.lang.Long) 100L);
        java.lang.Integer int13 = extendedProperties0.getInteger("hi!", (java.lang.Integer) 35);
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list10 = extendedProperties8.getList("");
        double double13 = extendedProperties8.getDouble("hi!", 100.0d);
        extendedProperties0.setProperty("", (java.lang.Object) 100.0d);
        extendedProperties0.setInclude("/");
        java.lang.String str17 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj20 = extendedProperties18.getProperty("");
        long long23 = extendedProperties18.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList24 = extendedProperties18.keysAsListed;
        java.util.Vector vector26 = extendedProperties18.getVector("");
        extendedProperties18.display();
        java.lang.Double double30 = extendedProperties18.getDouble("", (java.lang.Double) 10.0d);
        extendedProperties0.combine(extendedProperties18);
        java.lang.String str33 = extendedProperties18.testBoolean("/");
        java.lang.Double double36 = extendedProperties18.getDouble("}", (java.lang.Double) 35.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj40 = extendedProperties38.getProperty("");
        java.util.List list42 = extendedProperties38.getList("hi!");
        java.lang.String str44 = extendedProperties38.interpolate("");
        java.lang.Short short47 = extendedProperties38.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator48 = extendedProperties38.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj52 = extendedProperties50.getProperty("");
        java.lang.String str53 = extendedProperties50.file;
        java.lang.String str55 = extendedProperties50.testBoolean("hi!");
        java.util.Properties properties57 = extendedProperties50.getProperties("/");
        java.util.Properties properties58 = extendedProperties38.getProperties("", properties57);
        java.util.Vector vector60 = extendedProperties38.getVector(",");
        java.lang.String str61 = extendedProperties18.interpolateHelper("${", (java.util.List) vector60);
        java.lang.Byte byte64 = extendedProperties18.getByte("/", (java.lang.Byte) (byte) 1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/" + "'", str17, "/");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 35.0d + "'", double36 == 35.0d);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) -1 + "'", short47 == (short) -1);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertNotNull(vector60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "${" + "'", str61, "${");
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 1 + "'", byte64 == (byte) 1);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.Object obj7 = extendedProperties0.getProperty("hi!");
        boolean boolean8 = extendedProperties0.isInitialized();
        java.lang.Object obj10 = extendedProperties0.getProperty("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        long long17 = extendedProperties12.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList18 = extendedProperties12.keysAsListed;
        java.lang.String str19 = extendedProperties12.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list23 = extendedProperties21.getList("");
        java.lang.String str25 = extendedProperties21.testBoolean("");
        double double28 = extendedProperties21.getDouble("/", (double) 10L);
        java.util.List list30 = extendedProperties21.getList("");
        java.lang.String str31 = extendedProperties12.interpolateHelper("${", list30);
        java.util.Iterator iterator32 = extendedProperties12.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj35 = extendedProperties33.getProperty("");
        long long38 = extendedProperties33.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList39 = extendedProperties33.keysAsListed;
        java.util.Vector vector41 = extendedProperties33.getVector("");
        extendedProperties33.display();
        java.lang.Double double45 = extendedProperties33.getDouble("", (java.lang.Double) 10.0d);
        java.lang.Boolean boolean48 = extendedProperties33.getBoolean("${", (java.lang.Boolean) false);
        extendedProperties12.combine(extendedProperties33);
        java.lang.Short short52 = extendedProperties33.getShort("/", (java.lang.Short) (short) 10);
        java.util.Properties properties54 = extendedProperties33.getProperties("${");
        java.util.Properties properties55 = extendedProperties0.getProperties("", properties54);
        java.lang.String[] strArray57 = extendedProperties0.getStringArray("");
        extendedProperties0.isInitialized = true;
        boolean boolean62 = extendedProperties0.getBoolean("", false);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(arrayList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/" + "'", str19, "/");
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "${" + "'", str31, "${");
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(arrayList39);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 10 + "'", short52 == (short) 10);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(10);
        boolean boolean9 = propertiesReader3.markSupported();
        propertiesReader3.mark((int) (short) 1);
        java.lang.String str12 = propertiesReader3.readProperty();
        java.lang.String str13 = propertiesReader3.readLine();
        long long15 = propertiesReader3.skip((long) (byte) 100);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list11 = extendedProperties9.getList("");
        java.lang.String str13 = extendedProperties9.testBoolean("");
        double double16 = extendedProperties9.getDouble("/", (double) 10L);
        java.util.List list18 = extendedProperties9.getList("");
        java.lang.String str19 = extendedProperties0.interpolateHelper("${", list18);
        java.util.Iterator iterator20 = extendedProperties0.getKeys();
        java.lang.Boolean boolean23 = extendedProperties0.getBoolean("${", (java.lang.Boolean) false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "${" + "'", str19, "${");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        extendedProperties0.display();
        java.lang.Double double12 = extendedProperties0.getDouble("", (java.lang.Double) 10.0d);
        java.util.Iterator iterator13 = extendedProperties0.getKeys();
        byte byte16 = extendedProperties0.getByte("", (byte) 100);
        extendedProperties0.display();
        java.lang.Boolean boolean20 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
        int int2 = propertiesTokenizer1.countTokens();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        boolean boolean5 = propertiesTokenizer1.hasMoreElements();
        boolean boolean6 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "}" + "'", obj3, "}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        java.lang.String[] strArray9 = extendedProperties0.getStringArray("${");
        java.lang.Integer int12 = extendedProperties0.getInteger(",", (java.lang.Integer) (-1));
        byte byte15 = extendedProperties0.getByte("", (byte) 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = extendedProperties0.subset("${");
        extendedProperties0.basePath = "${";
        java.lang.Integer int12 = extendedProperties0.getInteger("/", (java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        int int2 = propertiesTokenizer1.countTokens();
        boolean boolean3 = propertiesTokenizer1.hasMoreElements();
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.Object obj7 = extendedProperties0.getProperty("hi!");
        boolean boolean8 = extendedProperties0.isInitialized();
        java.lang.Object obj10 = extendedProperties0.getProperty("hi!");
        java.lang.Short short13 = extendedProperties0.getShort("${", (java.lang.Short) (short) 10);
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        java.lang.Object obj9 = extendedProperties0.getProperty("${");
        float float12 = extendedProperties0.getFloat(",", (float) (byte) -1);
        java.lang.String str14 = extendedProperties0.testBoolean("/");
        java.lang.String str15 = extendedProperties0.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj18 = extendedProperties16.getProperty("");
        long long21 = extendedProperties16.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList22 = extendedProperties16.keysAsListed;
        boolean boolean25 = extendedProperties16.getBoolean("", false);
        boolean boolean28 = extendedProperties16.getBoolean("/", true);
        boolean boolean29 = extendedProperties16.isInitialized;
        java.lang.Long long32 = extendedProperties16.getLong("/", (java.lang.Long) 10L);
        extendedProperties0.combine(extendedProperties16);
        java.lang.String str35 = extendedProperties0.testBoolean("}");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(arrayList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        int int12 = extendedProperties9.getInt("hi!", (int) (byte) 100);
        boolean boolean15 = extendedProperties9.getBoolean(",", true);
        java.lang.String str16 = extendedProperties9.file;
        java.lang.String str18 = extendedProperties9.getString(",");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        extendedProperties0.isInitialized = true;
        java.lang.String str15 = extendedProperties0.getString("}");
        int int18 = extendedProperties0.getInteger("/", 52);
        java.lang.String[] strArray20 = extendedProperties0.getStringArray("/");
        byte byte23 = extendedProperties0.getByte("}", (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj26 = extendedProperties24.getProperty("");
        java.util.List list28 = extendedProperties24.getList("hi!");
        java.lang.Long long31 = extendedProperties24.getLong("}", (java.lang.Long) (-1L));
        int int34 = extendedProperties24.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj37 = extendedProperties35.getProperty("");
        java.util.List list39 = extendedProperties35.getList("hi!");
        java.lang.String str41 = extendedProperties35.interpolate("");
        java.lang.Short short44 = extendedProperties35.getShort("", (java.lang.Short) (short) -1);
        extendedProperties24.combine(extendedProperties35);
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj49 = extendedProperties47.getProperty("");
        java.util.List list51 = extendedProperties47.getList("hi!");
        java.lang.Long long54 = extendedProperties47.getLong("}", (java.lang.Long) (-1L));
        int int57 = extendedProperties47.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj60 = extendedProperties58.getProperty("");
        java.util.List list62 = extendedProperties58.getList("hi!");
        java.lang.String str64 = extendedProperties58.interpolate("");
        java.lang.Short short67 = extendedProperties58.getShort("", (java.lang.Short) (short) -1);
        extendedProperties47.combine(extendedProperties58);
        org.apache.commons.collections.ExtendedProperties extendedProperties70 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj72 = extendedProperties70.getProperty("");
        java.lang.String str73 = extendedProperties70.file;
        byte byte76 = extendedProperties70.getByte("", (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties78 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list80 = extendedProperties78.getList("");
        java.util.Properties properties82 = extendedProperties78.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties83 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties82);
        java.util.Properties properties85 = extendedProperties83.getProperties("/");
        java.util.Properties properties86 = extendedProperties70.getProperties("${", properties85);
        java.util.Properties properties87 = extendedProperties47.getProperties("hi!", properties85);
        java.lang.String str88 = extendedProperties47.getInclude();
        extendedProperties24.setProperty("}", (java.lang.Object) str88);
        java.lang.Byte byte92 = extendedProperties24.getByte("${", (java.lang.Byte) (byte) 1);
        extendedProperties24.isInitialized = true;
        extendedProperties0.combine(extendedProperties24);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 1 + "'", byte23 == (byte) 1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) -1 + "'", short44 == (short) -1);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + short67 + "' != '" + (short) -1 + "'", short67 == (short) -1);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 1 + "'", byte76 == (byte) 1);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertNotNull(properties82);
        org.junit.Assert.assertNotNull(extendedProperties83);
        org.junit.Assert.assertNotNull(properties85);
        org.junit.Assert.assertNotNull(properties86);
        org.junit.Assert.assertNotNull(properties87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertTrue("'" + byte92 + "' != '" + (byte) 1 + "'", byte92 == (byte) 1);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        java.lang.String str5 = propertiesTokenizer1.nextToken();
        java.lang.String str7 = propertiesTokenizer1.nextToken("hi!");
        java.lang.Object obj8 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "}" + "'", obj2, "}");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        int int8 = propertiesReader3.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.lang.String str11 = extendedProperties0.getInclude();
        byte byte14 = extendedProperties0.getByte("/", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj18 = extendedProperties16.getProperty("");
        java.util.List list20 = extendedProperties16.getList("hi!");
        java.lang.String str22 = extendedProperties16.interpolate("");
        java.lang.Short short25 = extendedProperties16.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str27 = extendedProperties16.interpolate("hi!");
        boolean boolean28 = extendedProperties16.isInitialized;
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties16);
        java.util.ArrayList arrayList30 = extendedProperties0.keysAsListed;
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(arrayList30);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        java.lang.String str13 = extendedProperties0.interpolate("hi!");
        java.lang.Boolean boolean16 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        boolean boolean17 = extendedProperties0.isInitialized;
        java.lang.Float float20 = extendedProperties0.getFloat("${", (java.lang.Float) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = extendedProperties0.getInteger("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.display();
        extendedProperties8.setInclude("");
        java.lang.Short short14 = extendedProperties8.getShort("", (java.lang.Short) (short) -1);
        java.util.List list16 = extendedProperties8.getList("");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list20 = extendedProperties18.getList("");
        double double23 = extendedProperties18.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = extendedProperties18.subset("${");
        java.lang.String str26 = extendedProperties18.basePath;
        java.util.ArrayList arrayList27 = extendedProperties18.keysAsListed;
        java.io.Reader reader29 = java.io.Reader.nullReader();
        char[] charArray30 = new char[] {};
        int int31 = reader29.read(charArray30);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader32 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader29);
        boolean boolean33 = propertiesReader32.markSupported();
        java.lang.String str34 = propertiesReader32.readLine();
        java.util.stream.Stream<java.lang.String> strStream35 = propertiesReader32.lines();
        extendedProperties18.addProperty("", (java.lang.Object) strStream35);
        java.lang.Object obj38 = extendedProperties18.getProperty("${");
        java.lang.String str39 = extendedProperties18.getInclude();
        java.lang.String str41 = extendedProperties18.interpolate("");
        extendedProperties8.addProperty("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(arrayList27);
        org.junit.Assert.assertNotNull(reader29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strStream35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader7.setLineNumber((int) (short) 1);
        java.lang.String str10 = propertiesReader7.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader7);
        java.nio.CharBuffer charBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = propertiesReader11.read(charBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader3.mark((int) (byte) 10);
        long long13 = propertiesReader3.skip(1L);
        int int14 = propertiesReader3.read();
        int int15 = propertiesReader3.read();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        java.lang.String[] strArray9 = extendedProperties0.getStringArray("${");
        boolean boolean10 = extendedProperties0.isInitialized();
        boolean boolean13 = extendedProperties0.getBoolean("}", true);
        long long16 = extendedProperties0.getLong("}", 97L);
        java.lang.String str17 = extendedProperties0.file;
        java.lang.String str19 = extendedProperties0.getString("${");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list10 = extendedProperties8.getList("");
        double double13 = extendedProperties8.getDouble("hi!", 100.0d);
        extendedProperties0.setProperty("", (java.lang.Object) 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj17 = extendedProperties15.getProperty("");
        java.lang.String str18 = extendedProperties15.file;
        java.lang.String str20 = extendedProperties15.testBoolean("hi!");
        java.util.Properties properties22 = extendedProperties15.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties22);
        extendedProperties23.display();
        java.util.ArrayList arrayList25 = extendedProperties23.keysAsListed;
        extendedProperties0.keysAsListed = arrayList25;
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj29 = extendedProperties27.getProperty("");
        long long32 = extendedProperties27.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList33 = extendedProperties27.keysAsListed;
        java.util.Vector vector35 = extendedProperties27.getVector("");
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj39 = extendedProperties37.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        short short44 = extendedProperties41.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj48 = extendedProperties46.getProperty("");
        java.util.List list50 = extendedProperties46.getList("hi!");
        extendedProperties41.addProperty("", (java.lang.Object) list50);
        java.lang.String str52 = extendedProperties37.interpolateHelper("", list50);
        java.util.List list53 = extendedProperties27.getList("/", list50);
        extendedProperties27.fileSeparator = "${";
        int int58 = extendedProperties27.getInteger("hi!", 100);
        double double61 = extendedProperties27.getDouble(",", (double) 10L);
        extendedProperties27.file = "${";
        extendedProperties27.basePath = "${";
        java.lang.String str67 = extendedProperties27.getString("${");
        extendedProperties0.combine(extendedProperties27);
        java.lang.Long long71 = extendedProperties0.getLong("}", (java.lang.Long) 52L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNotNull(extendedProperties23);
        org.junit.Assert.assertNotNull(arrayList25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertNotNull(arrayList33);
        org.junit.Assert.assertNotNull(vector35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 10 + "'", short44 == (short) 10);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 52L + "'", long71 == 52L);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        java.lang.String str17 = extendedProperties11.interpolate("");
        java.lang.Short short20 = extendedProperties11.getShort("", (java.lang.Short) (short) -1);
        extendedProperties0.combine(extendedProperties11);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj25 = extendedProperties23.getProperty("");
        java.util.List list27 = extendedProperties23.getList("hi!");
        java.lang.Long long30 = extendedProperties23.getLong("}", (java.lang.Long) (-1L));
        int int33 = extendedProperties23.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj36 = extendedProperties34.getProperty("");
        java.util.List list38 = extendedProperties34.getList("hi!");
        java.lang.String str40 = extendedProperties34.interpolate("");
        java.lang.Short short43 = extendedProperties34.getShort("", (java.lang.Short) (short) -1);
        extendedProperties23.combine(extendedProperties34);
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj48 = extendedProperties46.getProperty("");
        java.lang.String str49 = extendedProperties46.file;
        byte byte52 = extendedProperties46.getByte("", (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list56 = extendedProperties54.getList("");
        java.util.Properties properties58 = extendedProperties54.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties59 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties58);
        java.util.Properties properties61 = extendedProperties59.getProperties("/");
        java.util.Properties properties62 = extendedProperties46.getProperties("${", properties61);
        java.util.Properties properties63 = extendedProperties23.getProperties("hi!", properties61);
        java.lang.String str64 = extendedProperties23.getInclude();
        extendedProperties0.setProperty("}", (java.lang.Object) str64);
        org.apache.commons.collections.ExtendedProperties extendedProperties67 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj69 = extendedProperties67.getProperty("");
        java.util.List list71 = extendedProperties67.getList("hi!");
        java.lang.String str74 = extendedProperties67.getString("hi!", "");
        java.lang.String str75 = extendedProperties67.file;
        extendedProperties0.setProperty("/", (java.lang.Object) extendedProperties67);
        java.util.Vector vector78 = extendedProperties0.getVector("}");
        java.util.Properties properties80 = extendedProperties0.getProperties("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) -1 + "'", short43 == (short) -1);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertNotNull(extendedProperties59);
        org.junit.Assert.assertNotNull(properties61);
        org.junit.Assert.assertNotNull(properties62);
        org.junit.Assert.assertNotNull(properties63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(vector78);
        org.junit.Assert.assertNotNull(properties80);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer12 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        java.lang.Object obj13 = propertiesTokenizer12.nextElement();
        java.lang.String str15 = propertiesTokenizer12.nextToken("${");
        java.util.Iterator<java.lang.Object> objItor16 = propertiesTokenizer12.asIterator();
        extendedProperties9.setProperty("/", (java.lang.Object) objItor16);
        long long20 = extendedProperties9.getLong("}", (long) (short) 100);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "/" + "'", obj13, "/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj10 = extendedProperties8.getProperty("");
        java.lang.String str11 = extendedProperties8.file;
        java.lang.String str13 = extendedProperties8.testBoolean("hi!");
        java.util.Properties properties15 = extendedProperties8.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties15);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties15);
        int int20 = extendedProperties17.getInt("hi!", (int) (byte) 100);
        boolean boolean23 = extendedProperties17.getBoolean(",", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list26 = extendedProperties24.getList("");
        double double29 = extendedProperties24.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = extendedProperties24.subset("${");
        extendedProperties24.basePath = "${";
        java.util.ArrayList arrayList34 = extendedProperties24.keysAsListed;
        extendedProperties17.keysAsListed = arrayList34;
        extendedProperties0.combine(extendedProperties17);
        java.lang.String str39 = extendedProperties17.getString("/", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj43 = extendedProperties41.getProperty("");
        java.util.List list45 = extendedProperties41.getList("hi!");
        extendedProperties41.setInclude("hi!");
        java.util.List list49 = extendedProperties41.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        short short53 = extendedProperties50.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties55 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj57 = extendedProperties55.getProperty("");
        java.util.List list59 = extendedProperties55.getList("hi!");
        extendedProperties50.addProperty("", (java.lang.Object) list59);
        java.lang.String str61 = extendedProperties50.getInclude();
        extendedProperties50.isInitialized = true;
        java.lang.Long long66 = extendedProperties50.getLong("hi!", (java.lang.Long) (-1L));
        byte byte69 = extendedProperties50.getByte(",", (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties71 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list73 = extendedProperties71.getList("");
        extendedProperties71.setInclude("hi!");
        extendedProperties71.setInclude("hi!");
        java.lang.String str78 = extendedProperties71.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties79 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list81 = extendedProperties79.getList("");
        double double84 = extendedProperties79.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties86 = extendedProperties79.subset("${");
        extendedProperties79.basePath = "${";
        java.util.ArrayList arrayList89 = extendedProperties79.keysAsListed;
        extendedProperties71.keysAsListed = arrayList89;
        java.util.List list91 = extendedProperties50.getList("/", (java.util.List) arrayList89);
        extendedProperties41.keysAsListed = arrayList89;
        java.util.List list93 = extendedProperties17.getList("}", (java.util.List) arrayList89);
        long long96 = extendedProperties17.getLong("${", (long) '4');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(extendedProperties16);
        org.junit.Assert.assertNotNull(extendedProperties17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties31);
        org.junit.Assert.assertNotNull(arrayList34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "," + "'", str39, ",");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 10 + "'", short53 == (short) 10);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertTrue("'" + byte69 + "' != '" + (byte) 10 + "'", byte69 == (byte) 10);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 100.0d + "'", double84 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties86);
        org.junit.Assert.assertNotNull(arrayList89);
        org.junit.Assert.assertNotNull(list91);
        org.junit.Assert.assertNotNull(list93);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 52L + "'", long96 == 52L);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.display();
        int int12 = extendedProperties8.getInteger("${", (int) (byte) 10);
        java.lang.String[] strArray14 = extendedProperties8.getStringArray("/");
        int int17 = extendedProperties8.getInt(",", (int) (byte) 10);
        java.lang.String str18 = extendedProperties8.basePath;
        float float21 = extendedProperties8.getFloat(",", (float) 35L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 35.0f + "'", float21 == 35.0f);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        java.lang.String str11 = extendedProperties0.file;
        java.util.Properties properties13 = extendedProperties0.getProperties("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        java.lang.String str17 = extendedProperties14.getString("hi!", "}");
        java.lang.Double double20 = extendedProperties14.getDouble(",", (java.lang.Double) (-1.0d));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(extendedProperties14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        short short8 = extendedProperties0.getShort("", (short) (byte) 10);
        java.lang.String str9 = extendedProperties0.file;
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        long long18 = extendedProperties13.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList19 = extendedProperties13.keysAsListed;
        java.lang.String str20 = extendedProperties13.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list24 = extendedProperties22.getList("");
        java.lang.String str26 = extendedProperties22.testBoolean("");
        double double29 = extendedProperties22.getDouble("/", (double) 10L);
        java.util.List list31 = extendedProperties22.getList("");
        java.lang.String str32 = extendedProperties13.interpolateHelper("${", list31);
        java.lang.String str33 = extendedProperties0.interpolateHelper("${", list31);
        java.util.Vector vector35 = extendedProperties0.getVector("");
        java.util.Vector vector37 = extendedProperties0.getVector("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(arrayList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "${" + "'", str32, "${");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "${" + "'", str33, "${");
        org.junit.Assert.assertNotNull(vector35);
        org.junit.Assert.assertNotNull(vector37);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        java.lang.String str13 = extendedProperties0.interpolate("hi!");
        extendedProperties0.file = ",";
        java.lang.String str16 = extendedProperties0.file;
        byte byte19 = extendedProperties0.getByte(",", (byte) 10);
        double double22 = extendedProperties0.getDouble("/", 35.0d);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 10 + "'", byte19 == (byte) 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        java.lang.String str17 = extendedProperties11.interpolate("");
        java.lang.Short short20 = extendedProperties11.getShort("", (java.lang.Short) (short) -1);
        extendedProperties0.combine(extendedProperties11);
        long long24 = extendedProperties0.getLong(",", (long) 'a');
        double double27 = extendedProperties0.getDouble("/", (-1.0d));
        extendedProperties0.basePath = ",";
        // The following exception was thrown during execution in test generation
        try {
            int int31 = extendedProperties0.getInt("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor4 = propertiesTokenizer1.asIterator();
        java.lang.String str6 = propertiesTokenizer1.nextToken(",");
        int int7 = propertiesTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor8 = propertiesTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        java.util.List list13 = extendedProperties9.getList("hi!");
        short short16 = extendedProperties9.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj20 = extendedProperties18.getProperty("");
        long long23 = extendedProperties18.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList24 = extendedProperties18.keysAsListed;
        java.util.Vector vector26 = extendedProperties18.getVector("");
        java.util.Vector vector27 = extendedProperties9.getVector("}", vector26);
        java.lang.String str28 = extendedProperties0.interpolateHelper("", (java.util.List) vector27);
        java.lang.Double double31 = extendedProperties0.getDouble("${", (java.lang.Double) 100.0d);
        java.util.Iterator iterator33 = extendedProperties0.getKeys("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj36 = extendedProperties34.getProperty("");
        java.lang.String str37 = extendedProperties34.file;
        java.lang.String str39 = extendedProperties34.testBoolean("hi!");
        java.util.Properties properties41 = extendedProperties34.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties41);
        java.util.Vector vector44 = extendedProperties42.getVector("}");
        java.lang.String str45 = extendedProperties42.fileSeparator;
        java.lang.Object obj47 = extendedProperties42.getProperty("hi!");
        java.util.Iterator iterator49 = extendedProperties42.getKeys("${");
        boolean boolean50 = extendedProperties42.isInitialized();
        java.lang.String str52 = extendedProperties42.getString("");
        extendedProperties0.combine(extendedProperties42);
        java.util.List list55 = extendedProperties0.getList("/");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertNotNull(vector27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(extendedProperties42);
        org.junit.Assert.assertNotNull(vector44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "/" + "'", str45, "/");
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(list55);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        java.lang.String[] strArray10 = extendedProperties0.getStringArray("hi!");
        java.util.Vector vector12 = null;
        java.util.Vector vector13 = extendedProperties0.getVector("/", vector12);
        extendedProperties0.fileSeparator = "}";
        int int18 = extendedProperties0.getInteger(",", (int) (short) 0);
        java.lang.Boolean boolean21 = extendedProperties0.getBoolean("/", (java.lang.Boolean) true);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        byte byte11 = extendedProperties0.getByte("}", (byte) 10);
        java.lang.String str12 = extendedProperties0.getInclude();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        float float7 = extendedProperties0.getFloat("}", (float) 35);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.0f + "'", float7 == 35.0f);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        java.lang.String str6 = extendedProperties0.testBoolean("hi!");
        java.lang.String[] strArray8 = extendedProperties0.getStringArray(",");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.util.List list9 = extendedProperties0.getList("");
        java.util.List list11 = extendedProperties0.getList("hi!");
        java.lang.String str12 = extendedProperties0.file;
        java.util.List list14 = extendedProperties0.getList("/");
        int int17 = extendedProperties0.getInteger(",", (int) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = extendedProperties0.subset("}");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(extendedProperties19);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        short short10 = extendedProperties0.getShort("", (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        short short14 = extendedProperties11.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = extendedProperties11.subset("");
        long long19 = extendedProperties11.getLong("/", (long) (short) 0);
        extendedProperties0.combine(extendedProperties11);
        java.lang.String str21 = extendedProperties11.fileSeparator;
        short short24 = extendedProperties11.getShort("${", (short) 10);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/" + "'", str21, "/");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 10 + "'", short24 == (short) 10);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        long long3 = extendedProperties0.getLong("hi!", (long) 1);
        java.lang.Boolean boolean6 = extendedProperties0.getBoolean("", (java.lang.Boolean) false);
        extendedProperties0.isInitialized = true;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = extendedProperties0.subset("${");
        long long9 = extendedProperties0.getLong("/", (long) (short) 1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(extendedProperties6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str11 = extendedProperties0.interpolate("hi!");
        java.lang.String str13 = extendedProperties0.interpolate("}");
        java.lang.String str16 = extendedProperties0.getString("${", "/");
        java.util.List list18 = extendedProperties0.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj21 = extendedProperties19.getProperty("");
        java.util.List list23 = extendedProperties19.getList("hi!");
        java.lang.Long long26 = extendedProperties19.getLong("}", (java.lang.Long) (-1L));
        int int29 = extendedProperties19.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj32 = extendedProperties30.getProperty("");
        java.util.List list34 = extendedProperties30.getList("hi!");
        java.lang.String str36 = extendedProperties30.interpolate("");
        java.lang.Short short39 = extendedProperties30.getShort("", (java.lang.Short) (short) -1);
        extendedProperties19.combine(extendedProperties30);
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = extendedProperties19.subset("");
        java.lang.String[] strArray44 = extendedProperties19.getStringArray("}");
        extendedProperties19.setInclude("${");
        extendedProperties0.combine(extendedProperties19);
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj51 = extendedProperties49.getProperty("");
        java.util.List list53 = extendedProperties49.getList("hi!");
        extendedProperties49.setInclude("hi!");
        java.util.List list57 = extendedProperties49.getList("hi!");
        java.lang.String str58 = extendedProperties49.getInclude();
        java.util.ArrayList arrayList59 = extendedProperties49.keysAsListed;
        java.util.List list60 = extendedProperties19.getList("hi!", (java.util.List) arrayList59);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/" + "'", str16, "/");
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) -1 + "'", short39 == (short) -1);
        org.junit.Assert.assertNull(extendedProperties42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(arrayList59);
        org.junit.Assert.assertNotNull(list60);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        java.util.Vector vector10 = extendedProperties8.getVector("}");
        java.lang.String str11 = extendedProperties8.fileSeparator;
        java.lang.Boolean boolean14 = extendedProperties8.getBoolean("${", (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            byte byte16 = extendedProperties8.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(vector10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        java.util.Properties properties11 = extendedProperties0.getProperties("");
        extendedProperties0.clearProperty("");
        java.lang.String str14 = extendedProperties0.getInclude();
        extendedProperties0.basePath = ",";
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        byte byte9 = extendedProperties0.getByte("", (byte) 10);
        java.lang.Double double12 = extendedProperties0.getDouble("hi!", (java.lang.Double) 52.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list15 = extendedProperties13.getList("");
        extendedProperties13.setInclude("hi!");
        java.util.Properties properties19 = null;
        java.util.Properties properties20 = extendedProperties13.getProperties("", properties19);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj24 = extendedProperties22.getProperty("");
        java.util.List list26 = extendedProperties22.getList("hi!");
        extendedProperties22.setInclude("hi!");
        java.util.List list30 = extendedProperties22.getList("hi!");
        java.lang.String str31 = extendedProperties22.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = extendedProperties22.subset("/");
        java.util.ArrayList arrayList34 = extendedProperties22.keysAsListed;
        java.util.List list35 = extendedProperties13.getList("", (java.util.List) arrayList34);
        extendedProperties0.keysAsListed = arrayList34;
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str38 = extendedProperties37.fileSeparator;
        java.io.OutputStream outputStream39 = null;
        extendedProperties37.save(outputStream39, "hi!");
        extendedProperties37.display();
        java.lang.Double double45 = extendedProperties37.getDouble(",", (java.lang.Double) 10.0d);
        extendedProperties0.combine(extendedProperties37);
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj50 = extendedProperties48.getProperty("");
        java.util.List list52 = extendedProperties48.getList("hi!");
        java.lang.Long long55 = extendedProperties48.getLong("}", (java.lang.Long) (-1L));
        int int58 = extendedProperties48.getInt("${", (int) (byte) 100);
        java.lang.String str59 = extendedProperties48.file;
        java.util.Properties properties61 = extendedProperties48.getProperties("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties62 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties61);
        int int65 = extendedProperties62.getInt("/", 52);
        java.io.OutputStream outputStream66 = null;
        extendedProperties62.save(outputStream66, "/");
        org.apache.commons.collections.ExtendedProperties extendedProperties70 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list72 = extendedProperties70.getList("");
        extendedProperties70.setInclude("hi!");
        java.util.Properties properties76 = null;
        java.util.Properties properties77 = extendedProperties70.getProperties("", properties76);
        org.apache.commons.collections.ExtendedProperties extendedProperties79 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj81 = extendedProperties79.getProperty("");
        java.util.List list83 = extendedProperties79.getList("hi!");
        extendedProperties79.setInclude("hi!");
        java.util.List list87 = extendedProperties79.getList("hi!");
        java.lang.String str88 = extendedProperties79.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties90 = extendedProperties79.subset("/");
        java.util.ArrayList arrayList91 = extendedProperties79.keysAsListed;
        java.util.List list92 = extendedProperties70.getList("", (java.util.List) arrayList91);
        java.util.List list93 = extendedProperties62.getList("${", list92);
        java.util.List list95 = extendedProperties62.getList(",");
        java.util.List list96 = extendedProperties0.getList("", list95);
        // The following exception was thrown during execution in test generation
        try {
            byte byte98 = extendedProperties0.getByte("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/ doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(extendedProperties33);
        org.junit.Assert.assertNotNull(arrayList34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "/" + "'", str38, "/");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(properties61);
        org.junit.Assert.assertNotNull(extendedProperties62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 52 + "'", int65 == 52);
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertNotNull(properties77);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNotNull(list87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertNull(extendedProperties90);
        org.junit.Assert.assertNotNull(arrayList91);
        org.junit.Assert.assertNotNull(list92);
        org.junit.Assert.assertNotNull(list93);
        org.junit.Assert.assertNotNull(list95);
        org.junit.Assert.assertNotNull(list96);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        java.lang.String str15 = extendedProperties12.file;
        java.lang.String str17 = extendedProperties12.testBoolean("hi!");
        java.util.Properties properties19 = extendedProperties12.getProperties("/");
        java.util.Properties properties20 = extendedProperties0.getProperties("", properties19);
        java.lang.Short short23 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 1);
        java.lang.Integer int26 = extendedProperties0.getInteger("${", (java.lang.Integer) 52);
        java.util.Iterator iterator27 = extendedProperties0.getKeys();
        java.lang.String str29 = extendedProperties0.testBoolean(",");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(10);
        boolean boolean9 = propertiesReader3.markSupported();
        propertiesReader3.mark((int) (short) 1);
        java.lang.String str12 = propertiesReader3.readProperty();
        propertiesReader3.setLineNumber(97);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj10 = extendedProperties8.getProperty("");
        java.lang.String str11 = extendedProperties8.file;
        java.lang.String str13 = extendedProperties8.testBoolean("hi!");
        java.util.Properties properties15 = extendedProperties8.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties15);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties15);
        int int20 = extendedProperties17.getInt("hi!", (int) (byte) 100);
        boolean boolean23 = extendedProperties17.getBoolean(",", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list26 = extendedProperties24.getList("");
        double double29 = extendedProperties24.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = extendedProperties24.subset("${");
        extendedProperties24.basePath = "${";
        java.util.ArrayList arrayList34 = extendedProperties24.keysAsListed;
        extendedProperties17.keysAsListed = arrayList34;
        extendedProperties0.combine(extendedProperties17);
        java.io.Reader reader38 = java.io.Reader.nullReader();
        char[] charArray39 = new char[] {};
        int int40 = reader38.read(charArray39);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader41 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader38);
        propertiesReader41.setLineNumber((int) (byte) 10);
        java.util.stream.Stream<java.lang.String> strStream44 = propertiesReader41.lines();
        extendedProperties0.setProperty("/", (java.lang.Object) propertiesReader41);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader46 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader41);
        boolean boolean47 = propertiesReader41.markSupported();
        boolean boolean48 = propertiesReader41.ready();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(extendedProperties16);
        org.junit.Assert.assertNotNull(extendedProperties17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties31);
        org.junit.Assert.assertNotNull(arrayList34);
        org.junit.Assert.assertNotNull(reader38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(strStream44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = extendedProperties0.subset("${");
        extendedProperties0.basePath = "${";
        java.lang.String str10 = extendedProperties0.fileSeparator;
        java.lang.String str11 = extendedProperties0.basePath;
        java.lang.Byte byte14 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 1);
        java.lang.String str15 = extendedProperties0.fileSeparator;
        java.io.OutputStream outputStream16 = null;
        extendedProperties0.save(outputStream16, "");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/" + "'", str15, "/");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        java.lang.String str4 = extendedProperties0.basePath;
        double double7 = extendedProperties0.getDouble("}", (double) 100);
        java.lang.String str8 = extendedProperties0.file;
        java.lang.Object obj10 = extendedProperties0.getProperty("${");
        byte byte13 = extendedProperties0.getByte("/", (byte) 100);
        float float16 = extendedProperties0.getFloat("", 0.0f);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj20 = extendedProperties18.getProperty("");
        long long23 = extendedProperties18.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList24 = extendedProperties18.keysAsListed;
        boolean boolean27 = extendedProperties18.getBoolean("", false);
        byte byte30 = extendedProperties18.getByte("}", (byte) 0);
        extendedProperties18.setInclude("${");
        java.io.Reader reader34 = java.io.Reader.nullReader();
        char[] charArray35 = new char[] {};
        int int36 = reader34.read(charArray35);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader37 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader34);
        extendedProperties18.addProperty("hi!", (java.lang.Object) reader34);
        extendedProperties18.file = ",";
        float float43 = extendedProperties18.getFloat("", (float) '4');
        java.util.Iterator iterator44 = extendedProperties18.getKeys();
        extendedProperties0.setProperty("}", (java.lang.Object) iterator44);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
        org.junit.Assert.assertNotNull(reader34);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 52.0f + "'", float43 == 52.0f);
        org.junit.Assert.assertNotNull(iterator44);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        boolean boolean7 = extendedProperties0.isInitialized;
        java.lang.String str10 = extendedProperties0.getString("", "/");
        java.lang.Double double13 = extendedProperties0.getDouble("", (java.lang.Double) 97.0d);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        int int5 = propertiesTokenizer1.countTokens();
        boolean boolean6 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean7 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        extendedProperties0.isInitialized = true;
        java.util.Iterator iterator14 = extendedProperties0.getKeys();
        java.lang.String str15 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj19 = extendedProperties17.getProperty("");
        java.lang.String str20 = extendedProperties17.file;
        java.lang.String str22 = extendedProperties17.testBoolean("hi!");
        java.util.Properties properties24 = extendedProperties17.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties24);
        extendedProperties25.setProperty("}", (java.lang.Object) "}");
        java.lang.Long long31 = extendedProperties25.getLong("/", (java.lang.Long) 1L);
        java.lang.Long long34 = extendedProperties25.getLong("${", (java.lang.Long) 0L);
        java.util.Vector vector36 = extendedProperties25.getVector("");
        java.util.Vector vector37 = extendedProperties0.getVector("${", vector36);
        java.lang.String str38 = extendedProperties0.getInclude();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "${" + "'", str15, "${");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(vector36);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "${" + "'", str38, "${");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        java.lang.String str15 = extendedProperties12.file;
        java.lang.String str17 = extendedProperties12.testBoolean("hi!");
        java.util.Properties properties19 = extendedProperties12.getProperties("/");
        java.util.Properties properties20 = extendedProperties0.getProperties("", properties19);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties20);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties20);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(extendedProperties21);
        org.junit.Assert.assertNotNull(extendedProperties22);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        int int5 = extendedProperties0.getInt("hi!", (int) (short) 1);
        java.lang.Boolean boolean8 = extendedProperties0.getBoolean("", (java.lang.Boolean) false);
        double double11 = extendedProperties0.getDouble("hi!", (double) ' ');
        double double14 = extendedProperties0.getDouble("hi!", (double) 35L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        long long11 = propertiesReader3.skip(52L);
        boolean boolean12 = propertiesReader3.markSupported();
        propertiesReader3.mark((int) '#');
        java.nio.CharBuffer charBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = propertiesReader3.read(charBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        boolean boolean2 = propertiesTokenizer1.hasMoreElements();
        int int3 = propertiesTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor4 = propertiesTokenizer1.asIterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objItor4);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("");
        long long8 = extendedProperties0.getLong("/", (long) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        java.lang.String str12 = extendedProperties9.file;
        java.lang.String str14 = extendedProperties9.testBoolean("hi!");
        java.util.Properties properties16 = extendedProperties9.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties16);
        extendedProperties17.display();
        java.util.ArrayList arrayList19 = extendedProperties17.keysAsListed;
        extendedProperties0.keysAsListed = arrayList19;
        java.lang.String str23 = extendedProperties0.getString("", "/");
        extendedProperties0.display();
        extendedProperties0.clearProperty("hi!");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(extendedProperties17);
        org.junit.Assert.assertNotNull(arrayList19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/" + "'", str23, "/");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(97);
        propertiesReader3.setLineNumber((int) (short) 10);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        boolean boolean12 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        int int6 = propertiesReader5.getLineNumber();
        propertiesReader5.mark(35);
        java.nio.CharBuffer charBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = propertiesReader5.read(charBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        java.lang.String str13 = extendedProperties0.interpolate("hi!");
        java.lang.Boolean boolean16 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        boolean boolean17 = extendedProperties0.isInitialized;
        java.lang.String str19 = extendedProperties0.testBoolean("}");
        java.util.Iterator iterator20 = extendedProperties0.getKeys();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int4 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        int int6 = propertiesReader3.read();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        int int6 = propertiesReader5.getLineNumber();
        boolean boolean7 = propertiesReader5.markSupported();
        boolean boolean8 = propertiesReader5.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader5);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader10 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader5);
        int int11 = propertiesReader5.read();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        long long3 = extendedProperties0.getLong("hi!", (long) 1);
        java.lang.Boolean boolean6 = extendedProperties0.getBoolean("", (java.lang.Boolean) false);
        java.util.Iterator iterator7 = extendedProperties0.getKeys();
        int int10 = extendedProperties0.getInt("${", (int) '4');
        java.io.Reader reader12 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] {};
        int int14 = reader12.read(charArray13);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader15 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader12);
        boolean boolean16 = propertiesReader15.markSupported();
        java.lang.String str17 = propertiesReader15.readLine();
        java.lang.String str18 = propertiesReader15.readProperty();
        java.util.stream.Stream<java.lang.String> strStream19 = propertiesReader15.lines();
        propertiesReader15.mark((int) (short) 0);
        java.util.stream.Stream<java.lang.String> strStream22 = propertiesReader15.lines();
        extendedProperties0.addProperty(",", (java.lang.Object) propertiesReader15);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strStream19);
        org.junit.Assert.assertNotNull(strStream22);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        java.lang.String str6 = extendedProperties0.testBoolean("hi!");
        java.lang.String str8 = extendedProperties0.getString("/");
        double double11 = extendedProperties0.getDouble("/", 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            byte byte13 = extendedProperties0.getByte(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ', doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        java.util.stream.Stream<java.lang.String> strStream7 = propertiesReader3.lines();
        propertiesReader3.mark((int) (short) 0);
        java.util.stream.Stream<java.lang.String> strStream10 = propertiesReader3.lines();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertNotNull(strStream10);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        short short7 = extendedProperties0.getShort("${", (short) (byte) 10);
        java.lang.String str9 = extendedProperties0.getString("${");
        boolean boolean10 = extendedProperties0.isInitialized();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Byte byte13 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list17 = extendedProperties15.getList("");
        extendedProperties15.setInclude("hi!");
        extendedProperties15.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj25 = extendedProperties23.getProperty("");
        java.util.List list27 = extendedProperties23.getList("hi!");
        short short30 = extendedProperties23.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj34 = extendedProperties32.getProperty("");
        long long37 = extendedProperties32.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList38 = extendedProperties32.keysAsListed;
        java.util.Vector vector40 = extendedProperties32.getVector("");
        java.util.Vector vector41 = extendedProperties23.getVector("}", vector40);
        java.util.Vector vector42 = extendedProperties15.getVector("}", vector41);
        java.util.Vector vector43 = extendedProperties0.getVector("/", vector41);
        java.lang.Float float46 = extendedProperties0.getFloat("", (java.lang.Float) 100.0f);
        java.lang.Double double49 = extendedProperties0.getDouble("}", (java.lang.Double) 52.0d);
        java.lang.Integer int52 = extendedProperties0.getInteger("}", (java.lang.Integer) 35);
        java.lang.Boolean boolean55 = extendedProperties0.getBoolean("hi!", (java.lang.Boolean) true);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 10 + "'", short30 == (short) 10);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertNotNull(arrayList38);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertNotNull(vector42);
        org.junit.Assert.assertNotNull(vector43);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 100.0f + "'", float46 == 100.0f);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 52.0d + "'", double49 == 52.0d);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        java.lang.Object obj9 = extendedProperties0.getProperty("${");
        short short12 = extendedProperties0.getShort("}", (short) (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        long long18 = extendedProperties13.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList19 = extendedProperties13.keysAsListed;
        boolean boolean22 = extendedProperties13.getBoolean("", false);
        boolean boolean25 = extendedProperties13.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj28 = extendedProperties26.getProperty("");
        java.lang.String str29 = extendedProperties26.file;
        extendedProperties26.file = "";
        extendedProperties26.setProperty("/", (java.lang.Object) false);
        extendedProperties13.combine(extendedProperties26);
        extendedProperties0.combine(extendedProperties26);
        byte byte39 = extendedProperties0.getByte(",", (byte) 0);
        extendedProperties0.fileSeparator = ",";
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(arrayList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        java.lang.String str13 = extendedProperties0.interpolate("hi!");
        java.lang.Object obj15 = extendedProperties0.getProperty("${");
        java.lang.String str17 = extendedProperties0.getString("${");
        byte byte20 = extendedProperties0.getByte("${", (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        java.util.Properties properties11 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties11);
        java.lang.String str15 = extendedProperties12.getString("${", "}");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj19 = extendedProperties17.getProperty("");
        java.util.List list21 = extendedProperties17.getList("hi!");
        java.lang.Long long24 = extendedProperties17.getLong("}", (java.lang.Long) (-1L));
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj28 = extendedProperties26.getProperty("");
        java.util.List list30 = extendedProperties26.getList("hi!");
        short short33 = extendedProperties26.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj37 = extendedProperties35.getProperty("");
        long long40 = extendedProperties35.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList41 = extendedProperties35.keysAsListed;
        java.util.Vector vector43 = extendedProperties35.getVector("");
        java.util.Vector vector44 = extendedProperties26.getVector("}", vector43);
        java.lang.String str45 = extendedProperties17.interpolateHelper("", (java.util.List) vector44);
        java.lang.String str47 = extendedProperties17.getString("/");
        extendedProperties12.setProperty("", (java.lang.Object) extendedProperties17);
        short short51 = extendedProperties17.getShort(",", (short) (byte) 10);
        java.lang.String str52 = extendedProperties17.basePath;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(extendedProperties12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 10 + "'", short33 == (short) 10);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertNotNull(arrayList41);
        org.junit.Assert.assertNotNull(vector43);
        org.junit.Assert.assertNotNull(vector44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + short51 + "' != '" + (short) 10 + "'", short51 == (short) 10);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        long long11 = propertiesReader9.skip((long) (byte) 100);
        propertiesReader9.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = propertiesReader9.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Short short14 = extendedProperties8.getShort("hi!", (java.lang.Short) (short) 100);
        java.io.OutputStream outputStream15 = null;
        extendedProperties8.save(outputStream15, "");
        java.lang.Float float20 = extendedProperties8.getFloat(",", (java.lang.Float) 1.0f);
        extendedProperties8.file = "hi!";
        short short25 = extendedProperties8.getShort("${", (short) -1);
        java.lang.Byte byte28 = extendedProperties8.getByte("/", (java.lang.Byte) (byte) 100);
        java.lang.String str29 = extendedProperties8.getInclude();
        java.lang.String str31 = extendedProperties8.getString("/");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 100 + "'", byte28 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        short short17 = extendedProperties14.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj21 = extendedProperties19.getProperty("");
        java.util.List list23 = extendedProperties19.getList("hi!");
        extendedProperties14.addProperty("", (java.lang.Object) list23);
        java.lang.String str25 = extendedProperties10.interpolateHelper("", list23);
        java.util.List list26 = extendedProperties0.getList("/", list23);
        java.lang.Float float29 = extendedProperties0.getFloat("}", (java.lang.Float) 10.0f);
        java.util.Iterator iterator31 = extendedProperties0.getKeys("/");
        extendedProperties0.isInitialized = true;
        extendedProperties0.setInclude("");
        java.lang.String str37 = extendedProperties0.getString("");
        java.lang.Double double40 = extendedProperties0.getDouble("${", (java.lang.Double) 32.0d);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 32.0d + "'", double40 == 32.0d);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        int int5 = extendedProperties0.getInt("", (int) ' ');
        extendedProperties0.basePath = "${";
        java.util.Properties properties9 = extendedProperties0.getProperties("hi!");
        java.lang.Double double12 = extendedProperties0.getDouble(",", (java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        java.lang.String str13 = extendedProperties10.file;
        java.lang.String str15 = extendedProperties10.testBoolean("hi!");
        java.util.Properties properties17 = extendedProperties10.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties17);
        extendedProperties18.setProperty("}", (java.lang.Object) "}");
        java.lang.Long long24 = extendedProperties18.getLong("/", (java.lang.Long) 1L);
        byte byte27 = extendedProperties18.getByte("hi!", (byte) 100);
        byte byte30 = extendedProperties18.getByte("/", (byte) -1);
        java.util.Vector vector32 = extendedProperties18.getVector("hi!");
        java.util.Vector vector33 = extendedProperties0.getVector("}", vector32);
        boolean boolean34 = extendedProperties0.isInitialized();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(extendedProperties18);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 100 + "'", byte27 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) -1 + "'", byte30 == (byte) -1);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertNotNull(vector33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.lang.String str9 = extendedProperties0.getString("");
        int int12 = extendedProperties0.getInteger("", (int) (byte) 10);
        double double15 = extendedProperties0.getDouble(",", 32.0d);
        java.util.List list17 = extendedProperties0.getList("${");
        java.lang.Long long20 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        java.util.Iterator iterator21 = extendedProperties0.getKeys();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader7.setLineNumber((int) (short) 1);
        java.lang.String str10 = propertiesReader7.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader7);
        boolean boolean12 = propertiesReader7.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer7 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        java.lang.String str8 = propertiesTokenizer7.nextToken();
        boolean boolean9 = propertiesTokenizer7.hasMoreElements();
        java.lang.String str10 = propertiesTokenizer7.nextToken();
        boolean boolean11 = propertiesTokenizer7.hasMoreElements();
        java.lang.String str13 = propertiesTokenizer7.nextToken("");
        int int14 = propertiesTokenizer7.countTokens();
        extendedProperties0.setProperty(",", (java.lang.Object) propertiesTokenizer7);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(97);
        propertiesReader3.reset();
        java.lang.String str10 = propertiesReader3.readProperty();
        propertiesReader3.setLineNumber(0);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        java.lang.Long long10 = extendedProperties0.getLong("/", (java.lang.Long) 0L);
        java.lang.Byte byte13 = extendedProperties0.getByte("hi!", (java.lang.Byte) (byte) 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        int int6 = propertiesReader5.getLineNumber();
        boolean boolean7 = propertiesReader5.markSupported();
        long long9 = propertiesReader5.skip((long) (byte) 100);
        propertiesReader5.close();
        boolean boolean11 = propertiesReader5.markSupported();
        propertiesReader5.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        int int6 = propertiesReader3.read();
        propertiesReader3.setLineNumber((int) (short) 0);
        long long10 = propertiesReader3.skip((long) (short) 0);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        extendedProperties0.isInitialized = true;
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        long long16 = extendedProperties11.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList17 = extendedProperties11.keysAsListed;
        boolean boolean20 = extendedProperties11.getBoolean("", false);
        byte byte23 = extendedProperties11.getByte("}", (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list27 = extendedProperties25.getList("");
        extendedProperties25.setInclude("hi!");
        extendedProperties25.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj35 = extendedProperties33.getProperty("");
        java.util.List list37 = extendedProperties33.getList("hi!");
        short short40 = extendedProperties33.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj44 = extendedProperties42.getProperty("");
        long long47 = extendedProperties42.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList48 = extendedProperties42.keysAsListed;
        java.util.Vector vector50 = extendedProperties42.getVector("");
        java.util.Vector vector51 = extendedProperties33.getVector("}", vector50);
        java.util.Vector vector52 = extendedProperties25.getVector("}", vector51);
        java.util.Vector vector53 = extendedProperties11.getVector("/", vector51);
        java.lang.String str54 = extendedProperties0.interpolateHelper(",", (java.util.List) vector53);
        int int57 = extendedProperties0.getInteger("}", (int) (short) 100);
        java.util.Iterator iterator58 = extendedProperties0.getKeys();
        extendedProperties0.isInitialized = false;
        org.apache.commons.collections.ExtendedProperties extendedProperties62 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj64 = extendedProperties62.getProperty("");
        long long67 = extendedProperties62.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList68 = extendedProperties62.keysAsListed;
        java.util.Vector vector70 = extendedProperties62.getVector("");
        org.apache.commons.collections.ExtendedProperties extendedProperties72 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj74 = extendedProperties72.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties76 = new org.apache.commons.collections.ExtendedProperties();
        short short79 = extendedProperties76.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties81 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj83 = extendedProperties81.getProperty("");
        java.util.List list85 = extendedProperties81.getList("hi!");
        extendedProperties76.addProperty("", (java.lang.Object) list85);
        java.lang.String str87 = extendedProperties72.interpolateHelper("", list85);
        java.util.List list88 = extendedProperties62.getList("/", list85);
        java.lang.Float float91 = extendedProperties62.getFloat("}", (java.lang.Float) 10.0f);
        java.lang.Float float94 = extendedProperties62.getFloat("${", (java.lang.Float) (-1.0f));
        byte byte97 = extendedProperties62.getByte("}", (byte) -1);
        extendedProperties0.addProperty("}", (java.lang.Object) "}");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(arrayList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 10 + "'", short40 == (short) 10);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L + "'", long47 == 100L);
        org.junit.Assert.assertNotNull(arrayList48);
        org.junit.Assert.assertNotNull(vector50);
        org.junit.Assert.assertNotNull(vector51);
        org.junit.Assert.assertNotNull(vector52);
        org.junit.Assert.assertNotNull(vector53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "," + "'", str54, ",");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 100L + "'", long67 == 100L);
        org.junit.Assert.assertNotNull(arrayList68);
        org.junit.Assert.assertNotNull(vector70);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) 10 + "'", short79 == (short) 10);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(list85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(list88);
        org.junit.Assert.assertTrue("'" + float91 + "' != '" + 10.0f + "'", float91 == 10.0f);
        org.junit.Assert.assertTrue("'" + float94 + "' != '" + (-1.0f) + "'", float94 == (-1.0f));
        org.junit.Assert.assertTrue("'" + byte97 + "' != '" + (byte) -1 + "'", byte97 == (byte) -1);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        java.util.List list14 = extendedProperties10.getList("hi!");
        java.lang.String str15 = extendedProperties0.interpolateHelper("}", list14);
        long long18 = extendedProperties0.getLong("", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj22 = extendedProperties20.getProperty("");
        java.util.List list24 = extendedProperties20.getList("hi!");
        short short27 = extendedProperties20.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj31 = extendedProperties29.getProperty("");
        long long34 = extendedProperties29.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList35 = extendedProperties29.keysAsListed;
        java.util.Vector vector37 = extendedProperties29.getVector("");
        java.util.Vector vector38 = extendedProperties20.getVector("}", vector37);
        java.lang.String str39 = extendedProperties0.interpolateHelper("", (java.util.List) vector37);
        extendedProperties0.isInitialized = true;
        java.util.Vector vector43 = extendedProperties0.getVector("/");
        java.lang.Byte byte46 = extendedProperties0.getByte("", (java.lang.Byte) (byte) -1);
        java.util.List list48 = extendedProperties0.getList("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 10 + "'", short27 == (short) 10);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(arrayList35);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(vector38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(vector43);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) -1 + "'", byte46 == (byte) -1);
        org.junit.Assert.assertNotNull(list48);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        extendedProperties13.file = "";
        extendedProperties13.setProperty("/", (java.lang.Object) false);
        extendedProperties0.combine(extendedProperties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list26 = extendedProperties24.getList("");
        java.util.Properties properties28 = extendedProperties24.getProperties("");
        java.lang.String str30 = extendedProperties24.testBoolean("hi!");
        extendedProperties24.clearProperty("hi!");
        extendedProperties13.setProperty("${", (java.lang.Object) extendedProperties24);
        java.lang.String str34 = extendedProperties24.basePath;
        extendedProperties24.basePath = "";
        // The following exception was thrown during execution in test generation
        try {
            byte byte38 = extendedProperties24.getByte(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ', doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        java.lang.String str15 = extendedProperties12.file;
        java.lang.String str17 = extendedProperties12.testBoolean("hi!");
        java.util.Properties properties19 = extendedProperties12.getProperties("/");
        java.util.Properties properties20 = extendedProperties0.getProperties("", properties19);
        extendedProperties0.clearProperty(",");
        java.lang.Float float25 = extendedProperties0.getFloat("${", (java.lang.Float) (-1.0f));
        java.util.ArrayList arrayList26 = extendedProperties0.keysAsListed;
        java.util.Properties properties28 = extendedProperties0.getProperties(",");
        java.lang.String str29 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj32 = extendedProperties30.getProperty("");
        java.lang.String str33 = extendedProperties30.file;
        java.lang.String str35 = extendedProperties30.testBoolean("hi!");
        java.util.Properties properties37 = extendedProperties30.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties37);
        extendedProperties38.display();
        java.lang.String str41 = extendedProperties38.testBoolean("}");
        extendedProperties0.combine(extendedProperties38);
        java.lang.Short short45 = extendedProperties0.getShort(",", (java.lang.Short) (short) 0);
        boolean boolean48 = extendedProperties0.getBoolean("/", false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertNotNull(arrayList26);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNotNull(extendedProperties38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) 0 + "'", short45 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (byte) 10);
        java.lang.String str6 = propertiesReader3.readProperty();
        int int7 = propertiesReader3.read();
        int int8 = propertiesReader3.getLineNumber();
        int int9 = propertiesReader3.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        boolean boolean7 = propertiesReader3.markSupported();
        java.util.stream.Stream<java.lang.String> strStream8 = propertiesReader3.lines();
        propertiesReader3.close();
        propertiesReader3.setLineNumber((int) (short) 100);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strStream8);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        int int5 = extendedProperties0.getInt("", (int) ' ');
        long long8 = extendedProperties0.getLong("${", (long) (short) 0);
        java.lang.String[] strArray10 = extendedProperties0.getStringArray("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        java.lang.Long long18 = extendedProperties11.getLong("}", (java.lang.Long) (-1L));
        int int21 = extendedProperties11.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj24 = extendedProperties22.getProperty("");
        java.util.List list26 = extendedProperties22.getList("hi!");
        java.lang.String str28 = extendedProperties22.interpolate("");
        java.lang.Short short31 = extendedProperties22.getShort("", (java.lang.Short) (short) -1);
        extendedProperties11.combine(extendedProperties22);
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = extendedProperties11.subset("");
        java.lang.String[] strArray36 = extendedProperties11.getStringArray("}");
        java.util.Vector vector38 = extendedProperties11.getVector("}");
        java.lang.Byte byte41 = extendedProperties11.getByte("${", (java.lang.Byte) (byte) 10);
        extendedProperties0.combine(extendedProperties11);
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj46 = extendedProperties44.getProperty("");
        java.util.List list48 = extendedProperties44.getList("hi!");
        java.lang.String str50 = extendedProperties44.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj54 = extendedProperties52.getProperty("");
        java.util.List list56 = extendedProperties52.getList("hi!");
        java.lang.Long long59 = extendedProperties52.getLong("}", (java.lang.Long) (-1L));
        int int62 = extendedProperties52.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties63 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj65 = extendedProperties63.getProperty("");
        java.util.List list67 = extendedProperties63.getList("hi!");
        java.lang.String str69 = extendedProperties63.interpolate("");
        java.lang.Short short72 = extendedProperties63.getShort("", (java.lang.Short) (short) -1);
        extendedProperties52.combine(extendedProperties63);
        org.apache.commons.collections.ExtendedProperties extendedProperties75 = extendedProperties52.subset("");
        java.lang.String[] strArray77 = extendedProperties52.getStringArray("}");
        java.util.Vector vector79 = extendedProperties52.getVector("}");
        java.util.Vector vector80 = extendedProperties44.getVector(",", vector79);
        org.apache.commons.collections.ExtendedProperties extendedProperties81 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj83 = extendedProperties81.getProperty("");
        long long86 = extendedProperties81.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream87 = null;
        extendedProperties81.save(outputStream87, "${");
        extendedProperties44.combine(extendedProperties81);
        extendedProperties0.addProperty("", (java.lang.Object) extendedProperties44);
        byte byte94 = extendedProperties0.getByte("}", (byte) 1);
        java.lang.String[] strArray96 = extendedProperties0.getStringArray("}");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertNull(extendedProperties34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(vector38);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 10 + "'", byte41 == (byte) 10);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) -1 + "'", short72 == (short) -1);
        org.junit.Assert.assertNull(extendedProperties75);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(vector79);
        org.junit.Assert.assertNotNull(vector80);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 100L + "'", long86 == 100L);
        org.junit.Assert.assertTrue("'" + byte94 + "' != '" + (byte) 1 + "'", byte94 == (byte) 1);
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertArrayEquals(strArray96, new java.lang.String[] {});
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj10 = extendedProperties8.getProperty("");
        java.util.List list12 = extendedProperties8.getList("hi!");
        java.lang.Long long15 = extendedProperties8.getLong("}", (java.lang.Long) (-1L));
        int int18 = extendedProperties8.getInt("${", (int) (byte) 100);
        extendedProperties8.isInitialized = false;
        extendedProperties0.combine(extendedProperties8);
        java.lang.Boolean boolean24 = extendedProperties0.getBoolean(",", (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str8 = extendedProperties0.getString("${", "}");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        short short12 = extendedProperties9.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list16 = extendedProperties14.getList("");
        extendedProperties14.setInclude("hi!");
        java.util.Properties properties20 = null;
        java.util.Properties properties21 = extendedProperties14.getProperties("", properties20);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj25 = extendedProperties23.getProperty("");
        java.util.List list27 = extendedProperties23.getList("hi!");
        extendedProperties23.setInclude("hi!");
        java.util.List list31 = extendedProperties23.getList("hi!");
        java.lang.String str32 = extendedProperties23.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = extendedProperties23.subset("/");
        java.util.ArrayList arrayList35 = extendedProperties23.keysAsListed;
        java.util.List list36 = extendedProperties14.getList("", (java.util.List) arrayList35);
        java.lang.String str37 = extendedProperties9.interpolateHelper("/", list36);
        java.io.OutputStream outputStream38 = null;
        extendedProperties9.save(outputStream38, "");
        extendedProperties0.combine(extendedProperties9);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        short short46 = extendedProperties43.getShort("", (short) (byte) 10);
        int int49 = extendedProperties43.getInt("/", (int) (byte) 100);
        java.util.Iterator iterator51 = extendedProperties43.getKeys("");
        java.util.Iterator iterator53 = extendedProperties43.getKeys("${");
        extendedProperties43.basePath = "/";
        java.lang.String str56 = extendedProperties43.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list60 = extendedProperties58.getList("");
        java.util.Properties properties62 = extendedProperties58.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties63 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties62);
        org.apache.commons.collections.ExtendedProperties extendedProperties65 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list67 = extendedProperties65.getList("");
        extendedProperties65.file = "}";
        java.lang.String str72 = extendedProperties65.getString("}", "hi!");
        java.lang.Boolean boolean75 = extendedProperties65.getBoolean("hi!", (java.lang.Boolean) false);
        extendedProperties65.basePath = "hi!";
        java.util.Vector vector79 = extendedProperties65.getVector(",");
        java.util.List list80 = extendedProperties63.getList("${", (java.util.List) vector79);
        java.lang.String str81 = extendedProperties43.interpolateHelper("", list80);
        extendedProperties9.addProperty("", (java.lang.Object) extendedProperties43);
        java.lang.String str83 = extendedProperties9.file;
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "}" + "'", str8, "}");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(extendedProperties34);
        org.junit.Assert.assertNotNull(arrayList35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/" + "'", str37, "/");
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 10 + "'", short46 == (short) 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "/" + "'", str56, "/");
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(properties62);
        org.junit.Assert.assertNotNull(extendedProperties63);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(vector79);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNull(str83);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties4);
        java.util.Properties properties7 = extendedProperties5.getProperties("/");
        java.io.OutputStream outputStream8 = null;
        extendedProperties5.save(outputStream8, "hi!");
        int int13 = extendedProperties5.getInt("${", (int) '4');
        boolean boolean14 = extendedProperties5.isInitialized();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(extendedProperties5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.lang.String str8 = propertiesReader7.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.util.Properties properties12 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties12);
        java.lang.String str14 = extendedProperties13.getInclude();
        java.util.Properties properties16 = extendedProperties13.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = extendedProperties13.subset("/");
        java.lang.String str19 = extendedProperties13.basePath;
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(extendedProperties13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(extendedProperties18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        int int6 = propertiesReader3.read();
        java.lang.String str7 = propertiesReader3.readProperty();
        java.util.stream.Stream<java.lang.String> strStream8 = propertiesReader3.lines();
        propertiesReader3.mark((int) 'a');
        propertiesReader3.mark((int) (byte) 1);
        propertiesReader3.mark((int) (short) 0);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strStream8);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        java.util.List list14 = extendedProperties10.getList("hi!");
        java.lang.String str15 = extendedProperties0.interpolateHelper("}", list14);
        java.lang.Short short18 = extendedProperties0.getShort("", (java.lang.Short) (short) 10);
        int int21 = extendedProperties0.getInteger("}", (int) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = extendedProperties0.subset("/");
        // The following exception was thrown during execution in test generation
        try {
            double double25 = extendedProperties23.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(extendedProperties23);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        java.lang.Object obj9 = extendedProperties0.getProperty("${");
        java.lang.Boolean boolean12 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        java.lang.String str18 = extendedProperties13.testBoolean("hi!");
        java.util.Properties properties20 = extendedProperties13.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties20);
        extendedProperties21.setProperty("}", (java.lang.Object) "}");
        java.lang.Long long27 = extendedProperties21.getLong("/", (java.lang.Long) 1L);
        boolean boolean30 = extendedProperties21.getBoolean("", true);
        java.lang.Double double33 = extendedProperties21.getDouble("hi!", (java.lang.Double) (-1.0d));
        extendedProperties0.combine(extendedProperties21);
        java.lang.Byte byte37 = extendedProperties21.getByte("${", (java.lang.Byte) (byte) 1);
        java.lang.String str40 = extendedProperties21.getString("hi!", "${");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(extendedProperties21);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "${" + "'", str40, "${");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        extendedProperties0.display();
        java.lang.Double double12 = extendedProperties0.getDouble("", (java.lang.Double) 10.0d);
        java.lang.String str14 = extendedProperties0.getString("}");
        int int17 = extendedProperties0.getInt("}", 0);
        java.lang.Short short20 = extendedProperties0.getShort("}", (java.lang.Short) (short) 100);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        java.lang.Object obj6 = extendedProperties0.getProperty("hi!");
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        long long14 = extendedProperties11.getLong("hi!", (long) 1);
        long long17 = extendedProperties11.getLong("/", (long) '4');
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj20 = extendedProperties18.getProperty("");
        java.lang.String str21 = extendedProperties18.file;
        extendedProperties18.file = "";
        extendedProperties18.setProperty("/", (java.lang.Object) false);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str29 = extendedProperties28.fileSeparator;
        java.io.OutputStream outputStream30 = null;
        extendedProperties28.save(outputStream30, "hi!");
        extendedProperties28.display();
        short short36 = extendedProperties28.getShort("${", (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj39 = extendedProperties37.getProperty("");
        long long42 = extendedProperties37.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList43 = extendedProperties37.keysAsListed;
        boolean boolean46 = extendedProperties37.getBoolean("", false);
        boolean boolean49 = extendedProperties37.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj52 = extendedProperties50.getProperty("");
        java.lang.String str53 = extendedProperties50.file;
        extendedProperties50.file = "";
        extendedProperties50.setProperty("/", (java.lang.Object) false);
        extendedProperties37.combine(extendedProperties50);
        org.apache.commons.collections.ExtendedProperties extendedProperties61 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list63 = extendedProperties61.getList("");
        java.util.Properties properties65 = extendedProperties61.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties66 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties65);
        extendedProperties50.setProperty("${", (java.lang.Object) properties65);
        java.lang.String str70 = extendedProperties50.getString("", "}");
        org.apache.commons.collections.ExtendedProperties extendedProperties71 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj73 = extendedProperties71.getProperty("");
        java.util.List list75 = extendedProperties71.getList("hi!");
        extendedProperties71.setInclude("hi!");
        java.util.List list79 = extendedProperties71.getList("hi!");
        java.lang.String str80 = extendedProperties71.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties82 = extendedProperties71.subset("/");
        java.util.ArrayList arrayList83 = extendedProperties71.keysAsListed;
        extendedProperties50.keysAsListed = arrayList83;
        extendedProperties50.setInclude("hi!");
        java.util.ArrayList arrayList87 = extendedProperties50.keysAsListed;
        extendedProperties28.keysAsListed = arrayList87;
        java.lang.String str89 = extendedProperties18.interpolateHelper(",", (java.util.List) arrayList87);
        extendedProperties11.keysAsListed = arrayList87;
        java.util.List list91 = extendedProperties0.getList("}", (java.util.List) arrayList87);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/" + "'", str29, "/");
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 100 + "'", short36 == (short) 100);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertNotNull(arrayList43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(properties65);
        org.junit.Assert.assertNotNull(extendedProperties66);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "}" + "'", str70, "}");
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNull(extendedProperties82);
        org.junit.Assert.assertNotNull(arrayList83);
        org.junit.Assert.assertNotNull(arrayList87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "," + "'", str89, ",");
        org.junit.Assert.assertNotNull(list91);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        short short10 = extendedProperties0.getShort("", (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        short short14 = extendedProperties11.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = extendedProperties11.subset("");
        long long19 = extendedProperties11.getLong("/", (long) (short) 0);
        extendedProperties0.combine(extendedProperties11);
        int int23 = extendedProperties11.getInteger(",", 52);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj26 = extendedProperties24.getProperty("");
        java.lang.String str27 = extendedProperties24.file;
        java.lang.String str29 = extendedProperties24.testBoolean("hi!");
        java.util.Properties properties31 = extendedProperties24.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties31);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties31);
        float float36 = extendedProperties33.getFloat("}", (float) 0);
        java.util.Iterator iterator38 = extendedProperties33.getKeys("");
        extendedProperties11.combine(extendedProperties33);
        java.lang.Double double42 = extendedProperties11.getDouble("", (java.lang.Double) (-1.0d));
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj45 = extendedProperties43.getProperty("");
        long long48 = extendedProperties43.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList49 = extendedProperties43.keysAsListed;
        boolean boolean52 = extendedProperties43.getBoolean("", false);
        byte byte55 = extendedProperties43.getByte("}", (byte) 0);
        extendedProperties43.setInclude("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj60 = extendedProperties58.getProperty("");
        java.util.List list62 = extendedProperties58.getList("hi!");
        extendedProperties58.setInclude("hi!");
        java.util.List list66 = extendedProperties58.getList("hi!");
        java.lang.String str67 = extendedProperties58.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties69 = extendedProperties58.subset("/");
        java.util.ArrayList arrayList70 = extendedProperties58.keysAsListed;
        extendedProperties43.keysAsListed = arrayList70;
        extendedProperties11.keysAsListed = arrayList70;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(extendedProperties32);
        org.junit.Assert.assertNotNull(extendedProperties33);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 100L + "'", long48 == 100L);
        org.junit.Assert.assertNotNull(arrayList49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 0 + "'", byte55 == (byte) 0);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNull(extendedProperties69);
        org.junit.Assert.assertNotNull(arrayList70);
    }
}

