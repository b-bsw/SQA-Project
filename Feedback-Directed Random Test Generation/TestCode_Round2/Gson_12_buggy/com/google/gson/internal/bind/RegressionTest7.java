package com.google.gson.internal.bind;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
        java.lang.String str17 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
            boolean boolean17 = jsonTreeReader1.nextBoolean();
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
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
            java.lang.String str10 = jsonTreeReader1.nextString();
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
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
            java.lang.String str16 = jsonTreeReader1.nextName();
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
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        java.lang.String str16 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        java.lang.String str13 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        boolean boolean13 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
            double double14 = jsonTreeReader1.nextDouble();
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
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        java.lang.String str11 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = jsonTreeReader1.hasNext();
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
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        boolean boolean7 = jsonTreeReader1.isLenient();
        boolean boolean8 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        jsonTreeReader1.setLenient(true);
        java.lang.Class<?> wildcardClass18 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        boolean boolean8 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
            jsonTreeReader1.beginObject();
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
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.Class<?> wildcardClass8 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
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
            com.google.gson.stream.JsonToken jsonToken14 = jsonTreeReader1.peek();
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
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
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
            boolean boolean10 = jsonTreeReader1.nextBoolean();
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
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken13 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        java.lang.String str11 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        java.lang.Class<?> wildcardClass16 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        java.lang.String str11 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
            jsonTreeReader1.nextNull();
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
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.Class<?> wildcardClass9 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        java.lang.String str14 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = jsonTreeReader1.nextLong();
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
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        java.lang.String str16 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        boolean boolean11 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
            java.lang.String str12 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
        java.lang.String str11 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        jsonTreeReader1.close();
        boolean boolean17 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.toString();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken17 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
            boolean boolean17 = jsonTreeReader1.hasNext();
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
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        jsonTreeReader1.setLenient(true);
        boolean boolean19 = jsonTreeReader1.isLenient();
        java.lang.String str20 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "JsonTreeReader" + "'", str20, "JsonTreeReader");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
            jsonTreeReader1.beginObject();
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
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken22 = jsonTreeReader1.peek();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "$" + "'", str19, "$");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "JsonTreeReader" + "'", str20, "JsonTreeReader");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
            com.google.gson.stream.JsonToken jsonToken14 = jsonTreeReader1.peek();
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
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
            com.google.gson.stream.JsonToken jsonToken11 = jsonTreeReader1.peek();
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
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
            boolean boolean11 = jsonTreeReader1.hasNext();
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
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass9 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        java.lang.String str15 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
            java.lang.String str10 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
            boolean boolean8 = jsonTreeReader1.nextBoolean();
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
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
            int int11 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        jsonTreeReader1.close();
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
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        boolean boolean16 = jsonTreeReader1.isLenient();
        java.lang.String str17 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.Class<?> wildcardClass13 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
            boolean boolean8 = jsonTreeReader1.hasNext();
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
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
            long long10 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
            jsonTreeReader1.nextNull();
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
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
            com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader1.peek();
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
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
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
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        boolean boolean20 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "$" + "'", str19, "$");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
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
        jsonTreeReader1.close();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
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
        java.lang.String str11 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        java.lang.String str17 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        java.lang.Class<?> wildcardClass17 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
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
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
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
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        java.lang.String str11 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
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
            com.google.gson.stream.JsonToken jsonToken13 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str11 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
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
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        boolean boolean19 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
        boolean boolean17 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
            java.lang.String str13 = jsonTreeReader1.nextName();
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
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        boolean boolean11 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
        java.lang.String str13 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        boolean boolean16 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
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
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
            jsonTreeReader1.endArray();
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
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonTreeReader1.hasNext();
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
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
            jsonTreeReader1.nextNull();
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
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
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
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
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
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonTreeReader1.nextName();
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
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
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
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonTreeReader1.hasNext();
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
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        java.lang.String str11 = jsonTreeReader1.toString();
        boolean boolean12 = jsonTreeReader1.isLenient();
        java.lang.String str13 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass14 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
            boolean boolean20 = jsonTreeReader1.nextBoolean();
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
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        java.lang.Class<?> wildcardClass15 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        java.lang.String str13 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
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
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
            long long11 = jsonTreeReader1.nextLong();
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
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
            double double20 = jsonTreeReader1.nextDouble();
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
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
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
            boolean boolean12 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
            boolean boolean16 = jsonTreeReader1.hasNext();
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
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
            boolean boolean10 = jsonTreeReader1.nextBoolean();
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
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        java.lang.String str11 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        boolean boolean16 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
            com.google.gson.stream.JsonToken jsonToken14 = jsonTreeReader1.peek();
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
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        boolean boolean10 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
            boolean boolean11 = jsonTreeReader1.nextBoolean();
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
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
        jsonTreeReader1.close();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "$" + "'", str19, "$");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "JsonTreeReader" + "'", str20, "JsonTreeReader");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
            long long14 = jsonTreeReader1.nextLong();
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
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        java.lang.String str18 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
            boolean boolean18 = jsonTreeReader1.nextBoolean();
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
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
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
        boolean boolean18 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
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
            java.lang.String str12 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
            jsonTreeReader1.nextNull();
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
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
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
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
            double double11 = jsonTreeReader1.nextDouble();
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
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str12 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass13 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        java.lang.Class<?> wildcardClass15 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
            com.google.gson.stream.JsonToken jsonToken16 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
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
            boolean boolean16 = jsonTreeReader1.hasNext();
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
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str10 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
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
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
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
            long long9 = jsonTreeReader1.nextLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
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
            int int12 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
            com.google.gson.stream.JsonToken jsonToken16 = jsonTreeReader1.peek();
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
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        java.lang.String str13 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
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
            com.google.gson.stream.JsonToken jsonToken12 = jsonTreeReader1.peek();
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
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.String str11 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass12 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.String str11 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
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
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
            boolean boolean14 = jsonTreeReader1.nextBoolean();
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
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
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
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
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
        java.lang.String str12 = jsonTreeReader1.toString();
        java.lang.String str13 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass14 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        java.lang.String str12 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
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
        boolean boolean11 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken12 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
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
            jsonTreeReader1.beginObject();
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
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
            com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
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
            int int10 = jsonTreeReader1.nextInt();
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
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = jsonTreeReader1.nextDouble();
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
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
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
        jsonTreeReader1.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        jsonTreeReader1.close();
        java.lang.Class<?> wildcardClass16 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
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
        boolean boolean16 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
            jsonTreeReader1.beginObject();
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
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
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
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
        java.lang.String str15 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass7 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken8 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
            com.google.gson.stream.JsonToken jsonToken17 = jsonTreeReader1.peek();
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
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken14 = jsonTreeReader1.peek();
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
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.close();
        boolean boolean12 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
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
            jsonTreeReader1.skipValue();
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
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
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
            boolean boolean15 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
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
            jsonTreeReader1.endObject();
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
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
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
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        boolean boolean16 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
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
        java.lang.String str19 = jsonTreeReader1.toString();
        java.lang.String str20 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JsonTreeReader" + "'", str19, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "$" + "'", str20, "$");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
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
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
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
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
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
            jsonTreeReader1.skipValue();
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
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
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
            double double13 = jsonTreeReader1.nextDouble();
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
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
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
            jsonTreeReader1.beginObject();
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
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
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
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
            int int11 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
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
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
            int int12 = jsonTreeReader1.nextInt();
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
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
            boolean boolean15 = jsonTreeReader1.nextBoolean();
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
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        java.lang.Class<?> wildcardClass11 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
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
            java.lang.String str11 = jsonTreeReader1.nextString();
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
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean12 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
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
            int int12 = jsonTreeReader1.nextInt();
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
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
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
        jsonTreeReader1.close();
        java.lang.String str14 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
            java.lang.String str17 = jsonTreeReader1.nextName();
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
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
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
            com.google.gson.stream.JsonToken jsonToken13 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
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
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
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
        java.lang.String str14 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
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
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
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
            java.lang.String str12 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
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
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        jsonTreeReader1.setLenient(false);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.String str11 = jsonTreeReader1.toString();
        java.lang.String str12 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str14 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
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
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$" + "'", str15, "$");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
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
            java.lang.String str13 = jsonTreeReader1.nextString();
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
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
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
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
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
        java.lang.String str15 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
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
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass8 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$" + "'", str6, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
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
            jsonTreeReader1.beginArray();
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
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
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
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
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
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
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
        boolean boolean15 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
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
        java.lang.String str16 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
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
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str9 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
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
        java.lang.String str17 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
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
            java.lang.String str14 = jsonTreeReader1.nextString();
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
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
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
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = jsonTreeReader1.nextDouble();
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
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.toString();
        java.lang.String str13 = jsonTreeReader1.toString();
        boolean boolean14 = jsonTreeReader1.isLenient();
        boolean boolean15 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = jsonTreeReader1.nextBoolean();
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
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
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
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken12 = jsonTreeReader1.peek();
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
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
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
            java.lang.String str12 = jsonTreeReader1.nextName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
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
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
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
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
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
            jsonTreeReader1.endArray();
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
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
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
        java.lang.String str11 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
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
            java.lang.String str9 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "$" + "'", str19, "$");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "JsonTreeReader" + "'", str20, "JsonTreeReader");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
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
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
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
            jsonTreeReader1.beginArray();
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
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
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
        jsonTreeReader1.setLenient(false);
        java.lang.Class<?> wildcardClass16 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
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
        jsonTreeReader1.setLenient(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
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
        boolean boolean17 = jsonTreeReader1.isLenient();
        java.lang.String str18 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "$" + "'", str18, "$");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
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
        java.lang.String str16 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass17 = jsonTreeReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken13 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jsonTreeReader1.nextBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = jsonTreeReader1.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        java.lang.String str13 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str6 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonToken jsonToken7 = jsonTreeReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
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
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.Class<?> wildcardClass8 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
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
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
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
        boolean boolean19 = jsonTreeReader1.isLenient();
        boolean boolean20 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
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
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
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
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(true);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        boolean boolean3 = jsonTreeReader1.isLenient();
        boolean boolean4 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        boolean boolean7 = jsonTreeReader1.isLenient();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.String str10 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonTreeReader1.nextString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
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
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
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
            int int10 = jsonTreeReader1.nextInt();
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
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
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
        jsonTreeReader1.setLenient(false);
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
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
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
        java.lang.String str12 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
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
        java.lang.String str17 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
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
            jsonTreeReader1.nextNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
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
            jsonTreeReader1.beginArray();
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
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.nextBoolean();
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
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.String str11 = jsonTreeReader1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.String str10 = jsonTreeReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JsonTreeReader" + "'", str2, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JsonTreeReader" + "'", str9, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JsonTreeReader" + "'", str10, "JsonTreeReader");
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
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
            java.lang.String str8 = jsonTreeReader1.nextName();
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
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = jsonTreeReader1.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
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
        java.lang.Class<?> wildcardClass19 = jsonTreeReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
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
        java.lang.String str14 = jsonTreeReader1.toString();
        boolean boolean15 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        java.lang.String str11 = jsonTreeReader1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JsonTreeReader" + "'", str5, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        jsonTreeReader1.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        jsonTreeReader1.setLenient(false);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
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
        java.lang.String str17 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
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
            jsonTreeReader1.skipValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
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
        boolean boolean16 = jsonTreeReader1.isLenient();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        boolean boolean9 = jsonTreeReader1.isLenient();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
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
        jsonTreeReader1.setLenient(false);
        java.lang.String str21 = jsonTreeReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JsonTreeReader" + "'", str18, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "JsonTreeReader" + "'", str21, "JsonTreeReader");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
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
        java.lang.String str17 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JsonTreeReader" + "'", str17, "JsonTreeReader");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
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
            boolean boolean13 = jsonTreeReader1.hasNext();
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
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
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
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$" + "'", str9, "$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$" + "'", str12, "$");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
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
            jsonTreeReader1.nextNull();
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
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$" + "'", str16, "$");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.close();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.close();
        java.lang.String str7 = jsonTreeReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonTreeReader1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JsonTreeReader" + "'", str7, "JsonTreeReader");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
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
            jsonTreeReader1.promoteNameToValue();
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
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        java.lang.String str3 = jsonTreeReader1.toString();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        boolean boolean7 = jsonTreeReader1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JsonTreeReader" + "'", str3, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
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
            jsonTreeReader1.skipValue();
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
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
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
        jsonTreeReader1.setLenient(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JsonTreeReader" + "'", str6, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JsonTreeReader" + "'", str8, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$" + "'", str14, "$");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.close();
        jsonTreeReader1.close();
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        java.lang.String str8 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader1.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JsonTreeReader" + "'", str4, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$" + "'", str8, "$");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
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
        jsonTreeReader1.setLenient(true);
        java.lang.String str17 = jsonTreeReader1.getPath();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JsonTreeReader" + "'", str11, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JsonTreeReader" + "'", str14, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$" + "'", str17, "$");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
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
        java.lang.String str15 = jsonTreeReader1.toString();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JsonTreeReader" + "'", str13, "JsonTreeReader");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JsonTreeReader" + "'", str15, "JsonTreeReader");
    }
}

