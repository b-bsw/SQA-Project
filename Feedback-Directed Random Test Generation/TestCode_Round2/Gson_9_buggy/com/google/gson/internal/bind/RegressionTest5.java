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
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.nullValue();
        java.lang.Class<?> wildcardClass14 = jsonWriter12.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        boolean boolean10 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        boolean boolean8 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endArray();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        jsonTreeWriter0.close();
        jsonTreeWriter0.setIndent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [\"closed\"]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) (short) 0);
        boolean boolean15 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        jsonWriter5.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter5.value((java.lang.Number) 10.0f);
        jsonWriter5.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter5.value((-1L));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonWriter18.value((double) (byte) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(jsonWriter20);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(10L);
        boolean boolean13 = jsonTreeWriter0.getSerializeNulls();
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) 'a');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        java.lang.Number number8 = null;
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(number8);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.value((long) (byte) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.beginArray();
        jsonWriter10.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter10.value((long) '#');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
        boolean boolean16 = jsonWriter15.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.value((-1L));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        jsonWriter12.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        boolean boolean13 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter11.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        boolean boolean10 = jsonWriter9.isLenient();
        boolean boolean11 = jsonWriter9.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (-1.0d));
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((double) (short) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) ' ');
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter7.value((java.lang.Number) 10.0d);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
        jsonTreeWriter0.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.value((java.lang.Number) 10L);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter13.beginArray();
        jsonWriter13.flush();
        jsonWriter13.setHtmlSafe(true);
        boolean boolean20 = jsonWriter13.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement13 = jsonTreeWriter0.get();
        jsonTreeWriter0.setSerializeNulls(false);
        java.lang.Class<?> wildcardClass16 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setLenient(false);
        java.lang.Class<?> wildcardClass9 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.value((java.lang.Number) 10L);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter13.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter16.endArray();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter16.value((double) (short) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        boolean boolean8 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.value((double) 100L);
        jsonWriter13.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter13.nullValue();
        jsonWriter16.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter11.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(true);
        jsonWriter16.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setIndent("");
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value("");
        jsonWriter14.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.beginObject();
        jsonWriter4.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.endObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter6.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("hi!");
        java.lang.Class<?> wildcardClass10 = jsonWriter7.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) 'a');
        com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        jsonWriter10.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (-1));
        jsonWriter13.flush();
        jsonWriter13.setHtmlSafe(true);
        jsonWriter13.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) 'a');
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) ' ');
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.name("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter6.value(true);
        jsonWriter6.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((double) (byte) -1);
        boolean boolean9 = jsonWriter6.getSerializeNulls();
        jsonWriter6.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter6.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 10L);
        com.google.gson.JsonElement jsonElement8 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter16.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setSerializeNulls(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setIndent("");
        jsonWriter6.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (-1));
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) (-1L));
        boolean boolean12 = jsonWriter9.isHtmlSafe();
        jsonWriter9.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter9.value((java.lang.Number) (byte) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 0.0f);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.setLenient(true);
        boolean boolean14 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        boolean boolean16 = jsonWriter15.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.JsonElement jsonElement9 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean15 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) 'a');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter11.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value("hi!");
        jsonWriter14.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value((double) 1.0f);
        jsonWriter10.flush();
        boolean boolean12 = jsonWriter10.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0.0d);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
        boolean boolean14 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginObject();
        jsonWriter15.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(0.0d);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        boolean boolean12 = jsonTreeWriter0.isLenient();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) 1L);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        jsonTreeWriter0.setHtmlSafe(false);
        boolean boolean14 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(0.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value("");
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (short) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) ' ');
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) (short) 1);
        boolean boolean15 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value("hi!");
        jsonWriter5.setHtmlSafe(false);
        jsonWriter5.setIndent("hi!");
        jsonWriter5.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter5.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter5.endArray();
        jsonWriter15.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter6.value(false);
        jsonWriter6.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
        boolean boolean17 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value((double) (byte) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginObject();
        jsonWriter5.setIndent("hi!");
        jsonWriter5.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value("hi!");
        boolean boolean15 = jsonWriter14.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 1L);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.setLenient(false);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("hi!");
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        boolean boolean12 = jsonTreeWriter0.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        jsonWriter9.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[[true]], [true]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        boolean boolean11 = jsonWriter10.isLenient();
        boolean boolean12 = jsonWriter10.getSerializeNulls();
        java.lang.Class<?> wildcardClass13 = jsonWriter10.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        boolean boolean12 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((long) 'a');
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        jsonWriter5.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter5.beginObject();
        jsonWriter5.flush();
        boolean boolean11 = jsonWriter5.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) 1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (-1));
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        jsonWriter5.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.endObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) (short) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.beginObject();
        boolean boolean12 = jsonWriter11.isLenient();
        jsonWriter11.flush();
        jsonWriter11.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.name("hi!");
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
        jsonTreeWriter0.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        jsonTreeWriter0.flush();
        boolean boolean9 = jsonTreeWriter0.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) 10.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.JsonElement jsonElement8 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonElement8);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value((double) 100.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value((java.lang.Number) 100.0f);
        boolean boolean6 = jsonWriter3.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter3.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 1L);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(10.0d);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.close();
        boolean boolean15 = jsonTreeWriter0.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(100L);
        boolean boolean11 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(10L);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 100);
        boolean boolean14 = jsonWriter13.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (-1.0d));
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) (-1.0f));
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter6.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter6.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter6.value("hi!");
        jsonWriter6.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        boolean boolean18 = jsonWriter17.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        boolean boolean9 = jsonWriter8.isLenient();
        jsonWriter8.setHtmlSafe(false);
        boolean boolean12 = jsonWriter8.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.setLenient(true);
        jsonTreeWriter0.setSerializeNulls(false);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value((java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((-1L));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 0L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonWriter8.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value((java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) 1);
        jsonTreeWriter0.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        jsonWriter6.flush();
        boolean boolean8 = jsonWriter6.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(false);
        jsonWriter6.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter6.value((java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginObject();
        jsonWriter9.setHtmlSafe(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((-1L));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement7);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) (-1L));
        com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value((-1L));
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value("");
        jsonWriter6.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.value((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 1);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((long) '#');
        boolean boolean17 = jsonWriter16.isHtmlSafe();
        jsonWriter16.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        jsonWriter10.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter10.value((java.lang.Number) (byte) 10);
        jsonWriter10.setLenient(true);
        boolean boolean17 = jsonWriter10.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter10.value(100L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.setHtmlSafe(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value((double) 1L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) (-1L));
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((long) (short) 1);
        jsonWriter13.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 10);
        java.lang.Class<?> wildcardClass13 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        boolean boolean15 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement17 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[-1.0,32,[null]], [null]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 10);
        com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("hi!");
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 0L);
        java.lang.Class<?> wildcardClass14 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((java.lang.Number) 10.0f);
        jsonTreeWriter0.setIndent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value("");
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter22);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter20.beginObject();
        boolean boolean22 = jsonWriter20.isLenient();
        jsonWriter20.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(jsonWriter20);
        org.junit.Assert.assertNotNull(jsonWriter21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value((double) 10);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) 0.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        boolean boolean10 = jsonWriter9.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.beginObject();
        boolean boolean11 = jsonWriter9.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 10L);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("hi!");
        boolean boolean11 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginObject();
        jsonWriter9.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.endObject();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        boolean boolean15 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value(10.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (-1));
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        boolean boolean17 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((double) 1L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.value((long) (short) -1);
        jsonWriter10.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter10.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 10);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter4.value(true);
        java.lang.Class<?> wildcardClass9 = jsonWriter8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        boolean boolean12 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((long) 'a');
        boolean boolean16 = jsonWriter15.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(0L);
        boolean boolean14 = jsonTreeWriter0.isLenient();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((double) 10.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
        boolean boolean17 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.JsonElement jsonElement18 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNotNull(jsonWriter20);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        jsonWriter14.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) (short) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("");
        boolean boolean8 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        jsonWriter11.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter2.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value("");
        jsonWriter3.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter3.value((double) (short) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((-1L));
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) '4');
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.value((double) 1.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        java.lang.Class<?> wildcardClass13 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("");
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value((long) (-1));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter12.beginObject();
        jsonWriter15.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        boolean boolean10 = jsonWriter9.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value(false);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter11.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter11.value((java.lang.Number) (short) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        java.lang.Class<?> wildcardClass8 = jsonWriter7.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        boolean boolean13 = jsonTreeWriter0.isLenient();
        java.lang.Class<?> wildcardClass14 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value((java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10.0f);
        jsonTreeWriter0.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement15 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[100.0,1,-1.0]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.nullValue();
        jsonWriter15.setHtmlSafe(false);
        jsonWriter15.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.JsonElement jsonElement5 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        boolean boolean8 = jsonWriter7.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((-1L));
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        boolean boolean16 = jsonWriter15.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value(true);
        jsonWriter5.setHtmlSafe(true);
        boolean boolean10 = jsonWriter5.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        boolean boolean12 = jsonTreeWriter0.getSerializeNulls();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter10.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        boolean boolean17 = jsonWriter16.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter16.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.endObject();
        jsonWriter13.flush();
        java.lang.Class<?> wildcardClass16 = jsonWriter13.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[\"hi!\"]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.beginObject();
        boolean boolean5 = jsonWriter4.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter4.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter4.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0.0d);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.setLenient(true);
        boolean boolean14 = jsonTreeWriter0.getSerializeNulls();
        boolean boolean15 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.name("");
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        jsonWriter9.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement13 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(true);
        boolean boolean16 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonWriter21.beginObject();
        jsonWriter21.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter21);
        org.junit.Assert.assertNotNull(jsonWriter22);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) 'a');
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        jsonWriter5.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter5.beginObject();
        java.lang.Class<?> wildcardClass10 = jsonWriter9.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.setLenient(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (-1));
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        boolean boolean5 = jsonWriter3.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        jsonWriter10.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter10.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter10.beginArray();
        boolean boolean16 = jsonWriter15.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) (short) 100);
        boolean boolean16 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginArray();
        boolean boolean17 = jsonWriter16.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.JsonElement jsonElement9 = jsonTreeWriter0.get();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.beginObject();
        boolean boolean5 = jsonWriter4.isHtmlSafe();
        boolean boolean6 = jsonWriter4.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 1);
        boolean boolean10 = jsonWriter9.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.close();
        boolean boolean15 = jsonTreeWriter0.isLenient();
        jsonTreeWriter0.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 0.0f);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 100);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value((java.lang.Number) 100.0f);
        boolean boolean6 = jsonWriter3.isHtmlSafe();
        jsonWriter3.flush();
        boolean boolean8 = jsonWriter3.getSerializeNulls();
        jsonWriter3.flush();
        jsonWriter3.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter3.value("");
        jsonWriter3.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter3.beginObject();
        jsonWriter3.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter3.value(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) ' ');
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.endObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.endArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.value((double) 'a');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        java.lang.Class<?> wildcardClass6 = jsonWriter5.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value((java.lang.Number) 100.0f);
        boolean boolean6 = jsonWriter3.isHtmlSafe();
        jsonWriter3.flush();
        boolean boolean8 = jsonWriter3.getSerializeNulls();
        jsonWriter3.flush();
        jsonWriter3.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter3.value("");
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value(0L);
        jsonWriter13.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 1L);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value("hi!");
        jsonWriter5.setHtmlSafe(false);
        jsonWriter5.setIndent("hi!");
        jsonWriter5.setSerializeNulls(true);
        jsonWriter5.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((double) (short) -1);
        boolean boolean14 = jsonWriter11.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        boolean boolean11 = jsonWriter6.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter6.value((java.lang.Number) 1L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        jsonTreeWriter0.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) (short) -1);
        jsonWriter13.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 100L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value(0.0d);
        boolean boolean20 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement8 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        java.lang.Number number11 = null;
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(number11);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((double) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value((long) (byte) 0);
        boolean boolean11 = jsonWriter8.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter8.value((long) 100);
        jsonWriter8.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (-1.0d));
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter16.nullValue();
        java.lang.Number number18 = null;
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter16.value(number18);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        jsonWriter6.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter6.endArray();
        jsonWriter6.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setHtmlSafe(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value("hi!");
        jsonWriter5.setHtmlSafe(false);
        jsonWriter5.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter5.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter5.value(1L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) '#');
        jsonTreeWriter0.flush();
        boolean boolean12 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) (short) 100);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        jsonWriter8.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value((long) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter8.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        boolean boolean13 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) 100L);
        boolean boolean16 = jsonWriter15.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) (byte) 100);
        jsonWriter9.setHtmlSafe(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter9.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        boolean boolean8 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(true);
        java.lang.Number number18 = null;
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.value(number18);
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter19.value((java.lang.Number) (short) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter6.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter6.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter6.value("hi!");
        jsonWriter11.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.endObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10.0f);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(false);
        boolean boolean9 = jsonWriter8.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("hi!");
        jsonWriter15.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        jsonWriter5.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.nullValue();
        jsonWriter15.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        jsonTreeWriter0.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter11.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 1.0f);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        boolean boolean12 = jsonWriter11.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
        boolean boolean17 = jsonWriter16.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.value((long) '4');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter5.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endObject();
        boolean boolean17 = jsonWriter16.isLenient();
        jsonWriter16.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter16.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value((java.lang.Number) 100.0f);
        boolean boolean6 = jsonWriter3.isHtmlSafe();
        jsonWriter3.flush();
        boolean boolean8 = jsonWriter3.getSerializeNulls();
        jsonWriter3.flush();
        jsonWriter3.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter3.value("");
        jsonWriter3.setHtmlSafe(true);
        boolean boolean16 = jsonWriter3.isLenient();
        jsonWriter3.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value(0L);
        boolean boolean20 = jsonTreeWriter0.getSerializeNulls();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter23 = jsonWriter22.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(jsonWriter20);
        org.junit.Assert.assertNotNull(jsonWriter22);
        org.junit.Assert.assertNotNull(jsonWriter23);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 100L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        boolean boolean8 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        jsonWriter12.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(0L);
        boolean boolean14 = jsonTreeWriter0.isLenient();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) '#');
        jsonWriter10.setIndent("hi!");
        boolean boolean13 = jsonWriter10.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter10.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter12.value("");
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter12.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 10L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((long) 'a');
        jsonWriter11.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter11.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.value((java.lang.Number) 10L);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter13.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter16.endArray();
        jsonWriter16.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.nullValue();
        jsonWriter12.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonWriter9.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) (byte) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.flush();
        boolean boolean16 = jsonTreeWriter0.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement17 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[100,true]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        boolean boolean7 = jsonTreeWriter0.isLenient();
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 10L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter9.value((double) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (-1));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) (byte) 0);
        jsonWriter12.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endArray();
        jsonWriter11.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter11.value((long) (byte) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) (-1L));
        com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(100.0d);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value(true);
        boolean boolean5 = jsonWriter4.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter4.value((java.lang.Number) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter17.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) 100);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        jsonTreeWriter0.setSerializeNulls(true);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement16 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[-1.0]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0.0d);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(100.0d);
        jsonWriter14.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.name("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value("");
        jsonWriter13.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.nullValue();
        jsonWriter17.flush();
        boolean boolean19 = jsonWriter17.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 100);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) 10L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (-1L));
        jsonWriter6.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter6.nullValue();
        java.lang.Class<?> wildcardClass10 = jsonWriter9.getClass();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter3.value(true);
        boolean boolean8 = jsonWriter3.getSerializeNulls();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter3.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [{}]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value((-1.0d));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter16.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.name("");
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value("");
        jsonWriter6.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 10L);
        com.google.gson.JsonElement jsonElement8 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonElement8);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        jsonWriter10.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.value((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 10L);
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("");
        jsonWriter8.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(true);
        boolean boolean17 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.beginObject();
        java.lang.Class<?> wildcardClass5 = jsonWriter3.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (-1L));
        boolean boolean7 = jsonWriter4.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter4.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter4.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(false);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement15 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [{}]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter7.beginArray();
        jsonWriter7.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        jsonWriter11.setHtmlSafe(false);
        jsonWriter11.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.value((java.lang.Number) (-1));
        jsonWriter7.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter7.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((long) (short) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(false);
        boolean boolean18 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 1);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.endObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.endArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 100L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonWriter18.value("");
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonWriter18.value((java.lang.Number) 0L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(jsonWriter20);
        org.junit.Assert.assertNotNull(jsonWriter22);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (-1));
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(true);
        com.google.gson.JsonElement jsonElement17 = jsonTreeWriter0.get();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonElement17);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.JsonElement jsonElement16 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value("");
        java.lang.Class<?> wildcardClass19 = jsonWriter18.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginArray();
        boolean boolean18 = jsonWriter17.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 100L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter20);
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonWriter7.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (-1));
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((long) (-1));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) '#');
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement13 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
        boolean boolean16 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) ' ');
        jsonWriter10.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value((long) 1);
        jsonWriter7.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        jsonWriter10.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) 'a');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        boolean boolean3 = jsonWriter2.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter2.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter2.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        jsonTreeWriter0.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement7);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((-1L));
        jsonWriter10.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(false);
        boolean boolean18 = jsonWriter17.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        boolean boolean10 = jsonWriter9.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (-1L));
        boolean boolean7 = jsonWriter4.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter4.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter4.nullValue();
        boolean boolean11 = jsonWriter4.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value((java.lang.Number) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value("");
        boolean boolean9 = jsonWriter8.isHtmlSafe();
        jsonWriter8.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        jsonWriter11.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        boolean boolean8 = jsonTreeWriter0.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value((double) 10L);
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.value((long) (short) 1);
        jsonTreeWriter0.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) (byte) 1);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.value((java.lang.Number) (byte) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (-1));
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(true);
        com.google.gson.JsonElement jsonElement17 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNotNull(jsonWriter20);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        jsonWriter5.setHtmlSafe(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value("hi!");
        boolean boolean15 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (-1));
        jsonTreeWriter0.close();
        jsonTreeWriter0.setSerializeNulls(true);
        jsonTreeWriter0.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        boolean boolean12 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        jsonWriter11.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter11.value((java.lang.Number) (byte) 1);
        java.lang.Class<?> wildcardClass16 = jsonWriter11.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        java.lang.Number number7 = null;
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(number7);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        jsonTreeWriter0.close();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.endObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1L);
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[false]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.value(100.0d);
        jsonWriter17.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 1.0f);
        java.lang.Class<?> wildcardClass15 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(10L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setHtmlSafe(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [{}]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endObject();
        boolean boolean17 = jsonWriter16.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter16.value((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("");
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) 'a');
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endObject();
        boolean boolean14 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value((java.lang.Number) (-1));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        jsonWriter13.setLenient(true);
        boolean boolean16 = jsonWriter13.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(true);
        boolean boolean16 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter9.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonTreeWriter0.value((double) ' ');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(jsonWriter22);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) (byte) 100);
        jsonWriter9.setHtmlSafe(true);
        boolean boolean14 = jsonWriter9.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter9.value(0.0d);
        boolean boolean17 = jsonWriter9.isHtmlSafe();
        jsonWriter9.setHtmlSafe(false);
        jsonWriter9.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) '#');
        boolean boolean11 = jsonTreeWriter0.isLenient();
        jsonTreeWriter0.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 100);
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.nullValue();
        jsonWriter9.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }
}

