package com.google.gson.internal.bind;

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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
            jsonTreeReader1.skipValue();
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
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        boolean boolean11 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        boolean boolean12 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.String str11 = jsonTreeReader1.toString();
        java.lang.String str12 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        java.lang.Class<?> wildcardClass17 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass8 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
            jsonTreeReader1.endArray();
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
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
        java.lang.String str13 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = jsonTreeReader1.nextString();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonTreeReader1.nextInt();
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
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        java.lang.String str15 = jsonTreeReader1.getPath();
        java.lang.String str16 = jsonTreeReader1.getPath();
        boolean boolean17 = jsonTreeReader1.isLenient();
        java.lang.String str18 = jsonTreeReader1.toString();
        java.lang.String str19 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass20 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JsonTreeReader" + "'", str19, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        jsonTreeReader1.setLenient(true);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
            boolean boolean13 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = jsonTreeReader1.nextDouble();
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
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = jsonTreeReader1.nextDouble();
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
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        java.lang.String str18 = jsonTreeReader1.getPath();
        boolean boolean19 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$" + "'", str18, "$");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = jsonTreeReader1.nextDouble();
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
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
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
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
            java.lang.String str9 = jsonTreeReader1.nextString();
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
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean9 = jsonTreeReader1.isLenient();
        boolean boolean10 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken8 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken12 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        java.lang.String str13 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
            jsonTreeReader1.beginArray();
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
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        boolean boolean12 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = jsonTreeReader1.nextLong();
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
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        boolean boolean15 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
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
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        jsonTreeReader1.close();
        java.lang.String str14 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        boolean boolean10 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
            boolean boolean9 = jsonTreeReader1.hasNext();
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
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
            int int13 = jsonTreeReader1.nextInt();
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
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
            java.lang.String str19 = jsonTreeReader1.nextString();
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
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
            boolean boolean12 = jsonTreeReader1.hasNext();
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
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean12 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        boolean boolean10 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
            long long11 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
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
            jsonTreeReader1.nextNull();
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
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
            double double11 = jsonTreeReader1.nextDouble();
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
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
            boolean boolean10 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
            int int13 = jsonTreeReader1.nextInt();
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
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        java.lang.String str13 = jsonTreeReader1.toString();
        boolean boolean14 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        jsonTreeReader1.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        boolean boolean15 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = jsonTreeReader1.nextLong();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        boolean boolean15 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        boolean boolean14 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = jsonTreeReader1.nextInt();
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
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
            jsonTreeReader1.beginArray();
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
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        boolean boolean10 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        java.lang.String str15 = jsonTreeReader1.toString();
        java.lang.String str16 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
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
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        boolean boolean15 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str17 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
            double double14 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
            boolean boolean15 = jsonTreeReader1.hasNext();
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
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        boolean boolean15 = jsonTreeReader1.isLenient();
        java.lang.String str16 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
            jsonTreeReader1.endArray();
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
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
        boolean boolean14 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken12 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken8 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.getPath();
        boolean boolean10 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = jsonTreeReader1.nextDouble();
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
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
            java.lang.String str11 = jsonTreeReader1.nextString();
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
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
        java.lang.String str17 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
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
            boolean boolean11 = jsonTreeReader1.nextBoolean();
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
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
            boolean boolean8 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
        boolean boolean13 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
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
            boolean boolean11 = jsonTreeReader1.nextBoolean();
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
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
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
        jsonTreeReader1.close();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = jsonTreeReader1.nextDouble();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        java.lang.String str14 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken15 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken9 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        java.lang.String str14 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
        java.lang.String str14 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
            jsonTreeReader1.endArray();
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
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.String str10 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
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
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.toString();
        java.lang.String str14 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.Class<?> wildcardClass7 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
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
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        java.lang.String str12 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
        java.lang.String str17 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = jsonTreeReader1.nextInt();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
            long long10 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
        java.lang.Class<?> wildcardClass17 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
            boolean boolean8 = jsonTreeReader1.hasNext();
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
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
        java.lang.String str15 = jsonTreeReader1.getPath();
        java.lang.String str16 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str14 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass9 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str15 = jsonTreeReader1.getPath();
        java.lang.String str16 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
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
            jsonTreeReader1.nextNull();
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
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.Class<?> wildcardClass13 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
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
            jsonTreeReader1.beginArray();
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
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        boolean boolean11 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken11 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        java.lang.Class<?> wildcardClass14 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass10 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        java.lang.String str14 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
            com.google.gson.stream.JsonToken jsonToken16 = jsonTreeReader1.peek();
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
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str5 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass10 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        java.lang.String str14 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str16 = jsonTreeReader1.toString();
        boolean boolean17 = jsonTreeReader1.isLenient();
        java.lang.String str18 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$" + "'", str18, "$");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
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
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken17 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
        java.lang.Class<?> wildcardClass14 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
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
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
            jsonTreeReader1.beginArray();
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
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.nextBoolean();
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
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean12 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
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
        java.lang.String str15 = jsonTreeReader1.toString();
        java.lang.String str16 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.Class<?> wildcardClass19 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
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
            jsonTreeReader1.beginObject();
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
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        boolean boolean11 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        boolean boolean10 = jsonTreeReader1.isLenient();
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        java.lang.String str14 = jsonTreeReader1.getPath();
        java.lang.String str15 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
            jsonTreeReader1.skipValue();
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
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
            java.lang.String str10 = jsonTreeReader1.nextName();
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
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
        java.lang.Class<?> wildcardClass14 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.toString();
        java.lang.String str13 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jsonTreeReader1.hasNext();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
            jsonTreeReader1.skipValue();
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
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
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
            boolean boolean14 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
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
        java.lang.String str17 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
        jsonTreeReader1.setLenient(false);
        java.lang.Class<?> wildcardClass18 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
            jsonTreeReader1.endObject();
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
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
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
        java.lang.String str13 = jsonTreeReader1.toString();
        boolean boolean14 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        boolean boolean10 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass14 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
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
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
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
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        java.lang.String str15 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
            jsonTreeReader1.endArray();
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
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean12 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken13 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
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
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken15 = jsonTreeReader1.peek();
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
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
            int int11 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
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
            com.google.gson.stream.JsonToken jsonToken15 = jsonTreeReader1.peek();
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
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
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
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
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
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        java.lang.String str14 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
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
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
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
        java.lang.Class<?> wildcardClass14 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean9 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
            jsonTreeReader1.nextNull();
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
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
            com.google.gson.stream.JsonToken jsonToken17 = jsonTreeReader1.peek();
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
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
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
        java.lang.String str13 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass14 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass5 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken12 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
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
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
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
            boolean boolean11 = jsonTreeReader1.nextBoolean();
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
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean10 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        boolean boolean13 = jsonTreeReader1.isLenient();
        java.lang.String str14 = jsonTreeReader1.toString();
        java.lang.String str15 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        java.lang.String str13 = jsonTreeReader1.toString();
        boolean boolean14 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        java.lang.String str15 = jsonTreeReader1.toString();
        java.lang.String str16 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
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
        boolean boolean12 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
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
        jsonTreeReader1.setLenient(true);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
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
            int int11 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
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
            java.lang.String str14 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        boolean boolean12 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
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
            jsonTreeReader1.endArray();
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
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
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
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str7 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
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
        java.lang.String str17 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        boolean boolean15 = jsonTreeReader1.isLenient();
        java.lang.String str16 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken17 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
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
            int int14 = jsonTreeReader1.nextInt();
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
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
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
        jsonTreeReader1.close();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
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
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        java.lang.String str13 = jsonTreeReader1.toString();
        boolean boolean14 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        java.lang.String str13 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
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
            jsonTreeReader1.skipValue();
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
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
            jsonTreeReader1.nextNull();
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
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
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
        java.lang.String str10 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
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
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
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
            java.lang.String str17 = jsonTreeReader1.nextName();
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
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
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
        boolean boolean12 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
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
            double double10 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
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
        java.lang.String str15 = jsonTreeReader1.toString();
        java.lang.String str16 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean12 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
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
            boolean boolean14 = jsonTreeReader1.hasNext();
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
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken14 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
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
            double double10 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        java.lang.String str15 = jsonTreeReader1.getPath();
        java.lang.String str16 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken19 = jsonTreeReader1.peek();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
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
            boolean boolean10 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
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
            jsonTreeReader1.endObject();
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
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.String str10 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
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
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.String str11 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
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
        boolean boolean17 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
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
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken8 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
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
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = jsonTreeReader1.nextLong();
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
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
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
        jsonTreeReader1.close();
        java.lang.String str16 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
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
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass12 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken7 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass9 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
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
            com.google.gson.stream.JsonToken jsonToken9 = jsonTreeReader1.peek();
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
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
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
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
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
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
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
        java.lang.Class<?> wildcardClass10 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
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
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken7 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken11 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
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
        boolean boolean18 = jsonTreeReader1.isLenient();
        java.lang.Class<?> wildcardClass19 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        boolean boolean11 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
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
            double double11 = jsonTreeReader1.nextDouble();
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
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
            boolean boolean8 = jsonTreeReader1.hasNext();
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
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass7 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
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
        java.lang.String str13 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
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
        java.lang.String str15 = jsonTreeReader1.getPath();
        java.lang.String str16 = jsonTreeReader1.getPath();
        boolean boolean17 = jsonTreeReader1.isLenient();
        java.lang.String str18 = jsonTreeReader1.getPath();
        java.lang.String str19 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$" + "'", str18, "$");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "$" + "'", str19, "$");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean10 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
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
            int int9 = jsonTreeReader1.nextInt();
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
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
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
            jsonTreeReader1.beginObject();
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
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken11 = jsonTreeReader1.peek();
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
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
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
        jsonTreeReader1.close();
        boolean boolean11 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
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
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
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
        jsonTreeReader1.setLenient(true);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        boolean boolean15 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
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
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = jsonTreeReader1.nextInt();
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
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
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
        boolean boolean11 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass8 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
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
        java.lang.String str15 = jsonTreeReader1.getPath();
        java.lang.String str16 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = jsonTreeReader1.nextName();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass13 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
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
        jsonTreeReader1.setLenient(false);
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
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
            com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
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
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
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
            jsonTreeReader1.endObject();
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
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
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
            double double13 = jsonTreeReader1.nextDouble();
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
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        boolean boolean2 = jsonTreeReader1.isLenient();
        java.lang.String str3 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        boolean boolean12 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str12 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
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
            boolean boolean12 = jsonTreeReader1.nextBoolean();
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
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean17 = jsonTreeReader1.isLenient();
        boolean boolean18 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        jsonTreeReader1.setLenient(false);
        java.lang.String str19 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "$" + "'", str19, "$");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str14 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
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
            jsonTreeReader1.skipValue();
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
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.toString();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
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
        java.lang.String str15 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
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
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = jsonTreeReader1.nextInt();
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
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = jsonTreeReader1.nextName();
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
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
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
        java.lang.String str14 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass15 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
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
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        java.lang.String str15 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = jsonTreeReader1.nextName();
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
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        java.lang.String str13 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
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
            java.lang.String str16 = jsonTreeReader1.nextString();
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
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
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
        // The following exception was thrown during execution in test generation
        try {
            double double14 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
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
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
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
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
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
        java.lang.String str13 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
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
        java.lang.String str19 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "$" + "'", str19, "$");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
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
        boolean boolean10 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
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
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonTreeReader1.hasNext();
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
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = jsonTreeReader1.nextName();
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
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
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
        java.lang.String str14 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
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
            jsonTreeReader1.skipValue();
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
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
            double double10 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        java.lang.Class<?> wildcardClass14 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
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
        java.lang.String str17 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
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
            java.lang.String str12 = jsonTreeReader1.nextString();
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
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
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
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
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
        java.lang.String str12 = jsonTreeReader1.toString();
        boolean boolean13 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        boolean boolean10 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
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
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        boolean boolean10 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
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
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }
}

