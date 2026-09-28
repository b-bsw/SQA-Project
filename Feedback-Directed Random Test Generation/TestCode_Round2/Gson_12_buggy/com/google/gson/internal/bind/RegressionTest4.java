package com.google.gson.internal.bind;

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
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
        boolean boolean14 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        boolean boolean14 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean15 = jsonTreeReader1.isLenient();
        java.lang.String str16 = jsonTreeReader1.toString();
        java.lang.String str17 = jsonTreeReader1.getPath();
        java.lang.String str18 = jsonTreeReader1.toString();
        java.lang.String str19 = jsonTreeReader1.toString();
        java.lang.String str20 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JsonTreeReader" + "'", str19, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "JsonTreeReader" + "'", str20, "JsonTreeReader");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        boolean boolean2 = jsonTreeReader1.isLenient();
        boolean boolean3 = jsonTreeReader1.isLenient();
        java.lang.String str4 = jsonTreeReader1.getPath();
        boolean boolean5 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass10 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken8 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass13 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        java.lang.String str15 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass16 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str13 = jsonTreeReader1.toString();
        java.lang.String str14 = jsonTreeReader1.getPath();
        boolean boolean15 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str16 = jsonTreeReader1.getPath();
        java.lang.String str17 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        boolean boolean13 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.Class<?> wildcardClass17 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        boolean boolean13 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str15 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        boolean boolean13 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str17 = jsonTreeReader1.toString();
        java.lang.String str18 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$" + "'", str18, "$");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken11 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str15 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean17 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken12 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str16 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean7 = jsonTreeReader1.isLenient();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str12 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean15 = jsonTreeReader1.isLenient();
        boolean boolean16 = jsonTreeReader1.isLenient();
        boolean boolean17 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        java.lang.String str13 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass6 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.String str13 = jsonTreeReader1.getPath();
        boolean boolean14 = jsonTreeReader1.isLenient();
        java.lang.String str15 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken9 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str5 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        boolean boolean13 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str15 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean15 = jsonTreeReader1.isLenient();
        java.lang.String str16 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken8 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        boolean boolean15 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean12 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        java.lang.String str13 = jsonTreeReader1.getPath();
        boolean boolean14 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean15 = jsonTreeReader1.isLenient();
        java.lang.String str16 = jsonTreeReader1.toString();
        java.lang.String str17 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken13 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str15 = jsonTreeReader1.getPath();
        boolean boolean16 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.toString();
        boolean boolean10 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean15 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean12 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str16 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass12 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean15 = jsonTreeReader1.isLenient();
        java.lang.String str16 = jsonTreeReader1.toString();
        java.lang.String str17 = jsonTreeReader1.getPath();
        java.lang.String str18 = jsonTreeReader1.toString();
        java.lang.String str19 = jsonTreeReader1.getPath();
        java.lang.String str20 = jsonTreeReader1.toString();
        java.lang.String str21 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "$" + "'", str19, "$");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "JsonTreeReader" + "'", str20, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "$" + "'", str21, "$");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        boolean boolean10 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass13 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.Class<?> wildcardClass10 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        boolean boolean13 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str17 = jsonTreeReader1.toString();
        java.lang.String str18 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$" + "'", str18, "$");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        boolean boolean13 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        boolean boolean9 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean14 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
        java.lang.String str14 = jsonTreeReader1.getPath();
        java.lang.String str15 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.String str13 = jsonTreeReader1.getPath();
        boolean boolean14 = jsonTreeReader1.isLenient();
        java.lang.String str15 = jsonTreeReader1.toString();
        java.lang.String str16 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        java.lang.String str13 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str15 = jsonTreeReader1.getPath();
        boolean boolean16 = jsonTreeReader1.isLenient();
        boolean boolean17 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken9 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean12 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str16 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str14 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean15 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
        java.lang.String str14 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken15 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        boolean boolean9 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        java.lang.String str13 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
        boolean boolean14 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken15 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str17 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str17 = jsonTreeReader1.getPath();
        java.lang.String str18 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken8 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass7 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str16 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass9 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        boolean boolean12 = jsonTreeReader1.isLenient();
        boolean boolean13 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.String str13 = jsonTreeReader1.getPath();
        java.lang.String str14 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.Class<?> wildcardClass8 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        boolean boolean13 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken14 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str17 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.String str13 = jsonTreeReader1.getPath();
        java.lang.String str14 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean15 = jsonTreeReader1.isLenient();
        java.lang.String str16 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.Class<?> wildcardClass10 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        boolean boolean13 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        java.lang.String str15 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        boolean boolean11 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.getPath();
        boolean boolean10 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.String str13 = jsonTreeReader1.getPath();
        java.lang.String str14 = jsonTreeReader1.toString();
        java.lang.String str15 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.String str13 = jsonTreeReader1.getPath();
        boolean boolean14 = jsonTreeReader1.isLenient();
        java.lang.String str15 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.Class<?> wildcardClass9 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken11 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken9 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str5 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean13 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str16 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass9 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        java.lang.String str15 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean15 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str5 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        boolean boolean13 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str15 = jsonTreeReader1.toString();
        boolean boolean16 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.toString();
        java.lang.String str14 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean16 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.String str13 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.String str11 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass12 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        boolean boolean15 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.getPath();
        boolean boolean5 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass8 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        java.lang.String str12 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        boolean boolean10 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.String str13 = jsonTreeReader1.getPath();
        boolean boolean14 = jsonTreeReader1.isLenient();
        java.lang.String str15 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        boolean boolean13 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        boolean boolean11 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        boolean boolean13 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass8 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass14 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken6 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        boolean boolean10 = jsonTreeReader1.isLenient();
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str17 = jsonTreeReader1.getPath();
        java.lang.String str18 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass10 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        java.lang.String str4 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean15 = jsonTreeReader1.isLenient();
        java.lang.String str16 = jsonTreeReader1.toString();
        java.lang.String str17 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean10 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.toString();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        boolean boolean15 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass9 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        boolean boolean14 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        boolean boolean17 = jsonTreeReader1.isLenient();
        boolean boolean18 = jsonTreeReader1.isLenient();
        java.lang.Class<?> wildcardClass19 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        java.lang.String str14 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.Class<?> wildcardClass17 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        boolean boolean12 = jsonTreeReader1.isLenient();
        boolean boolean13 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str16 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.String str10 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken11 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str7 = jsonTreeReader1.toString();
        boolean boolean8 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean15 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.Class<?> wildcardClass14 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        boolean boolean12 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean14 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.toString();
        java.lang.String str14 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.String str10 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken14 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        java.lang.String str15 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        boolean boolean10 = jsonTreeReader1.isLenient();
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass12 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass10 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.String str13 = jsonTreeReader1.getPath();
        java.lang.String str14 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass12 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.Class<?> wildcardClass9 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.String str11 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        boolean boolean10 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken13 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str15 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass16 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str5 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        boolean boolean15 = jsonTreeReader1.isLenient();
        boolean boolean16 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.String str13 = jsonTreeReader1.getPath();
        java.lang.String str14 = jsonTreeReader1.toString();
        java.lang.String str15 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        boolean boolean19 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        boolean boolean14 = jsonTreeReader1.isLenient();
        java.lang.String str15 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean18 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass10 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str16 = jsonTreeReader1.getPath();
        java.lang.String str17 = jsonTreeReader1.getPath();
        java.lang.String str18 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str14 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken8 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean15 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass10 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean13 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str16 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean12 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.String str13 = jsonTreeReader1.getPath();
        boolean boolean14 = jsonTreeReader1.isLenient();
        java.lang.String str15 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        boolean boolean12 = jsonTreeReader1.isLenient();
        boolean boolean13 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str16 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean14 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        java.lang.String str17 = jsonTreeReader1.getPath();
        java.lang.String str18 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$" + "'", str18, "$");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean15 = jsonTreeReader1.isLenient();
        java.lang.String str16 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }
}

