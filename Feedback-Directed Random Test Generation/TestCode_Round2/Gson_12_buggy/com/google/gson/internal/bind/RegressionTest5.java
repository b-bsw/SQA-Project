package com.google.gson.internal.bind;

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
            java.lang.String str11 = jsonTreeReader1.nextString();
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
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
            int int10 = jsonTreeReader1.nextInt();
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
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
            boolean boolean13 = jsonTreeReader1.hasNext();
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
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str14 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        boolean boolean16 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str14 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
            jsonTreeReader1.beginArray();
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
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
            java.lang.String str16 = jsonTreeReader1.nextString();
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
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
            java.lang.String str8 = jsonTreeReader1.nextString();
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
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        java.lang.String str14 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        boolean boolean10 = jsonTreeReader1.isLenient();
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        java.lang.String str13 = jsonTreeReader1.toString();
        java.lang.String str14 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
            java.lang.String str17 = jsonTreeReader1.nextName();
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
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
            jsonTreeReader1.skipValue();
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
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
            jsonTreeReader1.nextNull();
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
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
            jsonTreeReader1.skipValue();
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
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        java.lang.String str19 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JsonTreeReader" + "'", str19, "JsonTreeReader");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        boolean boolean5 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        java.lang.String str19 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = jsonTreeReader1.nextName();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JsonTreeReader" + "'", str19, "JsonTreeReader");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
            int int10 = jsonTreeReader1.nextInt();
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
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
            double double10 = jsonTreeReader1.nextDouble();
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
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.String str13 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        jsonTreeReader1.setLenient(false);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
            java.lang.String str9 = jsonTreeReader1.nextName();
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
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
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
        java.lang.String str13 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
            jsonTreeReader1.endArray();
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
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
            int int13 = jsonTreeReader1.nextInt();
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
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        java.lang.Class<?> wildcardClass16 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
            boolean boolean16 = jsonTreeReader1.nextBoolean();
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
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
            double double18 = jsonTreeReader1.nextDouble();
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
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
            boolean boolean13 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
            boolean boolean9 = jsonTreeReader1.hasNext();
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
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
            jsonTreeReader1.endArray();
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
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        boolean boolean17 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
            jsonTreeReader1.nextNull();
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
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
            boolean boolean11 = jsonTreeReader1.hasNext();
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
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
            jsonTreeReader1.beginArray();
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
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
            jsonTreeReader1.endObject();
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
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
            double double10 = jsonTreeReader1.nextDouble();
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
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
            int int13 = jsonTreeReader1.nextInt();
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
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
            long long19 = jsonTreeReader1.nextLong();
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
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
            java.lang.String str9 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
            long long18 = jsonTreeReader1.nextLong();
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
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
            java.lang.String str9 = jsonTreeReader1.nextName();
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
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        java.lang.String str15 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
            java.lang.String str17 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
            java.lang.String str10 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken7 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
            java.lang.String str11 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
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
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
            boolean boolean11 = jsonTreeReader1.hasNext();
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
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken12 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
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
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
            java.lang.String str12 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonTreeReader1.nextString();
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
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
            jsonTreeReader1.beginArray();
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
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass8 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        java.lang.Class<?> wildcardClass13 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        java.lang.Class<?> wildcardClass20 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        jsonTreeReader1.setLenient(false);
        java.lang.Class<?> wildcardClass12 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken8 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = jsonTreeReader1.nextDouble();
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
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
            double double11 = jsonTreeReader1.nextDouble();
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
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
        jsonTreeReader1.close();
        java.lang.String str18 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
            int int14 = jsonTreeReader1.nextInt();
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
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
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
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
            long long18 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        java.lang.String str14 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
            int int10 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        java.lang.Class<?> wildcardClass16 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        java.lang.Class<?> wildcardClass15 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
            double double15 = jsonTreeReader1.nextDouble();
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
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
            int int9 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        java.lang.String str12 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        java.lang.String str19 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JsonTreeReader" + "'", str19, "JsonTreeReader");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        boolean boolean2 = jsonTreeReader1.isLenient();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextString();
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
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
            double double17 = jsonTreeReader1.nextDouble();
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
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        jsonTreeReader1.close();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
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
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
            long long9 = jsonTreeReader1.nextLong();
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
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
            long long15 = jsonTreeReader1.nextLong();
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
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        java.lang.String str13 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        java.lang.String str11 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken7 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
            java.lang.String str15 = jsonTreeReader1.nextName();
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
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
            com.google.gson.stream.JsonToken jsonToken11 = jsonTreeReader1.peek();
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
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        boolean boolean18 = jsonTreeReader1.isLenient();
        java.lang.Class<?> wildcardClass19 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        jsonTreeReader1.setLenient(false);
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
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
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
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.toString();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
        java.lang.String str16 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        java.lang.String str18 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken19 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$" + "'", str18, "$");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
            double double11 = jsonTreeReader1.nextDouble();
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
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
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
        jsonTreeReader1.setLenient(false);
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
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
            com.google.gson.stream.JsonToken jsonToken9 = jsonTreeReader1.peek();
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
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
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
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        boolean boolean10 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        boolean boolean11 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        boolean boolean11 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
            java.lang.String str20 = jsonTreeReader1.nextString();
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
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str7 = jsonTreeReader1.toString();
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
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonTreeReader1.nextString();
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
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
            boolean boolean14 = jsonTreeReader1.nextBoolean();
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
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
            boolean boolean10 = jsonTreeReader1.nextBoolean();
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
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
            jsonTreeReader1.beginArray();
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
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        boolean boolean5 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
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
            long long10 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        boolean boolean5 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass16 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
            jsonTreeReader1.beginObject();
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
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
            boolean boolean12 = jsonTreeReader1.nextBoolean();
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
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.String str10 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
            double double15 = jsonTreeReader1.nextDouble();
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
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
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
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
            jsonTreeReader1.beginArray();
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
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken6 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
        java.lang.String str14 = jsonTreeReader1.getPath();
        java.lang.String str15 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
            int int11 = jsonTreeReader1.nextInt();
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
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        jsonTreeReader1.setLenient(false);
        java.lang.String str19 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "$" + "'", str19, "$");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
            double double12 = jsonTreeReader1.nextDouble();
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
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str13 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        boolean boolean13 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str13 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
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
        boolean boolean14 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
            jsonTreeReader1.nextNull();
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
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
            jsonTreeReader1.beginArray();
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
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
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
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        // The following exception was thrown during execution in test generation
        try {
            long long13 = jsonTreeReader1.nextLong();
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
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
        java.lang.String str13 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
            java.lang.String str13 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
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
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
            boolean boolean12 = jsonTreeReader1.nextBoolean();
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
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
            double double16 = jsonTreeReader1.nextDouble();
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
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
            int int17 = jsonTreeReader1.nextInt();
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
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
            double double11 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        java.lang.String str12 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.Class<?> wildcardClass9 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass6 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
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
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        java.lang.String str12 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass13 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken9 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
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
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
            long long12 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass9 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
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
            long long10 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.Class<?> wildcardClass8 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
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
            jsonTreeReader1.nextNull();
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
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
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
        java.lang.Class<?> wildcardClass17 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
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
            boolean boolean13 = jsonTreeReader1.hasNext();
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
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
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
            int int10 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
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
        java.lang.Class<?> wildcardClass14 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
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
            long long10 = jsonTreeReader1.nextLong();
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
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
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
        jsonTreeReader1.setLenient(true);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.Class<?> wildcardClass8 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
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
        jsonTreeReader1.setLenient(false);
        java.lang.String str17 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
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
        java.lang.String str13 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        boolean boolean14 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken12 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
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
            java.lang.String str16 = jsonTreeReader1.nextName();
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
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
            jsonTreeReader1.skipValue();
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
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
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
        jsonTreeReader1.setLenient(true);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken6 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
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
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
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
            double double17 = jsonTreeReader1.nextDouble();
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
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
            java.lang.String str17 = jsonTreeReader1.nextString();
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
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
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
        jsonTreeReader1.setLenient(false);
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.Class<?> wildcardClass13 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
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
            java.lang.String str9 = jsonTreeReader1.nextString();
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
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
            jsonTreeReader1.endObject();
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
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
            java.lang.String str9 = jsonTreeReader1.nextString();
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
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
            long long12 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
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
            boolean boolean10 = jsonTreeReader1.nextBoolean();
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
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken17 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        boolean boolean17 = jsonTreeReader1.isLenient();
        boolean boolean18 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        boolean boolean13 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass10 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
        java.lang.String str16 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
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
            jsonTreeReader1.endObject();
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
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
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
            boolean boolean10 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
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
            int int10 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
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
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
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
            long long8 = jsonTreeReader1.nextLong();
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
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.Class<?> wildcardClass10 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str14 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
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
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
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
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str8 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken14 = jsonTreeReader1.peek();
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
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean10 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
        jsonTreeReader1.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
            jsonTreeReader1.nextNull();
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
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        java.lang.String str12 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonTreeReader1.nextString();
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
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
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
            jsonTreeReader1.beginArray();
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
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
            com.google.gson.stream.JsonToken jsonToken11 = jsonTreeReader1.peek();
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
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
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
            long long18 = jsonTreeReader1.nextLong();
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
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
            java.lang.String str9 = jsonTreeReader1.nextName();
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
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
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
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
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
        java.lang.String str14 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass15 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
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
        jsonTreeReader1.close();
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
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        jsonTreeReader1.close();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
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
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        java.lang.Class<?> wildcardClass9 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
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
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
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
        java.lang.String str10 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
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
        java.lang.String str19 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JsonTreeReader" + "'", str19, "JsonTreeReader");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
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
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
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
            jsonTreeReader1.beginObject();
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
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken11 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.toString();
        boolean boolean10 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.Class<?> wildcardClass7 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
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
            jsonTreeReader1.endArray();
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
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
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
            double double15 = jsonTreeReader1.nextDouble();
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
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
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
            com.google.gson.stream.JsonToken jsonToken14 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.Class<?> wildcardClass9 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
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
        java.lang.String str14 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
            java.lang.String str11 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
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
            boolean boolean13 = jsonTreeReader1.nextBoolean();
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
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
            jsonTreeReader1.skipValue();
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
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
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
        jsonTreeReader1.setLenient(false);
        java.lang.String str19 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JsonTreeReader" + "'", str19, "JsonTreeReader");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
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
            int int11 = jsonTreeReader1.nextInt();
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
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
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
            int int10 = jsonTreeReader1.nextInt();
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
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
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
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
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
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
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
        boolean boolean14 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str12 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
            jsonTreeReader1.endObject();
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
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
            boolean boolean15 = jsonTreeReader1.hasNext();
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
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass8 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
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
        java.lang.String str16 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
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
            long long11 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
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
            boolean boolean10 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
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
        boolean boolean16 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
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
            boolean boolean9 = jsonTreeReader1.nextBoolean();
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
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
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
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
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
            jsonTreeReader1.endObject();
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
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
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
            boolean boolean8 = jsonTreeReader1.hasNext();
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
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
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
            jsonTreeReader1.beginArray();
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
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
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
            boolean boolean16 = jsonTreeReader1.hasNext();
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
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
        java.lang.String str13 = jsonTreeReader1.toString();
        java.lang.String str14 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass7 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
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
        jsonTreeReader1.close();
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
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
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
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
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
        java.lang.String str16 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.getPath();
        boolean boolean9 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
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
            int int12 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
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
        java.lang.String str18 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$" + "'", str18, "$");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
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
            jsonTreeReader1.nextNull();
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
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
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
            jsonTreeReader1.skipValue();
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
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
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
            double double17 = jsonTreeReader1.nextDouble();
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
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
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
            java.lang.String str13 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
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
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
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
        jsonTreeReader1.setLenient(false);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
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
            boolean boolean12 = jsonTreeReader1.nextBoolean();
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
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
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
            java.lang.String str20 = jsonTreeReader1.nextName();
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
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
            jsonTreeReader1.nextNull();
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
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
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
        boolean boolean18 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
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
            long long9 = jsonTreeReader1.nextLong();
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
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str8 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
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
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
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
            com.google.gson.stream.JsonToken jsonToken14 = jsonTreeReader1.peek();
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
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
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
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken9 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
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
            int int10 = jsonTreeReader1.nextInt();
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
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass13 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
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
        java.lang.Class<?> wildcardClass18 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
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
            jsonTreeReader1.beginArray();
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
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
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
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
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
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = jsonTreeReader1.nextInt();
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
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
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
            jsonTreeReader1.beginArray();
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
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
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
            boolean boolean17 = jsonTreeReader1.nextBoolean();
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
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
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
        java.lang.String str18 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$" + "'", str18, "$");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
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
            boolean boolean10 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
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
        java.lang.String str14 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken9 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken7 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass8 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextName();
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
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.String str12 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
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
            boolean boolean13 = jsonTreeReader1.nextBoolean();
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
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken12 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }
}

